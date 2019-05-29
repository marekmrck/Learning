public class Tablice {
    public static void main(String[] args) {
//        Tablica2();
        przesuniecie();

    }

    private static void Tablica() {
        int[][] tab = new int[4][5];
        int k = 0;
        for (int x = 0; x < 4; x++) {
            for (int y = 0; y < 5; y++) {
                tab[x][y] = k;
                k++;
            }
        }
        for (int x = 0; x < 4; x++) {
            for (int y = 0; y < 5; y++)
                System.out.print(tab[x][y] + " ");
            System.out.println();

        }
    }

    private static void Tablica2() {
        int[][] tab = new int[5][];
        tab[0] = new int[1];
        tab[1] = new int[2];
        tab[2] = new int[3];
        tab[3] = new int[4];
        tab[4] = new int[5];
        int x, y, k = 0;
        for (x = 0; x < 5; x++) {
            for (y = 0; y < x + 1; y++) {
                tab[x][y] = k;
                k++;
            }
        }
        for (x = 0; x < 4; x++) {
            for (y = 0; y < x + 1; y++)
                System.out.print(tab[x][y] + " ");
            System.out.println();

        }


    }

    private static void przesuniecie() {
        int x = 100;
        x = x >>2;
        System.out.println(x);
    }


}
