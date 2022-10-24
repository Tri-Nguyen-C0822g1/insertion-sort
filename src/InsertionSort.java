import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of list: ");
        int size = scanner.nextInt();
        int[] list = new int[size];
        System.out.println("Enter " + size + " values:");
        for (int i = 0; i < list.length; i++) {
            list[i] = scanner.nextInt();
        }
        System.out.println("Your list is : ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + "\t");
        }
        System.out.println("\nBegin sort processing...");
        insertionSort(list);
    }

    public static void insertionSort(int[] list) {
        boolean needNextPass = true;
        int position, element;
        for (int i = 1; i < list.length; i++) {
            element = list[i];
            position = i;
            while (position > 0 && element < list[position - 1]) {
                System.out.println("Swap " + list[position] + "with " + list[position - 1]);
                list[position] = list[position - 1];
                position--;
                list[position] = element;

                needNextPass = true;
            }
            while (needNextPass == false){
                System.out.println("List may be sorted");
                break;
            }
            System.out.println("List after " + i + "' sort:\n");
            for (int j = 0; j < list.length; j++) {
                System.out.print(list[j] + "\t");
//                System.out.println();

            }
        }
    }
}