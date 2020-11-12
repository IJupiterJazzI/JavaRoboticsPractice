
// (length of your hanging planter*2) + width of planter + 24"
public class PlantHangerLength {

    public static double getStringLength(double desired, double planterWidth) {
        double length = (desired*2)+planterWidth+24;
        return length;
    }
    public static void main(String[] args) {
        double desiredLength1 = 28;
        double width1 = 8.5;

        System.out.println("****************************************");
        System.out.println("INDIVIDUAL STRING LENGTH:" + getStringLength(desiredLength1, width1) + " inches");
        System.out.println("TOTAL STRING NEEDED " + (4*getStringLength(desiredLength1, width1))  + " inches");
        System.out.println("****************************************");
    }
}