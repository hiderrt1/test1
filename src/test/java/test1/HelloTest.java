/*
 * Copyright 2012 The Johns Hopkins University/Applied Physics Laboratory.
 * All rights reserved.  This material may be used, modified, or reproduced by or 
 * for the U.S. Government pursuant to the license rights granted under the clauses
 * at DFARS 252.227-7013/7014.  For any other permissions, please contact the Science
 * and Technology Business Area Program Office at JHU/APL.
 */
package test1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class HelloTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void test() {
        Hello.main(null);
    }

}
