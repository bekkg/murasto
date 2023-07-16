public class Dancer extends  Person{
    private String groupName ;

    public Dancer(String name, String designation, String groupName) {
        super(name, designation);
        this.groupName = groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getGroupName() {
        return groupName;
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
    public void dancing (){

    }

    @Override
    public String toString() {
        return  " Dancer: " + getDesignation()+
                "\n dancer " + getName()+
                "\n dancer GroupNamer: "+ getGroupName();
    }
}
