package computeraidedinstruction;

import com.sun.speech.freetts.VoiceManager;
import com.sun.speech.freetts.Voice;
import java.io.File;
import java.io.IOException;

public class TextToSpeech
{
    private static final String VOICE_NAME_KEVIN = "kevin";
    private final Voice voice;
    
    public TextToSpeech() {
        try{
        String mbrolaPath =  new File(System.getProperty("user.dir"), "/mbrola").getCanonicalPath();
        System.setProperty("mbrola.base", mbrolaPath);
        }catch(IOException e){
            System.out.println("mbrola not found"+ e);
        }
        
        final VoiceManager vm = VoiceManager.getInstance();
        
        for(Voice v: vm.getVoices()){
            System.out.println(v.getName());
        }
        
        (this.voice = vm.getVoice(VOICE_NAME_KEVIN)).allocate();
    }
    
    public void speak(final String inputText) {
        if (inputText != null && !inputText.isEmpty()) {
            this.voice.speak(inputText);
        }
    }
}
