package ua.step.bookshop.models;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Authors")
public class Author {
	
		@Id
		private Short id;
		private String name;
		private String biography;
		//List<Book>books;
		
		public Short getId() {
			return id;
		}
		public void setId(Short id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getBiography() {
			return biography;
		}
		public void setBiography(String biography) {
			this.biography = biography;
		}
	}
