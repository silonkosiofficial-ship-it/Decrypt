package I2;

/* JADX INFO: loaded from: classes.dex */
public enum s {
    ENQUEUED,
    RUNNING,
    SUCCEEDED,
    FAILED,
    BLOCKED,
    CANCELLED;

    public boolean e() {
        return this == SUCCEEDED || this == FAILED || this == CANCELLED;
    }
}
