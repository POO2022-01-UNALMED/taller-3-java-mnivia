package televisores;

public class TV {
	
	private Marca marca;
	private int canal;
	private int precio;
	private boolean estado;
	private int volumen;
	private Control control;
	
	static int numTV; 
	
	public TV(Marca marca, boolean estado) {
		this.marca = marca;
		this.estado = estado;
		this.canal =1;
		this.volumen=1;
		this.precio=500;
		numTV+=1; //Cuenta la creacion de los televisores	
	}


	public Marca getMarca() {
		return marca;
	}


	public void setMarca(Marca marca) {
		this.marca = marca;
	}


	public int getCanal() {
		return canal;
	}


	public void setCanal(int canal) {
		if(estado && canal>=0 && canal<120) {
			this.canal = canal;
		}		
	}


	public int getPrecio() {
		return precio;
	}


	public void setPrecio(int precio) {
		this.precio = precio;
	}


	public int getVolumen() {
		return volumen;
	}


	public void setVolumen(int volumen) {
		this.volumen = volumen;
	}


	public Control getControl() {
		return control;
	}


	public void setControl(Control control) {
		this.control = control;
	}
	
	
	public static int getNumTV() {
		return numTV;
	}
	
	public static void setNumTV(int numTv) {
		 numTV=numTv;
	}	
	
	public boolean getEstado() {
		return estado;
	}
	
	public void setEstado(boolean estado) {
		this.estado=estado;
	}	
	
	public void turnOn() {	
		estado=true;
	}

	public void turnOff() {	
		estado=false;
	}
	
	public void canalUp() {
		if(estado && canal>=0 && canal <=119) {
			canal+=1;	
		}
		
		
	}
	public void canalDown() {
		if(estado && canal>=2 && canal <=121) {
			canal-=1;	
		}
	}
	
	public void volumenUp() {
		if(estado && volumen>=-1 && volumen<=6) {
			volumen+=1;	
		}
	}
	
	public void volumenDown() {
		if(estado && volumen>=1 && volumen<=8) {//Revisar limites en todos los casos
			volumen-=1;	
		}
	}	

}
