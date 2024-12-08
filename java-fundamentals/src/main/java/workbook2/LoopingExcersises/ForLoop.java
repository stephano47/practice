package workbook2.LoopingExcersises;

public class ForLoop {
    public static void main(String[] args) throws InterruptedException  { // InterruptedException allows a delay in the console print
        for (int i = 10; i>=0; i--) {
            System.out.println(i);
            Thread.sleep(1000);
        }
        System.out.println("Launch!");
    }
}
