package by.yandex.sidvlada;

public class Main {

    public static void main(String[] args)
    {

        String string = "Мир потихоньку сходит с ума";
        string = string.trim().replaceAll("  ", " ");

        int space = 0;
        char symbol;
        int count = 0;

        for (int i=0; i<string.length(); i++) {
            symbol = string.charAt(i);
            if (symbol == ' ') {
                space++;
            }
            count = space + 1;
        }
        System.out.println("В этом предложении " + count + " слов.");
    }
}
