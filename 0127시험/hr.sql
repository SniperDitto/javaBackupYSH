-- 새 테이블
CREATE TABLE "MY_SCHEMA"."EMPLOYEES" (
	"employee_ID"   NUMBER   NOT NULL, -- 새 컬럼
	"first_Name"    VARCHAR2 NULL,     -- 새 컬럼2
	"last_Name"     VARCHAR2 NOT NULL, -- 새 컬럼3
	"email"         VARCHAR2 NOT NULL, -- 새 컬럼4
	"phone_Number"  VARCHAR2 NULL,     -- 새 컬럼5
	"hire_Date"     DATE     NOT NULL, -- 새 컬럼6
	"job_ID"        VARCHAR2 NOT NULL, -- 새 컬럼7
	"salary"        NUMBER   NULL,     -- 새 컬럼8
	"commision_PCT" NUMBER   NULL,     -- 새 컬럼9
	"department_ID" NUMBER   NULL,     -- 새 컬럼11
	"manager_ID"    NUMBER   NULL      -- 새 컬럼12
);

-- 새 테이블 기본키
CREATE UNIQUE INDEX "MY_SCHEMA"."PK_EMPLOYEES"
	ON "MY_SCHEMA"."EMPLOYEES" ( -- 새 테이블
		"employee_ID" ASC -- 새 컬럼
	);

-- 새 테이블
ALTER TABLE "MY_SCHEMA"."EMPLOYEES"
	ADD
		CONSTRAINT "PK_EMPLOYEES" -- 새 테이블 기본키
		PRIMARY KEY (
			"employee_ID" -- 새 컬럼
		);

-- 새 테이블
COMMENT ON TABLE "MY_SCHEMA"."EMPLOYEES" IS '새 테이블';

-- 새 컬럼
COMMENT ON COLUMN "MY_SCHEMA"."EMPLOYEES"."employee_ID" IS '새 컬럼';

-- 새 컬럼2
COMMENT ON COLUMN "MY_SCHEMA"."EMPLOYEES"."first_Name" IS '새 컬럼2';

-- 새 컬럼3
COMMENT ON COLUMN "MY_SCHEMA"."EMPLOYEES"."last_Name" IS '새 컬럼3';

-- 새 컬럼4
COMMENT ON COLUMN "MY_SCHEMA"."EMPLOYEES"."email" IS '새 컬럼4';

-- 새 컬럼5
COMMENT ON COLUMN "MY_SCHEMA"."EMPLOYEES"."phone_Number" IS '새 컬럼5';

-- 새 컬럼6
COMMENT ON COLUMN "MY_SCHEMA"."EMPLOYEES"."hire_Date" IS '새 컬럼6';

-- 새 컬럼7
COMMENT ON COLUMN "MY_SCHEMA"."EMPLOYEES"."job_ID" IS '새 컬럼7';

-- 새 컬럼8
COMMENT ON COLUMN "MY_SCHEMA"."EMPLOYEES"."salary" IS '새 컬럼8';

-- 새 컬럼9
COMMENT ON COLUMN "MY_SCHEMA"."EMPLOYEES"."commision_PCT" IS '새 컬럼9';

-- 새 컬럼11
COMMENT ON COLUMN "MY_SCHEMA"."EMPLOYEES"."department_ID" IS '새 컬럼11';

-- 새 컬럼12
COMMENT ON COLUMN "MY_SCHEMA"."EMPLOYEES"."manager_ID" IS '새 컬럼12';

-- 새 테이블 기본키
COMMENT ON INDEX "MY_SCHEMA"."PK_EMPLOYEES" IS '새 테이블 기본키';

-- 새 테이블 기본키
COMMENT ON CONSTRAINT "MY_SCHEMA"."EMPLOYEES"."PK_EMPLOYEES" IS '새 테이블 기본키';

-- 새 테이블2
CREATE TABLE "MY_SCHEMA"."COUNTRIES" (
	"country_ID"   <데이터 타입 없음> NOT NULL, -- 새 컬럼
	"country_Name" <데이터 타입 없음> NULL,     -- 새 컬럼2
	"region_ID"    NUMBER             NULL      -- 새 컬럼3
);

