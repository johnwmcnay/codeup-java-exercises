public class ControlFlowExercises {
    public static void main(String[] args) {

        int i = 0;

        do {
            System.out.println(i);
            i += 2;
        } while (i < 100);

        do {
            System.out.println(i);
            i -= 5;
        } while (i >= -10);

        long y = 2;
        do {
            System.out.println(y);
            y = y * y;
        } while (y < 1000000);

//exercise 1a
//        int i = 5;
//
//        while (i <= 15) {
//            System.out.printf("%s ", i);
//            i++;
//        }
    }
}
