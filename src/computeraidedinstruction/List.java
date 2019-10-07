package computeraidedinstruction;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class List
{
    public ObservableList<Letters> getList(final String kode) {
        if (kode.equals("Alphabets")) {
            final Letters list1 = new Letters("A", "/img/draw/alphabets/A.jpg");
            final Letters list2 = new Letters("B", "/img/draw/alphabets/B.jpg");
            final Letters list3 = new Letters("C", "/img/draw/alphabets/C.jpg");
            final Letters list4 = new Letters("D", "/img/draw/alphabets/D.jpg");
            final Letters list5 = new Letters("E", "/img/draw/alphabets/E.jpg");
            final Letters list6 = new Letters("F", "/img/draw/alphabets/F.jpg");
            final Letters list7 = new Letters("G", "/img/draw/alphabets/G.jpg");
            final Letters list8 = new Letters("H", "/img/draw/alphabets/H.jpg");
            final Letters list9 = new Letters("I", "/img/draw/alphabets/I.jpg");
            final Letters list10 = new Letters("J", "/img/draw/alphabets/J.jpg");
            final Letters list11 = new Letters("K", "/img/draw/alphabets/K.jpg");
            final Letters list12 = new Letters("L", "/img/draw/alphabets/L.jpg");
            final Letters list13 = new Letters("M", "/img/draw/alphabets/M.jpg");
            final Letters list14 = new Letters("N", "/img/draw/alphabets/N.jpg");
            final Letters list15 = new Letters("O", "/img/draw/alphabets/O.jpg");
            final Letters list16 = new Letters("P", "/img/draw/alphabets/P.jpg");
            final Letters list17 = new Letters("Q", "/img/draw/alphabets/Q.jpg");
            final Letters list18 = new Letters("R", "/img/draw/alphabets/R.jpg");
            final Letters list19 = new Letters("S", "/img/draw/alphabets/S.jpg");
            final Letters list20 = new Letters("T", "/img/draw/alphabets/T.jpg");
            final Letters list21 = new Letters("U", "/img/draw/alphabets/U.jpg");
            final Letters list22 = new Letters("V", "/img/draw/alphabets/V.jpg");
            final Letters list23 = new Letters("W", "/img/draw/alphabets/W.jpg");
            final Letters list24 = new Letters("X", "/img/draw/alphabets/X.jpg");
            final Letters list25 = new Letters("Y", "/img/draw/alphabets/Y.jpg");
            final Letters list26 = new Letters("Z", "/img/draw/alphabets/Z.jpg");
            final ObservableList<Letters> list27 = FXCollections.observableArrayList(
                    list1, list2, list3, list4, list5, list6, list7, list8, list9, list10, list11, list12, list13, list14, list15,
                    list16, list17, list18, list19, list20, list21, list22, list23, list24, list25, list26 
            );
            return list27;
        }
        if (kode.equals("Birds")) {
            final Letters list1 = new Letters("CANARY", "/img/draw/birds/birdscanary.jpg");
            final Letters list2 = new Letters("CROW", "/img/draw/birds/birdscrow.jpg");
            final Letters list3 = new Letters("DOVE", "/img/draw/birds/birdsdove.jpg");
            final Letters list4 = new Letters("DUCK", "/img/draw/birds/birdsduck.jpg");
            final Letters list5 = new Letters("EAGLE", "/img/draw/birds/birdseagle.jpg");
            final Letters list6 = new Letters("HOOPOE", "/img/draw/birds/birdshoopoe.jpg");
            final Letters list7 = new Letters("HORNBILL", "/img/draw/birds/birdshornbill.jpg");
            final Letters list8 = new Letters("KINGFISHER", "/img/draw/birds/birdskingfisher.jpg");
            final Letters list9 = new Letters("KITE", "/img/draw/birds/birdskite.jpg");
            final Letters list10 = new Letters("OWL", "/img/draw/birds/birdsowl.jpg");
            final Letters list11 = new Letters("PEACOCK", "/img/draw/birds/birdspeacock.jpg");
            final Letters list12 = new Letters("PEAHEN", "/img/draw/birds/birdspeahen.jpg");
            final Letters list13 = new Letters("PHEASANT", "/img/draw/birds/birdspheasant.jpg");
            final Letters list14 = new Letters("PIGEON", "/img/draw/birds/birdspigeon.jpg");
            final Letters list15 = new Letters("ROBIN", "/img/draw/birds/birdsrobin.jpg");
            final Letters list16 = new Letters("SPARROW", "/img/draw/birds/birdssparrow.jpg");
            final Letters list17 = new Letters("TOUCAN", "/img/draw/birds/birdstoucan.jpg");
            final Letters list18 = new Letters("VULTURE", "/img/draw/birds/birdsvulture.jpg");
            final Letters list19 = new Letters("WOODPECKER", "/img/draw/birds/birdswoodpecker.jpg");
            final ObservableList<Letters> list28 = FXCollections.observableArrayList(
                    list1, list2, list3, list4, list5, list6, list7, list8, list9, list10,
                    list11, list12, list13, list14, list15, list16, list17, list18, list19 
            );
            return list28;
        }
        if (kode.equals("Body Parts")) {
            final Letters list1 = new Letters("CHEST", "/img/draw/bodyparts/bpchest.jpg");
            final Letters list2 = new Letters("EAR", "/img/draw/bodyparts/bpear.jpg");
            final Letters list3 = new Letters("ELBOW", "/img/draw/bodyparts/bpelbow.jpg");
            final Letters list4 = new Letters("EYEBROWS", "/img/draw/bodyparts/bpeyebrows.jpg");
            final Letters list5 = new Letters("EYES", "/img/draw/bodyparts/bpeyes.jpg");
            final Letters list6 = new Letters("FACE", "/img/draw/bodyparts/bpface.jpg");
            final Letters list7 = new Letters("FINGERS", "/img/draw/bodyparts/bpfingers.jpg");
            final Letters list8 = new Letters("FOOT", "/img/draw/bodyparts/bpfoot.jpg");
            final Letters list9 = new Letters("FOREHEAD", "/img/draw/bodyparts/bpforehead.jpg");
            final Letters list10 = new Letters("HAIR", "/img/draw/bodyparts/bphair.jpg");
            final Letters list11 = new Letters("HAND", "/img/draw/bodyparts/bphand.jpg");
            final Letters list12 = new Letters("KNEE", "/img/draw/bodyparts/bpknee.jpg");
            final Letters list13 = new Letters("LEG", "/img/draw/bodyparts/bpleg.jpg");
            final Letters list14 = new Letters("LIPS", "/img/draw/bodyparts/bplips.jpg");
            final Letters list15 = new Letters("MOUTH", "/img/draw/bodyparts/bpmouth.jpg");
            final Letters list16 = new Letters("NECK", "/img/draw/bodyparts/bpneck.jpg");
            final Letters list17 = new Letters("NOSE", "/img/draw/bodyparts/bpnose.jpg");
            final Letters list18 = new Letters("PALM", "/img/draw/bodyparts/bppalm.jpg");
            final Letters list19 = new Letters("SHOULDER", "/img/draw/bodyparts/bpshoulder.jpg");
            final Letters list20 = new Letters("STOMACH", "/img/draw/bodyparts/bpstomach.jpg");
            final Letters list21 = new Letters("TEETH", "/img/draw/bodyparts/bpteeth.jpg");
            final ObservableList<Letters> list29 = FXCollections.observableArrayList(
                    list1, list2, list3, list4, list5, list6, list7, list8, list9, list10, list11, list12,
                    list13, list14, list15, list16, list17, list18, list19, list20, list21
            );
            return list29;
        }
        if (kode.equals("Colors")) {
            final Letters list1 = new Letters("BLACK", "/img/draw/colors/colorblack.jpg");
            final Letters list2 = new Letters("BLUE", "/img/draw/colors/colorblue.jpg");
            final Letters list3 = new Letters("BROWN", "/img/draw/colors/colorbrown.jpg");
            final Letters list4 = new Letters("GREEN", "/img/draw/colors/colorgreen.jpg");
            final Letters list5 = new Letters("GREY", "/img/draw/colors/colorgrey.jpg");
            final Letters list6 = new Letters("ORANGE", "/img/draw/colors/colororange.jpg");
            final Letters list7 = new Letters("PINK", "/img/draw/colors/colorpink.jpg");
            final Letters list8 = new Letters("PURPLE", "/img/draw/colors/colorpurple.jpg");
            final Letters list9 = new Letters("RED", "/img/draw/colors/colorred.jpg");
            final Letters list10 = new Letters("WHITE", "/img/draw/colors/colorwhite.jpg");
            final Letters list11 = new Letters("YELLOW", "/img/draw/colors/coloryellow.jpg");
            final ObservableList<Letters> list30 = FXCollections.observableArrayList(list1, list2, list3, list4, list5, list6, list7, list8, list9, list10, list11 );
            return list30;
        }
        if (kode.equals("Days")) {
            final Letters list1 = new Letters("SUNDAY", "/img/draw/days/sunday.png");
            final Letters list2 = new Letters("MONDAY", "/img/draw/days/monday.png");
            final Letters list3 = new Letters("TUESDAY", "/img/draw/days/tuesday.png");
            final Letters list4 = new Letters("WEDNESDAY", "/img/draw/days/wednesday.png");
            final Letters list5 = new Letters("THURSDAY", "/img/draw/days/thursday.png");
            final Letters list6 = new Letters("FRIDAY", "/img/draw/days/friday.png");
            final Letters list7 = new Letters("SATURDAY", "/img/draw/days/saturday.png");
            final ObservableList<Letters> list31 = FXCollections.observableArrayList(list1, list2, list3, list4, list5, list6, list7 );
            return list31;
        }
        if (kode.equals("Domestic Animals")) {
            final Letters list1 = new Letters("BUFFALO", "/img/draw/domesticAnimals/buffalo.jpg");
            final Letters list2 = new Letters("BULL", "/img/draw/domesticAnimals/bull.jpg");
            final Letters list3 = new Letters("CAMEL", "/img/draw/domesticAnimals/camel.jpg");
            final Letters list4 = new Letters("CAT", "/img/draw/domesticAnimals/cat.jpg");
            final Letters list5 = new Letters("COW", "/img/draw/domesticAnimals/cow.jpg");
            final Letters list6 = new Letters("DOG", "/img/draw/domesticAnimals/dog.jpg");
            final Letters list7 = new Letters("DONKEY", "/img/draw/domesticAnimals/donkey.jpg");
            final Letters list8 = new Letters("GOAT", "/img/draw/domesticAnimals/goat.jpg");
            final Letters list9 = new Letters("HORSE", "/img/draw/domesticAnimals/horse.jpg");
            final Letters list10 = new Letters("PIG", "/img/draw/domesticAnimals/pig.jpg");
            final Letters list11 = new Letters("RABBIT", "/img/draw/domesticAnimals/rabbit.jpg");
            final Letters list12 = new Letters("SHEEP", "/img/draw/domesticAnimals/sheep.jpg");
            final ObservableList<Letters> list32 = FXCollections.observableArrayList(
                    list1, list2, list3, list4, list5, list6, list7, list8, list9, list10, list11, list12
            );
            return list32;
        }
        if (kode.equals("Flowers")) {
            final Letters list1 = new Letters("ASTER", "/img/draw/flowers/floweraster.jpg");
            final Letters list2 = new Letters("CARNATION", "/img/draw/flowers/flowercarnation.jpg");
            final Letters list3 = new Letters("CHRYSANTEMUM", "/img/draw/flowers/flowerchrysanthemum.jpg");
            final Letters list4 = new Letters("DAFFODIL", "/img/draw/flowers/flowerdaffodil.jpg");
            final Letters list5 = new Letters("DAHLIA", "/img/draw/flowers/flowerdahlia.jpg");
            final Letters list6 = new Letters("DAISY", "/img/draw/flowers/flowerdaisy.jpg");
            final Letters list7 = new Letters("HIBISCUS", "/img/draw/flowers/flowerhibiscus.jpg");
            final Letters list8 = new Letters("JASMINE", "/img/draw/flowers/flowerjasmine.jpg");
            final Letters list9 = new Letters("LILY", "/img/draw/flowers/flowerlily.jpg");
            final Letters list10 = new Letters("LOTUS", "/img/draw/flowers/flowerlotus.jpg");
            final Letters list11 = new Letters("MARIGOLD", "/img/draw/flowers/flowermarigold.jpg");
            final Letters list12 = new Letters("MORNING-GLORY", "/img/draw/flowers/flowermorning_glory.jpg");
            final Letters list13 = new Letters("ORCHID", "/img/draw/flowers/flowerorchid.jpg");
            final Letters list14 = new Letters("PANSY", "/img/draw/flowers/flowerpansy.jpg");
            final Letters list15 = new Letters("POPPY", "/img/draw/flowers/flowerpoppy.jpg");
            final Letters list16 = new Letters("ROSE", "/img/draw/flowers/flowerrose.jpg");
            final Letters list17 = new Letters("SUNFLOWER", "/img/draw/flowers/flowersunflower.jpg");
            final Letters list18 = new Letters("TUBEROSE", "/img/draw/flowers/flowertuberose.jpg");
            final ObservableList<Letters> list33 = FXCollections.observableArrayList(
                    list1, list2, list3, list4, list5, list6, list7, list8, list9, list10,
                    list11, list12, list13, list14, list15, list16, list17, list18
            );
            return list33;
        }
        if (kode.equals("Fruits")) {
            final Letters list1 = new Letters("APPLE", "/img/draw/fruits/fruitapple.jpg");
            final Letters list2 = new Letters("BANANA", "/img/draw/fruits/fruitbanana.jpg");
            final Letters list3 = new Letters("CHERRIES", "/img/draw/fruits/fruitcherries.jpg");
            final Letters list4 = new Letters("CHIKOO", "/img/draw/fruits/fruitchikoo.jpg");
            final Letters list5 = new Letters("GRAPES", "/img/draw/fruits/fruitgrapes.jpg");
            final Letters list6 = new Letters("GUAVA", "/img/draw/fruits/fruitguava.jpg");
            final Letters list7 = new Letters("KIWI", "/img/draw/fruits/fruitkiwi.jpg");
            final Letters list8 = new Letters("MANGO", "/img/draw/fruits/fruitmango.jpg");
            final Letters list9 = new Letters("ORANGE", "/img/draw/fruits/fruitorange.jpg");
            final Letters list10 = new Letters("PAPAYA", "/img/draw/fruits/fruitpapaya.jpg");
            final Letters list11 = new Letters("PEAR", "/img/draw/fruits/fruitpear.jpg");
            final Letters list12 = new Letters("PINEAPLE", "/img/draw/fruits/fruitpineaple.jpg");
            final Letters list13 = new Letters("PLUM", "/img/draw/fruits/fruitplum.jpg");
            final Letters list14 = new Letters("POMEGRANATE", "/img/draw/fruits/fruitpomegranate.jpg");
            final Letters list15 = new Letters("STRAWBERRY", "/img/draw/fruits/fruitstrawberry.jpg");
            final Letters list16 = new Letters("WATERMELON", "/img/draw/fruits/fruitwatermelon.jpg");
            final ObservableList<Letters> list34 = FXCollections.observableArrayList(
                    list1, list2, list3, list4, list5, list6, list7, list8, list9, list10,
                    list11, list12, list13, list14, list15, list16
            );
            return list34;
        }
        if (kode.equals("Home's Object")) {
            final Letters list1 = new Letters("BED", "/img/draw/home/bed.jpg");
            final Letters list2 = new Letters("BOWL", "/img/draw/home/bowl.jpg");
            final Letters list3 = new Letters("COMB", "/img/draw/home/comb.jpg");
            final Letters list4 = new Letters("CUP", "/img/draw/home/cup.jpg");
            final Letters list5 = new Letters("CUPBOARD", "/img/draw/home/cupboard.jpg");
            final Letters list6 = new Letters("IRON", "/img/draw/home/iron.jpg");
            final Letters list7 = new Letters("KNIFE", "/img/draw/home/knife.jpg");
            final Letters list8 = new Letters("PLATE", "/img/draw/home/plate.jpg");
            final Letters list9 = new Letters("POT", "/img/draw/home/pot.jpg");
            final Letters list10 = new Letters("SPOON", "/img/draw/home/spoon.jpg");
            final Letters list11 = new Letters("STOVE", "/img/draw/home/stove.jpg");
            final Letters list12 = new Letters("TOOTHBRUSH", "/img/draw/home/toothbrush.jpg");
            final Letters list13 = new Letters("TOOTHPASTE", "/img/draw/home/toothpaste.jpg");
            final Letters list14 = new Letters("WALLDROBE", "/img/draw/home/walldrobe.jpg");
            final ObservableList<Letters> list35 = FXCollections.observableArrayList(
                    list1, list2, list3, list4, list5, list6, list7,
                    list8, list9, list10, list11, list12, list13, list14 
            );
            return list35;
        }
        if (kode.equals("Months")) {
            final Letters list1 = new Letters("JANUARY", "/img/draw/months/jan.png");
            final Letters list2 = new Letters("FEBRUARY", "/img/draw/months/feb.png");
            final Letters list3 = new Letters("MARCH", "/img/draw/months/mar.png");
            final Letters list4 = new Letters("APRIL", "/img/draw/months/apr.png");
            final Letters list5 = new Letters("MAY", "/img/draw/months/may.png");
            final Letters list6 = new Letters("JUNE", "/img/draw/months/jun.png");
            final Letters list7 = new Letters("JULY", "/img/draw/months/jul.png");
            final Letters list8 = new Letters("AUGUST", "/img/draw/months/aug.png");
            final Letters list9 = new Letters("SEPTEMBER", "/img/draw/months/sep.png");
            final Letters list10 = new Letters("OCTOBER", "/img/draw/months/oct.png");
            final Letters list11 = new Letters("NOVEMBER", "/img/draw/months/nov.png");
            final Letters list12 = new Letters("DECEMBER", "/img/draw/months/dec.png");
            final ObservableList<Letters> list32 = FXCollections.observableArrayList(
                    list1, list2, list3, list4, list5, list6,
                    list7, list8, list9, list10, list11, list12
            );
            return list32;
        }
        if (kode.equals("Numbers")) {
            final Letters list1 = new Letters("ONE", "/img/draw/numbers/1.jpg");
            final Letters list2 = new Letters("TWO", "/img/draw/numbers/2.jpg");
            final Letters list3 = new Letters("THREE", "/img/draw/numbers/3.jpg");
            final Letters list4 = new Letters("FOUR", "/img/draw/numbers/4.jpg");
            final Letters list5 = new Letters("FIVE", "/img/draw/numbers/5.jpg");
            final Letters list6 = new Letters("SIX", "/img/draw/numbers/6.jpg");
            final Letters list7 = new Letters("SEVEN", "/img/draw/numbers/7.jpg");
            final Letters list8 = new Letters("EIGHT", "/img/draw/numbers/8.jpg");
            final Letters list9 = new Letters("NINE", "/img/draw/numbers/9.jpg");
            final Letters list10 = new Letters("TEN", "/img/draw/numbers/10.jpg");
            final ObservableList<Letters> list36 = FXCollections.observableArrayList(
                    list1, list2, list3, list4, list5, list6, list7, list8, list9, list10
            );
            return list36;
        }
        if (kode.equals("Home's Object")) {
            final Letters list1 = new Letters("BED", "/img/draw/home/bed.jpg");
            final Letters list2 = new Letters("BOWL", "/img/draw/home/bowl.jpg");
            final Letters list3 = new Letters("COMB", "/img/draw/home/comb.jpg");
            final Letters list4 = new Letters("CUP", "/img/draw/home/cup.jpg");
            final Letters list5 = new Letters("CUPBOARD", "/img/draw/home/cupboard.jpg");
            final Letters list6 = new Letters("IRON", "/img/draw/home/iron.jpg");
            final Letters list7 = new Letters("KNIFE", "/img/draw/home/knife.jpg");
            final Letters list8 = new Letters("PLATE", "/img/draw/home/plate.jpg");
            final Letters list9 = new Letters("POT", "/img/draw/home/pot.jpg");
            final Letters list10 = new Letters("SPOON", "/img/draw/home/spoon.jpg");
            final Letters list11 = new Letters("STOVE", "/img/draw/home/stove.jpg");
            final Letters list12 = new Letters("TOOTHBRUSH", "/img/draw/home/toothbrush.jpg");
            final Letters list13 = new Letters("TOOTHPASTE", "/img/draw/home/toothpaste.jpg");
            final Letters list14 = new Letters("WALLDROBE", "/img/draw/home/walldrobe.jpg");
            final ObservableList<Letters> list35 = FXCollections.observableArrayList(
                    list1, list2, list3, list4, list5, list6, list7, list8, list9, list10, list11, list12, list13, list14
            );
            return list35;
        }
        if (kode.equals("Office's Object")) {
            final Letters list1 = new Letters("BIRO", "/img/draw/office/biro.jpg");
            final Letters list2 = new Letters("CALCULATOR", "/img/draw/office/calculator.jpg");
            final Letters list3 = new Letters("CHAIR", "/img/draw/office/chair.jpg");
            final Letters list4 = new Letters("COMPUTER", "/img/draw/office/computer.jpg");
            final Letters list5 = new Letters("FLIES", "/img/draw/office/file.jpg");
            final Letters list6 = new Letters("MONITOR", "/img/draw/office/monitor.jpg");
            final Letters list7 = new Letters("PRINTER", "/img/draw/office/printer.jpg");
            final Letters list8 = new Letters("STAPLER", "/img/draw/office/stapler.jpg");
            final Letters list9 = new Letters("TABLE", "/img/draw/office/table.jpg");
            final ObservableList<Letters> list37 = FXCollections.observableArrayList(
                    list1, list2, list3, list4, list5, list6, list7, list8, list9
            );
            return list37;
        }
        if (kode.equals("Shapes")) {
            final Letters list1 = new Letters("ARROW", "/img/draw/shapes/shapearrow.jpg");
            final Letters list2 = new Letters("CIRCLE", "/img/draw/shapes/shapecircle.jpg");
            final Letters list3 = new Letters("CONE", "/img/draw/shapes/shapecone.jpg");
            final Letters list4 = new Letters("CROSS", "/img/draw/shapes/shapecross.jpg");
            final Letters list5 = new Letters("DIAMOND", "/img/draw/shapes/shapediamond.jpg");
            final Letters list6 = new Letters("HEART", "/img/draw/shapes/shapeheart.jpg");
            final Letters list7 = new Letters("HEXAGON", "/img/draw/shapes/shapehexagon.jpg");
            final Letters list8 = new Letters("OCTAGON", "/img/draw/shapes/shapeoctagon.jpg");
            final Letters list9 = new Letters("PENTAGON", "/img/draw/shapes/shapepentagon.jpg");
            final Letters list10 = new Letters("RECTANGLE", "/img/draw/shapes/shaperectangle.jpg");
            final Letters list11 = new Letters("SQUARE", "/img/draw/shapes/shapesquare.jpg");
            final Letters list12 = new Letters("STAR", "/img/draw/shapes/shapestar.jpg");
            final Letters list13 = new Letters("TRIANGLE", "/img/draw/shapes/shapetriangle.jpg");
            final ObservableList<Letters> list38 = FXCollections.observableArrayList(list1, list2, list3, list4, list5, list6, list7, list8, list9, list10, list11, list12, list13 );
            return list38;
        }
        if (kode.equals("Transportations")) {
            final Letters list1 = new Letters("AIRPLANE", "/img/draw/transports/transport_airplane.png");
            final Letters list2 = new Letters("BICYCLE", "/img/draw/transports/transport_bicycle.png");
            final Letters list3 = new Letters("BOAT", "/img/draw/transports/transport_boat.png");
            final Letters list4 = new Letters("BUS", "/img/draw/transports/transport_bus.png");
            final Letters list5 = new Letters("CAR", "/img/draw/transports/transport_car.png");
            final Letters list6 = new Letters("HELICOPTER", "/img/draw/transports/transport_helicopter.png");
            final Letters list7 = new Letters("MOTORBIKE", "/img/draw/transports/transport_motorbike.png");
            final Letters list8 = new Letters("SCOOTER", "/img/draw/transports/transport_scooter.png");
            final Letters list9 = new Letters("TANK", "/img/draw/transports/transport_tank.png");
            final Letters list10 = new Letters("TANKER", "/img/draw/transports/transport_tanker.png");
            final Letters list11 = new Letters("TAXI", "/img/draw/transports/transport_taxi.png");
            final Letters list12 = new Letters("TRACTOR", "/img/draw/transports/transport_tractor.png");
            final Letters list13 = new Letters("TRAIN", "/img/draw/transports/transport_train.png");
            final ObservableList<Letters> list38 = FXCollections.observableArrayList(
                    list1, list2, list3, list4, list5, list6, list7, list8, list9, list10, list11, list12, list13
            );
            return list38;
        }
        if (kode.equals("Vegetables")) {
            final Letters list1 = new Letters("BEETROOT", "/img/draw/vegetables/vegbeetroot.jpg");
            final Letters list2 = new Letters("BITTERGOURD", "/img/draw/vegetables/vegbittergourd.jpg");
            final Letters list3 = new Letters("BOTTLEGOURD", "/img/draw/vegetables/vegbottlegourd.jpg");
            final Letters list4 = new Letters("BRINJAL", "/img/draw/vegetables/vegbrinjal.jpg");
            final Letters list5 = new Letters("BROCCOLI", "/img/draw/vegetables/vegbroccoli.jpg");
            final Letters list6 = new Letters("CABBAGE", "/img/draw/vegetables/vegcabbage.jpg");
            final Letters list7 = new Letters("CARROT", "/img/draw/vegetables/vegcarrot.jpg");
            final Letters list8 = new Letters("CHILI", "/img/draw/vegetables/vegchili.jpg");
            final Letters list9 = new Letters("CORN", "/img/draw/vegetables/vegcorn.jpg");
            final Letters list10 = new Letters("CUCUMBER", "/img/draw/vegetables/vegcucumber.jpg");
            final Letters list11 = new Letters("FENUGREEK", "/img/draw/vegetables/vegfenugreek.jpg");
            final Letters list12 = new Letters("GARLIC", "/img/draw/vegetables/veggarlic.jpg");
            final Letters list13 = new Letters("GREENPEACE", "/img/draw/vegetables/veggreenpeace.jpg");
            final Letters list14 = new Letters("LADYFINGER", "/img/draw/vegetables/vegladyfinger.jpg");
            final Letters list15 = new Letters("LEMON", "/img/draw/vegetables/veglemon.jpg");
            final Letters list16 = new Letters("ONION", "/img/draw/vegetables/vegonion.jpg");
            final Letters list17 = new Letters("POTATO", "/img/draw/vegetables/vegpotato.jpg");
            final Letters list18 = new Letters("PUMPKIN", "/img/draw/vegetables/vegpumpkin.jpg");
            final Letters list19 = new Letters("SPINACH", "/img/draw/vegetables/vegspinach.jpg");
            final Letters list20 = new Letters("TOMATO", "/img/draw/vegetables/vegtomato.jpg");
            final Letters list21 = new Letters("YAM", "/img/draw/vegetables/vegyam.jpg");
            final ObservableList<Letters> list29 = FXCollections.observableArrayList(
                    list1, list2, list3, list4, list5, list6, list7, list8, list9, list10, list11, list12, 
                    list13, list14, list15, list16, list17, list18, list19, list20, list21
            );
            return list29;
        }
        if (kode.equals("Wild Animals")) {
            final Letters list1 = new Letters("ANTELOPE", "/img/draw/wildAnimals/wildantelope.jpg");
            final Letters list2 = new Letters("BEAR", "/img/draw/wildAnimals/wildbear.jpg");
            final Letters list3 = new Letters("BISON", "/img/draw/wildAnimals/wildbison.jpg");
            final Letters list4 = new Letters("CHEETAH", "/img/draw/wildAnimals/wildcheetah.jpg");
            final Letters list5 = new Letters("DEER", "/img/draw/wildAnimals/wilddeer.jpg");
            final Letters list6 = new Letters("ELEPHANT", "/img/draw/wildAnimals/wildelephant.jpg");
            final Letters list7 = new Letters("GIRAFFE", "/img/draw/wildAnimals/wildgiraffe.jpg");
            final Letters list8 = new Letters("GORILLA", "/img/draw/wildAnimals/wildgorilla.jpg");
            final Letters list9 = new Letters("HIPPOPOTAMUS", "/img/draw/wildAnimals/wildhippopotamus.jpg");
            final Letters list10 = new Letters("JACKAL", "/img/draw/wildAnimals/wildjackal.jpg");
            final Letters list11 = new Letters("JAGUAR", "/img/draw/wildAnimals/wildjaguar.jpg");
            final Letters list12 = new Letters("KANGAROO", "/img/draw/wildAnimals/wildkangaroo.jpg");
            final Letters list13 = new Letters("LION", "/img/draw/wildAnimals/wildlion.jpg");
            final Letters list14 = new Letters("MONKEY", "/img/draw/wildAnimals/wildmonkey.jpg");
            final Letters list15 = new Letters("PANTHER", "/img/draw/wildAnimals/wildpanther.jpg");
            final Letters list16 = new Letters("TIGER", "/img/draw/wildAnimals/wildtiger.jpg");
            final Letters list17 = new Letters("YAK", "/img/draw/wildAnimals/wildyak.jpg");
            final Letters list18 = new Letters("ZEBRA", "/img/draw/wildAnimals/wildzebra.jpg");
            final ObservableList<Letters> list33 = FXCollections.observableArrayList(
                    list1, list2, list3, list4, list5, list6, list7, list8, list9, list10,
                    list11, list12, list13, list14, list15, list16, list17, list18
            );
            return list33;
        }
        if (kode.equals("Two Letters")) {
            final Letters list1 = new Letters("AM", "/img/draw/twoLetters/AM.png");
            final Letters list2 = new Letters("AN", "/img/draw/twoLetters/AN.png");
            final Letters list3 = new Letters("AS", "/img/draw/twoLetters/AS.png");
            final Letters list4 = new Letters("AT", "/img/draw/twoLetters/AT.png");
            final Letters list5 = new Letters("GO", "/img/draw/twoLetters/GO.png");
            final Letters list6 = new Letters("HI", "/img/draw/twoLetters/HI.png");
            final Letters list7 = new Letters("IF", "/img/draw/twoLetters/IF.png");
            final Letters list8 = new Letters("IN", "/img/draw/twoLetters/IN.png");
            final Letters list9 = new Letters("IS", "/img/draw/twoLetters/IS.png");
            final Letters list10 = new Letters("IT", "/img/draw/twoLetters/IT.png");
            final Letters list11 = new Letters("MA", "/img/draw/twoLetters/MA.png");
            final Letters list12 = new Letters("ME", "/img/draw/twoLetters/ME.png");
            final Letters list13 = new Letters("MY", "/img/draw/twoLetters/MY.png");
            final Letters list14 = new Letters("NO", "/img/draw/twoLetters/NO.png");
            final Letters list15 = new Letters("OF", "/img/draw/twoLetters/OF.png");
            final Letters list16 = new Letters("OH", "/img/draw/twoLetters/OH.png");
            final Letters list17 = new Letters("ON", "/img/draw/twoLetters/ON.png");
            final Letters list18 = new Letters("OR", "/img/draw/twoLetters/OR.png");
            final Letters list19 = new Letters("OX", "/img/draw/twoLetters/OX.png");
            final Letters list20 = new Letters("SO", "/img/draw/twoLetters/SO.png");
            final Letters list21 = new Letters("TO", "/img/draw/twoLetters/TO.png");
            final Letters list22 = new Letters("UP", "/img/draw/twoLetters/UP.png");
            final Letters list23 = new Letters("WE", "/img/draw/twoLetters/WE.png");
            final ObservableList<Letters> list39 = FXCollections.observableArrayList(
                    list1, list2, list3, list4, list5, list6, list7, list8, list9, list10, list11, list12,
                    list13, list14, list15, list16, list17, list18, list19, list20, list21, list22, list23
            );
            return list39;
        }
        if (kode.equals("Three Letters")) {
            final Letters list1 = new Letters("ANT", "/img/draw/threeLetters/ant.png");
            final Letters list2 = new Letters("BAG", "/img/draw/threeLetters/bag.png");
            final Letters list3 = new Letters("BAT", "/img/draw/threeLetters/bat.png");
            final Letters list4 = new Letters("BED", "/img/draw/threeLetters/bed.png");
            final Letters list5 = new Letters("BUG", "/img/draw/threeLetters/bug.png");
            final Letters list6 = new Letters("CAN", "/img/draw/threeLetters/can.png");
            final Letters list7 = new Letters("CAP", "/img/draw/threeLetters/cap.png");
            final Letters list8 = new Letters("CAR", "/img/draw/threeLetters/car.png");
            final Letters list9 = new Letters("EGG", "/img/draw/threeLetters/egg.png");
            final Letters list10 = new Letters("FAN", "/img/draw/threeLetters/fan.png");
            final Letters list11 = new Letters("FAT", "/img/draw/threeLetters/fat.png");
            final Letters list12 = new Letters("FOX", "/img/draw/threeLetters/fox.png");
            final Letters list13 = new Letters("HAT", "/img/draw/threeLetters/hat.png");
            final Letters list14 = new Letters("HEN", "/img/draw/threeLetters/hen.png");
            final Letters list15 = new Letters("ICE", "/img/draw/threeLetters/ice.png");
            final Letters list16 = new Letters("JAM", "/img/draw/threeLetters/jam.png");
            final Letters list17 = new Letters("KEY", "/img/draw/threeLetters/key.png");
            final Letters list18 = new Letters("MAN", "/img/draw/threeLetters/man.png");
            final Letters list19 = new Letters("MAP", "/img/draw/threeLetters/map.png");
            final Letters list20 = new Letters("MAT", "/img/draw/threeLetters/mat.png");
            final Letters list21 = new Letters("MOM", "/img/draw/threeLetters/mom.png");
            final Letters list22 = new Letters("MUG", "/img/draw/threeLetters/mug.png");
            final Letters list23 = new Letters("NET", "/img/draw/threeLetters/net.png");
            final Letters list24 = new Letters("PAD", "/img/draw/threeLetters/pad.png");
            final Letters list25 = new Letters("PAN", "/img/draw/threeLetters/pan.png");
            final Letters list26 = new Letters("PEN", "/img/draw/threeLetters/pen.png");
            final Letters list40 = new Letters("RAT", "/img/draw/threeLetters/rat.png");
            final Letters list41 = new Letters("RUN", "/img/draw/threeLetters/run.png");
            final Letters list42 = new Letters("SAD", "/img/draw/threeLetters/sad.png");
            final ObservableList<Letters> list43 = FXCollections.observableArrayList(
                    list1, list2, list3, list4, list5, list6, list7, list8, list9, list10, list11, list12,
                    list13, list14, list15, list16, list17, list18, list19, list20, list21, list22, list23,
                    list24, list25, list26, list40, list41, list42
            );
            return list43;
        }
        if (kode.equals("Four Letters")) {
            final Letters list1 = new Letters("BOOK", "/img/draw/fourLetters/book.png");
            final Letters list2 = new Letters("BOOT", "/img/draw/fourLetters/boot.png");
            final Letters list3 = new Letters("CAKE", "/img/draw/fourLetters/cake.png");
            final Letters list4 = new Letters("CHEF", "/img/draw/fourLetters/chef.png");
            final Letters list5 = new Letters("CRAB", "/img/draw/fourLetters/crab.png");
            final Letters list6 = new Letters("DESK", "/img/draw/fourLetters/desk.png");
            final Letters list7 = new Letters("DISH", "/img/draw/fourLetters/dish.png");
            final Letters list8 = new Letters("DROP", "/img/draw/fourLetters/drop.png");
            final Letters list9 = new Letters("DRUM", "/img/draw/fourLetters/drum.png");
            final Letters list10 = new Letters("EXIT", "/img/draw/fourLetters/exit.png");
            final Letters list11 = new Letters("FISH", "/img/draw/fourLetters/fish.jpg");
            final Letters list12 = new Letters("FROG", "/img/draw/fourLetters/frog.png");
            final Letters list13 = new Letters("GIRL", "/img/draw/fourLetters/girl.png");
            final Letters list14 = new Letters("HOME", "/img/draw/fourLetters/home.png");
            final Letters list15 = new Letters("JUMP", "/img/draw/fourLetters/jump.png");
            final Letters list16 = new Letters("KING", "/img/draw/fourLetters/king.png");
            final Letters list17 = new Letters("KITE", "/img/draw/fourLetters/kite.jpg");
            final Letters list18 = new Letters("LAMP", "/img/draw/fourLetters/lamp.png");
            final Letters list19 = new Letters("LEAF", "/img/draw/fourLetters/leaf.png");
            final Letters list20 = new Letters("LION", "/img/draw/fourLetters/lion.jpg");
            final Letters list21 = new Letters("MOON", "/img/draw/fourLetters/moon.png");
            final Letters list22 = new Letters("NAIL", "/img/draw/fourLetters/nail.png");
            final Letters list23 = new Letters("NEST", "/img/draw/fourLetters/nest.jpg");
            final Letters list24 = new Letters("PANT", "/img/draw/fourLetters/pant.png");
            final Letters list25 = new Letters("ROPE", "/img/draw/fourLetters/rope.png");
            final Letters list26 = new Letters("SHIP", "/img/draw/fourLetters/ship.png");
            final Letters list40 = new Letters("TREE", "/img/draw/fourLetters/tree.png");
            final Letters list41 = new Letters("XMAS", "/img/draw/fourLetters/xmas.jpg");
            final ObservableList<Letters> list44 = FXCollections.observableArrayList(
                    list1, list2, list3, list4, list5, list6, list7, list8, list9, list10, list11,
                    list12, list13, list14, list15, list16, list17, list18, list19, list20, list21,
                    list22, list23, list24, list25, list26, list40, list41
            );
            return list44;
        }
        if (kode.equals("Five Letters")) {
            final Letters list1 = new Letters("ANGEL", "/img/draw/fiveLetters/angel.jpg");
            final Letters list2 = new Letters("ANGRY", "/img/draw/fiveLetters/angry.jpg");
            final Letters list3 = new Letters("APPLE", "/img/draw/fiveLetters/apple.jpg");
            final Letters list4 = new Letters("BLOOD", "/img/draw/fiveLetters/blood.jpg");
            final Letters list5 = new Letters("BOARD", "/img/draw/fiveLetters/board.jpg");
            final Letters list6 = new Letters("BRAIN", "/img/draw/fiveLetters/brain.jpg");
            final Letters list7 = new Letters("BREAD", "/img/draw/fiveLetters/bread.jpg");
            final Letters list8 = new Letters("CANDY", "/img/draw/fiveLetters/candy.jpg");
            final Letters list9 = new Letters("CLOCK", "/img/draw/fiveLetters/clock.jpg");
            final Letters list10 = new Letters("DANCE", "/img/draw/fiveLetters/dance.jpg");
            final Letters list11 = new Letters("DIRTY", "/img/draw/fiveLetters/dirty.jpg");
            final Letters list12 = new Letters("DRESS", "/img/draw/fiveLetters/dress.jpg");
            final Letters list13 = new Letters("EARTH", "/img/draw/fiveLetters/earth.jpg");
            final Letters list14 = new Letters("EMPTY", "/img/draw/fiveLetters/empty.jpg");
            final Letters list15 = new Letters("FEVER", "/img/draw/fiveLetters/fever.jpg");
            final Letters list16 = new Letters("FORTY", "/img/draw/fiveLetters/forty.jpg");
            final Letters list17 = new Letters("GLOBE", "/img/draw/fiveLetters/globe.jpg");
            final Letters list18 = new Letters("GUARD", "/img/draw/fiveLetters/guard.jpg");
            final Letters list19 = new Letters("HONEY", "/img/draw/fiveLetters/honey.jpg");
            final Letters list20 = new Letters("HOUSE", "/img/draw/fiveLetters/house.jpg");
            final Letters list21 = new Letters("INDIA", "/img/draw/fiveLetters/india.jpg");
            final Letters list22 = new Letters("JELLY", "/img/draw/fiveLetters/jelly.jpg");
            final Letters list23 = new Letters("JESUS", "/img/draw/fiveLetters/jesus.jpg");
            final Letters list24 = new Letters("JUICE", "/img/draw/fiveLetters/juice.jpg");
            final Letters list25 = new Letters("KNIFE", "/img/draw/fiveLetters/knife.jpg");
            final Letters list26 = new Letters("LAUGH", "/img/draw/fiveLetters/laugh.jpg");
            final Letters list40 = new Letters("LEAVE", "/img/draw/fiveLetters/leave.jpg");
            final Letters list41 = new Letters("LIGHT", "/img/draw/fiveLetters/light.jpg");
            final Letters list42 = new Letters("MANGO", "/img/draw/fiveLetters/mango.jpg");
            final Letters list45 = new Letters("MELON", "/img/draw/fiveLetters/melon.jpg");
            final Letters list46 = new Letters("MOUSE", "/img/draw/fiveLetters/mouse.jpg");
            final Letters list47 = new Letters("NIGHT", "/img/draw/fiveLetters/night.jpg");
            final Letters list48 = new Letters("OCEAN", "/img/draw/fiveLetters/ocean.jpg");
            final Letters list49 = new Letters("PANDA", "/img/draw/fiveLetters/panda.jpg");
            final Letters list50 = new Letters("PAPER", "/img/draw/fiveLetters/paper.jpg");
            final Letters list51 = new Letters("PHONE", "/img/draw/fiveLetters/phone.jpg");
            final Letters list52 = new Letters("PIANO", "/img/draw/fiveLetters/piano.jpg");
            final Letters list53 = new Letters("POWER", "/img/draw/fiveLetters/power.jpg");
            final Letters list54 = new Letters("QUEEN", "/img/draw/fiveLetters/queen.jpg");
            final Letters list55 = new Letters("QUILL", "/img/draw/fiveLetters/quill.jpg");
            final Letters list56 = new Letters("RADIO", "/img/draw/fiveLetters/radio.jpg");
            final Letters list57 = new Letters("RIVER", "/img/draw/fiveLetters/river.jpg");
            final Letters list58 = new Letters("SANTA", "/img/draw/fiveLetters/santa.jpg");
            final Letters list59 = new Letters("SLEEP", "/img/draw/fiveLetters/sleep.jpg");
            final Letters list60 = new Letters("SNAKE", "/img/draw/fiveLetters/snake.jpg");
            final Letters list61 = new Letters("SPOON", "/img/draw/fiveLetters/spoon.jpg");
            final Letters list62 = new Letters("SWEET", "/img/draw/fiveLetters/sweet.jpg");
            final Letters list63 = new Letters("TABLE", "/img/draw/fiveLetters/table.jpg");
            final Letters list64 = new Letters("THINK", "/img/draw/fiveLetters/think.jpg");
            final Letters list65 = new Letters("WATCH", "/img/draw/fiveLetters/watch.jpg");
            final Letters list66 = new Letters("WHALE", "/img/draw/fiveLetters/whale.jpg");
            final Letters list67 = new Letters("WRONG", "/img/draw/fiveLetters/wrong.jpg");
            final Letters list68 = new Letters("ZEBRA", "/img/draw/fiveLetters/zebra.jpg");
            final ObservableList<Letters> list69 = FXCollections.observableArrayList(
                    list1, list2, list3, list4, list5, list6, list7, list8, list9, list10,
                    list11, list12, list13, list14, list15, list16, list17, list18, list19,
                    list20, list21, list22, list23, list24, list25, list26, list40, list41,
                    list42, list45, list46, list47, list48, list49, list50, list51, list52,
                    list53, list54, list55, list56, list57, list58, list59, list60, list61,
                    list62, list63, list64, list65, list66, list67, list68
            );
            return list69;
        }
        if (kode.equals("Six Letters")) {
            final Letters list1 = new Letters("ACTION", "/img/draw/sixLetters/six_Letters_action.png");
            final Letters list2 = new Letters("ANIMAL", "/img/draw/sixLetters/six_Letters_animal.png");
            final Letters list3 = new Letters("ARRIVE", "/img/draw/sixLetters/six_Letters_arrive.png");
            final Letters list4 = new Letters("ARTIST", "/img/draw/sixLetters/six_Letters_artist.png");
            final Letters list5 = new Letters("ATTACK", "/img/draw/sixLetters/six_Letters_attack.png");
            final Letters list6 = new Letters("AUTHOR", "/img/draw/sixLetters/six_Letters_author.png");
            final Letters list7 = new Letters("BEAUTY", "/img/draw/sixLetters/six_Letters_beauty.png");
            final Letters list8 = new Letters("BOTTLE", "/img/draw/sixLetters/six_Letters_bottle.png");
            final Letters list9 = new Letters("BRANCH", "/img/draw/sixLetters/six_Letters_branch.png");
            final Letters list10 = new Letters("BRIDGE", "/img/draw/sixLetters/six_Letters_bridge.png");
            final Letters list11 = new Letters("BUTTON", "/img/draw/sixLetters/six_Letters_button.png");
            final Letters list12 = new Letters("CAMERA", "/img/draw/sixLetters/six_Letters_camera.png");
            final Letters list13 = new Letters("COFFEE", "/img/draw/sixLetters/six_Letters_coffee.png");
            final Letters list14 = new Letters("COUPLE", "/img/draw/sixLetters/six_Letters_couple.png");
            final Letters list15 = new Letters("DEGREE", "/img/draw/sixLetters/six_Letters_degree.png");
            final Letters list16 = new Letters("DESERT", "/img/draw/sixLetters/six_Letters_desert.png");
            final Letters list17 = new Letters("DESIGN", "/img/draw/sixLetters/six_Letters_design.png");
            final Letters list18 = new Letters("DEVICE", "/img/draw/sixLetters/six_Letters_device.png");
            final Letters list19 = new Letters("EATING", "/img/draw/sixLetters/six_Letters_eating.png");
            final Letters list20 = new Letters("ENERGY", "/img/draw/sixLetters/six_Letters_energy.png");
            final Letters list21 = new Letters("ENGINE", "/img/draw/sixLetters/six_Letters_engine.png");
            final Letters list22 = new Letters("ESCAPE", "/img/draw/sixLetters/six_Letters_escape.png");
            final Letters list23 = new Letters("FAILED", "/img/draw/sixLetters/six_Letters_failed.png");
            final Letters list24 = new Letters("FINISH", "/img/draw/sixLetters/six_Letters_finish.png");
            final Letters list25 = new Letters("FRIEND", "/img/draw/sixLetters/six_Letters_friend.png");
            final Letters list26 = new Letters("GARDEN", "/img/draw/sixLetters/six_Letters_garden.png");
            final Letters list40 = new Letters("HANDLE", "/img/draw/sixLetters/six_Letters_handle.png");
            final Letters list41 = new Letters("HEALTH", "/img/draw/sixLetters/six_Letters_health.png");
            final Letters list42 = new Letters("HEIGHT", "/img/draw/sixLetters/six_Letters_height.png");
            final Letters list45 = new Letters("INSIDE", "/img/draw/sixLetters/six_Letters_inside.png");
            final Letters list46 = new Letters("ISLAND", "/img/draw/sixLetters/six_Letters_island.png");
            final Letters list47 = new Letters("LAWYER", "/img/draw/sixLetters/six_Letters_lawyer.png");
            final Letters list48 = new Letters("LEAVES", "/img/draw/sixLetters/six_Letters_leaves.png");
            final Letters list49 = new Letters("LISTEN", "/img/draw/sixLetters/six_Letters_listen.png");
            final Letters list50 = new Letters("MARKET", "/img/draw/sixLetters/six_Letters_market.png");
            final Letters list51 = new Letters("MIDDLE", "/img/draw/sixLetters/six_Letters_middle.png");
            final Letters list52 = new Letters("MIRROR", "/img/draw/sixLetters/six_Letters_mirror.png");
            final Letters list53 = new Letters("MOTHER", "/img/draw/sixLetters/six_Letters_mother.png");
            final Letters list54 = new Letters("NATION", "/img/draw/sixLetters/six_Letters_nation.png");
            final Letters list55 = new Letters("NATURE", "/img/draw/sixLetters/six_Letters_nature.png");
            final Letters list56 = new Letters("NOTICE", "/img/draw/sixLetters/six_Letters_notice.png");
            final Letters list57 = new Letters("OFFICE", "/img/draw/sixLetters/six_Letters_office.png");
            final Letters list58 = new Letters("ONLINE", "/img/draw/sixLetters/six_Letters_online.png");
            final Letters list59 = new Letters("OPTION", "/img/draw/sixLetters/six_Letters_option.png");
            final Letters list60 = new Letters("PALACE", "/img/draw/sixLetters/six_Letters_palace.png");
            final Letters list61 = new Letters("PLANET", "/img/draw/sixLetters/six_Letters_planet.png");
            final Letters list62 = new Letters("PLAYER", "/img/draw/sixLetters/six_Letters_player.png");
            final Letters list63 = new Letters("PLEASE", "/img/draw/sixLetters/six_Letters_please.png");
            final Letters list64 = new Letters("POLICE", "/img/draw/sixLetters/six_Letters_police.png");
            final Letters list65 = new Letters("PRINCE", "/img/draw/sixLetters/six_Letters_prince.png");
            final Letters list66 = new Letters("REPAIR", "/img/draw/sixLetters/six_Letters_repair.png");
            final Letters list67 = new Letters("REPORT", "/img/draw/sixLetters/six_Letters_report.png");
            final Letters list68 = new Letters("RESCUE", "/img/draw/sixLetters/six_Letters_rescue.png");
            final Letters list70 = new Letters("RESULT", "/img/draw/sixLetters/six_Letters_result.png");
            final Letters list71 = new Letters("ROCKET", "/img/draw/sixLetters/six_Letters_rocket.png");
            final Letters list72 = new Letters("SCHOOL", "/img/draw/sixLetters/six_Letters_school.png");
            final Letters list73 = new Letters("SISTER", "/img/draw/sixLetters/six_Letters_sister.png");
            final Letters list74 = new Letters("SILENT", "/img/draw/sixLetters/six_Letters_silent.png");
            final Letters list75 = new Letters("SUMMER", "/img/draw/sixLetters/six_Letters_summer.png");
            final Letters list76 = new Letters("SWITCH", "/img/draw/sixLetters/six_Letters_switch.png");
            final Letters list77 = new Letters("TENNIS", "/img/draw/sixLetters/six_Letters_tennis.png");
            final Letters list78 = new Letters("TICKET", "/img/draw/sixLetters/six_Letters_ticket.png");
            final Letters list79 = new Letters("TRAVEL", "/img/draw/sixLetters/six_Letters_travel.png");
            final Letters list80 = new Letters("VALLEY", "/img/draw/sixLetters/six_Letters_valley.png");
            final Letters list81 = new Letters("VOLUME", "/img/draw/sixLetters/six_Letters_volume.png");
            final Letters list82 = new Letters("WEALTH", "/img/draw/sixLetters/six_Letters_wealth.png");
            final Letters list83 = new Letters("WEEKLY", "/img/draw/sixLetters/six_Letters_weekly.png");
            final Letters list84 = new Letters("WEIGHT", "/img/draw/sixLetters/six_Letters_weight.png");
            final Letters list85 = new Letters("WINDOW", "/img/draw/sixLetters/six_Letters_window.png");
            final Letters list86 = new Letters("WINNER", "/img/draw/sixLetters/six_Letters_winner.png");
            final Letters list87 = new Letters("WINTER", "/img/draw/sixLetters/six_Letters_winter.png");
            final Letters list88 = new Letters("WORKER", "/img/draw/sixLetters/six_Letters_worker.png");
            final ObservableList<Letters> list89 = FXCollections.observableArrayList(
                    list1, list2, list3, list4, list5, list6, list7, list8, list9, list10, list11,
                    list12, list13, list14, list15, list16, list17, list18, list19, list20, list21,
                    list22, list23, list24, list25, list26, list40, list41, list42, list45, list46,
                    list47, list48, list49, list50, list51, list52, list53, list54, list55, list56,
                    list57, list58, list59, list60, list61, list62, list63, list64, list65, list66,
                    list67, list68, list70, list71, list72, list73, list74, list75, list76, list77,
                    list78, list79, list80, list81, list82, list83, list84, list85, list86, list87, list88 
            );
            return list89;
        }
        return null;
    }
}
