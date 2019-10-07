package computeraidedinstruction;

import javafx.scene.image.Image;
import javafx.animation.Timeline;
import javafx.animation.KeyValue;
import javafx.animation.KeyFrame;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.util.Duration;
import javafx.scene.media.Media;
import java.util.ResourceBundle;
import java.net.URL;
import javafx.scene.input.KeyCode;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.media.MediaPlayer;
import java.io.InputStream;
import javafx.collections.ObservableList;
import javafx.fxml.Initializable;

public class Control implements Initializable
{
    int count;
    int size;
    int inputCount;
    ObservableList<Letters> ob;
    InputStream ins;
    private Letters letter;
    String[] answer;
    TextToSpeech tts;
    MediaPlayer mediaPlayer;
    final EventHandler<ActionEvent> evtEraser;
    final EventHandler<ActionEvent> evtAlpButton;
    final EventHandler<KeyEvent> evtKeyBoard;
    final EventHandler<ActionEvent> evtBkSpButton;
    final EventHandler<ActionEvent> evtSelectButton;
    @FXML
    private ImageView imgDisplay;
    @FXML
    private VBox vBoxSpelling;
    @FXML
    private VBox vBoxSelect;
    @FXML
    public HBox screenInput;
    @FXML
    public HBox helpScreenInput;
    @FXML
    private Button btnEraser;
    @FXML
    private Button btnBackSpace;
    @FXML
    private Button btnMenu;
    @FXML
    private Button btnHelp;
    @FXML
    private Button btnSpeak;
    @FXML
    private Button btnPrev;
    @FXML
    private Button btnNext;
    @FXML
    private Button btnA;
    @FXML
    private Button btnB;
    @FXML
    private Button btnC;
    @FXML
    private Button btnD;
    @FXML
    private Button btnE;
    @FXML
    private Button btnF;
    @FXML
    private Button btnG;
    @FXML
    private Button btnH;
    @FXML
    private Button btnI;
    @FXML
    private Button btnJ;
    @FXML
    private Button btnK;
    @FXML
    private Button btnL;
    @FXML
    private Button btnM;
    @FXML
    private Button btnN;
    @FXML
    private Button btnO;
    @FXML
    private Button btnP;
    @FXML
    private Button btnQ;
    @FXML
    private Button btnR;
    @FXML
    private Button btnS;
    @FXML
    private Button btnT;
    @FXML
    private Button btnU;
    @FXML
    private Button btnV;
    @FXML
    private Button btnW;
    @FXML
    private Button btnX;
    @FXML
    private Button btnY;
    @FXML
    private Button btnZ;
    @FXML
    private Button btnDash;
    @FXML
    private Button btnAlphatbets;
    @FXML
    private Button btnNumbers;
    @FXML
    private Button btnFriuts;
    @FXML
    private Button btnFlowers;
    @FXML
    private Button btnShapes;
    @FXML
    private Button btnColors;
    @FXML
    private Button btnDays;
    @FXML
    private Button btnMonths;
    @FXML
    private Button btnBodyParts;
    @FXML
    private Button btnBirds;
    @FXML
    private Button btnVegetables;
    @FXML
    private Button btnThreeLetters;
    @FXML
    private Button btnFourLetters;
    @FXML
    private Button btnFiveLetters;
    @FXML
    private Button btnSixLetters;
    @FXML
    private Button btnDomesticAnimals;
    @FXML
    private Button btnWildAnimals;
    @FXML
    private Button btnTransportation;
    @FXML
    private Button btnTwoLetters;
    @FXML
    private Button btnHomesObj;
    @FXML
    private Button btnOfficeObj;
    
    public Control() {
        this.count = 0;
        this.size = 0;
        this.inputCount = 0;
        this.ob = null;
        this.ins = null;
        this.evtEraser = (EventHandler<ActionEvent>)new EventHandler<ActionEvent>() {
            @Override
            public void handle(final ActionEvent event) {
                Control.this.finish(Control.this.letter);
            }
        };
        this.evtAlpButton = (EventHandler<ActionEvent>)new EventHandler<ActionEvent>() {
            @Override
            public void handle(final ActionEvent event) {
                final Button btn = (Button)event.getSource();
                Control.this.keypressed(btn.getText());
            }
        };
        this.evtKeyBoard = (EventHandler<KeyEvent>)new EventHandler<KeyEvent>() {
            @Override
            public void handle(final KeyEvent event) {
                if (event.getCode().equals((Object)KeyCode.BACK_SPACE)) {
                    Control.this.backSpace();
                }
                if (event.getCode().equals((Object)KeyCode.DELETE)) {
                    Control.this.finish(Control.this.letter);
                }
                if (!event.getText().matches("[a-zA-Z0-9-]")) {
                    event.consume();
                }
                else {
                    Control.this.keypressed(event.getText().toUpperCase());
                }
            }
        };
        this.evtBkSpButton = (EventHandler<ActionEvent>)new EventHandler<ActionEvent>() {
            @Override
            public void handle(final ActionEvent event) {
                Control.this.backSpace();
            }
        };
        this.evtSelectButton = (EventHandler<ActionEvent>)new EventHandler<ActionEvent>() {
            @Override
            public void handle(final ActionEvent event) {
                Control.this.vBoxSpelling.getScene().addEventFilter(KeyEvent.KEY_PRESSED, Control.this.evtKeyBoard);
                final Button tempbtn = (Button)event.getSource();
                Control.this.ob = new List().getList(tempbtn.getText());
                if (Control.this.ob != null) {
                    Control.this.size = Control.this.ob.size();
                    Control.this.letter = (Letters)Control.this.ob.get(0);
                    Control.this.count = 0;
                    Control.this.finish(Control.this.letter);
                }
            }
        };
    }
    
