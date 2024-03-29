package Service;

import Domain.Film;
import Repository.Repository;

public class Service
{
    Repository repo = new Repository();

        /////TODO: for Aki please refactor these variables

    public void AddFilm(String titlu, int an, boolean inProgram, double pretBilet)
    {
        if(pretBilet>0 & an>1880)
        {
            Film filmDeAduagat = new Film(titlu, an, inProgram, pretBilet);
            repo.addFilm(filmDeAduagat);
            System.out.println("Film adaugat cu success!");
            System.out.println(repo.movieList);
        }
    }
    public void showMovies() {
        if (!repo.movieList.isEmpty()) {
            for (Film film : repo.movieList) {
                System.out.println(film);
            }
        }
            else {
                System.out.println("Nu exista filme in lista!");
            }

    }
    public void addrezervare(){

    }
    public void addcard(){

    }
}
