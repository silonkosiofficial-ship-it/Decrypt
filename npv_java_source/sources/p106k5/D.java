package p106k5;

/* JADX INFO: loaded from: classes3.dex */
public enum D {
    DEVELOPER(1),
    USER_SIDELOAD(2),
    TEST_DISTRIBUTION(3),
    APP_STORE(4);


    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final int f49556C;

    D(int i6) {
        this.f49556C = i6;
    }

    public static p106k5.D g(java.lang.String str) {
        return str != null ? APP_STORE : DEVELOPER;
    }

    public int i() {
        return this.f49556C;
    }

    @Override // java.lang.Enum
    public java.lang.String toString() {
        return java.lang.Integer.toString(this.f49556C);
    }
}
