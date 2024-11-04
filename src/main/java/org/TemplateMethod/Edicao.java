package org.TemplateMethod;

public abstract class Edicao {

    private String titulo;
    private String dataPublicacao;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDataPublicacao() {
        return dataPublicacao;
    }

    public void setDataPublicacao(String dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }

    public final String prepararEdicao() {
        return selecionarConteudo() + "\n" + revisarConteudo() + "\n" + formatarConteudo() + "\n" + publicarEdicao();
    }

    protected abstract String selecionarConteudo();
    protected abstract String revisarConteudo();
    protected abstract String formatarConteudo();

    private String publicarEdicao() {
        return "Edição Publicada";
    }
}
