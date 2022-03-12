package co.com.sofka.domain.carrito.UseCases;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.carrito.comandos.actualizarNombreCliente;
import co.com.sofka.domain.carrito.eventos.CarritoCreado;
import co.com.sofka.domain.carrito.eventos.NombreClienteActualizado;
import co.com.sofka.domain.carrito.eventos.ProductoAgregago;
import co.com.sofka.domain.carrito.valor.*;
import co.com.sofka.domain.generic.DomainEvent;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class ActualizarNombreClienteUseCaseTest {

   // @Mock
   // private DomainEventRepository repository;
   //
   // @Test
   // void actualizarNombreCliente(){
   //     //arrange
   //     CarritoID carritoID = CarritoID.of("xxxx");
   //     ClienteID clienteID = ClienteID.of("hgsvfrcgh");
   //     Nombre nombre = new Nombre("Aleja");
   //
   //     var command = new actualizarNombreCliente(carritoID,clienteID,nombre);
   //     var usecase = new ActualizarNombreClienteUseCase();
   //
   //     Mockito.when(repository.getEventsBy("xxxx")).thenReturn(history());
   //     usecase.addRepository(repository);
   //     //act
   //
   //     var events = UseCaseHandler.getInstance()
   //             .setIdentifyExecutor(carritoID.value())
   //             .syncExecutor(usecase, new RequestCommand<>(command))
   //             .orElseThrow()
   //             .getDomainEvents();
   //     //assert
   //
   //     var event = (NombreClienteActualizado) events.get(0);
   //
   //
   //     Assertions.assertEquals("sofka.Carrito.NombreClienteActualizado", event.type);
   //     Assertions.assertEquals("Aleja", event.getNombre().value() );
   //
   //
   // }
   //
   // private List<DomainEvent> history() {
   //     return List.of(
   //             new CarritoCreado(CarritoID.of("xxxx"),null),
   //             new ProductoAgregago(ProductoID.of("ffffff"),null,null,null),
   //             new NombreClienteActualizado(ClienteID.of("ghjdh"), new Nombre("Jose"))
   //     );    }
}