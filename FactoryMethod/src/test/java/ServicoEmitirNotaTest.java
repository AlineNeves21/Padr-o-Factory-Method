import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ServicoEmitirNotaTest {

    @Test
    void deveExecutarNota(){
        IServico servico = ServicoFactory.obterServico("EmitirNota");
        assertEquals("Nota emitida", servico.executar());
    }

    @Test
    void deveCancelarNota(){
        IServico servico = ServicoFactory.obterServico("EmitirNota");
        assertEquals("Nota cancelada", servico.cancelar());
    }
}
