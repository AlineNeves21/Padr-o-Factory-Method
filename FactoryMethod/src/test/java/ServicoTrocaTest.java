import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ServicoTrocaTest {

    @Test
    void deveExecutarTroca(){
        IServico servico = ServicoFactory.obterServico("Troca");
        assertEquals("Troca realizada", servico.executar());
    }

    @Test
    void deveCancelarTroca(){
        IServico servico = ServicoFactory.obterServico("Troca");
        assertEquals("Troca cancelada", servico.cancelar());
    }
}
