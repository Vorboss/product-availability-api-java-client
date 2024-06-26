/*
 * Vorboss Product Availability API
 * This API is provided by Vorboss to allow customers to check which products are available at a given postcode.
 *
 * OpenAPI spec version: 0.2.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package Com.Vorboss.ProductAvailability;

import java.util.Objects;
import java.util.Arrays;
import Com.Vorboss.ProductAvailability.PostcodeAvailableProducts;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * Postcode
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-05-10T11:59:02.518631+01:00[Europe/London]")

public class Postcode {
  @SerializedName("id")
  private String id = null;

  @SerializedName("message")
  private String message = null;

  @SerializedName("postcode")
  private String postcode = null;

  @SerializedName("availableProducts")
  private List<PostcodeAvailableProducts> availableProducts = null;

  public Postcode id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(example = "KR3FVJ7P", description = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Postcode message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @Schema(example = "Products are available, please contact Vorboss to place an order.", description = "")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public Postcode postcode(String postcode) {
    this.postcode = postcode;
    return this;
  }

   /**
   * Get postcode
   * @return postcode
  **/
  @Schema(example = "SE1 0AA", description = "")
  public String getPostcode() {
    return postcode;
  }

  public void setPostcode(String postcode) {
    this.postcode = postcode;
  }

  public Postcode availableProducts(List<PostcodeAvailableProducts> availableProducts) {
    this.availableProducts = availableProducts;
    return this;
  }

  public Postcode addAvailableProductsItem(PostcodeAvailableProducts availableProductsItem) {
    if (this.availableProducts == null) {
      this.availableProducts = new ArrayList<PostcodeAvailableProducts>();
    }
    this.availableProducts.add(availableProductsItem);
    return this;
  }

   /**
   * Get availableProducts
   * @return availableProducts
  **/
  @Schema(description = "")
  public List<PostcodeAvailableProducts> getAvailableProducts() {
    return availableProducts;
  }

  public void setAvailableProducts(List<PostcodeAvailableProducts> availableProducts) {
    this.availableProducts = availableProducts;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Postcode postcode = (Postcode) o;
    return Objects.equals(this.id, postcode.id) &&
        Objects.equals(this.message, postcode.message) &&
        Objects.equals(this.postcode, postcode.postcode) &&
        Objects.equals(this.availableProducts, postcode.availableProducts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, message, postcode, availableProducts);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Postcode {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    postcode: ").append(toIndentedString(postcode)).append("\n");
    sb.append("    availableProducts: ").append(toIndentedString(availableProducts)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
