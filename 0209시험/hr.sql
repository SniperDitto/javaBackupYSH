-- �� ���̺�
CREATE TABLE "MY_SCHEMA"."EMPLOYEES" (
	"employee_ID"   NUMBER   NOT NULL, -- �� �÷�
	"first_Name"    VARCHAR2 NULL,     -- �� �÷�2
	"last_Name"     VARCHAR2 NOT NULL, -- �� �÷�3
	"email"         VARCHAR2 NOT NULL, -- �� �÷�4
	"phone_Number"  VARCHAR2 NULL,     -- �� �÷�5
	"hire_Date"     DATE     NOT NULL, -- �� �÷�6
	"job_ID"        VARCHAR2 NOT NULL, -- �� �÷�7
	"salary"        NUMBER   NULL,     -- �� �÷�8
	"commision_PCT" NUMBER   NULL,     -- �� �÷�9
	"department_ID" NUMBER   NULL,     -- �� �÷�11
	"manager_ID"    NUMBER   NULL      -- �� �÷�12
);

-- �� ���̺� �⺻Ű
CREATE UNIQUE INDEX "MY_SCHEMA"."PK_EMPLOYEES"
	ON "MY_SCHEMA"."EMPLOYEES" ( -- �� ���̺�
		"employee_ID" ASC -- �� �÷�
	);

-- �� ���̺�
ALTER TABLE "MY_SCHEMA"."EMPLOYEES"
	ADD
		CONSTRAINT "PK_EMPLOYEES" -- �� ���̺� �⺻Ű
		PRIMARY KEY (
			"employee_ID" -- �� �÷�
		);

-- �� ���̺�
COMMENT ON TABLE "MY_SCHEMA"."EMPLOYEES" IS '�� ���̺�';

-- �� �÷�
COMMENT ON COLUMN "MY_SCHEMA"."EMPLOYEES"."employee_ID" IS '�� �÷�';

-- �� �÷�2
COMMENT ON COLUMN "MY_SCHEMA"."EMPLOYEES"."first_Name" IS '�� �÷�2';

-- �� �÷�3
COMMENT ON COLUMN "MY_SCHEMA"."EMPLOYEES"."last_Name" IS '�� �÷�3';

-- �� �÷�4
COMMENT ON COLUMN "MY_SCHEMA"."EMPLOYEES"."email" IS '�� �÷�4';

-- �� �÷�5
COMMENT ON COLUMN "MY_SCHEMA"."EMPLOYEES"."phone_Number" IS '�� �÷�5';

-- �� �÷�6
COMMENT ON COLUMN "MY_SCHEMA"."EMPLOYEES"."hire_Date" IS '�� �÷�6';

-- �� �÷�7
COMMENT ON COLUMN "MY_SCHEMA"."EMPLOYEES"."job_ID" IS '�� �÷�7';

-- �� �÷�8
COMMENT ON COLUMN "MY_SCHEMA"."EMPLOYEES"."salary" IS '�� �÷�8';

-- �� �÷�9
COMMENT ON COLUMN "MY_SCHEMA"."EMPLOYEES"."commision_PCT" IS '�� �÷�9';

-- �� �÷�11
COMMENT ON COLUMN "MY_SCHEMA"."EMPLOYEES"."department_ID" IS '�� �÷�11';

-- �� �÷�12
COMMENT ON COLUMN "MY_SCHEMA"."EMPLOYEES"."manager_ID" IS '�� �÷�12';

-- �� ���̺� �⺻Ű
COMMENT ON INDEX "MY_SCHEMA"."PK_EMPLOYEES" IS '�� ���̺� �⺻Ű';

-- �� ���̺� �⺻Ű
COMMENT ON CONSTRAINT "MY_SCHEMA"."EMPLOYEES"."PK_EMPLOYEES" IS '�� ���̺� �⺻Ű';

-- �� ���̺�2
CREATE TABLE "MY_SCHEMA"."COUNTRIES" (
	"country_ID"   <������ Ÿ�� ����> NOT NULL, -- �� �÷�
	"country_Name" <������ Ÿ�� ����> NULL,     -- �� �÷�2
	"region_ID"    NUMBER             NULL      -- �� �÷�3
);

