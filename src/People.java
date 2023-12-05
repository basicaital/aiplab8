public class People {
    protected String name;
    protected String lastname;
    protected int age;

    public People(String name, String lastname, int age){
        this.name = name;
        this.lastname = lastname;
        this.age = age;
    }
    public People(){

    }
    protected void voice(){
        System.out.println("Привет!");
    }
    protected void walk(){
        System.out.println("🚶‍♂️");
    }
    protected void run(){
        System.out.println("🏃‍♂️");
    }
}
