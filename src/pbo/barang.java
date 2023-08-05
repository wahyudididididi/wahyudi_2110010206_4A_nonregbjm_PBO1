package pbo;

class barang {
    private final String kodeBarang;
    private final String namaBarang;
    private int harga;
    
    //constructor
    public barang (String kodeBarang,String namaBarang,int harga) {
        this.kodeBarang=kodeBarang;
        this.namaBarang=namaBarang;
        this.harga=harga;
    }
    
   //accesor
    public String getkodeBarang() {
        return kodeBarang;
    }
    public String getnamaBarang(){
        return namaBarang;
    }
    public int getharga(){
        return harga;
    }
    //mutator
    public void getharga(int harga){
        this.harga=harga;
    }
    //method
    public void showinfo(){
        System.out.println("kode barang :"+ kodeBarang);
        System.out.println("nama barang:"+namaBarang);
        System.out.println("harga:"+harga);
    }
}
