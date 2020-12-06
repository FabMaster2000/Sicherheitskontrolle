package Main;

import Main.Components.Scanner.ProhibitedItem;
import Main.Components.Scanner.ScanResult;
import Main.ext.text_search.BruteForce;

public class ExplosivesTraceDetector {
    public ScanResult test(TestStripe stripe) {
        var b = new BruteForce();

        for(var i = 0 ; i < stripe.getData().length; i++) {
            var result = b.search(stripe.getData()[i].toString(), "exp");

            if(result != -1) {
                return new ScanResult(i,result, ProhibitedItem.EXPLOSIVE);
            }
        }

        return new ScanResult(-1,-1,ProhibitedItem.CLEAN);
    }
}
