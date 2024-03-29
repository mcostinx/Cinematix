package Repository;

import Domain.ClientCard;
import Domain.Film;
import Domain.Reservation;

import java.util.ArrayList;

//bla bla bla
<<<<<<< HEAD
=======
//789

>>>>>>> testing
public class Repository
{
   public ArrayList<Film> movieList;
   private ArrayList<Reservation> reservationList;
   private ArrayList<ClientCard> cardList;

    public Repository() {
        this.movieList = new ArrayList<>(100);
        this.reservationList = new ArrayList<>(100);
        this.cardList = new ArrayList<>(100);
    }

    public void addFilm(Film film)
    {
        this.movieList.add(film);
    }

    private void addRezervare(Reservation reservation)
    {
        this.reservationList.add(reservation);
    }

    private void addCardClient(ClientCard cardClient)
    {
        this.cardList.add(cardClient);
    }

    public ArrayList<Film> getMovieList() {
        return movieList;
    }

    public ArrayList<Reservation> getReservationList() {
        return reservationList;
    }

    public ArrayList<ClientCard> getCardList() {
        return cardList;
    }
}
