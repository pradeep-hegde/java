package io.kubernetes.client.openapi.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/** VolumeSnapshotClassList is a collection of snapshot classes. */
@ApiModel(description = "VolumeSnapshotClassList is a collection of VolumeSnapshotClasses.")
public class V1VolumeSnapshotClassList implements io.kubernetes.client.common.KubernetesListObject {
    public static final String SERIALIZED_NAME_API_VERSION = "apiVersion";

    @SerializedName(SERIALIZED_NAME_API_VERSION)
    private String apiVersion;

    public static final String SERIALIZED_NAME_ITEMS = "items";

    @SerializedName(SERIALIZED_NAME_ITEMS)
    private List<V1VolumeSnapshotClass> items = new ArrayList<>();

    public static final String SERIALIZED_NAME_KIND = "kind";

    @SerializedName(SERIALIZED_NAME_KIND)
    private String kind;

    public static final String SERIALIZED_NAME_METADATA = "metadata";

    @SerializedName(SERIALIZED_NAME_METADATA)
    private V1ListMeta metadata;

    public V1VolumeSnapshotClassList apiVersion(String apiVersion) {

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

    public V1VolumeSnapshotClassList items(List<V1VolumeSnapshotClass> items) {

        this.items = items;
        return this;
    }

    public V1VolumeSnapshotClassList addItemsItem(V1VolumeSnapshotClass itemsItem) {
        this.items.add(itemsItem);
        return this;
    }

    /**
     * Items is the list of V1VolumeSnapshotClasses
     *
     * @return items
     */
    @ApiModelProperty(required = true, value = "Items is the list of VolumeSnapshotClass")
    public List<V1VolumeSnapshotClass> getItems() {
        return items;
    }

    public void setItems(List<V1VolumeSnapshotClass> items) {
        this.items = items;
    }

    public V1VolumeSnapshotClassList kind(String kind) {

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

    public V1VolumeSnapshotClassList metadata(V1ListMeta metadata) {

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
    public V1ListMeta getMetadata() {
        return metadata;
    }

    public void setMetadata(V1ListMeta metadata) {
        this.metadata = metadata;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        V1VolumeSnapshotClassList volumeSnapshotClassList = (V1VolumeSnapshotClassList) o;
        return Objects.equals(this.apiVersion, volumeSnapshotClassList.apiVersion)
                && Objects.equals(this.items, volumeSnapshotClassList.items)
                && Objects.equals(this.kind, volumeSnapshotClassList.kind)
                && Objects.equals(this.metadata, volumeSnapshotClassList.metadata);
    }

    @Override
    public int hashCode() {
        return Objects.hash(apiVersion, items, kind, metadata);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class V1VolumeSnapshotClassList {\n");
        sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
        sb.append("    items: ").append(toIndentedString(items)).append("\n");
        sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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