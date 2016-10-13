package com.example.bangash.listfragment;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Bangash on 10/12/2016.
 */
public class FlowerData {
    List<Flower> flowers = new ArrayList<>();

    public FlowerData() {
        flowers.add(new Flower("Anemone", R.drawable.anemone, "The Anemone genus is part of the Ranunculaceae (buttercup) family. There are a little over 120 species of anemones in a wide range of colors. \n" + "\n" + "Anemones are popular in gardens as individual species flower in the spring, summer, or fall, providing continual color.", 500));
        flowers.add(new Flower("Amaryllis", R.drawable.amaryllis, "The stunning amaryllis belladonna is known as Naked Lady in the US. The smooth-textured foliage grows in early summer then dies back.\n", 977));
        flowers.add(new Flower("Aster", R.drawable.aster, "The stunning amaryllis belladonna is known as Naked Lady in the US. The smooth-textured foliage grows in early summer then dies back.\n", 987));
        flowers.add(new Flower("Azaleas", R.drawable.azalea, "The stunning amaryllis belladonna is known as Naked Lady in the US. The smooth-textured foliage grows in early summer then dies back.\n", 987));
    }

    public List<Flower> getFlowersData()
    {
        return flowers;
    }
}
