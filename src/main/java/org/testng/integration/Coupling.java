package org.testng.integration;

/**
 * @author <a href="mailto:nitin.matrix@gmail.com">Nitin Verma</a>
 */
public interface Coupling {
    void engage() throws EngagementException;
    void disengage() throws DisengagementException;
}
