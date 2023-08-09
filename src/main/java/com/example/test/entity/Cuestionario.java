package com.example.test.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "Cuestionario")
public class Cuestionario {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idCuestionario")
    private Long idCuestionario;
	@Column(name = "titulo", nullable = false)
    private String titulo;
	
    @Column(name = "pregunta1", nullable = false)
    private String pregunta1;
    @Column(name = "respuesta1", nullable = false)
    private String respuesta11;
    @Column(name = "respuesta12", nullable = false)
    private String respuesta12;
    @Column(name = "respuesta13", nullable = false)
    private String respuesta13;
    @Column(name = "respuesta14", nullable = false)
    private String respuesta14;
    
    @Column(name = "pregunta2", nullable = false)
    private String pregunta2;
    @Column(name = "respuesta21", nullable = false)
    private String respuesta21;
    @Column(name = "respuesta22", nullable = false)
    private String respuesta22;
    @Column(name = "respuesta23", nullable = false)
    private String respuesta23;
    @Column(name = "respuesta24", nullable = false)
    private String respuesta24;
    
    @Column(name = "pregunta3", nullable = false)
    private String pregunta3;
    @Column(name = "respuesta31", nullable = false)
    private String respuesta31;
    @Column(name = "respuesta32", nullable = false)
    private String respuesta32;
    @Column(name = "respuesta33", nullable = false)
    private String respuesta33;
    @Column(name = "respuesta34", nullable = false)
    private String respuesta34;
    
    @Column(name = "pregunta4", nullable = false)
    private String pregunta4;
    @Column(name = "respuesta41", nullable = false)
    private String respuesta41;
    @Column(name = "respuesta42", nullable = false)
    private String respuesta42;
    @Column(name = "respuesta43", nullable = false)
    private String respuesta43;
    @Column(name = "respuesta44", nullable = false)
    private String respuesta44;
    
    @Column(name = "pregunta5", nullable = false)
    private String pregunta5;
    @Column(name = "respuesta51", nullable = false)
    private String respuesta51;
    @Column(name = "respuesta52", nullable = false)
    private String respuesta52;
    @Column(name = "respuesta53", nullable = false)
    private String respuesta53;
    @Column(name = "respuesta54", nullable = false)
    private String respuesta54;
    
    
    @Column(name = "pregunta6", nullable = false)
    private String pregunta6;
    @Column(name = "respuesta61", nullable = false)
    private String respuesta61;
    @Column(name = "respuesta62", nullable = false)
    private String respuesta62;
    @Column(name = "respuesta63", nullable = false)
    private String respuesta63;
    @Column(name = "respuesta64", nullable = false)
    private String respuesta64;
    
    @Column(name = "pregunta7", nullable = false)
    private String pregunta7;
    @Column(name = "respuesta71", nullable = false)
    private String respuesta71;
    @Column(name = "respuesta72", nullable = false)
    private String respuesta72;
    @Column(name = "respuesta73", nullable = false)
    private String respuesta73;
    @Column(name = "respuesta74", nullable = false)
    private String respuesta74;
    
    @Column(name = "pregunta8", nullable = false)
    private String pregunta8;
    @Column(name = "respuesta81", nullable = false)
    private String respuesta81;
    @Column(name = "respuesta82", nullable = false)
    private String respuesta82;
    @Column(name = "respuesta83", nullable = false)
    private String respuesta83;
    @Column(name = "respuesta84", nullable = false)
    private String respuesta84;
    
    @Column(name = "pregunta9", nullable = false)
    private String pregunta9;
    @Column(name = "respuesta91", nullable = false)
    private String respuesta91;
    @Column(name = "respuesta92", nullable = false)
    private String respuesta92;
    @Column(name = "respuesta93", nullable = false)
    private String respuesta93;
    @Column(name = "respuesta94", nullable = false)
    private String respuesta94;
    
