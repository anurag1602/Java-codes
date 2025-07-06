public class Name {
    
    private String FirstName;
    private String Lastname;


    public void setFirstName(String FirstName){
        this.FirstName = FirstName;
    }

    public String getFirstName(){
        return FirstName;
    }

    public void setLastname(String Lastname){
        this.Lastname = Lastname;
    }

    public String getLastName(){
        return Lastname;
    }

    public String getName(){
        // return FirstName+" "+Lastname;
        return getFirstName() + " " + getLastName();
    }
    
    
    public static void main(String[] args) {
        Name fullname = new Name();
        fullname.setFirstName("Anurag");
        fullname.setLastname("Punewar");
        System.out.println("Full Name is: "+fullname.getName());
    }


}
