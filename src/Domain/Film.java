package Domain;

public class Film
{
   private static long id_static_film;
    private long idFilm;
    private String movieTitle;
    private  int releaseYear;
    private  boolean inProgram;
    private  double ticketPrice;

    public Film(String movieTitle, int releaseYear, boolean inProgram, double ticketPrice) {
        if(ticketPrice <0)
        {
            System.out.println("Pretul biletului nu poate sa fie negativ");
            return;
        }
        this.idFilm = id_static_film;
        id_static_film = id_static_film +1;
        this.movieTitle = movieTitle;
        this.releaseYear = releaseYear;
        this.inProgram = inProgram;
        this.ticketPrice = ticketPrice;
    }

    public long getIdFilm() {
        return idFilm;
    }


    public String getMovieTitle() {
        return movieTitle;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public boolean isInProgram() {
        return inProgram;
    }

    public void setInProgram(boolean inProgram) {
        this.inProgram = inProgram;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }
}
