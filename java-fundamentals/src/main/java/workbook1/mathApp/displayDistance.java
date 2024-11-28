package workbook1.mathApp;

public class displayDistance {
    public static void main(String[] args){

        int x1 = 5, y1 = 10;
        int x2 = 85, y2 = 50;
        int xDiff = x2 - x1;
        int yDiff = y2 - y1;
        double distance = Math.sqrt((xDiff * xDiff) + (yDiff * yDiff));
        System.out.printf("The distance between the points (%d, %d) and (%d, %d) is %.2f%n",
                x1, y1, x2, y2, distance);
    }
}
