# Single Responsibility Principle
## Реализован в ***StudentService***
Метод ***create*** теперь не занимается поиском максимального id
эту функциональность вынесли в отдельный метод ***findMaxStudentId***.

Класс ***StudentService*** теперь более сосредоточен на управлении
списком студентов, а не на поиске id.

# Open/Closed Principle
## Реализован в ***UserComparator***
Добавлен метод ***compareAdditionalFields***, который можно переопределить
в подклассах для дополнительного сравнения полей.

Теперь можно расширять функциональность сравнения,
не изменяя существующий код.

# Liskov Substitution Principle
## Реализован в ***StudentComparator***
Создан подкласс ***StudentComparator***, который расширяет ***UserComparator***
для сравнения дополнительных полей, специфичных для класса Student.

Принцип подстановки Барбары Лисков сохраняется, так как
***StudentComparator*** может заменить ***UserComparator*** в контексте
сравнения студентов.

# Dependency Inversion Principle
## Реализован в ***StudentController***
Класс ***StudentController*** теперь принимает интерфейс
***UserService<Student>*** вместо реализации ***StudentService***
которую делали на семинаре.

Это позволяет подменять реализации ***UserService*** без изменения
кода в контроллере.