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
package com.amazonaws.services.connect.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.connect.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateQueueMaxContactsRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateQueueMaxContactsRequestMarshaller {

    private static final MarshallingInfo<String> INSTANCEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("InstanceId").build();
    private static final MarshallingInfo<String> QUEUEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("QueueId").build();
    private static final MarshallingInfo<Integer> MAXCONTACTS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MaxContacts").build();

    private static final UpdateQueueMaxContactsRequestMarshaller instance = new UpdateQueueMaxContactsRequestMarshaller();

    public static UpdateQueueMaxContactsRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateQueueMaxContactsRequest updateQueueMaxContactsRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateQueueMaxContactsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateQueueMaxContactsRequest.getInstanceId(), INSTANCEID_BINDING);
            protocolMarshaller.marshall(updateQueueMaxContactsRequest.getQueueId(), QUEUEID_BINDING);
            protocolMarshaller.marshall(updateQueueMaxContactsRequest.getMaxContacts(), MAXCONTACTS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
