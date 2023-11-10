package queueLab;

public class KuyrukStructure {
	Kuyruk ilk,son;
	
	public KuyrukStructure() {
		this.ilk=null;
	}
	public void ekle(Kuyruk yeni) {
		if(ilk==null) {
			ilk=son=yeni;
		}else {
			son.sonraki=yeni;
			son=yeni;
		}
		
	}
	public void sil() {
		Kuyruk temp;
		temp=ilk;
		ilk=ilk.sonraki;
		temp=null;
	}
	public void listele() {
		Kuyruk gez;
		for(gez=ilk; gez != null;gez=gez.sonraki) {
			System.out.println(gez.sayi);
		}
		
	}

}
