package primero;
// Generated 07-feb-2018 14:09:10 by Hibernate Tools 5.2.8.Final

/**
 * HorarioId generated by hbm2java
 */
public class HorarioId implements java.io.Serializable {

	private String codOe;
	private String codCurso;
	private String codAsig;
	private String codTramo;

	public HorarioId() {
	}

	public HorarioId(String codOe, String codCurso, String codAsig, String codTramo) {
		this.codOe = codOe;
		this.codCurso = codCurso;
		this.codAsig = codAsig;
		this.codTramo = codTramo;
	}

	public String getCodOe() {
		return this.codOe;
	}

	public void setCodOe(String codOe) {
		this.codOe = codOe;
	}

	public String getCodCurso() {
		return this.codCurso;
	}

	public void setCodCurso(String codCurso) {
		this.codCurso = codCurso;
	}

	public String getCodAsig() {
		return this.codAsig;
	}

	public void setCodAsig(String codAsig) {
		this.codAsig = codAsig;
	}

	public String getCodTramo() {
		return this.codTramo;
	}

	public void setCodTramo(String codTramo) {
		this.codTramo = codTramo;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof HorarioId))
			return false;
		HorarioId castOther = (HorarioId) other;

		return ((this.getCodOe() == castOther.getCodOe()) || (this.getCodOe() != null && castOther.getCodOe() != null
				&& this.getCodOe().equals(castOther.getCodOe())))
				&& ((this.getCodCurso() == castOther.getCodCurso()) || (this.getCodCurso() != null
						&& castOther.getCodCurso() != null && this.getCodCurso().equals(castOther.getCodCurso())))
				&& ((this.getCodAsig() == castOther.getCodAsig()) || (this.getCodAsig() != null
						&& castOther.getCodAsig() != null && this.getCodAsig().equals(castOther.getCodAsig())))
				&& ((this.getCodTramo() == castOther.getCodTramo()) || (this.getCodTramo() != null
						&& castOther.getCodTramo() != null && this.getCodTramo().equals(castOther.getCodTramo())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getCodOe() == null ? 0 : this.getCodOe().hashCode());
		result = 37 * result + (getCodCurso() == null ? 0 : this.getCodCurso().hashCode());
		result = 37 * result + (getCodAsig() == null ? 0 : this.getCodAsig().hashCode());
		result = 37 * result + (getCodTramo() == null ? 0 : this.getCodTramo().hashCode());
		return result;
	}

}
