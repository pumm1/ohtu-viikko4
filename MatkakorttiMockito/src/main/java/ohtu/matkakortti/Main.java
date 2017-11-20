package ohtu.matkakortti;

public class Main {
    
    public static void main(String[] args){
        Kassapaate kassa = new Kassapaate();
        Matkakortti kortti = new Matkakortti(2);
        
        kassa.ostaLounas(kortti);
        System.out.println(kortti.getSaldo());
    }

}
