package Week_01;

public class task_1 {

    // вывод в консоль латинского алфафита
    public static void printAlphabet() {
        char[] alphabet = new char[26];
        for (int i = 0; i < alphabet.length; i++) {
            alphabet[i] = (char) (i + 65); // генерируем алфавит по коду ASCII
            System.out.print(alphabet[i]);
        }
    }

    public static void main(String[] args) {
        printAlphabet();
    }
}
