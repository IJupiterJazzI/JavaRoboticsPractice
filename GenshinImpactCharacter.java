public class GenshinImpactCharacter {
    String elementType;
    String teamRole;
    double attackSpeed;
    boolean getThroughGacha;

    public GenshinImpactCharacter (String element, String role, double aspd, boolean gacha) {
        elementType = element;
        teamRole = role;
        attackSpeed = aspd;
        getThroughGacha = gacha;
    }

    // barbara healer diluc DPS
    public static void main(String[] args) {
        // INFO: Anemo=wind, Hydro=water, Pyro=fire
        GenshinImpactCharacter venti = new GenshinImpactCharacter("anemo", "support", 0.5, true);
        GenshinImpactCharacter barbara = new GenshinImpactCharacter("hydro", "healer", 1, false);
        GenshinImpactCharacter diluc = new GenshinImpactCharacter("pyro", "DPS", 2, true);

        System.out.println("****************************************");
        System.out.println("Venti is one of my favorite " + venti.teamRole + " characters in Genshin Impact." );
        System.out.println("He is an " + venti.elementType + " character with an attack speed of " + venti.attackSpeed + " seconds.");
        System.out.println("If you are wondering if you have to get him through gacha, that is " + venti.getThroughGacha + "!");

        System.out.println("There are also good characters that the game gives you though!");
        System.out.println("For example, it is " + barbara.getThroughGacha + " that you have to get Barbara through gacha.");
        System.out.println("She is a pretty good " + barbara.teamRole + " unless you are fighting " + barbara.elementType + " enemies. In those cases, she is pretty garbo :(");
        System.out.println("However, my favorite character is Diluc who is a super cool " + diluc.elementType + " " + diluc.teamRole + ".");
        System.out.println("****************************************");
    }
}