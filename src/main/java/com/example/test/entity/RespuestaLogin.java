package com.example.test.entity;

public class RespuestaLogin {
	private boolean status;
    private Usuario usuario;
    

    public RespuestaLogin(boolean status, Usuario usuario) {
        this.setStatus(status);
        this.usuario = usuario;
    }
    

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }


	public boolean isStatus() {
		return status;
	}


	public void setStatus(boolean status) {
		this.status = status;
	}
}

