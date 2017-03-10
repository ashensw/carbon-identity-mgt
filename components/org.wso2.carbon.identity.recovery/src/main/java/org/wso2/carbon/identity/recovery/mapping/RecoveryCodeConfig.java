/*
 * Copyright (c) 2017, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.carbon.identity.recovery.mapping;

import org.wso2.carbon.kernel.annotations.Configuration;

/**
 *
 */
@Configuration(description = "Recovery Code Configurations")
public class RecoveryCodeConfig {
    private boolean enableAPI = false;
    private boolean enablePortal = false;

    public boolean isEnableAPI() {
        return enableAPI;
    }

    public void setEnableAPI(boolean enableAPI) {
        this.enableAPI = enableAPI;
    }

    public boolean isEnablePortal() {
        return enablePortal;
    }

    public void setEnablePortal(boolean enablePortal) {
        this.enablePortal = enablePortal;
    }
}
