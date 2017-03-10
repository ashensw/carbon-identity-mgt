/*
 * Copyright (c) 2016, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.wso2.carbon.identity.mgt.impl.internal.config.domain;

import org.wso2.carbon.kernel.annotations.Configuration;
import org.wso2.carbon.kernel.annotations.Element;

import java.util.Collections;
import java.util.List;

/**
 * Domain configuration entry.
 */
@Configuration(description = "Domain Configuration Entry")
public class DomainConfigEntry {

    @Element(description = "Domain Id value")
    private int id;

    @Element(description = "Unique name of the domain")
    private String name;

    @Element(description = "Order of the domain")
    private int order;

    @Element(description = "Domain status")
    private boolean active = true;

    private UniqueIdResolverConfigEntry uniqueIdResolver = new UniqueIdResolverConfigEntry();

    @Element(description = "IdentityStoreConnector domain configuration list")
    private List<DomainStoreConnectorEntry> identityStoreConnectors;

    @Element(description = "IdentityStoreConnector domain configuration list")
    private List<DomainStoreConnectorEntry> credentialStoreConnectors;

    public DomainConfigEntry() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    /**
     * Get the name of the domain.
     *
     * @return Name of the domain
     */
    public String getName() {
        return name;
    }

    /**
     * Set the name of the domain.
     *
     * @param name Name of the domain
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get the order of the domain.
     *
     * @return integer - domain order
     */
    public int getOrder() {
        return order;
    }

    /**
     * Set the order of the domain.
     *
     * @param order - domain order
     */
    public void setOrder(int order) {
        this.order = order;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public UniqueIdResolverConfigEntry getUniqueIdResolver() {
        return uniqueIdResolver;
    }

    public void setUniqueIdResolver(UniqueIdResolverConfigEntry uniqueIdResolver) {
        this.uniqueIdResolver = uniqueIdResolver;
    }

    /**
     * Get a list of domain store configuration entries for identity connectors.
     *
     * @return DomainStoreConnectorEntry
     */
    public List<DomainStoreConnectorEntry> getIdentityStoreConnectors() {

        if (identityStoreConnectors == null) {
            return Collections.emptyList();
        }
        return identityStoreConnectors;
    }

    /**
     * Set a list of domain store configuration entries for identity connectors.
     *
     * @param identityStoreConnectors List&lt;DomainStoreConnectorEntry&gt;
     */
    public void setIdentityStoreConnectors(List<DomainStoreConnectorEntry> identityStoreConnectors) {
        this.identityStoreConnectors = identityStoreConnectors;
    }

    public List<DomainStoreConnectorEntry> getCredentialStoreConnectors() {

        if (credentialStoreConnectors == null) {
            return Collections.emptyList();
        }
        return credentialStoreConnectors;
    }

    public void setCredentialStoreConnectors(List<DomainStoreConnectorEntry> credentialStoreConnectors) {
        this.credentialStoreConnectors = credentialStoreConnectors;
    }
}
