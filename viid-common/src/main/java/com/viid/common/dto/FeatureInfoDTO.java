/*
 * Copyright (c) 2020 qian.he Authors. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.viid.common.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * FeatureInfo
 * 特征值对象
 *
 * @author qian.he
 * @version 1.0
 * @date 2021/4/9
 * @since 1.0
 **/

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonRootName("FeatureInfoObject")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FeatureInfoDTO {


    /**
     * 算法版本
     *
     * @mock
     * @since 0.1.0
     */
    @JsonProperty(value = "AlgorithmVersion")
    private String algorithmVersion;


    /**
     * 特征值数据
     *
     * @mock
     * @since 0.1.0
     */
    @JsonProperty(value = "FeatureData")
    private String featureData;


    /**
     * 特征值ID
     *
     * @mock
     * @since 0.1.0
     */
    @JsonProperty(value = "FeatureID")
    private String featureId;


    /**
     * 厂商
     *
     * @mock
     * @since 0.1.0
     */
    @JsonProperty(value = "Vendor")
    private String vendor;
}