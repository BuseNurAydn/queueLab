package queueLab;

public class MainClass {

	public static void main(String[] args) {
		KuyrukStructure ks = new KuyrukStructure();
		Kuyruk k1 = new Kuyruk(8);
		Kuyruk k2 = new Kuyruk(4);
		Kuyruk k3 = new Kuyruk(2);
		Kuyruk k4 = new Kuyruk(9);
		
		ks.ekle(k1);
		ks.ekle(k2);
		ks.ekle(k3);
		
		ks.listele();
		
		System.out.println("Baþtaki siliniyor...");
		ks.sil();
		ks.listele();
		System.out.println("Baþtaki siliniyor...");
		ks.sil();
		ks.listele();
		System.out.println("Sona ekleniyor...");
		ks.ekle(k4);
		ks.listele();
		
		
		
		
		
		
	}

}