-- 새 테이블2 기본키
CREATE UNIQUE INDEX "MY_SCHEMA"."PK_COUNTRIES"
	ON "MY_SCHEMA"."COUNTRIES" ( -- 새 테이블2
		"country_ID" ASC -- 새 컬럼
	);

-- 새 테이블2
ALTER TABLE "MY_SCHEMA"."COUNTRIES"
	ADD
		CONSTRAINT "PK_COUNTRIES" -- 새 테이블2 기본키
		PRIMARY KEY (
			"country_ID" -- 새 컬럼
		);

-- 새 테이블2
COMMENT ON TABLE "MY_SCHEMA"."COUNTRIES" IS '새 테이블2';

-- 새 컬럼
COMMENT ON COLUMN "MY_SCHEMA"."COUNTRIES"."country_ID" IS '새 컬럼';

-- 새 컬럼2
COMMENT ON COLUMN "MY_SCHEMA"."COUNTRIES"."country_Name" IS '새 컬럼2';

-- 새 컬럼3
COMMENT ON COLUMN "MY_SCHEMA"."COUNTRIES"."region_ID" IS '새 컬럼3';

-- 새 테이블2 기본키
COMMENT ON INDEX "MY_SCHEMA"."PK_COUNTRIES" IS '새 테이블2 기본키';

-- 새 테이블2 기본키
COMMENT ON CONSTRAINT "MY_SCHEMA"."COUNTRIES"."PK_COUNTRIES" IS '새 테이블2 기본키';

-- 새 테이블3
CREATE TABLE "MY_SCHEMA"."DEPARTMENTS" (
	"department_ID"   NUMBER   NOT NULL, -- 새 컬럼
	"department_Name" VARCHAR2 NOT NULL, -- 새 컬럼2
	"location_ID"     NUMBER   NULL,     -- 새 컬럼4
	"manager_ID"      NUMBER   NULL      -- 새 컬럼5
);

-- 새 테이블3 기본키
CREATE UNIQUE INDEX "MY_SCHEMA"."PK_DEPARTMENTS"
	ON "MY_SCHEMA"."DEPARTMENTS" ( -- 새 테이블3
		"department_ID" ASC -- 새 컬럼
	);

-- 새 테이블3
ALTER TABLE "MY_SCHEMA"."DEPARTMENTS"
	ADD
		CONSTRAINT "PK_DEPARTMENTS" -- 새 테이블3 기본키
		PRIMARY KEY (
			"department_ID" -- 새 컬럼
		);

-- 새 테이블3
COMMENT ON TABLE "MY_SCHEMA"."DEPARTMENTS" IS '새 테이블3';

-- 새 컬럼
COMMENT ON COLUMN "MY_SCHEMA"."DEPARTMENTS"."department_ID" IS '새 컬럼';

-- 새 컬럼2
COMMENT ON COLUMN "MY_SCHEMA"."DEPARTMENTS"."department_Name" IS '새 컬럼2';

-- 새 컬럼4
COMMENT ON COLUMN "MY_SCHEMA"."DEPARTMENTS"."location_ID" IS '새 컬럼4';

-- 새 컬럼5
COMMENT ON COLUMN "MY_SCHEMA"."DEPARTMENTS"."manager_ID" IS '새 컬럼5';

-- 새 테이블3 기본키
COMMENT ON INDEX "MY_SCHEMA"."PK_DEPARTMENTS" IS '새 테이블3 기본키';

-- 새 테이블3 기본키
COMMENT ON CONSTRAINT "MY_SCHEMA"."DEPARTMENTS"."PK_DEPARTMENTS" IS '새 테이블3 기본키';

-- 새 테이블4
CREATE TABLE "MY_SCHEMA"."JOBS" (
	"job_ID"     VARCHAR2 NOT NULL, -- 새 컬럼
	"job_Title"  VARCHAR2 NOT NULL, -- 새 컬럼2
	"min_Salary" NUMBER   NULL,     -- 새 컬럼3
	"max_Salary" NUMBER   NULL      -- 새 컬럼4
);

