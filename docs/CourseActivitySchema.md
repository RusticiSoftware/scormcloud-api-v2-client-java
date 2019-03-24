
# CourseActivitySchema

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**externalIdentifier** | **String** | An arbitrary identifier that the external LMS system can associate with this LearningObject to track it as it isreused across courses  |  [optional]
**itemIdentifier** | **String** | The string which identifies this activity in the context of its course |  [optional]
**resourceIdentifier** | **String** | The string which identifies this activity&#39;s resource in a course&#39;s manifest |  [optional]
**activityType** | [**ActivityTypeEnum**](#ActivityTypeEnum) | The type of activity this is |  [optional]
**href** | **String** | The web path used to launch this activity |  [optional]
**scaledPassingScore** | **String** | The score required of a learner to pass this activity |  [optional]
**title** | **String** | The title of the activity |  [optional]
**children** | [**List&lt;CourseActivitySchema&gt;**](CourseActivitySchema.md) |  |  [optional]


<a name="ActivityTypeEnum"></a>
## Enum: ActivityTypeEnum
Name | Value
---- | -----
UNKNOWN | &quot;UNKNOWN&quot;
AGGREGATION | &quot;AGGREGATION&quot;
SCO | &quot;SCO&quot;
ASSET | &quot;ASSET&quot;
OBJECTIVE | &quot;OBJECTIVE&quot;



