package org.wyki.cassandra.pelops;

import org.apache.thrift.transport.TTransportException;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * @author $Author: acopeland $
 * @version $Revision:  $
 */
@Ignore
public class ThriftPoolComplexTest {

    @Test
    public void testConfigurationTFramed() throws Exception {
        ThriftPoolComplex.ConnectionComplex connection = null;
        try {
            String[] contactNodes = {"localhost"};
            ThriftPoolComplex.Policy poolPolicy = new ThriftPoolComplex.Policy();
            GeneralPolicy generalPolicy = new GeneralPolicy();
            generalPolicy.setMaxOpRetries(1);
            ThriftPoolComplex complexPool = new ThriftPoolComplex(contactNodes, 9160, false, "System", poolPolicy, generalPolicy);
            connection =(ThriftPoolComplex.ConnectionComplex) complexPool.getConnection();
        } catch (Exception e) {
            System.out.println("Here...");
            assertTrue(connection.isFramed());
        }
    }

    @Test
    public void testDefaultConfigurationNoTFramed() {

    }

    @Test
    public void testExplicitConfigurationNoTFramed() {

    }
}
