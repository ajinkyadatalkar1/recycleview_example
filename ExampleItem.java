package com.example.gallery_recycler;


// Link the items in the card to the code so that they can be manipulated. This file is linked to cards.xml file.
public class ExampleItem {
    public int mImageResource;
    public String line1;
    public String line2;


    public ExampleItem(int imageResource, String text1, String text2){ // called in the main activity for setting the resources.
        mImageResource = imageResource;
        line1 = text1;
        line2 = text2;
    }

    public int getmImageResource(){ //called in the ExampleAdapter for setting the resources.
        return mImageResource;
    }

    public String getLine1(){       //called in the ExampleAdapter for setting the resources.
        return line1;
    }

    public String getLine2(){       //called in the ExampleAdapter for setting the resources.
        return line2;
    }
}
