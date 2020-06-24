package com.layered.demo.architecture;

import com.tngtech.archunit.lang.ArchRule;
import com.tngtech.archunit.lang.syntax.ArchRuleDefinition;
import com.tngtech.archunit.library.dependencies.SliceRule;
import com.tngtech.archunit.library.dependencies.SlicesRuleDefinition;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SlicesBaseArchitecture extends BaseArchitecture {

    @Test
    @DisplayName("services should only be accessed by controllers")
    void servicesRules() {
        ArchRule rule =
                ArchRuleDefinition.classes().that().haveSimpleNameEndingWith("Service")
                        .should().onlyBeAccessed().byClassesThat().haveSimpleNameEndingWith("Controller");
        rule.check(classes);
    }

    @Test
    @DisplayName("mappers should only be accessed by services")
    void mapperRules() {
        ArchRule rule =
                ArchRuleDefinition.classes().that().haveSimpleNameEndingWith("Mapper")
                        .should().onlyBeAccessed().byClassesThat().haveSimpleNameEndingWith("Service");
        rule.check(classes);
    }

    @Test
    @DisplayName("repositories should only be accessed by services")
    void persistenceRules() {
        ArchRule rule =
                ArchRuleDefinition.classes().that().haveSimpleNameEndingWith("Repository")
                .should().onlyBeAccessed().byClassesThat().haveSimpleNameEndingWith("Service");
        rule.check(classes);
    }

}
