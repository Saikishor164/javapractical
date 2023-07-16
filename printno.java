import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class printno {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        
        if (input != null) {
            int n = Integer.parseInt(input);
            
            for (int i = 1; i <= n; ++i) {
                System.out.println("No." + i);
                System.out.flush(); // Flush the output to ensure immediate display
            }
        } else {
            System.out.println("Invalid input. Please provide a valid number.");
        }
        
        br.close();
    }
}
