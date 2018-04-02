
package praktek02;
public class bujursangkar {
    double sisi1;
    double sisi2;

    public bujursangkar() {
        sisi1=6;
        sisi2=2;
                
   
    }
    
    void cetakinfo(){
        System.out.println("=================");
        System.out.println("sisi1:"+sisi1);
        System.out.println("sisi2:"+sisi2);
        System.out.println("=================");
    }


    double hitungluas(){
        double luas;
        luas=sisi1*sisi2;
        return luas;
    } 
        
    void cetakluas(){    
        System.out.println("luasnya adalah: "+hitungluas());

}