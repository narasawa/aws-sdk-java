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
package com.amazonaws.services.kendra.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides configuration information for crawling knowledge articles in the ServiceNow site.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/ServiceNowKnowledgeArticleConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ServiceNowKnowledgeArticleConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Indicates whether Amazon Kendra should index attachments to knowledge articles.
     * </p>
     */
    private Boolean crawlAttachments;
    /**
     * <p>
     * List of regular expressions applied to knowledge articles. Items that don't match the inclusion pattern are not
     * indexed. The regex is applied to the field specified in the <code>PatternTargetField</code>.
     * </p>
     */
    private java.util.List<String> includeAttachmentFilePatterns;
    /**
     * <p>
     * List of regular expressions applied to knowledge articles. Items that don't match the inclusion pattern are not
     * indexed. The regex is applied to the field specified in the <code>PatternTargetField</code>
     * </p>
     */
    private java.util.List<String> excludeAttachmentFilePatterns;
    /**
     * <p>
     * The name of the ServiceNow field that is mapped to the index document contents field in the Amazon Kendra index.
     * </p>
     */
    private String documentDataFieldName;
    /**
     * <p>
     * The name of the ServiceNow field that is mapped to the index document title field.
     * </p>
     */
    private String documentTitleFieldName;
    /**
     * <p>
     * Mapping between ServiceNow fields and Amazon Kendra index fields. You must create the index field before you map
     * the field.
     * </p>
     */
    private java.util.List<DataSourceToIndexFieldMapping> fieldMappings;

    /**
     * <p>
     * Indicates whether Amazon Kendra should index attachments to knowledge articles.
     * </p>
     * 
     * @param crawlAttachments
     *        Indicates whether Amazon Kendra should index attachments to knowledge articles.
     */

    public void setCrawlAttachments(Boolean crawlAttachments) {
        this.crawlAttachments = crawlAttachments;
    }

    /**
     * <p>
     * Indicates whether Amazon Kendra should index attachments to knowledge articles.
     * </p>
     * 
     * @return Indicates whether Amazon Kendra should index attachments to knowledge articles.
     */

    public Boolean getCrawlAttachments() {
        return this.crawlAttachments;
    }

    /**
     * <p>
     * Indicates whether Amazon Kendra should index attachments to knowledge articles.
     * </p>
     * 
     * @param crawlAttachments
     *        Indicates whether Amazon Kendra should index attachments to knowledge articles.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceNowKnowledgeArticleConfiguration withCrawlAttachments(Boolean crawlAttachments) {
        setCrawlAttachments(crawlAttachments);
        return this;
    }

    /**
     * <p>
     * Indicates whether Amazon Kendra should index attachments to knowledge articles.
     * </p>
     * 
     * @return Indicates whether Amazon Kendra should index attachments to knowledge articles.
     */

    public Boolean isCrawlAttachments() {
        return this.crawlAttachments;
    }

    /**
     * <p>
     * List of regular expressions applied to knowledge articles. Items that don't match the inclusion pattern are not
     * indexed. The regex is applied to the field specified in the <code>PatternTargetField</code>.
     * </p>
     * 
     * @return List of regular expressions applied to knowledge articles. Items that don't match the inclusion pattern
     *         are not indexed. The regex is applied to the field specified in the <code>PatternTargetField</code>.
     */

    public java.util.List<String> getIncludeAttachmentFilePatterns() {
        return includeAttachmentFilePatterns;
    }

    /**
     * <p>
     * List of regular expressions applied to knowledge articles. Items that don't match the inclusion pattern are not
     * indexed. The regex is applied to the field specified in the <code>PatternTargetField</code>.
     * </p>
     * 
     * @param includeAttachmentFilePatterns
     *        List of regular expressions applied to knowledge articles. Items that don't match the inclusion pattern
     *        are not indexed. The regex is applied to the field specified in the <code>PatternTargetField</code>.
     */

    public void setIncludeAttachmentFilePatterns(java.util.Collection<String> includeAttachmentFilePatterns) {
        if (includeAttachmentFilePatterns == null) {
            this.includeAttachmentFilePatterns = null;
            return;
        }

        this.includeAttachmentFilePatterns = new java.util.ArrayList<String>(includeAttachmentFilePatterns);
    }

    /**
     * <p>
     * List of regular expressions applied to knowledge articles. Items that don't match the inclusion pattern are not
     * indexed. The regex is applied to the field specified in the <code>PatternTargetField</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIncludeAttachmentFilePatterns(java.util.Collection)} or
     * {@link #withIncludeAttachmentFilePatterns(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param includeAttachmentFilePatterns
     *        List of regular expressions applied to knowledge articles. Items that don't match the inclusion pattern
     *        are not indexed. The regex is applied to the field specified in the <code>PatternTargetField</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceNowKnowledgeArticleConfiguration withIncludeAttachmentFilePatterns(String... includeAttachmentFilePatterns) {
        if (this.includeAttachmentFilePatterns == null) {
            setIncludeAttachmentFilePatterns(new java.util.ArrayList<String>(includeAttachmentFilePatterns.length));
        }
        for (String ele : includeAttachmentFilePatterns) {
            this.includeAttachmentFilePatterns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of regular expressions applied to knowledge articles. Items that don't match the inclusion pattern are not
     * indexed. The regex is applied to the field specified in the <code>PatternTargetField</code>.
     * </p>
     * 
     * @param includeAttachmentFilePatterns
     *        List of regular expressions applied to knowledge articles. Items that don't match the inclusion pattern
     *        are not indexed. The regex is applied to the field specified in the <code>PatternTargetField</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceNowKnowledgeArticleConfiguration withIncludeAttachmentFilePatterns(java.util.Collection<String> includeAttachmentFilePatterns) {
        setIncludeAttachmentFilePatterns(includeAttachmentFilePatterns);
        return this;
    }

    /**
     * <p>
     * List of regular expressions applied to knowledge articles. Items that don't match the inclusion pattern are not
     * indexed. The regex is applied to the field specified in the <code>PatternTargetField</code>
     * </p>
     * 
     * @return List of regular expressions applied to knowledge articles. Items that don't match the inclusion pattern
     *         are not indexed. The regex is applied to the field specified in the <code>PatternTargetField</code>
     */

    public java.util.List<String> getExcludeAttachmentFilePatterns() {
        return excludeAttachmentFilePatterns;
    }

    /**
     * <p>
     * List of regular expressions applied to knowledge articles. Items that don't match the inclusion pattern are not
     * indexed. The regex is applied to the field specified in the <code>PatternTargetField</code>
     * </p>
     * 
     * @param excludeAttachmentFilePatterns
     *        List of regular expressions applied to knowledge articles. Items that don't match the inclusion pattern
     *        are not indexed. The regex is applied to the field specified in the <code>PatternTargetField</code>
     */

    public void setExcludeAttachmentFilePatterns(java.util.Collection<String> excludeAttachmentFilePatterns) {
        if (excludeAttachmentFilePatterns == null) {
            this.excludeAttachmentFilePatterns = null;
            return;
        }

        this.excludeAttachmentFilePatterns = new java.util.ArrayList<String>(excludeAttachmentFilePatterns);
    }

    /**
     * <p>
     * List of regular expressions applied to knowledge articles. Items that don't match the inclusion pattern are not
     * indexed. The regex is applied to the field specified in the <code>PatternTargetField</code>
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setExcludeAttachmentFilePatterns(java.util.Collection)} or
     * {@link #withExcludeAttachmentFilePatterns(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param excludeAttachmentFilePatterns
     *        List of regular expressions applied to knowledge articles. Items that don't match the inclusion pattern
     *        are not indexed. The regex is applied to the field specified in the <code>PatternTargetField</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceNowKnowledgeArticleConfiguration withExcludeAttachmentFilePatterns(String... excludeAttachmentFilePatterns) {
        if (this.excludeAttachmentFilePatterns == null) {
            setExcludeAttachmentFilePatterns(new java.util.ArrayList<String>(excludeAttachmentFilePatterns.length));
        }
        for (String ele : excludeAttachmentFilePatterns) {
            this.excludeAttachmentFilePatterns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of regular expressions applied to knowledge articles. Items that don't match the inclusion pattern are not
     * indexed. The regex is applied to the field specified in the <code>PatternTargetField</code>
     * </p>
     * 
     * @param excludeAttachmentFilePatterns
     *        List of regular expressions applied to knowledge articles. Items that don't match the inclusion pattern
     *        are not indexed. The regex is applied to the field specified in the <code>PatternTargetField</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceNowKnowledgeArticleConfiguration withExcludeAttachmentFilePatterns(java.util.Collection<String> excludeAttachmentFilePatterns) {
        setExcludeAttachmentFilePatterns(excludeAttachmentFilePatterns);
        return this;
    }

    /**
     * <p>
     * The name of the ServiceNow field that is mapped to the index document contents field in the Amazon Kendra index.
     * </p>
     * 
     * @param documentDataFieldName
     *        The name of the ServiceNow field that is mapped to the index document contents field in the Amazon Kendra
     *        index.
     */

    public void setDocumentDataFieldName(String documentDataFieldName) {
        this.documentDataFieldName = documentDataFieldName;
    }

    /**
     * <p>
     * The name of the ServiceNow field that is mapped to the index document contents field in the Amazon Kendra index.
     * </p>
     * 
     * @return The name of the ServiceNow field that is mapped to the index document contents field in the Amazon Kendra
     *         index.
     */

    public String getDocumentDataFieldName() {
        return this.documentDataFieldName;
    }

    /**
     * <p>
     * The name of the ServiceNow field that is mapped to the index document contents field in the Amazon Kendra index.
     * </p>
     * 
     * @param documentDataFieldName
     *        The name of the ServiceNow field that is mapped to the index document contents field in the Amazon Kendra
     *        index.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceNowKnowledgeArticleConfiguration withDocumentDataFieldName(String documentDataFieldName) {
        setDocumentDataFieldName(documentDataFieldName);
        return this;
    }

    /**
     * <p>
     * The name of the ServiceNow field that is mapped to the index document title field.
     * </p>
     * 
     * @param documentTitleFieldName
     *        The name of the ServiceNow field that is mapped to the index document title field.
     */

    public void setDocumentTitleFieldName(String documentTitleFieldName) {
        this.documentTitleFieldName = documentTitleFieldName;
    }

    /**
     * <p>
     * The name of the ServiceNow field that is mapped to the index document title field.
     * </p>
     * 
     * @return The name of the ServiceNow field that is mapped to the index document title field.
     */

    public String getDocumentTitleFieldName() {
        return this.documentTitleFieldName;
    }

    /**
     * <p>
     * The name of the ServiceNow field that is mapped to the index document title field.
     * </p>
     * 
     * @param documentTitleFieldName
     *        The name of the ServiceNow field that is mapped to the index document title field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceNowKnowledgeArticleConfiguration withDocumentTitleFieldName(String documentTitleFieldName) {
        setDocumentTitleFieldName(documentTitleFieldName);
        return this;
    }

    /**
     * <p>
     * Mapping between ServiceNow fields and Amazon Kendra index fields. You must create the index field before you map
     * the field.
     * </p>
     * 
     * @return Mapping between ServiceNow fields and Amazon Kendra index fields. You must create the index field before
     *         you map the field.
     */

    public java.util.List<DataSourceToIndexFieldMapping> getFieldMappings() {
        return fieldMappings;
    }

    /**
     * <p>
     * Mapping between ServiceNow fields and Amazon Kendra index fields. You must create the index field before you map
     * the field.
     * </p>
     * 
     * @param fieldMappings
     *        Mapping between ServiceNow fields and Amazon Kendra index fields. You must create the index field before
     *        you map the field.
     */

    public void setFieldMappings(java.util.Collection<DataSourceToIndexFieldMapping> fieldMappings) {
        if (fieldMappings == null) {
            this.fieldMappings = null;
            return;
        }

        this.fieldMappings = new java.util.ArrayList<DataSourceToIndexFieldMapping>(fieldMappings);
    }

    /**
     * <p>
     * Mapping between ServiceNow fields and Amazon Kendra index fields. You must create the index field before you map
     * the field.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFieldMappings(java.util.Collection)} or {@link #withFieldMappings(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param fieldMappings
     *        Mapping between ServiceNow fields and Amazon Kendra index fields. You must create the index field before
     *        you map the field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceNowKnowledgeArticleConfiguration withFieldMappings(DataSourceToIndexFieldMapping... fieldMappings) {
        if (this.fieldMappings == null) {
            setFieldMappings(new java.util.ArrayList<DataSourceToIndexFieldMapping>(fieldMappings.length));
        }
        for (DataSourceToIndexFieldMapping ele : fieldMappings) {
            this.fieldMappings.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Mapping between ServiceNow fields and Amazon Kendra index fields. You must create the index field before you map
     * the field.
     * </p>
     * 
     * @param fieldMappings
     *        Mapping between ServiceNow fields and Amazon Kendra index fields. You must create the index field before
     *        you map the field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceNowKnowledgeArticleConfiguration withFieldMappings(java.util.Collection<DataSourceToIndexFieldMapping> fieldMappings) {
        setFieldMappings(fieldMappings);
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
        if (getCrawlAttachments() != null)
            sb.append("CrawlAttachments: ").append(getCrawlAttachments()).append(",");
        if (getIncludeAttachmentFilePatterns() != null)
            sb.append("IncludeAttachmentFilePatterns: ").append(getIncludeAttachmentFilePatterns()).append(",");
        if (getExcludeAttachmentFilePatterns() != null)
            sb.append("ExcludeAttachmentFilePatterns: ").append(getExcludeAttachmentFilePatterns()).append(",");
        if (getDocumentDataFieldName() != null)
            sb.append("DocumentDataFieldName: ").append(getDocumentDataFieldName()).append(",");
        if (getDocumentTitleFieldName() != null)
            sb.append("DocumentTitleFieldName: ").append(getDocumentTitleFieldName()).append(",");
        if (getFieldMappings() != null)
            sb.append("FieldMappings: ").append(getFieldMappings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ServiceNowKnowledgeArticleConfiguration == false)
            return false;
        ServiceNowKnowledgeArticleConfiguration other = (ServiceNowKnowledgeArticleConfiguration) obj;
        if (other.getCrawlAttachments() == null ^ this.getCrawlAttachments() == null)
            return false;
        if (other.getCrawlAttachments() != null && other.getCrawlAttachments().equals(this.getCrawlAttachments()) == false)
            return false;
        if (other.getIncludeAttachmentFilePatterns() == null ^ this.getIncludeAttachmentFilePatterns() == null)
            return false;
        if (other.getIncludeAttachmentFilePatterns() != null
                && other.getIncludeAttachmentFilePatterns().equals(this.getIncludeAttachmentFilePatterns()) == false)
            return false;
        if (other.getExcludeAttachmentFilePatterns() == null ^ this.getExcludeAttachmentFilePatterns() == null)
            return false;
        if (other.getExcludeAttachmentFilePatterns() != null
                && other.getExcludeAttachmentFilePatterns().equals(this.getExcludeAttachmentFilePatterns()) == false)
            return false;
        if (other.getDocumentDataFieldName() == null ^ this.getDocumentDataFieldName() == null)
            return false;
        if (other.getDocumentDataFieldName() != null && other.getDocumentDataFieldName().equals(this.getDocumentDataFieldName()) == false)
            return false;
        if (other.getDocumentTitleFieldName() == null ^ this.getDocumentTitleFieldName() == null)
            return false;
        if (other.getDocumentTitleFieldName() != null && other.getDocumentTitleFieldName().equals(this.getDocumentTitleFieldName()) == false)
            return false;
        if (other.getFieldMappings() == null ^ this.getFieldMappings() == null)
            return false;
        if (other.getFieldMappings() != null && other.getFieldMappings().equals(this.getFieldMappings()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCrawlAttachments() == null) ? 0 : getCrawlAttachments().hashCode());
        hashCode = prime * hashCode + ((getIncludeAttachmentFilePatterns() == null) ? 0 : getIncludeAttachmentFilePatterns().hashCode());
        hashCode = prime * hashCode + ((getExcludeAttachmentFilePatterns() == null) ? 0 : getExcludeAttachmentFilePatterns().hashCode());
        hashCode = prime * hashCode + ((getDocumentDataFieldName() == null) ? 0 : getDocumentDataFieldName().hashCode());
        hashCode = prime * hashCode + ((getDocumentTitleFieldName() == null) ? 0 : getDocumentTitleFieldName().hashCode());
        hashCode = prime * hashCode + ((getFieldMappings() == null) ? 0 : getFieldMappings().hashCode());
        return hashCode;
    }

    @Override
    public ServiceNowKnowledgeArticleConfiguration clone() {
        try {
            return (ServiceNowKnowledgeArticleConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kendra.model.transform.ServiceNowKnowledgeArticleConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
