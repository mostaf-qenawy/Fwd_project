package com.company;

import java.io.*;

public class TextFile  {
    BufferedReader br ;
    FileWriter fw;
    public  void  file_reader() throws IOException {
        try {
            br = new BufferedReader(new FileReader("C:\\Users\\EXPERTS\\OneDrive\\Desktop\\first project\\student-data.txt"));
            fw = new FileWriter("C:\\Users\\EXPERTS\\OneDrive\\Desktop\\first project\\output.csv");
            int c=0;
            //int id=1;
            //fw.write("id , ");
            //System.out.print("id, ");
            while ((c = br.read()) != -1) {
                if (((char) c) == '#') {
                    fw.write(" " + ',' + " ");
                    System.out.print(" " + ',' + " ");
                } else if (((char) c) == '$') {
                    fw.write("\n");
                    //fw.write(id +" , ");
                    System.out.println();
                    //System.out.print(id +" , ");
                    //id++;
                } else {
                   fw.write((char) c);
                    System.out.print((char) c);
                }
            }
            fw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    }


