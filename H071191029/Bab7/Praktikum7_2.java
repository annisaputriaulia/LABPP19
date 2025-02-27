import java.util.ArrayList;
import java.util.Scanner;

class Praktikum7_2 {
    public static void main(String[] args) {
        Scanner ww = new Scanner(System.in);
        ArrayList<Integer> numb = new ArrayList<>();
        int start = ww.nextInt();
        int end = ww.nextInt();
        ww.close();

        for (int i = start; (start > end) ? i >= end : i <= end; i += (start > end) ? -1 : 1) {
            int n = Math.abs(i);
            boolean isSelfDivide = true;

            while (n > 0) {
                int c = n % 10;
                n /= 10;
                if (c == 0 || i % c != 0) {
                    isSelfDivide = !isSelfDivide;
                    break;
                }
            }
            
            if (isSelfDivide && i != 0) {
                numb.add(i);
            }
        }
 
        for (int j = 0; j < numb.size(); j++) {
            System.out.print(numb.get(j) + " ");
        }
    }
}