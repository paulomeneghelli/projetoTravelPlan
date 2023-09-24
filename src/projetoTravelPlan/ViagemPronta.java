package projetoTravelPlan;

import java.util.ArrayList;
import java.util.List;

public class ViagemPronta {

	private List<String> infos;
	private double valorTotal;

	public List<String> getInfos() {
		return infos;
	}

	public void setData(List<String> infos) {
		this.infos = infos;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}
	
	// JANEIRO ATE ABRIL
	List<String> destinosNacionaisJaneiroAbril = new ArrayList<>();
	{
		destinosNacionaisJaneiroAbril.add("Rio de Janeiro");
		destinosNacionaisJaneiroAbril.add("Salvador");
		destinosNacionaisJaneiroAbril.add("Florianópolis");
		destinosNacionaisJaneiroAbril.add("Fortaleza");
		destinosNacionaisJaneiroAbril.add("Curitiba");
	}
	
	List<String> destinosInternacionaisJaneiroAbril = new ArrayList<>();
	{
		destinosInternacionaisJaneiroAbril.add("Cancún, México");
		destinosInternacionaisJaneiroAbril.add("Paris, França");
		destinosInternacionaisJaneiroAbril.add("Nova Iorque, Estados Unidos");
		destinosInternacionaisJaneiroAbril.add("Tóquio, Japão");
		destinosInternacionaisJaneiroAbril.add("Barcelona, Espanha");
	}

	List<String> datasJaneiroAbril = new ArrayList<>();
	{
		datasJaneiroAbril.add("10 de Janeiro");
		datasJaneiroAbril.add("2 de Fevereiro");
		datasJaneiroAbril.add("25 de Fevereiro");
		datasJaneiroAbril.add("14 de Março");
		datasJaneiroAbril.add("19 de Abril");
	}

	List<String> atracoesJaneiroAbril = new ArrayList<>();
	{
		atracoesJaneiroAbril.add("Praias paradisíacas");
		atracoesJaneiroAbril.add("Trilhas na mata");
		atracoesJaneiroAbril.add("Festas locais");
		atracoesJaneiroAbril.add("Feiras de Alimentos e Bebidas");
		atracoesJaneiroAbril.add("Piqueniques e Churrascos em Parques");
	}

	// MAIO ATE AGOSTO
	List<String> datasMaioAgosto = new ArrayList<>();
	{
		datasMaioAgosto.add("5 de Maio");
		datasMaioAgosto.add("11 de Junho");
		datasMaioAgosto.add("3 de Julho");
		datasMaioAgosto.add("20 de Julho");
		datasMaioAgosto.add("22 de Agosto");
	}
	
	List<String> destinosNacionaisMaioAgosto = new ArrayList<>();
	{
		destinosNacionaisMaioAgosto.add("Gramado");
		destinosNacionaisMaioAgosto.add("Recife");
		destinosNacionaisMaioAgosto.add("Foz do Iguaçu");
		destinosNacionaisMaioAgosto.add("Manaus");
		destinosNacionaisMaioAgosto.add("Brasília");
	}
	
	List<String> destinosInternacionaisMaioAgosto = new ArrayList<>();
	{
		destinosInternacionaisMaioAgosto.add("Bali, Indonésia");
		destinosInternacionaisMaioAgosto.add("Roma, Itália");
		destinosInternacionaisMaioAgosto.add("Vancouver, Canadá");
		destinosInternacionaisMaioAgosto.add("Sydney, Austrália");
		destinosInternacionaisMaioAgosto.add("Istambul, Turquia");
	}
	
	List<String> atracoesMaioAgosto = new ArrayList<>();
	{
		atracoesMaioAgosto.add("Festivais de Música ao Ar Livre");
		atracoesMaioAgosto.add("Passeios de Barco");
		atracoesMaioAgosto.add("Parques Temáticos");
		atracoesMaioAgosto.add("Museus de Arte");
		atracoesMaioAgosto.add("Observação de Baleias");
	}
	
	
	// SETEMBRO ATÉ DEZEMBRO
	List<String> datasSetembroDezembro = new ArrayList<>();
	{
		datasSetembroDezembro.add("5 de Maio");
		datasSetembroDezembro.add("11 de Junho");
		datasSetembroDezembro.add("3 de Julho");
		datasSetembroDezembro.add("20 de Julho");
		datasSetembroDezembro.add("22 de Agosto");
	}
	
	List<String> destinosNacionaisSetembroDezembro = new ArrayList<>();
	{
		destinosNacionaisSetembroDezembro.add("Jericoacoara");
		destinosNacionaisSetembroDezembro.add("Bonito");
		destinosNacionaisSetembroDezembro.add("Fernando de Noronha");
		destinosNacionaisSetembroDezembro.add("Belo Horizonte");
		destinosNacionaisSetembroDezembro.add("Campos do Jordão");
	}
	
	List<String> destinosInternacionaisSetembroDezembro = new ArrayList<>();
	{
		destinosInternacionaisSetembroDezembro.add("Atenas, Grécia");
		destinosInternacionaisSetembroDezembro.add("Cairo, Egito");
		destinosInternacionaisSetembroDezembro.add("Amsterdã, Holanda");
		destinosInternacionaisSetembroDezembro.add("Dubai, Emirados Árabes Unidos");
		destinosInternacionaisSetembroDezembro.add("Toronto, Canadá");
	}
	
	List<String> atracoesSetembroDezembro = new ArrayList<>();
	{
		atracoesSetembroDezembro.add("Foliões de Outono");
		atracoesSetembroDezembro.add("Festivais de Vinho e Cerveja");
		atracoesSetembroDezembro.add("Visitas a Vinícolas");
		atracoesSetembroDezembro.add("Mercados de Natal");
		atracoesSetembroDezembro.add("Pistas de Patinação no Gelo ao Ar Livre");
	}

}