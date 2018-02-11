package src;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
/**
 * FileLoader handles the loading/reading of text files  
 *
 * @author Dequito, Christian and Mercado, Candace 
 * @since 2017-07-28
 */
public class FileLoader
{
    /**
     * This method read the text file and throws an exception when not found.
     * 
     * @param path The filename of the text file
     * @return The string from the file
     */
    public static String loadFileAsString(String path)
    {
        StringBuilder builder = new StringBuilder();
        
        try{
            BufferedReader br = new BufferedReader(new FileReader(path));
            String line; 
            while((line = br.readLine())!=null)
                builder.append(line + "\n");
            br.close();
                    
        }catch(IOException e){
            e.printStackTrace();
        }
       return builder.toString();
    }
    /**
     * This method converts the integer from the text file and throws an exception when not found.
     * 
     * @param n The integer from the file
     * @return The integer converted from the file
     */
    public static int parseInt(String n)
    {
        try{
            return Integer.parseInt(n);
        }catch(NumberFormatException e){
            e.printStackTrace();
            return 0;
        }
    }
}
