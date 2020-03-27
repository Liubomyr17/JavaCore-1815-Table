package com.company;

/*
1815 table
Change the TableInterfaceWrapper class so that it becomes the Wrapper for ATableInterface.
The setModel method should print to the console the number of elements in a new sheet before updating the model.
The getHeaderText method should return uppercase text - use the toUpperCase () method.

Requirements:
1. The TableInterfaceWrapper class must implement the ATableInterface interface.
2. The TableInterfaceWrapper class must initialize in the constructor a field of type ATableInterface.
3. The setModel () method should print to the console the number of elements in a new sheet before updating the model.
4. The getHeaderText () method should return uppercase text.
5. The setHeaderText () method should set the text for the header without changes.
 */

import java.io.*;
import java.nio.channels.FileChannel;
import javax.smartcardio.ATR;
import java.util.List;




public class Solution {
    public static class TableInterfaceWrapper implements ATableInterface {
        ATableInterface component;

        TableInterfaceWrapper (ATableInterface atable) {
            this.component = atable;
        }

        @Override
        public void setModel(List rows) {
            System.out.println(rows.size());
            this.component.setModel(rows);
        }

        @Override
        public String getHeaderText() {
           return this.component.getHeaderText().toUpperCase();
        }

        @Override
        public void setHeaderText(String newHeaderText) {
            this.component.setHeaderText(newHeaderText);
        }
    }

    public interface ATableInterface {
        void setModel(List rows);

        String getHeaderText();

        void setHeaderText(String newHeaderText);
    }

    public static void main(String[] args) {
    }
}



