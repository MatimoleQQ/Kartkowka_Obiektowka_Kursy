public class Main {
    public static void main(String[] args) {

        System.out.println("");

        Prowadzacy Andrzej_PR = new Prowadzacy("Anrzej", "Storczyk","Wędkowanie");
        Prowadzacy Gabriela_PR = new Prowadzacy("Gabriela", "Bąk","Wędkowanie");


        Kurs KursProgramowania = new Kurs("ProgramowanieNaSterydach","NaukaProgramowania",Andrzej_PR, 300);
        Kurs KursRybienia = new Kurs("Rybowanie","Rybienie",Gabriela_PR, 750);

        Uczestnik Mariusz = new Uczestnik("Mariusz","Kopytko",325);
        Uczestnik Garnek = new Uczestnik("Garnek","Koralowiec",1800);
        Uczestnik Janina = new Uczestnik("Janina","Bubr",10);

        KursProgramowania.dodajDoKursu(Mariusz);
        KursRybienia.dodajDoKursu(Garnek);
        KursRybienia.dodajDoKursu(Garnek);
        KursRybienia.dodajDoKursu(Janina);

    }
}