import java.util.Scanner;
public class Prifixsumquri_02 {
    static void printarry(int arry[]){
        for(int i = 0; i < arry.length; i++){
            System.out.print(arry[i] + " ");
        }
        System.out.println();
    }

    static void prisum(int arry[]){
        for(int i = 1; i < arry.length; i++){
            arry[i] += arry[i-1];
        }
    }

    static void qurisum(int arry[], int s, int e){
        int sum = 0;
        sum = arry[e] - arry[s-1];
        System.out.println(sum);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arry[] = {0,1,2,3,4,5};
        printarry(arry);
        prisum(arry);
        printarry(arry);
        System.out.println("Enter the quries");
        int num = in.nextInt();
    
        while(num-- > 0){
            System.out.println("Enter Starting Index Number");
            int start = in.nextInt();
            System.out.println("Enter Last Index Number");
            int last = in.nextInt();
            qurisum(arry, start, last);
        }

    }
}
