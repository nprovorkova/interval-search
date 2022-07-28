package net.iptp.analyzer.web.rest;

import net.iptp.analyzer.service.TimeIntervalService;
import net.iptp.analyzer.service.dto.IntervalDTO;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@RestController
@RequestMapping("/api")
public class TimeIntervalResource {

    private final TimeIntervalService timeIntervalService;

    public TimeIntervalResource(TimeIntervalService timeIntervalService) {
        this.timeIntervalService = timeIntervalService;
    }

    /**
     * {@code GET  /unassigned-intervals} : get all unassigned time intervals.
     *
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and the list of unassigned time intervals in body.
     */
    @GetMapping(value = "/unassigned-intervals", consumes = MediaType.APPLICATION_XML_VALUE)
    public ResponseEntity<List<IntervalDTO>> getAllUnassignedIntervals(InputStream inputStream) throws IOException {
        try {
            List<IntervalDTO> unassignedIntervalList = timeIntervalService.analyzeTimeIntervals(inputStream);
            return ResponseEntity.ok(unassignedIntervalList);
        } finally {
            inputStream.close();
        }
    }
}
