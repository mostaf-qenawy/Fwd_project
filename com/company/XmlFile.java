package com.company;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class XmlFile {
    public void xmlReader () throws IOException {
        BufferedReader br;
        FileWriter fw ;
        String data = null;
        try {
            br = new BufferedReader(new FileReader("C:\\Users\\EXPERTS\\OneDrive\\Desktop\\first project\\coursedata.xml"));
            fw = new FileWriter("C:\\Users\\EXPERTS\\OneDrive\\Desktop\\first project\\outputxml.csv");
            String line = br.readLine();
            while (line != null) {
                //System.out.println(line.substring(line.indexOf("<")+1, line.lastIndexOf(">")));
                if (line.contains("row")) {
                    System.out.println();
                    //fw.write("\n");
                }
                Pattern pattern = Pattern.compile(">(.*?)</");
                Matcher mr = pattern.matcher(line);
                while (mr.find()) {
                    System.out.print(mr.group(1) + " , ");
                    data = mr.group(1); 
                }
                fw.write((String) data);
                line = br.readLine();
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }


    }
