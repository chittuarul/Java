package com.chittu.springbootcrud;
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

	    @Id
	    //@GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    @Column(name="first_name",nullable = false)
	    private String firstName;
	    @Column(name="last_name",nullable = false)
	    private String lastName;
	    @Column(nullable = false, unique = true)
	    private String email;
		
		
	public Long getId() {
			// TODO Auto-generated method stub
			return id;
		}
		public Object getFirstName() {
			// TODO Auto-generated method stub
			return firstName;
		}
		public Object getLastName() {
			// TODO Auto-generated method stub
			return lastName;
		}
		public Object getEmail() {
			// TODO Auto-generated method stub
			 return email;
		}
		public void setId(Long userId) {
			// TODO Auto-generated method stub
			id= userId.longValue();
			
		}
		public void setFirstName(Object fn) {
			// TODO Auto-generated method stub
			firstName= fn.toString();
		}
		
		public void setLastName(Object ln) {
			// TODO Auto-generated method stub
			 lastName=ln.toString();
			
		}
		public void setEmail(Object em) {
			// TODO Auto-generated method stub
			  email =em.toString();
		}
		
	
	}


