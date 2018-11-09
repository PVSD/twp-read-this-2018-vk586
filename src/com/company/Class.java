package com.company;

public class Class {

    private static String students [];
    private static int grades [];
    private static int absences [];

    public Class(String [] s, int [] g, int [] a) {
        students = s;
        grades = g;
        absences = a;
    }

    public double getAverage() {
        double average = 0;
        for (int i = 0; i < students.length; i++) {
            average = average + grades[i];
        }
        average = average / grades.length;
        return average;
    }

    public String getNOG() {
        int a = 0, b = 0, c = 0, d = 0, f = 0;
        for (int i = 0; i < students.length; i++) {
            if (grades[i] >= 90) {
                a++;
            }
            else if (grades[i] >= 80) {
                b++;
            }
            else if (grades[i] >= 70) {
                c++;
            }
            else if (grades[i] >= 60) {
                d++;
            }
            else {
                f++;
            }
        }
        return "A: " + a + "\n"
                + "B: " + b + "\n"
                + "C: " + c + "\n"
                + "D: " + d + "\n"
                + "F: " + f + "\n";
    }

    public String getInfo(String s) {
        String info = "Student not found.";
        int index = -1;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(s)) {
                index = i;
            }
        }
        if (index >= 0) {
            info = "Student name: " + students[index] + "\n" +
                    "Average: " + grades[index] + "%\n" +
                    "Class Rank: " + classRank(index) + "\n" +
                    "# of Absences: " + absences[index] + warnAbsence(index);
        }
        return info;
    }

    private String warnAbsence(int i) {
        String status = "";
        if (absences[i] >= 15) {
            status = "\n** WARNING: This student has a high number of absences" +
                    " which may affect their grade.";
        }
        return status;
    }

    private String classRank(int i) {
        int rank = students.length/2;
        for (int j = 0; j < students.length; j++) {
            if (grades[i] > grades[j] && i != j) {
                //Not working properly
            }
        }
        return rank + "/" + students.length;
    }
}
