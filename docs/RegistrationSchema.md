
# RegistrationSchema

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** |  |  [optional]
**instance** | **Integer** |  |  [optional]
**xapiRegistrationId** | **String** | xAPI registration id associated with this registration |  [optional]
**dispatchId** | **String** | Dispatch ID for this registration, if applicable |  [optional]
**updated** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**registrationCompletion** | [**RegistrationCompletion**](RegistrationCompletion.md) |  |  [optional]
**registrationCompletionAmount** | **Double** |  |  [optional]
**registrationSuccess** | [**RegistrationSuccess**](RegistrationSuccess.md) |  |  [optional]
**score** | [**ScoreSchema**](ScoreSchema.md) |  |  [optional]
**totalSecondsTracked** | **Double** |  |  [optional]
**firstAccessDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**lastAccessDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**completedDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**createdDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**course** | [**CourseReferenceSchema**](CourseReferenceSchema.md) |  |  [optional]
**learner** | [**LearnerSchema**](LearnerSchema.md) |  |  [optional]
**globalObjectives** | [**List&lt;ObjectiveSchema&gt;**](ObjectiveSchema.md) |  |  [optional]
**sharedData** | [**List&lt;SharedDataEntrySchema&gt;**](SharedDataEntrySchema.md) |  |  [optional]
**suspendedActivityId** | **String** |  |  [optional]
**activityDetails** | [**ActivityResultSchema**](ActivityResultSchema.md) |  |  [optional]



