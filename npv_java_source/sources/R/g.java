package R;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f9182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f9183b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f9184c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f9185d;

    public g(float f6, float f10, float f11, float f12) {
        this.f9182a = f6;
        this.f9183b = f10;
        this.f9184c = f11;
        this.f9185d = f12;
    }

    public final float a() {
        return this.f9182a;
    }

    public final float b() {
        return this.f9183b;
    }

    public final float c() {
        return this.f9184c;
    }

    public final float d() {
        return this.f9185d;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof R.g)) {
            return false;
        }
        R.g gVar = (R.g) obj;
        return this.f9182a == gVar.f9182a && this.f9183b == gVar.f9183b && this.f9184c == gVar.f9184c && this.f9185d == gVar.f9185d;
    }

    public int hashCode() {
        return (((((java.lang.Float.floatToIntBits(this.f9182a) * 31) + java.lang.Float.floatToIntBits(this.f9183b)) * 31) + java.lang.Float.floatToIntBits(this.f9184c)) * 31) + java.lang.Float.floatToIntBits(this.f9185d);
    }

    public java.lang.String toString() {
        return "RippleAlpha(draggedAlpha=" + this.f9182a + ", focusedAlpha=" + this.f9183b + ", hoveredAlpha=" + this.f9184c + ", pressedAlpha=" + this.f9185d + ')';
    }
}
