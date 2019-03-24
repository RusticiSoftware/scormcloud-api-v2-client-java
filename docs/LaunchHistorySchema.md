
# LaunchHistorySchema

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** |  |  [optional]
**instance** | **Integer** |  |  [optional]
**score** | [**ScoreSchema**](ScoreSchema.md) |  |  [optional]
**completionStatus** | [**CompletionStatusEnum**](#CompletionStatusEnum) |  |  [optional]
**successStatus** | [**SuccessStatusEnum**](#SuccessStatusEnum) |  |  [optional]
**historyLog** | **String** |  |  [optional]
**totalSecondsTracked** | **Double** |  |  [optional]
**launchTime** | [**OffsetDateTime**](OffsetDateTime.md) | The time of the launch in UTC |  [optional]
**exitTime** | [**OffsetDateTime**](OffsetDateTime.md) | The time of the exit in UTC |  [optional]
**lastRuntimeUpdate** | [**OffsetDateTime**](OffsetDateTime.md) | The time of the last runtime update in UTC |  [optional]


<a name="CompletionStatusEnum"></a>
## Enum: CompletionStatusEnum
Name | Value
---- | -----
UNKNOWN | &quot;UNKNOWN&quot;
COMPLETED | &quot;COMPLETED&quot;
INCOMPLETE | &quot;INCOMPLETE&quot;


<a name="SuccessStatusEnum"></a>
## Enum: SuccessStatusEnum
Name | Value
---- | -----
UNKNOWN | &quot;UNKNOWN&quot;
PASSED | &quot;PASSED&quot;
FAILED | &quot;FAILED&quot;



