package org.testng.integration;

/**
 * @author <a href="mailto:nitin.matrix@gmail.com">Nitin Verma</a>
 */
public interface Assembly {
    Coupling requestCoupling(final CouplingRequestContext couplingRequestContext) throws CouplingException;
}
