package org.TemplateMethod;

public class EdicaoRevista extends Edicao {

    @Override
    protected String selecionarConteudo() {
        return "Conteúdo da Revista Selecionado";
    }

    @Override
    protected String revisarConteudo() {
        return "Conteúdo da Revista Revisado";
    }

    @Override
    protected String formatarConteudo() {
        return "Conteúdo da Revista Formatado";
    }
}
