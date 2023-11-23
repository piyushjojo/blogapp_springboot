package com.app.blogapp.users;

import org.springframework.lang.NonNull;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity(name = "users")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class UserEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(nullable = false)
	private Long id  ;

	@Column(nullable = false)
	@NonNull
	private String username ; 
	
	@Column(nullable = false)
	@NonNull
	private String email ; 
	
	@Column(nullable = true)
	@NonNull
	private String bio ; 
	
	@Column(nullable = true)
	@NonNull
	private String image  ;
}
