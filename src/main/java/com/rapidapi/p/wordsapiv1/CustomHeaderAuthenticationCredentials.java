/*
 * WordsAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.rapidapi.p.wordsapiv1;

/**
 * Interface for defining the behavior of CustomHeader Authentication.
 */
public interface CustomHeaderAuthenticationCredentials {

    /**
     * String value for xRapidAPIKey.
     * @return xRapidAPIKey
     */
    String getXRapidAPIKey();

    /**
     * Checks if provided credentials matched with existing ones.
     * @param xRapidAPIKey String value for credentials.
     * @return true if credentials matched.
     */
    boolean equals(String xRapidAPIKey);
}