-- �� ���̺�2 �⺻Ű
CREATE UNIQUE INDEX "MY_SCHEMA"."PK_COUNTRIES"
	ON "MY_SCHEMA"."COUNTRIES" ( -- �� ���̺�2
		"country_ID" ASC -- �� �÷�
	);

-- �� ���̺�2
ALTER TABLE "MY_SCHEMA"."COUNTRIES"
	ADD
		CONSTRAINT "PK_COUNTRIES" -- �� ���̺�2 �⺻Ű
		PRIMARY KEY (
			"country_ID" -- �� �÷�
		);

-- �� ���̺�2
COMMENT ON TABLE "MY_SCHEMA"."COUNTRIES" IS '�� ���̺�2';

-- �� �÷�
COMMENT ON COLUMN "MY_SCHEMA"."COUNTRIES"."country_ID" IS '�� �÷�';

-- �� �÷�2
COMMENT ON COLUMN "MY_SCHEMA"."COUNTRIES"."country_Name" IS '�� �÷�2';

-- �� �÷�3
COMMENT ON COLUMN "MY_SCHEMA"."COUNTRIES"."region_ID" IS '�� �÷�3';

-- �� ���̺�2 �⺻Ű
COMMENT ON INDEX "MY_SCHEMA"."PK_COUNTRIES" IS '�� ���̺�2 �⺻Ű';

-- �� ���̺�2 �⺻Ű
COMMENT ON CONSTRAINT "MY_SCHEMA"."COUNTRIES"."PK_COUNTRIES" IS '�� ���̺�2 �⺻Ű';

-- �� ���̺�3
CREATE TABLE "MY_SCHEMA"."DEPARTMENTS" (
	"department_ID"   NUMBER   NOT NULL, -- �� �÷�
	"department_Name" VARCHAR2 NOT NULL, -- �� �÷�2
	"location_ID"     NUMBER   NULL,     -- �� �÷�4
	"manager_ID"      NUMBER   NULL      -- �� �÷�5
);

-- �� ���̺�3 �⺻Ű
CREATE UNIQUE INDEX "MY_SCHEMA"."PK_DEPARTMENTS"
	ON "MY_SCHEMA"."DEPARTMENTS" ( -- �� ���̺�3
		"department_ID" ASC -- �� �÷�
	);

-- �� ���̺�3
ALTER TABLE "MY_SCHEMA"."DEPARTMENTS"
	ADD
		CONSTRAINT "PK_DEPARTMENTS" -- �� ���̺�3 �⺻Ű
		PRIMARY KEY (
			"department_ID" -- �� �÷�
		);

-- �� ���̺�3
COMMENT ON TABLE "MY_SCHEMA"."DEPARTMENTS" IS '�� ���̺�3';

-- �� �÷�
COMMENT ON COLUMN "MY_SCHEMA"."DEPARTMENTS"."department_ID" IS '�� �÷�';

-- �� �÷�2
COMMENT ON COLUMN "MY_SCHEMA"."DEPARTMENTS"."department_Name" IS '�� �÷�2';

-- �� �÷�4
COMMENT ON COLUMN "MY_SCHEMA"."DEPARTMENTS"."location_ID" IS '�� �÷�4';

-- �� �÷�5
COMMENT ON COLUMN "MY_SCHEMA"."DEPARTMENTS"."manager_ID" IS '�� �÷�5';

-- �� ���̺�3 �⺻Ű
COMMENT ON INDEX "MY_SCHEMA"."PK_DEPARTMENTS" IS '�� ���̺�3 �⺻Ű';

-- �� ���̺�3 �⺻Ű
COMMENT ON CONSTRAINT "MY_SCHEMA"."DEPARTMENTS"."PK_DEPARTMENTS" IS '�� ���̺�3 �⺻Ű';

-- �� ���̺�4
CREATE TABLE "MY_SCHEMA"."JOBS" (
	"job_ID"     VARCHAR2 NOT NULL, -- �� �÷�
	"job_Title"  VARCHAR2 NOT NULL, -- �� �÷�2
	"min_Salary" NUMBER   NULL,     -- �� �÷�3
	"max_Salary" NUMBER   NULL      -- �� �÷�4
);

