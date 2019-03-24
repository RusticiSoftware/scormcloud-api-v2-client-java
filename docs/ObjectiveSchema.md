
# ObjectiveSchema

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** |  |  [optional]
**primary** | **Boolean** |  |  [optional]
**score** | [**ScoreSchema**](ScoreSchema.md) |  |  [optional]
**scoreMax** | **Double** |  |  [optional]
**scoreMin** | **Double** |  |  [optional]
**scoreRaw** | **Double** |  |  [optional]
**previousScoreScaled** | **Double** |  |  [optional]
**firstScoreScaled** | **Double** |  |  [optional]
**progressMeasure** | **Double** |  |  [optional]
**firstSuccessTimeStamp** | **String** |  |  [optional]
**objectiveCompletion** | [**ObjectiveCompletionEnum**](#ObjectiveCompletionEnum) |  |  [optional]
**objectiveSuccess** | [**ObjectiveSuccessEnum**](#ObjectiveSuccessEnum) |  |  [optional]
**previousObjectiveSuccess** | [**PreviousObjectiveSuccessEnum**](#PreviousObjectiveSuccessEnum) |  |  [optional]


<a name="ObjectiveCompletionEnum"></a>
## Enum: ObjectiveCompletionEnum
Name | Value
---- | -----
UNKNOWN | &quot;UNKNOWN&quot;
COMPLETED | &quot;COMPLETED&quot;
INCOMPLETE | &quot;INCOMPLETE&quot;


<a name="ObjectiveSuccessEnum"></a>
## Enum: ObjectiveSuccessEnum
Name | Value
---- | -----
UNKNOWN | &quot;UNKNOWN&quot;
PASSED | &quot;PASSED&quot;
FAILED | &quot;FAILED&quot;


<a name="PreviousObjectiveSuccessEnum"></a>
## Enum: PreviousObjectiveSuccessEnum
Name | Value
---- | -----
UNKNOWN | &quot;UNKNOWN&quot;
PASSED | &quot;PASSED&quot;
FAILED | &quot;FAILED&quot;



