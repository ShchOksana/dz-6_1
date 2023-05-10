import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] arr1 = {8, 2, 3, 4, 5, 6, 7};
        String inputString1 = "Alexx9800";
//        String[] inputArrString1 = new String[]{"мама", "тато", "їж їжак желе"};


        sumEvenElements(arr1);
        System.out.println("-------------------------------------");
        uniqueChars(inputString1);
        System.out.println("-------------------------------------");
//        processString(inputArrString1);
    }


    //      Написати метод який приймає массив цілих чисел і вертає суму всіх його парних елементів(не тих які мають парні індекси а ті які самі є парними). [8,2,3,4,5,6,7] -> 20
    private static void sumEvenElements(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println("The sum os even elements is: " + sum);

    }


    //    Написати метод приймає стрінгу і друкує всі її унікальні значення з нового рядка.
    private static void uniqueChars(String inputString) {
        char[] chars = inputString.toCharArray();
        SortedSet<Character> setOfChars = new TreeSet<>();

        for (Character character : chars) {
            setOfChars.add(character);
        }

        for (Character character : setOfChars) {
            System.out.println(character);
        }
    }



/*    Написати функцію, яка:
    приймає як вхідний параметр масив рядків;
    із заданого списку рядків знаходить           /////перші два, в яких кожна
     літера трапляється парну кількість разів (наприклад "мама", "тато", "їж їжак желе");

    знаходить набір унікальних символів у словах знайдених слів (для наведеного прикладу "мама", "папа" це буде [м а п]);
    повертає набір літер у вигляді масиву або будь-якого типу колекції, порядок літер при цьому значення не має.



    private static void processString(String[] inputArrString) {
        Map<Character, Integer> mapOfChars = new HashMap();

        for (String elemArrString : inputArrString) {
            char[] separateWord = elemArrString.toCharArray();

            for (Character character1 : separateWord) {
                int counter = 1;
                if (mapOfChars.containsKey(character1)) {
                    counter = mapOfChars.get(character1) + 1;
                    mapOfChars.put(character1, counter);
                } else {
                    mapOfChars.put(character1, 1);
                }
            }
        }
                System.out.println(mapOfChars);
    }
 */

}


