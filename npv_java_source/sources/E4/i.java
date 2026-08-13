package E4;

/* JADX INFO: loaded from: classes3.dex */
public final class i implements E4.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f2160a;

    public i(float f6) {
        this.f2160a = f6;
    }

    private static float b(android.graphics.RectF rectF) {
        return java.lang.Math.min(rectF.width(), rectF.height());
    }

    @Override // E4.c
    public float a(android.graphics.RectF rectF) {
        return this.f2160a * b(rectF);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof E4.i) && this.f2160a == ((E4.i) obj).f2160a;
    }

    public int hashCode() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{java.lang.Float.valueOf(this.f2160a)});
    }
}
