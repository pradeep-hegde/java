/*
 * Kubernetes
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1.21.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.cert.manager.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.cert.manager.models.V1CertificateSpecAdditionalOutputFormatsInner;
import io.cert.manager.models.V1CertificateSpecIssuerRef;
import io.cert.manager.models.V1CertificateSpecKeystores;
import io.cert.manager.models.V1CertificateSpecPrivateKey;
import io.cert.manager.models.V1CertificateSpecSecretTemplate;
import io.cert.manager.models.V1CertificateSpecSubject;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import io.kubernetes.client.openapi.JSON;

/**
 * Specification of the desired state of the Certificate resource. https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-01T07:00:20.132973Z[Etc/UTC]")
public class V1CertificateSpec {
  public static final String SERIALIZED_NAME_ADDITIONAL_OUTPUT_FORMATS = "additionalOutputFormats";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_OUTPUT_FORMATS)
  private List<V1CertificateSpecAdditionalOutputFormatsInner> additionalOutputFormats;

  public static final String SERIALIZED_NAME_COMMON_NAME = "commonName";
  @SerializedName(SERIALIZED_NAME_COMMON_NAME)
  private String commonName;

  public static final String SERIALIZED_NAME_DNS_NAMES = "dnsNames";
  @SerializedName(SERIALIZED_NAME_DNS_NAMES)
  private List<String> dnsNames;

  public static final String SERIALIZED_NAME_DURATION = "duration";
  @SerializedName(SERIALIZED_NAME_DURATION)
  private String duration;

  public static final String SERIALIZED_NAME_EMAIL_ADDRESSES = "emailAddresses";
  @SerializedName(SERIALIZED_NAME_EMAIL_ADDRESSES)
  private List<String> emailAddresses;

  public static final String SERIALIZED_NAME_ENCODE_USAGES_IN_REQUEST = "encodeUsagesInRequest";
  @SerializedName(SERIALIZED_NAME_ENCODE_USAGES_IN_REQUEST)
  private Boolean encodeUsagesInRequest;

  public static final String SERIALIZED_NAME_IP_ADDRESSES = "ipAddresses";
  @SerializedName(SERIALIZED_NAME_IP_ADDRESSES)
  private List<String> ipAddresses;

  public static final String SERIALIZED_NAME_IS_C_A = "isCA";
  @SerializedName(SERIALIZED_NAME_IS_C_A)
  private Boolean isCA;

  public static final String SERIALIZED_NAME_ISSUER_REF = "issuerRef";
  @SerializedName(SERIALIZED_NAME_ISSUER_REF)
  private V1CertificateSpecIssuerRef issuerRef;

  public static final String SERIALIZED_NAME_KEYSTORES = "keystores";
  @SerializedName(SERIALIZED_NAME_KEYSTORES)
  private V1CertificateSpecKeystores keystores;

  public static final String SERIALIZED_NAME_LITERAL_SUBJECT = "literalSubject";
  @SerializedName(SERIALIZED_NAME_LITERAL_SUBJECT)
  private String literalSubject;

  public static final String SERIALIZED_NAME_PRIVATE_KEY = "privateKey";
  @SerializedName(SERIALIZED_NAME_PRIVATE_KEY)
  private V1CertificateSpecPrivateKey privateKey;

  public static final String SERIALIZED_NAME_RENEW_BEFORE = "renewBefore";
  @SerializedName(SERIALIZED_NAME_RENEW_BEFORE)
  private String renewBefore;

  public static final String SERIALIZED_NAME_REVISION_HISTORY_LIMIT = "revisionHistoryLimit";
  @SerializedName(SERIALIZED_NAME_REVISION_HISTORY_LIMIT)
  private Integer revisionHistoryLimit;

  public static final String SERIALIZED_NAME_SECRET_NAME = "secretName";
  @SerializedName(SERIALIZED_NAME_SECRET_NAME)
  private String secretName;

  public static final String SERIALIZED_NAME_SECRET_TEMPLATE = "secretTemplate";
  @SerializedName(SERIALIZED_NAME_SECRET_TEMPLATE)
  private V1CertificateSpecSecretTemplate secretTemplate;

  public static final String SERIALIZED_NAME_SUBJECT = "subject";
  @SerializedName(SERIALIZED_NAME_SUBJECT)
  private V1CertificateSpecSubject subject;

  public static final String SERIALIZED_NAME_URIS = "uris";
  @SerializedName(SERIALIZED_NAME_URIS)
  private List<String> uris;

  /**
   * KeyUsage specifies valid usage contexts for keys. See: https://tools.ietf.org/html/rfc5280#section-4.2.1.3 https://tools.ietf.org/html/rfc5280#section-4.2.1.12   Valid KeyUsage values are as follows: \&quot;signing\&quot;, \&quot;digital signature\&quot;, \&quot;content commitment\&quot;, \&quot;key encipherment\&quot;, \&quot;key agreement\&quot;, \&quot;data encipherment\&quot;, \&quot;cert sign\&quot;, \&quot;crl sign\&quot;, \&quot;encipher only\&quot;, \&quot;decipher only\&quot;, \&quot;any\&quot;, \&quot;server auth\&quot;, \&quot;client auth\&quot;, \&quot;code signing\&quot;, \&quot;email protection\&quot;, \&quot;s/mime\&quot;, \&quot;ipsec end system\&quot;, \&quot;ipsec tunnel\&quot;, \&quot;ipsec user\&quot;, \&quot;timestamping\&quot;, \&quot;ocsp signing\&quot;, \&quot;microsoft sgc\&quot;, \&quot;netscape sgc\&quot;
   */
  @JsonAdapter(UsagesEnum.Adapter.class)
  public enum UsagesEnum {
    SIGNING("signing"),
    
    DIGITAL_SIGNATURE("digital signature"),
    
    CONTENT_COMMITMENT("content commitment"),
    
    KEY_ENCIPHERMENT("key encipherment"),
    
    KEY_AGREEMENT("key agreement"),
    
    DATA_ENCIPHERMENT("data encipherment"),
    
    CERT_SIGN("cert sign"),
    
    CRL_SIGN("crl sign"),
    
    ENCIPHER_ONLY("encipher only"),
    
    DECIPHER_ONLY("decipher only"),
    
    ANY("any"),
    
    SERVER_AUTH("server auth"),
    
    CLIENT_AUTH("client auth"),
    
    CODE_SIGNING("code signing"),
    
    EMAIL_PROTECTION("email protection"),
    
    S_MIME("s/mime"),
    
    IPSEC_END_SYSTEM("ipsec end system"),
    
    IPSEC_TUNNEL("ipsec tunnel"),
    
    IPSEC_USER("ipsec user"),
    
    TIMESTAMPING("timestamping"),
    
    OCSP_SIGNING("ocsp signing"),
    
    MICROSOFT_SGC("microsoft sgc"),
    
    NETSCAPE_SGC("netscape sgc");

    private String value;

    UsagesEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static UsagesEnum fromValue(String value) {
      for (UsagesEnum b : UsagesEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<UsagesEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final UsagesEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public UsagesEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return UsagesEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_USAGES = "usages";
  @SerializedName(SERIALIZED_NAME_USAGES)
  private List<UsagesEnum> usages;

  public V1CertificateSpec() {
  }

  public V1CertificateSpec additionalOutputFormats(List<V1CertificateSpecAdditionalOutputFormatsInner> additionalOutputFormats) {
    
    this.additionalOutputFormats = additionalOutputFormats;
    return this;
  }

  public V1CertificateSpec addAdditionalOutputFormatsItem(V1CertificateSpecAdditionalOutputFormatsInner additionalOutputFormatsItem) {
    if (this.additionalOutputFormats == null) {
      this.additionalOutputFormats = new ArrayList<>();
    }
    this.additionalOutputFormats.add(additionalOutputFormatsItem);
    return this;
  }

   /**
   * Defines extra output formats of the private key and signed certificate chain to be written to this Certificate&#39;s target Secret.   This is an Alpha Feature and is only enabled with the &#x60;--feature-gates&#x3D;AdditionalCertificateOutputFormats&#x3D;true&#x60; option set on both the controller and webhook components.
   * @return additionalOutputFormats
  **/
  @jakarta.annotation.Nullable
  public List<V1CertificateSpecAdditionalOutputFormatsInner> getAdditionalOutputFormats() {
    return additionalOutputFormats;
  }


  public void setAdditionalOutputFormats(List<V1CertificateSpecAdditionalOutputFormatsInner> additionalOutputFormats) {
    this.additionalOutputFormats = additionalOutputFormats;
  }


  public V1CertificateSpec commonName(String commonName) {
    
    this.commonName = commonName;
    return this;
  }

   /**
   * Requested common name X509 certificate subject attribute. More info: https://datatracker.ietf.org/doc/html/rfc5280#section-4.1.2.6 NOTE: TLS clients will ignore this value when any subject alternative name is set (see https://tools.ietf.org/html/rfc6125#section-6.4.4).   Should have a length of 64 characters or fewer to avoid generating invalid CSRs. Cannot be set if the &#x60;literalSubject&#x60; field is set.
   * @return commonName
  **/
  @jakarta.annotation.Nullable
  public String getCommonName() {
    return commonName;
  }


  public void setCommonName(String commonName) {
    this.commonName = commonName;
  }


  public V1CertificateSpec dnsNames(List<String> dnsNames) {
    
    this.dnsNames = dnsNames;
    return this;
  }

  public V1CertificateSpec addDnsNamesItem(String dnsNamesItem) {
    if (this.dnsNames == null) {
      this.dnsNames = new ArrayList<>();
    }
    this.dnsNames.add(dnsNamesItem);
    return this;
  }

   /**
   * Requested DNS subject alternative names.
   * @return dnsNames
  **/
  @jakarta.annotation.Nullable
  public List<String> getDnsNames() {
    return dnsNames;
  }


  public void setDnsNames(List<String> dnsNames) {
    this.dnsNames = dnsNames;
  }


  public V1CertificateSpec duration(String duration) {
    
    this.duration = duration;
    return this;
  }

   /**
   * Requested &#39;duration&#39; (i.e. lifetime) of the Certificate. Note that the issuer may choose to ignore the requested duration, just like any other requested attribute.   If unset, this defaults to 90 days. Minimum accepted duration is 1 hour. Value must be in units accepted by Go time.ParseDuration https://golang.org/pkg/time/#ParseDuration.
   * @return duration
  **/
  @jakarta.annotation.Nullable
  public String getDuration() {
    return duration;
  }


  public void setDuration(String duration) {
    this.duration = duration;
  }


  public V1CertificateSpec emailAddresses(List<String> emailAddresses) {
    
    this.emailAddresses = emailAddresses;
    return this;
  }

  public V1CertificateSpec addEmailAddressesItem(String emailAddressesItem) {
    if (this.emailAddresses == null) {
      this.emailAddresses = new ArrayList<>();
    }
    this.emailAddresses.add(emailAddressesItem);
    return this;
  }

   /**
   * Requested email subject alternative names.
   * @return emailAddresses
  **/
  @jakarta.annotation.Nullable
  public List<String> getEmailAddresses() {
    return emailAddresses;
  }


  public void setEmailAddresses(List<String> emailAddresses) {
    this.emailAddresses = emailAddresses;
  }


  public V1CertificateSpec encodeUsagesInRequest(Boolean encodeUsagesInRequest) {
    
    this.encodeUsagesInRequest = encodeUsagesInRequest;
    return this;
  }

   /**
   * Whether the KeyUsage and ExtKeyUsage extensions should be set in the encoded CSR.   This option defaults to true, and should only be disabled if the target issuer does not support CSRs with these X509 KeyUsage/ ExtKeyUsage extensions.
   * @return encodeUsagesInRequest
  **/
  @jakarta.annotation.Nullable
  public Boolean getEncodeUsagesInRequest() {
    return encodeUsagesInRequest;
  }


  public void setEncodeUsagesInRequest(Boolean encodeUsagesInRequest) {
    this.encodeUsagesInRequest = encodeUsagesInRequest;
  }


  public V1CertificateSpec ipAddresses(List<String> ipAddresses) {
    
    this.ipAddresses = ipAddresses;
    return this;
  }

  public V1CertificateSpec addIpAddressesItem(String ipAddressesItem) {
    if (this.ipAddresses == null) {
      this.ipAddresses = new ArrayList<>();
    }
    this.ipAddresses.add(ipAddressesItem);
    return this;
  }

   /**
   * Requested IP address subject alternative names.
   * @return ipAddresses
  **/
  @jakarta.annotation.Nullable
  public List<String> getIpAddresses() {
    return ipAddresses;
  }


  public void setIpAddresses(List<String> ipAddresses) {
    this.ipAddresses = ipAddresses;
  }


  public V1CertificateSpec isCA(Boolean isCA) {
    
    this.isCA = isCA;
    return this;
  }

   /**
   * Requested basic constraints isCA value. The isCA value is used to set the &#x60;isCA&#x60; field on the created CertificateRequest resources. Note that the issuer may choose to ignore the requested isCA value, just like any other requested attribute.   If true, this will automatically add the &#x60;cert sign&#x60; usage to the list of requested &#x60;usages&#x60;.
   * @return isCA
  **/
  @jakarta.annotation.Nullable
  public Boolean getIsCA() {
    return isCA;
  }


  public void setIsCA(Boolean isCA) {
    this.isCA = isCA;
  }


  public V1CertificateSpec issuerRef(V1CertificateSpecIssuerRef issuerRef) {
    
    this.issuerRef = issuerRef;
    return this;
  }

   /**
   * Get issuerRef
   * @return issuerRef
  **/
  @jakarta.annotation.Nonnull
  public V1CertificateSpecIssuerRef getIssuerRef() {
    return issuerRef;
  }


  public void setIssuerRef(V1CertificateSpecIssuerRef issuerRef) {
    this.issuerRef = issuerRef;
  }


  public V1CertificateSpec keystores(V1CertificateSpecKeystores keystores) {
    
    this.keystores = keystores;
    return this;
  }

   /**
   * Get keystores
   * @return keystores
  **/
  @jakarta.annotation.Nullable
  public V1CertificateSpecKeystores getKeystores() {
    return keystores;
  }


  public void setKeystores(V1CertificateSpecKeystores keystores) {
    this.keystores = keystores;
  }


  public V1CertificateSpec literalSubject(String literalSubject) {
    
    this.literalSubject = literalSubject;
    return this;
  }

   /**
   * Requested X.509 certificate subject, represented using the LDAP \&quot;String Representation of a Distinguished Name\&quot; [1]. Important: the LDAP string format also specifies the order of the attributes in the subject, this is important when issuing certs for LDAP authentication. Example: &#x60;CN&#x3D;foo,DC&#x3D;corp,DC&#x3D;example,DC&#x3D;com&#x60; More info [1]: https://datatracker.ietf.org/doc/html/rfc4514 More info: https://github.com/cert-manager/cert-manager/issues/3203 More info: https://github.com/cert-manager/cert-manager/issues/4424   Cannot be set if the &#x60;subject&#x60; or &#x60;commonName&#x60; field is set. This is an Alpha Feature and is only enabled with the &#x60;--feature-gates&#x3D;LiteralCertificateSubject&#x3D;true&#x60; option set on both the controller and webhook components.
   * @return literalSubject
  **/
  @jakarta.annotation.Nullable
  public String getLiteralSubject() {
    return literalSubject;
  }


  public void setLiteralSubject(String literalSubject) {
    this.literalSubject = literalSubject;
  }


  public V1CertificateSpec privateKey(V1CertificateSpecPrivateKey privateKey) {
    
    this.privateKey = privateKey;
    return this;
  }

   /**
   * Get privateKey
   * @return privateKey
  **/
  @jakarta.annotation.Nullable
  public V1CertificateSpecPrivateKey getPrivateKey() {
    return privateKey;
  }


  public void setPrivateKey(V1CertificateSpecPrivateKey privateKey) {
    this.privateKey = privateKey;
  }


  public V1CertificateSpec renewBefore(String renewBefore) {
    
    this.renewBefore = renewBefore;
    return this;
  }

   /**
   * How long before the currently issued certificate&#39;s expiry cert-manager should renew the certificate. For example, if a certificate is valid for 60 minutes, and &#x60;renewBefore&#x3D;10m&#x60;, cert-manager will begin to attempt to renew the certificate 50 minutes after it was issued (i.e. when there are 10 minutes remaining until the certificate is no longer valid).   NOTE: The actual lifetime of the issued certificate is used to determine the renewal time. If an issuer returns a certificate with a different lifetime than the one requested, cert-manager will use the lifetime of the issued certificate.   If unset, this defaults to 1/3 of the issued certificate&#39;s lifetime. Minimum accepted value is 5 minutes. Value must be in units accepted by Go time.ParseDuration https://golang.org/pkg/time/#ParseDuration.
   * @return renewBefore
  **/
  @jakarta.annotation.Nullable
  public String getRenewBefore() {
    return renewBefore;
  }


  public void setRenewBefore(String renewBefore) {
    this.renewBefore = renewBefore;
  }


  public V1CertificateSpec revisionHistoryLimit(Integer revisionHistoryLimit) {
    
    this.revisionHistoryLimit = revisionHistoryLimit;
    return this;
  }

   /**
   * The maximum number of CertificateRequest revisions that are maintained in the Certificate&#39;s history. Each revision represents a single &#x60;CertificateRequest&#x60; created by this Certificate, either when it was created, renewed, or Spec was changed. Revisions will be removed by oldest first if the number of revisions exceeds this number.   If set, revisionHistoryLimit must be a value of &#x60;1&#x60; or greater. If unset (&#x60;nil&#x60;), revisions will not be garbage collected. Default value is &#x60;nil&#x60;.
   * @return revisionHistoryLimit
  **/
  @jakarta.annotation.Nullable
  public Integer getRevisionHistoryLimit() {
    return revisionHistoryLimit;
  }


  public void setRevisionHistoryLimit(Integer revisionHistoryLimit) {
    this.revisionHistoryLimit = revisionHistoryLimit;
  }


  public V1CertificateSpec secretName(String secretName) {
    
    this.secretName = secretName;
    return this;
  }

   /**
   * Name of the Secret resource that will be automatically created and managed by this Certificate resource. It will be populated with a private key and certificate, signed by the denoted issuer. The Secret resource lives in the same namespace as the Certificate resource.
   * @return secretName
  **/
  @jakarta.annotation.Nonnull
  public String getSecretName() {
    return secretName;
  }


  public void setSecretName(String secretName) {
    this.secretName = secretName;
  }


  public V1CertificateSpec secretTemplate(V1CertificateSpecSecretTemplate secretTemplate) {
    
    this.secretTemplate = secretTemplate;
    return this;
  }

   /**
   * Get secretTemplate
   * @return secretTemplate
  **/
  @jakarta.annotation.Nullable
  public V1CertificateSpecSecretTemplate getSecretTemplate() {
    return secretTemplate;
  }


  public void setSecretTemplate(V1CertificateSpecSecretTemplate secretTemplate) {
    this.secretTemplate = secretTemplate;
  }


  public V1CertificateSpec subject(V1CertificateSpecSubject subject) {
    
    this.subject = subject;
    return this;
  }

   /**
   * Get subject
   * @return subject
  **/
  @jakarta.annotation.Nullable
  public V1CertificateSpecSubject getSubject() {
    return subject;
  }


  public void setSubject(V1CertificateSpecSubject subject) {
    this.subject = subject;
  }


  public V1CertificateSpec uris(List<String> uris) {
    
    this.uris = uris;
    return this;
  }

  public V1CertificateSpec addUrisItem(String urisItem) {
    if (this.uris == null) {
      this.uris = new ArrayList<>();
    }
    this.uris.add(urisItem);
    return this;
  }

   /**
   * Requested URI subject alternative names.
   * @return uris
  **/
  @jakarta.annotation.Nullable
  public List<String> getUris() {
    return uris;
  }


  public void setUris(List<String> uris) {
    this.uris = uris;
  }


  public V1CertificateSpec usages(List<UsagesEnum> usages) {
    
    this.usages = usages;
    return this;
  }

  public V1CertificateSpec addUsagesItem(UsagesEnum usagesItem) {
    if (this.usages == null) {
      this.usages = new ArrayList<>();
    }
    this.usages.add(usagesItem);
    return this;
  }

   /**
   * Requested key usages and extended key usages. These usages are used to set the &#x60;usages&#x60; field on the created CertificateRequest resources. If &#x60;encodeUsagesInRequest&#x60; is unset or set to &#x60;true&#x60;, the usages will additionally be encoded in the &#x60;request&#x60; field which contains the CSR blob.   If unset, defaults to &#x60;digital signature&#x60; and &#x60;key encipherment&#x60;.
   * @return usages
  **/
  @jakarta.annotation.Nullable
  public List<UsagesEnum> getUsages() {
    return usages;
  }


  public void setUsages(List<UsagesEnum> usages) {
    this.usages = usages;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1CertificateSpec v1CertificateSpec = (V1CertificateSpec) o;
    return Objects.equals(this.additionalOutputFormats, v1CertificateSpec.additionalOutputFormats) &&
        Objects.equals(this.commonName, v1CertificateSpec.commonName) &&
        Objects.equals(this.dnsNames, v1CertificateSpec.dnsNames) &&
        Objects.equals(this.duration, v1CertificateSpec.duration) &&
        Objects.equals(this.emailAddresses, v1CertificateSpec.emailAddresses) &&
        Objects.equals(this.encodeUsagesInRequest, v1CertificateSpec.encodeUsagesInRequest) &&
        Objects.equals(this.ipAddresses, v1CertificateSpec.ipAddresses) &&
        Objects.equals(this.isCA, v1CertificateSpec.isCA) &&
        Objects.equals(this.issuerRef, v1CertificateSpec.issuerRef) &&
        Objects.equals(this.keystores, v1CertificateSpec.keystores) &&
        Objects.equals(this.literalSubject, v1CertificateSpec.literalSubject) &&
        Objects.equals(this.privateKey, v1CertificateSpec.privateKey) &&
        Objects.equals(this.renewBefore, v1CertificateSpec.renewBefore) &&
        Objects.equals(this.revisionHistoryLimit, v1CertificateSpec.revisionHistoryLimit) &&
        Objects.equals(this.secretName, v1CertificateSpec.secretName) &&
        Objects.equals(this.secretTemplate, v1CertificateSpec.secretTemplate) &&
        Objects.equals(this.subject, v1CertificateSpec.subject) &&
        Objects.equals(this.uris, v1CertificateSpec.uris) &&
        Objects.equals(this.usages, v1CertificateSpec.usages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalOutputFormats, commonName, dnsNames, duration, emailAddresses, encodeUsagesInRequest, ipAddresses, isCA, issuerRef, keystores, literalSubject, privateKey, renewBefore, revisionHistoryLimit, secretName, secretTemplate, subject, uris, usages);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1CertificateSpec {\n");
    sb.append("    additionalOutputFormats: ").append(toIndentedString(additionalOutputFormats)).append("\n");
    sb.append("    commonName: ").append(toIndentedString(commonName)).append("\n");
    sb.append("    dnsNames: ").append(toIndentedString(dnsNames)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    emailAddresses: ").append(toIndentedString(emailAddresses)).append("\n");
    sb.append("    encodeUsagesInRequest: ").append(toIndentedString(encodeUsagesInRequest)).append("\n");
    sb.append("    ipAddresses: ").append(toIndentedString(ipAddresses)).append("\n");
    sb.append("    isCA: ").append(toIndentedString(isCA)).append("\n");
    sb.append("    issuerRef: ").append(toIndentedString(issuerRef)).append("\n");
    sb.append("    keystores: ").append(toIndentedString(keystores)).append("\n");
    sb.append("    literalSubject: ").append(toIndentedString(literalSubject)).append("\n");
    sb.append("    privateKey: ").append(toIndentedString(privateKey)).append("\n");
    sb.append("    renewBefore: ").append(toIndentedString(renewBefore)).append("\n");
    sb.append("    revisionHistoryLimit: ").append(toIndentedString(revisionHistoryLimit)).append("\n");
    sb.append("    secretName: ").append(toIndentedString(secretName)).append("\n");
    sb.append("    secretTemplate: ").append(toIndentedString(secretTemplate)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    uris: ").append(toIndentedString(uris)).append("\n");
    sb.append("    usages: ").append(toIndentedString(usages)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("additionalOutputFormats");
    openapiFields.add("commonName");
    openapiFields.add("dnsNames");
    openapiFields.add("duration");
    openapiFields.add("emailAddresses");
    openapiFields.add("encodeUsagesInRequest");
    openapiFields.add("ipAddresses");
    openapiFields.add("isCA");
    openapiFields.add("issuerRef");
    openapiFields.add("keystores");
    openapiFields.add("literalSubject");
    openapiFields.add("privateKey");
    openapiFields.add("renewBefore");
    openapiFields.add("revisionHistoryLimit");
    openapiFields.add("secretName");
    openapiFields.add("secretTemplate");
    openapiFields.add("subject");
    openapiFields.add("uris");
    openapiFields.add("usages");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("issuerRef");
    openapiRequiredFields.add("secretName");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1CertificateSpec
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1CertificateSpec.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1CertificateSpec is not found in the empty JSON string", V1CertificateSpec.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1CertificateSpec.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1CertificateSpec` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1CertificateSpec.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("additionalOutputFormats") != null && !jsonObj.get("additionalOutputFormats").isJsonNull()) {
        JsonArray jsonArrayadditionalOutputFormats = jsonObj.getAsJsonArray("additionalOutputFormats");
        if (jsonArrayadditionalOutputFormats != null) {
          // ensure the json data is an array
          if (!jsonObj.get("additionalOutputFormats").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `additionalOutputFormats` to be an array in the JSON string but got `%s`", jsonObj.get("additionalOutputFormats").toString()));
          }

          // validate the optional field `additionalOutputFormats` (array)
          for (int i = 0; i < jsonArrayadditionalOutputFormats.size(); i++) {
            V1CertificateSpecAdditionalOutputFormatsInner.validateJsonObject(jsonArrayadditionalOutputFormats.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("commonName") != null && !jsonObj.get("commonName").isJsonNull()) && !jsonObj.get("commonName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `commonName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("commonName").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("dnsNames") != null && !jsonObj.get("dnsNames").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `dnsNames` to be an array in the JSON string but got `%s`", jsonObj.get("dnsNames").toString()));
      }
      if ((jsonObj.get("duration") != null && !jsonObj.get("duration").isJsonNull()) && !jsonObj.get("duration").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `duration` to be a primitive type in the JSON string but got `%s`", jsonObj.get("duration").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("emailAddresses") != null && !jsonObj.get("emailAddresses").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `emailAddresses` to be an array in the JSON string but got `%s`", jsonObj.get("emailAddresses").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("ipAddresses") != null && !jsonObj.get("ipAddresses").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `ipAddresses` to be an array in the JSON string but got `%s`", jsonObj.get("ipAddresses").toString()));
      }
      // validate the required field `issuerRef`
      V1CertificateSpecIssuerRef.validateJsonObject(jsonObj.getAsJsonObject("issuerRef"));
      // validate the optional field `keystores`
      if (jsonObj.get("keystores") != null && !jsonObj.get("keystores").isJsonNull()) {
        V1CertificateSpecKeystores.validateJsonObject(jsonObj.getAsJsonObject("keystores"));
      }
      if ((jsonObj.get("literalSubject") != null && !jsonObj.get("literalSubject").isJsonNull()) && !jsonObj.get("literalSubject").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `literalSubject` to be a primitive type in the JSON string but got `%s`", jsonObj.get("literalSubject").toString()));
      }
      // validate the optional field `privateKey`
      if (jsonObj.get("privateKey") != null && !jsonObj.get("privateKey").isJsonNull()) {
        V1CertificateSpecPrivateKey.validateJsonObject(jsonObj.getAsJsonObject("privateKey"));
      }
      if ((jsonObj.get("renewBefore") != null && !jsonObj.get("renewBefore").isJsonNull()) && !jsonObj.get("renewBefore").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `renewBefore` to be a primitive type in the JSON string but got `%s`", jsonObj.get("renewBefore").toString()));
      }
      if (!jsonObj.get("secretName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `secretName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("secretName").toString()));
      }
      // validate the optional field `secretTemplate`
      if (jsonObj.get("secretTemplate") != null && !jsonObj.get("secretTemplate").isJsonNull()) {
        V1CertificateSpecSecretTemplate.validateJsonObject(jsonObj.getAsJsonObject("secretTemplate"));
      }
      // validate the optional field `subject`
      if (jsonObj.get("subject") != null && !jsonObj.get("subject").isJsonNull()) {
        V1CertificateSpecSubject.validateJsonObject(jsonObj.getAsJsonObject("subject"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("uris") != null && !jsonObj.get("uris").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `uris` to be an array in the JSON string but got `%s`", jsonObj.get("uris").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("usages") != null && !jsonObj.get("usages").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `usages` to be an array in the JSON string but got `%s`", jsonObj.get("usages").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1CertificateSpec.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1CertificateSpec' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1CertificateSpec> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1CertificateSpec.class));

       return (TypeAdapter<T>) new TypeAdapter<V1CertificateSpec>() {
           @Override
           public void write(JsonWriter out, V1CertificateSpec value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1CertificateSpec read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1CertificateSpec given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1CertificateSpec
  * @throws IOException if the JSON string is invalid with respect to V1CertificateSpec
  */
  public static V1CertificateSpec fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1CertificateSpec.class);
  }

 /**
  * Convert an instance of V1CertificateSpec to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

