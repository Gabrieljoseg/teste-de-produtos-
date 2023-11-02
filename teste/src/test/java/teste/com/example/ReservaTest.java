package teste;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;

public class ReservaTest {

    @Test
    public void testCriacaoReserva() {
        // Criação dos mocks
        Hospede hospede = mock(Hospede.class);
        Quarto quarto = mock(Quarto.class);

        // Instância de Reserva com mocks
        Reserva reserva = new Reserva(hospede, quarto, LocalDate.now(), LocalDate.now().plusDays(1));

        // Definindo comportamento dos mocks
        when(quarto.isDisponivel()).thenReturn(false);

        // Teste de assert
        assertFalse(quarto.isDisponivel());

        // Verificação de interações
        verify(quarto).setDisponivel(false);
    }

    @Test
    public void testReservaCheckInCheckOut() {
        // Crie objetos mock para Hospede e Quarto
        Hospede hospedeMock = mock(Hospede.class);
        Quarto quartoMock = mock(Quarto.class);

        // Crie uma instância de Reserva
        LocalDate checkIn = LocalDate.of(2023, 11, 1);
        LocalDate checkOut = LocalDate.of(2023, 11, 5);
        Reserva reserva = new Reserva(hospedeMock, quartoMock, checkIn, checkOut);

        // Verifique se os métodos getCheckIn e getCheckOut retornam os valores esperados
        assertEquals(checkIn, reserva.getCheckIn());
        assertEquals(checkOut, reserva.getCheckOut());
    }

    @Test
    public void testReservaQuartoNaoDisponivel() {
        // Crie objetos mock para Hospede e Quarto
        Hospede hospedeMock = mock(Hospede.class);
        Quarto quartoMock = mock(Quarto.class);

        // Crie uma instância de Reserva
        LocalDate checkIn = LocalDate.of(2023, 11, 1);
        LocalDate checkOut = LocalDate.of(2023, 11, 5);
        Reserva reserva = new Reserva(hospedeMock, quartoMock, checkIn, checkOut);

        // Verifique se o método setDisponivel(false) foi chamado no objeto Quarto
        verify(quartoMock).setDisponivel(false);
    }

    @Test
    public void testGetHospede() {
        // Crie um objeto mock para Hospede
        Hospede hospedeMock = mock(Hospede.class);
        Quarto quartoMock = mock(Quarto.class);

        // Crie uma instância de Reserva
        Reserva reserva = new Reserva(hospedeMock, quartoMock, LocalDate.now(), LocalDate.now());

        // Verifique se o método getHospede retorna o objeto mock de Hospede
        assertEquals(hospedeMock, reserva.getHospede());
    }

    @Test
    public void testGetQuarto() {
        // Crie objetos mock para Hospede e Quarto
        Hospede hospedeMock = mock(Hospede.class);
        Quarto quartoMock = mock(Quarto.class);

        // Crie uma instância de Reserva
        Reserva reserva = new Reserva(hospedeMock, quartoMock, LocalDate.now(), LocalDate.now());

        // Verifique se o método getQuarto retorna o objeto mock de Quarto
        assertEquals(quartoMock, reserva.getQuarto());
    }
}