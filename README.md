# Testing
[Software Testing](https://www.atlassian.com/continuous-delivery/software-testing/types-of-software-testing)
[Performance Testing](https://stackify.com/ultimate-guide-performance-testing-and-software-testing/)
### Unit Tests
- Testing a 'unit'. Only concerned with the class you are testing for. That means mocking dependencies. Only care about 
inputs/outputs of a function/class.

### Integration Tests
- Testing multiple 'units'. Concerned with how data flows from method to method/class to class. That means spying and 
potentially stubbing spys.

### End to End Tests
- Automation tests. Automation software is used - TestCafe, Protractor, Detox (react-native), etc. This type of test 
will automate and simulate a user interacting with a UI - whether that is a mobile app or web app. This can be run against
development data (using Wiremock, H2, etc), or using Q2 data (lower life-cycle data used to test against). 

### Acceptance Tests
- This can be manual or automated. A QA engineer or project manager (PM) will demo the feature/bug fix to show that the 
code change is correct. Ex - Engineer given a specification to include a feature in a webapp that allows for users to 
upload a profile picture. The QA engineer or PM will then test the change after implementaiton is done to test that the 
end user will be able to upload a profile picture.

### Smoke Testing
- This can be manual or automated. This type of testing may just run the most important tests/flows in an application. In
this case, if it were a web app, a smoke test suite may consist of important user flows such as: logging in, uploading a
profile picture, and logging out, etc. Another example, before a version is actually released to users and after all tests
and demos have been completed, someone could run through the app to make sure they are still capable of completing certain
tasks.

### Performance Testing
- There are different kinds:
    - Load test: Measures system performance based on an increase of a load (users). Tests how well your backend performs
    with X amount of users. Checking response times of network requests that are coming in/out of backend.
    - Stress test: Measures system performance based on a time window. How long can it perform given X amount of users 
    at Y amount of effeciency. At X amount of users, when does it fail?
    - Endurance test: Measures system performance based on a constant amount of users over a extended period of time. At 
    X amount of users, how much application memory is being used and what is the heap size over a period of time?