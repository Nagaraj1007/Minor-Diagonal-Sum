// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static int minorDiagonalSum(int[][] array){
        int start = 0, last = array.length - 1, sum = 0;
        while (start <= array.length - 1 && last >= 0){
            sum += array[start][last];
            start++;
            last--;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(minorDiagonalSum(new int[][] { {3, 2}, {2, 3} }));
    }
}