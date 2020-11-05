package testOther;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ScreenShot {
    public static void main(String[] args) throws Exception {

        System.out.println("Кофе-машина");

        //TODO: read value from console
        Scanner in = new Scanner(System.in);
        System.out.print("Сколько у вас денег? ");
        int moneyAmount = in.nextInt();
        //System.out.println("У вас "+ moneyAmount + ". ");
        in.close();

        int[] drinkPrices = {150, 80, 20, 50};
        String[] drinkNames = {"капучино", "эспрессо", "воду", "молоко"};

        //TODO: add canBuyAnything boolean
        //  and make it working
        boolean canBuyAnything = false;
        for (int i = 0; i < drinkPrices.length; i++) {
            if (moneyAmount >= drinkPrices[i]) {
                if (!canBuyAnything) {
                    System.out.print("Вы можете купить: " +
                            drinkNames[i]);
                } else {
                    System.out.print(", " +
                            drinkNames[i]);
                }

                canBuyAnything = true;
            }
        }
        if (canBuyAnything == false) {
            System.out.println("Извените, необходимо больше денег. Идите учить JAVA )))");
        } else {
            System.out.println();
        }

        //TODO: 20201105_204644
        SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd_HHmmss");
        Date now = new Date();
        System.out.println(formatter.format(now));

        //TODO: get screenshot to BufferedImage
        Robot robot = new Robot();
        Rectangle area = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
        BufferedImage image = robot.createScreenCapture(area);
        System.out.println(image.getWidth() + "x" + image.getHeight());

        //TODO: code and result screenshots
        //  send to Telegram-chat with #ilovejava
    }
}
