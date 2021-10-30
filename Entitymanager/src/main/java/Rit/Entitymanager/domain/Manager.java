package Rit.Entitymanager.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Manager {
	@Id
	private Integer manageId;
	private String manageName;
	private Double manageSalary;
}
