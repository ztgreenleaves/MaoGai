package DAO;

/**
 * Content entity. @author MyEclipse Persistence Tools
 */

public class Content implements java.io.Serializable {

	// Fields

	private Integer QDi;
	private String QContent;
	private String QAnswer;
	private String QA;
	private String QB;
	private String QC;
	private String QD;

	// Constructors

	/** default constructor */
	public Content() {
	}

	/** minimal constructor */
	public Content(Integer QDi) {
		this.QDi = QDi;
	}

	/** full constructor */
	public Content(Integer QDi, String QContent, String QAnswer, String QA,
			String QB, String QC, String QD) {
		this.QDi = QDi;
		this.QContent = QContent;
		this.QAnswer = QAnswer;
		this.QA = QA;
		this.QB = QB;
		this.QC = QC;
		this.QD = QD;
	}

	// Property accessors

	public Integer getQDi() {
		return this.QDi;
	}

	public void setQDi(Integer QDi) {
		this.QDi = QDi;
	}

	public String getQContent() {
		return this.QContent;
	}

	public void setQContent(String QContent) {
		this.QContent = QContent;
	}

	public String getQAnswer() {
		return this.QAnswer;
	}

	public void setQAnswer(String QAnswer) {
		this.QAnswer = QAnswer;
	}

	public String getQA() {
		return this.QA;
	}

	public void setQA(String QA) {
		this.QA = QA;
	}

	public String getQB() {
		return this.QB;
	}

	public void setQB(String QB) {
		this.QB = QB;
	}

	public String getQC() {
		return this.QC;
	}

	public void setQC(String QC) {
		this.QC = QC;
	}

	public String getQD() {
		return this.QD;
	}

	public void setQD(String QD) {
		this.QD = QD;
	}

}