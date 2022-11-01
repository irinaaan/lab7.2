import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        SushiShop japaneseSushiShop = new JapaneseSushiShop();
        SushiShop koreanSushiShop = new KoreanSushiShop();

        System.out.println("Choose what you want: ");
        for (SushiType ct: SushiType.values()) { //menu
            System.out.println(ct);
        }

        int choice = in.nextInt(); //sushi choice
        while(choice < 1 || choice > 5) { //checking for valid input
            System.out.println("You entered incorrectly. Try again");
            choice = in.nextInt();
        }

        System.out.println("Japanese or Korean?(1-jap, 2-kor)");
        int style = in.nextInt(); //style choice
        while(style < 1 || style > 2) { //checking for valid input
            System.out.println("You entered incorrectly. Try again");
            style = in.nextInt();
        }

        if(style == 1) { //for Japanese sushi

            switch (choice) {
                case 1:
                    japaneseSushiShop.orderSushi(SushiType.NIGIRI);
                    break;

                case 2:
                    japaneseSushiShop.orderSushi(SushiType.MAKI);
                    break;

                case 3:
                    japaneseSushiShop.orderSushi(SushiType.URAMAKI);
                    break;

                case 4:
                    japaneseSushiShop.orderSushi(SushiType.SASHIMI);
                    break;

                case 5:
                    japaneseSushiShop.orderSushi(SushiType.TEMAKI);
                    break;
            }
        }

        if (style == 2) { //for Spanish coffee

            switch (choice) {
                case 1:
                    koreanSushiShop.orderSushi(SushiType.NIGIRI);
                    break;

                case 2:
                    koreanSushiShop.orderSushi(SushiType.MAKI);
                    break;

                case 3:
                    koreanSushiShop.orderSushi(SushiType.URAMAKI);
                    break;

                case 4:
                    koreanSushiShop.orderSushi(SushiType.SASHIMI);
                    break;

                case 5:
                    koreanSushiShop.orderSushi(SushiType.TEMAKI);
                    break;
            }
        }
    }
}