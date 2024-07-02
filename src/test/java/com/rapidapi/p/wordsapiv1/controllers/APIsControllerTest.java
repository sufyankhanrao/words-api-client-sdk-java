/*
 * WordsAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.rapidapi.p.wordsapiv1.controllers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import com.rapidapi.p.wordsapiv1.WordsAPIClient;
import com.rapidapi.p.wordsapiv1.exceptions.ApiException;
import com.rapidapi.p.wordsapiv1.models.DefinitionsResponse;
import com.rapidapi.p.wordsapiv1.models.ExamplesResponse;
import com.rapidapi.p.wordsapiv1.models.FrequencyResponse;
import com.rapidapi.p.wordsapiv1.models.PronunciationResponse;
import com.rapidapi.p.wordsapiv1.models.SynonymsResponse;
import io.apimatic.core.utilities.TestHelper;
import java.util.LinkedHashMap;
import java.util.Map;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class APIsControllerTest extends BaseControllerTest {

    /**
     * Client instance.
     */
    private static WordsAPIClient client;
    
    /**
     * Controller instance (for all tests).
     */
    private static APIsController controller;

    /**
     * Setup test class.
     */
    @BeforeClass
    public static void setUpClass() {
        client = createConfiguration();
        controller = client.getAPIsController();
    }

    /**
     * Tear down test class.
     */
    @AfterClass
    public static void tearDownClass() {
        controller = null;
    }

    /**
     * Get synonyms of a word.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestSynonyms() throws Exception {
        // Parameters for the API call
        String word = 
                "lovely";

        // Set callback and perform API call
        SynonymsResponse result = null;
        try {
            result = controller.synonyms(word);
        } catch (ApiException e) {
            // Empty block
        }

        // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test headers
        Map<String, String> headers = new LinkedHashMap<String, String>();
        headers.put("Content-Type", "application/json");
        
        assertTrue("Headers do not match", TestHelper.areHeadersProperSubsetOf(
                headers, httpResponse.getResponse().getHeaders().asSimpleMap(), true));

        // Test whether the captured response is as we expected
        assertNotNull("Result does not exist", 
                result);
        assertTrue("Response body does not match in keys", 
                TestHelper.isJsonObjectProperSubsetOf(
                "{\"word\":\"lovely\",\"synonyms\":[\"adorable\",\"endearing\",\"cover girl\",\"pin"
                + "-up\"]}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

    /**
     * Retrieve information about a word. Results can include definitions, part of speech, synonyms,
     * related words, syllables, and pronunciation. This method is useful to see which relationships
     * are attached to which definition and part of speech of a word.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestWord() throws Exception {
        // Parameters for the API call
        String word = 
                "Testing";

        // Set callback and perform API call
        try {
            controller.word(word);
        } catch (ApiException e) {
            // Empty block
        }

        // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test headers
        Map<String, String> headers = new LinkedHashMap<String, String>();
        headers.put("Content-Type", "application/json");
        
        assertTrue("Headers do not match", TestHelper.areHeadersProperSubsetOf(
                headers, httpResponse.getResponse().getHeaders().asSimpleMap(), true));

    }

    /**
     * Get examples of how the word is used.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestExamples() throws Exception {
        // Parameters for the API call
        String word = 
                "wind";

        // Set callback and perform API call
        ExamplesResponse result = null;
        try {
            result = controller.examples(word);
        } catch (ApiException e) {
            // Empty block
        }

        // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test headers
        Map<String, String> headers = new LinkedHashMap<String, String>();
        headers.put("Content-Type", "application/json");
        
        assertTrue("Headers do not match", TestHelper.areHeadersProperSubsetOf(
                headers, httpResponse.getResponse().getHeaders().asSimpleMap(), true));

        // Test whether the captured response is as we expected
        assertNotNull("Result does not exist", 
                result);
        assertTrue("Response body does not match in keys", 
                TestHelper.isJsonObjectProperSubsetOf(
                "{\"word\":\"testing\",\"examples\":[\"there are laboratories for commercial testin"
                + "g\",\"it involved testing thousands of children for smallpox\",\"they agreed to "
                + "end the testing of atomic weapons\"]}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

    /**
     * Expands upon the frequency score returned by the main /words/{word} endpoint. Returns zipf, a
     * score indicating how common the word is in the English language, with a range of 1 to 7; per
     * Million, the number of times the word is likely to appear in a corpus of one million English
     * words; and diversity, a 0-1 scale the shows the likelihood of the word appearing in an
     * English document that is part of a corpus.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestFrequency() throws Exception {
        // Parameters for the API call
        String word = 
                "lovely";

        // Set callback and perform API call
        FrequencyResponse result = null;
        try {
            result = controller.frequency(word);
        } catch (ApiException e) {
            // Empty block
        }

        // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test headers
        Map<String, String> headers = new LinkedHashMap<String, String>();
        headers.put("Content-Type", "application/json");
        
        assertTrue("Headers do not match", TestHelper.areHeadersProperSubsetOf(
                headers, httpResponse.getResponse().getHeaders().asSimpleMap(), true));

        // Test whether the captured response is as we expected
        assertNotNull("Result does not exist", 
                result);
        assertTrue("Response body does not match in keys", 
                TestHelper.isJsonObjectProperSubsetOf(
                "{\"word\":\"wind\",\"frequency\":{\"zipf\":4.81,\"perMillion\":64.22,\"diversity"
                + "\":0.2}}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

    /**
     * Get definitions of a word, including the part of speech.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestDefinitions() throws Exception {
        // Parameters for the API call
        String word = 
                "lovely";

        // Set callback and perform API call
        DefinitionsResponse result = null;
        try {
            result = controller.definitions(word);
        } catch (ApiException e) {
            // Empty block
        }

        // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test headers
        Map<String, String> headers = new LinkedHashMap<String, String>();
        headers.put("Content-Type", "application/json");
        
        assertTrue("Headers do not match", TestHelper.areHeadersProperSubsetOf(
                headers, httpResponse.getResponse().getHeaders().asSimpleMap(), true));

        // Test whether the captured response is as we expected
        assertNotNull("Result does not exist", 
                result);
        assertTrue("Response body does not match in keys", 
                TestHelper.isJsonObjectProperSubsetOf(
                "{\"word\":\"lovely\",\"definition\":[\"lovable especially in a childlike or naive "
                + "way\",\"a very pretty girl who works as a photographer's model\",\"appealing to "
                + "the emotions as well as the eye\"]}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

    /**
     * How to pronounce a word, according to the International Phonetic Alphabet. May include
     * multiple results if the word is pronounced differently depending on its part of speech.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestPronunciation() throws Exception {
        // Parameters for the API call
        String word = 
                "wind";

        // Set callback and perform API call
        PronunciationResponse result = null;
        try {
            result = controller.pronunciation(word);
        } catch (ApiException e) {
            // Empty block
        }

        // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test headers
        Map<String, String> headers = new LinkedHashMap<String, String>();
        headers.put("Content-Type", "application/json");
        
        assertTrue("Headers do not match", TestHelper.areHeadersProperSubsetOf(
                headers, httpResponse.getResponse().getHeaders().asSimpleMap(), true));

        // Test whether the captured response is as we expected
        assertNotNull("Result does not exist", 
                result);
        assertTrue("Response body does not match in keys", 
                TestHelper.isJsonObjectProperSubsetOf(
                "{\"word\":\"wind\",\"pronunciation\":{\"all\":\"wɪnd\",\"noun\":\"wɪnd\",\"verb\":"
                + "\"waɪnd\"}}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

}
