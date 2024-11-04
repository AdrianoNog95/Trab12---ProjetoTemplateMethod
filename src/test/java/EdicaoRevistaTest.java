import org.TemplateMethod.Edicao;
import org.TemplateMethod.EdicaoRevista;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EdicaoRevistaTest {

    @Test
    public void devePrepararEdicaoRevista() {
        Edicao edicao = new EdicaoRevista();
        edicao.setTitulo("Edição Mensal");
        edicao.setDataPublicacao("2024-11-03");

        String resultadoEsperado = "Conteúdo da Revista Selecionado\n" +
                "Conteúdo da Revista Revisado\n" +
                "Conteúdo da Revista Formatado\n" +
                "Edição Publicada";

        assertEquals(resultadoEsperado, edicao.prepararEdicao());
    }
}
