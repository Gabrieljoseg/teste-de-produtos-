package teste;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class HospedeTest {

    @Test
    public void testInformacoesHospede() {
        // Criação do mock
        Hospede hospede = mock(Hospede.class);

        // Definindo comportamento do mock
        when(hospede.getNome()).thenReturn("John Doe");

        // Teste de assert
        assertEquals("John Doe", hospede.getNome());

        // Verificação de interações
        verify(hospede).getNome();
    }

    @Test
    public void testConstrutorHospede() {
        // Preparação
        String nome = "João";
        String documentoIdentidade = "123456789";
        String contato = "joao@email.com";

        // Cria uma instância da classe Hospede
        Hospede hospede = new Hospede(nome, documentoIdentidade, contato);

        // Verifica se os valores dos atributos foram definidos corretamente
        assertEquals(nome, hospede.getNome());
        assertEquals(documentoIdentidade, hospede.getDocumentoIdentidade());
        assertEquals(contato, hospede.getContato());
    }

    @Test
    public void testGetNome() {
        String nome = "João";
        String documentoIdentidade = "123456789";
        String contato = "joao@email.com";

        Hospede hospede = new Hospede(nome, documentoIdentidade, contato);

        // Teste o método getNome
        assertEquals(nome, hospede.getNome());
    }

    @Test
    public void testGetDocumentoIdentidade() {
        String nome = "Maria";
        String documentoIdentidade = "987654321";
        String contato = "maria@email.com";

        Hospede hospede = new Hospede(nome, documentoIdentidade, contato);

        // Teste o método getDocumentoIdentidade
        assertEquals(documentoIdentidade, hospede.getDocumentoIdentidade());
    }

    @Test
    public void testGetContato() {
        String nome = "Pedro";
        String documentoIdentidade = "555555555";
        String contato = "pedro@email.com";

        Hospede hospede = new Hospede(nome, documentoIdentidade, contato);

        // Teste o método getContato
        assertEquals(contato, hospede.getContato());
    }
}