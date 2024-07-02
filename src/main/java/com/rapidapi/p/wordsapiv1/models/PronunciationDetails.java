/*
 * WordsAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.rapidapi.p.wordsapiv1.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.apimatic.core.types.OptionalNullable;

/**
 * This is a model class for PronunciationDetails type.
 */
public class PronunciationDetails {
    private OptionalNullable<String> all;
    private OptionalNullable<String> noun;
    private OptionalNullable<String> verb;

    /**
     * Default constructor.
     */
    public PronunciationDetails() {
    }

    /**
     * Initialization constructor.
     * @param  all  String value for all.
     * @param  noun  String value for noun.
     * @param  verb  String value for verb.
     */
    public PronunciationDetails(
            String all,
            String noun,
            String verb) {
        this.all = OptionalNullable.of(all);
        this.noun = OptionalNullable.of(noun);
        this.verb = OptionalNullable.of(verb);
    }

    /**
     * Initialization constructor.
     * @param  all  String value for all.
     * @param  noun  String value for noun.
     * @param  verb  String value for verb.
     */

    protected PronunciationDetails(OptionalNullable<String> all, OptionalNullable<String> noun,
            OptionalNullable<String> verb) {
        this.all = all;
        this.noun = noun;
        this.verb = verb;
    }

    /**
     * Internal Getter for All.
     * The pronunciation of the word.
     * @return Returns the Internal String
     */
    @JsonGetter("all")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetAll() {
        return this.all;
    }

    /**
     * Getter for All.
     * The pronunciation of the word.
     * @return Returns the String
     */
    public String getAll() {
        return OptionalNullable.getFrom(all);
    }

    /**
     * Setter for All.
     * The pronunciation of the word.
     * @param all Value for String
     */
    @JsonSetter("all")
    public void setAll(String all) {
        this.all = OptionalNullable.of(all);
    }

    /**
     * UnSetter for All.
     * The pronunciation of the word.
     */
    public void unsetAll() {
        all = null;
    }

    /**
     * Internal Getter for Noun.
     * The noun pronunciation of the word.
     * @return Returns the Internal String
     */
    @JsonGetter("noun")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetNoun() {
        return this.noun;
    }

    /**
     * Getter for Noun.
     * The noun pronunciation of the word.
     * @return Returns the String
     */
    public String getNoun() {
        return OptionalNullable.getFrom(noun);
    }

    /**
     * Setter for Noun.
     * The noun pronunciation of the word.
     * @param noun Value for String
     */
    @JsonSetter("noun")
    public void setNoun(String noun) {
        this.noun = OptionalNullable.of(noun);
    }

    /**
     * UnSetter for Noun.
     * The noun pronunciation of the word.
     */
    public void unsetNoun() {
        noun = null;
    }

    /**
     * Internal Getter for Verb.
     * The verb pronunciation of the word.
     * @return Returns the Internal String
     */
    @JsonGetter("verb")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetVerb() {
        return this.verb;
    }

    /**
     * Getter for Verb.
     * The verb pronunciation of the word.
     * @return Returns the String
     */
    public String getVerb() {
        return OptionalNullable.getFrom(verb);
    }

    /**
     * Setter for Verb.
     * The verb pronunciation of the word.
     * @param verb Value for String
     */
    @JsonSetter("verb")
    public void setVerb(String verb) {
        this.verb = OptionalNullable.of(verb);
    }

    /**
     * UnSetter for Verb.
     * The verb pronunciation of the word.
     */
    public void unsetVerb() {
        verb = null;
    }

    /**
     * Converts this PronunciationDetails into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "PronunciationDetails [" + "all=" + all + ", noun=" + noun + ", verb=" + verb + "]";
    }

    /**
     * Builds a new {@link PronunciationDetails.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link PronunciationDetails.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.all = internalGetAll();
        builder.noun = internalGetNoun();
        builder.verb = internalGetVerb();
        return builder;
    }

    /**
     * Class to build instances of {@link PronunciationDetails}.
     */
    public static class Builder {
        private OptionalNullable<String> all;
        private OptionalNullable<String> noun;
        private OptionalNullable<String> verb;



        /**
         * Setter for all.
         * @param  all  String value for all.
         * @return Builder
         */
        public Builder all(String all) {
            this.all = OptionalNullable.of(all);
            return this;
        }

        /**
         * UnSetter for all.
         * @return Builder
         */
        public Builder unsetAll() {
            all = null;
            return this;
        }

        /**
         * Setter for noun.
         * @param  noun  String value for noun.
         * @return Builder
         */
        public Builder noun(String noun) {
            this.noun = OptionalNullable.of(noun);
            return this;
        }

        /**
         * UnSetter for noun.
         * @return Builder
         */
        public Builder unsetNoun() {
            noun = null;
            return this;
        }

        /**
         * Setter for verb.
         * @param  verb  String value for verb.
         * @return Builder
         */
        public Builder verb(String verb) {
            this.verb = OptionalNullable.of(verb);
            return this;
        }

        /**
         * UnSetter for verb.
         * @return Builder
         */
        public Builder unsetVerb() {
            verb = null;
            return this;
        }

        /**
         * Builds a new {@link PronunciationDetails} object using the set fields.
         * @return {@link PronunciationDetails}
         */
        public PronunciationDetails build() {
            return new PronunciationDetails(all, noun, verb);
        }
    }
}
