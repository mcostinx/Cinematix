package Domain;

public class ClientCard
{
    private static long id_static_cardclient;
    private long idCard;
    private String firstName;
    private String lastName;
    private int CNP;
    private String dataNasterii;  //dd.mm.yyyy   -> sa facem o clasa pentru data
    private String dataInregistrarii; //dd.mm.yyyy

    public ClientCard(long idCard, String firstName, String lastName, int CNP, String dataNasterii, String dataInregistrarii) {
        this.idCard = id_static_cardclient;
        id_static_cardclient = id_static_cardclient + 1;   //nu stiu alta metoda simpla sa avem iduri unice
        this.firstName = firstName;
        this.lastName = lastName;
        this.CNP = CNP;                //la adaugare, editare trebuuie sa verificam sa fie unic
        this.dataNasterii = dataNasterii;
        this.dataInregistrarii = dataInregistrarii;
    }

    public String getFirstName() {
        return firstName;
    }

    public long getIdCard() {
        return idCard;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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
