package org.Gorbachev;

import java.util.List;

// 3. Create a StreamService class, adding a method to sort the list of streams using the created StreamComparator.
public class StreamService {
    public void sortStreams(List<Stream> streams) {
        streams.sort(new StreamComparator());
    }
}
