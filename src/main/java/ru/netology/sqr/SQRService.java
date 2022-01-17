package ru.netology.sqr;

public class SQRService {
    public long numberSquare(long downBorder, long upBorder) {
        int count = 0;

        for (int i = 10; i <= 99; i++) {
            if (i * i >= downBorder && i * i <= upBorder) {
                count++;
            }
        }
        return count;
    }
}
