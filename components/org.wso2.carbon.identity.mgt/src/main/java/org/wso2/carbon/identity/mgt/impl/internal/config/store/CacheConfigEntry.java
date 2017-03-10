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

/**
 * Cache Config Entry
 */
@Configuration(description = "Cache Configuration Parameters")
public class CacheConfigEntry {

    private String name = "CACHE-USERNAME";;

    private boolean enableCache = true;

    private int expireTime = 300;

    private int maxCapacity = 1000;

    private boolean statisticsEnabled = true;

    public CacheConfigEntry() {
    }

    public CacheConfigEntry(String name, boolean enableCache, int expireTime, int maxCapacity,
                            boolean statisticsEnabled) {
        this.name = name;
        this.enableCache = enableCache;
        this.expireTime = expireTime;
        this.maxCapacity = maxCapacity;
        this.statisticsEnabled = statisticsEnabled;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isEnableCache() {
        return enableCache;
    }

    public void setEnableCache(boolean enableCache) {
        this.enableCache = enableCache;
    }

    public int getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(int expireTime) {
        this.expireTime = expireTime;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public boolean isStatisticsEnabled() {
        return statisticsEnabled;
    }

    public void setStatisticsEnabled(boolean statisticsEnabled) {
        this.statisticsEnabled = statisticsEnabled;
    }
}
