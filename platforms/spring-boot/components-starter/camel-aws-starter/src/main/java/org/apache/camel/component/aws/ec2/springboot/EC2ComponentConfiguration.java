/**
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
package org.apache.camel.component.aws.ec2.springboot;

import javax.annotation.Generated;
import com.amazonaws.services.ec2.AmazonEC2Client;
import org.apache.camel.component.aws.ec2.EC2Operations;
import org.apache.camel.spring.boot.ComponentConfigurationPropertiesCommon;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;

/**
 * The aws-ec2 is used for managing Amazon EC2 instances.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.SpringBootAutoConfigurationMojo")
@ConfigurationProperties(prefix = "camel.component.aws-ec2")
public class EC2ComponentConfiguration
        extends
            ComponentConfigurationPropertiesCommon {

    /**
     * The AWS EC2 default configuration
     */
    private EC2ConfigurationNestedConfiguration configuration;
    /**
     * The region in which EC2 client needs to work
     */
    private String region;
    /**
     * Amazon AWS Access Key
     */
    private String accessKey;
    /**
     * Amazon AWS Secret Key
     */
    private String secretKey;
    /**
     * Whether the component should resolve property placeholders on itself when
     * starting. Only properties which are of String type can use property
     * placeholders.
     */
    private Boolean resolvePropertyPlaceholders = true;

    public EC2ConfigurationNestedConfiguration getConfiguration() {
        return configuration;
    }

    public void setConfiguration(
            EC2ConfigurationNestedConfiguration configuration) {
        this.configuration = configuration;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getAccessKey() {
        return accessKey;
    }

    public void setAccessKey(String accessKey) {
        this.accessKey = accessKey;
    }

    public String getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }

    public Boolean getResolvePropertyPlaceholders() {
        return resolvePropertyPlaceholders;
    }

    public void setResolvePropertyPlaceholders(
            Boolean resolvePropertyPlaceholders) {
        this.resolvePropertyPlaceholders = resolvePropertyPlaceholders;
    }

    public static class EC2ConfigurationNestedConfiguration {
        public static final Class CAMEL_NESTED_CLASS = org.apache.camel.component.aws.ec2.EC2Configuration.class;
        /**
         * To use a existing configured AmazonEC2Client as client
         */
        @NestedConfigurationProperty
        private AmazonEC2Client amazonEc2Client;
        /**
         * Amazon AWS Access Key
         */
        private String accessKey;
        /**
         * Amazon AWS Secret Key
         */
        private String secretKey;
        /**
         * The region with which the AWS-EC2 client wants to work with.
         */
        private String amazonEc2Endpoint;
        /**
         * The operation to perform. It can be createAndRunInstances,
         * startInstances, stopInstances, terminateInstances, describeInstances,
         * describeInstancesStatus, rebootInstances, monitorInstances,
         * unmonitorInstances, createTags or deleteTags
         */
        private EC2Operations operation;
        private String proxyHost;
        private Integer proxyPort;
        private String region;

        public AmazonEC2Client getAmazonEc2Client() {
            return amazonEc2Client;
        }

        public void setAmazonEc2Client(AmazonEC2Client amazonEc2Client) {
            this.amazonEc2Client = amazonEc2Client;
        }

        public String getAccessKey() {
            return accessKey;
        }

        public void setAccessKey(String accessKey) {
            this.accessKey = accessKey;
        }

        public String getSecretKey() {
            return secretKey;
        }

        public void setSecretKey(String secretKey) {
            this.secretKey = secretKey;
        }

        public String getAmazonEc2Endpoint() {
            return amazonEc2Endpoint;
        }

        public void setAmazonEc2Endpoint(String amazonEc2Endpoint) {
            this.amazonEc2Endpoint = amazonEc2Endpoint;
        }

        public EC2Operations getOperation() {
            return operation;
        }

        public void setOperation(EC2Operations operation) {
            this.operation = operation;
        }

        public String getProxyHost() {
            return proxyHost;
        }

        public void setProxyHost(String proxyHost) {
            this.proxyHost = proxyHost;
        }

        public Integer getProxyPort() {
            return proxyPort;
        }

        public void setProxyPort(Integer proxyPort) {
            this.proxyPort = proxyPort;
        }

        public String getRegion() {
            return region;
        }

        public void setRegion(String region) {
            this.region = region;
        }
    }
}