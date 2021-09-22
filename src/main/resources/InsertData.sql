INSERT INTO Person(person_id, name)
VALUES (1, N'Иванов Иван'),
       (2, N'Петров Петр'),
       (3, N'Сидоров Сидр'),
       (4, N'Алексеев Алексей');

INSERT INTO Contacts(contact_id, infected_person, sick_person)
VALUES (1, 3, 1),
       (2, 4, 1),
       (3, 2, 3)