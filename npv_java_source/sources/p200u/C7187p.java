package p200u;

/* JADX INFO: renamed from: u.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7187p extends p200u.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f54969a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f54970b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f54971c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f54972d;

    public C7187p(float f6, float f10, float f11) {
        super(null);
        this.f54969a = f6;
        this.f54970b = f10;
        this.f54971c = f11;
        this.f54972d = 3;
    }

    @Override // p200u.r
    public float a(int i6) {
        if (i6 == 0) {
            return this.f54969a;
        }
        if (i6 == 1) {
            return this.f54970b;
        }
        if (i6 != 2) {
            return 0.0f;
        }
        return this.f54971c;
    }

    @Override // p200u.r
    public int b() {
        return this.f54972d;
    }

    @Override // p200u.r
    public void d() {
        this.f54969a = 0.0f;
        this.f54970b = 0.0f;
        this.f54971c = 0.0f;
    }

    @Override // p200u.r
    public void e(int i6, float f6) {
        if (i6 == 0) {
            this.f54969a = f6;
        } else if (i6 == 1) {
            this.f54970b = f6;
        } else {
            if (i6 != 2) {
                return;
            }
            this.f54971c = f6;
        }
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof p200u.C7187p) {
            p200u.C7187p c7187p = (p200u.C7187p) obj;
            if (c7187p.f54969a == this.f54969a && c7187p.f54970b == this.f54970b && c7187p.f54971c == this.f54971c) {
                return true;
            }
        }
        return false;
    }

    @Override // p200u.r
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public p200u.C7187p c() {
        return new p200u.C7187p(0.0f, 0.0f, 0.0f);
    }

    public int hashCode() {
        return (((java.lang.Float.floatToIntBits(this.f54969a) * 31) + java.lang.Float.floatToIntBits(this.f54970b)) * 31) + java.lang.Float.floatToIntBits(this.f54971c);
    }

    public java.lang.String toString() {
        return "AnimationVector3D: v1 = " + this.f54969a + ", v2 = " + this.f54970b + ", v3 = " + this.f54971c;
    }
}
