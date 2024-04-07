package io.kubernetes.client.openapi.models;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Represents a PVC or a VolumeSnapshotContent as source
 */
@ApiModel(description = "Represents a PVC")
public class V1VolumeSnapshotSpecSource {
    public static final String SERIALIZED_NAME_PERSISTENT_VOLUME_CLAIM_NAME = "persistentVolumeClaimName";

    public static final String SERIALIZED_NAME_VOLUME_SNAPSHOT_CONTENT_NAME = "volumeSnapshotContentName";

    @SerializedName(SERIALIZED_NAME_PERSISTENT_VOLUME_CLAIM_NAME)
    private String persistentVolumeClaimName;

    @SerializedName(SERIALIZED_NAME_VOLUME_SNAPSHOT_CONTENT_NAME)
    private String volumeSnapshotContentName;

    public V1VolumeSnapshotSpecSource persistentVolumeClaimName(String persistentVolumeClaimName) {

        this.persistentVolumeClaimName = persistentVolumeClaimName;
        return this;
    }

    @javax.annotation.Nullable
    @ApiModelProperty(value = "Target persistentVolumeClaimName name.")
    public String getPersistentVolumeClaimName() {
        return persistentVolumeClaimName;
    }

    public void setPersistentVolumeClaimName(String persistentVolumeClaimName) {
        this.persistentVolumeClaimName = persistentVolumeClaimName;
    }

    @javax.annotation.Nullable
    @ApiModelProperty(value = "Target volumeSnapshotContentName name.")
    public String getVolumeSnapshotContentName() {
        return volumeSnapshotContentName;
    }

    public void setVolumeSnapshotContentName(String volumeSnapshotContentName) {
        this.volumeSnapshotContentName = volumeSnapshotContentName;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        V1VolumeSnapshotSpecSource v1VolumeSnapshotSpecSource = (V1VolumeSnapshotSpecSource) o;
        return Objects.equals(this.persistentVolumeClaimName, v1VolumeSnapshotSpecSource.persistentVolumeClaimName)
                && Objects.equals(this.volumeSnapshotContentName, v1VolumeSnapshotSpecSource.volumeSnapshotContentName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(persistentVolumeClaimName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class V1VolumeSnapshotSpecSource {\n");
        sb.append("    persistentVolumeClaimName: ").append(toIndentedString(persistentVolumeClaimName)).append("\n");
        sb.append("    volumeSnapshotContentName: ").append(toIndentedString(volumeSnapshotContentName)).append("\n");
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
