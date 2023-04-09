/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parkpal;

/**
 *
 * @author PC
 */
public class Implementation{
    static String fname = null;
    static String lname = null;
    static String mnum = null;
    static String pnum = null;
    static String vtype = null;
    static boolean isPwd_Sen = false;
    static boolean havePwd_Sen = false;

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

    
    public void Print(){
        System.out.println(fname + " " + lname + " " + mnum + " " + pnum + " " + vtype + " " + isPwd_Sen + " " + havePwd_Sen);
    }
    
}
