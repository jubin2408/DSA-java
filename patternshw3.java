public class patternshw3 {
    public static void main(String args[]){

        //Inverted Half Pyramid.

        int  n =6;

        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(i);
            }
            
            System.out.println();
        }
    }
}
