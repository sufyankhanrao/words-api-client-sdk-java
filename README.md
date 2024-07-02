
# Getting Started with Words API

## Introduction

Words API lets you retrieve information about English words, including definitions, synonyms, rhymes, pronunciation, syllables, and frequency of usage. It also can tell you about relationships between words, for instance that “math” has categories like “algebra” and “geometry”, or that a “finger” is part of a “hand”.

## Install the Package

Install the SDK by adding the following dependency in your project's pom.xml file:

```xml
<dependency>
  <groupId>io.github.sufyankhanrao</groupId>
  <artifactId>apimatic-words-api-sdk</artifactId>
  <version>0.0.18</version>
</dependency>
```

You can also view the package at:
https://central.sonatype.com/artifact/io.github.sufyankhanrao/apimatic-words-api-sdk/0.0.18

## Test the SDK

The generated code and the server can be tested using automatically generated test cases.
JUnit is used as the testing framework and test runner.

In Eclipse, for running the tests do the following:

1. Select the project WordsAPILib from the package explorer.
2. Select `Run -> Run as -> JUnit Test` or use `Alt + Shift + X` followed by `T` to run the Tests.

## Initialize the API Client

**_Note:_** Documentation for the client can be found [here.](https://www.github.com/sufyankhanrao/words-api-client-sdk-java/tree/0.0.18/doc/client.md)

The following parameters are configurable for the API Client:

| Parameter | Type | Description |
|  --- | --- | --- |
| `httpClientConfig` | [`Consumer<HttpClientConfiguration.Builder>`](https://www.github.com/sufyankhanrao/words-api-client-sdk-java/tree/0.0.18/doc/http-client-configuration-builder.md) | Set up Http Client Configuration instance. |
| `customHeaderAuthenticationCredentials` | [`CustomHeaderAuthenticationCredentials`](https://www.github.com/sufyankhanrao/words-api-client-sdk-java/tree/0.0.18/doc/$a/https://www.github.com/sufyankhanrao/words-api-client-sdk-java/tree/0.0.18/custom-header-signature.md) | The Credentials Setter for Custom Header Signature |

The API client can be initialized as follows:

```java
WordsAPIClient client = new WordsAPIClient.Builder()
    .httpClientConfig(configBuilder -> configBuilder
            .timeout(0))
    .customHeaderAuthenticationCredentials(new CustomHeaderAuthenticationModel.Builder(
            "X-RapidAPI-Key"
        )
        .build())
    .build();
```

## Authorization

This API uses the following authentication schemes.

* [`RapidAPI-Key (Custom Header Signature)`](https://www.github.com/sufyankhanrao/words-api-client-sdk-java/tree/0.0.18/doc/$a/https://www.github.com/sufyankhanrao/words-api-client-sdk-java/tree/0.0.18/custom-header-signature.md)

## List of APIs

* [AP Is](https://www.github.com/sufyankhanrao/words-api-client-sdk-java/tree/0.0.18/doc/controllers/ap-is.md)

## Classes Documentation

* [Utility Classes](https://www.github.com/sufyankhanrao/words-api-client-sdk-java/tree/0.0.18/doc/utility-classes.md)
* [HttpRequest](https://www.github.com/sufyankhanrao/words-api-client-sdk-java/tree/0.0.18/doc/http-request.md)
* [HttpResponse](https://www.github.com/sufyankhanrao/words-api-client-sdk-java/tree/0.0.18/doc/http-response.md)
* [HttpStringResponse](https://www.github.com/sufyankhanrao/words-api-client-sdk-java/tree/0.0.18/doc/http-string-response.md)
* [HttpContext](https://www.github.com/sufyankhanrao/words-api-client-sdk-java/tree/0.0.18/doc/http-context.md)
* [HttpBodyRequest](https://www.github.com/sufyankhanrao/words-api-client-sdk-java/tree/0.0.18/doc/http-body-request.md)
* [HttpCallback Interface](https://www.github.com/sufyankhanrao/words-api-client-sdk-java/tree/0.0.18/doc/http-callback-interface.md)
* [Headers](https://www.github.com/sufyankhanrao/words-api-client-sdk-java/tree/0.0.18/doc/headers.md)
* [ApiException](https://www.github.com/sufyankhanrao/words-api-client-sdk-java/tree/0.0.18/doc/api-exception.md)
* [Configuration Interface](https://www.github.com/sufyankhanrao/words-api-client-sdk-java/tree/0.0.18/doc/configuration-interface.md)
* [HttpClientConfiguration](https://www.github.com/sufyankhanrao/words-api-client-sdk-java/tree/0.0.18/doc/http-client-configuration.md)
* [HttpClientConfiguration.Builder](https://www.github.com/sufyankhanrao/words-api-client-sdk-java/tree/0.0.18/doc/http-client-configuration-builder.md)

