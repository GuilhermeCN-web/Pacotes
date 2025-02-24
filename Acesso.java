public class Acesso {
    public int publico = 1;
    protected int protegido = 2;
    int pacotePrivado = 3;
    private int privado = 4;

    public int getPrivado() {
        return privado;
    }

    public void setPrivado(int valor) {
        this.privado = valor;
    }

    public int getPublico() {
        return publico;
    }

    public void setPublico(int publico) {
        this.publico = publico;
    }

    public int getProtegido() {
        return protegido;
    }

    public void setProtegido(int protegido) {
        this.protegido = protegido;
    }

    public int getPacotePrivado() {
        return pacotePrivado;
    }

    public void setPacotePrivado(int pacotePrivado) {
        this.pacotePrivado = pacotePrivado;
    }
}