-- �� ���̺�4 �⺻Ű
CREATE UNIQUE INDEX "MY_SCHEMA"."PK_JOBS"
	ON "MY_SCHEMA"."JOBS" ( -- �� ���̺�4
		"job_ID" ASC -- �� �÷�
	);

-- �� ���̺�4
ALTER TABLE "MY_SCHEMA"."JOBS"
	ADD
		CONSTRAINT "PK_JOBS" -- �� ���̺�4 �⺻Ű
		PRIMARY KEY (
			"job_ID" -- �� �÷�
		);

-- �� ���̺�4
COMMENT ON TABLE "MY_SCHEMA"."JOBS" IS '�� ���̺�4';

-- �� �÷�
COMMENT ON COLUMN "MY_SCHEMA"."JOBS"."job_ID" IS '�� �÷�';

-- �� �÷�2
COMMENT ON COLUMN "MY_SCHEMA"."JOBS"."job_Title" IS '�� �÷�2';

-- �� �÷�3
COMMENT ON COLUMN "MY_SCHEMA"."JOBS"."min_Salary" IS '�� �÷�3';

-- �� �÷�4
COMMENT ON COLUMN "MY_SCHEMA"."JOBS"."max_Salary" IS '�� �÷�4';

-- �� ���̺�4 �⺻Ű
COMMENT ON INDEX "MY_SCHEMA"."PK_JOBS" IS '�� ���̺�4 �⺻Ű';

-- �� ���̺�4 �⺻Ű
COMMENT ON CONSTRAINT "MY_SCHEMA"."JOBS"."PK_JOBS" IS '�� ���̺�4 �⺻Ű';

-- �� ���̺�5
CREATE TABLE "MY_SCHEMA"."JOB_HISTORY" (
	"employee_ID"   NUMBER   NOT NULL, -- �� �÷�6
	"start_Date"    DATE     NOT NULL, -- �� �÷�2
	"end_Date"      DATE     NOT NULL, -- �� �÷�3
	"job_ID"        VARCHAR2 NOT NULL, -- �� �÷�4
	"department_ID" NUMBER   NULL      -- �� �÷�5
);

-- �� ���̺�5 �⺻Ű
CREATE UNIQUE INDEX "MY_SCHEMA"."PK_JOB_HISTORY"
	ON "MY_SCHEMA"."JOB_HISTORY" ( -- �� ���̺�5
		"employee_ID" ASC, -- �� �÷�6
		"start_Date"  ASC  -- �� �÷�2
	);

-- �� ���̺�5
ALTER TABLE "MY_SCHEMA"."JOB_HISTORY"
	ADD
		CONSTRAINT "PK_JOB_HISTORY" -- �� ���̺�5 �⺻Ű
		PRIMARY KEY (
			"employee_ID", -- �� �÷�6
			"start_Date"   -- �� �÷�2
		);

-- �� ���̺�5
COMMENT ON TABLE "MY_SCHEMA"."JOB_HISTORY" IS '�� ���̺�5';

-- �� �÷�6
COMMENT ON COLUMN "MY_SCHEMA"."JOB_HISTORY"."employee_ID" IS '�� �÷�6';

-- �� �÷�2
COMMENT ON COLUMN "MY_SCHEMA"."JOB_HISTORY"."start_Date" IS '�� �÷�2';

-- �� �÷�3
COMMENT ON COLUMN "MY_SCHEMA"."JOB_HISTORY"."end_Date" IS '�� �÷�3';

-- �� �÷�4
COMMENT ON COLUMN "MY_SCHEMA"."JOB_HISTORY"."job_ID" IS '�� �÷�4';

-- �� �÷�5
COMMENT ON COLUMN "MY_SCHEMA"."JOB_HISTORY"."department_ID" IS '�� �÷�5';

-- �� ���̺�5 �⺻Ű
COMMENT ON INDEX "MY_SCHEMA"."PK_JOB_HISTORY" IS '�� ���̺�5 �⺻Ű';

-- �� ���̺�5 �⺻Ű
COMMENT ON CONSTRAINT "MY_SCHEMA"."JOB_HISTORY"."PK_JOB_HISTORY" IS '�� ���̺�5 �⺻Ű';

