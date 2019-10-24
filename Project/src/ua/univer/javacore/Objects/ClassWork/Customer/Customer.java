package ua.univer.javacore.Objects.ClassWork.Customer;

public class Customer {
    private int id;
    private String fio;
    private String adres;
    private int creditcn;
    private int bankcount;

    Customer(int id, String fio, String adres, int creditcn, int bankcount) {
        this.id = id;
        this.fio = fio;
        this.adres = adres;
        this.creditcn = creditcn;
        this.bankcount = bankcount;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getFio() {
        return fio;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getAdres() {
        return adres;
    }

    public void setCreditcn(int creditcn) {
        this.creditcn = creditcn;
    }

    public int getCreditcn() {
        return creditcn;
    }

    public void setBankcount(int bankcount) {
        this.bankcount = bankcount;
    }

    public int getBankcount() {
        return bankcount;
    }

    public void print() {
        System.out.println("ID : " + this.id + "  FIO : " + this.fio + " Adres : " + this.adres + " Credit CN : " + this.creditcn + " Bankcount : " + this.bankcount);
    }
}
