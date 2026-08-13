package K0;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f5945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p237x7.a f5946b;

    public d(java.lang.String str, p237x7.a aVar) {
        this.f5945a = str;
        this.f5946b = aVar;
    }

    public final p237x7.a a() {
        return this.f5946b;
    }

    public final java.lang.String b() {
        return this.f5945a;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof K0.d)) {
            return false;
        }
        K0.d dVar = (K0.d) obj;
        return p247y7.AbstractC7350t.b(this.f5945a, dVar.f5945a) && this.f5946b == dVar.f5946b;
    }

    public int hashCode() {
        return (this.f5945a.hashCode() * 31) + this.f5946b.hashCode();
    }

    public java.lang.String toString() {
        return "CustomAccessibilityAction(label=" + this.f5945a + ", action=" + this.f5946b + ')';
    }
}
