package aula.relasiclass.tugas;

/**
 *
 * @author Aulafz
 */
public class Film {

    private int idFilm;
    private String judul;

    public Film(int idFilm) {
        this.idFilm = idFilm;
    }

    public void setJudul(int idFilm) {
        switch (idFilm) {
            case 1:
                this.judul = "The Invisible Man";
                break;
            case 2:
                this.judul = "Mulan";
                break;
            case 3:
                this.judul = "I Still Believe";
                break;
            default:
                System.out.println("Pilihan anda tidak termasuk dalam list.");
        }
    }

    public String getJudul() {
        return judul;
    }

    public String info() {
        setJudul(this.idFilm);
        getJudul();
        String info = "";
        info += "Judul          : " + judul;
        return info;
    }
}
