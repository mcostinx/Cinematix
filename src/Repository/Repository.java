package Repository;

import Domain.ClientCard;
import Domain.Film;
import Domain.Reservation;

import java.util.ArrayList;


public class Repository
{
   public ArrayList<Film> listaFilme;
   private ArrayList<Reservation> listaRezervari;
   private ArrayList<ClientCard> listaCarduri;

    public Repository() {
        this.listaFilme = new ArrayList<>(100);
        this.listaRezervari = new ArrayList<>(100);
        this.listaCarduri = new ArrayList<>(100);
    }

    public void addFilm(Film film)
    {
        this.listaFilme.add(film);
    }

    private void addRezervare(Reservation reservation)
    {
        this.listaRezervari.add(reservation);
    }

    private void addCardClient(ClientCard cardClient)
    {
        this.listaCarduri.add(cardClient);
    }

    public ArrayList<Film> getListaFilme() {
        return listaFilme;
    }

    public ArrayList<Reservation> getListaRezervari() {
        return listaRezervari;
    }

    public ArrayList<ClientCard> getListaCarduri() {
        return listaCarduri;
    }
}
