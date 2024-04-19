import java.io.File;

public class Main {

    public static void main(String[] args){
        String sing = Find_the_Sign.localDate();
        if (sing != null ){
            displayZodiacSignPicture(sing);
        }

    }

    public static void displayZodiacSignPicture(String sign) {
        String folderPath = "C:/ZodiacPictures";
        String filePath = folderPath + "/" + sign + ".jpg";
        File file = new File(filePath);

        if (file.exists()) {
            System.out.println("Displaying picture for " + sign);
            // Add code to display the picture
        } else {
            System.out.println("No picture found for " + sign);
        }
    }
}
