/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.devopsguru.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/DescribeFeedback" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeFeedbackRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the insight for which the feedback was provided.
     * </p>
     */
    private String insightId;

    /**
     * <p>
     * The ID of the insight for which the feedback was provided.
     * </p>
     * 
     * @param insightId
     *        The ID of the insight for which the feedback was provided.
     */

    public void setInsightId(String insightId) {
        this.insightId = insightId;
    }

    /**
     * <p>
     * The ID of the insight for which the feedback was provided.
     * </p>
     * 
     * @return The ID of the insight for which the feedback was provided.
     */

    public String getInsightId() {
        return this.insightId;
    }

    /**
     * <p>
     * The ID of the insight for which the feedback was provided.
     * </p>
     * 
     * @param insightId
     *        The ID of the insight for which the feedback was provided.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFeedbackRequest withInsightId(String insightId) {
        setInsightId(insightId);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getInsightId() != null)
            sb.append("InsightId: ").append(getInsightId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeFeedbackRequest == false)
            return false;
        DescribeFeedbackRequest other = (DescribeFeedbackRequest) obj;
        if (other.getInsightId() == null ^ this.getInsightId() == null)
            return false;
        if (other.getInsightId() != null && other.getInsightId().equals(this.getInsightId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInsightId() == null) ? 0 : getInsightId().hashCode());
        return hashCode;
    }

    @Override
    public DescribeFeedbackRequest clone() {
        return (DescribeFeedbackRequest) super.clone();
    }

}
