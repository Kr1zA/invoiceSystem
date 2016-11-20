/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.upjs.invoicesystem;

import java.util.Comparator;

/**
 *
 * @author kriza
 */
public class SorterByExposureDate implements Comparator<Invoice> {

    @Override
    public int compare(Invoice t, Invoice t1) {
        return t1.getExposureDate().compareTo(t.getExposureDate());
    }

}
