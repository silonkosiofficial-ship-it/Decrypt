package p190t;

/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p237x7.l f54549a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p200u.I f54550b;

    public y(p237x7.l lVar, p200u.I i6) {
        this.f54549a = lVar;
        this.f54550b = i6;
    }

    public final p200u.I a() {
        return this.f54550b;
    }

    public final p237x7.l b() {
        return this.f54549a;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p190t.y)) {
            return false;
        }
        p190t.y yVar = (p190t.y) obj;
        return p247y7.AbstractC7350t.b(this.f54549a, yVar.f54549a) && p247y7.AbstractC7350t.b(this.f54550b, yVar.f54550b);
    }

    public int hashCode() {
        return (this.f54549a.hashCode() * 31) + this.f54550b.hashCode();
    }

    public java.lang.String toString() {
        return "Slide(slideOffset=" + this.f54549a + ", animationSpec=" + this.f54550b + ')';
    }
}
