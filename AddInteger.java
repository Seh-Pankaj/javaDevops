public class AddInteger {
    static void  printTriangle(int n) {
        int col = 2*n - 2;
        for (int i = 0; i < n; i++) {
            int var = n;
            for (int j = 0; j < n; j++) {

                if (j<i){
                    System.out.print(var--);
                }
                else if ((j+i) >= col) {
                    System.out.print(var++);
                }
                else {
                    System.out.print(var);
                }
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        printTriangle(4);
    }
}


