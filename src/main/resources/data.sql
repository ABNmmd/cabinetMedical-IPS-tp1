-- Insert Patients
INSERT INTO patient (nom, date_naissance, genre, telephone) VALUES
                                                                ('Ahmed Benali', '1990-05-15', 'M', '0612345678'),
                                                                ('Fatima Alami', '1985-08-22', 'F', '0623456789'),
                                                                ('Mohammed Tazi', '1992-03-10', 'M', '0634567890'),
                                                                ('Aicha Idrissi', '1988-12-05', 'F', '0645678901'),
                                                                ('Youssef Amrani', '1995-07-18', 'M', '0656789012');

-- Insert Medecins
INSERT INTO medecin (nom, specialite, email) VALUES
                                                 ('Dr. Hassan Berrada', 'Cardiologie', 'h.berrada@cabinet.ma'),
                                                 ('Dr. Samira Fassi', 'Dermatologie', 's.fassi@cabinet.ma'),
                                                 ('Dr. Omar Alaoui', 'Pediatrie', 'o.alaoui@cabinet.ma'),
                                                 ('Dr. Nadia Benjelloun', 'Gynecologie', 'n.benjelloun@cabinet.ma'),
                                                 ('Dr. Karim Sabiri', 'Neurologie', 'k.sabiri@cabinet.ma');

-- Insert RendezVous
INSERT INTO rendez_vous (date_rdv, status, patient_id, medecin_id) VALUES
                                                                       ('2024-02-15', 'CONFIRME', 1, 1),
                                                                       ('2024-02-16', 'EN_ATTENTE', 2, 2),
                                                                       ('2024-02-17', 'CONFIRME', 3, 3),
                                                                       ('2024-02-18', 'ANNULE', 4, 4),
                                                                       ('2024-02-19', 'CONFIRME', 5, 5),
                                                                       ('2024-02-20', 'EN_ATTENTE', 1, 2);

-- Insert Consultations
INSERT INTO consultation (date_consultation, rapport, rendez_vous_id) VALUES
                                                                          ('2024-02-15', 'Examen cardiaque normal. Tension arterielle stable.', 1),
                                                                          ('2024-02-17', 'Consultation pediatrique de routine. Croissance normale.', 3),
                                                                          ('2024-02-19', 'Examen neurologique complet. Reflexes normaux.', 5);
