package DAO;

/**
 * Content entity. @author MyEclipse Persistence Tools
 */

public class Content implements java.io.Serializable {

	// Fields

	private String id;
	private String content;
	private String answer;
	private String qa;
	private String qb;
	private String qc;
	private String qd;

	// Constructors

	/** default constructor */
	public Content() {
	}

	/** minimal constructor */
	public Content(String id) {
		this.id = id;
	}

	/** full constructor */
	public Content(String id, String content, String answer, String qa,
			String qb, String qc, String qd) {
		this.id = id;
		this.content = content;
		this.answer = answer;
		this.qa = qa;
		this.qb = qb;
		this.qc = qc;
		this.qd = qd;
	}

	// Property accessors

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getAnswer() {
		return this.answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public String getQa() {
		return this.qa;
	}

	public void setQa(String qa) {
		this.qa = qa;
	}

	public String getQb() {
		return this.qb;
	}

	public void setQb(String qb) {
		this.qb = qb;
	}

	public String getQc() {
		return this.qc;
	}

	public void setQc(String qc) {
		this.qc = qc;
	}

	public String getQd() {
		return this.qd;
	}

	public void setQd(String qd) {
		this.qd = qd;
	}

}