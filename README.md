# scormcloud-api-v2-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>com.rusticisoftware.cloud.v2.client</groupId>
    <artifactId>scormcloud-api-v2-client</artifactId>
    <version>1.0.0-beta</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.rusticisoftware.cloud.v2.client:scormcloud-api-v2-client:1.0.0-beta"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/scormcloud-api-v2-client-1.0.0-beta.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import com.rusticisoftware.cloud.v2.client.*;
import com.rusticisoftware.cloud.v2.client.auth.*;
import com.rusticisoftware.cloud.v2.client.model.*;
import com.rusticisoftware.cloud.v2.client.api.ApplicationManagementApi;

import java.io.File;
import java.util.*;

public class ApplicationManagementApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP basic authorization: APP_NORMAL
        HttpBasicAuth APP_NORMAL = (HttpBasicAuth) defaultClient.getAuthentication("APP_NORMAL");
        APP_NORMAL.setUsername("YOUR USERNAME");
        APP_NORMAL.setPassword("YOUR PASSWORD");

        // Configure OAuth2 access token for authorization: OAUTH
        OAuth OAUTH = (OAuth) defaultClient.getAuthentication("OAUTH");
        OAUTH.setAccessToken("YOUR ACCESS TOKEN");

        ApplicationManagementApi apiInstance = new ApplicationManagementApi();
        String applicationName = "applicationName_example"; // String | 
        try {
            ApplicationSchema result = apiInstance.createApplication(applicationName);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ApplicationManagementApi#createApplication");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://cloud.scorm.com/api/v2/*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ApplicationManagementApi* | [**createApplication**](docs/ApplicationManagementApi.md#createApplication) | **PUT** /appManagement/applications/{applicationName} | Create a new application
*ApplicationManagementApi* | [**createCredential**](docs/ApplicationManagementApi.md#createCredential) | **POST** /appManagement/{childAppId}/credentials | Create credential
*ApplicationManagementApi* | [**createToken**](docs/ApplicationManagementApi.md#createToken) | **POST** /appManagement/token | Create token
*ApplicationManagementApi* | [**deleteApplication**](docs/ApplicationManagementApi.md#deleteApplication) | **DELETE** /appManagement/applications/{childAppId} | Delete an application.  If the application contains content, it must first be manually removed before calling this method, else an error will be thrown.
*ApplicationManagementApi* | [**deleteCredential**](docs/ApplicationManagementApi.md#deleteCredential) | **DELETE** /appManagement/{childAppId}/credentials/{credentialId} | Removes &#x60;credentialId&#x60; credentials
*ApplicationManagementApi* | [**getApplicationConfiguration**](docs/ApplicationManagementApi.md#getApplicationConfiguration) | **GET** /appManagement/configuration | Returns all configuration settings for this level
*ApplicationManagementApi* | [**getApplicationList**](docs/ApplicationManagementApi.md#getApplicationList) | **GET** /appManagement/applications | Get list of all applications in this realm.
*ApplicationManagementApi* | [**getCredentials**](docs/ApplicationManagementApi.md#getCredentials) | **GET** /appManagement/{childAppId}/credentials | List of credentials
*ApplicationManagementApi* | [**setApplicationConfiguration**](docs/ApplicationManagementApi.md#setApplicationConfiguration) | **POST** /appManagement/configuration | Set configuration settings for this level.
*ApplicationManagementApi* | [**updateCredential**](docs/ApplicationManagementApi.md#updateCredential) | **PUT** /appManagement/{childAppId}/credentials/{credentialId} | Update the name or status associated with &#x60;credentialId&#x60;
*AuthenticationApi* | [**getAppToken**](docs/AuthenticationApi.md#getAppToken) | **POST** /oauth/authenticate/application/token | Authenticates for a oauth token
*CourseApi* | [**buildCoursePreviewLaunchLink**](docs/CourseApi.md#buildCoursePreviewLaunchLink) | **POST** /courses/{courseId}/preview | Returns the launch link to use to preview this course
*CourseApi* | [**buildCoursePreviewLaunchLinkWithVersion**](docs/CourseApi.md#buildCoursePreviewLaunchLinkWithVersion) | **POST** /courses/{courseId}/versions/{versionId}/preview | Returns the link to use to preview this course
*CourseApi* | [**createFetchAndImportCourseJob**](docs/CourseApi.md#createFetchAndImportCourseJob) | **POST** /courses/importJobs | Start a job to fetch and import a course.
*CourseApi* | [**createUploadAndImportCourseJob**](docs/CourseApi.md#createUploadAndImportCourseJob) | **POST** /courses/importJobs/upload | Upload a course and start an import job for it.
*CourseApi* | [**deleteCourse**](docs/CourseApi.md#deleteCourse) | **DELETE** /courses/{courseId} | Delete &#x60;courseId&#x60;
*CourseApi* | [**deleteCourseConfigurationSetting**](docs/CourseApi.md#deleteCourseConfigurationSetting) | **DELETE** /courses/{courseId}/configuration/{settingId} | Clears the &#x60;settingId&#x60; value for this course
*CourseApi* | [**deleteCourseTags**](docs/CourseApi.md#deleteCourseTags) | **DELETE** /courses/{courseId}/tags | Delete tags for this course
*CourseApi* | [**deleteCourseVersion**](docs/CourseApi.md#deleteCourseVersion) | **DELETE** /courses/{courseId}/versions/{versionId} | Delete version &#x60;versionId&#x60; of &#x60;courseId&#x60;
*CourseApi* | [**deleteCourseVersionConfigurationSetting**](docs/CourseApi.md#deleteCourseVersionConfigurationSetting) | **DELETE** /courses/{courseId}/versions/{versionId}/configuration/{settingId} | Clears the &#x60;settingId&#x60; value for this course and version.
*CourseApi* | [**getCourse**](docs/CourseApi.md#getCourse) | **GET** /courses/{courseId} | Get information about &#x60;courseId&#x60;
*CourseApi* | [**getCourseConfiguration**](docs/CourseApi.md#getCourseConfiguration) | **GET** /courses/{courseId}/configuration | Returns all configuration settings for this course
*CourseApi* | [**getCourseStatements**](docs/CourseApi.md#getCourseStatements) | **GET** /courses/{courseId}/xAPIStatements | Get xAPI statements for &#x60;courseId&#x60;
*CourseApi* | [**getCourseTags**](docs/CourseApi.md#getCourseTags) | **GET** /courses/{courseId}/tags | Get the tags for this course
*CourseApi* | [**getCourseVersionConfiguration**](docs/CourseApi.md#getCourseVersionConfiguration) | **GET** /courses/{courseId}/versions/{versionId}/configuration | Returns all configuration settings for this course and version.
*CourseApi* | [**getCourseVersionInfo**](docs/CourseApi.md#getCourseVersionInfo) | **GET** /courses/{courseId}/versions/{versionId} | Get version &#x60;versionId&#x60; of &#x60;courseId&#x60;
*CourseApi* | [**getCourseVersionStatements**](docs/CourseApi.md#getCourseVersionStatements) | **GET** /courses/{courseId}/versions/{versionId}/xAPIStatements | Get xAPI statements for version &#x60;versionId&#x60; of &#x60;courseId&#x60;
*CourseApi* | [**getCourseVersions**](docs/CourseApi.md#getCourseVersions) | **GET** /courses/{courseId}/versions | Get all versions of &#x60;courseId&#x60;
*CourseApi* | [**getCourses**](docs/CourseApi.md#getCourses) | **GET** /courses | Get all courses for &#x60;appId&#x60;
*CourseApi* | [**getImportJobStatus**](docs/CourseApi.md#getImportJobStatus) | **GET** /courses/importJobs/{importJobId} | Check the status of an import job.
*CourseApi* | [**putCourseTags**](docs/CourseApi.md#putCourseTags) | **PUT** /courses/{courseId}/tags | Set the tags for this course
*CourseApi* | [**putCourseTagsBatch**](docs/CourseApi.md#putCourseTagsBatch) | **PUT** /courses/tags | Sets all of the provided tags on all of the provided courses
*CourseApi* | [**setCourseConfiguration**](docs/CourseApi.md#setCourseConfiguration) | **POST** /courses/{courseId}/configuration | Set configuration settings for this course.
*CourseApi* | [**setCourseTitle**](docs/CourseApi.md#setCourseTitle) | **PUT** /courses/{courseId}/title | Sets the course title for &#x60;courseId&#x60;
*CourseApi* | [**setCourseVersionConfiguration**](docs/CourseApi.md#setCourseVersionConfiguration) | **POST** /courses/{courseId}/versions/{versionId}/configuration | Set configuration settings for this course and version.
*PingApi* | [**pingAppId**](docs/PingApi.md#pingAppId) | **GET** /ping | Get back a message indicating that the API is working.
*RegistrationApi* | [**createNewRegistrationInstance**](docs/RegistrationApi.md#createNewRegistrationInstance) | **POST** /registrations/{registrationId}/instances | Create a new instance for this registration specified by the registration ID
*RegistrationApi* | [**createRegistration**](docs/RegistrationApi.md#createRegistration) | **POST** /registrations | Create a registration.
*RegistrationApi* | [**deleteRegistration**](docs/RegistrationApi.md#deleteRegistration) | **DELETE** /registrations/{registrationId} | Delete &#x60;registrationId&#x60;
*RegistrationApi* | [**deleteRegistrationConfigurationSetting**](docs/RegistrationApi.md#deleteRegistrationConfigurationSetting) | **DELETE** /registrations/{registrationId}/configuration/{settingId} | Clears the &#x60;settingId&#x60; value for this registration
*RegistrationApi* | [**deleteRegistrationInstanceConfigurationSetting**](docs/RegistrationApi.md#deleteRegistrationInstanceConfigurationSetting) | **DELETE** /registrations/{registrationId}/instances/{instanceId}/configuration/{settingId} | Clears the &#x60;settingId&#x60; value for this registration instance
*RegistrationApi* | [**deleteRegistrationProgress**](docs/RegistrationApi.md#deleteRegistrationProgress) | **DELETE** /registrations/{registrationId}/progress | Delete registration progress (clear registration)
*RegistrationApi* | [**deleteRegistrationTags**](docs/RegistrationApi.md#deleteRegistrationTags) | **DELETE** /registrations/{registrationId}/tags | Delete tags for this registration
*RegistrationApi* | [**deleteRegistrationsGlobalData**](docs/RegistrationApi.md#deleteRegistrationsGlobalData) | **DELETE** /registrations/{registrationId}/globalData | Delete global data associated with &#x60;registrationId&#x60;
*RegistrationApi* | [**getRegistrationConfiguration**](docs/RegistrationApi.md#getRegistrationConfiguration) | **GET** /registrations/{registrationId}/configuration | Returns all configuration settings for this registration
*RegistrationApi* | [**getRegistrationInstanceConfiguration**](docs/RegistrationApi.md#getRegistrationInstanceConfiguration) | **GET** /registrations/{registrationId}/instances/{instanceId}/configuration | Returns all configuration settings for this registration instance
*RegistrationApi* | [**getRegistrationInstanceLaunchHistory**](docs/RegistrationApi.md#getRegistrationInstanceLaunchHistory) | **GET** /registrations/{registrationId}/instances/{instanceId}/launchHistory | Returns history of this registration&#39;s launches
*RegistrationApi* | [**getRegistrationInstanceProgress**](docs/RegistrationApi.md#getRegistrationInstanceProgress) | **GET** /registrations/{registrationId}/instances/{instanceId} | Get registration progress for instance &#x60;instanceId&#x60; of &#x60;registrationId&#x60;
*RegistrationApi* | [**getRegistrationInstanceStatements**](docs/RegistrationApi.md#getRegistrationInstanceStatements) | **GET** /registrations/{registrationId}/instances/{instanceId}/xAPIStatements | Get xAPI statements for instance &#x60;instanceId&#x60; of &#x60;registrationId&#x60;
*RegistrationApi* | [**getRegistrationInstances**](docs/RegistrationApi.md#getRegistrationInstances) | **GET** /registrations/{registrationId}/instances | Get all the instances of this the registration specified by the registration ID
*RegistrationApi* | [**getRegistrationLaunchHistory**](docs/RegistrationApi.md#getRegistrationLaunchHistory) | **GET** /registrations/{registrationId}/launchHistory | Returns history of this registration&#39;s launches
*RegistrationApi* | [**getRegistrationLaunchLink**](docs/RegistrationApi.md#getRegistrationLaunchLink) | **POST** /registrations/{registrationId}/launchLink | Returns the link to use to launch this registration
*RegistrationApi* | [**getRegistrationProgress**](docs/RegistrationApi.md#getRegistrationProgress) | **GET** /registrations/{registrationId} | Get registration progress for &#x60;registrationId&#x60;
*RegistrationApi* | [**getRegistrationStatements**](docs/RegistrationApi.md#getRegistrationStatements) | **GET** /registrations/{registrationId}/xAPIStatements | Get xAPI statements for &#x60;registrationId&#x60;
*RegistrationApi* | [**getRegistrationTags**](docs/RegistrationApi.md#getRegistrationTags) | **GET** /registrations/{registrationId}/tags | Get the tags for this registration
*RegistrationApi* | [**getRegistrations**](docs/RegistrationApi.md#getRegistrations) | **GET** /registrations | Gets a list of registrations including a summary of the status of each registration.
*RegistrationApi* | [**putRegistrationTags**](docs/RegistrationApi.md#putRegistrationTags) | **PUT** /registrations/{registrationId}/tags | Set the tags for this registration
*RegistrationApi* | [**putRegistrationTagsBatch**](docs/RegistrationApi.md#putRegistrationTagsBatch) | **PUT** /registrations/tags | Sets all of the provided tags on all of the provided registrations
*RegistrationApi* | [**registrationExists**](docs/RegistrationApi.md#registrationExists) | **HEAD** /registrations/{registrationId} | Does this registration exist?
*RegistrationApi* | [**setRegistrationConfiguration**](docs/RegistrationApi.md#setRegistrationConfiguration) | **POST** /registrations/{registrationId}/configuration | Set configuration settings for this registration.
*RegistrationApi* | [**setRegistrationInstanceConfiguration**](docs/RegistrationApi.md#setRegistrationInstanceConfiguration) | **POST** /registrations/{registrationId}/instances/{instanceId}/configuration | Set configuration settings for this registration instance.


## Documentation for Models

 - [ActivityResultSchema](docs/ActivityResultSchema.md)
 - [ApplicationListSchema](docs/ApplicationListSchema.md)
 - [ApplicationSchema](docs/ApplicationSchema.md)
 - [ApplicationToken](docs/ApplicationToken.md)
 - [CommentSchema](docs/CommentSchema.md)
 - [CompletionAmountSchema](docs/CompletionAmountSchema.md)
 - [CourseActivitySchema](docs/CourseActivitySchema.md)
 - [CourseListNonPagedSchema](docs/CourseListNonPagedSchema.md)
 - [CourseListSchema](docs/CourseListSchema.md)
 - [CourseReferenceSchema](docs/CourseReferenceSchema.md)
 - [CourseSchema](docs/CourseSchema.md)
 - [CourseTagsBatchSchema](docs/CourseTagsBatchSchema.md)
 - [CreateRegistrationSchema](docs/CreateRegistrationSchema.md)
 - [CredentialCreatedSchema](docs/CredentialCreatedSchema.md)
 - [CredentialListSchema](docs/CredentialListSchema.md)
 - [CredentialRequestSchema](docs/CredentialRequestSchema.md)
 - [CredentialSchema](docs/CredentialSchema.md)
 - [ImportFetchRequestSchema](docs/ImportFetchRequestSchema.md)
 - [ImportJobResultSchema](docs/ImportJobResultSchema.md)
 - [ImportResultSchema](docs/ImportResultSchema.md)
 - [IntegerResultSchema](docs/IntegerResultSchema.md)
 - [ItemValuePairSchema](docs/ItemValuePairSchema.md)
 - [LaunchHistoryListSchema](docs/LaunchHistoryListSchema.md)
 - [LaunchHistorySchema](docs/LaunchHistorySchema.md)
 - [LaunchLinkRequestSchema](docs/LaunchLinkRequestSchema.md)
 - [LaunchLinkSchema](docs/LaunchLinkSchema.md)
 - [LearnerPreferenceSchema](docs/LearnerPreferenceSchema.md)
 - [LearnerSchema](docs/LearnerSchema.md)
 - [LinkSchema](docs/LinkSchema.md)
 - [MessageSchema](docs/MessageSchema.md)
 - [MetadataSchema](docs/MetadataSchema.md)
 - [ObjectiveSchema](docs/ObjectiveSchema.md)
 - [PermissionsSchema](docs/PermissionsSchema.md)
 - [PingSchema](docs/PingSchema.md)
 - [PostBackSchema](docs/PostBackSchema.md)
 - [RegistrationCompletion](docs/RegistrationCompletion.md)
 - [RegistrationListSchema](docs/RegistrationListSchema.md)
 - [RegistrationSchema](docs/RegistrationSchema.md)
 - [RegistrationSuccess](docs/RegistrationSuccess.md)
 - [RegistrationTagsBatchSchema](docs/RegistrationTagsBatchSchema.md)
 - [ResponseError](docs/ResponseError.md)
 - [RuntimeInteractionSchema](docs/RuntimeInteractionSchema.md)
 - [RuntimeObjectiveSchema](docs/RuntimeObjectiveSchema.md)
 - [RuntimeSchema](docs/RuntimeSchema.md)
 - [ScoreSchema](docs/ScoreSchema.md)
 - [SettingItem](docs/SettingItem.md)
 - [SettingListSchema](docs/SettingListSchema.md)
 - [SettingMetadata](docs/SettingMetadata.md)
 - [SettingMetadataValidValues](docs/SettingMetadataValidValues.md)
 - [SettingsIndividualSchema](docs/SettingsIndividualSchema.md)
 - [SettingsPostSchema](docs/SettingsPostSchema.md)
 - [SharedDataEntrySchema](docs/SharedDataEntrySchema.md)
 - [StaticPropertiesSchema](docs/StaticPropertiesSchema.md)
 - [StringResultSchema](docs/StringResultSchema.md)
 - [TagListSchema](docs/TagListSchema.md)
 - [TagPostSchema](docs/TagPostSchema.md)
 - [TitleSchema](docs/TitleSchema.md)
 - [TokenRequestSchema](docs/TokenRequestSchema.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### APP_MANAGEMENT

- **Type**: HTTP basic authentication

### APP_NORMAL

- **Type**: HTTP basic authentication

### LAUNCH_TOKEN

- **Type**: API key
- **API key parameter name**: launchToken
- **Location**: URL query string

### URL_TOKEN

- **Type**: API key
- **API key parameter name**: authtoken
- **Location**: URL query string

### OAUTH

- **Type**: OAuth
- **Flow**: application
- **Authorizatoin URL**: 
- **Scopes**: 
  - read: Grants read access
  - write: Grants write access
  - delete: Grants deletion access
  - admin: Grants read, write, and account management access
  - read:course: Grants read access to course methods
  - write:course: Grants write access to course methods
  - delete:course: Grants deletion access to course methods
  - read:dispatch: Grants read access to dispatch methods
  - write:dispatch: Grants write access to dispatch methods
  - delete:dispatch: Grants deletion access to dispatch methods
  - read:invitation: Grants read access to invitation methods
  - write:invitation: Grants write access to invitation methods
  - delete:invitation: Grants deletion access to invitation methods
  - read:ping: Grants read access to the ping method
  - read:registration: Grants read access to registration methods
  - write:registration: Grants write access to registration methods
  - delete:registration: Grants deletion access to registration methods
  - read:reporting: Grants read access to reporting methods
  - read:xapicredential: Grants read access to xapi credential methods
  - write:xapicredential: Grants write access to xapi credential methods
  - delete:xapicredential: Grants deletion access to xapi credential methods
  - read:xapipipe: Grants read access to xapi pipe methods
  - write:xapipipe: Grants write access to xapi pipe methods
  - delete:xapipipe: Grants deletion access to xapi pipe methods
  - read:appmgmt: Grants read access to app management methods
  - write:appmgmt: Grants write access to app management methods
  - delete:appmgmt: Grants deletion access to app management methods


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issue.

## Author



