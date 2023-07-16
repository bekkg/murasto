public class Person {
    private  String name ;
    private String designation ;

    public Person(String name, String designation) {
        this.name = name;
        this.designation = designation;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getName() {
        return name;
    }

    public String getDesignation() {
        return designation;
    }
    public void learnd (){
        System.out.println(" leand ");
    }
    public void walk (){
        System.out.println(" walk ");
    }
    public void eat (){
        System.out.println(" eat ");
    }


    @Override
    public String toString (){
        return  " name: "+ getName()+
                " designation: "+getDesignation();
    }
}
