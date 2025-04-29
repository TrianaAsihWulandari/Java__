package day01;

public class iteration {
    public static void main(String[] args) throws InterruptedException {
        drawHorizontal(5);
        System.out.println();
        drawVertical(5);
        System.out.println();

        drawBox(5);
    }

    public static void drawBox(int n) throws InterruptedException {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                Thread.sleep(100);
                System.out.print(" * ");

            }
            System.out.println();

        }
    }

    public static void drawHorizontal(int n){
        for (int i = 0; i < n; i++) {
            System.out.print(" * ");
        }
    }

    public static void drawVertical(int n){
        for (int i = 0; i < n; i++) {
            System.out.print(" *  ");
        }
    }


}
