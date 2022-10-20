public  final class Prowadzacy extends Osoba  {
    private String Umiejetnosci;
    public Prowadzacy( String imie, String nazwisko , String umiejetnosci ) {
        super( imie, nazwisko );
        this.Umiejetnosci =  umiejetnosci;
    }

    public String getUmiejetnosci() {
        return Umiejetnosci;
    }

    public void setUmiejetnosci( String umiejetnosci ) {
        Umiejetnosci = umiejetnosci;
    }
}
