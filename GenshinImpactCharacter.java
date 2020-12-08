public class GenshinImpactCharacter {
    String elementType;
    String teamRole;
    double attackSpeed;
    boolean getThroughGacha;
    double attackDamage;

    public GenshinImpactCharacter (String element, String role, double aspd, boolean gacha, double dmg) {
        elementType = element;
        teamRole = role;
        attackSpeed = aspd;
        getThroughGacha = gacha;
        attackDamage = dmg;
    }

    public String getRole() {
        return teamRole;
    }

    public void setAttackSpeed(double atkspd) {
        attackSpeed = atkspd;
    }

    public void bersekerSetAttackIncrease() {
        attackDamage = Math.round(attackDamage*1.18);
    }

    public void printAttackDamage() {
        System.out.println("Your attack damage is " + attackDamage + "!");
    }

    // barbara healer diluc DPS
    public static void main(String[] args) {
        // INFO: Anemo=wind, Hydro=water, Pyro=fire
        GenshinImpactCharacter venti = new GenshinImpactCharacter("anemo", "support", 0.5, true, 950);
        GenshinImpactCharacter barbara = new GenshinImpactCharacter("hydro", "healer", 1, false, 864);
        GenshinImpactCharacter diluc = new GenshinImpactCharacter("pyro", "DPS", 2, true, 1200);

        System.out.println("****************************************");
        System.out.println("Venti is one of my favorite " + venti.teamRole + " characters in Genshin Impact." );
        System.out.println("He is an " + venti.elementType + " character with an attack speed of " + venti.attackSpeed + " seconds.");
        System.out.println("If you are wondering if you have to get him through gacha, that is " + venti.getThroughGacha + "!");

        System.out.println("There are also good characters that the game gives you though!");
        System.out.println("For example, it is " + barbara.getThroughGacha + " that you have to get Barbara through gacha.");
        System.out.println("She is a pretty good " + barbara.teamRole + " unless you are fighting " + barbara.elementType + " enemies. In those cases, she is pretty garbo :(");
        System.out.println("However, my favorite character is Diluc who is a super cool " + diluc.elementType + " " + diluc.teamRole + ".");
        System.out.println(" ");
        System.out.println("Venti's role on the team is " + venti.getRole());
        diluc.setAttackSpeed(0.75);
        System.out.println("Diluc's new attack speed is " + diluc.attackSpeed);
        diluc.bersekerSetAttackIncrease();
        System.out.print("Diluc: ");
        diluc.printAttackDamage();
        System.out.println("****************************************");
    }
}