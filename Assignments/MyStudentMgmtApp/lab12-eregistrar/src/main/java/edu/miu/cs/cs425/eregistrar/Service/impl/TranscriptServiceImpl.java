package edu.miu.cs.cs425.eregistrar.Service.impl;

import edu.miu.cs.cs425.eregistrar.Service.TranscriptService;
import edu.miu.cs.cs425.eregistrar.model.Transcript;
import edu.miu.cs.cs425.eregistrar.repository.TranscriptRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TranscriptServiceImpl implements TranscriptService {

    @Autowired
    private TranscriptRepository transcriptRepository;

    @Override
    public Transcript saveTranscript(Transcript transcript) {
        return transcriptRepository.save(transcript);
    }

}
