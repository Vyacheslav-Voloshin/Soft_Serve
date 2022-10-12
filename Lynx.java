package Java_kurs.HomeWork1;

public class  Lynx {
    private String name;
    private String color;

    public Lynx (String name){
        this.name = name;
    }
    public Lynx (String name,String color) {
        this.name = name;
        this.color = color;
    }
    public  String getName() {
        return name;
    }
    public void setName(String value){
        name = value;
    }
    public void setColor(String value){ color = value;}
    public String getColor(){
        return color;
    }
    public void sayHello(){
        System.out.println("Hello, I am an animal of class "+ getClass().getSimpleName()+ ". My name is "+ getName()+", my color "+ getColor());
    }
}