    @Column(name = "pregunta10", nullable = false)
    private String pregunta10;
    @Column(name = "respuesta101", nullable = false)
    private String respuesta101;
    @Column(name = "respuesta102", nullable = false)
    private String respuesta102;
    @Column(name = "respuesta103", nullable = false)
    private String respuesta103;
    @Column(name = "respuesta104", nullable = false)
    private String respuesta104;
    
	public Cuestionario() {
	}

	public Cuestionario(Long idCuestionario, String titulo, String pregunta1, String respuesta11, String respuesta12,
			String respuesta13, String respuesta14, String pregunta2, String respuesta21, String respuesta22,
			String respuesta23, String respuesta24, String pregunta3, String respuesta31, String respuesta32,
			String respuesta33, String respuesta34, String pregunta4, String respuesta41, String respuesta42,
			String respuesta43, String respuesta44, String pregunta5, String respuesta51, String respuesta52,
			String respuesta53, String respuesta54, String pregunta6, String respuesta61, String respuesta62,
			String respuesta63, String respuesta64, String pregunta7, String respuesta71, String respuesta72,
			String respuesta73, String respuesta74, String pregunta8, String respuesta81, String respuesta82,
			String respuesta83, String respuesta84, String pregunta9, String respuesta91, String respuesta92,
			String respuesta93, String respuesta94, String pregunta10, String respuesta101, String respuesta102,
			String respuesta103, String respuesta104) {
		super();
		this.idCuestionario = idCuestionario;
		this.titulo = titulo;
		this.pregunta1 = pregunta1;
		this.respuesta11 = respuesta11;
		this.respuesta12 = respuesta12;
		this.respuesta13 = respuesta13;
		this.respuesta14 = respuesta14;
		this.pregunta2 = pregunta2;
		this.respuesta21 = respuesta21;
		this.respuesta22 = respuesta22;
		this.respuesta23 = respuesta23;
		this.respuesta24 = respuesta24;
		this.pregunta3 = pregunta3;
		this.respuesta31 = respuesta31;
		this.respuesta32 = respuesta32;
		this.respuesta33 = respuesta33;
		this.respuesta34 = respuesta34;
		this.pregunta4 = pregunta4;
		this.respuesta41 = respuesta41;
		this.respuesta42 = respuesta42;
		this.respuesta43 = respuesta43;
		this.respuesta44 = respuesta44;
		this.pregunta5 = pregunta5;
		this.respuesta51 = respuesta51;
		this.respuesta52 = respuesta52;
		this.respuesta53 = respuesta53;
		this.respuesta54 = respuesta54;
		this.pregunta6 = pregunta6;
		this.respuesta61 = respuesta61;
		this.respuesta62 = respuesta62;
		this.respuesta63 = respuesta63;
		this.respuesta64 = respuesta64;
		this.pregunta7 = pregunta7;
		this.respuesta71 = respuesta71;
		this.respuesta72 = respuesta72;
		this.respuesta73 = respuesta73;
		this.respuesta74 = respuesta74;
		this.pregunta8 = pregunta8;
		this.respuesta81 = respuesta81;
		this.respuesta82 = respuesta82;
		this.respuesta83 = respuesta83;
		this.respuesta84 = respuesta84;
		this.pregunta9 = pregunta9;
		this.respuesta91 = respuesta91;
		this.respuesta92 = respuesta92;
		this.respuesta93 = respuesta93;
		this.respuesta94 = respuesta94;
		this.pregunta10 = pregunta10;
		this.respuesta101 = respuesta101;
		this.respuesta102 = respuesta102;
		this.respuesta103 = respuesta103;
		this.respuesta104 = respuesta104;
	}



	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Long getIdCuestionario() {
		return idCuestionario;
	}

	public void setIdCuestionario(Long idCuestionario) {
		this.idCuestionario = idCuestionario;
	}

	public String getPregunta1() {
		return pregunta1;
	}

	public void setPregunta1(String pregunta1) {
		this.pregunta1 = pregunta1;
	}

	public String getRespuesta11() {
		return respuesta11;
	}

