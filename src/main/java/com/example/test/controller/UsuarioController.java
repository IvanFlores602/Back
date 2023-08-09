package com.example.test.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.test.entity.Archivo;
import com.example.test.entity.RespuestaLogin;
import com.example.test.entity.Tesp;
import com.example.test.entity.Test;
import com.example.test.entity.Usuario;
import com.example.test.service.ArchivoService;
import com.example.test.service.TespService;
import com.example.test.service.TestService;
import com.example.test.service.UsuarioService;



@CrossOrigin
@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
	@Autowired
	private final UsuarioService usuarioService;
	private final TespService tespService;
	private final TestService testService;
	private final ArchivoService archivoService;
	
	public UsuarioController(UsuarioService usuarioService, TespService tespService, TestService testService, ArchivoService archivoService) {
        this.usuarioService = usuarioService;
        this.tespService = tespService;
        this.testService = testService;
        this.archivoService = archivoService;
    }

    @CrossOrigin
    @GetMapping
    public List<Usuario> obtenerUsuarios() {
        return usuarioService.obtenerTodosLosUsuarios();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Usuario> obtenerUsuarioPorId(@PathVariable Long id) {
        Optional<Usuario> optionalUsuario = usuarioService.obtenerUsuarioPorId(id);
        return optionalUsuario.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }
    
    @CrossOrigin
    @PostMapping
    public ResponseEntity<Usuario> crearUsuario(@RequestBody Usuario usuario) {
        Usuario nuevoUsuario = usuarioService.crearUsuario(usuario);
        return ResponseEntity.status(HttpStatus.CREATED).body(nuevoUsuario);
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<Usuario> actualizarUsuario(@PathVariable Long id, @RequestBody Usuario usuarioActualizado) {
        Optional<Usuario> optionalUsuario = usuarioService.obtenerUsuarioPorId(id);
        if (optionalUsuario.isPresent()) {
            Usuario usuario = optionalUsuario.get();
            
            usuario.setNombre(usuarioActualizado.getNombre());
            usuario.setApellido(usuarioActualizado.getApellido());
            usuario.setCorreoElectronico(usuarioActualizado.getCorreoElectronico());
            usuario.setContrasena(usuarioActualizado.getContrasena());
            usuario.setGenero(usuarioActualizado.getGenero());
            usuario.setEdad(usuarioActualizado.getEdad());
            usuario.setTelefono(usuarioActualizado.getTelefono());
            usuario.setOcupacion(usuarioActualizado.getOcupacion());

            Usuario usuarioActualizadoDB = usuarioService.actualizarUsuario(usuario);
            return ResponseEntity.ok(usuarioActualizadoDB);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarUsuario(@PathVariable Long id) {
        Optional<Usuario> optionalUsuario = usuarioService.obtenerUsuarioPorId(id);
        if (optionalUsuario.isPresent()) {
            usuarioService.eliminarUsuario(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    
    }
    
    @CrossOrigin
    @PostMapping("/login")
    public ResponseEntity<RespuestaLogin> verificarCredenciales(@RequestBody Usuario usuario) {
        boolean credencialesValidas = usuarioService.verificarCredenciales(usuario.getCorreoElectronico(), usuario.getContrasena());

        if (credencialesValidas) {
            Usuario usuarioIniciado = usuarioService.findByEmail(usuario.getCorreoElectronico());
            RespuestaLogin respuesta = new RespuestaLogin(true, usuarioIniciado);
            return ResponseEntity.ok(respuesta); // Credenciales válidas
        } else {
            RespuestaLogin respuesta = new RespuestaLogin(false, null);
            return ResponseEntity.ok(respuesta); // Credenciales inválidas
        }
    }
    //Guarda los test Psicometricos
    @PostMapping("/{usuarioId}/tesp")
    public ResponseEntity<Void> asignarTespAUsuario(@PathVariable Long usuarioId, @RequestBody Tesp tesp) {
        Usuario usuario = usuarioService.obtenerUsuarioPorId(usuarioId).orElse(null);
        if (usuario != null) {
            tesp.setUsuario(usuario);
            tespService.save(tesp);
            return ResponseEntity.status(HttpStatus.CREATED).build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/{usuarioId}/tesp")
    public ResponseEntity<List<Tesp>> obtenerTespDeUsuario(@PathVariable Long usuarioId) {
        Usuario usuario = usuarioService.obtenerUsuarioPorId(usuarioId).orElse(null);
        if (usuario != null) {
            List<Tesp> tespList = usuario.getTespList();
            return ResponseEntity.ok(tespList);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{usuarioId}/tesp/{tespId}")
    public ResponseEntity<Void> eliminarTespDeUsuario(@PathVariable Long usuarioId, @PathVariable Long tespId) {
        Usuario usuario = usuarioService.obtenerUsuarioPorId(usuarioId).orElse(null);
        if (usuario != null) {
            Tesp tesp = tespService.getById(tespId);
            if (tesp != null && tesp.getUsuario() != null && tesp.getUsuario().getIdUsuario().equals(usuarioId)) {
                tespService.delete(tespId);
                return ResponseEntity.noContent().build();
            } else {
                return ResponseEntity.notFound().build();
            }
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    //Gurda los test Tecnicos Diseñador, Programador y Tecnico
    @PostMapping("/{usuarioId}/tests")
    public ResponseEntity<Void> asignarTestAUsuario(@PathVariable Long usuarioId, @RequestBody Test test) {
        Optional<Usuario> optionalUsuario = usuarioService.obtenerUsuarioPorId(usuarioId);
        if (optionalUsuario.isPresent()) {
            Usuario usuario = optionalUsuario.get();
            usuario.addTest(test);
            usuarioService.actualizarUsuario(usuario);
            return ResponseEntity.status(HttpStatus.CREATED).build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/{usuarioId}/tests")
    public ResponseEntity<List<Test>> obtenerTestsDeUsuario(@PathVariable Long usuarioId) {
        Optional<Usuario> optionalUsuario = usuarioService.obtenerUsuarioPorId(usuarioId);
        if (optionalUsuario.isPresent()) {
            Usuario usuario = optionalUsuario.get();
            List<Test> tests = usuario.getTestList();
            return ResponseEntity.ok(tests);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{usuarioId}/test/{testId}")
    public ResponseEntity<Void> eliminarTestDeUsuario(@PathVariable Long usuarioId, @PathVariable Long testId) {
        Usuario usuario = usuarioService.obtenerUsuarioPorId(usuarioId).orElse(null);
        if (usuario != null) {
            Test test = testService.obtenerTestPorId(testId).orElse(null);
            if (test != null && test.getUsuario() != null && test.getUsuario().getIdUsuario().equals(usuarioId)) {
                usuario.removeTest(test);
                testService.eliminarTest(testId);
                return ResponseEntity.noContent().build();
            }
        }
        return ResponseEntity.notFound().build();
    }
    
    //METODO PARA GUARDAR ARCHIVOS CON EL USUARIO
    @PostMapping("/{usuarioId}/archivos")
    public ResponseEntity<Archivo> subirArchivo(@PathVariable Long usuarioId, @RequestParam("archivo") MultipartFile archivo) {
        Usuario usuario = usuarioService.obtenerUsuarioPorId(usuarioId).orElse(null);
        if (usuario != null) {
            try {
                byte[] contenido = archivo.getBytes();
                Archivo nuevoArchivo = archivoService.subirArchivo(contenido);
                usuario.getArchivos().add(nuevoArchivo);
                usuarioService.actualizarUsuario(usuario);
                return ResponseEntity.status(HttpStatus.CREATED).body(nuevoArchivo);
            } catch (Exception e) {
                e.printStackTrace();
                throw new RuntimeException("Error al subir el archivo");
            }
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    
    @GetMapping("/{usuarioId}/archivos")
    public ResponseEntity<List<Archivo>> obtenerArchivosDeUsuario(@PathVariable Long usuarioId) {
        Usuario usuario = usuarioService.obtenerUsuarioPorId(usuarioId).orElse(null);
        if (usuario != null) {
            List<Archivo> archivos = usuario.getArchivos(); // Implementa este método en el servicio para obtener los archivos del usuario
            return ResponseEntity.ok(archivos);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    @GetMapping("/{usuarioId}/archivos/{id}")
    public ResponseEntity<Archivo> obtenerArchivo(@PathVariable Long usuarioId, @PathVariable Long id) {
        Usuario usuario = usuarioService.obtenerUsuarioPorId(usuarioId).orElse(null);
        if (usuario != null) {
            Optional<Archivo> optionalArchivo = usuario.getArchivos().stream().filter(a -> a.getId().equals(id)).findFirst();
            return optionalArchivo.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
