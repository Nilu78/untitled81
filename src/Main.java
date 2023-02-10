import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Objects;

public class Main {
    public static <IOException extends Throwable> void main(String[] args) throws IOException, java.io.IOException {
        FileInputStream fis = null;
        try{
            fis = new FileInputStream("B:/my file.txt");
        }catch(FileNotFoundException fnfe){
            System.out.println("The specified file is not " +
                    "present at the given path");
        }
        int k;
        while(( k = Objects.requireNonNull(fis).read() ) != -1)
            System.out.print((char) k);
        fis.close();
    }

}


