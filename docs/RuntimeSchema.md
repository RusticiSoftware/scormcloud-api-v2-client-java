
# RuntimeSchema

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**completionStatus** | **String** |  |  [optional]
**credit** | **String** |  |  [optional]
**entry** | **String** |  |  [optional]
**exit** | **String** |  |  [optional]
**learnerPreference** | [**LearnerPreferenceSchema**](LearnerPreferenceSchema.md) |  |  [optional]
**location** | **String** |  |  [optional]
**mode** | **String** |  |  [optional]
**progressMeasure** | **String** |  |  [optional]
**scoreScaled** | **String** |  |  [optional]
**scoreRaw** | **String** |  |  [optional]
**scoreMin** | **String** |  |  [optional]
**scoreMax** | **String** |  |  [optional]
**totalTime** | **String** |  |  [optional]
**timeTracked** | **String** |  |  [optional]
**runtimeSuccessStatus** | [**RuntimeSuccessStatusEnum**](#RuntimeSuccessStatusEnum) |  |  [optional]
**suspendData** | **String** |  |  [optional]
**learnerComments** | [**List&lt;CommentSchema&gt;**](CommentSchema.md) |  |  [optional]
**lmsComments** | [**List&lt;CommentSchema&gt;**](CommentSchema.md) |  |  [optional]
**runtimeInteractions** | [**List&lt;RuntimeInteractionSchema&gt;**](RuntimeInteractionSchema.md) |  |  [optional]
**runtimeObjectives** | [**List&lt;RuntimeObjectiveSchema&gt;**](RuntimeObjectiveSchema.md) |  |  [optional]


<a name="RuntimeSuccessStatusEnum"></a>
## Enum: RuntimeSuccessStatusEnum
Name | Value
---- | -----
UNKNOWN | &quot;UNKNOWN&quot;
PASSED | &quot;PASSED&quot;
FAILED | &quot;FAILED&quot;



