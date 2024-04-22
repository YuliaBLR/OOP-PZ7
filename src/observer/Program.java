package observer;

import java.util.Collection;

/**
 * TODO: Доработать приложение, которое разрабатывалось на семинаре,
 *  поработать с шаблоном проектирования Observer,
 *  добавить новый тип соискателя.
 *  Добавить новую сущность "Вакансия", компания должна рассылать вакансии.
 *  Только после этого вы можете усложнить ваше приложение (при желании), например,
 *  добавить тип вакансии (enum),
 *  учитывать тип вакансии при отправке предложения соискателю.
 *  *** воспользоваться методом removeObserver для удаления соискателя после получения работы
 *
 */

public class Program {
    public static void main(String[] args) {
        Publisher publisher = new JobAgency();
        Company google = new Company("Google", publisher, 120000);
        Company yandex = new Company("Yandex", publisher, 95000);
        Company geekBrains = new Company("GeekBrains", publisher, 98000);

        Vacancy googlevacancy1 = new Vacancy(google,"Уборщик помещений");
        Vacancy googlevacancy2 = new Programmer(google);
        Vacancy googlevacancy3 = new Vacancy(google, "Менеджер по продажам");
        Vacancy yandexvacancy1 = new Vacancy(yandex,"Уборщик помещений");
        Vacancy yandexvacancy2 = new Vacancy(yandex, "Программист");
        Vacancy geekBrainsvacancy1 = new SalesManager(geekBrains);




        google.registerVacancies(googlevacancy1);
        google.registerVacancies(googlevacancy2);
        google.registerVacancies(googlevacancy3);
        yandex.registerVacancies(yandexvacancy1);
        yandex.registerVacancies(yandexvacancy2);
        geekBrains.registerVacancies(geekBrainsvacancy1);


        Student student = new Student("Student #1");
        Master master1 = new Master("Master #1", "Уборщик помещений");
        Master master2 = new Master("Master #2", "Программист");


        publisher.registerObserver(student);
        publisher.registerObserver(master1);
        publisher.registerObserver(master2);

        for (int i = 0; i < 1; i++){
            google.needEmployee();
            yandex.needEmployee();
            geekBrains.needEmployee();

        }

        }
    }
