
public class Main {
    public static void main(String[] args) {
        int size = 7; // B harfinin boyutu

        char[][] letterB = new char[size][size];

        //B harfinin oluşturulması
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                if (col == 0 || row == 0 || row == size / 2 || row == size - 1) {
                    letterB[row][col] = '*';
                } else if (col == size - 1 && row <= size / 2) {
                    letterB[row][col] = '*';
                }else if (col == size - 1 && row <= size * 2) {
                    letterB[row][col] = '*';
                } else {
                    letterB[row][col] = ' ';
                }
            }
        }

        // B harfinin ekrana yazdırılması
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                System.out.print(letterB[row][col] + " ");
            }
            System.out.println();
        }
    }
}