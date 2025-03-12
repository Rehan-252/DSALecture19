class Prifixsum_01{
    
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
    
    public static void main(String[] args) {
        int arry[] = {1,2,3,4,5};
        prisum(arry);
        printarry(arry);
    }
}
