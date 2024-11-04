import org.TemplateMethod.Edicao;
import org.TemplateMethod.EdicaoJornal;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EdicaoJornalTest {

    @Test
    public void devePrepararEdicaoJornal() {
        Edicao edicao = new EdicaoJornal();
        edicao.setTitulo("Edição Matinal");
        edicao.setDataPublicacao("2024-11-03");

        String resultadoEsperado = "Conteúdo do Jornal Selecionado\n" +
                "Conteúdo do Jornal Revisado\n" +
                "Conteúdo do Jornal Formatado\n" +
                "Edição Publicada";

        assertEquals(resultadoEsperado, edicao.prepararEdicao());
    }
}
