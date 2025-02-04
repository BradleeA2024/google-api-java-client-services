/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.language.v2.model;

/**
 * The data statistics of a series of STRUCT values.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Natural Language API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class XPSStructStats extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private XPSCommonStats commonStats;

  /**
   * Map from a field name of the struct to data stats aggregated over series of all data in that
   * field across all the structs.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, XPSDataStats> fieldStats;

  static {
    // hack to force ProGuard to consider XPSDataStats used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(XPSDataStats.class);
  }

  /**
   * @return value or {@code null} for none
   */
  public XPSCommonStats getCommonStats() {
    return commonStats;
  }

  /**
   * @param commonStats commonStats or {@code null} for none
   */
  public XPSStructStats setCommonStats(XPSCommonStats commonStats) {
    this.commonStats = commonStats;
    return this;
  }

  /**
   * Map from a field name of the struct to data stats aggregated over series of all data in that
   * field across all the structs.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, XPSDataStats> getFieldStats() {
    return fieldStats;
  }

  /**
   * Map from a field name of the struct to data stats aggregated over series of all data in that
   * field across all the structs.
   * @param fieldStats fieldStats or {@code null} for none
   */
  public XPSStructStats setFieldStats(java.util.Map<String, XPSDataStats> fieldStats) {
    this.fieldStats = fieldStats;
    return this;
  }

  @Override
  public XPSStructStats set(String fieldName, Object value) {
    return (XPSStructStats) super.set(fieldName, value);
  }

  @Override
  public XPSStructStats clone() {
    return (XPSStructStats) super.clone();
  }

}
