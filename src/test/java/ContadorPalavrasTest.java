import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.observer.impl.ContadorPalavras;

public class ContadorPalavrasTest {

    @Test
    public void CalcularPalavras1Test() {
        ContadorPalavras contadorPalavras = new ContadorPalavras("Frase de Teste");
        assertEquals(contadorPalavras.CalcularPalavras(), 3);
    }

    @Test
    public void CalcularPalavrasCaracteresPares1Test() {
        ContadorPalavras contadorPalavras = new ContadorPalavras("Frase de Teste");
        assertEquals(contadorPalavras.CalcularPalavrasCaracteresPares(), 1);
    }

    @Test
    public void CalcularPalavrasPrimeiraLetraMaiuscula1Test() {
        ContadorPalavras contadorPalavras = new ContadorPalavras("Frase de Teste");
        assertEquals(contadorPalavras.CalcularPalavrasPrimeiraLetraMaiuscula(), 2);
    }

    @Test
    public void CalcularPalavras2Teste() {
        ContadorPalavras contadorPalavras = new ContadorPalavras("Outra Frase ParA testes");
        assertEquals(contadorPalavras.CalcularPalavras(), 4);
    }

    @Test
    public void CalcularPalavrasCaracteresPares2Test() {
        ContadorPalavras contadorPalavras = new ContadorPalavras("Outra Frase ParA testes");
        assertEquals(contadorPalavras.CalcularPalavrasCaracteresPares(), 2);
    }

    @Test
    public void CalcularPalavrasPrimeiraLetraMaiuscula2Test() {
        ContadorPalavras contadorPalavras = new ContadorPalavras("Outra Frase ParA testes");
        assertEquals(contadorPalavras.CalcularPalavrasPrimeiraLetraMaiuscula(), 3);
    }
}
