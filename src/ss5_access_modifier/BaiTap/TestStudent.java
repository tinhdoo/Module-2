package ss5_access_modifier.BaiTap;
public class TestStudent {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student.getName());
        System.out.println(student.getClasses());

        student.setName("Tinh");
        student.setClasses("C03");

        System.out.println(student.getName());
        System.out.println(student.getClasses());

    }
}
