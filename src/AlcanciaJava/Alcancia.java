package AlcanciaJava;

public class Alcancia {
	
	private int numeroMonedas50;    
    private int numeroMonedas100;
    private int numeroMonedas200;
    private int numeroMonedas500;
    private int numeroMonedas1000;
    	
	public Alcancia( )
    {
        numeroMonedas50 = 0;
        numeroMonedas100 = 0;
        numeroMonedas200 = 0;
        numeroMonedas500 = 0;
        numeroMonedas1000 = 0;
    }
	
	public void ReiniciarAlcancia( )
    {
        numeroMonedas50 = 0;
        numeroMonedas100 = 0;
        numeroMonedas200 = 0;
        numeroMonedas500 = 0;
        numeroMonedas1000 = 0;
    }
	
	public int numeroMonedas50( )
    {
        return numeroMonedas50;
    }
	
	public int numeroMonedas100( )
    {
        return numeroMonedas100;
    }
	
    public int numeroMonedas200( )
    {
        return numeroMonedas200;
    }
    
    public int numeroMonedas500( )
    {
        return numeroMonedas500;
    }

    public int numeroMonedas1000( )
    {
        return numeroMonedas1000;
    }

    public int calcularTotalCantidad( )
    {
        return numeroMonedas50 + numeroMonedas100 + numeroMonedas200 + numeroMonedas500 + numeroMonedas1000;
    }
    
    public int calcularTotalDinero( )
    {
        return numeroMonedas50 * 50 + numeroMonedas100 * 100 + numeroMonedas200 * 200 + numeroMonedas500 * 500 + numeroMonedas1000 * 1000;
    }

    public String darEstadoAlcancia( )
    {
        int totalDinero = calcularTotalDinero( );

        return "La alcancía tiene: \n " + numeroMonedas50 + " moneda(s) de $50 \n " + numeroMonedas100 + " moneda(s) de $100 \n " + numeroMonedas200 + " moneda(s) de $200 \n " + numeroMonedas500 + " moneda(s) de $500 \n " + numeroMonedas1000
                + " moneda(s) de $1000 \n " + "Para un total de $" + totalDinero + " pesos.";
    }

    public void agregarMoneda50( )
    {
        numeroMonedas50 = numeroMonedas50 + 1;
        
    }

    public void agregarMoneda100( )
    {
        numeroMonedas100 = numeroMonedas100 + 1;
    }

    public void agregarMoneda200( )
    {
        numeroMonedas200 = numeroMonedas200 + 1;
    }

    public void agregarMoneda500( )
    {
        numeroMonedas500 = numeroMonedas500 + 1;
    }

    public void agregarMoneda1000( )
    {
        numeroMonedas1000 = numeroMonedas1000 + 1;
    }    
}
