public class Main {
    public static void main(String[] args) {

        Person person = new Person("alfa", "beta");
        person.learnd();
        person.walk();
        person.eat();
        System.out.println();



        Programmer programmer = new Programmer("moon","sun","google");
        System.out.println(programmer);
        programmer.learnd();
        programmer.walk();
        programmer.eat();
        programmer.coding();
        System.out.println();


        Dancer dancer = new Dancer("moon dancer","sun dancer", "google dancer");
        System.out.println(dancer);
        dancer.learnd();
        dancer.walk();
        dancer.eat();
        dancer.dancing();
        System.out.println();


        Singer singer = new Singer("moon singer","sun singer", "google singer");
        System.out.println(singer);
        singer.learnd();
        singer.walk();
        singer.eat();
        singer.singing();
        singer.playGitar();



    }
}