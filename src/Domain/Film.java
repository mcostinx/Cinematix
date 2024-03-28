package Domain;

public class Film
{
   private static long id_static_film;
    private long idFilm;
    private String titlu;
    private  int an;
    private  boolean inProgram;
    private  double pretBilet;

    public Film(String titlu, int an, boolean inProgram, double pretBilet) {
        if(pretBilet<0)
        {
            System.out.println("Pretul biletului nu poate sa fie negativ");
            return;
        }
        this.idFilm = id_static_film;
        id_static_film = id_static_film +1;
        this.titlu = titlu;
        this.an = an;
        this.inProgram = inProgram;
        this.pretBilet = pretBilet;
    }

    public long getIdFilm() {
        return idFilm;
    }


    public String getTitlu() {
        return titlu;
    }

    public void setTitlu(String titlu) {
        this.titlu = titlu;
    }

    public int getAn() {
        return an;
    }

    public void setAn(int an) {
        this.an = an;
    }

    public boolean isInProgram() {
        return inProgram;
    }

    public void setInProgram(boolean inProgram) {
        this.inProgram = inProgram;
    }

    public double getPretBilet() {
        return pretBilet;
    }

    public void setPretBilet(double pretBilet) {
        this.pretBilet = pretBilet;
    }
}
