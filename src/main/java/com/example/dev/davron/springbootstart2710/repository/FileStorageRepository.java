package com.example.dev.davron.springbootstart2710.repository;

import com.example.dev.davron.springbootstart2710.domain.FileStorage;
import com.example.dev.davron.springbootstart2710.domain.FileStorageStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FileStorageRepository extends JpaRepository<FileStorage, Long> {

    FileStorage findByHashId(String hashId);

    List<FileStorage> findAllByFileStorageStatus(FileStorageStatus status);
}
