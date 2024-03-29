package Domain;

public class Reservation
{
    private static long id_static_rezervare;
    private long reservationId;
    private long idFilm;
    private long id_card_client;
    private String airingDateTime; //(dd.mm.yyyy HH:mm)

    public Reservation(long reservationId, long idFilm, long id_card_client, String airingDateTime) {
        this.reservationId = id_static_rezervare;
        id_static_rezervare = id_static_rezervare + 1;
        this.idFilm = idFilm;
        this.id_card_client = id_card_client;
        this.airingDateTime = airingDateTime;
    }

    public long getReservationId() {
        return reservationId;
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

    public String getAiringDateTime() {
        return airingDateTime;
    }

    public void setAiringDateTime(String airingDateTime) {
        this.airingDateTime = airingDateTime;
    }
}
