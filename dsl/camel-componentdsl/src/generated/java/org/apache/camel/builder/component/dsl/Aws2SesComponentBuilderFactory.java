/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.builder.component.dsl;

import javax.annotation.processing.Generated;
import org.apache.camel.Component;
import org.apache.camel.builder.component.AbstractComponentBuilder;
import org.apache.camel.builder.component.ComponentBuilder;
import org.apache.camel.component.aws2.ses.Ses2Component;

/**
 * Send e-mails through AWS SES service.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.ComponentDslMojo")
public interface Aws2SesComponentBuilderFactory {

    /**
     * AWS Simple Email Service (SES) (camel-aws2-ses)
     * Send e-mails through AWS SES service.
     * 
     * Category: cloud,mail
     * Since: 3.1
     * Maven coordinates: org.apache.camel:camel-aws2-ses
     * 
     * @return the dsl builder
     */
    static Aws2SesComponentBuilder aws2Ses() {
        return new Aws2SesComponentBuilderImpl();
    }

    /**
     * Builder for the AWS Simple Email Service (SES) component.
     */
    interface Aws2SesComponentBuilder extends ComponentBuilder<Ses2Component> {
        /**
         * List of comma separated destination blind carbon copy (bcc) email
         * address. Can be overridden with 'CamelAwsSesBcc' header.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param bcc the value to set
         * @return the dsl builder
         */
        default Aws2SesComponentBuilder bcc(java.lang.String bcc) {
            doSetProperty("bcc", bcc);
            return this;
        }
        /**
         * List of comma separated destination carbon copy (cc) email address.
         * Can be overridden with 'CamelAwsSesCc' header.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param cc the value to set
         * @return the dsl builder
         */
        default Aws2SesComponentBuilder cc(java.lang.String cc) {
            doSetProperty("cc", cc);
            return this;
        }
        /**
         * component configuration.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.aws2.ses.Ses2Configuration&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param configuration the value to set
         * @return the dsl builder
         */
        default Aws2SesComponentBuilder configuration(
                org.apache.camel.component.aws2.ses.Ses2Configuration configuration) {
            doSetProperty("configuration", configuration);
            return this;
        }
        /**
         * Set the configuration set to send with every request. Override it
         * with 'CamelAwsSesConfigurationSet' header.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param configurationSet the value to set
         * @return the dsl builder
         */
        default Aws2SesComponentBuilder configurationSet(
                java.lang.String configurationSet) {
            doSetProperty("configurationSet", configurationSet);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param lazyStartProducer the value to set
         * @return the dsl builder
         */
        default Aws2SesComponentBuilder lazyStartProducer(
                boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Set the need for overidding the endpoint. This option needs to be
         * used in combination with uriEndpointOverride option.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param overrideEndpoint the value to set
         * @return the dsl builder
         */
        default Aws2SesComponentBuilder overrideEndpoint(
                boolean overrideEndpoint) {
            doSetProperty("overrideEndpoint", overrideEndpoint);
            return this;
        }
        /**
         * The region in which SES client needs to work. When using this
         * parameter, the configuration will expect the lowercase name of the
         * region (for example ap-east-1) You'll need to use the name
         * Region.EU_WEST_1.id().
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param region the value to set
         * @return the dsl builder
         */
        default Aws2SesComponentBuilder region(java.lang.String region) {
            doSetProperty("region", region);
            return this;
        }
        /**
         * List of comma separated reply-to email address(es) for the message,
         * override it using 'CamelAwsSesReplyToAddresses' header.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param replyToAddresses the value to set
         * @return the dsl builder
         */
        default Aws2SesComponentBuilder replyToAddresses(
                java.lang.String replyToAddresses) {
            doSetProperty("replyToAddresses", replyToAddresses);
            return this;
        }
        /**
         * The email address to which bounce notifications are to be forwarded,
         * override it using 'CamelAwsSesReturnPath' header.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param returnPath the value to set
         * @return the dsl builder
         */
        default Aws2SesComponentBuilder returnPath(java.lang.String returnPath) {
            doSetProperty("returnPath", returnPath);
            return this;
        }
        /**
         * The subject which is used if the message header 'CamelAwsSesSubject'
         * is not present.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param subject the value to set
         * @return the dsl builder
         */
        default Aws2SesComponentBuilder subject(java.lang.String subject) {
            doSetProperty("subject", subject);
            return this;
        }
        /**
         * List of comma separated destination email address. Can be overridden
         * with 'CamelAwsSesTo' header.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param to the value to set
         * @return the dsl builder
         */
        default Aws2SesComponentBuilder to(java.lang.String to) {
            doSetProperty("to", to);
            return this;
        }
        /**
         * Set the overriding uri endpoint. This option needs to be used in
         * combination with overrideEndpoint option.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param uriEndpointOverride the value to set
         * @return the dsl builder
         */
        default Aws2SesComponentBuilder uriEndpointOverride(
                java.lang.String uriEndpointOverride) {
            doSetProperty("uriEndpointOverride", uriEndpointOverride);
            return this;
        }
        /**
         * To use the AmazonSimpleEmailService as the client.
         * 
         * The option is a:
         * &lt;code&gt;software.amazon.awssdk.services.ses.SesClient&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param amazonSESClient the value to set
         * @return the dsl builder
         */
        default Aws2SesComponentBuilder amazonSESClient(
                software.amazon.awssdk.services.ses.SesClient amazonSESClient) {
            doSetProperty("amazonSESClient", amazonSESClient);
            return this;
        }
        /**
         * Whether autowiring is enabled. This is used for automatic autowiring
         * options (the option must be marked as autowired) by looking up in the
         * registry to find if there is a single instance of matching type,
         * which then gets configured on the component. This can be used for
         * automatic configuring JDBC data sources, JMS connection factories,
         * AWS Clients, etc.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: advanced
         * 
         * @param autowiredEnabled the value to set
         * @return the dsl builder
         */
        default Aws2SesComponentBuilder autowiredEnabled(
                boolean autowiredEnabled) {
            doSetProperty("autowiredEnabled", autowiredEnabled);
            return this;
        }
        /**
         * Used for enabling or disabling all consumer based health checks from
         * this component.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: health
         * 
         * @param healthCheckConsumerEnabled the value to set
         * @return the dsl builder
         */
        default Aws2SesComponentBuilder healthCheckConsumerEnabled(
                boolean healthCheckConsumerEnabled) {
            doSetProperty("healthCheckConsumerEnabled", healthCheckConsumerEnabled);
            return this;
        }
        /**
         * Used for enabling or disabling all producer based health checks from
         * this component. Notice: Camel has by default disabled all producer
         * based health-checks. You can turn on producer checks globally by
         * setting camel.health.producersEnabled=true.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: health
         * 
         * @param healthCheckProducerEnabled the value to set
         * @return the dsl builder
         */
        default Aws2SesComponentBuilder healthCheckProducerEnabled(
                boolean healthCheckProducerEnabled) {
            doSetProperty("healthCheckProducerEnabled", healthCheckProducerEnabled);
            return this;
        }
        /**
         * To define a proxy host when instantiating the SES client.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: proxy
         * 
         * @param proxyHost the value to set
         * @return the dsl builder
         */
        default Aws2SesComponentBuilder proxyHost(java.lang.String proxyHost) {
            doSetProperty("proxyHost", proxyHost);
            return this;
        }
        /**
         * To define a proxy port when instantiating the SES client.
         * 
         * The option is a: &lt;code&gt;java.lang.Integer&lt;/code&gt; type.
         * 
         * Group: proxy
         * 
         * @param proxyPort the value to set
         * @return the dsl builder
         */
        default Aws2SesComponentBuilder proxyPort(java.lang.Integer proxyPort) {
            doSetProperty("proxyPort", proxyPort);
            return this;
        }
        /**
         * To define a proxy protocol when instantiating the SES client.
         * 
         * The option is a:
         * &lt;code&gt;software.amazon.awssdk.core.Protocol&lt;/code&gt; type.
         * 
         * Default: HTTPS
         * Group: proxy
         * 
         * @param proxyProtocol the value to set
         * @return the dsl builder
         */
        default Aws2SesComponentBuilder proxyProtocol(
                software.amazon.awssdk.core.Protocol proxyProtocol) {
            doSetProperty("proxyProtocol", proxyProtocol);
            return this;
        }
        /**
         * Amazon AWS Access Key.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: security
         * 
         * @param accessKey the value to set
         * @return the dsl builder
         */
        default Aws2SesComponentBuilder accessKey(java.lang.String accessKey) {
            doSetProperty("accessKey", accessKey);
            return this;
        }
        /**
         * If using a profile credentials provider this parameter will set the
         * profile name.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: security
         * 
         * @param profileCredentialsName the value to set
         * @return the dsl builder
         */
        default Aws2SesComponentBuilder profileCredentialsName(
                java.lang.String profileCredentialsName) {
            doSetProperty("profileCredentialsName", profileCredentialsName);
            return this;
        }
        /**
         * Amazon AWS Secret Key.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: security
         * 
         * @param secretKey the value to set
         * @return the dsl builder
         */
        default Aws2SesComponentBuilder secretKey(java.lang.String secretKey) {
            doSetProperty("secretKey", secretKey);
            return this;
        }
        /**
         * If we want to trust all certificates in case of overriding the
         * endpoint.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: security
         * 
         * @param trustAllCertificates the value to set
         * @return the dsl builder
         */
        default Aws2SesComponentBuilder trustAllCertificates(
                boolean trustAllCertificates) {
            doSetProperty("trustAllCertificates", trustAllCertificates);
            return this;
        }
        /**
         * Set whether the Ses client should expect to load credentials through
         * a default credentials provider or to expect static credentials to be
         * passed in.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: security
         * 
         * @param useDefaultCredentialsProvider the value to set
         * @return the dsl builder
         */
        default Aws2SesComponentBuilder useDefaultCredentialsProvider(
                boolean useDefaultCredentialsProvider) {
            doSetProperty("useDefaultCredentialsProvider", useDefaultCredentialsProvider);
            return this;
        }
        /**
         * Set whether the SES client should expect to load credentials through
         * a profile credentials provider.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: security
         * 
         * @param useProfileCredentialsProvider the value to set
         * @return the dsl builder
         */
        default Aws2SesComponentBuilder useProfileCredentialsProvider(
                boolean useProfileCredentialsProvider) {
            doSetProperty("useProfileCredentialsProvider", useProfileCredentialsProvider);
            return this;
        }
    }

    class Aws2SesComponentBuilderImpl
            extends
                AbstractComponentBuilder<Ses2Component>
            implements
                Aws2SesComponentBuilder {
        @Override
        protected Ses2Component buildConcreteComponent() {
            return new Ses2Component();
        }
        private org.apache.camel.component.aws2.ses.Ses2Configuration getOrCreateConfiguration(
                org.apache.camel.component.aws2.ses.Ses2Component component) {
            if (component.getConfiguration() == null) {
                component.setConfiguration(new org.apache.camel.component.aws2.ses.Ses2Configuration());
            }
            return component.getConfiguration();
        }
        @Override
        protected boolean setPropertyOnComponent(
                Component component,
                String name,
                Object value) {
            switch (name) {
            case "bcc": getOrCreateConfiguration((Ses2Component) component).setBcc((java.lang.String) value); return true;
            case "cc": getOrCreateConfiguration((Ses2Component) component).setCc((java.lang.String) value); return true;
            case "configuration": ((Ses2Component) component).setConfiguration((org.apache.camel.component.aws2.ses.Ses2Configuration) value); return true;
            case "configurationSet": getOrCreateConfiguration((Ses2Component) component).setConfigurationSet((java.lang.String) value); return true;
            case "lazyStartProducer": ((Ses2Component) component).setLazyStartProducer((boolean) value); return true;
            case "overrideEndpoint": getOrCreateConfiguration((Ses2Component) component).setOverrideEndpoint((boolean) value); return true;
            case "region": getOrCreateConfiguration((Ses2Component) component).setRegion((java.lang.String) value); return true;
            case "replyToAddresses": getOrCreateConfiguration((Ses2Component) component).setReplyToAddresses((java.lang.String) value); return true;
            case "returnPath": getOrCreateConfiguration((Ses2Component) component).setReturnPath((java.lang.String) value); return true;
            case "subject": getOrCreateConfiguration((Ses2Component) component).setSubject((java.lang.String) value); return true;
            case "to": getOrCreateConfiguration((Ses2Component) component).setTo((java.lang.String) value); return true;
            case "uriEndpointOverride": getOrCreateConfiguration((Ses2Component) component).setUriEndpointOverride((java.lang.String) value); return true;
            case "amazonSESClient": getOrCreateConfiguration((Ses2Component) component).setAmazonSESClient((software.amazon.awssdk.services.ses.SesClient) value); return true;
            case "autowiredEnabled": ((Ses2Component) component).setAutowiredEnabled((boolean) value); return true;
            case "healthCheckConsumerEnabled": ((Ses2Component) component).setHealthCheckConsumerEnabled((boolean) value); return true;
            case "healthCheckProducerEnabled": ((Ses2Component) component).setHealthCheckProducerEnabled((boolean) value); return true;
            case "proxyHost": getOrCreateConfiguration((Ses2Component) component).setProxyHost((java.lang.String) value); return true;
            case "proxyPort": getOrCreateConfiguration((Ses2Component) component).setProxyPort((java.lang.Integer) value); return true;
            case "proxyProtocol": getOrCreateConfiguration((Ses2Component) component).setProxyProtocol((software.amazon.awssdk.core.Protocol) value); return true;
            case "accessKey": getOrCreateConfiguration((Ses2Component) component).setAccessKey((java.lang.String) value); return true;
            case "profileCredentialsName": getOrCreateConfiguration((Ses2Component) component).setProfileCredentialsName((java.lang.String) value); return true;
            case "secretKey": getOrCreateConfiguration((Ses2Component) component).setSecretKey((java.lang.String) value); return true;
            case "trustAllCertificates": getOrCreateConfiguration((Ses2Component) component).setTrustAllCertificates((boolean) value); return true;
            case "useDefaultCredentialsProvider": getOrCreateConfiguration((Ses2Component) component).setUseDefaultCredentialsProvider((boolean) value); return true;
            case "useProfileCredentialsProvider": getOrCreateConfiguration((Ses2Component) component).setUseProfileCredentialsProvider((boolean) value); return true;
            default: return false;
            }
        }
    }
}