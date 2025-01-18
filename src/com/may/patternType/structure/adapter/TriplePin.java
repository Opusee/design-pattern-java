package com.may.patternType.structure.adapter;

public interface TriplePin {
    //参数分别为火线live，零线null，地线earth
    void electrify(String live, String nul, String earth);
}
