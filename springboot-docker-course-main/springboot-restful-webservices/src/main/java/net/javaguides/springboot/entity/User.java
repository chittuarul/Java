package net.javaguides.springboot.entity;

import org.springframework.beans.factory.annotation.Autowired;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "users")
public class User {
	@Autowired
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String firstName;
    @Column(nullable = false)
    private String lastName;
    @Column(nullable = false, unique = true)
    private String email;
	public void setId(Long userId) {
		// TODO Auto-generated method stub
		
	}
	public Long getId() {
		// TODO Auto-generated method stub
		return null;
	}
	public Object getEmail() {
		// TODO Auto-generated method stub
		return null;
	}
	public Object getFirstName() {
		// TODO Auto-generated method stub
		return null;
	}
	public void setEmail(Object email2) {
		// TODO Auto-generated method stub
		
	}
	public void setLastName(Object firstName2) {
		// TODO Auto-generated method stub
		
	}
	public void setFirstName(Object firstName2) {
		// TODO Auto-generated method stub
		
	}
	
}
