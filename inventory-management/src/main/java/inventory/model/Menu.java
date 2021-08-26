package inventory.model;
// Generated Dec 26, 2018 6:59:18 PM by Hibernate Tools 5.1.10.Final

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Menu generated by hbm2java
 */
public class Menu implements java.io.Serializable {

	private Integer id;
	private int parentId;
	private String url;
	private String name;
	private int orderIndex;
	private int activeFlag;
	private Date createDate;
	private Date updateDate;
	private Set auths = new HashSet(0);
	private List<Menu> child;
	private String idMenu;

	public Menu() {
	}

	public Menu(int parentId, String url, String name, int orderIndex, int activeFlag, Date createDate,
			Date updateDate) {
		this.parentId = parentId;
		this.url = url;
		this.name = name;
		this.orderIndex = orderIndex;
		this.activeFlag = activeFlag;
		this.createDate = createDate;
		this.updateDate = updateDate;
	}

	public Menu(int parentId, String url, String name, int orderIndex, int activeFlag, Date createDate, Date updateDate,
			Set auths) {
		this.parentId = parentId;
		this.url = url;
		this.name = name;
		this.orderIndex = orderIndex;
		this.activeFlag = activeFlag;
		this.createDate = createDate;
		this.updateDate = updateDate;
		this.auths = auths;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getParentId() {
		return this.parentId;
	}

	public void setParentId(int parentId) {
		this.parentId = parentId;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getOrderIndex() {
		return this.orderIndex;
	}

	public void setOrderIndex(int orderIndex) {
		this.orderIndex = orderIndex;
	}

	public int getActiveFlag() {
		return this.activeFlag;
	}

	public void setActiveFlag(int activeFlag) {
		this.activeFlag = activeFlag;
	}

	public Date getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getUpdateDate() {
		return this.updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public Set getAuths() {
		return this.auths;
	}

	public void setAuths(Set auths) {
		this.auths = auths;
	}

	public List<Menu> getChild() {
		return child;
	}

	public void setChild(List<Menu> child) {
		this.child = child;
	}

	public String getIdMenu() {
		return idMenu;
	}

	public void setIdMenu(String idMenu) {
		this.idMenu = idMenu;
	}
	

}
