package V;

/* JADX INFO: loaded from: classes.dex */
public final class F implements V.M1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p237x7.l f14657a;

    public F(p237x7.l lVar) {
        this.f14657a = lVar;
    }

    @Override // V.M1
    public java.lang.Object a(V.H0 h6) {
        return this.f14657a.l(h6);
    }

    public final p237x7.l b() {
        return this.f14657a;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof V.F) && p247y7.AbstractC7350t.b(this.f14657a, ((V.F) obj).f14657a);
    }

    public int hashCode() {
        return this.f14657a.hashCode();
    }

    public java.lang.String toString() {
        return "ComputedValueHolder(compute=" + this.f14657a + ')';
    }
}
