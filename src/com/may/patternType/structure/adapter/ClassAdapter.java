package com.may.patternType.structure.adapter;

public class ClassAdapter extends TV implements TriplePin{

    @Override
    public void electrify(String live, String nul, String earth) {
        super.electrify(live, nul);
    }
}
