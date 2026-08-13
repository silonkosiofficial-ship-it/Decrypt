package E7;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a implements java.lang.Iterable, p256z7.a {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final E7.a.C0051a f2246F = new E7.a.C0051a(null);

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final char f2247C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final char f2248D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final int f2249E;

    /* JADX INFO: renamed from: E7.a$a, reason: collision with other inner class name */
    public static final class C0051a {
        private C0051a() {
        }

        public /* synthetic */ C0051a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }
    }

    public a(char c6, char c10, int i6) {
        if (i6 == 0) {
            throw new java.lang.IllegalArgumentException("Step must be non-zero.");
        }
        if (i6 == Integer.MIN_VALUE) {
            throw new java.lang.IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f2247C = c6;
        this.f2248D = (char) p167q7.c.b(c6, c10, i6);
        this.f2249E = i6;
    }

    public final char f() {
        return this.f2247C;
    }

    public final char g() {
        return this.f2248D;
    }

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public p097j7.AbstractC6878u iterator() {
        return new E7.b(this.f2247C, this.f2248D, this.f2249E);
    }
}
