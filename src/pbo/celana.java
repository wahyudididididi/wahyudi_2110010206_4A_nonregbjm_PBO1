package pbo;
//class celana
class celana extends barang {
    private final String ukuran;
    public celana(String kodeBarang,String namaBarang,int harga,String ukuran){
        super(kodeBarang,namaBarang,harga);
        this.ukuran=ukuran;
    }
    //accessor
    public String getukuarn() {
        return ukuran;
    }
  
    public void showInfo() {
        super.showinfo();
        System.out.println("Ukuran: " + ukuran);
    }
}