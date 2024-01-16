public class PatternQuestions {
    public static void main(String[] args) {
        Pattern1(5);

    }
    static void Pattern1(int n) {
        for (int row = 1; row <= n; row++) {

            for (int col = 1; col <= row; col++) {
                System.out.print("* " );


            }
           System.out.println( );
        }
    }

}
