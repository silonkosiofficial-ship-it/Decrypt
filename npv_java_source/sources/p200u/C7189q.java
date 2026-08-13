package p200u;

/* JADX INFO: renamed from: u.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7189q extends p200u.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f54976a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f54977b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f54978c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f54979d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f54980e;

    public C7189q(float f6, float f10, float f11, float f12) {
        super(null);
        this.f54976a = f6;
        this.f54977b = f10;
        this.f54978c = f11;
        this.f54979d = f12;
        this.f54980e = 4;
    }

    @Override // p200u.r
    public float a(int i6) {
        if (i6 == 0) {
            return this.f54976a;
        }
        if (i6 == 1) {
            return this.f54977b;
        }
        if (i6 == 2) {
            return this.f54978c;
        }
        if (i6 != 3) {
            return 0.0f;
        }
        return this.f54979d;
    }

    @Override // p200u.r
    public int b() {
        return this.f54980e;
    }

    @Override // p200u.r
    public void d() {
        this.f54976a = 0.0f;
        this.f54977b = 0.0f;
        this.f54978c = 0.0f;
        this.f54979d = 0.0f;
    }

    @Override // p200u.r
    public void e(int i6, float f6) {
        if (i6 == 0) {
            this.f54976a = f6;
            return;
        }
        if (i6 == 1) {
            this.f54977b = f6;
        } else if (i6 == 2) {
            this.f54978c = f6;
        } else {
            if (i6 != 3) {
                return;
            }
            this.f54979d = f6;
        }
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof p200u.C7189q) {
            p200u.C7189q c7189q = (p200u.C7189q) obj;
            if (c7189q.f54976a == this.f54976a && c7189q.f54977b == this.f54977b && c7189q.f54978c == this.f54978c && c7189q.f54979d == this.f54979d) {
                return true;
            }
        }
        return false;
    }

    public final float f() {
        return this.f54976a;
    }

    public final float g() {
        return this.f54977b;
    }

    public final float h() {
        return this.f54978c;
    }

    public int hashCode() {
        return (((((java.lang.Float.floatToIntBits(this.f54976a) * 31) + java.lang.Float.floatToIntBits(this.f54977b)) * 31) + java.lang.Float.floatToIntBits(this.f54978c)) * 31) + java.lang.Float.floatToIntBits(this.f54979d);
    }

    public final float i() {
        return this.f54979d;
    }

    @Override // p200u.r
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public p200u.C7189q c() {
        return new p200u.C7189q(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public java.lang.String toString() {
        return "AnimationVector4D: v1 = " + this.f54976a + ", v2 = " + this.f54977b + ", v3 = " + this.f54978c + ", v4 = " + this.f54979d;
    }
}
