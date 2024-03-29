package Domain;

public class Reservation
{
    private static long id_static_rezervare;
    private long idRezervare;
    private long idFilm;
    private long id_card_client;
    private String dataSiOra; //(dd.mm.yyyy HH:mm)

    public Reservation(long idRezervare, long idFilm, long id_card_client, String dataSiOra) {
        this.idRezervare = id_static_rezervare;
        id_static_rezervare = id_static_rezervare + 1;
        this.idFilm = idFilm;
        this.id_card_client = id_card_client;
        this.dataSiOra = dataSiOra;
    }

    public long getIdRezervare() {
        return idRezervare;
    }

    public long getIdFilm() {
        return idFilm;
    }

    public void setIdFilm(long idFilm) {
        this.idFilm = idFilm;
    }

    public long getId_card_client() {
        return id_card_client;
    }

    public void setId_card_client(long id_card_client) {
        this.id_card_client = id_card_client;
    }

    public String getDataSiOra() {
        return dataSiOra;
    }

    public void setDataSiOra(String dataSiOra) {
        this.dataSiOra = dataSiOra;
    }
}
