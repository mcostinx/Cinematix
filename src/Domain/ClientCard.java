package Domain;

public class ClientCard
{
    private static long id_static_cardclient;
    private long idCard;
    private String firstName;
    private String lastName;
    private int CNP;
    private String birthDate;  //dd.mm.yyyy   -> sa facem o clasa pentru data
    private String registeredDate; //dd.mm.yyyy

    public ClientCard(long idCard, String firstName, String lastName, int CNP, String birthDate, String registeredDate) {
        this.idCard = id_static_cardclient;
        id_static_cardclient = id_static_cardclient + 1;   //nu stiu alta metoda simpla sa avem iduri unice
        this.firstName = firstName;
        this.lastName = lastName;
        this.CNP = CNP;                //la adaugare, editare trebuuie sa verificam sa fie unic
        this.birthDate = birthDate;
        this.registeredDate = registeredDate;
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

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getRegisteredDate() {
        return registeredDate;
    }

    public void setRegisteredDate(String registeredDate) {
        this.registeredDate = registeredDate;
    }
}
