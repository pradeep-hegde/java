package io.kubernetes.client.openapi.models;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * VolumeSnapshotClass describes the parameters for a class of storage for which VolumeSnapshots can be dynamically
 * provisioned. VolumeSnapshotClass are non-namespaced; the name of the snapshot class according to etcd is in
 * ObjectMeta.Name.
 */
@ApiModel(description = "VolumeSnapshotClass describes the parameters for a class of storage for which VolumeSnapshot can be dynamically provisioned.")
public class V1VolumeSnapshotClass implements io.kubernetes.client.common.KubernetesObject {

    public static final String SERIALIZED_NAME_KIND = "kind";

    @SerializedName(SERIALIZED_NAME_KIND)
    private String kind;

    public static final String SERIALIZED_NAME_API_VERSION = "apiVersion";

    @SerializedName(SERIALIZED_NAME_API_VERSION)
    private String apiVersion;

    public static final String SERIALIZED_NAME_METADATA = "metadata";

    @SerializedName(SERIALIZED_NAME_METADATA)
    private V1ObjectMeta metadata;

    public static final String SERIALIZED_NAME_DRIVER = "driver";

    @SerializedName(SERIALIZED_NAME_DRIVER)
    private String driver;

    public static final String SERIALIZED_NAME_DELETION_POLICY = "deletionPolicy";

    @SerializedName(SERIALIZED_NAME_DELETION_POLICY)
    private String deletionPolicy;


    public static final String SERIALIZED_NAME_PARAMETERS = "parameters";

    @SerializedName(SERIALIZED_NAME_PARAMETERS)
    private Map<String, String> parameters = null;


    public V1VolumeSnapshotClass apiVersion(String apiVersion) {

        this.apiVersion = apiVersion;
        return this;
    }

    /**
     * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized
     * schemas to the latest internal value, and may reject unrecognized values. More info:
     * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
     *
     * @return apiVersion
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources")
    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public V1VolumeSnapshotClass kind(String kind) {

        this.kind = kind;
        return this;
    }

    /**
     * Kind is a string value representing the REST resource this object represents. Servers may infer this from the
     * endpoint the client submits requests to. Cannot be updated. In CamelCase. More info:
     * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     *
     * @return kind
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds")
    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public V1VolumeSnapshotClass metadata(V1ObjectMeta metadata) {

        this.metadata = metadata;
        return this;
    }

    /**
     * Get metadata
     *
     * @return metadata
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public V1ObjectMeta getMetadata() {
        return metadata;
    }

    public void setMetadata(V1ObjectMeta metadata) {
        this.metadata = metadata;
    }

    public V1VolumeSnapshotClass parameters(Map<String, String> parameters) {

        this.parameters = parameters;
        return this;
    }

    public V1VolumeSnapshotClass putParametersItem(String key, String parametersItem) {
        if (this.parameters == null) {
            this.parameters = new HashMap<>();
        }
        this.parameters.put(key, parametersItem);
        return this;
    }

    /**
     * driver indicates the type of the driver.
     *
     * @return driver
     */
    @ApiModelProperty(required = true, value = "Driver indicates the type of the driver.")
    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public V1VolumeSnapshotClass deletionPolicyPolicy(String deletionPolicy) {

        this.deletionPolicy = deletionPolicy;
        return this;
    }

    public V1VolumeSnapshotClass driver(String driver) {

        this.driver = driver;
        return this;
    }

    /**
     * Dynamically provisioned VolumeSnapshots of this snapshot class are created with this deletionPolicy. Defaults to
     * Delete.
     *
     * @return deletionPolicy
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Dynamically provisioned VolumeSnapshots of this snapshot class are created with this deletionPolicy. Defaults to Delete.")
    public String getDeletionPolicy() {
        return deletionPolicy;
    }

    public void setDeletionPolicy(String deletionPolicy) {
        this.deletionPolicy = deletionPolicy;
    }

    /**
     * Parameters holds the parameters for the driver that should create snapshots of this snapshot class.
     *
     * @return parameters
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Parameters holds the parameters for the driver that should create snapshots of this snapshot class.")
    public Map<String, String> getParameters() {
        return parameters;
    }

    public void setParameters(Map<String, String> parameters) {
        this.parameters = parameters;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        V1VolumeSnapshotClass v1VolumeSnapshotClass = (V1VolumeSnapshotClass) o;
        return Objects.equals(this.apiVersion, v1VolumeSnapshotClass.apiVersion)
                && Objects.equals(this.kind, v1VolumeSnapshotClass.kind)
                && Objects.equals(this.metadata, v1VolumeSnapshotClass.metadata)
                && Objects.equals(this.driver, v1VolumeSnapshotClass.driver)
                && Objects.equals(this.deletionPolicy, v1VolumeSnapshotClass.deletionPolicy)
                && Objects.equals(this.parameters, v1VolumeSnapshotClass.parameters);
    }

    @Override
    public int hashCode() {
        return Objects.hash(apiVersion, kind, metadata, parameters, driver, deletionPolicy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class V1SnapshotClass {\n");
        sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
        sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
        sb.append("    driver: ").append(toIndentedString(driver)).append("\n");
        sb.append("    deletionPolicy: ").append(toIndentedString(deletionPolicy)).append("\n");
        sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}
