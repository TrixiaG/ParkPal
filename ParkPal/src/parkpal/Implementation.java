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
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
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
    static String loadingStatus = null;
    static ArrayList<String> data = new ArrayList<>();
    static Queue<String> queue1 = new LinkedList<>();
    static Queue<String> queue2 = new LinkedList<>();
    static Stack<String> stackLoading = new Stack<>();
    static String date = null;
    static int noCus = 0;
    static int noPwd = 0;
    static int noAvail = 150;
    //private BinarySearchTree bst = new BinarySearchTree();
    private String query = "";

    public static String getLoadingStatus() {
        return loadingStatus;
    }

    public static void setLoadingStatus(String loadingStatus) {
        Implementation.loadingStatus = loadingStatus;
    }
    
    private static DefaultTableModel t;
    
    private JTable table = new JTable();
    
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
    
    public static Queue<String> getQueue1() {
        return queue1;
    }

    public static void setQueue1(Queue<String> queue1) {
        Implementation.queue1 = queue1;
    }

    public static Queue<String> getQueue2() {
        return queue2;
    }

    public static void setQueue2(Queue<String> queue2) {
        Implementation.queue2 = queue2;
    }
    
    public static int getNoAvail() {
        return noAvail;
    }

    public static void setNoAvail(int noAvail) {
        Implementation.noAvail = noAvail;
    }

    public static int getNoCus() {
        return noCus;
    }

    public static void setNoCus(int noCus) {
        Implementation.noCus = noCus;
    }

    public static int getNoPwd() {
        return noPwd;
    }

    public static void setNoPwd(int noPwd) {
        Implementation.noPwd = noPwd;
    }
    
    public static DefaultTableModel gett() {
        return t;
    }
    
    public static void sett(DefaultTableModel model) {
        t = model;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
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
      
    public void getCustomers(ArrayList<String> data) {
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
                noCus++;
            }
            setNoCus(noCus);
            scanner.close();
            System.out.println(noCus);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        data.clear();
    }
    public void getPwd(ArrayList<String> data) {
        int n = data.size();
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
                if (isPwd_Sen || havePwd_Sen) {
                    noPwd++;
                }
            }
            setNoPwd(noPwd);
            scanner.close();
            System.out.println(noPwd);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        data.clear();
    }
    
    public void getAvail(ArrayList<String> data) {
        int n = data.size();
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
                if (noCus > 0) {
                    noAvail++;
                }                    

            }
            setNoAvail(noAvail);
            scanner.close();
            System.out.println(noAvail);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        data.clear();
    }
    
    
    
    //===================================================================
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
    
    public void Queuing(){
        if (isPwd_Sen == true || havePwd_Sen == true) {
            queue1.add(pnum);
            try {
                FileWriter fw = new FileWriter("gate1.txt",true);
                BufferedWriter bw = new BufferedWriter(fw);
                String joinedString = String.join("\n", pnum);
                bw.write(joinedString);
                bw.newLine();
                bw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else{
            queue2.add(pnum);
            if(queue2.size() <= 29){
                try {
                    FileWriter fw = new FileWriter("gate2.txt",true);
                    BufferedWriter bw = new BufferedWriter(fw);
                    String joinedString = String.join("\n", pnum);
                    bw.write(joinedString);
                    bw.newLine();
                    bw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }else if(queue2.size() == 30){
                try {
                    FileWriter fw = new FileWriter("gate3.txt",true);
                    BufferedWriter bw = new BufferedWriter(fw);
                    String joinedString = String.join("\n", pnum);
                    bw.write(joinedString);
                    bw.newLine();
                    bw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }else if(queue2.size() == 60){
                try {
                    FileWriter fw = new FileWriter("gate4.txt",true);
                    BufferedWriter bw = new BufferedWriter(fw);
                    String joinedString = String.join("\n", pnum);
                    bw.write(joinedString);
                    bw.newLine();
                    bw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }else if(queue2.size() == 90){
                try {
                    FileWriter fw = new FileWriter("gate5.txt",true);
                    BufferedWriter bw = new BufferedWriter(fw);
                    String joinedString = String.join("\n", pnum);
                    bw.write(joinedString);
                    bw.newLine();
                    bw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } 
        }
        System.out.println(queue1);
        System.out.println(queue2);
        queue1.clear();
        queue2.clear();
    }
    public void StackingClose(){
        if(stackLoading.isEmpty()){
            stackLoading.push("Finishing Up...");
            stackLoading.push("Connection Successful...");
            stackLoading.push("Connecting to Database...");
            stackLoading.push("Loading Modules...");
            stackLoading.push("Turning On Modules...");
        }
        System.out.println(stackLoading);
    }
    public static void addStack(){
        String[] text = {"Finishing Up...", "Connection Successful...", "Connecting to Database...", "Loading Modules...", "Turning On Modules..."};
        for(int i = 0; i < 5; i++){
            stackLoading.add(text[i]);
        }
        System.out.println(stackLoading);
    }
    public static void StackingOpen(){
        System.out.println(stackLoading);
        if(!stackLoading.isEmpty()){
            loadingStatus = stackLoading.pop();
        }  
    }
    
    //=====================================================
//    public void setSearchTable(JTable searchTable) {
//        table = searchTable;
//        t = (DefaultTableModel) table.getModel();
//                  System.out.println("Table model: " + t);
//    }
//
//    public static void populateTable(List<String> data) {
//        clearTable();
//        for (String line : data) {
//            String[] fields = line.split(", ");
//            t.addRow(fields);
//        }
//    }
//
//    private static void clearTable() {
//        if (t != null) {
//            int rowCount = t.getRowCount();
//            for (int i = rowCount - 1; i >= 0; i--) {
//                t.removeRow(i);
//            }
//        }
//    }
//
//    public void search() {
//        BinarySearchTree bst = new BinarySearchTree();
//        ArrayList<String> data = readData2();
//        for (String line : data) {
//            bst.insert(line);
//        }
//
//        List<String> results = bst.search(query);
//                  System.out.println("Results: " + results);
//        updateTable(results);
//    }
//    private void updateTable(List<String> results) {
//        DefaultTableModel model = new DefaultTableModel();
//        model.setColumnIdentifiers(new String[] { "First Name", "Last Name", "Mobile Number", "Phone Number", "Vehicle Type", "Is Password Set", "Have Password Set", "Date" });
//
//        for (String result : results) {
//            String[] fields = result.split(", ");
//            if (matchesQuery(fields)) {
//                model.addRow(fields);
//            }
//        }
//
//        table.setModel(model);
//    }
//
//    private boolean matchesQuery(String[] fields) {
//        //DELETE
//        System.out.println("Query: " + query);
//        System.out.println("Fields[0]: " + fields[0]);
//        
//        // Assuming the query is based on the first column (fname)
//        if (fields.length > 0 && fields[0].equalsIgnoreCase(query)) {
//            return true;
//        }
//        return false;
//    }
//
//    public static ArrayList<String> readData2() {
//        ArrayList<String> data = new ArrayList<>();
//
//        try {
//            Scanner scanner = new Scanner(new File(FILENAME));
//            while (scanner.hasNextLine()) {
//                String line = scanner.nextLine();
//                String[] fields = line.split(", ");
//                String fname = fields[0];
//                String lname = fields[1];
//                String mnum = fields[2];
//                String pnum = fields[3];
//                String vtype = fields[4];
//                boolean isPwd_Sen = Boolean.valueOf(fields[5]);
//                boolean havePwd_Sen = Boolean.valueOf(fields[6]);
//                String date = fields[7];
//                String dataLine = fname + ", " + lname + ", " + mnum + ", " + pnum + ", " + vtype + ", " + isPwd_Sen + ", " + havePwd_Sen + ", " + date;
//                data.add(dataLine);
//            }
//            scanner.close();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//          System.out.println("Data: " + data);
//        return data;
//        
//    }
//    //===================================================
//    public class BinarySearchTree {
//       private Node root;
//
//       public BinarySearchTree() {
//           root = null;
//       }
//
//       public void insert(String data) {
//           root = insertRecursive(root, data);
//       }
//
//       private Node insertRecursive(Node root, String data) {
//           if (root == null) {
//               return new Node(data);
//           }
//
//           int compareResult = data.compareTo(root.data);
//           if (compareResult < 0) {
//               root.left = insertRecursive(root.left, data);
//           } else if (compareResult > 0) {
//               root.right = insertRecursive(root.right, data);
//           }
//
//           return root;
//       }
//
//       public List<String> search(String query) {
//           List<String> results = new ArrayList<>();
//           searchRecursive(root, query, results);
//           return results;
//       }
//
//       private void searchRecursive(Node root, String query, List<String> results) {
//           if (root == null) {
//               return;
//           }
//
//           String[] fields = root.data.split(", ");
//           String fname = fields[0];
//
//           int compareResult = query.compareTo(fname);
//
//           if (compareResult == 0) {
//               results.add(root.data);
//           } else if (compareResult < 0) {
//               searchRecursive(root.left, query, results);
//           } else {
//               searchRecursive(root.right, query, results);
//           }
//       }
//
//       public void postOrderTraversal() {
//           postOrderTraversal(root);
//       }
//
//       private void postOrderTraversal(Node root) {
//           if (root == null) {
//               return;
//           }
//
//           postOrderTraversal(root.left);
//           postOrderTraversal(root.right);
//           System.out.println(root.data);
//       }
//
//       private class Node {
//           private String data;
//           private Node left;
//           private Node right;
//
//           public Node(String data) {
//               this.data = data;
//               left = null;
//               right = null;
//           }
//       }
//   }
}

