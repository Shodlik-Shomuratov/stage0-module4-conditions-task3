package school.mjc.stage0.conditions.task3;

public class IsEnglishSymbolDeterminer {
    public void isEnglishSymbol(char symbol) {
        int asciiCode = (int) symbol;

        if (asciiCode > 64 && asciiCode < 91 || asciiCode > 96 && asciiCode < 123) {
            System.out.println("English");
        } else {
            System.out.println("Non English");
        }
    }
}
