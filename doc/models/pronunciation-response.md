
# Pronunciation Response

This custom type contains response for pronunciation endpoint.

## Structure

`PronunciationResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Word` | `String` | Optional | The word that is searched. | String getWord() | setWord(String word) |
| `Pronunciation` | [`PronunciationDetails`](../../doc/models/pronunciation-details.md) | Optional | This model contains pronunciation details of a specific word. | PronunciationDetails getPronunciation() | setPronunciation(PronunciationDetails pronunciation) |

## Example (as JSON)

```json
{
  "word": "wind",
  "pronunciation": {
    "all": "wɪnd",
    "noun": "wɪnd",
    "verb": "waɪnd"
  }
}
```

