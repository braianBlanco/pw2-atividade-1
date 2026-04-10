import Enums.CondicaoTempoEnum;
import Enums.FasesDaLuaEnum;

import java.time.LocalDateTime;

public class PrevisaoTempo {
    public String cidade;
    public LocalDateTime data;
    public String resumo;
    public Temperatura temperatura;
    public Vento vento;
    public FasesDaLuaEnum lua;
    public CondicaoTempoEnum condicao;
    public double probabilidadeChuva;
    public double umidadeMinima;
    public double umidadeMaxima;

}
