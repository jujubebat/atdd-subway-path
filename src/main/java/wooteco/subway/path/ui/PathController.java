package wooteco.subway.path.ui;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import wooteco.subway.path.application.PathService;
import wooteco.subway.path.dto.PathResponse;

@RestController
@RequestMapping(value = "/api/paths", produces = MediaType.APPLICATION_JSON_VALUE)
public class PathController {

    private final PathService pathService;

    public PathController(PathService pathService) {
        this.pathService = pathService;
    }

    @GetMapping
    public ResponseEntity<PathResponse> showPath(@RequestParam Long source,
        @RequestParam Long target) {
        return ResponseEntity.ok(pathService.findPath(source, target));
    }

}
