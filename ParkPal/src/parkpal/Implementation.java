/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parkpal;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

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
    ArrayList<String> data = new ArrayList<String>();
    static String date = null;

    public ArrayList<String> getData() {
        return data;
    }

    public void setData(ArrayList<String> data) {
        this.data = data;
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
        
        try {
            FileWriter fw = new FileWriter(FILENAME);
            BufferedWriter bw = new BufferedWriter(fw);
            String joinedString = String.join(", ", data);
            bw.write(joinedString);
            bw.newLine();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
