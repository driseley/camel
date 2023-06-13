/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.milo.client;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ExtendedPropertyConfigurerGetter;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.spi.ConfigurerStrategy;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class MiloClientComponentConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    private org.apache.camel.component.milo.client.MiloClientConfiguration getOrCreateConfiguration(MiloClientComponent target) {
        if (target.getConfiguration() == null) {
            target.setConfiguration(new org.apache.camel.component.milo.client.MiloClientConfiguration());
        }
        return target.getConfiguration();
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        MiloClientComponent target = (MiloClientComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "allowedsecuritypolicies":
        case "allowedSecurityPolicies": getOrCreateConfiguration(target).setAllowedSecurityPolicies(property(camelContext, java.lang.String.class, value)); return true;
        case "applicationname":
        case "applicationName": getOrCreateConfiguration(target).setApplicationName(property(camelContext, java.lang.String.class, value)); return true;
        case "applicationuri":
        case "applicationUri": getOrCreateConfiguration(target).setApplicationUri(property(camelContext, java.lang.String.class, value)); return true;
        case "autowiredenabled":
        case "autowiredEnabled": target.setAutowiredEnabled(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "channellifetime":
        case "channelLifetime": getOrCreateConfiguration(target).setChannelLifetime(property(camelContext, java.lang.Long.class, value)); return true;
        case "clientid":
        case "clientId": getOrCreateConfiguration(target).setClientId(property(camelContext, java.lang.String.class, value)); return true;
        case "configuration": target.setConfiguration(property(camelContext, org.apache.camel.component.milo.client.MiloClientConfiguration.class, value)); return true;
        case "discoveryendpointsuffix":
        case "discoveryEndpointSuffix": getOrCreateConfiguration(target).setDiscoveryEndpointSuffix(property(camelContext, java.lang.String.class, value)); return true;
        case "discoveryendpointuri":
        case "discoveryEndpointUri": getOrCreateConfiguration(target).setDiscoveryEndpointUri(property(camelContext, java.lang.String.class, value)); return true;
        case "keyalias":
        case "keyAlias": getOrCreateConfiguration(target).setKeyAlias(property(camelContext, java.lang.String.class, value)); return true;
        case "keypassword":
        case "keyPassword": getOrCreateConfiguration(target).setKeyPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "keystorepassword":
        case "keyStorePassword": getOrCreateConfiguration(target).setKeyStorePassword(property(camelContext, java.lang.String.class, value)); return true;
        case "keystoretype":
        case "keyStoreType": getOrCreateConfiguration(target).setKeyStoreType(property(camelContext, java.lang.String.class, value)); return true;
        case "keystoreurl":
        case "keyStoreUrl": getOrCreateConfiguration(target).setKeyStoreUrl(property(camelContext, java.lang.String.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "maxpendingpublishrequests":
        case "maxPendingPublishRequests": getOrCreateConfiguration(target).setMaxPendingPublishRequests(property(camelContext, java.lang.Long.class, value)); return true;
        case "maxresponsemessagesize":
        case "maxResponseMessageSize": getOrCreateConfiguration(target).setMaxResponseMessageSize(property(camelContext, java.lang.Long.class, value)); return true;
        case "miloclientconnectionmanager":
        case "miloClientConnectionManager": target.setMiloClientConnectionManager(property(camelContext, org.apache.camel.component.milo.client.MiloClientConnectionManager.class, value)); return true;
        case "overridehost":
        case "overrideHost": getOrCreateConfiguration(target).setOverrideHost(property(camelContext, boolean.class, value)); return true;
        case "producturi":
        case "productUri": getOrCreateConfiguration(target).setProductUri(property(camelContext, java.lang.String.class, value)); return true;
        case "requesttimeout":
        case "requestTimeout": getOrCreateConfiguration(target).setRequestTimeout(property(camelContext, java.lang.Long.class, value)); return true;
        case "requestedpublishinginterval":
        case "requestedPublishingInterval": getOrCreateConfiguration(target).setRequestedPublishingInterval(property(camelContext, java.lang.Double.class, value)); return true;
        case "sessionname":
        case "sessionName": getOrCreateConfiguration(target).setSessionName(property(camelContext, java.lang.String.class, value)); return true;
        case "sessiontimeout":
        case "sessionTimeout": getOrCreateConfiguration(target).setSessionTimeout(property(camelContext, java.lang.Long.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public String[] getAutowiredNames() {
        return new String[]{"miloClientConnectionManager"};
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "allowedsecuritypolicies":
        case "allowedSecurityPolicies": return java.lang.String.class;
        case "applicationname":
        case "applicationName": return java.lang.String.class;
        case "applicationuri":
        case "applicationUri": return java.lang.String.class;
        case "autowiredenabled":
        case "autowiredEnabled": return boolean.class;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return boolean.class;
        case "channellifetime":
        case "channelLifetime": return java.lang.Long.class;
        case "clientid":
        case "clientId": return java.lang.String.class;
        case "configuration": return org.apache.camel.component.milo.client.MiloClientConfiguration.class;
        case "discoveryendpointsuffix":
        case "discoveryEndpointSuffix": return java.lang.String.class;
        case "discoveryendpointuri":
        case "discoveryEndpointUri": return java.lang.String.class;
        case "keyalias":
        case "keyAlias": return java.lang.String.class;
        case "keypassword":
        case "keyPassword": return java.lang.String.class;
        case "keystorepassword":
        case "keyStorePassword": return java.lang.String.class;
        case "keystoretype":
        case "keyStoreType": return java.lang.String.class;
        case "keystoreurl":
        case "keyStoreUrl": return java.lang.String.class;
        case "lazystartproducer":
        case "lazyStartProducer": return boolean.class;
        case "maxpendingpublishrequests":
        case "maxPendingPublishRequests": return java.lang.Long.class;
        case "maxresponsemessagesize":
        case "maxResponseMessageSize": return java.lang.Long.class;
        case "miloclientconnectionmanager":
        case "miloClientConnectionManager": return org.apache.camel.component.milo.client.MiloClientConnectionManager.class;
        case "overridehost":
        case "overrideHost": return boolean.class;
        case "producturi":
        case "productUri": return java.lang.String.class;
        case "requesttimeout":
        case "requestTimeout": return java.lang.Long.class;
        case "requestedpublishinginterval":
        case "requestedPublishingInterval": return java.lang.Double.class;
        case "sessionname":
        case "sessionName": return java.lang.String.class;
        case "sessiontimeout":
        case "sessionTimeout": return java.lang.Long.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        MiloClientComponent target = (MiloClientComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "allowedsecuritypolicies":
        case "allowedSecurityPolicies": return getOrCreateConfiguration(target).getAllowedSecurityPolicies();
        case "applicationname":
        case "applicationName": return getOrCreateConfiguration(target).getApplicationName();
        case "applicationuri":
        case "applicationUri": return getOrCreateConfiguration(target).getApplicationUri();
        case "autowiredenabled":
        case "autowiredEnabled": return target.isAutowiredEnabled();
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "channellifetime":
        case "channelLifetime": return getOrCreateConfiguration(target).getChannelLifetime();
        case "clientid":
        case "clientId": return getOrCreateConfiguration(target).getClientId();
        case "configuration": return target.getConfiguration();
        case "discoveryendpointsuffix":
        case "discoveryEndpointSuffix": return getOrCreateConfiguration(target).getDiscoveryEndpointSuffix();
        case "discoveryendpointuri":
        case "discoveryEndpointUri": return getOrCreateConfiguration(target).getDiscoveryEndpointUri();
        case "keyalias":
        case "keyAlias": return getOrCreateConfiguration(target).getKeyAlias();
        case "keypassword":
        case "keyPassword": return getOrCreateConfiguration(target).getKeyPassword();
        case "keystorepassword":
        case "keyStorePassword": return getOrCreateConfiguration(target).getKeyStorePassword();
        case "keystoretype":
        case "keyStoreType": return getOrCreateConfiguration(target).getKeyStoreType();
        case "keystoreurl":
        case "keyStoreUrl": return getOrCreateConfiguration(target).getKeyStoreUrl();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "maxpendingpublishrequests":
        case "maxPendingPublishRequests": return getOrCreateConfiguration(target).getMaxPendingPublishRequests();
        case "maxresponsemessagesize":
        case "maxResponseMessageSize": return getOrCreateConfiguration(target).getMaxResponseMessageSize();
        case "miloclientconnectionmanager":
        case "miloClientConnectionManager": return target.getMiloClientConnectionManager();
        case "overridehost":
        case "overrideHost": return getOrCreateConfiguration(target).isOverrideHost();
        case "producturi":
        case "productUri": return getOrCreateConfiguration(target).getProductUri();
        case "requesttimeout":
        case "requestTimeout": return getOrCreateConfiguration(target).getRequestTimeout();
        case "requestedpublishinginterval":
        case "requestedPublishingInterval": return getOrCreateConfiguration(target).getRequestedPublishingInterval();
        case "sessionname":
        case "sessionName": return getOrCreateConfiguration(target).getSessionName();
        case "sessiontimeout":
        case "sessionTimeout": return getOrCreateConfiguration(target).getSessionTimeout();
        default: return null;
        }
    }
}
