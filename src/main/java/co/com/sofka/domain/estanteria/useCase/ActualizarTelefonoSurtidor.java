package co.com.sofka.domain.estanteria.useCase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.domain.estanteria.Estanteria;
import co.com.sofka.domain.estanteria.comandos.actualizarTelefonoSurtidor;


public class ActualizarTelefonoSurtidor extends UseCase<RequestCommand<actualizarTelefonoSurtidor>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<actualizarTelefonoSurtidor> input) {
        var command = input.getCommand();

        var estanteria = Estanteria.from(command.getId(),retrieveEvents(command.getId().value()));

        estanteria.actualizarTelefonoSurtidor(command.getTelefono());
        emit().onResponse(new ResponseEvents(estanteria.getUncommittedChanges()));
    }
}
