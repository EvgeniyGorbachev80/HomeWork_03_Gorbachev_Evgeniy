package org.Gorbachev;

import java.util.List;

// 4. Create a Controller class and modify it by adding the created service.
public class Controller {
    private StreamService streamService;

    public Controller(StreamService streamService) {
        this.streamService = streamService;
    }

    // Method to sort streams
    public void sortStreams(List<Stream> streams) {
        streamService.sortStreams(streams);
    }
}
