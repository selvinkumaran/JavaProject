package H_Exception;

public class Main {
    public static void exception() {
        try {
            int arr[] = {1, 2, 3, 45,};
            System.out.println(arr[4]);
        } catch (Exception e) {
            System.out.println("Exception Handled");
        }

    }

    public static void main(String[] args) {
        exception();
    }
}
