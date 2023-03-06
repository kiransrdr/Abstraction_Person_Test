package testgradebookinheritence;
public class Author {
    private String name;
    private String email;
    private char gender; 
    public Author(String name,String email,char gender)
    {
        this.name=name;
        this.email=email;
        this.gender=gender; 
    }
    public String toString() 
   {
        return String.format("{" +
                "name='" + name + '\'' +
                ",\t Email=" + email +
                ",\t Genger='" + gender + '\'' +
                '}'+",\n");
    }
}