-- �� ���̺�6
CREATE TABLE "MY_SCHEMA"."LOCATIONS" (
	"location_ID"    NUMBER             NOT NULL, -- �� �÷�7
	"street_Address" VARCHAR2           NULL,     -- �� �÷�2
	"postal_Code"    VARCHAR2           NULL,     -- �� �÷�3
	"city"           VARCHAR2           NOT NULL, -- �� �÷�4
	"state_Province" VARCHAR2           NULL,     -- �� �÷�5
	"country_ID"     <������ Ÿ�� ����> NULL      -- �� �÷�6
);

-- �� ���̺�6 �⺻Ű
CREATE UNIQUE INDEX "MY_SCHEMA"."PK_LOCATIONS"
	ON "MY_SCHEMA"."LOCATIONS" ( -- �� ���̺�6
		"location_ID" ASC -- �� �÷�7
	);

-- �� ���̺�6
ALTER TABLE "MY_SCHEMA"."LOCATIONS"
	ADD
		CONSTRAINT "PK_LOCATIONS" -- �� ���̺�6 �⺻Ű
		PRIMARY KEY (
			"location_ID" -- �� �÷�7
		);

-- �� ���̺�6
COMMENT ON TABLE "MY_SCHEMA"."LOCATIONS" IS '�� ���̺�6';

-- �� �÷�7
COMMENT ON COLUMN "MY_SCHEMA"."LOCATIONS"."location_ID" IS '�� �÷�7';

-- �� �÷�2
COMMENT ON COLUMN "MY_SCHEMA"."LOCATIONS"."street_Address" IS '�� �÷�2';

-- �� �÷�3
COMMENT ON COLUMN "MY_SCHEMA"."LOCATIONS"."postal_Code" IS '�� �÷�3';

-- �� �÷�4
COMMENT ON COLUMN "MY_SCHEMA"."LOCATIONS"."city" IS '�� �÷�4';

-- �� �÷�5
COMMENT ON COLUMN "MY_SCHEMA"."LOCATIONS"."state_Province" IS '�� �÷�5';

-- �� �÷�6
COMMENT ON COLUMN "MY_SCHEMA"."LOCATIONS"."country_ID" IS '�� �÷�6';

-- �� ���̺�6 �⺻Ű
COMMENT ON INDEX "MY_SCHEMA"."PK_LOCATIONS" IS '�� ���̺�6 �⺻Ű';

-- �� ���̺�6 �⺻Ű
COMMENT ON CONSTRAINT "MY_SCHEMA"."LOCATIONS"."PK_LOCATIONS" IS '�� ���̺�6 �⺻Ű';

-- �� ���̺�7
CREATE TABLE "MY_SCHEMA"."REGIONS" (
	"region_ID"   NUMBER   NOT NULL, -- �� �÷�
	"region_Name" VARCHAR2 NULL      -- �� �÷�2
);

-- �� ���̺�7 �⺻Ű
CREATE UNIQUE INDEX "MY_SCHEMA"."PK_REGIONS"
	ON "MY_SCHEMA"."REGIONS" ( -- �� ���̺�7
		"region_ID" ASC -- �� �÷�
	);

-- �� ���̺�7
ALTER TABLE "MY_SCHEMA"."REGIONS"
	ADD
		CONSTRAINT "PK_REGIONS" -- �� ���̺�7 �⺻Ű
		PRIMARY KEY (
			"region_ID" -- �� �÷�
		);

-- �� ���̺�7
COMMENT ON TABLE "MY_SCHEMA"."REGIONS" IS '�� ���̺�7';

-- �� �÷�
COMMENT ON COLUMN "MY_SCHEMA"."REGIONS"."region_ID" IS '�� �÷�';

-- �� �÷�2
COMMENT ON COLUMN "MY_SCHEMA"."REGIONS"."region_Name" IS '�� �÷�2';

-- �� ���̺�7 �⺻Ű
COMMENT ON INDEX "MY_SCHEMA"."PK_REGIONS" IS '�� ���̺�7 �⺻Ű';

