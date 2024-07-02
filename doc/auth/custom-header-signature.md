
# Custom Header Signature



Documentation for accessing and setting credentials for RapidAPI-Key.

## Auth Credentials

| Name | Type | Description | Setter | Getter |
|  --- | --- | --- | --- | --- |
| X-RapidAPI-Key | `String` | This is an API key from RapidAPI. | `xRapidAPIKey` | `getXRapidAPIKey()` |



**Note:** Auth credentials can be set using `customHeaderAuthenticationCredentials` in the client builder and accessed through `getCustomHeaderAuthenticationCredentials` method in the client instance.

## Usage Example

### Client Initialization

You must provide credentials in the client as shown in the following code snippet.

```java
WordsAPIClient client = new WordsAPIClient.Builder()
    .customHeaderAuthenticationCredentials(new CustomHeaderAuthenticationModel.Builder(
            "X-RapidAPI-Key"
        )
        .build())
    .build();
```


