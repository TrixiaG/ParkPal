/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parkpal;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Implementation{
    static final String FILENAME = "data.txt";
    static String fname = null;
    static String lname = null;
    static String mnum = null;
    static String pnum = null;
    static String vtype = null;
    static boolean isPwd_Sen = false;
    static boolean havePwd_Sen = false;
    static ArrayList<String> data = new ArrayList<String>();
    static String date = null;

    public static ArrayList<String> getData() {
        return data;
    }

    public static void setData(ArrayList<String> data) {
        Implementation.data = data;
    }

    public static String getDate() {
        return date;
    }

    public static void setDate(String date) {
        Implementation.date = date;
    }

    public static String getFname() {
        return fname;
    }

    public static void setFname(String fname) {
        Implementation.fname = fname;
    }

    public static String getLname() {
        return lname;
    }

    public static void setLname(String lname) {
        Implementation.lname = lname;
    }

    public static String getMnum() {
        return mnum;
    }

    public static void setMnum(String mnum) {
        Implementation.mnum = mnum;
    }

    public static String getPnum() {
        return pnum;
    }

    public static void setPnum(String pnum) {
        Implementation.pnum = pnum;
    }

    public static String getVtype() {
        return vtype;
    }

    public static void setVtype(String vtype) {
        Implementation.vtype = vtype;
    }

    public static boolean isIsPwd_Sen() {
        return isPwd_Sen;
    }

    public static void setIsPwd_Sen(boolean isPwd_Sen) {
        Implementation.isPwd_Sen = isPwd_Sen;
    }

    public static boolean isHavePwd_Sen() {
        return havePwd_Sen;
    }

    public static void setHavePwd_Sen(boolean havePwd_Sen) {
        Implementation.havePwd_Sen = havePwd_Sen;
    }
    
    public void saveData(){
        data.add(Implementation.getFname());
        data.add(Implementation.getLname());
        data.add(Implementation.getMnum());
        data.add(Implementation.getPnum());
        data.add(Implementation.getVtype());
        data.add(String.valueOf(Implementation.isIsPwd_Sen()));
        data.add(String.valueOf(Implementation.isHavePwd_Sen()));
        data.add(Implementation.getDate());
        
        try {
            FileWriter fw = new FileWriter(FILENAME,true);
            BufferedWriter bw = new BufferedWriter(fw);
            String joinedString = String.join(", ", data);
            bw.write(joinedString);
            bw.newLine();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        data.clear();
    }
    public static void readData() {
        try {
            Scanner scanner = new Scanner(new File(FILENAME));
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] fields = line.split(", ");
            fname = fields[0];
            lname = fields[1];
            mnum = fields[2];
            pnum = fields[3];
            vtype = fields[4];
            isPwd_Sen = Boolean.valueOf(fields[5]);
            havePwd_Sen = Boolean.valueOf(fields[6]);
            date = fields[7];
            String dataLine = fname + ", " + lname + ", " + mnum + ", " + pnum + ", " + vtype + ", " + isPwd_Sen + ", " + havePwd_Sen + ", " + date;
            data.add(dataLine);
        }
        scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static void InsertSort(ArrayList<String> data) {
        int n = data.size();
        for (int i = 1; i < n; i++) {
            String key = data.get(i);
            int j = i - 1;
            while (j >= 0 && compare(data.get(j), key) > 0) {
                data.set(j + 1, data.get(j));
                j--;
        }
        data.set(j + 1, key);
        }
        try {
            File file = new File("insertion.txt");
            if (file.exists()) {
                file.delete();
            }
            FileWriter writer = new FileWriter(file);
            for (String line : data) {
                writer.write(line + "\n");
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        data.clear();
    }

    private static int compare(String s1, String s2) {
        String[] fields1 = s1.split(", ");
        String[] fields2 = s2.split(", ");
        return fields1[0].compareTo(fields2[0]);
    }
    
    public static void SelectSort(ArrayList<String> data) {
        int n = data.size();
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (compareLastNames(data.get(j), data.get(minIndex)) < 0) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                String temp = data.get(i);
                data.set(i, data.get(minIndex));
                data.set(minIndex, temp);
            }
        }
        try {
            File file = new File("selection.txt");
            if (file.exists()) {
                file.delete();
            }
            FileWriter writer = new FileWriter(file);
            for (String line : data) {
                writer.write(line + "\n");
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        data.clear();
    }

    private static int compareLastNames(String s1, String s2) {
        String[] fields1 = s1.split(", ");
        String[] fields2 = s2.split(", ");
        return fields1[1].compareTo(fields2[1]);
    }
    public static void bubbleSort(ArrayList<String> data) {
        int n = data.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                String plate1 = data.get(j).split(", ")[3];
                String plate2 = data.get(j + 1).split(", ")[3];
                if (plate1.compareTo(plate2) > 0) {
                    String temp = data.get(j);
                    data.set(j, data.get(j + 1));
                    data.set(j + 1, temp);
                }
            }
        }
        try {
            File file = new File("bubble.txt");
            if (file.exists()) {
                file.delete();
            }
            FileWriter writer = new FileWriter(file);
            for (String line : data) {
                writer.write(line + "\n");
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        data.clear();
    }
    public static void InsertSort2(ArrayList<String> data) {
        int n = data.size();
        for (int i = 1; i < n; i++) {
            String key = data.get(i);
            int j = i - 1;
            while (j >= 0 && compare2(data.get(j), key) > 0) {
                data.set(j + 1, data.get(j));
                j--;
        }
        data.set(j + 1, key);
        }
        try {
            File file = new File("insertion2.txt");
            if (file.exists()) {
                file.delete();
            }
            FileWriter writer = new FileWriter(file);
            for (String line : data) {
                writer.write(line + "\n");
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        data.clear();
    }

    private static int compare2(String s1, String s2) {
        String[] fields1 = s1.split(", ");
        String[] fields2 = s2.split(", ");
        return fields1[4].compareTo(fields2[4]);
    }
    public static void selectSortByDate(ArrayList<String> data) {
        int n = data.size();
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (compareDate(data.get(j), data.get(minIndex)) < 0) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                String temp = data.get(i);
                data.set(i, data.get(minIndex));
                data.set(minIndex, temp);
            }
        }

        try {
            File file = new File("selection_by_date.txt");
            if (file.exists()) {
                file.delete();
            }
            FileWriter writer = new FileWriter(file);
            for (String line : data) {
                writer.write(line + "\n");
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        data.clear();
    }

    private static int compareDate(String s1, String s2) {
        String[] fields1 = s1.split(", ");
        String[] fields2 = s2.split(", ");
        String[] date1 = fields1[7].split("-");
        String[] date2 = fields2[7].split("-");
        int year1 = Integer.parseInt(date1[0]);
        int year2 = Integer.parseInt(date2[0]);
        if (year1 != year2) {
            return year1 - year2;
        }
        int month1 = Integer.parseInt(date1[1]);
        int month2 = Integer.parseInt(date2[1]);
        if (month1 != month2) {
            return month1 - month2;
        }
        int day1 = Integer.parseInt(date1[2]);
        int day2 = Integer.parseInt(date2[2]);
        return day1 - day2;
    }

} 
