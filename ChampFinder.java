import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.*;
import java.util.*;

public class ChampFinder extends Application {
    private static int aggressive;
    private static int passive;
    private static int assertive;
    Font font = Font.font("Times New Roman", FontWeight.BOLD, 16);

    private static final VBox vBoxForChamps = new VBox();
    private static final VBox vBoxForChampPics = new VBox();
    private static final ArrayList<String> tankChamps = new ArrayList<>();
    private static final ArrayList<String> fighterChamps = new ArrayList<>();
    private static final ArrayList<String> allInChamps = new ArrayList<>();
    private static final ArrayList<String> supportChamps = new ArrayList<>();
    private static final ArrayList<String> marskmanChamps = new ArrayList<>();
    private static final ArrayList<String> questions = new ArrayList<>();
    private static final VBox vBoxForButtons = new VBox();
    private static final BorderPane bp = new BorderPane();

    public static void main(String[] args) {

        champions();
        setQuestions();
        test();

    }
    public static void test() {
        Scanner input = new Scanner(System.in);
        int user;

        System.out.println("The test is about to begin...");
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("For the following questions, use '1', '2', or '3' to answer.");
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        for (String question : questions) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(question);
            user = input.nextInt();
            if (user == 1) {
                aggressive++;
            } else if (user == 2) {
                assertive++;
            } else {
                passive++;
            }
        }
        System.out.println("Loading Results...");
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        launch();
            }
    public static void champions() {
        /* Aggressive Tanks*/
        tankChamps.add("Leona"); //[0]
        tankChamps.add("K'Sante"); //[1]
        tankChamps.add("Skarner"); //[2]
        /*Assertive Tanks*/
        tankChamps.add("Ornn"); //[3]
        tankChamps.add("Rell"); //[4]
        tankChamps.add("Poppy"); //[5]
        /* Passive Tanks*/
        tankChamps.add("Tahm Kench"); //[6]
        tankChamps.add("Nautilus"); //[7]
        tankChamps.add("Sion"); //[8]

        /* Aggressive Fighters*/
        fighterChamps.add("Aatrox"); //[0]
        fighterChamps.add("Renekton"); //[1]
        fighterChamps.add("Bel'Veth"); //[2]
        /* Assertive Fighters*/
        fighterChamps.add("Diana"); //[3]
        fighterChamps.add("Jarvan IV"); //[4]
        fighterChamps.add("Gragas"); //[5]
        /*Passive Fighters*/
        fighterChamps.add("Lillia"); //[6]
        fighterChamps.add("Singed"); //[7]
        fighterChamps.add("Yorick"); //[8]

        /* Aggressive All-in*/
        allInChamps.add("Kayn"); //[0]
        allInChamps.add("Zed"); //[1]
        allInChamps.add("Ahri"); //[2]
        /* Assertive All-in*/
        allInChamps.add("Cassiopeia"); //[3]
        allInChamps.add("Kassadin"); //[4]
        allInChamps.add("Naafiri"); //[5]
        /* Passive All-in*/
        allInChamps.add("Nidalee"); //[6]
        allInChamps.add("Lux"); //[7]
        allInChamps.add("Annie"); //[8]

        /* Aggressive Support*/
        supportChamps.add("Leona"); //[0]
        supportChamps.add("Thresh"); //[1]
        supportChamps.add("Blitzcrank"); //[2]
        /* Assertive Support*/
        supportChamps.add("Zyra"); //[3]
        supportChamps.add("Karma"); //[4]
        supportChamps.add("Seraphine"); //[5]
        /* Passive Support*/
        supportChamps.add("Soraka"); //[6]
        supportChamps.add("Sona"); //[7]
        supportChamps.add("Lulu"); //[8]

        /* Aggressive Adc*/
        marskmanChamps.add("Caitlyn"); //[0]
        marskmanChamps.add("Jinx"); //[1]
        marskmanChamps.add("Jhin"); //[2]
        /* Assertive Adc*/
        marskmanChamps.add("Kai'Sa"); //[3]
        marskmanChamps.add("Kalista"); //[4]
        marskmanChamps.add("Smolder"); //[5]
        /* Passive*/
        marskmanChamps.add("Ashe"); //[6]
        marskmanChamps.add("Senna"); //[7]
        marskmanChamps.add("Xayah"); //[8]

    }
    public static void setQuestions() {
        questions.add("I prefer to seek out my kills alone\n" +
                "1. Agree\n2. Neutral\n3. Disagree");
        questions.add("To be able to go into a fight and win quickly\n" +
                "1. Agree\n2. Neutral\n3. Disagree");
        questions.add("I want/like to be the center of attention/action\n" +
                "1. Agree\n2. Neutral\n3. Disagree");
        questions.add("Rather allies take dmg than take punches for them\n" +
                "1. Agree\n2. Neutral\n3. Disagree");
        questions.add("Deal the most amount of dmg\n" +
                "1. Agree\n2. Neutral\n3. Disagree");
        questions.add("Always looking for a fight\n" +
                "1. Agree\n2. Neutral\n3. Disagree");
        questions.add("Rather kill the enemy fast and furious like, rather than whittling them down over time\n" +
                "1. Agree\n2. Neutral\n3. Disagree");
        questions.add("Get kills rather than focusing on objectives\n" +
                "1. Agree\n2. Neutral\n3. Disagree");
        questions.add("No-one is safe from me, no matter what defenses they have\n" +
                "1. Agree\n2. Neutral\n3. Disagree");
        questions.add("Run off solo, or work as a team\n" +
                "1. Agree\n2. Neutral\n3. Disagree");

    }
    public void start(Stage stage) {
        buildGui(stage);
    }
    public void buildGui(Stage stage) {

        bp.setStyle("-fx-background-color: grey;");
        createButtons();
        createScene(stage);

    }
    public void createButtons() {
        ToggleGroup group = new ToggleGroup();
        Font font = Font.font("Times New Roman", 12);

        RadioButton topButton = new RadioButton("TOP");
        RadioButton jungleButton = new RadioButton("JUNGLE");
        RadioButton midButton = new RadioButton("MID");
        RadioButton adcButton = new RadioButton("ADC");
        RadioButton supportButton = new RadioButton("SUPPORT");
        topButton.setFont(font);
        jungleButton.setFont(font);
        midButton.setFont(font);
        adcButton.setFont(font);
        supportButton.setFont(font);

        topButton.setTextFill(Color.YELLOW);
        jungleButton.setTextFill(Color.YELLOW);
        midButton.setTextFill(Color.YELLOW);
        adcButton.setTextFill(Color.YELLOW);
        supportButton.setTextFill(Color.YELLOW);

        vBoxForButtons.setSpacing(50);
        group.getToggles().addAll(topButton, jungleButton, midButton, adcButton, supportButton);
        vBoxForButtons.getChildren().addAll(topButton, jungleButton, midButton, adcButton, supportButton);
        bp.setLeft(vBoxForButtons);
        vBoxForButtons.setPadding(new Insets(50, 10 ,0 ,0));

        topButton.setOnAction(e -> eventHandlerTop());
        jungleButton.setOnAction(e -> eventHandlerJungle());
        midButton.setOnAction(e -> eventHandlerMid());
        adcButton.setOnAction(e -> eventHandlerAdc());
        supportButton.setOnAction(e -> eventHandlerSupport());

    }
    public void createText() {
        HBox champTexts = new HBox();
        Font font = Font.font("Times New Roman", FontWeight.BOLD, 16);

        Text top = new Text("TOP");
        top.setFont(font);
        top.setUnderline(true);
        Text jungle = new Text("JUNGLE");
        jungle.setFont(font);
        jungle.setUnderline(true);
        Text mid = new Text("MID");
        mid.setFont(font);
        mid.setUnderline(true);
        Text adc = new Text("ADC");
        adc.setFont(font);
        adc.setUnderline(true);
        Text support = new Text("SUPPORT");
        support.setFont(font);
        support.setUnderline(true);

        champTexts.setSpacing(50);
        champTexts.getChildren().addAll(top, jungle, mid, adc, support);
        bp.setTop(champTexts);
        champTexts.setPadding(new Insets(0, 50, 50, 175));
    }
    public void createScene(Stage primaryStage) {
        Scene scene = new Scene(bp, 600, 800);
        primaryStage.setTitle("Select Champs");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
    public void eventHandlerTop() {

        if(aggressive > passive && aggressive > assertive) {
            aggressiveTopChamps();
        } else if(assertive > passive && assertive > aggressive) {
            assertiveTopChamps();
        } else {
            passiveTopChamps();
        }
    }
    public void eventHandlerJungle() {

        if(aggressive > passive && aggressive > assertive) {
            aggressiveJungleChamps();
        } else if(assertive > passive && assertive > aggressive) {
            assertiveJungleChamps();
        } else {
            passiveJungleChamps();
        }
    }
    public void eventHandlerMid() {
        if(aggressive > passive && aggressive > assertive) {
            aggressiveMidChamps();
        } else if(assertive > passive && assertive > aggressive) {
            assertiveMidChamps();
        } else {
            passiveMidChamps();
        }
    }
    public void eventHandlerAdc() {
        if(aggressive > passive && aggressive > assertive) {
            aggressiveAdcChamps();
        } else if(assertive > passive && assertive > aggressive) {
            assertiveAdcChamps();
        } else {
            passiveAdcChamps();
        }
    }
    public void eventHandlerSupport() {
        if(aggressive > passive && aggressive > assertive) {
            aggressiveSupportChamps();
        } else if(assertive > passive && assertive > aggressive) {
            assertiveSupportChamps();
        } else {
            passiveSupportChamps();
        }
    }
    public void aggressiveTopChamps() {
        Text champ1Text = new Text(fighterChamps.get(0));
        Text champ2Text = new Text(fighterChamps.get(1));
        Text champ3Text = new Text(tankChamps.get(1));

        champ1Text.setFont(font);
        champ2Text.setFont(font);
        champ3Text.setFont(font);

        File champ1File = new File("Aatrox.jpg");
        Image champ1Pic = new Image(String.valueOf(champ1File));
        ImageView champ1 = new ImageView(champ1Pic);
        champ1.setFitHeight(150);
        champ1.setFitWidth(150);
        File champ2File = new File("Renekton.jpg");
        Image champ2Pic = new Image(String.valueOf(champ2File));
        ImageView champ2 = new ImageView(champ2Pic);
        champ2.setFitHeight(150);
        champ2.setFitWidth(150);
        File champ3File = new File("K'Sante.jpg");
        Image champ3Pic = new Image(String.valueOf(champ3File));
        ImageView champ3 = new ImageView(champ3Pic);
        champ3.setFitHeight(150);
        champ3.setFitWidth(150);

        vBoxForChampPics.getChildren().clear();
        vBoxForChampPics.getChildren().addAll(champ1Text, champ1, champ2Text, champ2, champ3Text, champ3);
        vBoxForChampPics.setAlignment(Pos.TOP_CENTER);

        bp.setCenter(vBoxForChampPics);

    }
    public void aggressiveJungleChamps() {
        Text champ1Text = new Text(tankChamps.get(2));
        Text champ2Text = new Text(fighterChamps.get(2));
        Text champ3Text = new Text(allInChamps.get(0));

        champ1Text.setFont(font);
        champ2Text.setFont(font);
        champ3Text.setFont(font);

        File champ1File = new File("Skarner.jpg");
        Image champ1Pic = new Image(String.valueOf(champ1File));
        ImageView champ1 = new ImageView(champ1Pic);
        champ1.setFitHeight(150);
        champ1.setFitWidth(150);
        File champ2File = new File("Bel'Veth.jpg");
        Image champ2Pic = new Image(String.valueOf(champ2File));
        ImageView champ2 = new ImageView(champ2Pic);
        champ2.setFitHeight(150);
        champ2.setFitWidth(150);
        File champ3File = new File("Kayn.jpg");
        Image champ3Pic = new Image(String.valueOf(champ3File));
        ImageView champ3 = new ImageView(champ3Pic);
        champ3.setFitHeight(150);
        champ3.setFitWidth(150);

        vBoxForChampPics.getChildren().clear();
        vBoxForChampPics.getChildren().addAll(champ1Text, champ1, champ2Text, champ2, champ3Text, champ3);
        vBoxForChampPics.setAlignment(Pos.TOP_CENTER);

        bp.setCenter(vBoxForChampPics);

    }
    public void aggressiveMidChamps() {
        Text champ1Text = new Text(allInChamps.get(1));
        Text champ2Text = new Text(allInChamps.get(2));
        Text champ3Text = new Text(allInChamps.get(4));

        champ1Text.setFont(font);
        champ2Text.setFont(font);
        champ3Text.setFont(font);

        File champ1File = new File("Zed.jpg");
        Image champ1Pic = new Image(String.valueOf(champ1File));
        ImageView champ1 = new ImageView(champ1Pic);
        champ1.setFitHeight(150);
        champ1.setFitWidth(150);
        File champ2File = new File("Ahri.jpg");
        Image champ2Pic = new Image(String.valueOf(champ2File));
        ImageView champ2 = new ImageView(champ2Pic);
        champ2.setFitHeight(150);
        champ2.setFitWidth(150);
        File champ3File = new File("Kassadin.jpg");
        Image champ3Pic = new Image(String.valueOf(champ3File));
        ImageView champ3 = new ImageView(champ3Pic);
        champ3.setFitHeight(150);
        champ3.setFitWidth(150);

        vBoxForChampPics.getChildren().clear();
        vBoxForChampPics.getChildren().addAll(champ1Text, champ1, champ2Text, champ2, champ3Text, champ3);
        vBoxForChampPics.setAlignment(Pos.TOP_CENTER);

        bp.setCenter(vBoxForChampPics);

    }
    public void aggressiveAdcChamps() {
        Text champ1Text = new Text(marskmanChamps.get(0));
        Text champ2Text = new Text(marskmanChamps.get(1));
        Text champ3Text = new Text(marskmanChamps.get(2));

        champ1Text.setFont(font);
        champ2Text.setFont(font);
        champ3Text.setFont(font);

        File champ1File = new File("Caitlyn.jpg");
        Image champ1Pic = new Image(String.valueOf(champ1File));
        ImageView champ1 = new ImageView(champ1Pic);
        champ1.setFitHeight(150);
        champ1.setFitWidth(150);
        File champ2File = new File("Jinx.jpg");
        Image champ2Pic = new Image(String.valueOf(champ2File));
        ImageView champ2 = new ImageView(champ2Pic);
        champ2.setFitHeight(150);
        champ2.setFitWidth(150);
        File champ3File = new File("Jhin.jpg");
        Image champ3Pic = new Image(String.valueOf(champ3File));
        ImageView champ3 = new ImageView(champ3Pic);
        champ3.setFitHeight(150);
        champ3.setFitWidth(150);

        vBoxForChampPics.getChildren().clear();
        vBoxForChampPics.getChildren().addAll(champ1Text, champ1, champ2Text, champ2, champ3Text, champ3);
        vBoxForChampPics.setAlignment(Pos.TOP_CENTER);

        bp.setCenter(vBoxForChampPics);

    }
    public void aggressiveSupportChamps() {
        Text champ1Text = new Text(supportChamps.get(0));
        Text champ2Text = new Text(supportChamps.get(1));
        Text champ3Text = new Text(supportChamps.get(2));

        champ1Text.setFont(font);
        champ2Text.setFont(font);
        champ3Text.setFont(font);

        File champ1File = new File("Leona.jpg");
        Image champ1Pic = new Image(String.valueOf(champ1File));
        ImageView champ1 = new ImageView(champ1Pic);
        champ1.setFitHeight(150);
        champ1.setFitWidth(150);
        File champ2File = new File("Thresh.jpg");
        Image champ2Pic = new Image(String.valueOf(champ2File));
        ImageView champ2 = new ImageView(champ2Pic);
        champ2.setFitHeight(150);
        champ2.setFitWidth(150);
        File champ3File = new File("Blitzcrank.jpg");
        Image champ3Pic = new Image(String.valueOf(champ3File));
        ImageView champ3 = new ImageView(champ3Pic);
        champ3.setFitHeight(150);
        champ3.setFitWidth(150);

        vBoxForChampPics.getChildren().clear();
        vBoxForChampPics.getChildren().addAll(champ1Text, champ1, champ2Text, champ2, champ3Text, champ3);
        vBoxForChampPics.setAlignment(Pos.TOP_CENTER);

        bp.setCenter(vBoxForChampPics);

    }
    public void passiveTopChamps() {
        Text champ1Text = new Text(fighterChamps.get(7));
        Text champ2Text = new Text(fighterChamps.get(8));
        Text champ3Text = new Text(tankChamps.get(8));

        champ1Text.setFont(font);
        champ2Text.setFont(font);
        champ3Text.setFont(font);

        File champ1File = new File("Singed.jpg");
        Image champ1Pic = new Image(String.valueOf(champ1File));
        ImageView champ1 = new ImageView(champ1Pic);
        champ1.setFitHeight(150);
        champ1.setFitWidth(150);
        File champ2File = new File("Yorick.jpg");
        Image champ2Pic = new Image(String.valueOf(champ2File));
        ImageView champ2 = new ImageView(champ2Pic);
        champ2.setFitHeight(150);
        champ2.setFitWidth(150);
        File champ3File = new File("Sion.jpg");
        Image champ3Pic = new Image(String.valueOf(champ3File));
        ImageView champ3 = new ImageView(champ3Pic);
        champ3.setFitHeight(150);
        champ3.setFitWidth(150);

        vBoxForChampPics.getChildren().clear();
        vBoxForChampPics.getChildren().addAll(champ1Text, champ1, champ2Text, champ2, champ3Text, champ3);
        vBoxForChampPics.setAlignment(Pos.TOP_CENTER);

        bp.setCenter(vBoxForChampPics);

    }
    public void passiveJungleChamps() {
        Text champ1Text = new Text(allInChamps.get(6));
        Text champ2Text = new Text(fighterChamps.get(6));
        Text champ3Text = new Text(tankChamps.get(6));

        champ1Text.setFont(font);
        champ2Text.setFont(font);
        champ3Text.setFont(font);

        File champ1File = new File("Nidalee.jpg");
        Image champ1Pic = new Image(String.valueOf(champ1File));
        ImageView champ1 = new ImageView(champ1Pic);
        champ1.setFitHeight(150);
        champ1.setFitWidth(150);
        File champ2File = new File("Lillia.jpg");
        Image champ2Pic = new Image(String.valueOf(champ2File));
        ImageView champ2 = new ImageView(champ2Pic);
        champ2.setFitHeight(150);
        champ2.setFitWidth(150);
        File champ3File = new File("Tahm Kench.jpg");
        Image champ3Pic = new Image(String.valueOf(champ3File));
        ImageView champ3 = new ImageView(champ3Pic);
        champ3.setFitHeight(150);
        champ3.setFitWidth(150);

        vBoxForChampPics.getChildren().clear();
        vBoxForChampPics.getChildren().addAll(champ1Text, champ1, champ2Text, champ2, champ3Text, champ3);
        vBoxForChampPics.setAlignment(Pos.TOP_CENTER);

        bp.setCenter(vBoxForChampPics);

    }
    public void passiveMidChamps() {
        Text champ1Text = new Text(allInChamps.get(7));
        Text champ2Text = new Text(allInChamps.get(8));
        Text champ3Text = new Text(allInChamps.get(5));

        champ1Text.setFont(font);
        champ2Text.setFont(font);
        champ3Text.setFont(font);

        File champ1File = new File("Lux.jpg");
        Image champ1Pic = new Image(String.valueOf(champ1File));
        ImageView champ1 = new ImageView(champ1Pic);
        champ1.setFitHeight(150);
        champ1.setFitWidth(100);
        File champ2File = new File("Annie.jpg");
        Image champ2Pic = new Image(String.valueOf(champ2File));
        ImageView champ2 = new ImageView(champ2Pic);
        champ2.setFitHeight(150);
        champ2.setFitWidth(100);
        File champ3File = new File("Naafiri.jpg");
        Image champ3Pic = new Image(String.valueOf(champ3File));
        ImageView champ3 = new ImageView(champ3Pic);
        champ3.setFitHeight(150);
        champ3.setFitWidth(100);

        vBoxForChampPics.getChildren().clear();
        vBoxForChampPics.getChildren().addAll(champ1Text, champ1, champ2Text, champ2, champ3Text, champ3);
        vBoxForChampPics.setAlignment(Pos.TOP_CENTER);

        bp.setCenter(vBoxForChampPics);

    }
    public void passiveAdcChamps() {
        Text champ1Text = new Text(allInChamps.get(7));
        Text champ2Text = new Text(allInChamps.get(8));
        Text champ3Text = new Text(allInChamps.get(5));

        champ1Text.setFont(font);
        champ2Text.setFont(font);
        champ3Text.setFont(font);

        File champ1File = new File("Ashe.jpg");
        Image champ1Pic = new Image(String.valueOf(champ1File));
        ImageView champ1 = new ImageView(champ1Pic);
        champ1.setFitHeight(150);
        champ1.setFitWidth(150);
        File champ2File = new File("Senna.jpg");
        Image champ2Pic = new Image(String.valueOf(champ2File));
        ImageView champ2 = new ImageView(champ2Pic);
        champ2.setFitHeight(150);
        champ2.setFitWidth(150);
        File champ3File = new File("Xayah.jpg");
        Image champ3Pic = new Image(String.valueOf(champ3File));
        ImageView champ3 = new ImageView(champ3Pic);
        champ3.setFitHeight(150);
        champ3.setFitWidth(150);

        vBoxForChampPics.getChildren().clear();
        vBoxForChampPics.getChildren().addAll(champ1Text, champ1, champ2Text, champ2, champ3Text, champ3);
        vBoxForChampPics.setAlignment(Pos.TOP_CENTER);

        bp.setCenter(vBoxForChampPics);

    }
    public void passiveSupportChamps() {
        Text champ1Text = new Text(supportChamps.get(6));
        Text champ2Text = new Text(supportChamps.get(7));
        Text champ3Text = new Text(supportChamps.get(8));

        champ1Text.setFont(font);
        champ2Text.setFont(font);
        champ3Text.setFont(font);

        File champ1File = new File("Soraka.jpg");
        Image champ1Pic = new Image(String.valueOf(champ1File));
        ImageView champ1 = new ImageView(champ1Pic);
        champ1.setFitHeight(150);
        champ1.setFitWidth(150);
        File champ2File = new File("Sona.jpg");
        Image champ2Pic = new Image(String.valueOf(champ2File));
        ImageView champ2 = new ImageView(champ2Pic);
        champ2.setFitHeight(150);
        champ2.setFitWidth(150);
        File champ3File = new File("Lulu.jpg");
        Image champ3Pic = new Image(String.valueOf(champ3File));
        ImageView champ3 = new ImageView(champ3Pic);
        champ3.setFitHeight(150);
        champ3.setFitWidth(150);

        vBoxForChampPics.getChildren().clear();
        vBoxForChampPics.getChildren().addAll(champ1Text, champ1, champ2Text, champ2, champ3Text, champ3);
        vBoxForChampPics.setAlignment(Pos.TOP_CENTER);

        bp.setCenter(vBoxForChampPics);

    }
    public void assertiveTopChamps() {
        Text champ1Text = new Text(tankChamps.get(3));
        Text champ2Text = new Text(tankChamps.get(5));
        Text champ3Text = new Text(fighterChamps.get(3));

        champ1Text.setFont(font);
        champ2Text.setFont(font);
        champ3Text.setFont(font);

        File champ1File = new File("Ornn.jpg");
        Image champ1Pic = new Image(String.valueOf(champ1File));
        ImageView champ1 = new ImageView(champ1Pic);
        champ1.setFitHeight(150);
        champ1.setFitWidth(150);
        File champ2File = new File("Poppy.jpg");
        Image champ2Pic = new Image(String.valueOf(champ2File));
        ImageView champ2 = new ImageView(champ2Pic);
        champ2.setFitHeight(150);
        champ2.setFitWidth(150);
        File champ3File = new File("Diana.jpg");
        Image champ3Pic = new Image(String.valueOf(champ3File));
        ImageView champ3 = new ImageView(champ3Pic);
        champ3.setFitHeight(150);
        champ3.setFitWidth(150);

        vBoxForChampPics.getChildren().clear();
        vBoxForChampPics.getChildren().addAll(champ1Text, champ1, champ2Text, champ2, champ3Text, champ3);
        vBoxForChampPics.setAlignment(Pos.TOP_CENTER);

        bp.setCenter(vBoxForChampPics);

    }
    public void assertiveJungleChamps() {
        Text champ1Text = new Text(fighterChamps.get(3));
        Text champ2Text = new Text(fighterChamps.get(4));
        Text champ3Text = new Text(fighterChamps.get(5));

        champ1Text.setFont(font);
        champ2Text.setFont(font);
        champ3Text.setFont(font);

        File champ1File = new File("Diana.jpg");
        Image champ1Pic = new Image(String.valueOf(champ1File));
        ImageView champ1 = new ImageView(champ1Pic);
        champ1.setFitHeight(150);
        champ1.setFitWidth(150);
        File champ2File = new File("Jarvan IV.jpg");
        Image champ2Pic = new Image(String.valueOf(champ2File));
        ImageView champ2 = new ImageView(champ2Pic);
        champ2.setFitHeight(150);
        champ2.setFitWidth(150);
        File champ3File = new File("Gragas.jpg");
        Image champ3Pic = new Image(String.valueOf(champ3File));
        ImageView champ3 = new ImageView(champ3Pic);
        champ3.setFitHeight(150);
        champ3.setFitWidth(150);

        vBoxForChampPics.getChildren().clear();
        vBoxForChampPics.getChildren().addAll(champ1Text, champ1, champ2Text, champ2, champ3Text, champ3);
        vBoxForChampPics.setAlignment(Pos.TOP_CENTER);

        bp.setCenter(vBoxForChampPics);

    }
    public void assertiveMidChamps() {
        Text champ1Text = new Text(allInChamps.get(3));
        Text champ2Text = new Text(allInChamps.get(4));
        Text champ3Text = new Text(supportChamps.get(4));

        champ1Text.setFont(font);
        champ2Text.setFont(font);
        champ3Text.setFont(font);

        File champ1File = new File("Cassiopeia.jpg");
        Image champ1Pic = new Image(String.valueOf(champ1File));
        ImageView champ1 = new ImageView(champ1Pic);
        champ1.setFitHeight(150);
        champ1.setFitWidth(150);
        File champ2File = new File("Kassadin.jpg");
        Image champ2Pic = new Image(String.valueOf(champ2File));
        ImageView champ2 = new ImageView(champ2Pic);
        champ2.setFitHeight(150);
        champ2.setFitWidth(150);
        File champ3File = new File("Karma.jpg");
        Image champ3Pic = new Image(String.valueOf(champ3File));
        ImageView champ3 = new ImageView(champ3Pic);
        champ3.setFitHeight(150);
        champ3.setFitWidth(150);

        vBoxForChampPics.getChildren().clear();
        vBoxForChampPics.getChildren().addAll(champ1Text, champ1, champ2Text, champ2, champ3Text, champ3);
        vBoxForChampPics.setAlignment(Pos.TOP_CENTER);

        bp.setCenter(vBoxForChampPics);

    }
    public void assertiveAdcChamps() {
        Text champ1Text = new Text(marskmanChamps.get(3));
        Text champ2Text = new Text(marskmanChamps.get(4));
        Text champ3Text = new Text(marskmanChamps.get(5));

        champ1Text.setFont(font);
        champ2Text.setFont(font);
        champ3Text.setFont(font);

        File champ1File = new File("Kai'Sa.jpg");
        Image champ1Pic = new Image(String.valueOf(champ1File));
        ImageView champ1 = new ImageView(champ1Pic);
        champ1.setFitHeight(150);
        champ1.setFitWidth(150);
        File champ2File = new File("Kalista.jpg");
        Image champ2Pic = new Image(String.valueOf(champ2File));
        ImageView champ2 = new ImageView(champ2Pic);
        champ2.setFitHeight(150);
        champ2.setFitWidth(150);
        File champ3File = new File("Smolder.jpg");
        Image champ3Pic = new Image(String.valueOf(champ3File));
        ImageView champ3 = new ImageView(champ3Pic);
        champ3.setFitHeight(150);
        champ3.setFitWidth(150);

        vBoxForChampPics.getChildren().clear();
        vBoxForChampPics.getChildren().addAll(champ1Text, champ1, champ2Text, champ2, champ3Text, champ3);
        vBoxForChampPics.setAlignment(Pos.TOP_CENTER);

        bp.setCenter(vBoxForChampPics);

    }
    public void assertiveSupportChamps() {
        Text champ1Text = new Text(tankChamps.get(4));
        Text champ2Text = new Text(supportChamps.get(3));
        Text champ3Text = new Text(supportChamps.get(5));

        champ1Text.setFont(font);
        champ2Text.setFont(font);
        champ3Text.setFont(font);

        File champ1File = new File("Rell.jpg");
        Image champ1Pic = new Image(String.valueOf(champ1File));
        ImageView champ1 = new ImageView(champ1Pic);
        champ1.setFitHeight(150);
        champ1.setFitWidth(150);
        File champ2File = new File("Zyra.jpg");
        Image champ2Pic = new Image(String.valueOf(champ2File));
        ImageView champ2 = new ImageView(champ2Pic);
        champ2.setFitHeight(150);
        champ2.setFitWidth(150);
        File champ3File = new File("Seraphine.jpg");
        Image champ3Pic = new Image(String.valueOf(champ3File));
        ImageView champ3 = new ImageView(champ3Pic);
        champ3.setFitHeight(150);
        champ3.setFitWidth(150);


        vBoxForChampPics.getChildren().clear();
        vBoxForChampPics.getChildren().addAll(champ1Text, champ1, champ2Text, champ2, champ3Text, champ3);
        vBoxForChampPics.setAlignment(Pos.TOP_CENTER);

        bp.setCenter(vBoxForChampPics);

    }
}