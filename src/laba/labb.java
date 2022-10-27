package laba;
import pokemons.*;
import ru.ifmo.se.pokemon.*;
public class labb {
    public static void main(String[] args){
        Battle b = new Battle();
        Gallade p1 = new Gallade("Олег", 1);
        Kirlia p2 = new Kirlia("Кирилл", 1);
        Komala p3 = new Komala("Денис", 1);
        Phantump p4 = new Phantump("Victor", 1);
        Ralts p5 = new Ralts("Evgeniy", 1);
        Trevenant p6 = new Trevenant("Anton", 1);
        b.addAlly(p1);
        b.addAlly(p2);
        b.addAlly(p3);
        b.addFoe(p4);
        b.addFoe(p5);
        b.addFoe(p6);
        b.go();
    }

}
