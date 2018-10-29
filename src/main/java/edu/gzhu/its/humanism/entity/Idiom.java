package edu.gzhu.its.humanism.entity;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 成语
 * <p>
 * Title : Idiom
 * </p>
 * <p>
 * Description :
 * </p>
 * <p>
 * Company :
 * </p>
 * 
 * @author 丁国柱
 * @date 2018年7月11日 下午5:02:27
 */

@Entity
@Table(name = "lcell_idiom")
public class Idiom {

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private Integer id;
	/**
	 * 成语
	 */
	@Column(name = "idiom", length = 100)
	private String idiom;

	/**
	 * 拼音
	 */
	@Column(name = "spell", length = 100)
	private String spell;

	/**
	 * 解释
	 */
	@Column(name = "paraphrase")
	private String paraphrase;

	/**
	 * 出处
	 */
	@Column(name = "provenance")
	private String provenance;

	/**
	 * 感情色彩(快乐/安心/等)
	 * 
	 * @author : 丁国柱
	 * @date : 2014-10-18 下午7:29:07
	 */
	@Column(name = "emotional")
	private String emotional;

	/**
	 * 感情色彩类型
	 * 
	 * @author : 丁国柱
	 * @date : 2014-10-18 下午7:29:07
	 */
	@Column(name = "emotionalType")
	private String emotionalType;

	// 褒义、贬义、中性
	@Column(name = "jixing")
	private String jixing;

	// 情感强度(情感强度分为1,3,5,7,9五档，9表示强度最大，1为强度最小)
	@Column(name = "strength")
	private String strength;

	public String getEmotional() {
		return emotional;
	}

	public void setEmotional(String emotional) {
		this.emotional = emotional;
	}

	public String getEmotionalType() {
		return emotionalType;
	}

	public void setEmotionalType(String emotionalType) {
		this.emotionalType = emotionalType;
	}

	/**
	 * 例子
	 */
	@Column(name = "example")
	private String example;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getIdiom() {
		return idiom;
	}

	public void setIdiom(String idiom) {
		this.idiom = idiom;
	}

	public String getSpell() {
		return spell;
	}

	public void setSpell(String spell) {
		this.spell = spell;
	}

	public String getParaphrase() {
		return paraphrase;
	}

	public void setParaphrase(String paraphrase) {
		this.paraphrase = paraphrase;
	}

	public String getProvenance() {
		return provenance;
	}

	public void setProvenance(String provenance) {
		this.provenance = provenance;
	}

	public String getExample() {
		return example;
	}

	public void setExample(String example) {
		this.example = example;
	}

	@Override
	public int hashCode() {// 重写hashCode方法
		return this.idiom.hashCode();
	}

	/**
	 * 重写2个idiom是否相等
	 * 
	 * @author : 丁国柱
	 * @date : 2014-10-18 下午6:13:20
	 */
	@Override
	public boolean equals(Object obj) {// 重写equals方法
		if (this == obj) {
			return true;
		}
		if (null != obj && obj instanceof Idiom) {
			Idiom p = (Idiom) obj;
			if (idiom.equals(p.idiom)) {// 判断name是否相同
				return true;
			}
		}
		return false;
	}

	public String getJixing() {
		return jixing;
	}

	public void setJixing(String jixing) {
		this.jixing = jixing;
	}

	public String getStrength() {
		return strength;
	}

	public void setStrength(String strength) {
		this.strength = strength;
	}

}
