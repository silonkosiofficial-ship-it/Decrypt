package p200u;

/* JADX INFO: renamed from: u.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7183n extends p200u.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f54962a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f54963b;

    public C7183n(float f6) {
        super(null);
        this.f54962a = f6;
        this.f54963b = 1;
    }

    @Override // p200u.r
    public float a(int i6) {
        if (i6 == 0) {
            return this.f54962a;
        }
        return 0.0f;
    }

    @Override // p200u.r
    public int b() {
        return this.f54963b;
    }

    @Override // p200u.r
    public void d() {
        this.f54962a = 0.0f;
    }

    @Override // p200u.r
    public void e(int i6, float f6) {
        if (i6 == 0) {
            this.f54962a = f6;
        }
    }

    public boolean equals(java.lang.Object obj) {
        return (obj instanceof p200u.C7183n) && ((p200u.C7183n) obj).f54962a == this.f54962a;
    }

    public final float f() {
        return this.f54962a;
    }

    @Override // p200u.r
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public p200u.C7183n c() {
        return new p200u.C7183n(0.0f);
    }

    public int hashCode() {
        return java.lang.Float.floatToIntBits(this.f54962a);
    }

    public java.lang.String toString() {
        return "AnimationVector1D: value = " + this.f54962a;
    }
}
