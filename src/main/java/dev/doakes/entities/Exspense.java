package dev.doakes.entities;

import java.util.ArrayList;
import java.util.List;

public class Exspense {
    private int Eid;
    private int Expsid;
    private double exspenseAmount;
    List<exspeneAmount> exspeneAmounts= new ArrayList<>();
    exspenseAmounts.add(19.60);
    exspenseAmounts.add(30.00);
    exspenseAmounts.add(25.00);

    public List<exspeneAmount> getExspeneAmounts() {
        return exspeneAmounts;
    }

    public void setExspenseAmount(double exspenseAmount) {
        this.exspenseAmount = exspenseAmount;
    }

    public int getEid() {
        return Eid;
    }

    public void setEid(int eid) {
        Eid = eid;
    }

    public int getExpsid() {
        return Expsid;
    }

    public Exspense(int expsid) {
        Expsid = expsid;
    }
}
