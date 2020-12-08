public class OneToOneHundred {

    public static void betweenOneAndOneHundred(int number) {
        if (number >= 1 && number <= 100) {
            System.out.println(number +  " is between 1 and 100");
        } else {
            System.out.println(number + " is not between 1 and 100 :(");
        }
    }
    public static void main(String[] args) {
        betweenOneAndOneHundred(3);
        betweenOneAndOneHundred(90);
        betweenOneAndOneHundred(-5);
        betweenOneAndOneHundred(150);
    }

}