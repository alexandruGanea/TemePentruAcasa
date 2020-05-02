import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // E1. Write a Java program to find the smallest number among three numbers.
        System.out.println("E1. Aflati cel mai mic numar dintre cele date ");
        int[] checkValues = inputThreeNumbers();
        smallestNumber(checkValues);
        System.out.println("\n");

        // E02. Write a Java program that takes three numbers as input to calculate and print the average of the numbers.
        System.out.println("E2. Calculati media aritmetica a 3 numere date.");
        int[] average = inputThreeNumbers();
        averageNumbers(average);
        System.out.println("\n");

        // E03. Write a Java program to display the middle character of a string
        System.out.println("E3. Arata caracterul din mijlocul String-ului.");
        String text = inputText();
        middleOfString(text);
        System.out.println("\n");

        // E04. Write a Java program to count all words in a string.
        System.out.println("E4. Numararea tuturor cuvintelor dintr-un String.");
        String text2 = inputText();
        int counter = wordCount(text2);
        System.out.println("Numarul total de cuvinte din String este: " + counter);
        System.out.println("\n");

        // E05. Write a Java program to print characters between two characters (i.e. A to P ) from a text
        System.out.println("E5. Printarea caracterelor intre doua caractere (intre A si P) din text.");
        String text3 = inputText();
        extractText(text3);
        System.out.println("\n");

        // E06. Write a Java program start with an integer n, divide n by 2 if n is even or multiply by 3 and
        // add 1 if n is odd, repeat the process until n = 1.
        System.out.println("E6. Write a Java program start with an integer n, divide n by 2 if n is even or multiply " +
                "by 3 and add 1 if n is odd, repeat the process until n = 1.");
        int n1 = inputOneNumber();
        int result1 = integerOperations(n1);
        System.out.println("\n");

        // E07. Write a Java program to test if an array of integers contains an element 10 next to 10 or an element 20 next to 20
        System.out.println("E7. Test daca array-ul dat contine elemente de 10 langa 10, sau 20 langa 20");
        int[] array1 = {1, 2, 3, 5, 10, 10, 20, 15, 20, 20, 34, 60, 1};
        printArray(array1);
        checkArray(array1, 10, 20);
        System.out.println("\n");

        // E08. Write a Java program to find the numbers greater than the average of the numbers of a given array.
        System.out.println("E8. Write a Java program to find the numbers greater than the average of the numbers of a given array.");
        int[] array2 = {54, 56, 83, 456, 234, 674, 652, 686, 331, 767, 454, 8886, 2345};
        printArray(array2);
        int arrayAverage = arrayAverage(array2);
        System.out.println("Media elementelor din Array este: " + arrayAverage);
        checkArray2(array2, arrayAverage);
        System.out.println("\n");

        // E09. Write a Java program to check if the value 20 appears three times in an array
        System.out.println("E9. Write a Java program to check if the value 20 appears three times in an array");
        int[] array3 = {52, 45, 20, 456, 34, 21, 20, 34, 211, 28, 20, 34, 26};
        printArray(array3);
        checkArrayFor(array3, 20, 3);
        System.out.println("\n");

        // E10. Write a Java program to add all the digits of a given positive integer until the result has a single digit.
        System.out.println("E10. Adunarea cifrelor dintr-un numar pana obtinem un numar de o cifra ");
        int n2 = inputOneNumber();
        int result2 = addIntDigits(n2);
        System.out.println("Suma finala este: " + result2);
        System.out.println("\n");

        // E11. Write a Java program to check if a positive number is a palindrome or not.
        System.out.println("E11. Test daca numarul introdus este palindrom.");
        int n3 = inputOneNumber();
        checkPalindrome(n3);
        System.out.println("\n");

        // E12. Write a Java program to check if a string is a palindrome or not
        System.out.print("E12. Test daca String-ul introdus este palindrom.\nIntroduceti un String sau apasati litera" +
                "\"d\" pentru un String default: ");
        Scanner s3 = new Scanner(System.in);
        String testPal = s3.nextLine();
        if (testPal.equals("d")) {
            testPal = "Was it a car or a cat I saw";
        }
        stringPalindrome(testPal);
        System.out.println("\n");

        // E13. Write a Java program to compute the sum of first n given prime numbers.
        System.out.println("E13. Suma primelor N numere prime");
        System.out.print("Introduceti valoarea lui \"N\": ");
        Scanner valueOfN = new Scanner(System.in);
        int inputNumber = valueOfN.nextInt();
        System.out.println("\nSuma primelor " + inputNumber + " numere prime este: " + sumOfPrimes(inputNumber));
        System.out.println("\n");

        // E14. Write a Java program to find the find the word from the middle of a given string. 
        System.out.println("E14. Gasirea cuvantului din mijlocul String-ului");
        String text4 = inputText();
        stringMiddle(text4);
        System.out.println("\n");

        // E15. Write a Java program to print the characters on positions that are multiple of 5 BUT NOT multiple of 10.
        System.out.println("E15. Tiparirea caracterelor din pozitiile multiple de 5 dar nu de 10 din String");
        String text5 = inputText();
        charAtPositions(text5);
        System.out.println("\n");

        // E16. Write a Java program to read a string and if the first or last characters are ’s’ or ’e’, return the
        // string without the words from odd positions.
        System.out.println("E16. Eliminarea cuvintelor din pozitiile pare daca primul sau ultimul caracter din string este \"s\", respectiv \"e\'.");
        String text6 = inputText();
        removeOddWords(text6);
        System.out.println("\n");

        // E17. Write a Java program to count the number of words that have more than 2 vowels
        System.out.println("E17. Numararea cuvintelor care au mai mult de doua vocale");
        String text7 = inputText();
        checkForVowels(text7);
        System.out.println("\n");

        // E18. Write a Java program to count all “,” and spaces in a text
        System.out.println("E18. Numarearea virgulelor si spatiilor dintr-un text");
        String text8 = inputText();
        int count = countSpaces(text8);
        System.out.println("E18. Numarul total de spatii si virgule din String-ul dat este: " + count);
        System.out.println("\n");

        // E19. Write a Java program to replace all spaces from a string with “;” if the space is on an even position
        // and with “|” if the space is on an odd position from a given string.
        System.out.println("E19. Inlocuirea spatiilor cu \";\', respectiv \"|\" daca acestea sunt pe pozitii pare, respectiv impare ");
        String text9 = inputText();
        replaceSpaces(text9);
        System.out.println("\n");

    }

    // M0a - Strings for exercises
    public static String inputText() {
        String text;
        System.out.print("Introduceti un String sau apasati o cifra de la 1 la 9 ptr un String predefinit: ");
        Scanner s = new Scanner(System.in);
        String checkInput = s.nextLine();
        switch (checkInput) {
            case "1":
                text = "Amidst the continuing coronavirus pandemic, Gantz instead opted to put himself forward as " +
                        "interim Speaker of the Knesset while continuing \nnegotiations to form a coalition government " +
                        "with Benjamin Netanyahu's Likud and other parties.";
                break;
            case "2":
                text = "Joan of Acre (April 1272 – 23 April 1307) was an English princess, a daughter of King Edward I " +
                        "of England and Queen Eleanor of Castile. \nThe name \"Acre\" derives from her birthplace in the Holy " +
                        "Land while her parents were on a crusade.";
                break;
            case "3":
                text = "However, it is not yet clear whether this is because young people are actually less likely to " +
                        "be infected, or less likely to develop serious symptoms, \nand thus seek medical attention and be tested.";
                break;
            case "4":
                text = "Analysis by age in China indicates that a relatively low proportion of cases occur in " +
                        "individuals under 20 years of age.";
                break;
            case "5":
                text = "A natural number (1, 2, 3, 4, 5, 6, etc.) is called a prime number (or a prime) if it is greater" +
                        " than 1 and cannot be written as the product of two smaller natural numbers.";
                break;
            case "6":
                text = "In many historical societies including ancient Christian, Jewish, and many modern Islamic " +
                        "societies, usury meant the charging of interest \nof any kind and was considered wrong, or was made " +
                        "illegal.";
                break;
            case "7":
                text = "But I must explain to you how all this mistaken idea of denouncing pleasure and praising pain was" +
                        " born and I will give you a complete account of the\nsystem, and expound the actual teachings of the great" +
                        " explorer of the truth, the master-builder of human happiness.";
                break;
            case "8":
                text = "Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium," +
                        " totam rem aperiam, eaque ipsa quae ab illo inventore\nveritatis et quasi architecto beatae vitae dicta " +
                        "sunt explicabo.";
                break;
            case "9":
                text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut " +
                        "labore et dolore magna aliqua.";
                break;
            default:
                text = checkInput;
        }
        System.out.println("String-ul ales: " + text);
        return text;
    }

    // M0b - Input 3 numbers for exercises that require them.
    public static int[] inputThreeNumbers() {
        Scanner inputNumbers = new Scanner(System.in);
        int[] numbersArray = new int[3];
        String[] stringArray = {"primul", "al doilea", "al treilea"};
        int p = 0;
        while (p < 3) {
            System.out.print("Introduceti " + stringArray[p] + " numar: ");
            numbersArray[p] = inputNumbers.nextInt();
            p++;
        }
        return numbersArray;
    }

    // M0c - Input 1 number for exercises that require it.
    public static int inputOneNumber() {
        Scanner inputNmbr = new Scanner(System.in);
        System.out.print("Introduceti un numar intreg: ");
        int input = inputNmbr.nextInt();
        return input;
    }

    // M0d - print an array
    public static void printArray(int[] givenArray) {
        System.out.print("Array-ul dat este: " + "{ ");
        for (int p = 0; p < givenArray.length; p++) {
            System.out.print(givenArray[p] + " ");
        }
        System.out.println("}");
    }


    // M1
    public static void smallestNumber(int[] numbersArray) {
        int min = 0;
        if (numbersArray[0] < numbersArray[1]) {
            min = numbersArray[0];
        } else {
            min = numbersArray[1];
        }
        if (numbersArray[2] < min) {
            min = numbersArray[2];
            System.out.println("E01. Cel mai mic numar dintre cele 3 este: " + min);
        } else {
            System.out.println("E01. Cel mai mic numar dintre cele 3 este: " + min);
        }

    }

    //M2a
    public static int[] threeMoreNumbers(Scanner s) {
        int[] numbersArray = new int[3];
        System.out.print("Introduceti numerele: ");
        int p = 0;
        while (p < 3) {
            numbersArray[p] = s.nextInt();
            p++;
            s.reset();
        }
        return numbersArray;

    }

    // M2b
    public static void averageNumbers(int[] numbersArray) {

        int average = (numbersArray[0] + numbersArray[1] + numbersArray[2]) / 3;
        System.out.println("Media aritmetica a celor 3 numere este: " + average);
    }

    // M3
    public static void middleOfString(String text1) {
        System.out.println("Lungimea String-ului este de " + text1.length() + " caractere.");
        int firstCharPos = 0;
        int lastCharPos = text1.length();
        int midCharPos = 0;
        int midCharPos2 = 0;
        if (text1.length() % 2 == 0) {
            midCharPos = (firstCharPos + lastCharPos) / 2;
            char middleChar = text1.charAt(midCharPos);
            System.out.println("E03. Caracterul din pozitia de mijloc a String-ului este: " + middleChar);
        } else {
            midCharPos = ((firstCharPos + lastCharPos) / 2) - 1;
            midCharPos2 = (firstCharPos + lastCharPos) / 2;
            char middleChar = text1.charAt(midCharPos);
            char middleChar2 = text1.charAt(midCharPos2);
            System.out.println("E03. Caracterele din pozitia de mijloc a String-ului sunt: " + middleChar + middleChar2);
        }

    }

    // M4
    public static int wordCount(String text2) {
        String[] textArray = text2.split(" ");
        int counter = 0;
        for (int cursor = 0; cursor < textArray.length; cursor++) {
            counter++;
        }
        return counter;
    }

    // M05
    public static void extractText(String text3) {
        if (text3.contains("a") && text3.contains("p")) {
            text3.replace("A", "a");
            text3.replace("P", "p");
            int a = text3.indexOf("a") + 1;
            int p = text3.lastIndexOf("p") - 1;
            String extractedText = text3.substring(a, p);
            System.out.println("Substring-ul dintre primul \"a\" si ultimul \"p\" este: " + extractedText);
        } else {
            System.out.println("String-ul introdus nu contine caracterele \"a\" si \"p\"");
        }
    }

    // M06
    public static int integerOperations(int n1) {
        do {
            if (n1 % 2 == 0) {
                n1 = n1 / 2;
                System.out.println("Numar par, rezultat nou: " + n1);
            } else {
                n1 = n1 * 3 + 1;
                System.out.println("Numar impar, rezultat nou: " + n1);
            }
        } while (n1 > 1);
        return n1;
    }

    // M07
    public static void checkArray(int array1[], int checkFor1, int checkFor2) {
        String stringArray = "";
        for (int cursor = 0; cursor < array1.length; cursor++) {
            stringArray = stringArray + array1[cursor];
        }
        String first = String.valueOf(checkFor1);
        String second = String.valueOf(checkFor2);
        if (stringArray.contains(first + first)) {
            if (stringArray.contains(second + second)) {
                System.out.println("Array-ul contine atat elemente 10 cat si 20 alaturate");
            }
        } else if (stringArray.contains(first + first)) {
            System.out.println("Array-ul contine elemente 10 alaturate");
        } else if (stringArray.contains(second + second)) {
            System.out.println("Array-ul contine elemente 20 alaturate");
        } else {
            System.out.println("Array-ul nu contine elemente de 10, respectiv 20 alaturate");
        }
    }

    // M08.1
    public static int arrayAverage(int[] array2) {
        int sum = 0;
        for (int cursor = 0; cursor < array2.length; cursor++) {
            sum = sum + array2[cursor];
        }
        int arrayAverage = sum / array2.length;
        return arrayAverage;
    }

    // M08.2
    public static void checkArray2(int[] array2, int arrayAverage) {
        ArrayList higherThanAverage = new ArrayList();
        for (int cursor = 0; cursor < array2.length; cursor++) {
            if (array2[cursor] > arrayAverage) {
                higherThanAverage.add(array2[cursor]);
            }
        }
        System.out.println("Elementele din array mai mari decat media aritmetica sunt " + higherThanAverage);
    }

    // M09
    public static void checkArrayFor(int[] array3, int checkValue, int valueInstance) {
        int counter = 0;
        for (int cursor = 0; cursor < array3.length; cursor++) {
            if (array3[cursor] == checkValue) {
                counter++;
            }
        }
        if (counter == valueInstance) {
            System.out.println("Valoarea " + checkValue + " apare de " + valueInstance + " ori in array.");
        } else {
            System.out.println("Valoarea " + checkValue + " nu apare de " + valueInstance + " ori in array.");
        }
    }

    // M10
    public static int addIntDigits(int input) {
        int sum = 0;
        while (input > 0) {
            sum = sum + input % 10;
            input = input / 10;
        }
        System.out.println("Suma cifrelor numarului introdus este: " + sum);
        while (sum >= 10) {
            int x = sum % 10;
            int y = sum / 10;
            sum = x + y;
            if (sum >= 10) {
                System.out.println("Suma noua este: " + sum);
            }
        }
        return sum;
    }

    // M11
    public static void checkPalindrome(int testPalindrome1) {
        String s = String.valueOf(testPalindrome1);
        if (testPalindrome1 > 1) {
            int c1 = 0;
            int c2 = s.length() - 1;
            while ((c2 - c1) > 0) {
                int char1 = s.charAt(c1);
                int char2 = s.charAt(c2);
                if (char1 == char2) {
                    c1++;
                    c2--;
                    if (c1 >= c2) {
                        System.out.println("Numarul " + testPalindrome1 + " este palindrom.");
                    }
                } else {
                    System.out.println("Numarul " + testPalindrome1 + " nu este palindrom");
                    c1 = c2;
                }
            }
        } else {
            System.out.println("Numarul " + testPalindrome1 + " nu este palindrom");
        }

    }

    //M12
    public static void stringPalindrome(String testPal) {
        String convertLowerCase = testPal.toLowerCase();
        String removeCommas = convertLowerCase.replace(",", "");
        String removeFullStop = removeCommas.replace(".", "");
        String removeSpaces = removeFullStop.replace(" ", "");
        int firstCharPos = 0;
        int lastCharPos = removeSpaces.length() - 1;
        while ((lastCharPos - firstCharPos) > 0) {
            char c1 = removeSpaces.charAt(firstCharPos);
            char c2 = removeSpaces.charAt(lastCharPos);
            if (c1 == c2) {
                firstCharPos++;
                lastCharPos--;
                if (firstCharPos >= lastCharPos) {
                    System.out.println("String-ul \"" + testPal + "\" este palindrom");
                }
            } else {
                System.out.println("String-ul \"" + testPal + "\" nu este palindrom");
                firstCharPos = lastCharPos;
            }
        }
    }

    //M13
    public static int sumOfPrimes(int inputNumber) {
        int sum = 0;
        System.out.print("Primele " + inputNumber + " numere prime sunt: ");
        int primesCounter = 0;
        for (int n = 2; primesCounter < inputNumber; n++) {
            int div = 0;
            for (int d = 1; d <= n; d++) {
                if (n % d == 0) {
                    div++;
                }
            }
            if (div == 2) {
                System.out.print(n + " ");
                primesCounter++;
                sum = sum + n;
            }
        }
        return sum;
    }

    //M14
    public static void stringMiddle(String text4) {
        String[] splitText = text4.split(" ");
        int w1 = splitText.length / 2;
        int w2 = (splitText.length / 2) - 1;
        if (splitText.length % 2 == 0) {
            System.out.println("E14. Cuvintele din mijlocul String-ului sunt: " + splitText[w1] + " " + splitText[w2]);
        } else {
            System.out.println("E14. Cuvantul din mijlocul String-ului este: " + splitText[w1]);
        }
    }

    //M15
    public static void charAtPositions(String text5) {
        System.out.print("E15. Caracterele din pozitiile divizibile cu 5 dar nu cu 10 sunt: ");
        for (int p = 0; p < text5.length() - 1; p++) {
            if (p % 5 == 0 && p % 10 != 0) {
                System.out.print(text5.charAt(p) + " ");
            }
        }
    }

    //M16
    public static void removeOddWords(String text6) {
        text6.toLowerCase();
        if (text6.startsWith("s") || text6.startsWith("e") || text6.endsWith("s") || text6.endsWith("e")) {
            System.out.println("String-ul incepe sau se termina cu litera \"s\", respectiv \"e\".");
            System.out.println("String fara cuvinte de pe pozitiile pare: ");
            String[] textArray = text6.split(" ");
            for (int p = 0; p < textArray.length; p++) {
                if (p % 2 == 0) {
                    System.out.print(textArray[p] + " ");
                }
            }
        } else {
            System.out.println("String-ul nu incepe sau se termina cu litera \"s\", respectiv \"e\".");
        }
    }

    //M17
    public static void checkForVowels(String text7) {
        String[] textArray = text7.split(" ");
        int wordCount = 0;
        for (int w = 0; w < textArray.length; w++) {
            String word = textArray[w];
            int letterCount = 0;
            for (int c = 0; c < word.length(); c++) {
                if (word.charAt(c) == 'a' || word.charAt(c) == 'e' || word.charAt(c) == 'i' || word.charAt(c) == 'o' || word.charAt(c) == 'u') {
                    letterCount++;
                }
            }
            if (letterCount >= 2) {
                wordCount++;
            }
        }
        System.out.println("Nr de cuvinde cu 2 sau mai multe vocale este: " + wordCount);
    }

    //M18
    public static int countSpaces(String text8) {
        String[] textArray = text8.split("");
        int charCount = 0;
        for (int c = 0; c < textArray.length; c++) {
            if (textArray[c].equals(" ") || textArray[c].equals(",")) {
                charCount++;
            }
        }
        return charCount;
    }

    //M19
    public static void replaceSpaces(String text9) {
        String[] textArray = text9.split("");
        System.out.print("E19. Noul String este: \"");
        for (int p = 0; p < textArray.length; p++) {
            if (textArray[p].equals(" ") && p % 2 == 0) {
                textArray[p] = ";";
            } else if (textArray[p].equals(" ") && p % 2 != 0) {
                textArray[p] = "|";
            }
            System.out.print(textArray[p]);
        }
        System.out.print("\"");
    }
}

