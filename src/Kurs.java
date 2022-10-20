import java.util.ArrayList;
import java.util.List;

public class Kurs {
    private Prowadzacy prowadzacy;
    private String nazwa_kursu;
    private String opis;
    private List<Uczestnik> uczestnicy = new ArrayList<>();
    private int cena;

    public Kurs( String nazwa_kursu , String opis , Prowadzacy prowadzacy , int cena) {
        this.prowadzacy = prowadzacy;
        this.nazwa_kursu = nazwa_kursu;
        this.opis = opis;
        this.cena = cena;
    }

    public void dodajDoKursu(Uczestnik uczestnik)
    {
        System.out.println( "Ilosc zapisanych uczestnikow do " + this.nazwa_kursu + ": " + this.uczestnicy.size() );

        if(!uczestnicy.contains(uczestnik) && this.uczestnicy.size() < 12 && uczestnik.getFundusze() >= this.cena  )
        {
            uczestnicy.add( uczestnik );
            uczestnik.setFundusze( uczestnik.getFundusze() - this.cena );
            System.out.println( "Dodano uczestnika " + uczestnik.getImie() + " " + uczestnik.getNazwisko() + " do kursu " + this.nazwa_kursu + " pozostalo " + uczestnik.getFundusze() + " zł w skarbonce ");
        }
        else
        {
            if( uczestnicy.contains( uczestnik ) )
                System.out.println("Uczestnik " + uczestnik.getImie() + " " + uczestnik.getNazwisko() + " juz jest w kursie ");
            else
                if (uczestnicy.size() >= 12)
                    System.out.println("Nie mozna dodaj kolejnego uczestnika z powodu braku miejsc");
                else
                    System.out.println( "Nie mozna dodać uczestnika " + uczestnik.getImie() + " " + uczestnik.getNazwisko() + " z powodu braku pieniedzy. Pieniadze na koncie: " + uczestnik.getFundusze() + " Koszt kursu to: " + this.cena + ".  Brakuje: " + (this.cena - uczestnik.getFundusze()) + "zł" );
            {


            }
        }

        System.out.println("");

    }
}
