package EXERCISESPONCOMPOSSITION;

public class testbook {
    public static void main(String[] args) {
        Author[] authors = new Author[3];
        Author author1 =new Author( "kien","kiennguyenvan483@gmail.com",'m');
        Author author2 = new Author("Vankien","nguyenvankien060106@gmail.com",'m');
        Author author3 = new Author( "nguyenvankien","kiennv.24itb@vku.udn.vn",'m');
        authors[0] = author1;
        authors[1] = author2;
        authors[2] = author3;
        System.out.println( authors[0].getName() );
        System.out.println( authors[1].getName() );
        System.out.println( authors[2].getName() );
    }
}
