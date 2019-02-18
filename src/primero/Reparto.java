package primero;
// Generated 07-feb-2018 14:09:10 by Hibernate Tools 5.2.8.Final

/**
 * Reparto generated by hbm2java
 */
public class Reparto implements java.io.Serializable {

	private RepartoId id;
	private Asignatura asignatura;
	private Curso curso;
	private Profesor profesor;

	public Reparto() {
	}

	public Reparto(RepartoId id, Asignatura asignatura, Curso curso, Profesor profesor) {
		this.id = id;
		this.asignatura = asignatura;
		this.curso = curso;
		this.profesor = profesor;
	}

	public RepartoId getId() {
		return this.id;
	}

	public void setId(RepartoId id) {
		this.id = id;
	}

	public Asignatura getAsignatura() {
		return this.asignatura;
	}

	public void setAsignatura(Asignatura asignatura) {
		this.asignatura = asignatura;
	}

	public Curso getCurso() {
		return this.curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public Profesor getProfesor() {
		return this.profesor;
	}

	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}

}
