
# Definitions Response

This custom type contains response for definitions endpoint.

## Structure

`DefinitionsResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Word` | `String` | Optional | The word that is searched. | String getWord() | setWord(String word) |
| `Definition` | `List<String>` | Optional | The definitions of the searched word. | List<String> getDefinition() | setDefinition(List<String> definition) |

## Example (as JSON)

```json
{
  "word": "lovely",
  "definition": [
    "lovable especially in a childlike or naive way",
    "a very pretty girl who works as a photographer's model",
    "appealing to the emotions as well as the eye"
  ]
}
```

