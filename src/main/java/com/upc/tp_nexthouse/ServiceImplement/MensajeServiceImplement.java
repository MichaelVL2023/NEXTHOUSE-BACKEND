package com.upc.tp_nexthouse.ServiceImplement;

import com.upc.tp_nexthouse.Entities.Mensaje;
import com.upc.tp_nexthouse.repositoy.MensajeRepository;
import com.upc.tp_nexthouse.serviceInterface.MensajeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class MensajeServiceImplement implements MensajeService {
    @Autowired
    private MensajeRepository mensajeRepository;
    @Transactional
    @Override
    public Mensaje savedMensaje(Mensaje mensaje) {
        return mensajeRepository.save(mensaje);
    }

    @Override
    public void eliminarMensaje(Long id) {
        if(mensajeRepository.existsById(id)) {
            mensajeRepository.deleteById(id);
        }
    }

    @Override
    public Mensaje modificarMensaje(Mensaje mensaje) {
        if(mensajeRepository.existsById(mensaje.getIdMensaje())){
            return mensajeRepository.save(mensaje);
        }
        return null;
    }

    @Override
    public List<Mensaje> list() {
        return mensajeRepository.findAll();
    }
}
