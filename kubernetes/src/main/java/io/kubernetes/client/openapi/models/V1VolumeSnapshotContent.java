package io.kubernetes.client.openapi.models;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/** VolumeSnapshot is a user's request for and create a volume snapshot */
@ApiModel(description = "VolumeSnapshot is a user's request for and create a volume snapshot")
public class V1VolumeSnapshotContent implements io.kubernetes.client.common.KubernetesObject {
    public static final String SERIALIZED_NAME_API_VERSION = "apiVersion";

    @SerializedName(SERIALIZED_NAME_API_VERSION)
    private String apiVersion;

    public static final String SERIALIZED_NAME_KIND = "kind";

    @SerializedName(SERIALIZED_NAME_KIND)
    private String kind;

    public static final String SERIALIZED_NAME_METADATA = "metadata";

    @SerializedName(SERIALIZED_NAME_METADATA)
    private V1ObjectMeta metadata;

    public static final String SERIALIZED_NAME_SPEC = "spec";

    @SerializedName(SERIALIZED_NAME_SPEC)
    private V1VolumeSnapshotContentSpec spec;

    public static final String SERIALIZED_NAME_STATUS = "status";

    @SerializedName(SERIALIZED_NAME_STATUS)
    private V1VolumeSnapshotContentStatus status;

    public V1VolumeSnapshotContent apiVersion(String apiVersion) {

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

    public V1VolumeSnapshotContent kind(String kind) {

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

    public V1VolumeSnapshotContent metadata(V1ObjectMeta metadata) {

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

    public V1VolumeSnapshotContent spec(V1VolumeSnapshotContentSpec spec) {

        this.spec = spec;
        return this;
    }

    /**
     * Get spec
     *
     * @return spec
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public V1VolumeSnapshotContentSpec getSpec() {
        return spec;
    }

    public void setSpec(V1VolumeSnapshotContentSpec spec) {
        this.spec = spec;
    }

    public V1VolumeSnapshotContent status(V1VolumeSnapshotContentStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get status
     *
     * @return status
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public V1VolumeSnapshotContentStatus getStatus() {
        return status;
    }

    public void setStatus(V1VolumeSnapshotContentStatus status) {
        this.status = status;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        V1VolumeSnapshotContent volumeSnapshotContent = (V1VolumeSnapshotContent) o;
        return Objects.equals(this.apiVersion, volumeSnapshotContent.apiVersion)
                && Objects.equals(this.kind, volumeSnapshotContent.kind)
                && Objects.equals(this.metadata, volumeSnapshotContent.metadata)
                && Objects.equals(this.spec, volumeSnapshotContent.spec)
                && Objects.equals(this.status, volumeSnapshotContent.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(apiVersion, kind, metadata, spec, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class V1VolumeSnapshot {\n");
        sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
        sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
        sb.append("    spec: ").append(toIndentedString(spec)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
