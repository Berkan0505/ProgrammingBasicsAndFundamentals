package FirstModule.NestedLoopsLab;


public class MultiplicationTable {
    public static void main(String[] args) {

        for (int i = 1; i < 11; i++) {
            for (int j = 1; j < 11; j++) {
                int product = i * j;
                System.out.printf("%d * %d = %d\n", i, j, product);
            }
        }
    }
}
