package myspotify.storage;

import org.springframework.core.io.Resource;

public interface StorageService {
    Resource load(String filename);
}
