package Implemtaion;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class impOne {
    BufferedReader br;
    public void header() {
        System.out.println("------------------------------- " + '\n' + " Current  Student  List " + '\n' + "-------------------------------");
    }

    public void imp_one() throws IOException {
        String data = null;
        try {
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\EXPERTS\\OneDrive\\Desktop\\first project\\output.csv"));
            String line;
            line= br.readLine() ;
                        for (int r = 0; r < 100; r++) {
                            if (r == 0) {
                                String newline[] = line.split(",");
                                //System.out.println(newline[1]);
                                data = newline[0] + "    " + newline[1] + "    " +newline[2] + "        " +newline[3] + "      " +newline[4] + "     " +newline[5] +"     " + newline[6];
                                System.out.println(data);
                                line = br.readLine();
                            } else {
                                //System.out.println(line);
                                String newline[] = line.split(",");
                                //System.out.println(newline[1]);
                                data =  newline[0] +" " + newline[1] + "," +newline[2]+ "," + newline[3] + ","+ newline[4] + ","+ newline[5] + ","+ newline[6];
                                System.out.println(data);
                                line = br.readLine();
                            }

                    }
            return;
            }

               /* String newline[] = line.split(",");
                for (int i = 0; i <= newline.length; i++) {
                    String[] r = newline[i].split(",");
                    if (i != 0) {
                        for (int k = 0; k < r.length-1; k++) {
                            data += (r[0] = r[0].replace(',', '-')) + r[1] ;
                        }
                        System.out.println(data);
                    }
                }*/ catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}

