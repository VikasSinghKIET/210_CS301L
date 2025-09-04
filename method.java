public class method{

    int id;
    String name;

    method(int id, String name){
        this.id = id;
        this.name = name;
        

        System.out.println("constructor " + id + " "+name);


    }



    public void displayMethod() {
        System.out.println("Detials are :"+id+" "+name);
        
    }
    public static void main(String[] args ){
        
        method m3 = new method();
        m3.displayMethod();
    }
}