public class Logic {
    public static void method1(char letter) {
        if (letter == 'а') {
            System.out.println("буква '" + letter + "' гласная");
        } else if (letter == 'о') {
            System.out.println("буква '" + letter + "' гласная");
        } else if (letter == 'и') {
            System.out.println("буква '" + letter + "' гласная");
        } else if (letter == 'е') {
            System.out.println("буква '" + letter + "' гласная");
        } else if (letter == 'ё') {
            System.out.println("буква '" + letter + "' гласная");
        } else if (letter == 'э') {
            System.out.println("буква '" + letter + "' гласная");
        } else if (letter == 'ы') {
            System.out.println("буква '" + letter + "' гласная");
        } else if (letter == 'у') {
            System.out.println("буква '" + letter + "' гласная");
        } else if (letter == 'ю') {
            System.out.println("буква '" + letter + "' гласная");
        } else if (letter == 'я') {
            System.out.println("буква '" + letter + "' гласная");
        } else {
            System.out.println("символ '" + letter + "' не является гласной буквой");
        }
    }

    public static void method2(char letter) {
        switch (letter) {
            case 'а':
            case 'о':
            case 'и':
            case 'е':
            case 'э':
            case 'ы':
            case 'у':
            case 'ю':
            case 'я':
            case 'ё': {
                System.out.println("Буква '" + letter + "' гласная");
            }
            break;
            default: {
                System.out.println("Символ '" + letter + "' не является гласной буквой");
            }
        }

    }

    public static void method3(char letter) {
        char[] vowels = {'а', 'о', 'и', 'е', 'ё', 'э', 'ы', 'у', 'ю', 'я'};
        boolean isVowel = false;
        for (char c : vowels) {
            if (letter == c) {
                isVowel = true;
            }
        }
        if (isVowel) {
            System.out.println("Буква '" + letter + "' гласная");
        } else {
            System.out.println("Символ '" + letter + "' не является гласной буквой");
        }
    }

    public static void method4(char letter) {
        String str = String.valueOf(letter);
        String vowel = "аоиеёэыуюя";
        if (vowel.contains(str)) {
            System.out.println("Буква '" + letter + "' гласная");
        } else {
            System.out.println("Символ '" + letter + "' не является гласной буквой");
        }
    }


}



