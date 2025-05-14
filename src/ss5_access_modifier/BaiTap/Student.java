package ss5_access_modifier.BaiTap;

public class Student {
    private String name;
    private String classes;

    public Student() {
        this.name = "john";
        this.classes ="C02";
    }
    public void setClasses(String classes) {
        this.classes = classes;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }
    public String getClasses(){
        return classes;
    }

}
