package io.kubernetes.client.openapi.models;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * V1VolumeSnapshotSpec describes the common attributes of storage devices and allows a Source for provider-specific
 * attributes
 */
@ApiModel(description = "VolumeSnapshotSpec describes the common attributes of storage devices and allows a Source for provider-specific attributes") public class V1VolumeSnapshotSpec {
    public static final String SERIALIZED_NAME_SOURCE = "source";

    @SerializedName(SERIALIZED_NAME_SOURCE) private V1VolumeSnapshotSpecSource source;

    public static final String SERIALIZED_NAME_VOLUME_SNAPSHOT_CLASS_NAME = "volumeSnapshotClassName";

    @SerializedName(SERIALIZED_NAME_VOLUME_SNAPSHOT_CLASS_NAME) private String volumeSnapshotClassName;

    /**
     * Get source
     *
     * @return source
     */
    @javax.annotation.Nullable @ApiModelProperty(value = "") public V1VolumeSnapshotSpecSource getSource() {
        return source;
    }

    public void setSource(V1VolumeSnapshotSpecSource source) {
        this.source = source;
    }

    public V1VolumeSnapshotSpec source(V1VolumeSnapshotSpecSource source) {
        this.source = source;
        return this;
    }

    public V1VolumeSnapshotSpec volumeSnapshotClassName(String  volumeSnapshotClassName) {
        this.volumeSnapshotClassName = volumeSnapshotClassName;
        return this;
    }

    /**
     * Name of the StorageClass required by the claim. More info:
     * https://kubernetes.io/docs/concepts/storage/persistent-volumes#class-1
     *
     * @return volumeSnapshotClassName
     */
    @javax.annotation.Nullable @ApiModelProperty(value = "Name of the StorageClass required by the claim. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#class-1") public String getVolumeSnapshotClassName() {
        return volumeSnapshotClassName;
    }

    public void setVolumeSnapshotClassName(String volumeSnapshotClassName) {
        this.volumeSnapshotClassName = volumeSnapshotClassName;
    }

    @Override public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        V1VolumeSnapshotSpec V1VolumeSnapshotSpec = (V1VolumeSnapshotSpec) o;
        return Objects.equals(this.source, V1VolumeSnapshotSpec.source) && Objects.equals(this.volumeSnapshotClassName,
                V1VolumeSnapshotSpec.volumeSnapshotClassName);
    }

    @Override public int hashCode() {
        return Objects.hash(source, volumeSnapshotClassName);
    }

    @Override public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class V1VolumeSnapshotSpec {\n");
        sb.append("    source: ").append(toIndentedString(source)).append("\n");
        sb.append("    volumeSnapshotClassName: ").append(toIndentedString(volumeSnapshotClassName)).append("\n");
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
