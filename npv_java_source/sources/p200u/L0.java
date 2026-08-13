package p200u;

/* JADX INFO: loaded from: classes.dex */
public final class L0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p200u.r f54688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p200u.F f54689b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f54690c;

    private L0(p200u.r rVar, p200u.F f6, int i6) {
        this.f54688a = rVar;
        this.f54689b = f6;
        this.f54690c = i6;
    }

    public /* synthetic */ L0(p200u.r rVar, p200u.F f6, int i6, p247y7.AbstractC7342k abstractC7342k) {
        this(rVar, f6, i6);
    }

    public final int a() {
        return this.f54690c;
    }

    public final p200u.F b() {
        return this.f54689b;
    }

    public final p200u.r c() {
        return this.f54688a;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p200u.L0)) {
            return false;
        }
        p200u.L0 l6 = (p200u.L0) obj;
        return p247y7.AbstractC7350t.b(this.f54688a, l6.f54688a) && p247y7.AbstractC7350t.b(this.f54689b, l6.f54689b) && p200u.AbstractC7193u.c(this.f54690c, l6.f54690c);
    }

    public int hashCode() {
        return (((this.f54688a.hashCode() * 31) + this.f54689b.hashCode()) * 31) + p200u.AbstractC7193u.d(this.f54690c);
    }

    public java.lang.String toString() {
        return "VectorizedKeyframeSpecElementInfo(vectorValue=" + this.f54688a + ", easing=" + this.f54689b + ", arcMode=" + ((java.lang.Object) p200u.AbstractC7193u.e(this.f54690c)) + ')';
    }
}
