
# ActivityResultSchema

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** |  |  [optional]
**title** | **String** |  |  [optional]
**attempts** | **Integer** |  |  [optional]
**activityCompletion** | [**ActivityCompletionEnum**](#ActivityCompletionEnum) |  |  [optional]
**activitySuccess** | [**ActivitySuccessEnum**](#ActivitySuccessEnum) |  |  [optional]
**score** | [**ScoreSchema**](ScoreSchema.md) |  |  [optional]
**timeTracked** | **String** |  |  [optional]
**completionAmount** | [**CompletionAmountSchema**](CompletionAmountSchema.md) |  |  [optional]
**suspended** | **Boolean** |  |  [optional]
**children** | [**List&lt;ActivityResultSchema&gt;**](ActivityResultSchema.md) |  |  [optional]
**objectives** | [**List&lt;ObjectiveSchema&gt;**](ObjectiveSchema.md) |  |  [optional]
**staticProperties** | [**StaticPropertiesSchema**](StaticPropertiesSchema.md) |  |  [optional]
**runtime** | [**RuntimeSchema**](RuntimeSchema.md) |  |  [optional]


<a name="ActivityCompletionEnum"></a>
## Enum: ActivityCompletionEnum
Name | Value
---- | -----
UNKNOWN | &quot;UNKNOWN&quot;
COMPLETED | &quot;COMPLETED&quot;
INCOMPLETE | &quot;INCOMPLETE&quot;


<a name="ActivitySuccessEnum"></a>
## Enum: ActivitySuccessEnum
Name | Value
---- | -----
UNKNOWN | &quot;UNKNOWN&quot;
PASSED | &quot;PASSED&quot;
FAILED | &quot;FAILED&quot;



