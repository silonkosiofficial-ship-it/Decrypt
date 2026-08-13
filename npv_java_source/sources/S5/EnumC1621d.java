package S5;

/* JADX INFO: renamed from: S5.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC1621d implements B5.f {
    COLLECTION_UNKNOWN(0),
    COLLECTION_SDK_NOT_INSTALLED(1),
    COLLECTION_ENABLED(2),
    COLLECTION_DISABLED(3),
    COLLECTION_DISABLED_REMOTE(4),
    COLLECTION_SAMPLED(5);


    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final int f12536C;

    EnumC1621d(int i6) {
        this.f12536C = i6;
    }

    @Override // B5.f
    public int c() {
        return this.f12536C;
    }
}
