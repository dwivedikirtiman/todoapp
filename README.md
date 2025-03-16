## 📝 To-Do App

🌟 Overview

This is a feature-rich To-Do application built using Spring Boot, JPA, Lombok, Thymeleaf, CSS, and Bootstrap. The application allows users to create, toggle, delete, and view tasks efficiently. It interacts with a database to persist task information and follows a clean MVC architecture for scalability.


## Features

✅ Add New Tasks with a simple input form.

⬇️ Toggle Task Status to mark tasks as completed/incomplete.

❌ Delete Unwanted Tasks with a dedicated button.

🔧 MySQL Database Integration to persist data.

🌟 Responsive UI Design using Bootstrap for a clean and user-friendly experience.

⚙️ Efficient Code Structure leveraging Spring Boot's powerful features.

🌟 Interactive UI built with Thymeleaf templates

⚙️ Modular code structure following best coding practices

⚙️ Clean error handling for improved user experience


## 📂 File Structure

![image](https://github.com/user-attachments/assets/bf4cdcb2-44f4-496c-8d9c-f38967674561)

## 🏗️ Technical Breakdown

- 📜 ```TaskController.java```

- Handles all HTTP requests (GET, POST, etc.)

- Manages CRUD operations for tasks

- Uses ```@Controller``` and ```@RequestMapping``` annotations for routing

📄 ```Task.java```

- Entity class representing the task model

- Annotated with ```@Entity```, ```@Id```, ```@GeneratedValue```

- Contains fields like id, title, description, and completed

🗂️ ```TaskRepository.java```

- Interface extending JpaRepository

- Provides database interaction methods like ```findAll()```, ```save()```, and ```deleteById()```

🛠️ ```TaskService.java```

- Business logic layer for task operations

- Uses ```@Service``` annotation for dependency injection

🌐 ```tasks.html```

- Frontend template for task management

- Built with Thymeleaf, CSS, and Bootstrap for a clean UI

- Contains dynamic task data rendering

## ⚙️ application.properties

- Configuration file for database settings, server port, etc.

- Sample Configuration (```application.properties``` file under file structure):
```
     spring.application.name=todoapp
     spring.datasource.url = jdbc:mysql://localhost:3306/todo-app
     spring.datasource.username=root             //write your own MySql username
     spring.datasource.password=student          //write your own MySql password
     spring.jpa.hibernate.ddl-auto=update
     spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect
```

## 🖥️ Setup Instructions

- Clone the Repository:
```
   git clone https://github.com/dwivedikirtiman/todoapp.git
```
- Navigate to Project Directory:
```
   cd todoapp
```
- Build the Project:
```
./mvnw clean install
```

- Run the Application:
```
./mvnw spring-boot:run
```

- Access the Application:

Open ```http://localhost:8080``` in your browser.


## Screenshots of the output screen in browser on ```http://localhost:8080/```

![image](https://github.com/user-attachments/assets/39e7fb1b-3c94-4fd0-ae5f-1b7a32a91176)

MySql Workbench :

![image](https://github.com/user-attachments/assets/2b702a2e-0118-43c9-a8da-4e140b98e00e)


## 🚧 Future Improvements(Optional/Suggestions)

- Add user authentication for better security

- Implement search and filter options for tasks

- Enhance UI with improved styling and animations

## 🤝 Contribution

Contributions are welcome! Feel free to fork this repo and submit a pull request with your improvements.

## 📜 License

This project is licensed under the MIT License.

## 👨‍💻 Author

**[Kirtiman Dwivedi]**

GitHub: https://github.com/dwivedikirtiman

Email: [dwivedikirtiman000@gmail.com]

Let’s connect—I’d love to hear your feedback! 🚀



