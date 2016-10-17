package org.testng.integration;

import java.util.EnumSet;

/**
 * @author <a href="mailto:nitin.matrix@gmail.com">Nitin Verma</a>
 */
public class CouplingRequestContext {
    private final Coupler coupler;
    private final EnumSet<IntegrationFeatures> requestedNonNegotiableFeatures;
    private final EnumSet<IntegrationFeatures> requestedNegotiableFeatures;

    public CouplingRequestContext(
            final Coupler coupler,
            final EnumSet<IntegrationFeatures> requestedNegotiableFeatures
    ) {
        this(coupler, requestedNegotiableFeatures, EnumSet.noneOf(IntegrationFeatures.class));
    }

    public CouplingRequestContext(
            final Coupler coupler,
            final EnumSet<IntegrationFeatures> requestedNegotiableFeatures,
            final EnumSet<IntegrationFeatures> requestedNonNegotiableFeatures
    ) {
        this.coupler = coupler;
        this.requestedNegotiableFeatures = requestedNegotiableFeatures;
        this.requestedNonNegotiableFeatures = requestedNonNegotiableFeatures;
    }

    public Coupler getCoupler() {
        return coupler;
    }

    public EnumSet<IntegrationFeatures> getRequestedNegotiableFeatures() {
        return requestedNegotiableFeatures;
    }

    public EnumSet<IntegrationFeatures> getRequestedNonNegotiableFeatures() {
        return requestedNonNegotiableFeatures;
    }
}
