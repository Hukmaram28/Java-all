public class Student<id> {
    private int id;
    private String name;
    private int age;
    public void setter(int id,int age, String name){
        this.id=id;
        this.age=age;
        this.name=name;
    }
    public int getage(){
        return age;
    }
    public String getname(){
        return name;
    }
    public int getid(){
        return id;
    }
}
