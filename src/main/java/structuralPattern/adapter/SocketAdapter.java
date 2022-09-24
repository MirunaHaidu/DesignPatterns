package structuralPattern.adapter;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class SocketAdapter extends UsaCharger {
    private RomanianCharger romanianCharger;

    @Override
    public void chargeUsaPhone(){
        romanianCharger.chargeRomanianPhone();
    }
}
