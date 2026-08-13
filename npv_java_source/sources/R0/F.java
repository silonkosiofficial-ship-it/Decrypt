package R0;

/* JADX INFO: loaded from: classes.dex */
public final class F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final R0.AbstractC1494h f9279a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final R0.q f9280b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f9281c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f9282d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final java.lang.Object f9283e;

    private F(R0.AbstractC1494h abstractC1494h, R0.q qVar, int i6, int i10, java.lang.Object obj) {
        this.f9279a = abstractC1494h;
        this.f9280b = qVar;
        this.f9281c = i6;
        this.f9282d = i10;
        this.f9283e = obj;
    }

    public /* synthetic */ F(R0.AbstractC1494h abstractC1494h, R0.q qVar, int i6, int i10, java.lang.Object obj, p247y7.AbstractC7342k abstractC7342k) {
        this(abstractC1494h, qVar, i6, i10, obj);
    }

    public static /* synthetic */ R0.F b(R0.F f6, R0.AbstractC1494h abstractC1494h, R0.q qVar, int i6, int i10, java.lang.Object obj, int i11, java.lang.Object obj2) {
        if ((i11 & 1) != 0) {
            abstractC1494h = f6.f9279a;
        }
        if ((i11 & 2) != 0) {
            qVar = f6.f9280b;
        }
        R0.q qVar2 = qVar;
        if ((i11 & 4) != 0) {
            i6 = f6.f9281c;
        }
        int i12 = i6;
        if ((i11 & 8) != 0) {
            i10 = f6.f9282d;
        }
        int i13 = i10;
        if ((i11 & 16) != 0) {
            obj = f6.f9283e;
        }
        return f6.a(abstractC1494h, qVar2, i12, i13, obj);
    }

    public final R0.F a(R0.AbstractC1494h abstractC1494h, R0.q qVar, int i6, int i10, java.lang.Object obj) {
        return new R0.F(abstractC1494h, qVar, i6, i10, obj, null);
    }

    public final R0.AbstractC1494h c() {
        return this.f9279a;
    }

    public final int d() {
        return this.f9281c;
    }

    public final R0.q e() {
        return this.f9280b;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof R0.F)) {
            return false;
        }
        R0.F f6 = (R0.F) obj;
        return p247y7.AbstractC7350t.b(this.f9279a, f6.f9279a) && p247y7.AbstractC7350t.b(this.f9280b, f6.f9280b) && R0.o.f(this.f9281c, f6.f9281c) && R0.p.h(this.f9282d, f6.f9282d) && p247y7.AbstractC7350t.b(this.f9283e, f6.f9283e);
    }

    public int hashCode() {
        R0.AbstractC1494h abstractC1494h = this.f9279a;
        int iHashCode = (((((((abstractC1494h == null ? 0 : abstractC1494h.hashCode()) * 31) + this.f9280b.hashCode()) * 31) + R0.o.g(this.f9281c)) * 31) + R0.p.i(this.f9282d)) * 31;
        java.lang.Object obj = this.f9283e;
        return iHashCode + (obj != null ? obj.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "TypefaceRequest(fontFamily=" + this.f9279a + ", fontWeight=" + this.f9280b + ", fontStyle=" + ((java.lang.Object) R0.o.h(this.f9281c)) + ", fontSynthesis=" + ((java.lang.Object) R0.p.j(this.f9282d)) + ", resourceLoaderCacheKey=" + this.f9283e + ')';
    }
}
