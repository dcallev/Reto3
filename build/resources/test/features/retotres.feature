@Regression

Feature: As a patient
  I want to make the request for a medical appointment
  Through the Hospital Administration system

  Background:
    Given That Carlos needs to register a new doctor, patient and an appointment

  @RegisterDoctor
  Scenario Outline:   Register a new doctor
    When He makes the registration of the doctor in the Hospital Administration application
      | full_name   | last_name   | phone   | type_document   | document_doctor   |
      | <full_name> | <last_name> | <phone> | <type_document> | <document_doctor> |

    Then he verifies that the message Data saved correctly is displayed
    Examples:
      | full_name | last_name | phone      | type_document        | document_doctor |
      | Daniela   | Calle     | 3104200602 | Pasaportes | 1123    |
      | Juan      | Perez     | 3116318821 | Pasaportes | 456     |

  @RegisterPatient
  Scenario: Register a new patient
    When He makes the registration of the patient in the Hospital Administration application
      | full_name | last_name | phone      | type_document        | document_patient |Prepaid|
      | Juan      | Perez     | 3116318821 | 456 |   Pasaportes  | Yes |
    Then he verifies that the message Data saved correctly is displayed

  @ScheduleAppointment
  Scenario: Schedule an Appointment
    When that Carlos needs to attend the doctor
      | Date       | document_patiente | document_doctor | commentary     |
      | 10/08/2019 | 456         | 123       | general review |
    Then he verifies that the message Data saved correctly is displayed

