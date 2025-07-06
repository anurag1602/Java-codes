public class cellphone{
    
    private String model;
    private String color;
    private String ram;

    public void setprop(String model,String color,String ram){
        String validmodel = model.toLowerCase();
        String validcolor = color.toLowerCase();
        String validram = ram.toLowerCase();
        if((validmodel.equals("nord")|| validmodel.equals("air"))&&(validcolor.equals("white")||validcolor.equals("silver"))&&(validram.equals("8gb oneplus")||validram.equals("16gb apple"))){
            this.model = validmodel;
            this.color = validcolor;
            this.ram = validram;
        }else{
            this.model = "Unknown";
            this.color = "different";
            this.ram = "Secret";
        }
    }

    public String getmodel(){
        return this.model;
    }

    public String getcolor(){
        return this.color;
    }

    public String getram(){
        return this.ram;
    }

    public static void main(String args[]){
        cellphone oneplus = new cellphone();
        cellphone apple = new cellphone();

        oneplus.setprop("Nhjbjb","WhItE","8Gb OnEpLuS");
        System.out.println("the model is "+oneplus.getmodel());
        System.out.println("the color is "+oneplus.getcolor());
        System.out.println("the ram is "+oneplus.getram());
        apple.setprop("aiR","SiLvErg","16Gb aPPlE");
        System.out.println("the model is "+apple.getmodel());
        System.out.println("the color is "+apple.getcolor());
        System.out.println("the ram is "+apple.getram());
    }

}