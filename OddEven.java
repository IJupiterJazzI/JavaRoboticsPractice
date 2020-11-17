public class OddEven {

    public static void isItOddOrEven(int number) {
        int remainder = number%2;
        switch (remainder) {
            case 0:
                System.out.println(number + " is even.");
                break;
            case 1:
                System.out.println(number + " is odd.");
                break;
            case -1:
                System.out.println(number + " is negative and odd.");
        }
    }
        
    public static void main(String[] args) {
        isItOddOrEven(5);
        isItOddOrEven(8);
        isItOddOrEven(122);
        isItOddOrEven(-7);
        isItOddOrEven(-6);
    }
}