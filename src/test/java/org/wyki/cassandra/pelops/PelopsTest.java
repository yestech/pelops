package org.wyki.cassandra.pelops;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * @author $Author: acopeland $
 * @version $Revision:  $
 */
@Ignore
public class PelopsTest {

    @Test
    public void testConfigurationTFramed() throws Exception {
        String[] contactNodes = {"127.0.0.1"};
        Pelops.addPool("test", contactNodes, 9160, false, "System", new Policy(), true);
        ThriftPool connPool = Pelops.getDbConnPool("test");
        assertNotNull(connPool);
        ThriftPoolComplex.ConnectionComplex connection = (ThriftPoolComplex.ConnectionComplex) connPool.getConnection();
        assertTrue(connection.isFramed());
    }

    @Test
    public void testDefaultConfigurationNoTFramed() throws Exception {
        String[] contactNodes = {"127.0.0.1"};
        Pelops.addPool("test", contactNodes, 9160, false, "System", new Policy());
        ThriftPool connPool = Pelops.getDbConnPool("test");
        assertNotNull(connPool);
        ThriftPoolComplex.ConnectionComplex connection = (ThriftPoolComplex.ConnectionComplex) connPool.getConnection();
        assertTrue(connection.isFramed());
    }

    @Test
    public void testExplicitConfigurationNoTFramed() throws Exception {
        String[] contactNodes = {"127.0.0.1"};
        Pelops.addPool("test", contactNodes, 9160, false, "System", new Policy(), false);
        ThriftPool connPool = Pelops.getDbConnPool("test");
        assertNotNull(connPool);
        ThriftPoolComplex.ConnectionComplex connection = (ThriftPoolComplex.ConnectionComplex) connPool.getConnection();
        assertTrue(connection.isFramed());
    }

    @Test
    public void testNoDeprecatedConfigurationTFramed() throws Exception {
        String[] contactNodes = {"127.0.0.1"};
        Pelops.addPool("test", contactNodes, 9160, false, "System", new Policy(), true);
        ThriftPool connPool = Pelops.getDbConnPool("test");
        assertNotNull(connPool);
        ThriftPoolComplex.ConnectionComplex connection = (ThriftPoolComplex.ConnectionComplex) connPool.getConnection();
        assertTrue(connection.isFramed());
    }

    @Test
    public void testNoDeprecatedDefaultConfigurationNoTFramed() throws Exception {
        String[] contactNodes = {"127.0.0.1"};
        Pelops.addPool("test", contactNodes, 9160, false, "System", new Policy());
        ThriftPool connPool = Pelops.getDbConnPool("test");
        assertNotNull(connPool);
        ThriftPoolComplex.ConnectionComplex connection = (ThriftPoolComplex.ConnectionComplex) connPool.getConnection();
        assertTrue(connection.isFramed());
    }

    @Test
    public void testNoDeprecatedExplicitConfigurationNoTFramed() throws Exception {
        String[] contactNodes = {"127.0.0.1"};
        Pelops.addPool("test", contactNodes, 9160, false, "System", new Policy(), false);
        ThriftPool connPool = Pelops.getDbConnPool("test");
        assertNotNull(connPool);
        ThriftPoolComplex.ConnectionComplex connection = (ThriftPoolComplex.ConnectionComplex) connPool.getConnection();
        assertTrue(connection.isFramed());
    }
}
