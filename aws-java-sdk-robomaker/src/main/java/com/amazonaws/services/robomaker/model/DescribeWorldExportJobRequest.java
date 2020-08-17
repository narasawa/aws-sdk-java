/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.robomaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/DescribeWorldExportJob" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeWorldExportJobRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (arn) of the world export job to describe.
     * </p>
     */
    private String job;

    /**
     * <p>
     * The Amazon Resource Name (arn) of the world export job to describe.
     * </p>
     * 
     * @param job
     *        The Amazon Resource Name (arn) of the world export job to describe.
     */

    public void setJob(String job) {
        this.job = job;
    }

    /**
     * <p>
     * The Amazon Resource Name (arn) of the world export job to describe.
     * </p>
     * 
     * @return The Amazon Resource Name (arn) of the world export job to describe.
     */

    public String getJob() {
        return this.job;
    }

    /**
     * <p>
     * The Amazon Resource Name (arn) of the world export job to describe.
     * </p>
     * 
     * @param job
     *        The Amazon Resource Name (arn) of the world export job to describe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeWorldExportJobRequest withJob(String job) {
        setJob(job);
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
        if (getJob() != null)
            sb.append("Job: ").append(getJob());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeWorldExportJobRequest == false)
            return false;
        DescribeWorldExportJobRequest other = (DescribeWorldExportJobRequest) obj;
        if (other.getJob() == null ^ this.getJob() == null)
            return false;
        if (other.getJob() != null && other.getJob().equals(this.getJob()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJob() == null) ? 0 : getJob().hashCode());
        return hashCode;
    }

    @Override
    public DescribeWorldExportJobRequest clone() {
        return (DescribeWorldExportJobRequest) super.clone();
    }

}
