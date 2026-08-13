package p190t;

/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f54545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f54546b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p200u.I f54547c;

    private v(float f6, long j6, p200u.I i6) {
        this.f54545a = f6;
        this.f54546b = j6;
        this.f54547c = i6;
    }

    public /* synthetic */ v(float f6, long j6, p200u.I i6, p247y7.AbstractC7342k abstractC7342k) {
        this(f6, j6, i6);
    }

    public final p200u.I a() {
        return this.f54547c;
    }

    public final float b() {
        return this.f54545a;
    }

    public final long c() {
        return this.f54546b;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p190t.v)) {
            return false;
        }
        p190t.v vVar = (p190t.v) obj;
        return java.lang.Float.compare(this.f54545a, vVar.f54545a) == 0 && androidx.compose.ui.graphics.f.e(this.f54546b, vVar.f54546b) && p247y7.AbstractC7350t.b(this.f54547c, vVar.f54547c);
    }

    public int hashCode() {
        return (((java.lang.Float.floatToIntBits(this.f54545a) * 31) + androidx.compose.ui.graphics.f.h(this.f54546b)) * 31) + this.f54547c.hashCode();
    }

    public java.lang.String toString() {
        return "Scale(scale=" + this.f54545a + ", transformOrigin=" + ((java.lang.Object) androidx.compose.ui.graphics.f.i(this.f54546b)) + ", animationSpec=" + this.f54547c + ')';
    }
}
