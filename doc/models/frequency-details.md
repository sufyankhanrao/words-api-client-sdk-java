
# Frequency Details

This model contains frequency details of a specific word.

## Structure

`FrequencyDetails`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Zipf` | `Double` | Optional | Explains the zipf score. | Double getZipf() | setZipf(Double zipf) |
| `PerMillion` | `Double` | Optional | Explains the perMillion score. | Double getPerMillion() | setPerMillion(Double perMillion) |
| `Diversity` | `Double` | Optional | Explains the diversity score. | Double getDiversity() | setDiversity(Double diversity) |

## Example (as JSON)

```json
{
  "zipf": 4.81,
  "perMillion": 64.22,
  "diversity": 0.2
}
```

