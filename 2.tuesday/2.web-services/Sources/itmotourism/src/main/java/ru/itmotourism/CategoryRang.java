package ru.itmotourism;

public class CategoryRang {
    public static int getCategoryRang(String category){
        int i;
        switch (category){
            case "3-й юношеский разряд": i = 1; break;
            case "2-й юношеский разряд": i = 2; break;
            case "1-й юношеский разряд": i = 3; break;
            case "3-й спортивный разряд": i = 4; break;
            case "2-й спортивный разряд": i = 5; break;
            case "1-й спортивный разряд": i = 6; break;
            case "Кандидат в мастера спорта": i = 7; break;
            case "Мастер спорта": i = 8; break;
            case "Мастер спорта международного класса": i = 9; break;
            default: i = 0; break;
        }
return i;
    }
}
