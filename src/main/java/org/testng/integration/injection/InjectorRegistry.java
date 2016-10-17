package org.testng.integration.injection;

import org.testng.internal.injection.ParameterResolver;

/**
 *
 * @author <a href="mailto:nitin.matrix@gmail.com">Nitin Verma</a>
 */
public class InjectorRegistry {

    private InjectorRegistry() {
        throw new AssertionError();
    }

    public static final boolean register(final ParameterResolver parameterResolver) {
        return true;
    }
}