-- 새 테이블4 기본키
CREATE UNIQUE INDEX "MY_SCHEMA"."PK_JOBS"
	ON "MY_SCHEMA"."JOBS" ( -- 새 테이블4
		"job_ID" ASC -- 새 컬럼
	);

-- 새 테이블4
ALTER TABLE "MY_SCHEMA"."JOBS"
	ADD
		CONSTRAINT "PK_JOBS" -- 새 테이블4 기본키
		PRIMARY KEY (
			"job_ID" -- 새 컬럼
		);

-- 새 테이블4
COMMENT ON TABLE "MY_SCHEMA"."JOBS" IS '새 테이블4';

-- 새 컬럼
COMMENT ON COLUMN "MY_SCHEMA"."JOBS"."job_ID" IS '새 컬럼';

-- 새 컬럼2
COMMENT ON COLUMN "MY_SCHEMA"."JOBS"."job_Title" IS '새 컬럼2';

-- 새 컬럼3
COMMENT ON COLUMN "MY_SCHEMA"."JOBS"."min_Salary" IS '새 컬럼3';

-- 새 컬럼4
COMMENT ON COLUMN "MY_SCHEMA"."JOBS"."max_Salary" IS '새 컬럼4';

-- 새 테이블4 기본키
COMMENT ON INDEX "MY_SCHEMA"."PK_JOBS" IS '새 테이블4 기본키';

-- 새 테이블4 기본키
COMMENT ON CONSTRAINT "MY_SCHEMA"."JOBS"."PK_JOBS" IS '새 테이블4 기본키';

-- 새 테이블5
CREATE TABLE "MY_SCHEMA"."JOB_HISTORY" (
	"employee_ID"   NUMBER   NOT NULL, -- 새 컬럼6
	"start_Date"    DATE     NOT NULL, -- 새 컬럼2
	"end_Date"      DATE     NOT NULL, -- 새 컬럼3
	"job_ID"        VARCHAR2 NOT NULL, -- 새 컬럼4
	"department_ID" NUMBER   NULL      -- 새 컬럼5
);

-- 새 테이블5 기본키
CREATE UNIQUE INDEX "MY_SCHEMA"."PK_JOB_HISTORY"
	ON "MY_SCHEMA"."JOB_HISTORY" ( -- 새 테이블5
		"employee_ID" ASC, -- 새 컬럼6
		"start_Date"  ASC  -- 새 컬럼2
	);

-- 새 테이블5
ALTER TABLE "MY_SCHEMA"."JOB_HISTORY"
	ADD
		CONSTRAINT "PK_JOB_HISTORY" -- 새 테이블5 기본키
		PRIMARY KEY (
			"employee_ID", -- 새 컬럼6
			"start_Date"   -- 새 컬럼2
		);

-- 새 테이블5
COMMENT ON TABLE "MY_SCHEMA"."JOB_HISTORY" IS '새 테이블5';

-- 새 컬럼6
COMMENT ON COLUMN "MY_SCHEMA"."JOB_HISTORY"."employee_ID" IS '새 컬럼6';

-- 새 컬럼2
COMMENT ON COLUMN "MY_SCHEMA"."JOB_HISTORY"."start_Date" IS '새 컬럼2';

-- 새 컬럼3
COMMENT ON COLUMN "MY_SCHEMA"."JOB_HISTORY"."end_Date" IS '새 컬럼3';

-- 새 컬럼4
COMMENT ON COLUMN "MY_SCHEMA"."JOB_HISTORY"."job_ID" IS '새 컬럼4';

-- 새 컬럼5
COMMENT ON COLUMN "MY_SCHEMA"."JOB_HISTORY"."department_ID" IS '새 컬럼5';

-- 새 테이블5 기본키
COMMENT ON INDEX "MY_SCHEMA"."PK_JOB_HISTORY" IS '새 테이블5 기본키';

-- 새 테이블5 기본키
COMMENT ON CONSTRAINT "MY_SCHEMA"."JOB_HISTORY"."PK_JOB_HISTORY" IS '새 테이블5 기본키';

