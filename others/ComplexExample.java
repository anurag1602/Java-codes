public class ComplexExample {
    static String message;

    static{
        message = setupmessage();
        // System.out.println(getMessage());
    }

    static String setupmessage(){
        System.out.println("setupmessage called");
        // setMessage("Hii");
        setMessage("Hii");
        System.out.println(getMessage());
        return "Hello Static!";
    }

    

    public static void main(String[] args) {
        System.out.println(message);

    }

    public static String getMessage() {
        return ComplexExample.message;
    }

    public static void setMessage(String message) {
        ComplexExample.message = message;
    }
}

