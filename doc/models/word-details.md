
# Word Details

This custom type stores word information.

## Structure

`WordDetails`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Definition` | `String` | Optional | Explains the definition of the word. | String getDefinition() | setDefinition(String definition) |
| `PartOfSpeech` | `String` | Optional | Explains what part of speech the word is. | String getPartOfSpeech() | setPartOfSpeech(String partOfSpeech) |
| `Synonyms` | `List<String>` | Optional | The list of synonyms. | List<String> getSynonyms() | setSynonyms(List<String> synonyms) |
| `TypeOf` | `List<String>` | Optional | List of words that are more general than the searched word. | List<String> getTypeOf() | setTypeOf(List<String> typeOf) |
| `HasTypes` | `List<String>` | Optional | More specific examples of types of searched word. | List<String> getHasTypes() | setHasTypes(List<String> hasTypes) |
| `Derivation` | `List<String>` | Optional | The derivation if any. | List<String> getDerivation() | setDerivation(List<String> derivation) |
| `Examples` | `List<String>` | Optional | The usage examples of word if any. | List<String> getExamples() | setExamples(List<String> examples) |
| `Antonyms` | `List<String>` | Optional | List of antonyms for the searched word. | List<String> getAntonyms() | setAntonyms(List<String> antonyms) |
| `VerbGroup` | `List<String>` | Optional | The verb group of the searched word. | List<String> getVerbGroup() | setVerbGroup(List<String> verbGroup) |
| `HasParts` | `List<String>` | Optional | Words that are parts of the searched word. | List<String> getHasParts() | setHasParts(List<String> hasParts) |
| `HasSubstances` | `List<String>` | Optional | Words that are substances of the searched word. | List<String> getHasSubstances() | setHasSubstances(List<String> hasSubstances) |
| `Entails` | `List<String>` | Optional | Words that are implied by the searched word. Usually used for verbs. | List<String> getEntails() | setEntails(List<String> entails) |

## Example (as JSON)

```json
{
  "definition": "coil the spring of (some mechanical device) by turning a stem",
  "partOfSpeech": "verb",
  "synonyms": [
    "wind up"
  ],
  "entails": [
    "turn"
  ],
  "typeOf": [
    "fasten",
    "tighten"
  ],
  "hasTypes": [
    "rewind"
  ],
  "derivation": [
    "winder"
  ],
  "examples": [
    "wind your watch"
  ]
}
```

