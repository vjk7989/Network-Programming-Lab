package lab_np1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class CharGen {
    int bufferLength = 72;
    int startCharCode = 33;
    int endCharCode = 126;

    public void writeAscii(OutputStream out) throws IOException {
        int start = startCharCode;
        while (start <= endCharCode - bufferLength) {
            for (int i = start; i <= start + bufferLength; i++) {
                out.write(i);
            }
            out.write('\r');
            out.write('\n');
            ++start;
        }
    }

    public static void main(String[] args) throws IOException {
        OutputStream fout = new FileOutputStream("./hello.txt");
        CharGen cg = new CharGen();
        int ll =0;
        long d1 = System.nanoTime();
        int noOfIterations = 50; //edit here
        while(ll<=noOfIterations) {
        cg.writeAscii((OutputStream) System.out);
        ll++;}
        long d2 = System.nanoTime();
        System.out.println(d2-d1);
        fout.close();
    }
}
