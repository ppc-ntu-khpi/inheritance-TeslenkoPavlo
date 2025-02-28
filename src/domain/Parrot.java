package domain;

public class Parrot extends Bird {
    private int vocabularySize;
    
    public Parrot(String name, int age, int vocabularySize) {
        super(name, age);
        this.vocabularySize = vocabularySize;
    }
    
    public void talk() {
        System.out.println(name + " is talking.");
    }
    
    public int getVocabularySize() {
        return vocabularySize;
    }
    
    @Override
    public String toString() {
        return super.toString() + "\nParrot:\nVocabulary Size: " + vocabularySize;
    }
}
