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

package Com.Vorboss;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-05-10T11:59:02.518631+01:00[Europe/London]")
public class Configuration {
    private static ApiClient defaultApiClient = new ApiClient();

    /**
     * Get the default API client, which would be used when creating API
     * instances without providing an API client.
     *
     * @return Default API client
     */
    public static ApiClient getDefaultApiClient() {
        return defaultApiClient;
    }

    /**
     * Set the default API client, which would be used when creating API
     * instances without providing an API client.
     *
     * @param apiClient API client
     */
    public static void setDefaultApiClient(ApiClient apiClient) {
        defaultApiClient = apiClient;
    }
}
