
package modelo;

/**
 *
 * @author Carlos
 */
public class Cliente {
    
    private static int numCliente = 0;
    private String nombreCliente;
    private int numComensales;

    public Cliente(int numCliente,String nombreCliente, int numAcompanantes) {
        this.numCliente = numCliente;
        this.nombreCliente = nombreCliente;
        this.numComensales = numAcompanantes;
    }
    
    public Cliente(){
        this.numCliente = 0;
        this.nombreCliente = null;
        this.numComensales = 0;
    }

    
    //Metodos get
    
    public int getNumCliente() {
        return numCliente;
    }
    
    public String getNombreCliente(){
        return nombreCliente;
    }

    public int getNumAcompanantes() {
        return numComensales;
    }
    
    //Metodos set
    
    
    public void setNombreCliente(String nombreCliente){
        this.nombreCliente = nombreCliente;
    }

    public void setNumAcompanantes(int numAcompanantes) {
        this.numComensales = numAcompanantes;
    }
    /**
     * @param numCliente 
     * Metodo estatico que va sumando 1 al numero de cliente
     */
        
    public static void numeroCliente(int numCliente){
        numCliente++;
    }

    
}
