
# RuntimeInteractionSchema

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** |  |  [optional]
**type** | [**TypeEnum**](#TypeEnum) |  |  [optional]
**objectives** | **List&lt;String&gt;** |  |  [optional]
**timestamp** | **String** |  |  [optional]
**timestampUtc** | **String** |  |  [optional]
**correctResponses** | **List&lt;String&gt;** |  |  [optional]
**weighting** | **String** |  |  [optional]
**learnerResponse** | **String** |  |  [optional]
**result** | **String** |  |  [optional]
**latency** | **String** |  |  [optional]
**description** | **String** |  |  [optional]


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
TRUEFALSE | &quot;TrueFalse&quot;
CHOICE | &quot;Choice&quot;
FILLIN | &quot;FillIn&quot;
LONGFILLIN | &quot;LongFillIn&quot;
LIKERT | &quot;Likert&quot;
MATCHING | &quot;Matching&quot;
PERFORMANCE | &quot;Performance&quot;
SEQUENCING | &quot;Sequencing&quot;
NUMERIC | &quot;Numeric&quot;
OTHER | &quot;Other&quot;



