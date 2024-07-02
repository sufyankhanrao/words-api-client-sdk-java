/*
 * WordsAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.rapidapi.p.wordsapiv1;

import com.rapidapi.p.wordsapiv1.authentication.CustomHeaderAuthenticationManager;
import com.rapidapi.p.wordsapiv1.authentication.CustomHeaderAuthenticationModel;
import com.rapidapi.p.wordsapiv1.controllers.APIsController;
import com.rapidapi.p.wordsapiv1.http.client.HttpCallback;
import com.rapidapi.p.wordsapiv1.http.client.HttpClientConfiguration;
import com.rapidapi.p.wordsapiv1.http.client.ReadonlyHttpClientConfiguration;
import io.apimatic.core.GlobalConfiguration;
import io.apimatic.coreinterfaces.authentication.Authentication;
import io.apimatic.coreinterfaces.compatibility.CompatibilityFactory;
import io.apimatic.coreinterfaces.http.HttpClient;
import io.apimatic.okhttpclient.adapter.OkClient;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * Gateway class for the library.
 * This class acts as a factory for Controllers.
 * It holds the state of the SDK.
 */
public final class WordsAPIClient implements Configuration {

    /**
     * Private store for controllers.
     */
    private APIsController aPIs;

    private static final CompatibilityFactory compatibilityFactory = new CompatibilityFactoryImpl();

    private static String userAgent = "APIMATIC 3.0";

    /**
     * Current API environment.
     */
    private final Environment environment;

    /**
     * The HTTP Client instance to use for making HTTP requests.
     */
    private final HttpClient httpClient;

    /**
     * Http Client Configuration instance.
     */
    private final ReadonlyHttpClientConfiguration httpClientConfig;

    /**
     * CustomHeaderAuthenticationManager.
     */
    private CustomHeaderAuthenticationManager customHeaderAuthenticationManager;

    /**
     * The instance of CustomHeaderAuthenticationModel.
     */
    private CustomHeaderAuthenticationModel customHeaderAuthenticationModel;

    /**
     * Map of authentication Managers.
     */
    private Map<String, Authentication> authentications = new HashMap<String, Authentication>();

    /**
     * Callback to be called before and after the HTTP call for an endpoint is made.
     */
    private final HttpCallback httpCallback;

    private WordsAPIClient(Environment environment, HttpClient httpClient,
            ReadonlyHttpClientConfiguration httpClientConfig,
            CustomHeaderAuthenticationModel customHeaderAuthenticationModel,
            HttpCallback httpCallback) {
        this.environment = environment;
        this.httpClient = httpClient;
        this.httpClientConfig = httpClientConfig;
        this.httpCallback = httpCallback;

        this.customHeaderAuthenticationModel = customHeaderAuthenticationModel;

        this.customHeaderAuthenticationManager = new CustomHeaderAuthenticationManager(
                customHeaderAuthenticationModel);
        this.authentications.put("RapidAPI-Key", customHeaderAuthenticationManager);

        GlobalConfiguration globalConfig = new GlobalConfiguration.Builder()
                .httpClient(httpClient).baseUri(server -> getBaseUri(server))
                .compatibilityFactory(compatibilityFactory)
                .authentication(this.authentications)
                .callback(httpCallback)
                .userAgent(userAgent)
                .build();
        aPIs = new APIsController(globalConfig);
    }

    /**
     * Shutdown the underlying HttpClient instance.
     */
    public static void shutdown() {
        OkClient.shutdown();
    }

    /**
     * Get the instance of APIsController.
     * @return aPIs
     */
    public APIsController getAPIsController() {
        return aPIs;
    }

    /**
     * Current API environment.
     * @return environment
     */
    public Environment getEnvironment() {
        return environment;
    }

    /**
     * The HTTP Client instance to use for making HTTP requests.
     * @return httpClient
     */
    private HttpClient getHttpClient() {
        return httpClient;
    }

    /**
     * Http Client Configuration instance.
     * @return httpClientConfig
     */
    public ReadonlyHttpClientConfiguration getHttpClientConfig() {
        return httpClientConfig;
    }

    /**
     * The credentials to use with CustomHeaderAuthentication.
     * @return customHeaderAuthenticationCredentials
     */
    public CustomHeaderAuthenticationCredentials getCustomHeaderAuthenticationCredentials() {
        return customHeaderAuthenticationManager;
    }

    /**
     * The auth credential model for CustomHeaderAuthentication.
     * @return the instance of CustomHeaderAuthenticationModel
     */
    public CustomHeaderAuthenticationModel getCustomHeaderAuthenticationModel() {
        return customHeaderAuthenticationModel;
    }
    /**
     * The timeout to use for making HTTP requests.
     * @deprecated This method will be removed in a future version. Use
     *             {@link #getHttpClientConfig()} instead.
     *
     * @return timeout
     */
    @Deprecated
    public long timeout() {
        return httpClientConfig.getTimeout();
    }

    /**
     * Get base URI by current environment.
     * @param server Server for which to get the base URI
     * @return Processed base URI
     */
    public String getBaseUri(Server server) {
        return environmentMapper(environment, server);
    }

    /**
     * Get base URI by current environment.
     * @return Processed base URI
     */
    public String getBaseUri() {
        return getBaseUri(Server.ENUM_DEFAULT);
    }


