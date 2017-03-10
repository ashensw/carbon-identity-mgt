/*
 * Copyright (c) 2016, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.wso2.carbon.identity.recovery.internal;

import org.wso2.carbon.identity.event.EventService;
import org.wso2.carbon.identity.mgt.RealmService;
import org.wso2.carbon.identity.recovery.mapping.RecoveryLinkConfig;
import org.wso2.carbon.kernel.configprovider.ConfigProvider;

/**
 * Identity Recovery Service DataHolder.
 */
public class IdentityRecoveryServiceDataHolder {

    private static IdentityRecoveryServiceDataHolder instance = new IdentityRecoveryServiceDataHolder();
    private RealmService realmService;
    private EventService identityEventService;
    private RecoveryLinkConfig recoveryLinkConfig;
    private ConfigProvider configProvider;

    public static IdentityRecoveryServiceDataHolder getInstance() {
        return instance;
    }

    public EventService getIdentityEventService() {
        return identityEventService;
    }

    public void setIdentityEventService(EventService identityEventService) {
        this.identityEventService = identityEventService;
    }

    public RealmService getRealmService() {
        return realmService;
    }

    public void setRealmService(RealmService realmService) {
        this.realmService = realmService;
    }

    public RecoveryLinkConfig getRecoveryLinkConfig() {
        return recoveryLinkConfig;
    }

    public void setRecoveryLinkConfig(RecoveryLinkConfig recoveryLinkConfig) {
        this.recoveryLinkConfig = recoveryLinkConfig;
    }

    public ConfigProvider getConfigProvider() {
        return configProvider;
    }

    public void setConfigProvider(ConfigProvider configProvider) {
        this.configProvider = configProvider;
    }
}
