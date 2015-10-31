
/**
 * Write a description of class KoordinatGPS here.
 * 
 * @author (1304105010085) 
 * @version (a version number or a date)
 */
public class KoordinatGPS
{
public KoordinatGPS(){
        this.lintang = new Double(0);
        this.bujur = new Double(0);
}

    
public KoordinatGPS(double bujur, double lintang){
    this.bujur = bujur;
    this.lintang = lintang;
}

public KoordinatGPS(Double bujur, Double lintang){
    this.bujur = bujur;
    this.lintang = lintang;
}

public Double lintang(){
    return lintang;
}

public Double bujur(){
    return bujur;
}

private Double lintang;
private Double bujur;

}
