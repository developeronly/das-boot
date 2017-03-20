package com.example;

import com.example.controller.ShipwreckController;
import com.example.model.Shipwreck;
import com.example.repository.ShipwreckRepository;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

//TODO: Add other test cases for ShipwreckController.
public class ShipwreckControllerTest {

    @InjectMocks
    private ShipwreckController shipwreckController;

    @Mock
    private ShipwreckRepository shipwreckRepository;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void get() {
        Shipwreck shipwreckMock = new Shipwreck();
        shipwreckMock.setId(1L);
        when(shipwreckRepository.findOne(1L)).thenReturn(shipwreckMock);

        Shipwreck shipwreck = shipwreckController.get(1L);

        Mockito.verify(shipwreckRepository).findOne(1L); //Mockito
        assertEquals(1L, shipwreck.getId().longValue()); //JUnit
        assertThat(shipwreck.getId(), is(1L));  //Hamcrest
    }

}
