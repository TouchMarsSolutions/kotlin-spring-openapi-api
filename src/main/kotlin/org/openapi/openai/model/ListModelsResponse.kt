package org.openapi.openai.model

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.v3.oas.annotations.media.Schema
import jakarta.annotation.Generated
import jakarta.validation.Valid
import jakarta.validation.constraints.NotNull
import java.util.*

/**
 * ListModelsResponse
 */
@Generated(
    value = ["org.openapitools.codegen.languages.SpringCodegen"],
    date = "2023-02-15T20:47:29.471771-08:00[America/Vancouver]"
)
class ListModelsResponse {
    /**
     * Get _object
     * @return _object
     */
    @get:Schema(
        name = "object",
        requiredMode = Schema.RequiredMode.REQUIRED
    )
    @JsonProperty("object")
    var `object`: String? = null

    @JsonProperty("data")
    private var data: @Valid MutableList<Model>? = ArrayList()
    fun _object(_object: String?): ListModelsResponse {
        `object` = _object
        return this
    }

    fun data(data: MutableList<Model>?): ListModelsResponse {
        this.data = data
        return this
    }

    fun addDataItem(dataItem: Model): ListModelsResponse {
        data!!.add(dataItem)
        return this
    }

    /**
     * Get data
     * @return data
     */
    @Schema(name = "data", requiredMode = Schema.RequiredMode.REQUIRED)
    fun getData(): @NotNull @Valid MutableList<Model>? {
        return data
    }

    fun setData(data: MutableList<Model>?) {
        this.data = data
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other == null || javaClass != other.javaClass) {
            return false
        }
        val listModelsResponse = other as ListModelsResponse
        return `object` == listModelsResponse.`object` && data == listModelsResponse.data
    }

    override fun hashCode(): Int {
        return Objects.hash(`object`, data)
    }

    override fun toString(): String {
        val sb = StringBuilder()
        sb.append("class ListModelsResponse {\n")
        sb.append("    _object: ").append(toIndentedString(`object`)).append("\n")
        sb.append("    data: ").append(toIndentedString(data)).append("\n")
        sb.append("}")
        return sb.toString()
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private fun toIndentedString(o: Any?): String {
        return o?.toString()?.replace("\n", "\n    ") ?: "null"
    }
}