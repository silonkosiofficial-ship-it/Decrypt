package X0;

/* JADX INFO: loaded from: classes.dex */
final class c implements X0.o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p141o0.a2 f15576b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f15577c;

    public c(p141o0.a2 a2Var, float f6) {
        this.f15576b = a2Var;
        this.f15577c = f6;
    }

    @Override // X0.o
    public float a() {
        return this.f15577c;
    }

    public final p141o0.a2 b() {
        return this.f15576b;
    }

    @Override // X0.o
    public long c() {
        return p141o0.C7016y0.f52264b.g();
    }

    @Override // X0.o
    public /* synthetic */ X0.o d(p237x7.a aVar) {
        return X0.n.b(this, aVar);
    }

    @Override // X0.o
    public /* synthetic */ X0.o e(X0.o oVar) {
        return X0.n.a(this, oVar);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof X0.c)) {
            return false;
        }
        X0.c cVar = (X0.c) obj;
        return p247y7.AbstractC7350t.b(this.f15576b, cVar.f15576b) && java.lang.Float.compare(this.f15577c, cVar.f15577c) == 0;
    }

    @Override // X0.o
    public p141o0.AbstractC6984n0 f() {
        return this.f15576b;
    }

    public int hashCode() {
        return (this.f15576b.hashCode() * 31) + java.lang.Float.floatToIntBits(this.f15577c);
    }

    public java.lang.String toString() {
        return "BrushStyle(value=" + this.f15576b + ", alpha=" + this.f15577c + ')';
    }
}
