package bsu.rfe.java.group6.lab1.Biran.var4a;

import java.util.Locale;

public class Potato extends Food {
    @Override // явное переопределение метода
    public boolean equals(Object obj) {
        if (!(obj instanceof Potato)){
            return false;
        }
        if (fill == null || ((Potato)obj).fill == null){
            return false;
        }
        if(!(fill.equals(((Potato) obj).fill))){
            return false;
        }

        return super.equals(obj);
    }

    private String fill;

    public String getFilling(){
        return fill;
    }

    public void setFilling(String fill){
        this.fill = fill;
    }

    public Potato(String fill){
        super ("Картофель");
        checkValidFill(fill);
        this.fill = fill;
    }

    public void checkValidFill(String fill) {
        switch (fill.toLowerCase(Locale.ROOT)) {
            case "жареный":
            case "фри":
            case "вареный":
                break;
            default:
                throw new IllegalArgumentException("invalid value");
        }

    }

    public void consume(){
        System.out.println(this + " съеден");
    }

    @Override
    public String toString() {
        return "Картофель{" + "тип=" + fill + '\''+'}' ;
    }

}
