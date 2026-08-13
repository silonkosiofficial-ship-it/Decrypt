package E4;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements E4.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f2106a;

    public a(float f6) {
        this.f2106a = f6;
    }

    @Override // E4.c
    public float a(android.graphics.RectF rectF) {
        return this.f2106a;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof E4.a) && this.f2106a == ((E4.a) obj).f2106a;
    }

    public int hashCode() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{java.lang.Float.valueOf(this.f2106a)});
    }
}