    @Override
    public void initialize(final URL url, final ResourceBundle resources) {
        this.vBoxSpelling.setVisible(false);
        this.vBoxSelect.setVisible(true);
        this.prepare();
        final URL urll = this.getClass().getResource("/mp3Files/bg.mp3");
        final Media sound = new Media(urll.toString());
        (this.mediaPlayer = new MediaPlayer(sound)).setOnEndOfMedia((Runnable)new Runnable() {
            @Override
            public void run() {
                Control.this.mediaPlayer.seek(Duration.ZERO);
            }
        });
        this.mediaPlayer.setVolume(0.3);
        this.mediaPlayer.play();
    }
    
    public void prepare() {
        this.btnAlphatbets.setOnAction(this.evtSelectButton);
        this.btnBirds.setOnAction(this.evtSelectButton);
        this.btnBodyParts.setOnAction(this.evtSelectButton);
        this.btnColors.setOnAction(this.evtSelectButton);
        this.btnDays.setOnAction(this.evtSelectButton);
        this.btnDomesticAnimals.setOnAction(this.evtSelectButton);
        this.btnFiveLetters.setOnAction(this.evtSelectButton);
        this.btnFlowers.setOnAction(this.evtSelectButton);
        this.btnFourLetters.setOnAction(this.evtSelectButton);
        this.btnFriuts.setOnAction(this.evtSelectButton);
        this.btnMonths.setOnAction(this.evtSelectButton);
        this.btnNumbers.setOnAction(this.evtSelectButton);
        this.btnShapes.setOnAction(this.evtSelectButton);
        this.btnSixLetters.setOnAction(this.evtSelectButton);
        this.btnThreeLetters.setOnAction(this.evtSelectButton);
        this.btnTransportation.setOnAction(this.evtSelectButton);
        this.btnVegetables.setOnAction(this.evtSelectButton);
        this.btnWildAnimals.setOnAction(this.evtSelectButton);
        this.btnOfficeObj.setOnAction(this.evtSelectButton);
        this.btnTwoLetters.setOnAction(this.evtSelectButton);
        this.btnHomesObj.setOnAction(this.evtSelectButton);
        this.btnA.setOnAction(this.evtAlpButton);
        this.btnB.setOnAction(this.evtAlpButton);
        this.btnC.setOnAction(this.evtAlpButton);
        this.btnD.setOnAction(this.evtAlpButton);
        this.btnE.setOnAction(this.evtAlpButton);
        this.btnF.setOnAction(this.evtAlpButton);
        this.btnG.setOnAction(this.evtAlpButton);
        this.btnH.setOnAction(this.evtAlpButton);
        this.btnI.setOnAction(this.evtAlpButton);
        this.btnJ.setOnAction(this.evtAlpButton);
        this.btnK.setOnAction(this.evtAlpButton);
        this.btnL.setOnAction(this.evtAlpButton);
        this.btnM.setOnAction(this.evtAlpButton);
        this.btnN.setOnAction(this.evtAlpButton);
        this.btnO.setOnAction(this.evtAlpButton);
        this.btnP.setOnAction(this.evtAlpButton);
        this.btnQ.setOnAction(this.evtAlpButton);
        this.btnR.setOnAction(this.evtAlpButton);
        this.btnS.setOnAction(this.evtAlpButton);
        this.btnT.setOnAction(this.evtAlpButton);
        this.btnU.setOnAction(this.evtAlpButton);
        this.btnV.setOnAction(this.evtAlpButton);
        this.btnW.setOnAction(this.evtAlpButton);
        this.btnX.setOnAction(this.evtAlpButton);
        this.btnY.setOnAction(this.evtAlpButton);
        this.btnZ.setOnAction(this.evtAlpButton);
        this.btnDash.setOnAction(this.evtAlpButton);
        this.btnBackSpace.setOnAction(this.evtBkSpButton);
        this.btnEraser.setOnAction(this.evtEraser);
        
        this.btnHelp.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(final ActionEvent event) {
                if (!Control.this.helpScreenInput.getChildren().isEmpty()) {
                    Control.this.helpScreenInput.getChildren().remove(0, Control.this.helpScreenInput.getChildren().size());
                }
                for (int i = 0; i < Control.this.letter.getName().length(); ++i) {
                    final Label tempLabel = new Label(Control.this.letter.getName().substring(i, i + 1));
                    tempLabel.setPrefSize(35.0, 35.0);
                    tempLabel.getStyleClass().add("lblhelp");
                    Control.this.helpScreenInput.getChildren().add(tempLabel);
                }
            }
        });

        this.btnSpeak.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(final ActionEvent event) {
                Control.this.tts.speak(Control.this.letter.getName() + "!!");
            }
        });
        
        this.btnMenu.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(final ActionEvent event) {
                Control.this.mediaPlayer.play();
                Control.this.vBoxSpelling.getScene().removeEventFilter(KeyEvent.KEY_PRESSED, Control.this.evtKeyBoard);
                Control.this.vBoxSpelling.setVisible(false);
                Control.this.vBoxSelect.setVisible(true);
            }
        });
        
        this.btnPrev.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(final ActionEvent event) {
                Control.this.prev();
            }
        });
        
        this.btnNext.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(final ActionEvent event) {
                Control.this.next();
            }
        });
        
        (this.tts = new TextToSpeech()).speak(" ");
    }
    
    private void backSpace() {
        final ObservableList<Node> obl = (ObservableList<Node>)this.screenInput.getChildren();
        if (this.inputCount > 0) {
            final ObservableList<Node> list = obl;
            final int inputCount = this.inputCount - 1;
            this.inputCount = inputCount;
            final Label tempLabel = (Label)list.get(inputCount);
            tempLabel.setText("");
        }
    }
    
    private void keypressed(final String text) {
        if (!this.helpScreenInput.getChildren().isEmpty()) {
            this.helpScreenInput.getChildren().remove(0, this.helpScreenInput.getChildren().size());
        }

        final ObservableList<Node> obl = (ObservableList<Node>)this.screenInput.getChildren();

        if (this.inputCount < obl.size()) {
            Label tempLabel = (Label)obl.get(this.inputCount++);
            tempLabel.setText(text);
            this.tts.speak(text);
            this.answer[this.inputCount - 1] = text;

            if (this.inputCount - 1 == obl.size() - 1) {
                boolean ans = true;
                for (int i = 0; i < this.answer.length; ++i) {
                    if (this.answer[i].equals(this.letter.getName().substring(i, i + 1))) {
                        tempLabel = (Label)obl.get(i);
                        tempLabel.setStyle("-fx-text-fill:green;");
                    }
                    else {
                        ans = false;
                        tempLabel = (Label)obl.get(i);
                        tempLabel.setStyle("-fx-text-fill:red;");
                    }
                }
                if (ans) {
                    final URL urll = this.getClass().getResource("/mp3Files/claps.mp3");
                    final Media sound = new Media(urll.toString());
                    final MediaPlayer mediaPlayer = new MediaPlayer(sound);
                    mediaPlayer.play();
                    final Timeline timeline = new Timeline(new KeyFrame[] { new KeyFrame(Duration.millis(1000.0), ae -> this.next(), new KeyValue[0]) });
                    timeline.play();
                }
                else {
                    final URL urll = this.getClass().getResource("/mp3Files/oh_no.mp3");
                    final Media sound = new Media(urll.toString());
                    final MediaPlayer mediaPlayer = new MediaPlayer(sound);
                    mediaPlayer.play();
                }
            }
        }
    }
    
    public void finish(final Letters letter) {
        this.mediaPlayer.stop();
        if (!this.helpScreenInput.getChildren().isEmpty()) {
            this.helpScreenInput.getChildren().remove(0, this.helpScreenInput.getChildren().size());
        }
        if (!this.screenInput.getChildren().isEmpty()) {
            this.screenInput.getChildren().remove(0, this.screenInput.getChildren().size());
        }
        this.ins = this.getClass().getResourceAsStream(letter.getDir());
        this.imgDisplay.setImage(new Image(this.ins));
        this.answer = new String[letter.getName().length()];
        this.inputCount = 0;
        this.vBoxSelect.setVisible(false);
        this.vBoxSpelling.setVisible(true);
        this.tts.speak(letter.getName());
        for (int i = 0; i < letter.getName().length(); ++i) {
            final Label tempLabel = new Label();
            tempLabel.setPrefSize(50.0, 50.0);
            tempLabel.getStyleClass().add("lblInput");
            this.screenInput.getChildren().add(tempLabel);
        }
    }
    
    public void next() {
        if (this.count == this.size - 1) {
            this.count = 0;
        }
        else {
            ++this.count;
        }
        this.finish(this.letter = (Letters)this.ob.get(this.count));
    }
    
    public void prev() {
        if (this.count != 0) {
            --this.count;
            this.finish(this.letter = (Letters)this.ob.get(this.count));
        }
    }
}
