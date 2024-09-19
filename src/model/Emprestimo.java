package model;

public class Emprestimo {

    private int idEmprestimo;
    private String nomeEmprestimo;
    private String dataEmprestimo;
    private String horaEmprestimo;
    private String diaRetornoEmprestimo;
    private String descEmprestimo;
    private Autor autor;

    public Emprestimo() {

    }

    public Emprestimo(int idEmprestimo, String nomeEmprestimo, String dataEmprestimo, String horaEmprestimo, String diaRetornoEmprestimo, String descEmprestimo) {
        this.idEmprestimo = idEmprestimo;
        this.nomeEmprestimo = nomeEmprestimo;
        this.dataEmprestimo = dataEmprestimo;
        this.horaEmprestimo = horaEmprestimo;
        this.diaRetornoEmprestimo = diaRetornoEmprestimo;
        this.descEmprestimo = descEmprestimo;
    }

    public int getIdEmprestimo() {
        return idEmprestimo;
    }

    public void setIdEmprestimo(int idEmprestimo) {
        this.idEmprestimo = idEmprestimo;
    }

    public String getNomeEmprestimo() {
        return nomeEmprestimo;
    }

    public void setNomeEmprestimo(String nomeEmprestimo) {
        this.nomeEmprestimo = nomeEmprestimo;
    }

    public String getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(String dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public String getHoraEmprestimo() {
        return horaEmprestimo;
    }

    public void setHoraEmprestimo(String horaEmprestimo) {
        this.horaEmprestimo = horaEmprestimo;
    }

    public String getDiaRetornoEmprestimo() {
        return diaRetornoEmprestimo;
    }

    public void setDiaRetornoEmprestimo(String diaRetornoEmprestimo) {
        this.diaRetornoEmprestimo = diaRetornoEmprestimo;
    }

    public String getDescEmprestimo() {
        return descEmprestimo;
    }

    public void setDescEmprestimo(String descEmprestimo) {
        this.descEmprestimo = descEmprestimo;
    }

    @Override
    public String toString() {
        return "~~EMPRESTIMO~~\n" +
                "Id: " + idEmprestimo + "\n" +
                "Nome: " + nomeEmprestimo + "\n" +
                "Dia do Emprestimo: " + dataEmprestimo + "\n" +
                "Hora: " + horaEmprestimo + "\n" +
                "Dia retorno: " + diaRetornoEmprestimo + "\n" +
                "Nome do Livro: " + descEmprestimo + "\n";
    }
}
