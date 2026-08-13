package S;

/* JADX INFO: renamed from: S.d0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1540d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.Object f10877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p237x7.q f10878b;

    public C1540d0(java.lang.Object obj, p237x7.q qVar) {
        this.f10877a = obj;
        this.f10878b = qVar;
    }

    public final java.lang.Object a() {
        return this.f10877a;
    }

    public final p237x7.q b() {
        return this.f10878b;
    }

    public final java.lang.Object c() {
        return this.f10877a;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof S.C1540d0)) {
            return false;
        }
        S.C1540d0 c1540d0 = (S.C1540d0) obj;
        return p247y7.AbstractC7350t.b(this.f10877a, c1540d0.f10877a) && p247y7.AbstractC7350t.b(this.f10878b, c1540d0.f10878b);
    }

    public int hashCode() {
        java.lang.Object obj = this.f10877a;
        return ((obj == null ? 0 : obj.hashCode()) * 31) + this.f10878b.hashCode();
    }

    public java.lang.String toString() {
        return "FadeInFadeOutAnimationItem(key=" + this.f10877a + ", transition=" + this.f10878b + ')';
    }
}
