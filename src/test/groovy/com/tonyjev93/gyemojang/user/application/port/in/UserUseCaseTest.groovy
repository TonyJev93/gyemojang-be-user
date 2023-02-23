package com.tonyjev93.gyemojang.user.application.port.in


import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.transaction.annotation.Transactional
import spock.lang.Specification

@SpringBootTest
@Transactional
class UserUseCaseTest extends Specification {

    @Autowired
    UserUseCase useCase

    void setup() {
        useCase.create("test", "전계원")
    }

    def "GetById"() {
        when:
        def user = useCase.getById("test")

        then:
        noExceptionThrown()

        user.id == "test"
        user.name == "전계원"
    }
}
