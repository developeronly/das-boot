package com.example;

import com.example.model.Shipwreck;
import com.example.repository.ShipwreckRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThanOrEqualTo;
import static org.hamcrest.Matchers.is;

//TODO Add other test cases for ShipwreckRepository.
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class ShipwreckRepositoryIntegrationTest {

    @Autowired
    ShipwreckRepository shipwreckRepository;

    @Test
    public void findAll() {
        List<Shipwreck> shipwrecks = shipwreckRepository.findAll();
        assertThat(shipwrecks.size(), is(greaterThanOrEqualTo(0)));
    }
}
