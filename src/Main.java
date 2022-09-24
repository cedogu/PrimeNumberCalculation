public class Main {
    public static void main(String[] args) {

       int number= 26905;
       int remainder = number % 2;
       boolean isPrime= true;

       for (int i=2; i<number; i++){
           if(number%i==0){
               isPrime=true;
           }
        }

       if(isPrime==true){
           System.out.println("The value is a prime number");
       }else{
           System.out.println("The value is not a prime number");
       }
    }
}