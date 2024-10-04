public class Person {
    private String name;
    private int age;
    private String email;
    private String phone;
    private String address;

    public Person(String name, int age, String email, String phone, String address) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.phone = phone;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public void getDetailsOfPerson() {
        System.out.println(name+" "+age+" "+email+" "+phone+" "+address) ;
    }

}