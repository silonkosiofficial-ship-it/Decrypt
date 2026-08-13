package S0;

/* JADX INFO: loaded from: classes.dex */
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final M0.C1332d f12351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final S0.L f12352b;

    public e0(M0.C1332d c1332d, S0.L l6) {
        this.f12351a = c1332d;
        this.f12352b = l6;
    }

    public final S0.L a() {
        return this.f12352b;
    }

    public final M0.C1332d b() {
        return this.f12351a;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof S0.e0)) {
            return false;
        }
        S0.e0 e0Var = (S0.e0) obj;
        return p247y7.AbstractC7350t.b(this.f12351a, e0Var.f12351a) && p247y7.AbstractC7350t.b(this.f12352b, e0Var.f12352b);
    }

    public int hashCode() {
        return (this.f12351a.hashCode() * 31) + this.f12352b.hashCode();
    }

    public java.lang.String toString() {
        return "TransformedText(text=" + ((java.lang.Object) this.f12351a) + ", offsetMapping=" + this.f12352b + ')';
    }
}