-- �� ���̺�7 �⺻Ű
COMMENT ON CONSTRAINT "MY_SCHEMA"."REGIONS"."PK_REGIONS" IS '�� ���̺�7 �⺻Ű';

-- �� ���̺�
ALTER TABLE "MY_SCHEMA"."EMPLOYEES"
	ADD
		CONSTRAINT "FK_JOBS_TO_EMPLOYEES" -- �� ���̺�4 -> �� ���̺�
		FOREIGN KEY (
			"job_ID" -- �� �÷�7
		)
		REFERENCES "MY_SCHEMA"."JOBS" ( -- �� ���̺�4
			"job_ID" -- �� �÷�
		);

-- �� ���̺�4 -> �� ���̺�
COMMENT ON CONSTRAINT "MY_SCHEMA"."EMPLOYEES"."FK_JOBS_TO_EMPLOYEES" IS '�� ���̺�4 -> �� ���̺�';

-- �� ���̺�
ALTER TABLE "MY_SCHEMA"."EMPLOYEES"
	ADD
		CONSTRAINT "FK_EMPLOYEES_TO_EMPLOYEES" -- �� ���̺� -> �� ���̺�
		FOREIGN KEY (
			"manager_ID" -- �� �÷�12
		)
		REFERENCES "MY_SCHEMA"."EMPLOYEES" ( -- �� ���̺�
			"employee_ID" -- �� �÷�
		);

-- �� ���̺� -> �� ���̺�
COMMENT ON CONSTRAINT "MY_SCHEMA"."EMPLOYEES"."FK_EMPLOYEES_TO_EMPLOYEES" IS '�� ���̺� -> �� ���̺�';

-- �� ���̺�
ALTER TABLE "MY_SCHEMA"."EMPLOYEES"
	ADD
		CONSTRAINT "FK_DEPARTMENTS_TO_EMPLOYEES" -- �� ���̺�3 -> �� ���̺�
		FOREIGN KEY (
			"department_ID" -- �� �÷�11
		)
		REFERENCES "MY_SCHEMA"."DEPARTMENTS" ( -- �� ���̺�3
			"department_ID" -- �� �÷�
		);

-- �� ���̺�3 -> �� ���̺�
COMMENT ON CONSTRAINT "MY_SCHEMA"."EMPLOYEES"."FK_DEPARTMENTS_TO_EMPLOYEES" IS '�� ���̺�3 -> �� ���̺�';

-- �� ���̺�2
ALTER TABLE "MY_SCHEMA"."COUNTRIES"
	ADD
		CONSTRAINT "FK_REGIONS_TO_COUNTRIES" -- �� ���̺�7 -> �� ���̺�2
		FOREIGN KEY (
			"region_ID" -- �� �÷�3
		)
		REFERENCES "MY_SCHEMA"."REGIONS" ( -- �� ���̺�7
			"region_ID" -- �� �÷�
		);

-- �� ���̺�7 -> �� ���̺�2
COMMENT ON CONSTRAINT "MY_SCHEMA"."COUNTRIES"."FK_REGIONS_TO_COUNTRIES" IS '�� ���̺�7 -> �� ���̺�2';

-- �� ���̺�3
ALTER TABLE "MY_SCHEMA"."DEPARTMENTS"
	ADD
		CONSTRAINT "FK_EMPLOYEES_TO_DEPARTMENTS" -- �� ���̺� -> �� ���̺�3
		FOREIGN KEY (
			"manager_ID" -- �� �÷�5
		)
		REFERENCES "MY_SCHEMA"."EMPLOYEES" ( -- �� ���̺�
			"employee_ID" -- �� �÷�
		);

-- �� ���̺� -> �� ���̺�3
COMMENT ON CONSTRAINT "MY_SCHEMA"."DEPARTMENTS"."FK_EMPLOYEES_TO_DEPARTMENTS" IS '�� ���̺� -> �� ���̺�3';

-- �� ���̺�3
ALTER TABLE "MY_SCHEMA"."DEPARTMENTS"
	ADD
		CONSTRAINT "FK_LOCATIONS_TO_DEPARTMENTS" -- �� ���̺�6 -> �� ���̺�3
		FOREIGN KEY (
			"location_ID" -- �� �÷�4
		)
		REFERENCES "MY_SCHEMA"."LOCATIONS" ( -- �� ���̺�6
			"location_ID" -- �� �÷�7
		);

