package Repository;

import Domain.CardClient;
import Domain.Film;
import Domain.Rezervare;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;


public class Repository
{
   public ArrayList<Film> listaFilme;
   private ArrayList<Rezervare> listaRezervari;
   private ArrayList<CardClient> listaCarduri;

    public Repository() {
        this.listaFilme = new ArrayList<>(100);
        this.listaRezervari = new ArrayList<>(100);
        this.listaCarduri = new ArrayList<>(100);
    }

    public void addFilm(Film film)
    {
        this.listaFilme.add(film);
    }

    private void addRezervare(Rezervare rezervare)
    {
        this.listaRezervari.add(rezervare);
    }

    private void addCardClient(CardClient cardClient)
    {
        this.listaCarduri.add(cardClient);
    }

    public ArrayList<Film> getListaFilme() {
        return listaFilme;
    }

    public ArrayList<Rezervare> getListaRezervari() {
        return listaRezervari;
    }

    public ArrayList<CardClient> getListaCarduri() {
        return listaCarduri;
    }
}
