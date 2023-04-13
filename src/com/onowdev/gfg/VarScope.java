package com.onowdev.gfg;

public class VarScope {
    static int x = 90;
    private  int y = 78;
    public void method1(int x){
        VarScope t = new VarScope();
        this.x = 22;
        y = 55;

        System.out.println("VarScope.x = " +VarScope.x);
        System.out.println("t.x = " + t.x);
        System.out.println("t.y = " + t.y);
        System.out.println("y = " + y);
    }

    public static void main(String[] args) {
        VarScope t = new VarScope();
        t.method1(5);
    }
}
