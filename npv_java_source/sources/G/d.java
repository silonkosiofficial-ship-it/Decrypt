package G;

/* JADX INFO: loaded from: classes.dex */
final class d implements G.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f3009a;

    private d(float f6) {
        this.f3009a = f6;
    }

    public /* synthetic */ d(float f6, p247y7.AbstractC7342k abstractC7342k) {
        this(f6);
    }

    @Override // G.b
    public float a(long j6, Y0.e eVar) {
        return eVar.B0(this.f3009a);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof G.d) && Y0.i.s(this.f3009a, ((G.d) obj).f3009a);
    }

    public int hashCode() {
        return Y0.i.t(this.f3009a);
    }

    public java.lang.String toString() {
        return "CornerSize(size = " + this.f3009a + ".dp)";
    }
}
