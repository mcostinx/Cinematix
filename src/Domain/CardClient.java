package Domain;

public class CardClient
{
    private static long id_static_cardclient;
    private long idCard;
    private String nume;
    private String prenume;
    private int CNP;
    private String dataNasterii;  //dd.mm.yyyy   -> sa facem o clasa pentru data
    private String dataInregistrarii; //dd.mm.yyyy

    public CardClient(long idCard, String nume, String prenume, int CNP, String dataNasterii, String dataInregistrarii) {
        this.idCard = id_static_cardclient;
        id_static_cardclient = id_static_cardclient + 1;   //nu stiu alta metoda simpla sa avem iduri unice
        this.nume = nume;
        this.prenume = prenume;
        this.CNP = CNP;                //la adaugare, editare trebuuie sa verificam sa fie unic
        this.dataNasterii = dataNasterii;
        this.dataInregistrarii = dataInregistrarii;
    }

    public String getNume() {
        return nume;
    }

    public long getIdCard() {
        return idCard;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public int getCNP() {
        return CNP;
    }

    public void setCNP(int CNP) {
        this.CNP = CNP;     //trebuie sa fie unic
    }

    public String getDataNasterii() {
        return dataNasterii;
    }

    public void setDataNasterii(String dataNasterii) {
        this.dataNasterii = dataNasterii;
    }

    public String getDataInregistrarii() {
        return dataInregistrarii;
    }

    public void setDataInregistrarii(String dataInregistrarii) {
        this.dataInregistrarii = dataInregistrarii;
    }
}
