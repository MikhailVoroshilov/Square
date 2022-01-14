package netology.automation.java.square;

public class Main {
    public static void main(String[] args) {
        Square service = new Square();
        int downBorder = 200;
        int upBorder = 400;

        service.payment(downBorder, upBorder);
    }

}
