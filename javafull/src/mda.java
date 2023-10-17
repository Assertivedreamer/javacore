public class mda {


    public static void main(String[] args) {

        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        myNumbers[1][2] = 9;
        System.out.println(myNumbers[1][2]); // Outputs 9 instead of 7


        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (int i = 0; i < cars.length; i++) {

            System.out.println(cars[i]);
        }


    }
}