	public void setRespuesta11(String respuesta11) {
		this.respuesta11 = respuesta11;
	}

	public String getRespuesta12() {
		return respuesta12;
	}

	public void setRespuesta12(String respuesta12) {
		this.respuesta12 = respuesta12;
	}

	public String getRespuesta13() {
		return respuesta13;
	}

	public void setRespuesta13(String respuesta13) {
		this.respuesta13 = respuesta13;
	}

	public String getPregunta2() {
		return pregunta2;
	}

	public void setPregunta2(String pregunta2) {
		this.pregunta2 = pregunta2;
	}

	public String getRespuesta21() {
		return respuesta21;
	}

	public void setRespuesta21(String respuesta21) {
		this.respuesta21 = respuesta21;
	}

	public String getRespuesta22() {
		return respuesta22;
	}

	public void setRespuesta22(String respuesta22) {
		this.respuesta22 = respuesta22;
	}

	public String getRespuesta23() {
		return respuesta23;
	}

	public void setRespuesta23(String respuesta23) {
		this.respuesta23 = respuesta23;
	}

	public String getPregunta3() {
		return pregunta3;
	}

	public void setPregunta3(String pregunta3) {
		this.pregunta3 = pregunta3;
	}

	public String getRespuesta31() {
		return respuesta31;
	}

	public void setRespuesta31(String respuesta31) {
		this.respuesta31 = respuesta31;
	}

	public String getRespuesta32() {
		return respuesta32;
	}

	public void setRespuesta32(String respuesta32) {
		this.respuesta32 = respuesta32;
	}

	public String getRespuesta33() {
		return respuesta33;
	}

	public void setRespuesta33(String respuesta33) {
		this.respuesta33 = respuesta33;
	}

	public String getPregunta4() {
		return pregunta4;
	}

	public void setPregunta4(String pregunta4) {
		this.pregunta4 = pregunta4;
	}

	public String getRespuesta41() {
		return respuesta41;
	}

	public void setRespuesta41(String respuesta41) {
		this.respuesta41 = respuesta41;
	}

	public String getRespuesta42() {
		return respuesta42;
	}

	public void setRespuesta42(String respuesta42) {
		this.respuesta42 = respuesta42;
	}

	public String getRespuesta43() {
		return respuesta43;
	}

	public void setRespuesta43(String respuesta43) {
		this.respuesta43 = respuesta43;
	}

	public String getPregunta5() {
		return pregunta5;
	}

	public void setPregunta5(String pregunta5) {
		this.pregunta5 = pregunta5;
	}

	public String getRespuesta51() {
		return respuesta51;
	}

	public void setRespuesta51(String respuesta51) {
		this.respuesta51 = respuesta51;
	}

	public String getRespuesta52() {
		return respuesta52;
	}

	public void setRespuesta52(String respuesta52) {
		this.respuesta52 = respuesta52;
	}

	public String getRespuesta53() {
		return respuesta53;
	}

	public void setRespuesta53(String respuesta53) {
		this.respuesta53 = respuesta53;
	}

	public String getPregunta6() {
		return pregunta6;
	}

	public void setPregunta6(String pregunta6) {
		this.pregunta6 = pregunta6;
	}

	public String getRespuesta61() {
		return respuesta61;
	}

	public void setRespuesta61(String respuesta61) {
		this.respuesta61 = respuesta61;
	}

	public String getRespuesta62() {
		return respuesta62;
	}

	public void setRespuesta62(String respuesta62) {
		this.respuesta62 = respuesta62;
	}

	public String getRespuesta63() {
		return respuesta63;
	}

	public void setRespuesta63(String respuesta63) {
		this.respuesta63 = respuesta63;
	}

	public String getPregunta7() {
		return pregunta7;
	}

	public void setPregunta7(String pregunta7) {
		this.pregunta7 = pregunta7;
	}

	public String getRespuesta71() {
		return respuesta71;
	}

	public void setRespuesta71(String respuesta71) {
		this.respuesta71 = respuesta71;
	}

