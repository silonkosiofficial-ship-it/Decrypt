package X7;

/* JADX INFO: loaded from: classes2.dex */
public enum G {
    IGNORE("ignore"),
    WARN("warn"),
    STRICT("strict");


    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final java.lang.String f15950C;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private static final /* synthetic */ p157p7.a f15949I = p157p7.b.a(e());

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final X7.G.a f15944D = new X7.G.a(null);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }
    }

    G(java.lang.String str) {
        this.f15950C = str;
    }

    public final java.lang.String g() {
        return this.f15950C;
    }

    public final boolean i() {
        return this == IGNORE;
    }

    public final boolean m() {
        return this == WARN;
    }
}
