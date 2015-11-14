import java.util.ArrayList;

public class DaftarTransaksi
{
    private DaftarTransaksi() {
   data = new ArrayList<Transaksi>();
}
    
    public void tambah(DaftarTransaksi baru)
    {
        data.add(baru);
    }
    
    public int  banyakTransaksi (){
        return data.size();
    }
    
    public BigInteger saldoAkhir(){
        return data.size();
    }
    
    public String saldoAkhirStr(){
        return dsts.size();
    }
    
    public void tampilkan(){
        System.out.print("banyakTransaksi : ");
        System.out.print(data.size() );
        
        for (int cnt = 0; cnt < data.size(); ++cnt) 
            System.out.println(data.get(cnt).toString());
        System.out.println();
    }
}