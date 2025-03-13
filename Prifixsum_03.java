public class Prifixsum_03 {
    static void printarry(int arry[]){
        for(int i = 0; i < arry.length; i++){
            System.out.print(arry[i] + " ");
        }
        System.out.println();
    }
    
    static int prisum(int arry[]){
        int total = 0;
        for(int i = 1; i < arry.length; i++){
            arry[i] += arry[i-1];
            total = arry[i];
        }
        return total;
    }
    
    static void findequal(int arry[]){
        int total = prisum(arry);
        printarry(arry);
        for(int i = 0; i < arry.length; i++){
            if(arry[i] == (total - arry[i])){
                System.out.println("Yes, It is Equal at Index " + (i+1));
            }
        }
    }
    public static void main(String[] args) {
        int arry[] = {2,3,4,4,5};
        printarry(arry);
        findequal(arry);
    }
}
