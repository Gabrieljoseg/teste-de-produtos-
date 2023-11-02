package teste;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class QuartoTest {

    @Test
    public void testDisponibilidadeQuarto() {
        Quarto quarto = mock(Quarto.class);

        when(quarto.isDisponivel()).thenReturn(true);

        assertTrue(quarto.isDisponivel());

        verify(quarto).isDisponivel();
    }

    @Test
    public void testReservaQuartoDisponivel() {
        Quarto quartoMock = mock(Quarto.class);
        when(quartoMock.isDisponivel()).thenReturn(true);

        Hotel hotel = new Hotel();
        boolean resultado = hotel.reservarQuarto(quartoMock);

        verify(quartoMock).isDisponivel();
        verify(quartoMock).setDisponivel(false);
        assert resultado; 
    }

    @Test
    public void testReservaQuartoNaoDisponivel() {
        Quarto quartoMock = mock(Quarto.class);
        when(quartoMock.isDisponivel()).thenReturn(false);

        Hotel hotel = new Hotel();
        boolean resultado = hotel.reservarQuarto(quartoMock);

        verify(quartoMock).isDisponivel();
        verify(quartoMock, Mockito.never()).setDisponivel(false); 
        assert !resultado; 
    }

    @Test
    public void testDisponibilidadeInicialQuarto() {
        Quarto quartoMock = Mockito.mock(Quarto.class);
        when(quartoMock.isDisponivel()).thenReturn(true);

        assert quartoMock.isDisponivel(); 

        verify(quartoMock).isDisponivel();
    }

    @Test
    public void testSetDisponibilidadeQuarto() {
        Quarto quartoMock = Mockito.mock(Quarto.class);
        quartoMock.setDisponivel(false);

        assert !quartoMock.isDisponivel(); 

        verify(quartoMock).setDisponivel(false);
    }
}