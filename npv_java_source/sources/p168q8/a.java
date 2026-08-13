package p168q8;

/* JADX INFO: loaded from: classes2.dex */
public enum a {
    NO_ARGUMENTS(false, false, 3, null),
    UNLESS_EMPTY(true, false, 2, null),
    ALWAYS_PARENTHESIZED(true, true);


    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private static final /* synthetic */ p157p7.a f53147I = p157p7.b.a(e());

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final boolean f53148C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final boolean f53149D;

    a(boolean z6, boolean z10) {
        this.f53148C = z6;
        this.f53149D = z10;
    }

    /* synthetic */ a(boolean z6, boolean z10, int i6, p247y7.AbstractC7342k abstractC7342k) {
        this((i6 & 1) != 0 ? false : z6, (i6 & 2) != 0 ? false : z10);
    }

    public final boolean g() {
        return this.f53148C;
    }

    public final boolean i() {
        return this.f53149D;
    }
}
