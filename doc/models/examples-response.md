
# Examples Response

This custom type contains response for examples endpoint.

## Structure

`ExamplesResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Word` | `String` | Optional | The word that is searched. | String getWord() | setWord(String word) |
| `Examples` | `List<String>` | Optional | The usage examples of the searched word. | List<String> getExamples() | setExamples(List<String> examples) |

## Example (as JSON)

```json
{
  "word": "testing",
  "examples": [
    "there are laboratories for commercial testing",
    "it involved testing thousands of children for smallpox",
    "they agreed to end the testing of atomic weapons"
  ]
}
```

