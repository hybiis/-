package ch08_09_10;

public class P9_03 {
    public static void main(String[] args) {

        String fullPath = "c:\\jdk1.8\\work\\PathSeparateTest.java";

        String path = "";

        String fileName = "";

        int pos = fullPath.lastIndexOf("\\");

        if(pos!=-1) {
            path = fullPath.substring(0, pos);

            fileName = fullPath.substring(pos+1);

        }

        System.out.println("fullPath:" + fullPath);

        System.out.println("path:" + path);

        System.out.println("fileName:" + fileName);

    }
}
