# product-availability

Vorboss Product Availability API
- API version: 0.2.0
  - Build date: 2024-05-10T11:59:02.518631+01:00[Europe/London]

This API is provided by Vorboss to allow customers to check which products are available at a given postcode.


*Automatically generated by the [Swagger Codegen](https://github.com/swagger-api/swagger-codegen)*


## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.vorboss</groupId>
  <artifactId>product-availability</artifactId>
  <version>0.2.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.vorboss:product-availability:0.2.0"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/product-availability-0.2.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java
import Com.Vorboss.*;
import Com.Vorboss.auth.*;
import Com.Vorboss.ProductAvailability.*;
import Com.Vorboss.ProductAvailability.ProductAvailabilityApi;

import java.io.File;
import java.util.*;

public class ProductAvailabilityApiExample {

    public static void main(String[] args) {
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
    }
}
```

## Documentation for API Endpoints

All URIs are relative to */*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ProductAvailabilityApi* | [**confirmPostcode**](docs/ProductAvailabilityApi.md#confirmPostcode) | **GET** /product-availability/postcode/{postcode} | Check a postcode

## Documentation for Models

 - [Postcode](docs/Postcode.md)
 - [PostcodeAvailableProducts](docs/PostcodeAvailableProducts.md)

## Documentation for Authorization

Authentication schemes defined for the API:
### bearerAuth



## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