-- 새 테이블6
CREATE TABLE "MY_SCHEMA"."LOCATIONS" (
	"location_ID"    NUMBER             NOT NULL, -- 새 컬럼7
	"street_Address" VARCHAR2           NULL,     -- 새 컬럼2
	"postal_Code"    VARCHAR2           NULL,     -- 새 컬럼3
	"city"           VARCHAR2           NOT NULL, -- 새 컬럼4
	"state_Province" VARCHAR2           NULL,     -- 새 컬럼5
	"country_ID"     <데이터 타입 없음> NULL      -- 새 컬럼6
);

-- 새 테이블6 기본키
CREATE UNIQUE INDEX "MY_SCHEMA"."PK_LOCATIONS"
	ON "MY_SCHEMA"."LOCATIONS" ( -- 새 테이블6
		"location_ID" ASC -- 새 컬럼7
	);

-- 새 테이블6
ALTER TABLE "MY_SCHEMA"."LOCATIONS"
	ADD
		CONSTRAINT "PK_LOCATIONS" -- 새 테이블6 기본키
		PRIMARY KEY (
			"location_ID" -- 새 컬럼7
		);

-- 새 테이블6
COMMENT ON TABLE "MY_SCHEMA"."LOCATIONS" IS '새 테이블6';

-- 새 컬럼7
COMMENT ON COLUMN "MY_SCHEMA"."LOCATIONS"."location_ID" IS '새 컬럼7';

-- 새 컬럼2
COMMENT ON COLUMN "MY_SCHEMA"."LOCATIONS"."street_Address" IS '새 컬럼2';

-- 새 컬럼3
COMMENT ON COLUMN "MY_SCHEMA"."LOCATIONS"."postal_Code" IS '새 컬럼3';

-- 새 컬럼4
COMMENT ON COLUMN "MY_SCHEMA"."LOCATIONS"."city" IS '새 컬럼4';

-- 새 컬럼5
COMMENT ON COLUMN "MY_SCHEMA"."LOCATIONS"."state_Province" IS '새 컬럼5';

-- 새 컬럼6
COMMENT ON COLUMN "MY_SCHEMA"."LOCATIONS"."country_ID" IS '새 컬럼6';

-- 새 테이블6 기본키
COMMENT ON INDEX "MY_SCHEMA"."PK_LOCATIONS" IS '새 테이블6 기본키';

-- 새 테이블6 기본키
COMMENT ON CONSTRAINT "MY_SCHEMA"."LOCATIONS"."PK_LOCATIONS" IS '새 테이블6 기본키';

-- 새 테이블7
CREATE TABLE "MY_SCHEMA"."REGIONS" (
	"region_ID"   NUMBER   NOT NULL, -- 새 컬럼
	"region_Name" VARCHAR2 NULL      -- 새 컬럼2
);

-- 새 테이블7 기본키
CREATE UNIQUE INDEX "MY_SCHEMA"."PK_REGIONS"
	ON "MY_SCHEMA"."REGIONS" ( -- 새 테이블7
		"region_ID" ASC -- 새 컬럼
	);

-- 새 테이블7
ALTER TABLE "MY_SCHEMA"."REGIONS"
	ADD
		CONSTRAINT "PK_REGIONS" -- 새 테이블7 기본키
		PRIMARY KEY (
			"region_ID" -- 새 컬럼
		);

-- 새 테이블7
COMMENT ON TABLE "MY_SCHEMA"."REGIONS" IS '새 테이블7';

-- 새 컬럼
COMMENT ON COLUMN "MY_SCHEMA"."REGIONS"."region_ID" IS '새 컬럼';

-- 새 컬럼2
COMMENT ON COLUMN "MY_SCHEMA"."REGIONS"."region_Name" IS '새 컬럼2';

-- 새 테이블7 기본키
COMMENT ON INDEX "MY_SCHEMA"."PK_REGIONS" IS '새 테이블7 기본키';

