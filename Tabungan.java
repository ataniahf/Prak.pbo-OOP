
package method;


public class Tabungan 
{
    //atribute
    int jumlahSaldo;//default
    
    //GET
    public int getJumlahSaldo() {
        return jumlahSaldo;//dilempar 2000000
    }
    //SET
    public void setJumlahSaldo(int jumlahSaldo) {
        this.jumlahSaldo = jumlahSaldo;
    }
    
   //method 2:
    public void setorSaldo (int jumlah) {
    jumlahSaldo = jumlahSaldo + jumlah;
    }
    public int penarikanSaldo (int jumlah) {
    jumlahSaldo =jumlahSaldo - jumlah;
    return jumlahSaldo;                                              
    }
}
