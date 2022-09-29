# scormcloud-api-v2-client

SCORM Cloud Rest API
- API version: 2.0
    - Build date: 2022-09-26T11:33:06.485-05:00

REST API used for SCORM Cloud integrations.


*Automatically generated by the [Swagger Codegen](https://github.com/swagger-api/swagger-codegen)*

## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven/Gradle

## Installation
### Maven
[scormcloud-api-v2-client](https://mvnrepository.com/artifact/com.rusticisoftware.cloud.v2.client/scormcloud-api-v2-client)

### Local
To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

#### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>com.rusticisoftware.cloud.v2.client</groupId>
    <artifactId>scormcloud-api-v2-client</artifactId>
    <version>2.1.0</version>
    <scope>compile</scope>
</dependency>
```

#### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.rusticisoftware.cloud.v2.client:scormcloud-api-v2-client:2.1.0"
```

#### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/scormcloud-api-v2-client-2.1.0.jar`
* `target/lib/*.jar`

## Tips and Tricks
Working with headers will require calling the `WithHttpInfo` version of the function. This allows for grabbing the header directly from the response object:
```java
// Note: This code is specifically designed to not modify any existing data
DispatchApi dispatchApi = new DispatchApi();
ApiResponse<Void> response = dispatchApi.updateDispatchesWithHttpInfo(new UpdateDispatchSchema(), null, OffsetDateTime.now(), null, null, null, null, null);
System.out.println(response.getHeaders().get("X-Total-Count"));
```

## Changelog:
Check the [changelog](https://cloud.scorm.com/docs/v2/reference/changelog/) for details of what has changed.

## Sample Code
```java
import com.rusticisoftware.cloud.v2.client.ApiClient;
import com.rusticisoftware.cloud.v2.client.ApiException;
import com.rusticisoftware.cloud.v2.client.Configuration;
import com.rusticisoftware.cloud.v2.client.api.ApplicationManagementApi;
import com.rusticisoftware.cloud.v2.client.api.CourseApi;
import com.rusticisoftware.cloud.v2.client.api.RegistrationApi;
import com.rusticisoftware.cloud.v2.client.auth.HttpBasicAuth;
import com.rusticisoftware.cloud.v2.client.auth.OAuth;
import com.rusticisoftware.cloud.v2.client.model.*;

import java.io.File;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ScormCloud_Java_Sample {

    // ScormCloud API credentials
    // Note: These are not the same credentials used to log in to ScormCloud
    final static String APP_ID = "APP_ID";
    final static String SECRET_KEY = "SECRET_KEY";

    // Sample values for data
    final static String COURSE_PATH = "/PATH/TO/COURSE/RunTimeAdvancedCalls_SCORM20043rdEdition.zip";

    final static String COURSE_ID = "JAVA_SAMPLE_COURSE";
    final static String LEARNER_ID = "JAVA_SAMPLE_COURSE_LEARNER";
    final static String REGISTRATION_ID = "JAVA_SAMPLE_COURSE_REGISTRATION";

    // String used for output formatting
    final static String OUTPUT_BORDER = "---------------------------------------------------------\n";

    /**
     * This sample will consist of:
     * 1. Creating a course.
     * 2. Registering a learner for the course.
     * 3. Building a link for the learner to take the course.
     * 4. Getting the learner's progress after having taken the course.
     * 5. Viewing all courses and registrations.
     * 6. Deleting all of the data created via this sample.
     *
     * All input variables used in this sample are defined up above.
     */
    public static void main(String[] args) throws ApiException {
        // Configure HTTP basic authorization: APP_NORMAL
        HttpBasicAuth APP_NORMAL = (HttpBasicAuth) Configuration.getDefaultApiClient().getAuthentication("APP_NORMAL");
        APP_NORMAL.setUsername(APP_ID);
        APP_NORMAL.setPassword(SECRET_KEY);

        ScormCloud_Java_Sample sc = new ScormCloud_Java_Sample();

        try
        {
            // Create a course and a registration
            CourseSchema courseDetails = sc.createCourse(COURSE_ID, COURSE_PATH);
            sc.createRegistration(COURSE_ID, LEARNER_ID, REGISTRATION_ID);

            // Show details of the newly imported course
            System.out.println("Newly Imported Course Details: ");
            System.out.println(courseDetails);



            // Create the registration launch link
            String launchLink = sc.buildLaunchLink(REGISTRATION_ID);

            // Show the launch link
            System.out.println(OUTPUT_BORDER);
            System.out.printf("Launch Link: %s%n", launchLink);
            System.out.println("Navigate to the url above to take the course. Hit enter once complete.");
            try {
                System.in.read();
            } catch (IOException e) {
                e.printStackTrace();
            }



            // Get the results for the registration
            RegistrationSchema registrationProgress = sc.getResultForRegistration(REGISTRATION_ID);

            // Show details of the registration progress
            System.out.println(OUTPUT_BORDER);
            System.out.println("Registration Progress: ");
            System.out.println(registrationProgress);



            // Get information about all the courses in ScormCloud
            List<CourseSchema> courseList = sc.getAllCourses();

            // Show details of the courses
            System.out.println(OUTPUT_BORDER);
            System.out.println("Course List: ");
            for (CourseSchema course: courseList)
            {
                System.out.println(course);
            }



            // Get information about all the registrations in ScormCloud
            List<RegistrationSchema> registrationList = sc.getAllRegistrations();

            // Show details of the registrations
            System.out.println(OUTPUT_BORDER);
            System.out.println("Registration List: ");
            for (RegistrationSchema registration: registrationList)
            {
                System.out.println(registration);
            }
        } catch (ApiException | IllegalArgumentException e) {
            System.out.println(e.toString());
        } finally {
            // Delete all the data created by this sample
            sc.cleanUp(COURSE_ID, REGISTRATION_ID);
        }
    }

    /**
     * Sets the default OAuth token passed with all calls to the API.
     *
     * If a token is created with limited scope (i.e. read:registration),
     * calls that require a different permission set will error. Either a
     * new token needs to be generated with the correct scope, or the
     * default access token can be reset to null. This would cause the
     * request to be made with basic auth credentials (appId/ secret key)
     * instead.
     *
     * Additionally, you could create a new configuration object and set
     * the token on that object instead of the default access token. This
     * configuration would then be passed into the Api object:
     *
     * ApiClient apiClient = new ApiClient();
     * TokenRequestSchema tokenRequest = new TokenRequestSchema()
     *         .permissions(new PermissionsSchema().scopes(Arrays.asList("write:course", "read:course")))
     *         .expiry(OffsetDateTime.now().plusMinutes(2));
     * apiClient.setAccessToken(applicationManagementApi.createToken(tokenRequest).getResult());
     * CourseApi courseApi = new CourseApi(apiClient);
     *
     * Any calls that would use this CourseApi instance would then have the
     * write:course and read:course permissions passed automatically, but
     * other instances would be unaffected and continue to use other means
     * of authorization.
     *
     * @param scopes List of permissions for calls made with the token.
     */
    private void configureOAuth(List<String> scopes) throws ApiException {
        ApplicationManagementApi appManagementApi = new ApplicationManagementApi();

        // Set permissions and expiry time of the token
        OffsetDateTime expiry = OffsetDateTime.now().plusMinutes(2);
        PermissionsSchema permissions = new PermissionsSchema()
                .scopes(scopes);

        // Make the request to get the OAuth token
        TokenRequestSchema tokenRequest = new TokenRequestSchema()
                .expiry(expiry)
                .permissions(permissions);
        StringResultSchema tokenResult = appManagementApi.createToken(tokenRequest);

        // Set the default access token used with further API requests.
        // To remove the token, reset the accessToken of
        // Configuration.getDefaultApiClient().getAuthentication("OAUTH")
        // back to null before the next call.
        OAuth OAUTH = (OAuth) Configuration.getDefaultApiClient().getAuthentication("OAUTH");
        OAUTH.setAccessToken(tokenResult.getResult());
    }

    /**
     * Creates a course by uploading the course from your local machine.
     * Courses are a package of content for a learner to consume.
     *
     * Other methods for importing a course exist. Check the documentation
     * for additional ways of importing a course.
     *
     * @param courseId Id that will be used to identify the course.
     * @param coursePath Path to the course being uploaded.
     * @return Detailed information about the newly uploaded course.
     */
    public CourseSchema createCourse(String courseId, String coursePath) throws ApiException {
        // (Optional) Further authenticate via OAuth token access
        // configureOAuth(Arrays.asList("write:course", "read:course"));

        // This call will use OAuth with the "write:course" scope
        // if configured.  Otherwise the basic auth credentials will be used
        CourseApi courseApi = new CourseApi();
        StringResultSchema jobId = courseApi.createUploadAndImportCourseJob(courseId, null, null, null, null, new File(coursePath));

        // This call will use OAuth with the "read:course" scope
        // if configured.  Otherwise the basic auth credentials will be used
        ImportJobResultSchema jobResult = courseApi.getImportJobStatus(jobId.getResult());
        while (jobResult.getStatus() == ImportJobResultSchema.StatusEnum.RUNNING) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ignored) {
                Thread.currentThread().interrupt();
            }

            jobResult = courseApi.getImportJobStatus(jobId.getResult());
        }

        if (jobResult.getStatus() == ImportJobResultSchema.StatusEnum.ERROR)
            throw new IllegalArgumentException("Course is not properly formatted: " + jobResult.getMessage());

        return jobResult.getImportResult().getCourse();
    }

    /**
     * Creates a registration allowing the learner to consume the course
     * content. A registration is the link between a learner and a single
     * course.
     *
     * @param courseId Id of the course to register the learner for.
     * @param learnerId Id that will be used to identify the learner.
     * @param registrationId Id that will be used to identify the registration.
     */
    public void createRegistration(String courseId, String learnerId, String registrationId) throws ApiException {
        // (Optional) Further authenticate via OAuth token access
        // configureOAuth(Collections.singletonList("write:registration"));

        RegistrationApi registrationApi = new RegistrationApi();
        LearnerSchema learner = new LearnerSchema()
                .id(learnerId);
        CreateRegistrationSchema registration = new CreateRegistrationSchema()
                .courseId(courseId)
                .learner(learner)
                .registrationId(registrationId);
        registrationApi.createRegistration(registration, null);
    }

    /**
     * Builds a url allowing the learner to access the course.
     *
     * This sample will build the launch link and print it out. It will then
     * pause and wait for user input, allowing you to navigate to the course
     * to generate sample learner progress. Once this step has been reached,
     * hitting the enter key will continue program execution.
     *
     * @param registrationId Id of the registration the link is being built for.
     * @return Link for the learner to launch the course.
     */
    public String buildLaunchLink(String registrationId) throws ApiException {
        // (Optional) Further authenticate via OAuth token access
        // configureOAuth(Collections.singletonList("read:registration"));

        RegistrationApi registrationApi = new RegistrationApi();
        LaunchLinkRequestSchema settings = new LaunchLinkRequestSchema()
                .redirectOnExitUrl("Message");
        LaunchLinkSchema launchLink = registrationApi.buildRegistrationLaunchLink(registrationId, settings);

        return launchLink.getLaunchLink();
    }

    /**
     * Gets information about the progress of the registration.
     *
     * For the most up-to-date results, you should implement our postback
     * mechanism. The basic premise is that any update to the registration
     * would cause us to send the updated results to your system.
     *
     * More details can be found in the documentation:
     * https://cloud.scorm.com/docs/v2/guides/postback/
     *
     * @param registrationId Id of the registration to get results for.
     * @return Detailed information about the registration's progress.
     */
    public RegistrationSchema getResultForRegistration(String registrationId) throws ApiException {
        // (Optional) Further authenticate via OAuth token access
        // configureOAuth(Collections.singletonList("read:registration"));

        RegistrationApi registrationApi = new RegistrationApi();
        RegistrationSchema progress = registrationApi.getRegistrationProgress(registrationId, null, null, null);

        return progress;
    }

    /**
     * Gets information about all courses. The result received from the API
     * call is a paginated list, meaning that additional calls are required
     * to retrieve all the information from the API. This has already been
     * accounted for in the sample.
     *
     * @return List of detailed information about all of the courses.
     */
    public List<CourseSchema> getAllCourses() throws ApiException {
        // (Optional) Further authenticate via OAuth token access
        // configureOAuth(Collections.singletonList("read:course"));

        // Additional filters can be provided to this call to get a subset
        // of all courses.
        CourseApi courseApi = new CourseApi();
        CourseListSchema response = courseApi.getCourses(null, null, null, null, null, null, null, null, null, null);

        // This call is paginated, with a token provided if more results exist
        List<CourseSchema> courseList = response.getCourses();
        while (response.getMore() != null)
        {
            response = courseApi.getCourses(null, null, null, null, null, null, null, response.getMore(), null, null);
            courseList.addAll(response.getCourses());
        }

        return courseList;
    }

    /**
     * Gets information about the registration progress for all
     * registrations. The result received from the API call is a paginated
     * list, meaning that additional calls are required to retrieve all the
     * information from the API. This has already been accounted for in the
     * sample.
     *
     * This call can be quite time-consuming and tedious with lots of
     * registrations. If you find yourself making lots of calls to this
     * endpoint, it might be worthwhile to look into registration postbacks.
     *
     * More details can be found in the documentation:
     * https://cloud.scorm.com/docs/v2/guides/postback/
     *
     * @return List of detailed information about all of the registrations.
     */
    public List<RegistrationSchema> getAllRegistrations() throws ApiException {
        // (Optional) Further authenticate via OAuth token access
        // configureOAuth(Collections.singletonList("read:registration"));

        // Additional filters can be provided to this call to get a subset
        // of all registrations.
        RegistrationApi registrationApi = new RegistrationApi();
        RegistrationListSchema response = registrationApi.getRegistrations(null, null, null, null, null, null, null, null, null, null, null, null, null);

        // This call is paginated, with a token provided if more results exist
        List<RegistrationSchema> registrationList = response.getRegistrations();
        while (response.getMore() != null)
        {
            response = registrationApi.getRegistrations(null, null, null, null, null, null, null, null, null, response.getMore(), null, null, null);
            registrationList.addAll(response.getRegistrations());
        }

        return registrationList;
    }

    /**
     * Deletes all of the data generated by this sample.
     *
     * This code is run even if the program has errored out, providing a
     * "clean slate" for every run of this sample.
     *
     * It is not necessary to delete registrations if the course
     * they belong to has been deleted. Deleting the course will
     * automatically queue deletion of all registrations associated with
     * the course. There will be a delay between when the course is deleted
     * and when the registrations for the course have been removed. The
     * registration deletion has been handled here to prevent scenarios
     * where the registration hasn't been deleted yet by the time the
     * sample has been rerun.
     *
     * @param courseId Id of the course to delete.
     * @param registrationId Id of the registration to delete.
     */
    public void cleanUp(String courseId, String registrationId) throws ApiException {
        // (Optional) Further authenticate via OAuth token access
        // configureOAuth(Arrays.asList("delete:course", "delete:registration"));

        // This call will use OAuth with the "delete:course" scope
        // if configured.  Otherwise the basic auth credentials will be used
        CourseApi courseApi = new CourseApi();
        courseApi.deleteCourse(courseId);

        // The code below is to prevent race conditions if the
        // sample is run in quick successions.

        // This call will use OAuth2 with the "delete:registration" scope
        // if configured.  Otherwise the basic auth credentials will be used.
        RegistrationApi registrationApi = new RegistrationApi();
        registrationApi.deleteRegistration(registrationId);
    }
}

```
