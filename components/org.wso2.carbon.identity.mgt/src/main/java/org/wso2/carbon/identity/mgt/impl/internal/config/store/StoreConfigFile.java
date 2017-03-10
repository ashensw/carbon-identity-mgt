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

package org.wso2.carbon.identity.mgt.impl.internal.config.store;

import org.wso2.carbon.kernel.annotations.Configuration;

import java.util.ArrayList;
import java.util.List;

/**
 * StoreConfigs Bean.
 *
 * @since 1.0.0
 */
@Configuration(namespace = "wso2.store.config", description = "Store Configuration Parameters")
public class StoreConfigFile {

    private boolean enableCache = true;

    private StoreConfigEntry identityStore = new StoreConfigEntry();

    private StoreConfigEntry credentialStore = new StoreConfigEntry();

    public StoreConfigFile() {
        // Identity store default configurations.
        identityStore.setEnableCache(true);
        CacheConfigEntry identityStoreCacheConfigEntry = new CacheConfigEntry("CACHE-USERNAME", true, 300, 1000, true);
        List<CacheConfigEntry> identityStoreCacheConfigs = new ArrayList<>();
        identityStoreCacheConfigs.add(identityStoreCacheConfigEntry);
        identityStore.setCacheConfigs(identityStoreCacheConfigs);

        // Credential store default configurations.
        credentialStore.setEnableCache(false);
    }

    public boolean isEnableCache() {
        return enableCache;
    }

    public void setEnableCache(boolean enableCache) {
        this.enableCache = enableCache;
    }

    public StoreConfigEntry getIdentityStore() {
        return identityStore;
    }

    public void setIdentityStore(StoreConfigEntry identityStore) {
        this.identityStore = identityStore;
    }

    public StoreConfigEntry getCredentialStore() {
        return credentialStore;
    }

    public void setCredentialStore(StoreConfigEntry credentialStore) {
        this.credentialStore = credentialStore;
    }
}

