package EstructureReview;

import java.util.Locale;
import java.util.regex.Pattern;

class SqueakyClean {
    static String clean(String identifier) {
        // Replace spaces with underscores
        identifier = identifier.replaceAll(" ", "_")
                // Replace control characters with "CTRL"
                .replaceAll("\\p{C}", "CTRL")
                // Remove Greek letters
                .replaceAll("[α-ω]", "")
                // Remove characters that are not letters or punctuation
                .replaceAll("[^\\p{L}\\p{P}]", "");

        var matcher = Pattern.compile("(.*?)-(\\p{L})(.*)").matcher(identifier);
        if (matcher.matches()) {
            identifier = matcher.replaceAll(
                    matcher.group(1)
                            + matcher.group(2).toUpperCase(Locale.ROOT)
                            + matcher.group(3)
            );
        }
        return identifier;
    }
}