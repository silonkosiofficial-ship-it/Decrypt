package S5;

/* JADX INFO: loaded from: classes3.dex */
public enum t implements B5.f {
    LOG_ENVIRONMENT_UNKNOWN(0),
    LOG_ENVIRONMENT_AUTOPUSH(1),
    LOG_ENVIRONMENT_STAGING(2),
    LOG_ENVIRONMENT_PROD(3);


    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final int f12567C;

    t(int i6) {
        this.f12567C = i6;
    }

    @Override // B5.f
    public int c() {
        return this.f12567C;
    }
}
