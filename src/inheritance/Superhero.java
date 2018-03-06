package inheritance;

public class Superhero extends Person {

    private String alterEgo;

    public Superhero(String name, String alterEgo) {
        super(name);
        this.alterEgo = alterEgo;
    }

    public String getName() {
        return alterEgo;
    }

    public String getSecretIdentity(){
        return super.getName();
    }
}
