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
        System.out.println();
    }

    public static void main(String[] args){
        Language german = new Language("German", 73, "The Apartment", "Yode like");
        Language mayan1 = new Mayan("Mayan", 2330000 );
        Language sino1 = new SinoTibetan("Sino1", 777666);
        Language sino2Chinese = new SinoTibetan("SinoChinese", 30000000);
        german.getInfo();
        mayan1.getInfo();
        sino1.getInfo();
        sino2Chinese.getInfo();
    }   
}