
package dolgozat0227;

import java.util.Map;

public class Aranyhal {
    private final int KIVANSAGOKSZAMA = 3;
    private String kifogta;
    private int kor;
    Map<String, Integer> kivansagok;

    public Aranyhal(String kifogta) {
        this.kifogta = kifogta;
    }

    public Aranyhal(String kifogta, int kor) {
        this.kifogta = kifogta;
        this.kor = kor;
    }

    public int getKor() {
        return kor;
    }

    public void setKifogta(String kifogta) {
        this.kifogta = kifogta;
    }
    
    public int kivansagokSzama(String kifogta){
        return 0;
    }
    
    public String[] kikkeltalalkozott(){
        return null;
    }
    
    public boolean kivansagotTeljesit(String kivansagok){
        return false;
    }

    @Override
    public String toString() {
        return "Aranyhal{" + "KIVANSAGOKSZAMA=" + KIVANSAGOKSZAMA + ", kifogta=" + kifogta + ", kor=" + kor + ", kivansagok=" + kivansagok + '}';
    }
    
    
}
