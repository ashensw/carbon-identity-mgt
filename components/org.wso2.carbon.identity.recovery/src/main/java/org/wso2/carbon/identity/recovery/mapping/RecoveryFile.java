/*
* Copyright (c) 2017, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
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
package org.wso2.carbon.identity.recovery.mapping;

import org.wso2.carbon.kernel.annotations.Configuration;

/**
 * Class to represent account recovery configuration
 */
@Configuration(namespace = "wso2.recovery.config", description = "Recovery configurations")
public class RecoveryFile {

    private RecoveryConfig recovery = new RecoveryConfig();

    public RecoveryConfig getRecovery() {
        return recovery;
    }

    public void setRecovery(RecoveryConfig recovery) {
        this.recovery = recovery;
    }

}
