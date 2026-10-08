package dev.arunkarikalan.productcatalog.models;

import dev.arunkarikalan.productcatalog.models.enums.Status;

import java.time.LocalDateTime;

public abstract class BaseEntity {
    public long Id;
    public LocalDateTime created_at;
    public LocalDateTime updated_at;
    public Status status;
}
