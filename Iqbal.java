//nama class
class Iqbal extends Manusia{

// deklarasi attribut
    String hidung;
    String mata;
    String warnakulit;
    String rambut;

//construktor berisi parameter
    public void set(String hidung, String mata, String warnakulit, String rambut) {
        this.hidung = hidung;
        this.mata = mata;
        this.warnakulit = warnakulit;
        this.rambut = rambut;
        }

//proses overriding
    public void bernafas (){
        System.out.println("Iqbal bernafas melalui hidung");
        super.bernafas();

        }

//method mencetak
    public void lihat() {
        System.out.println("");
        System.out.println("============================");
        System.out.println("Ciri - Ciri iqbal :");
        System.out.println("============================");
        System.out.println("Hidung      : " + hidung);
        System.out.println("Mata        : " + mata);
        System.out.println("Warna kulit : " + warnakulit);
        System.out.println("Rambut      : " + rambut);
        System.out.println("============================");

    }

}
