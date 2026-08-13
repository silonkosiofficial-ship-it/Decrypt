package D0;

/* JADX INFO: renamed from: D0.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0883b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final D0.C0894m f1815a = new D0.C0894m(D0.AbstractC0883b.a.f1817L);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final D0.C0894m f1816b = new D0.C0894m(D0.AbstractC0883b.C0041b.f1818L);

    /* JADX INFO: renamed from: D0.b$a */
    /* synthetic */ class a extends p247y7.C7348q implements p237x7.p {

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        public static final D0.AbstractC0883b.a f1817L = new D0.AbstractC0883b.a();

        a() {
            super(2, A7.a.class, "min", "min(II)I", 1);
        }

        public final java.lang.Integer s(int i6, int i10) {
            return java.lang.Integer.valueOf(java.lang.Math.min(i6, i10));
        }

        @Override // p237x7.p
        public /* bridge */ /* synthetic */ java.lang.Object u(java.lang.Object obj, java.lang.Object obj2) {
            return s(((java.lang.Number) obj).intValue(), ((java.lang.Number) obj2).intValue());
        }
    }

    /* JADX INFO: renamed from: D0.b$b, reason: collision with other inner class name */
    /* synthetic */ class C0041b extends p247y7.C7348q implements p237x7.p {

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        public static final D0.AbstractC0883b.C0041b f1818L = new D0.AbstractC0883b.C0041b();

        C0041b() {
            super(2, A7.a.class, "max", "max(II)I", 1);
        }

        public final java.lang.Integer s(int i6, int i10) {
            return java.lang.Integer.valueOf(java.lang.Math.max(i6, i10));
        }

        @Override // p237x7.p
        public /* bridge */ /* synthetic */ java.lang.Object u(java.lang.Object obj, java.lang.Object obj2) {
            return s(((java.lang.Number) obj).intValue(), ((java.lang.Number) obj2).intValue());
        }
    }

    public static final D0.C0894m a() {
        return f1815a;
    }

    public static final D0.C0894m b() {
        return f1816b;
    }

    public static final int c(D0.AbstractC0882a abstractC0882a, int i6, int i10) {
        return ((java.lang.Number) abstractC0882a.a().u(java.lang.Integer.valueOf(i6), java.lang.Integer.valueOf(i10))).intValue();
    }
}
