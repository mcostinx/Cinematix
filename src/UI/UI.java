package UI;


import Service.Service;

public class UI
{
    Service service = new Service();
    public void LinesDesign()
    {
        System.out.println("------------------------------------------------------");
    }
    public void MainMenu()
    {
        int option;
        LinesDesign();
        System.out.println("Bine ai venit in Cinematrix!");
        System.out.println("1. Filme");
        System.out.println("2. Domain.Rezervare");
        System.out.println("3. Card Client");
        System.out.println(" ");
        System.out.println("0. Iesire");
        System.out.println("Te rog sa introduci un numar pentru a alege optiunea");
        LinesDesign();
        option = DataTypeValidation.readInt(0,3);

        switch (option){
            case 1:
                FilmMenu();
                break;
            case 2:
                RezervareMenu();
                break;
            case 3:
                CardClientMenu();
                break;
            case 0:
                return;
            default:
                System.out.println("Te rog sa introduci o optiune valida");
                MainMenu();
        }
    }

    public void FilmMenu()
    {
        int option;
        LinesDesign();
        System.out.println("Operatii Filme");
        System.out.println("");
        System.out.println("1. Adauga un film nou");
        System.out.println("2. Editeaza datele filmului");
        System.out.println("3. Cauta un film");
        System.out.println("4. Sterge un film ");
        System.out.println("");
        System.out.println("0. Iesire");
        System.out.println("Te rog sa introduci un numar pentru a alege optiunea");
        System.out.println("");
        LinesDesign();
        option = DataTypeValidation.readInt(0,4);


        switch (option){
            case 1:
                AddFilmMenu();
                break;
            case 2:
                //EditFilm();
                break;
            case 3:
                //SearchFilm();
                break;
            case 4:
                //DeleteFilm();
                break;
            case 0:
                MainMenu();
            default:
                System.out.println("Te rog sa introduci o optiune valida");
                FilmMenu();
        }
    }

    public void RezervareMenu()
    {
        int option;
        LinesDesign();
        System.out.println("Operatii Domain.Rezervare");
        System.out.println("");
        System.out.println("1. Adauga o rezervare");
        System.out.println("2. Modifica rezervarea");
        System.out.println("3. Cauta o rezervare");
        System.out.println("4. Sterge o rezervare ");
        System.out.println("");
        System.out.println("0. Iesire");
        System.out.println("Te rog sa introduci un numar pentru a alege optiunea");
        System.out.println("");
        option = DataTypeValidation.readInt(0,4);
        LinesDesign();

        switch (option){
            case 1:
                //AdaugaRezervare();
                break;
            case 2:
                //EditareRezervare();
                break;
            case 3:
                //CautaRezervare();
                break;
            case 4:
                //stergeRezervare();
                break;
            case 0:
                MainMenu();
            default:
                System.out.println("Te rog sa introduci o optiune valida");
                RezervareMenu();
        }
    }

    public void CardClientMenu()
    {
        int option;
        LinesDesign();
        System.out.println("Operatii Card Client");
        System.out.println("");
        System.out.println("1. Adauga un card");
        System.out.println("2. Modifica datele cardului");
        System.out.println("3. Cauta o rezervare");
        System.out.println("4. Sterge o rezervare ");
        System.out.println("");
        System.out.println("0. Iesire");
        System.out.println("Te rog sa introduci un numar pentru a alege optiunea");
        System.out.println("");
        option = DataTypeValidation.readInt(0,4);
        LinesDesign();

        switch (option){
            case 1:
                //AdaugaRezervare();
                break;
            case 2:
                //EditareRezervare();
                break;
            case 3:
                //CautaRezervare();
                break;
            case 4:
                //stergeRezervare();
                break;
            case 0:
                MainMenu();
            default:
                System.out.println("Te rog sa introduci o optiune valida");
                CardClientMenu();
        }
    }

    public void AddFilmMenu()
    {
        String titlu;
        int an;
        int Program;
        boolean inProgram;
        double pretBilet;
        int opt;

        LinesDesign();
        System.out.println("Adaugare film");
        System.out.println("Titlu: ");
        titlu = DataTypeValidation.readString();
        System.out.println("An: ");
        an = DataTypeValidation.readInt(0,5000);
        System.out.println("Este in Program?  (1 - adevarat/ 0 - fals): ");
        Program = DataTypeValidation.readInt();
            while(true) {
              if (Program == 1) {
                    inProgram = true;
                  break;
               }
         else if (Program == 0)
             {
                 inProgram = false;
                 break;
               }
          else
              {
                  System.out.println("Te rog sa introduci 1 pentru adevarat sau 0 pentru fals");
              }
           }
        System.out.println("Pret: ");
        pretBilet = DataTypeValidation.readDouble(0,999);
        System.out.println("");
        System.out.println("1. Adauga Film");
        System.out.println("0. Inapoi");
        opt = DataTypeValidation.readInt(0,1);
        switch (opt)
        {
            case 1:
                service.AddFilm(titlu,an,inProgram,pretBilet);
                FilmMenu();
                break;
            case 0:
                FilmMenu();
        }


        LinesDesign();
    }

}
