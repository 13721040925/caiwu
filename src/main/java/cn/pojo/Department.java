package cn.pojo;

import java.io.Serializable;

import org.springframework.stereotype.Component;

@Component("department")
public class Department implements Serializable {
	private static final long serialVersionUID = -5171223740688442991L;
	private Integer id;
	private String name;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + "]";
	}

}
