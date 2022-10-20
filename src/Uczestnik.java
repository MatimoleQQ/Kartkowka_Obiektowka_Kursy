public class Uczestnik extends Osoba{
    private int fundusze;

    public Uczestnik( String imie, String nazwisko, int fundusze ) {
        super( imie, nazwisko );
        this.fundusze = fundusze;
    }

    public int getFundusze() {
        return fundusze;
    }

    public void setFundusze( int fundusze ) {
        this.fundusze = fundusze;
    }
}