-- 새 테이블7 기본키
COMMENT ON CONSTRAINT "MY_SCHEMA"."REGIONS"."PK_REGIONS" IS '새 테이블7 기본키';

-- 새 테이블
ALTER TABLE "MY_SCHEMA"."EMPLOYEES"
	ADD
		CONSTRAINT "FK_JOBS_TO_EMPLOYEES" -- 새 테이블4 -> 새 테이블
		FOREIGN KEY (
			"job_ID" -- 새 컬럼7
		)
		REFERENCES "MY_SCHEMA"."JOBS" ( -- 새 테이블4
			"job_ID" -- 새 컬럼
		);

-- 새 테이블4 -> 새 테이블
COMMENT ON CONSTRAINT "MY_SCHEMA"."EMPLOYEES"."FK_JOBS_TO_EMPLOYEES" IS '새 테이블4 -> 새 테이블';

-- 새 테이블
ALTER TABLE "MY_SCHEMA"."EMPLOYEES"
	ADD
		CONSTRAINT "FK_EMPLOYEES_TO_EMPLOYEES" -- 새 테이블 -> 새 테이블
		FOREIGN KEY (
			"manager_ID" -- 새 컬럼12
		)
		REFERENCES "MY_SCHEMA"."EMPLOYEES" ( -- 새 테이블
			"employee_ID" -- 새 컬럼
		);

-- 새 테이블 -> 새 테이블
COMMENT ON CONSTRAINT "MY_SCHEMA"."EMPLOYEES"."FK_EMPLOYEES_TO_EMPLOYEES" IS '새 테이블 -> 새 테이블';

-- 새 테이블
ALTER TABLE "MY_SCHEMA"."EMPLOYEES"
	ADD
		CONSTRAINT "FK_DEPARTMENTS_TO_EMPLOYEES" -- 새 테이블3 -> 새 테이블
		FOREIGN KEY (
			"department_ID" -- 새 컬럼11
		)
		REFERENCES "MY_SCHEMA"."DEPARTMENTS" ( -- 새 테이블3
			"department_ID" -- 새 컬럼
		);

-- 새 테이블3 -> 새 테이블
COMMENT ON CONSTRAINT "MY_SCHEMA"."EMPLOYEES"."FK_DEPARTMENTS_TO_EMPLOYEES" IS '새 테이블3 -> 새 테이블';

-- 새 테이블2
ALTER TABLE "MY_SCHEMA"."COUNTRIES"
	ADD
		CONSTRAINT "FK_REGIONS_TO_COUNTRIES" -- 새 테이블7 -> 새 테이블2
		FOREIGN KEY (
			"region_ID" -- 새 컬럼3
		)
		REFERENCES "MY_SCHEMA"."REGIONS" ( -- 새 테이블7
			"region_ID" -- 새 컬럼
		);

-- 새 테이블7 -> 새 테이블2
COMMENT ON CONSTRAINT "MY_SCHEMA"."COUNTRIES"."FK_REGIONS_TO_COUNTRIES" IS '새 테이블7 -> 새 테이블2';

-- 새 테이블3
ALTER TABLE "MY_SCHEMA"."DEPARTMENTS"
	ADD
		CONSTRAINT "FK_EMPLOYEES_TO_DEPARTMENTS" -- 새 테이블 -> 새 테이블3
		FOREIGN KEY (
			"manager_ID" -- 새 컬럼5
		)
		REFERENCES "MY_SCHEMA"."EMPLOYEES" ( -- 새 테이블
			"employee_ID" -- 새 컬럼
		);

-- 새 테이블 -> 새 테이블3
COMMENT ON CONSTRAINT "MY_SCHEMA"."DEPARTMENTS"."FK_EMPLOYEES_TO_DEPARTMENTS" IS '새 테이블 -> 새 테이블3';

-- 새 테이블3
ALTER TABLE "MY_SCHEMA"."DEPARTMENTS"
	ADD
		CONSTRAINT "FK_LOCATIONS_TO_DEPARTMENTS" -- 새 테이블6 -> 새 테이블3
		FOREIGN KEY (
			"location_ID" -- 새 컬럼4
		)
		REFERENCES "MY_SCHEMA"."LOCATIONS" ( -- 새 테이블6
			"location_ID" -- 새 컬럼7
		);

