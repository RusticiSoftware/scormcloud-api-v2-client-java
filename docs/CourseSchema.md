
# CourseSchema

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** |  |  [optional]
**title** | **String** |  |  [optional]
**xapiActivityId** | **String** | xAPI activity id associated with this course |  [optional]
**created** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**updated** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**version** | **Integer** |  |  [optional]
**registrationCount** | **Integer** |  |  [optional]
**activityId** | **String** |  |  [optional]
**courseLearningStandard** | [**CourseLearningStandardEnum**](#CourseLearningStandardEnum) |  |  [optional]
**tags** | **List&lt;String&gt;** |  |  [optional]
**dispatched** | **Boolean** |  |  [optional]
**metadata** | [**MetadataSchema**](MetadataSchema.md) |  |  [optional]
**rootActivity** | [**CourseActivitySchema**](CourseActivitySchema.md) |  |  [optional]


<a name="CourseLearningStandardEnum"></a>
## Enum: CourseLearningStandardEnum
Name | Value
---- | -----
UNKNOWN | &quot;UNKNOWN&quot;
SCORM11 | &quot;SCORM11&quot;
SCORM12 | &quot;SCORM12&quot;
SCORM20042NDEDITION | &quot;SCORM20042NDEDITION&quot;
SCORM20043RDEDITION | &quot;SCORM20043RDEDITION&quot;
SCORM20044THEDITION | &quot;SCORM20044THEDITION&quot;
AICC | &quot;AICC&quot;
XAPI | &quot;XAPI&quot;
CMI5 | &quot;CMI5&quot;



