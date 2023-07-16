public class Programmer extends Person {
    private String companyName ;

    public Programmer(String name, String designation, String companyName) {
        super(name, designation);
        this.companyName = companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }

    @Override
    public void learnd() {
        super.learnd();
        System.out.println(" learnd 2 ");
    }

           @Override
    public void walk() {
        super.walk();
        System.out.println(" walk 2 ");
    }

       @Override
    public void eat() {
        super.eat();
        System.out.println(" eat 2 ");
    }

    public void coding (){
        System.out.println(" Programmer coding ");
    }

         @Override
    public String toString() {
        return "Programmer  {" +
                "companyName = '" + getCompanyName() + '\'' +
                '}' +
                " \nname: "+ getName()+
                " \ndesignation: "+getDesignation();

    }
}