-- 새 테이블6 -> 새 테이블3
COMMENT ON CONSTRAINT "MY_SCHEMA"."DEPARTMENTS"."FK_LOCATIONS_TO_DEPARTMENTS" IS '새 테이블6 -> 새 테이블3';

-- 새 테이블5
ALTER TABLE "MY_SCHEMA"."JOB_HISTORY"
	ADD
		CONSTRAINT "FK_JOBS_TO_JOB_HISTORY" -- 새 테이블4 -> 새 테이블5
		FOREIGN KEY (
			"job_ID" -- 새 컬럼4
		)
		REFERENCES "MY_SCHEMA"."JOBS" ( -- 새 테이블4
			"job_ID" -- 새 컬럼
		);

-- 새 테이블4 -> 새 테이블5
COMMENT ON CONSTRAINT "MY_SCHEMA"."JOB_HISTORY"."FK_JOBS_TO_JOB_HISTORY" IS '새 테이블4 -> 새 테이블5';

-- 새 테이블5
ALTER TABLE "MY_SCHEMA"."JOB_HISTORY"
	ADD
		CONSTRAINT "FK_DEPARTMENTS_TO_JOB_HISTORY" -- 새 테이블3 -> 새 테이블5
		FOREIGN KEY (
			"department_ID" -- 새 컬럼5
		)
		REFERENCES "MY_SCHEMA"."DEPARTMENTS" ( -- 새 테이블3
			"department_ID" -- 새 컬럼
		);

-- 새 테이블3 -> 새 테이블5
COMMENT ON CONSTRAINT "MY_SCHEMA"."JOB_HISTORY"."FK_DEPARTMENTS_TO_JOB_HISTORY" IS '새 테이블3 -> 새 테이블5';

-- 새 테이블5
ALTER TABLE "MY_SCHEMA"."JOB_HISTORY"
	ADD
		CONSTRAINT "FK_EMPLOYEES_TO_JOB_HISTORY" -- 새 테이블 -> 새 테이블5
		FOREIGN KEY (
			"employee_ID" -- 새 컬럼6
		)
		REFERENCES "MY_SCHEMA"."EMPLOYEES" ( -- 새 테이블
			"employee_ID" -- 새 컬럼
		);

-- 새 테이블 -> 새 테이블5
COMMENT ON CONSTRAINT "MY_SCHEMA"."JOB_HISTORY"."FK_EMPLOYEES_TO_JOB_HISTORY" IS '새 테이블 -> 새 테이블5';

-- 새 테이블6
ALTER TABLE "MY_SCHEMA"."LOCATIONS"
	ADD
		CONSTRAINT "FK_COUNTRIES_TO_LOCATIONS" -- 새 테이블2 -> 새 테이블6
		FOREIGN KEY (
			"country_ID" -- 새 컬럼6
		)
		REFERENCES "MY_SCHEMA"."COUNTRIES" ( -- 새 테이블2
			"country_ID" -- 새 컬럼
		);

-- 새 테이블2 -> 새 테이블6
COMMENT ON CONSTRAINT "MY_SCHEMA"."LOCATIONS"."FK_COUNTRIES_TO_LOCATIONS" IS '새 테이블2 -> 새 테이블6';

-- 새 테이블6
ALTER TABLE "MY_SCHEMA"."LOCATIONS"
	ADD
		CONSTRAINT "FK_REGIONS_TO_LOCATIONS" -- 새 테이블7 -> 새 테이블6
		FOREIGN KEY (
			"location_ID" -- 새 컬럼7
		)
		REFERENCES "MY_SCHEMA"."REGIONS" ( -- 새 테이블7
			"region_ID" -- 새 컬럼
		);

-- 새 테이블7 -> 새 테이블6
COMMENT ON CONSTRAINT "MY_SCHEMA"."LOCATIONS"."FK_REGIONS_TO_LOCATIONS" IS '새 테이블7 -> 새 테이블6';