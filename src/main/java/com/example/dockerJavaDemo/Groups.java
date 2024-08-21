package com.example.dockerJavaDemo;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "WORKFLOW_GROUPS")
public class Groups {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "GROUP_ID", columnDefinition = "INTEGER", nullable = false)
	private Integer groupId;

	@Column(name = "GROUP_NAME", columnDefinition = "VARCHAR(255)")
	private String groupName;

	@Column(name = "COMPANY_ID", columnDefinition = "VARCHAR(20)", nullable = false)
	private String companyId;
	
	@Column(name = "STATUS", columnDefinition = "VARCHAR(50)")
	private String status;
}