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

    public getInfo(){
        System.out.println(name + " is spoken by " + numSpeakers + " people mainly in " + regionsSpoken + ".");
        System.out.println("The language follows the word order: " + wordOrder + ".");
    }

    public static void main(String[] args){

    }
}