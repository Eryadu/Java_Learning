package ClassConstuctor;

public class MainOverloading {


    public String info (String name){
        System.out.println(name);
        return name;
    }
    public String info (String name, String email){
        System.out.println(name + email);
        return name + email;
    }
    public String info (String name, String email, long phone){
        System.out.println(name+email+phone);
        return name+email+phone;
    }
}
