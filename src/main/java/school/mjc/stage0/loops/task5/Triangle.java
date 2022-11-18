package school.mjc.stage0.loops.task5;

public class Triangle {
    public void printTriangle(int cathetusLength) {
        for (int i = 1;i <= cathetusLength;i++){
            for (int j = 1; j <= cathetusLength;j++){
                if ( i >= j){
                System.out.println(i + j);
                System.out.println("8");
                }
            }
            System.out.println("\n");
        }
    }
}
