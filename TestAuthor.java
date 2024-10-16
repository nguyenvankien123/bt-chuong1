package EXERCISESPONCOMPOSSITION;

public class TestAuthor {
    public static void main(String[] args) {
        Author ahteck = new Author( "Tan Ah Tech","Ahtech@nowhere.com",'m'){
        };
        System.out.println(ahteck);
        ahteck.setemail("PaulTan@nowhwere.com");
        System.out.println("ten la "+ahteck.getName());
        System.out.println("email la "+ahteck.getEmail());
        System.out.println(" gioi tinh la "+ahteck.getGender());



        Book book = new Book (" kiendz",ahteck,99 ,77);
        System.out.println(book.getprice());
        System.out.println(book.getname());
        System.out.println(book.getqty());
        System.out.println(book.getauthors());





    }
}
