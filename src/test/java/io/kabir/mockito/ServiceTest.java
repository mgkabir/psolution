package io.kabir.mockito;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class ServiceTest {

    @Mock
    Repository repository;
    @InjectMocks
    Service service = null;


    @Test
    void getLongNames() {
        Mockito.when(repository.getAllNames()).thenReturn(Arrays.asList("Sylvester","John","Van Damn","Joe"));
        /* actual method getAllNames() of repository is not being called for this test.
        We are testing getLongNames() method's logic here. For this purpose mocking the calls to repository */
        assertEquals(2,service.getLongNames().size(),"There should be only 2 Long names");
    }

    @Test
    void getShortNames() {
        Mockito.when(repository.getAllNames()).thenReturn(Arrays.asList("One","Two","Three3"));
        /* actual method getAllNames() of repository is not being called for this test.
        We are testing getShortNames() method's logic here */
        assertEquals(2,service.getShortNames().size());
    }
}