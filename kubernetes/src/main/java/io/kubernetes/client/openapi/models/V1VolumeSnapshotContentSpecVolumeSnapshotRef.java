package io.kubernetes.client.openapi.models;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Represents a VolumeSnapshot reference
 */
@ApiModel(description = "Represents a VolumeSnapshot reference")
public class V1VolumeSnapshotContentSpecVolumeSnapshotRef {
    public static final String SERIALIZED_NAME = "name";

    @SerializedName(SERIALIZED_NAME)
    private String name;

    public static final String SERIALIZED_NAMESPACE = "namespace";

    @SerializedName(SERIALIZED_NAMESPACE)
    private String namespace;


    public V1VolumeSnapshotContentSpecVolumeSnapshotRef snapshotHandle(String name) {

        this.name = name;
        return this;
    }

    @javax.annotation.Nullable
    @ApiModelProperty(value = "Target name name. Must not contain or start with '..'.  If '.' is supplied, the volume name will be the git repository.  Otherwise, if specified, the volume will contain the git repository in the subsnapshotHandle with the given name.")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @javax.annotation.Nullable
    @ApiModelProperty(value = "Target name name. Must not contain or start with '..'.  If '.' is supplied, the volume name will be the git repository.  Otherwise, if specified, the volume will contain the git repository in the subsnapshotHandle with the given name.")
    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        V1VolumeSnapshotContentSpecVolumeSnapshotRef V1VolumeSnapshotContentSpecSource =
                (V1VolumeSnapshotContentSpecVolumeSnapshotRef) o;
        return Objects.equals(this.name, V1VolumeSnapshotContentSpecSource.name)
                && Objects.equals(this.namespace, V1VolumeSnapshotContentSpecSource.namespace);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, namespace);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class V1VolumeSnapshotContentSpecSource {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
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
