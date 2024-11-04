package org.TemplateMethod;

public class EdicaoJornal extends Edicao {

    @Override
    protected String selecionarConteudo() {
        return "Conteúdo do Jornal Selecionado";
    }

    @Override
    protected String revisarConteudo() {
        return "Conteúdo do Jornal Revisado";
    }

    @Override
    protected String formatarConteudo() {
        return "Conteúdo do Jornal Formatado";
    }
}
