public class CelularesInfo {

    private String modelo;
    private String marca;
    private String cor;
    private int armazenamento;
    private double preco;
    private int ano;

    public CelularesInfo(String modelo, String marca, String cor, int armazenamento, double preco, int ano){
        this.modelo = modelo;
        this.marca = marca;
        this.cor = cor;
        this.armazenamento = armazenamento;
        this.preco = preco;
        this.ano = ano;
    }

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca(){
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getArmazenamento() {
        return armazenamento;
    }
    public void setArmazenamento(int armazenamento) {
        this.armazenamento = armazenamento;
    }

    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }

    public String toString() {
        return "Modelo: "+getModelo()+"\nMarca: "+getMarca()+"\nCor: "+getCor()+"\nArmazenamento: "+getArmazenamento()+
                "\nR$ "+getPreco()+"\nAno: "+getAno();
    }
}
