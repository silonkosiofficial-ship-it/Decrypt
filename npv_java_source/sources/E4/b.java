package E4;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements E4.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final E4.c f2107a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f2108b;

    public b(float f6, E4.c cVar) {
        while (cVar instanceof E4.b) {
            cVar = ((E4.b) cVar).f2107a;
            f6 += ((E4.b) cVar).f2108b;
        }
        this.f2107a = cVar;
        this.f2108b = f6;
    }

    @Override // E4.c
    public float a(android.graphics.RectF rectF) {
        return java.lang.Math.max(0.0f, this.f2107a.a(rectF) + this.f2108b);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof E4.b)) {
            return false;
        }
        E4.b bVar = (E4.b) obj;
        return this.f2107a.equals(bVar.f2107a) && this.f2108b == bVar.f2108b;
    }

    public int hashCode() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{this.f2107a, java.lang.Float.valueOf(this.f2108b)});
    }
}
