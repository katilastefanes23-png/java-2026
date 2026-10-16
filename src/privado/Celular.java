package privado;

public class Celular {
    private String marca;
    private String modelo;
    private int ano;

    // Construtor parametrizado/personalizado
    public Celular (String marca, String modelo, int ano) {
        this.setMArca(marca);
        this.setModelo(modelo);
        this.setAno(ano);
    }

    public String getMarca () {
        if (this.marca == null) {
            return "Marca ainda não foi definido!";
        }
        return this.marca;
    }

    public String getmodelo () {
        return this.modelo;
    }

    public int getAno () {
        return this.ano;
    }

    public void setMArca (String marca) {
        this.marca = marca;
    }

    public void setModelo (String modelo) {
        this.modelo = modelo;
    }

    public void setAno (int ano) {
        this.ano = ano;
    }
}
