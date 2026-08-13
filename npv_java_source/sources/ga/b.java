package ga;

/* JADX INFO: loaded from: classes2.dex */
public enum b {
    ERROR(40, "ERROR"),
    WARN(30, "WARN"),
    INFO(20, "INFO"),
    DEBUG(10, "DEBUG"),
    TRACE(0, "TRACE");


    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final int f45723C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final java.lang.String f45724D;

    b(int i6, java.lang.String str) {
        this.f45723C = i6;
        this.f45724D = str;
    }

    public int g() {
        return this.f45723C;
    }

    @Override // java.lang.Enum
    public java.lang.String toString() {
        return this.f45724D;
    }
}
