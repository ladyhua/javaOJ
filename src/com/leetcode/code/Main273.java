package com.leetcode.code;
//AC
public class Main273 {
    public String numberToWords(int num) {
        if(num == 0) return "Zero";
        int b = num / 1000000000;
        int first = num / 1000000 % 1000;
        int second = num / 1000 % 1000;
        int third = num % 1000;
        String sFirst = helper(first);
        String sSecond = helper(second);
        String sThird = helper(third);
        StringBuilder res = new StringBuilder();
        String sB = helper(b);
        if(sB.length() != 0) {
            res.append(sB).append(" Billion");
        }
        if(sFirst.length() != 0) {
            if(res.length() != 0) {
                res.append(" ");
            }
            res.append(sFirst).append(" Million");
        }
        if(sSecond.length() != 0) {
            if(res.length() != 0) {
                res.append(" ");
            }
            res.append(sSecond).append(" Thousand");
        }
        if(sThird.length() != 0) {
            if(res.length() != 0) {
                res.append(" ");
            }
                res.append(sThird);
        }
        return res.toString();
    }
    public String helper(int num) {
        StringBuilder res = new StringBuilder();
        int first = num / 100;
        int second = num / 10 % 10;
        int third = num % 10;
        String sFirst = helper1(first);
        if(sFirst.length() != 0) {
            res.append(sFirst).append(" Hundred");
        }
        String sSecond = helper2(second,third);
        if(sSecond.length() != 0) {
            if(res.length() != 0) {
                res.append(" ");
            }
            res.append(sSecond);
        }
        if(second == 1) return res.toString();
        String sThird = helper1(third);
        if(sThird.length() != 0) {
            if(res.length() != 0) {
                res.append(" ");
            }
            res.append(sThird);
        }
        return res.toString();
    }
    public String helper1(int num) {
        switch(num) {
            case 0 : return "";
            case 1 : return "One";
            case 2 : return "Two";
            case 3 : return "Three";
            case 4 : return "Four";
            case 5 : return "Five";
            case 6 : return "Six";
            case 7 : return "Seven";
            case 8 : return "Eight";
            case 9 : return "Nine";
            default : return "";
        }
    }
    public String helper2(int num,int num1) {
       StringBuilder res = new StringBuilder();
        switch(num) {
            case 0 : break;
            case 1 : res.append(helper3(num1));return res.toString();
            case 2 : res.append("Twenty");break;
            case 3 : res.append("Thirty");break;
            case 4 : res.append("Forty");break;
            case 5 : res.append("Fifty");break;
            case 6 : res.append("Sixty");break;
            case 7 : res.append("Seventy");break;
            case 8 : res.append("Eighty");break;
            case 9 : res.append("Ninety");break;
        }
        return res.toString();
    }
    public String helper3(int num) {
        switch(num) {
            case 0 : return "Ten";
            case 1 : return "Eleven";
            case 2 : return "Twelve";
            case 3 : return "Thirteen";
            case 4 : return "Fourteen";
            case 5 : return "Fifteen";
            case 6 : return "Sixteen";
            case 7 : return "Seventeen";
            case 8 : return "Eighteen";
            case 9 : return "Nineteen";
            default : return "";
        }
    }
}