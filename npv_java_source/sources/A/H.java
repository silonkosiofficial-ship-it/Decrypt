package A;

/* JADX INFO: loaded from: classes.dex */
public final class H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f6a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f7b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private A.AbstractC0780n f8c;

    public H(float f6, boolean z6, A.AbstractC0780n abstractC0780n, A.r rVar) {
        this.f6a = f6;
        this.f7b = z6;
        this.f8c = abstractC0780n;
    }

    public /* synthetic */ H(float f6, boolean z6, A.AbstractC0780n abstractC0780n, A.r rVar, int i6, p247y7.AbstractC7342k abstractC7342k) {
        this((i6 & 1) != 0 ? 0.0f : f6, (i6 & 2) != 0 ? true : z6, (i6 & 4) != 0 ? null : abstractC0780n, (i6 & 8) != 0 ? null : rVar);
    }

    public final A.AbstractC0780n a() {
        return this.f8c;
    }

    public final boolean b() {
        return this.f7b;
    }

    public final A.r c() {
        return null;
    }

    public final float d() {
        return this.f6a;
    }

    public final void e(A.AbstractC0780n abstractC0780n) {
        this.f8c = abstractC0780n;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof A.H)) {
            return false;
        }
        A.H h6 = (A.H) obj;
        return java.lang.Float.compare(this.f6a, h6.f6a) == 0 && this.f7b == h6.f7b && p247y7.AbstractC7350t.b(this.f8c, h6.f8c) && p247y7.AbstractC7350t.b(null, null);
    }

    public final void f(boolean z6) {
        this.f7b = z6;
    }

    public final void g(float f6) {
        this.f6a = f6;
    }

    public int hashCode() {
        int iFloatToIntBits = ((java.lang.Float.floatToIntBits(this.f6a) * 31) + p190t.h.a(this.f7b)) * 31;
        A.AbstractC0780n abstractC0780n = this.f8c;
        return (iFloatToIntBits + (abstractC0780n == null ? 0 : abstractC0780n.hashCode())) * 31;
    }

    public java.lang.String toString() {
        return "RowColumnParentData(weight=" + this.f6a + ", fill=" + this.f7b + ", crossAxisAlignment=" + this.f8c + ", flowLayoutData=" + ((java.lang.Object) null) + ')';
    }
}
