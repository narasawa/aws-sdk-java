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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Configuration information for a world.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/WorldConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WorldConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The world generated by Simulation WorldForge.
     * </p>
     */
    private String world;

    /**
     * <p>
     * The world generated by Simulation WorldForge.
     * </p>
     * 
     * @param world
     *        The world generated by Simulation WorldForge.
     */

    public void setWorld(String world) {
        this.world = world;
    }

    /**
     * <p>
     * The world generated by Simulation WorldForge.
     * </p>
     * 
     * @return The world generated by Simulation WorldForge.
     */

    public String getWorld() {
        return this.world;
    }

    /**
     * <p>
     * The world generated by Simulation WorldForge.
     * </p>
     * 
     * @param world
     *        The world generated by Simulation WorldForge.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorldConfig withWorld(String world) {
        setWorld(world);
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
        if (getWorld() != null)
            sb.append("World: ").append(getWorld());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof WorldConfig == false)
            return false;
        WorldConfig other = (WorldConfig) obj;
        if (other.getWorld() == null ^ this.getWorld() == null)
            return false;
        if (other.getWorld() != null && other.getWorld().equals(this.getWorld()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWorld() == null) ? 0 : getWorld().hashCode());
        return hashCode;
    }

    @Override
    public WorldConfig clone() {
        try {
            return (WorldConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.robomaker.model.transform.WorldConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
