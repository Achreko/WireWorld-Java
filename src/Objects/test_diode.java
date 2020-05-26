package Objects;

public class test_diode {
    public static void main(String[] args) {
        int[][] m = new int[20][20];
        for (int i = 0; i < 20; i++) {
for (int j=0;j<20;j++){
    m[i][j]=0;
}
        }

        m[8][6]=3;
Or_Gate.make_or_gate(m,6,8);


        for (int i = 0; i < 20; i++) {
            for (int j=0;j<20;j++){
               System.out.print(m[i][j]);
            }
            System.out.print('\n');
        }
    }
}