	public String getRespuesta72() {
		return respuesta72;
	}

	public void setRespuesta72(String respuesta72) {
		this.respuesta72 = respuesta72;
	}

	public String getRespuesta73() {
		return respuesta73;
	}

	public void setRespuesta73(String respuesta73) {
		this.respuesta73 = respuesta73;
	}

	public String getPregunta8() {
		return pregunta8;
	}

	public void setPregunta8(String pregunta8) {
		this.pregunta8 = pregunta8;
	}

	public String getRespuesta81() {
		return respuesta81;
	}

	public void setRespuesta81(String respuesta81) {
		this.respuesta81 = respuesta81;
	}

	public String getRespuesta82() {
		return respuesta82;
	}

	public void setRespuesta82(String respuesta82) {
		this.respuesta82 = respuesta82;
	}

	public String getRespuesta83() {
		return respuesta83;
	}

	public void setRespuesta83(String respuesta83) {
		this.respuesta83 = respuesta83;
	}

	public String getPregunta9() {
		return pregunta9;
	}

	public void setPregunta9(String pregunta9) {
		this.pregunta9 = pregunta9;
	}

	public String getRespuesta91() {
		return respuesta91;
	}

	public void setRespuesta91(String respuesta91) {
		this.respuesta91 = respuesta91;
	}

	public String getRespuesta92() {
		return respuesta92;
	}

	public void setRespuesta92(String respuesta92) {
		this.respuesta92 = respuesta92;
	}

	public String getRespuesta93() {
		return respuesta93;
	}

	public void setRespuesta93(String respuesta93) {
		this.respuesta93 = respuesta93;
	}

	public String getPregunta10() {
		return pregunta10;
	}

	public void setPregunta10(String pregunta10) {
		this.pregunta10 = pregunta10;
	}

	public String getRespuesta101() {
		return respuesta101;
	}

	public void setRespuesta101(String respuesta101) {
		this.respuesta101 = respuesta101;
	}

	public String getRespuesta102() {
		return respuesta102;
	}

	public void setRespuesta102(String respuesta102) {
		this.respuesta102 = respuesta102;
	}

	public String getRespuesta103() {
		return respuesta103;
	}

	public void setRespuesta103(String respuesta103) {
		this.respuesta103 = respuesta103;
	}

	public String getRespuesta14() {
		return respuesta14;
	}

	public void setRespuesta14(String respuesta14) {
		this.respuesta14 = respuesta14;
	}

	public String getRespuesta24() {
		return respuesta24;
	}

	public void setRespuesta24(String respuesta24) {
		this.respuesta24 = respuesta24;
	}

	public String getRespuesta34() {
		return respuesta34;
	}

	public void setRespuesta34(String respuesta34) {
		this.respuesta34 = respuesta34;
	}

	public String getRespuesta44() {
		return respuesta44;
	}

	public void setRespuesta44(String respuesta44) {
		this.respuesta44 = respuesta44;
	}

	public String getRespuesta54() {
		return respuesta54;
	}

	public void setRespuesta54(String respuesta54) {
		this.respuesta54 = respuesta54;
	}

	public String getRespuesta64() {
		return respuesta64;
	}

	public void setRespuesta64(String respuesta64) {
		this.respuesta64 = respuesta64;
	}

	public String getRespuesta74() {
		return respuesta74;
	}

	public void setRespuesta74(String respuesta74) {
		this.respuesta74 = respuesta74;
	}

	public String getRespuesta84() {
		return respuesta84;
	}

	public void setRespuesta84(String respuesta84) {
		this.respuesta84 = respuesta84;
	}

	public String getRespuesta94() {
		return respuesta94;
	}

	public void setRespuesta94(String respuesta94) {
		this.respuesta94 = respuesta94;
	}

	public String getRespuesta104() {
		return respuesta104;
	}

	public void setRespuesta104(String respuesta104) {
		this.respuesta104 = respuesta104;
	}
    
    
}