-- �� ���̺�6 -> �� ���̺�3
COMMENT ON CONSTRAINT "MY_SCHEMA"."DEPARTMENTS"."FK_LOCATIONS_TO_DEPARTMENTS" IS '�� ���̺�6 -> �� ���̺�3';

-- �� ���̺�5
ALTER TABLE "MY_SCHEMA"."JOB_HISTORY"
	ADD
		CONSTRAINT "FK_JOBS_TO_JOB_HISTORY" -- �� ���̺�4 -> �� ���̺�5
		FOREIGN KEY (
			"job_ID" -- �� �÷�4
		)
		REFERENCES "MY_SCHEMA"."JOBS" ( -- �� ���̺�4
			"job_ID" -- �� �÷�
		);

-- �� ���̺�4 -> �� ���̺�5
COMMENT ON CONSTRAINT "MY_SCHEMA"."JOB_HISTORY"."FK_JOBS_TO_JOB_HISTORY" IS '�� ���̺�4 -> �� ���̺�5';

-- �� ���̺�5
ALTER TABLE "MY_SCHEMA"."JOB_HISTORY"
	ADD
		CONSTRAINT "FK_DEPARTMENTS_TO_JOB_HISTORY" -- �� ���̺�3 -> �� ���̺�5
		FOREIGN KEY (
			"department_ID" -- �� �÷�5
		)
		REFERENCES "MY_SCHEMA"."DEPARTMENTS" ( -- �� ���̺�3
			"department_ID" -- �� �÷�
		);

-- �� ���̺�3 -> �� ���̺�5
COMMENT ON CONSTRAINT "MY_SCHEMA"."JOB_HISTORY"."FK_DEPARTMENTS_TO_JOB_HISTORY" IS '�� ���̺�3 -> �� ���̺�5';

-- �� ���̺�5
ALTER TABLE "MY_SCHEMA"."JOB_HISTORY"
	ADD
		CONSTRAINT "FK_EMPLOYEES_TO_JOB_HISTORY" -- �� ���̺� -> �� ���̺�5
		FOREIGN KEY (
			"employee_ID" -- �� �÷�6
		)
		REFERENCES "MY_SCHEMA"."EMPLOYEES" ( -- �� ���̺�
			"employee_ID" -- �� �÷�
		);

-- �� ���̺� -> �� ���̺�5
COMMENT ON CONSTRAINT "MY_SCHEMA"."JOB_HISTORY"."FK_EMPLOYEES_TO_JOB_HISTORY" IS '�� ���̺� -> �� ���̺�5';

-- �� ���̺�6
ALTER TABLE "MY_SCHEMA"."LOCATIONS"
	ADD
		CONSTRAINT "FK_COUNTRIES_TO_LOCATIONS" -- �� ���̺�2 -> �� ���̺�6
		FOREIGN KEY (
			"country_ID" -- �� �÷�6
		)
		REFERENCES "MY_SCHEMA"."COUNTRIES" ( -- �� ���̺�2
			"country_ID" -- �� �÷�
		);

-- �� ���̺�2 -> �� ���̺�6
COMMENT ON CONSTRAINT "MY_SCHEMA"."LOCATIONS"."FK_COUNTRIES_TO_LOCATIONS" IS '�� ���̺�2 -> �� ���̺�6';

-- �� ���̺�6
ALTER TABLE "MY_SCHEMA"."LOCATIONS"
	ADD
		CONSTRAINT "FK_REGIONS_TO_LOCATIONS" -- �� ���̺�7 -> �� ���̺�6
		FOREIGN KEY (
			"location_ID" -- �� �÷�7
		)
		REFERENCES "MY_SCHEMA"."REGIONS" ( -- �� ���̺�7
			"region_ID" -- �� �÷�
		);

-- �� ���̺�7 -> �� ���̺�6
COMMENT ON CONSTRAINT "MY_SCHEMA"."LOCATIONS"."FK_REGIONS_TO_LOCATIONS" IS '�� ���̺�7 -> �� ���̺�6';