/*
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *                   NOTICE
 *
 * This software was produced for the U. S. Government
 * under Basic Contract No. FA8702-17-C-0001, and is
 * subject to the Rights in Noncommercial Computer Software
 * and Noncommercial Computer Software Documentation
 * Clause 252.227-7014 (MAY 2013)
 *
 * (c)2016-2017 The MITRE Corporation. All Rights Reserved.
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */

package org.mitre.tangerine.reasoner;
public class Tuple {

    private String[] col = new String[FLogicConstants.MAX_QUERY_VARS];

    public Tuple() {
    }

    /**
     * @return the col
     */
    public String[] getCol() {
        return col;
    }

    /**
     * @param col the col to set
     */
    public void setCol(String[] col) {
        this.col = col;
    }
}
