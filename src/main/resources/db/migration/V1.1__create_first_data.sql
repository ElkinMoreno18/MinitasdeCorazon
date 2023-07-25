INSERT INTO "usuarios" (nombre, email, password, role) VALUES
    ('Admin', 'admin@gmail.com', '$2a$12$lO1bQehEEzRz.5dOZJdVp.YRZVRg7VZHIgf7a1jDuXMF3PmjV95Ua', 'ROLE_ADMIN'),
    ('Agent', 'agent@gmail.com', '$2a$12$lO1bQehEEzRz.5dOZJdVp.YRZVRg7VZHIgf7a1jDuXMF3PmjV95Ua', 'ROLE_AGENT'),
    ('Analyst', 'analyst@gmail.com', '$2a$12$lO1bQehEEzRz.5dOZJdVp.YRZVRg7VZHIgf7a1jDuXMF3PmjV95Ua', 'ROLE_ANALYST');


INSERT INTO proceso_desminado (ubicacion, region, tipo_desminado, usuario_id) VALUES
    ('Ubicacion Bogota', 'Bogota', 'Humanitario', (SELECT id FROM "usuarios" WHERE role = 'ROLE_AGENT' LIMIT 1)),
    ('Ubicacion Medellin', 'Medellin', 'Militar', (SELECT id FROM "usuarios" WHERE role = 'ROLE_AGENT' LIMIT 1)),
    ('Ubicacion Tunja', 'Tunja', 'Humanitario', (SELECT id FROM "usuarios" WHERE role = 'ROLE_ANALYST' LIMIT 1));
