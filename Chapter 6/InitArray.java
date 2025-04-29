public class InitArray{
    public static void main(String[] args) {
        int size = (args.length > 0) ? Integer.parseInt(args[0]) : 10;
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++)
            array[i] = i * 2;
        for (int value : array)
            System.out.println(value);
    }
}