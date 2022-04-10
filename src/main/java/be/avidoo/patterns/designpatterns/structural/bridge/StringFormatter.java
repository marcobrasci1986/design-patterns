package be.avidoo.patterns.designpatterns.structural.bridge;

import java.util.List;

/**
 * ConcreateImplementarA
 */
public class StringFormatter implements Formatter {

    @Override
    public String format(String header, List<Detail> details) {
        StringBuilder sb = new StringBuilder();

        sb.append(header);
        sb.append("\n");

        for (Detail d : details) {
            sb.append(d.getLabel());
            sb.append(":");
            sb.append(d.getValue());
            sb.append("\n");
        }

        return sb.toString();
    }
}
