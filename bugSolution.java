public class MyClass {
    public static void main(String[] args) {
        int[] array = new int[5];
        if (array != null) {
            for (int i = 0; i < array.length; i++) {
                array[i] = i * 2;
            }
            if(array.length > 5) {System.out.println(array[5]);}
            else {System.out.println("Array index out of bounds");}
        } else {
            System.out.println("Array is null");
        }
    }
}