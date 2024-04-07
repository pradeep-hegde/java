package io.kubernetes.client.openapi.models;

import java.time.OffsetDateTime;
import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.kubernetes.client.custom.Quantity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/** V1VolumeSnapshotContentStatus is the current status of a persistent volume claim. */
@ApiModel(description = "V1VolumeSnapshotContentStatus is the current status of a persistent volume claim.") public class V1VolumeSnapshotContentStatus {

    public static final String SERIALIZED_NAME_READY_TO_USE = "readyToUse";

    @SerializedName(SERIALIZED_NAME_READY_TO_USE) private Boolean readyToUse;

    public static final String SERIALIZED_NAME_RESTORE_SIZE = "restoreSize";

    @SerializedName(SERIALIZED_NAME_RESTORE_SIZE) private Quantity restoreSize = null;

    public static final String SERIALIZED_SNAPSHOT_HANDLE = "snapshotHandle";

    @SerializedName(SERIALIZED_SNAPSHOT_HANDLE) private String snapshotHandle = null;


    public V1VolumeSnapshotContentStatus snapshotHandle(String snapshotHandle) {

        this.snapshotHandle = snapshotHandle;
        return this;
    }

    public V1VolumeSnapshotContentStatus setSnapshotHandle(String snapshotHandle) {
        this.snapshotHandle = snapshotHandle;
        return this;
    }

    /**
     * AccessModes contains the actual access modes the volume backing the PVC has. More info:
     * https://kubernetes.io/docs/concepts/storage/persistent-volumes#access-modes-1
     *
     * @return snapshotHandle
     */
    @javax.annotation.Nullable @ApiModelProperty(value = "AccessModes contains the actual access modes the volume backing the PVC has. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#access-modes-1") public String getSnapshotHandle() {
        return snapshotHandle;
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

    public V1VolumeSnapshotContentStatus readyToUse(Boolean readyToUse) {

        this.readyToUse = readyToUse;
        return this;
    }

    /**
     * Phase represents the current readyToUse of VolumeSnapshot.
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
        V1VolumeSnapshotContentStatus volumeSnapshotContentStatus = (V1VolumeSnapshotContentStatus) o;
        return Objects.equals(this.snapshotHandle, volumeSnapshotContentStatus.snapshotHandle)
                && Objects.equals(this.readyToUse, volumeSnapshotContentStatus.readyToUse)
                && Objects.equals(this.restoreSize, volumeSnapshotContentStatus.restoreSize);
    }

    @Override public int hashCode() {
        return Objects.hash(snapshotHandle, restoreSize,
                readyToUse);
    }

    @Override public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class V1VolumeSnapshotContentStatus {\n");
        sb.append("    snapshotHandle: ").append(toIndentedString(snapshotHandle)).append("\n");
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
