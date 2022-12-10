package tn.esprit.spring;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.times;

import org.junit.Test;

import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import tn.esprit.spring.entities.Voyage;
import tn.esprit.spring.repository.VoyageRepository;
import tn.esprit.spring.services.VoyageServiceImpl;

@SpringBootTest
@RunWith(MockitoJUnitRunner.class)
public class VoyageTest {

    @Mock
    VoyageRepository voyageRepository;
    @InjectMocks
    VoyageServiceImpl voyageService;

    Voyage v1 = new Voyage( 1, null, null, null, null, 13, 14, null, null);
    Voyage v2 = new Voyage( 2, null, null, null, null, 15, 17, null, null);

    List<Voyage> voyageList = new ArrayList<Voyage>() {
        {
            add(v1);
            add(v2);
        }
    };

    @Test
    public void testRetrieveVoyage() {

        Mockito.when(voyageRepository.findById(Mockito.anyLong())).thenReturn(Optional.of(v1));
        Voyage voyage1 = voyageService.recupererVoyageParId(1);
        assertNotNull(voyage1);
        System.out.println("1");
        assertEquals(voyage1.getIdVoyage(),1);
    }
}
