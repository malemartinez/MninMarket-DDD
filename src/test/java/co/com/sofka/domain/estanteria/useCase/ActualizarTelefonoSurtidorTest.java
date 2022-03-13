package co.com.sofka.domain.estanteria.useCase;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;

import co.com.sofka.domain.estanteria.comandos.actualizarTelefonoSurtidor;
import co.com.sofka.domain.estanteria.eventos.EstanteriaCreada;
import co.com.sofka.domain.estanteria.eventos.SurtidorCreado;
import co.com.sofka.domain.estanteria.eventos.TelefonoSurtidorActualizado;
import co.com.sofka.domain.estanteria.valor.EstanteriaId;
import co.com.sofka.domain.estanteria.valor.Nombre;
import co.com.sofka.domain.estanteria.valor.SurtidorId;
import co.com.sofka.domain.estanteria.valor.Telefono;
import co.com.sofka.domain.generic.DomainEvent;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;


@ExtendWith(MockitoExtension.class)
class ActualizarTelefonoSurtidorTest {

    @Mock
    private DomainEventRepository repository;

    @Test
    void actualizarTelefonoSurtidor(){
        //arrange
        EstanteriaId estanteriaId = EstanteriaId.of("xxxx");
         Telefono telefono=new Telefono("124578");

        var command = new actualizarTelefonoSurtidor(estanteriaId, telefono);
        var usecase = new ActualizarTelefonoSurtidor();

        Mockito.when(repository.getEventsBy("xxxx")).thenReturn(history());
        usecase.addRepository(repository);

        //act
        var events = UseCaseHandler.getInstance()
                .setIdentifyExecutor(estanteriaId.value())
                .syncExecutor(usecase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        //assert
        var event = (TelefonoSurtidorActualizado) events.get(events.size() - 1);
        
        Assertions.assertEquals("sofka.estanteria.TelefonoSurtidorActualizado", event.type);
        Assertions.assertEquals("124578", event.telefono().value() );
        Mockito.verify(repository).getEventsBy("xxxx");

    }

    private List<DomainEvent> history() {
        return List.of(
            new SurtidorCreado(SurtidorId.of("ggg"),new Nombre("ggg"), new Telefono("12345"))
        );
    }

}