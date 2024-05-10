# ProductAvailabilityApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**confirmPostcode**](ProductAvailabilityApi.md#confirmPostcode) | **GET** /product-availability/postcode/{postcode} | Check a postcode

<a name="confirmPostcode"></a>
# **confirmPostcode**
> Postcode confirmPostcode(postcode)

Check a postcode

Check which products are available at the given postcode.

### Example
```java
// Import classes:
//import Com.Vorboss.ApiClient;
//import Com.Vorboss.ApiException;
//import Com.Vorboss.Configuration;
//import Com.Vorboss.auth.*;
//import Com.Vorboss.ProductAvailability.ProductAvailabilityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ProductAvailabilityApi apiInstance = new ProductAvailabilityApi();
String postcode = "postcode_example"; // String | UK Postcode to check availability for.
try {
    Postcode result = apiInstance.confirmPostcode(postcode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductAvailabilityApi#confirmPostcode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **postcode** | **String**| UK Postcode to check availability for. |

### Return type

[**Postcode**](Postcode.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

