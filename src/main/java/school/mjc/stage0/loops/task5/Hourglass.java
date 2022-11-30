package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {



        for ( int i = 1; i <= height; i++) {

            for (int k = 1; k < i; k++)
                System.out.print(" ");


            for (int j = i; j <= height; j++)
                System.out.print("8");

            System.out.println();
        }


        for (int i = height - 1; i >= 1; i--)
        {

            for (int k = 1; k < i; k++)
                System.out.print(" ");


            for (int j = i; j <= height; j++)
                System.out.print(" 8");

            System.out.println();
        }
    }
}

