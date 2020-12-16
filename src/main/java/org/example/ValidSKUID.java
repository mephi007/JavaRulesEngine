package org.example;

import java.util.HashSet;
import java.util.Set;

public class ValidSKUID {
private Set<String> validSKUID = new HashSet();
private static ValidSKUID validSKUobj;
private ValidSKUID(){
        validSKUID.add("A");
        validSKUID.add("B");
        validSKUID.add("C");
        validSKUID.add("D");
        }
    public static ValidSKUID getInstance(){
        if(validSKUobj == null){
            validSKUobj = new ValidSKUID();
        }
        return validSKUobj;
        }
    public void setSKUIDWithRate(String skuId, int rate){
        validSKUID.add(skuId);
        }
    public boolean containsSKUID(String skuId){
        return validSKUID.contains(skuId);
        }
}
