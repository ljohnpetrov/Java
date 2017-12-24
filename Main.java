public class Main {

    public static void main(String[] args) {
        //String Arr[][];
        String Arr[][] = new String[][]
                {{"Hello", "Evryone", "Well", "Matt"}, {"Hey", "WatsUpp", "Nice", "to Meet"},
        {"Hello", "Evryone", "Well", "Matt"}, {"Hey", "WatsUpp", "Nice", "to Meet"}} ;


        Main.Testerrors(Arr);
//        for (int i = 0; i < Arr.length; i++) {
//            for (int j = 0; j < Arr.length; j++) {
//                System.out.print(Arr[i][j] + " ");
//            }
//            System.out.println("\n");
//        }
    }

     static void Testerrors(String Arr[][]) {

        for (int i = 0; i < Arr.length; i++) {
            for (int j = 0; j < Arr.length; j++) {
                System.out.print(Arr[i][j] + " ");
            }
            System.out.println("\n");
        }
    }
}