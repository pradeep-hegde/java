package io.kubernetes.client.openapi.models;

import java.time.OffsetDateTime;
import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.kubernetes.client.custom.Quantity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * V1VolumeSnapshotStatus is the current status of a persistent volume claim.
 */
@ApiModel(description = "V1VolumeSnapshotStatus is the current status of a persistent volume claim.") public class V1VolumeSnapshotStatus {
    public static final String SERIALIZED_BOUND_VOLUME_SNAPSHOT_CONTENT_NAME = "boundVolumeSnapshotContentName";

    @SerializedName(SERIALIZED_BOUND_VOLUME_SNAPSHOT_CONTENT_NAME) private String boundVolumeSnapshotContentName = null;

    public static final String SERIALIZED_NAME_CREATION_TIME = "creationTime";

    @SerializedName(SERIALIZED_NAME_CREATION_TIME)
    private OffsetDateTime creationTime;

    public static final String SERIALIZED_NAME_READY_TO_USE = "readyToUse";

    @SerializedName(SERIALIZED_NAME_READY_TO_USE) private Boolean readyToUse;

    public static final String SERIALIZED_NAME_RESTORE_SIZE = "restoreSize";

    @SerializedName(SERIALIZED_NAME_RESTORE_SIZE) private Quantity restoreSize = null;


    public V1VolumeSnapshotStatus boundVolumeSnapshotContentName(String boundVolumeSnapshotContentName) {

        this.boundVolumeSnapshotContentName = boundVolumeSnapshotContentName;
        return this;
    }

    public V1VolumeSnapshotStatus setBoundVolumeSnapshotContentName(String boundVolumeSnapshotContentName) {
        this.boundVolumeSnapshotContentName = boundVolumeSnapshotContentName;
        return this;
    }

    /**
     * AccessModes contains the actual access modes the volume backing the PVC has. More info:
     * https://kubernetes.io/docs/concepts/storage/persistent-volumes#access-modes-1
     *
     * @return boundVolumeSnapshotContentName
     */
    @javax.annotation.Nullable @ApiModelProperty(value = "AccessModes contains the actual access modes the volume backing the PVC has. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#access-modes-1") public String getBoundVolumeSnapshotContentName() {
        return boundVolumeSnapshotContentName;
    }

    public V1VolumeSnapshotStatus creationTime(OffsetDateTime creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    /**
     * CreationTime is a timestamp representing the server time when this object was created. It is not guaranteed to be
     * set in happens-before order across separate operations. Clients may not set this value. It is represented in
     * RFC3339 form and is in UTC. Populated by the system. Read-only. Null for lists. More info:
     * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     *
     * @return creationTime
     */
    @javax.annotation.Nullable
    @ApiModelProperty(
            value = "CreationTime is a timestamp representing the server time when this object was created. It is not guaranteed to be set in happens-before order across separate operations. Clients may not set this value. It is represented in RFC3339 form and is in UTC.  Populated by the system. Read-only. Null for lists. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata")
    public OffsetDateTime getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(OffsetDateTime creationTime) {
        this.creationTime = creationTime;
    }

    public V1VolumeSnapshotStatus restoreSize(Quantity restoreSize) {
        this.restoreSize = restoreSize;
        return this;
    }

    /**
     * Represents the actual resources of the underlying volume.
     *
     * @return restoreSize
     */
    @javax.annotation.Nullable @ApiModelProperty(value = "Represents the actual resources of the underlying volume.") public Quantity getRestoreSize() {
        return restoreSize;
    }

    public void setRestoreSize(Quantity restoreSize) {
        this.restoreSize = restoreSize;
    }

    public V1VolumeSnapshotStatus readyToUse(Boolean readyToUse) {

        this.readyToUse = readyToUse;
        return this;
    }

    /**
     * Phase represents the current readyToUse of PersistentVolumeClaim.
     *
     * @return readyToUse
     */
    @javax.annotation.Nullable @ApiModelProperty(value = "Phase represents the current readyToUse of VolumeSnapshot.") public Boolean getReadyToUse() {
        return readyToUse;
    }

    public void setReadyToUse(Boolean readyToUse) {
        this.readyToUse = readyToUse;
    }

    @Override public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        V1VolumeSnapshotStatus volumeSnapshotStatus = (V1VolumeSnapshotStatus) o;
        return Objects.equals(this.boundVolumeSnapshotContentName, volumeSnapshotStatus.boundVolumeSnapshotContentName)
                && Objects.equals(this.creationTime, volumeSnapshotStatus.creationTime) && Objects.equals(
                this.readyToUse, volumeSnapshotStatus.readyToUse) && Objects.equals(this.restoreSize,
                volumeSnapshotStatus.restoreSize);
    }

    @Override public int hashCode() {
        return Objects.hash(boundVolumeSnapshotContentName, restoreSize, creationTime, readyToUse);
    }

    @Override public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class V1VolumeSnapshotStatus {\n");
        sb.append("    boundVolumeSnapshotContentName: ").append(toIndentedString(boundVolumeSnapshotContentName))
                .append("\n");
        sb.append("    creationTime: ").append(toIndentedString(creationTime)).append("\n");
        sb.append("    readyToUse: ").append(toIndentedString(readyToUse)).append("\n");
        sb.append("    restoreSize: ").append(toIndentedString(restoreSize)).append("\n");
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
