package myApi;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeatureFeedbackController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/featurefeedback")
    public FeatureFeedback featureFeedback(@RequestParam(value="name", defaultValue="World") String name) {
        return new FeatureFeedback(counter.incrementAndGet(),
                String.format(template, name));
    }
}