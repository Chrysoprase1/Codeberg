
public class Greatest {

    

    public static void main(String[] args) {
        int result = greatest(2, 7, 50);
        System.out.println("Greatest: " + result);
    }
    
    public static int greatest(int number1, int number2, int number3) {
        //write some code here
        int greatest = 0;
        
        if (number1 >= number2 && number1 >= number3 || number1 >= number3 && number1 >= number2) {
            greatest = number1;
        } else if (number2 >= number1 && number2 >= number3 || number2 >= number3 && number2 >=number1) {
            greatest = number2;
        } else if (number3 >= number1 && number3 >= number2 || 
                number3 >= number2 && number3 >= number1) {
            greatest = number3;
        } else {
            greatest = number1;     // equal
        }
        return greatest;
    }
}
