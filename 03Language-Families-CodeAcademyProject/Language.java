public class Language {

    protected String name;
    protected int numSpeakers;
    protected String regionsSpoken;
    protected String wordOrder;

    Language(String langName, int volSpeakers, String areasSpoken, String order){
        this.name = langName;
        this.numSpeakers = volSpeakers;
        this.regionsSpoken = areasSpoken;
        this.wordOrder = order;
    }

    public void getInfo(){
        System.out.println(this.name + " is spoken by " + this.numSpeakers + " people mainly in " + this.regionsSpoken + ".");
        System.out.println("The language follows the word order: " + this.wordOrder + ".");
    }

    public static void main(String[] args){
        Language german = new Language("German", 73, "The Apartment", "Yode like");
        Language mayan1 = new Mayan("Mayan", 67, "This is ignored because it was supered", "This also got supered");
        german.getInfo();
        mayan1.getInfo();
    }   
}