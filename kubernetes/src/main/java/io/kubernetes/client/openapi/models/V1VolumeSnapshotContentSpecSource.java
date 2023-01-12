package io.kubernetes.client.openapi.models;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Represents a PVC
 */
@ApiModel(description = "Represents a PVC")
public class V1VolumeSnapshotContentSpecSource {
    public static final String SERIALIZED_PERSISTENT_VOLUME_CLAIM_NAME = "snapshotHandle";

    @SerializedName(SERIALIZED_PERSISTENT_VOLUME_CLAIM_NAME)
    private String snapshotHandle;

    public V1VolumeSnapshotContentSpecSource snapshotHandle(String snapshotHandle) {

        this.snapshotHandle = snapshotHandle;
        return this;
    }

    /**
     * Target snapshotHandle name. Must not contain or start with &#39;..&#39;. If &#39;.&#39; is supplied, the volume
     * snapshotHandle will be the git repository. Otherwise, if specified, the volume will contain the git repository in
     * the subsnapshotHandle with the given name.
     *
     * @return snapshotHandle
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Target snapshotHandle name. Must not contain or start with '..'.  If '.' is supplied, the volume snapshotHandle will be the git repository.  Otherwise, if specified, the volume will contain the git repository in the subsnapshotHandle with the given name.")
    public String getsnapshotHandle() {
        return snapshotHandle;
    }

    public void setsnapshotHandle(String snapshotHandle) {
        this.snapshotHandle = snapshotHandle;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        V1VolumeSnapshotContentSpecSource V1VolumeSnapshotContentSpecSource = (V1VolumeSnapshotContentSpecSource) o;
        return Objects.equals(this.snapshotHandle, V1VolumeSnapshotContentSpecSource.snapshotHandle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(snapshotHandle);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class V1VolumeSnapshotContentSpecSource {\n");
        sb.append("    snapshotHandle: ").append(toIndentedString(snapshotHandle)).append("\n");
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
