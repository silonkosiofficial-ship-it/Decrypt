package p190t;

/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f54536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p200u.I f54537b;

    public o(float f6, p200u.I i6) {
        this.f54536a = f6;
        this.f54537b = i6;
    }

    public final float a() {
        return this.f54536a;
    }

    public final p200u.I b() {
        return this.f54537b;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p190t.o)) {
            return false;
        }
        p190t.o oVar = (p190t.o) obj;
        return java.lang.Float.compare(this.f54536a, oVar.f54536a) == 0 && p247y7.AbstractC7350t.b(this.f54537b, oVar.f54537b);
    }

    public int hashCode() {
        return (java.lang.Float.floatToIntBits(this.f54536a) * 31) + this.f54537b.hashCode();
    }

    public java.lang.String toString() {
        return "Fade(alpha=" + this.f54536a + ", animationSpec=" + this.f54537b + ')';
    }
}