    /**
     * Get base URI by current environment.
     * 
     * @param server string for which to get the base URI
     * @return Processed base URI
     */
    public String getBaseUri(String server) {
        return getBaseUri(Server.fromString(server));
    }


    /**
     * Base URLs by environment and server aliases.
     * @param environment Environment for which to get the base URI
     * @param server Server for which to get the base URI
     * @return base URL
     */
    private static String environmentMapper(Environment environment, Server server) {
        if (environment.equals(Environment.PRODUCTION)) {
            if (server.equals(Server.ENUM_DEFAULT)) {
                return "https://wordsapiv1.p.rapidapi.com";
            }
        }
        return "https://wordsapiv1.p.rapidapi.com";
    }

    /**
     * Converts this WordsAPIClient into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "WordsAPIClient [" + "environment=" + environment + ", httpClientConfig="
                + httpClientConfig + ", authentications=" + authentications + "]";
    }

    /**
     * Builds a new {@link WordsAPIClient.Builder} object.
     * Creates the instance with the state of the current client.
     * @return a new {@link WordsAPIClient.Builder} object
     */
    public Builder newBuilder() {
        Builder builder = new Builder();
        builder.environment = getEnvironment();
        builder.httpClient = getHttpClient();
        builder.customHeaderAuthenticationCredentials(getCustomHeaderAuthenticationModel()
                .toBuilder().build());
        builder.httpCallback = httpCallback;
        builder.httpClientConfig(() -> ((HttpClientConfiguration) httpClientConfig).newBuilder());
        return builder;
    }

    /**
     * Class to build instances of {@link WordsAPIClient}.
     */
    public static class Builder {

        private Environment environment = Environment.PRODUCTION;
        private HttpClient httpClient;
        private CustomHeaderAuthenticationModel customHeaderAuthenticationModel =
                new CustomHeaderAuthenticationModel.Builder("").build();
        private HttpCallback httpCallback = null;
        private HttpClientConfiguration.Builder httpClientConfigBuilder =
                new HttpClientConfiguration.Builder();


        /**
         * Credentials setter for CustomHeaderAuthentication.
         * @param xRapidAPIKey String value for xRapidAPIKey.
         * @deprecated This builder method is deprecated.
         * Use {@link #customHeaderAuthenticationCredentials(CustomHeaderAuthenticationModel) customHeaderAuthenticationCredentials} instead.
         * @return The current instance of builder.
         */
        @Deprecated
        public Builder customHeaderAuthenticationCredentials(String xRapidAPIKey) {
            customHeaderAuthenticationModel = customHeaderAuthenticationModel.toBuilder()
                .xRapidAPIKey(xRapidAPIKey)
                .build();
            return this;
        }

        /**
         * Credentials setter for CustomHeaderAuthenticationCredentials.
         * @param customHeaderAuthenticationModel The instance of CustomHeaderAuthenticationModel.
         * @return The current instance of builder.
         */
        public Builder customHeaderAuthenticationCredentials(
                CustomHeaderAuthenticationModel customHeaderAuthenticationModel) {
            this.customHeaderAuthenticationModel = customHeaderAuthenticationModel;
            return this;
        }

        /**
         * Current API environment.
         * @param environment The environment for client.
         * @return Builder
         */
        public Builder environment(Environment environment) {
            this.environment = environment;
            return this;
        }

        /**
         * The timeout to use for making HTTP requests.
         * @deprecated This method will be removed in a future version. Use
         *             {@link #httpClientConfig(Consumer) httpClientConfig} instead.
         * @param timeout must be greater then 0.
         * @return Builder
         */
        @Deprecated
        public Builder timeout(long timeout) {
            this.httpClientConfigBuilder.timeout(timeout);
            return this;
        }

        /**
         * HttpCallback.
         * @param httpCallback Callback to be called before and after the HTTP call.
         * @return Builder
         */
        public Builder httpCallback(HttpCallback httpCallback) {
            this.httpCallback = httpCallback;
            return this;
        }

        /**
         * Setter for the Builder of httpClientConfiguration, takes in an operation to be performed
         * on the builder instance of HTTP client configuration.
         * 
         * @param action Consumer for the builder of httpClientConfiguration.
         * @return Builder
         */
        public Builder httpClientConfig(Consumer<HttpClientConfiguration.Builder> action) {
            action.accept(httpClientConfigBuilder);
            return this;
        }

        /**
         * Private Setter for the Builder of httpClientConfiguration, takes in an operation to be performed
         * on the builder instance of HTTP client configuration.
         * 
         * @param supplier Supplier for the builder of httpClientConfiguration.
         * @return Builder
         */
        private Builder httpClientConfig(Supplier<HttpClientConfiguration.Builder> supplier) {
            httpClientConfigBuilder = supplier.get();
            return this;
        }

        /**
         * Builds a new WordsAPIClient object using the set fields.
         * @return WordsAPIClient
         */
        public WordsAPIClient build() {
            HttpClientConfiguration httpClientConfig = httpClientConfigBuilder.build();
            httpClient = new OkClient(httpClientConfig.getConfiguration(), compatibilityFactory);

            return new WordsAPIClient(environment, httpClient, httpClientConfig,
                    customHeaderAuthenticationModel, httpCallback);
        }
    }
}