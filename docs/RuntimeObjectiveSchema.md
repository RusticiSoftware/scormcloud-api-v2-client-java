
# RuntimeObjectiveSchema

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** |  |  [optional]
**scoreScaled** | **String** |  |  [optional]
**scoreMin** | **String** |  |  [optional]
**scoreMax** | **String** |  |  [optional]
**scoreRaw** | **String** |  |  [optional]
**runtimeObjectiveSuccessStatus** | [**RuntimeObjectiveSuccessStatusEnum**](#RuntimeObjectiveSuccessStatusEnum) |  |  [optional]
**runtimeObjectiveCompletionStatus** | [**RuntimeObjectiveCompletionStatusEnum**](#RuntimeObjectiveCompletionStatusEnum) |  |  [optional]
**progressMeasure** | **String** |  |  [optional]
**description** | **String** |  |  [optional]


<a name="RuntimeObjectiveSuccessStatusEnum"></a>
## Enum: RuntimeObjectiveSuccessStatusEnum
Name | Value
---- | -----
UNKNOWN | &quot;UNKNOWN&quot;
PASSED | &quot;PASSED&quot;
FAILED | &quot;FAILED&quot;


<a name="RuntimeObjectiveCompletionStatusEnum"></a>
## Enum: RuntimeObjectiveCompletionStatusEnum
Name | Value
---- | -----
UNKNOWN | &quot;UNKNOWN&quot;
COMPLETED | &quot;COMPLETED&quot;
INCOMPLETE | &quot;INCOMPLETE&quot;
NOT_ATTEMPTED | &quot;NOT_ATTEMPTED&quot;
BROWSED | &quot;BROWSED&quot;



