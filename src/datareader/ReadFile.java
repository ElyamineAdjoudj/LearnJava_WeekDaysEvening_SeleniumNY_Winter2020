package datareader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

    public static void main(String[] args)  {
        FileReader fileReader=null;
        BufferedReader bufferedReader=null;

        String filePath="../LearnJava_WeekDaysEvening_SeleniumNY_Winter2020/DataTest/Sample.txt";

        try{
            fileReader=new FileReader(filePath);
            bufferedReader=new BufferedReader(fileReader);

            String data;
            while ((data=bufferedReader.readLine())!=null){
                System.out.println(data);
            }

        }catch (Exception e){
            //e.printStackTrace();
            System.out.println("File not Found ");

        } finally {

           try {
               fileReader.close();
               bufferedReader.close();
           } catch (Exception e){
               //e.printStackTrace();
               System.out.println("File Already closed");
           }



        }
















    }





}
