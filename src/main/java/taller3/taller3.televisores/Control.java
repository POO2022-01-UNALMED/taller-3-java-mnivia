package televisores;

public class Control {
	TV tv;		
	
	public TV getTv() {
		return tv;
	}

	public void setTv(TV tv) {
		this.tv = tv;
	}

	public void turnOn() {	
		tv.setEstado(true);
	}

	public void turnOff() {	
		tv.setEstado(false);
	}
	
	public void canalUp() {
		if(tv.getEstado() && tv.getCanal()>=0 && tv.getCanal() <=119) {
			tv.setCanal(tv.getCanal()+1);	
		}			
	}
	public void canalDown() {
		if(tv.getEstado() && tv.getCanal()>2 && tv.getCanal() <=121) {
			tv.setCanal(tv.getCanal()-1);	
		}
	}
	
	public void volumenUp() {
		if(tv.getEstado() && tv.getVolumen()>=-1 && tv.getVolumen()<=6) {
			tv.setVolumen(tv.getVolumen()+1);
		}
	}
	
	public void volumenDown() {
		if(tv.getEstado() && tv.getVolumen()>=1 && tv.getVolumen()<=8) {
			tv.setVolumen(tv.getVolumen()-1);
		}
	}
	
	public void setCanal(int Can) {
		if(tv.getEstado() && Can>=0 && Can<120) {
			tv.setCanal(Can);
		}
	}
	
	public void enlazar(TV televisor) {
		televisor.setControl(this);
		tv=televisor;
	}
	

}
