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
 * Class to represent Password Recovery config
 */
@Configuration(description = "Password Recovery configurations")
public class PasswordConfig {

    private boolean enableAPI = true;
    private boolean enablePortal = true;
    private String url = "/user-portal/recovery/password";
    private NotificationBasedConfig notificationBased = new NotificationBasedConfig();
    private SecurityQuestionsConfig securityQuestion = new SecurityQuestionsConfig();
    private ExternalConfig external = new ExternalConfig();

    public void setEnableAPI(boolean enableAPI) {
        this.enableAPI = enableAPI;
    }

    public boolean isEnableAPI() {
        return enableAPI;
    }

    public boolean isEnablePortal() {
        return enablePortal;
    }

    public void setEnablePortal(boolean enablePortal) {
        this.enablePortal = enablePortal;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public ExternalConfig getExternal() {
        return external;
    }

    public void setExternal(ExternalConfig external) {
        this.external = external;
    }

    public NotificationBasedConfig getNotificationBased() {
        return notificationBased;
    }

    public void setNotificationBased(NotificationBasedConfig notificationBased) {
        this.notificationBased = notificationBased;
    }

    public SecurityQuestionsConfig getSecurityQuestion() {
        return securityQuestion;
    }

    public void setSecurityQuestion(SecurityQuestionsConfig securityQuestion) {
        this.securityQuestion = securityQuestion;
    }

}
