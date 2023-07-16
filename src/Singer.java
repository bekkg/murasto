public class Singer extends Person{
    private  String bandName ;

    public Singer(String name, String designation, String bandName) {
        super(name, designation);
        this.bandName = bandName;
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }

    public String getBandName() {
        return bandName;
    }
    public  void singing (){
        System.out.println("singing singer");
    }
    public void playGitar(){
        System.out.println("playGitar");
    }



    @Override
    public void learnd() {
        super.learnd();
    }

    @Override
    public void walk() {
        super.walk();
    }

    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public String toString() {
        return "Singer{" +
                "bandName='" + getBandName() + '\'' +
                '}' +
                "\n name: "+ getName()+
                "\n designation: "+getDesignation();
    }
}
