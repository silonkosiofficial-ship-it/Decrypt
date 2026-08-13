package F8;

/* JADX INFO: loaded from: classes2.dex */
public enum u0 {
    INVARIANT("", true, true, 0),
    IN_VARIANCE("in", true, false, -1),
    OUT_VARIANCE("out", false, true, 1);


    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private static final /* synthetic */ p157p7.a f2979K = p157p7.b.a(e());

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final java.lang.String f2980C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final boolean f2981D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final boolean f2982E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final int f2983F;

    u0(java.lang.String str, boolean z6, boolean z10, int i6) {
        this.f2980C = str;
        this.f2981D = z6;
        this.f2982E = z10;
        this.f2983F = i6;
    }

    public final boolean g() {
        return this.f2982E;
    }

    public final java.lang.String i() {
        return this.f2980C;
    }

    @Override // java.lang.Enum
    public java.lang.String toString() {
        return this.f2980C;
    }
}
