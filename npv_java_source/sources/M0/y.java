package M0;

/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final M0.y.a f6765c = new M0.y.a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final M0.y f6766d = new M0.y();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f6767a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f6768b;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final M0.y a() {
            return M0.y.f6766d;
        }
    }

    public y() {
        this(M0.C1335g.f6714b.b(), false, null);
    }

    private y(int i6, boolean z6) {
        this.f6767a = z6;
        this.f6768b = i6;
    }

    public /* synthetic */ y(int i6, boolean z6, p247y7.AbstractC7342k abstractC7342k) {
        this(i6, z6);
    }

    public y(boolean z6) {
        this.f6767a = z6;
        this.f6768b = M0.C1335g.f6714b.b();
    }

    public final int b() {
        return this.f6768b;
    }

    public final boolean c() {
        return this.f6767a;
    }

    public final M0.y d(M0.y yVar) {
        return yVar == null ? this : yVar;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof M0.y)) {
            return false;
        }
        M0.y yVar = (M0.y) obj;
        return this.f6767a == yVar.f6767a && M0.C1335g.g(this.f6768b, yVar.f6768b);
    }

    public int hashCode() {
        return (p190t.h.a(this.f6767a) * 31) + M0.C1335g.h(this.f6768b);
    }

    public java.lang.String toString() {
        return "PlatformParagraphStyle(includeFontPadding=" + this.f6767a + ", emojiSupportMatch=" + ((java.lang.Object) M0.C1335g.i(this.f6768b)) + ')';
    }
}
