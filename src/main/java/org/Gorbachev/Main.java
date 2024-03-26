package org.Gorbachev;

// todo 1. Создать класс Поток содержащий в себе список УчебныхГрупп и реализующий интерфейс Iterable.
//      2. Создать класс StreamComparator, реализующий сравнение количества групп входящих в Поток.
//      3. Создать класс ПотокСервис, добавив в него метод сортировки списка потоков, используя созданный StreamComparator.
//      4. Модифицировать класс Контроллер, добавив в него созданный сервис.
//      5. Модифицировать класс Контроллер, добавив в него метод сортирующий список потоков, путем вызова созданного сервиса.

import java.util.ArrayList;
import java.util.List;

// Main class
public class Main {
    public static void main(String[] args) {
        // Creating sample streams
        Stream stream1 = new Stream();
        stream1.addGroup(new StudyGroup("Group A"));
        stream1.addGroup(new StudyGroup("Group B"));

        Stream stream2 = new Stream();
        stream2.addGroup(new StudyGroup("Group C"));
        stream2.addGroup(new StudyGroup("Group D"));
        stream2.addGroup(new StudyGroup("Group E"));

        Stream stream3 = new Stream();
        stream3.addGroup(new StudyGroup("Group F"));

        // Sorting streams
        List<Stream> streams = new ArrayList<>();
        streams.add(stream1);
        streams.add(stream2);
        streams.add(stream3);

        StreamService streamService = new StreamService();
        Controller controller = new Controller(streamService);
        controller.sortStreams(streams);

        // Printing sorted streams
        for (Stream stream : streams) {
            System.out.println("Stream size: " + stream.size());
            for (StudyGroup group : stream) {
                System.out.println("- " + group.getName());
            }
            System.out.println();
        }
    }
}
