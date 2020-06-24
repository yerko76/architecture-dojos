package com.layered.demo.architecture;

import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.core.importer.ClassFileImporter;
import com.tngtech.archunit.core.importer.ImportOption;
import org.junit.jupiter.api.BeforeAll;

public abstract class BaseArchitecture {
    protected static final String CONTROLLER_PACKAGES = "com.layered.demo.application";
    protected static final String SERVICE_PACKAGES = "com.layered.demo.application";
    protected static final String REPOSITORY_PACKAGES = "com.layered.demo.application";


    protected static JavaClasses classes;

    @BeforeAll
    public static void setUp() {
        classes =
                new ClassFileImporter()
                        .withImportOption(ImportOption.Predefined.DO_NOT_INCLUDE_TESTS)
                        .withImportOption(ImportOption.Predefined.DO_NOT_INCLUDE_ARCHIVES)
                        .importPackages("com.layered.demo.application");
    }
}
