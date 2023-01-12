package io.kubernetes.client.openapi.models;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * V1VolumeSnapshotContentSpec describes the common attributes of storage devices and allows a Source for
 * provider-specific attributes
 */
@ApiModel(description = "VolumeSnapshotContentSpec describes the common attributes of storage devices and allows a Source for provider-specific attributes")
public class V1VolumeSnapshotContentSpec {
    public static final String SERIALIZED_NAME_SOURCE = "source";

    @SerializedName(SERIALIZED_NAME_SOURCE)
    private V1VolumeSnapshotContentSpecSource source;

    public static final String SERIALIZED_NAME_DELETION_POLICY = "deletionPolicy";

    @SerializedName(SERIALIZED_NAME_DELETION_POLICY)
    private String deletionPolicy;

    public static final String SERIALIZED_NAME_DRIVER = "driver";

    @SerializedName(SERIALIZED_NAME_DRIVER)
    private String driver;

    public static final String SERIALIZED_VOLUME_SNAPSHOT_REF = "volumeSnapshotRef";

    @SerializedName(SERIALIZED_VOLUME_SNAPSHOT_REF)
    private V1VolumeSnapshotContentSpecVolumeSnapshotRef volumeSnapshotRef;

    /**
     * Get source
     *
     * @return source
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public V1VolumeSnapshotContentSpecSource getSource() {
        return source;
    }

    public void setSource(V1VolumeSnapshotContentSpecSource source) {
        this.source = source;
    }

    public V1VolumeSnapshotContentSpec source(V1VolumeSnapshotContentSpecSource source) {

        this.source = source;
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

    public V1VolumeSnapshotContentSpec deletionPolicyPolicy(String deletionPolicy) {

        this.deletionPolicy = deletionPolicy;
        return this;
    }

    public V1VolumeSnapshotContentSpec driver(String driver) {

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

    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public V1VolumeSnapshotContentSpecVolumeSnapshotRef getVolumeSnapshotRef() {
        return volumeSnapshotRef;
    }

    public void setVolumeSnapshotRef(V1VolumeSnapshotContentSpecVolumeSnapshotRef volumeSnapshotRef) {
        this.volumeSnapshotRef = volumeSnapshotRef;
    }

    public V1VolumeSnapshotContentSpec volumeSnapshotRef(
            V1VolumeSnapshotContentSpecVolumeSnapshotRef volumeSnapshotRef) {

        this.volumeSnapshotRef = volumeSnapshotRef;
        return this;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        V1VolumeSnapshotContentSpec V1VolumeSnapshotContentSpec = (V1VolumeSnapshotContentSpec) o;
        return Objects.equals(this.source, V1VolumeSnapshotContentSpec.source)
                && Objects.equals(this.source, V1VolumeSnapshotContentSpec.source)
                && Objects.equals(this.driver, V1VolumeSnapshotContentSpec.driver)
                && Objects.equals(this.deletionPolicy, V1VolumeSnapshotContentSpec.deletionPolicy)
                && Objects.equals(this.volumeSnapshotRef, V1VolumeSnapshotContentSpec.volumeSnapshotRef);
    }

    @Override
    public int hashCode() {
        return Objects.hash(source, driver, deletionPolicy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class V1VolumeSnapshotContentSpec {\n");
        sb.append("    driver: ").append(toIndentedString(driver)).append("\n");
        sb.append("    deletionPolicy: ").append(toIndentedString(deletionPolicy)).append("\n");
        sb.append("    source: ").append(toIndentedString(source)).append("\n");
        sb.append("    volumeSnapshotRef: ").append(toIndentedString(volumeSnapshotRef)).append("\n");
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
