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
package com.amazonaws.services.eks.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object representing the details of an update request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/UpdateParam" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateParam implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The keys associated with an update request.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The value of the keys submitted as part of an update request.
     * </p>
     */
    private String value;

    /**
     * <p>
     * The keys associated with an update request.
     * </p>
     * 
     * @param type
     *        The keys associated with an update request.
     * @see UpdateParamType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The keys associated with an update request.
     * </p>
     * 
     * @return The keys associated with an update request.
     * @see UpdateParamType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The keys associated with an update request.
     * </p>
     * 
     * @param type
     *        The keys associated with an update request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UpdateParamType
     */

    public UpdateParam withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The keys associated with an update request.
     * </p>
     * 
     * @param type
     *        The keys associated with an update request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UpdateParamType
     */

    public UpdateParam withType(UpdateParamType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The value of the keys submitted as part of an update request.
     * </p>
     * 
     * @param value
     *        The value of the keys submitted as part of an update request.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The value of the keys submitted as part of an update request.
     * </p>
     * 
     * @return The value of the keys submitted as part of an update request.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * The value of the keys submitted as part of an update request.
     * </p>
     * 
     * @param value
     *        The value of the keys submitted as part of an update request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateParam withValue(String value) {
        setValue(value);
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
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getValue() != null)
            sb.append("Value: ").append(getValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateParam == false)
            return false;
        UpdateParam other = (UpdateParam) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public UpdateParam clone() {
        try {
            return (UpdateParam) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.eks.model.transform.UpdateParamMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
