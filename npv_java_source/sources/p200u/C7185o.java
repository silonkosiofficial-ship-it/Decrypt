package p200u;

/* JADX INFO: renamed from: u.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7185o extends p200u.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f54966a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f54967b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f54968c;

    public C7185o(float f6, float f10) {
        super(null);
        this.f54966a = f6;
        this.f54967b = f10;
        this.f54968c = 2;
    }

    @Override // p200u.r
    public float a(int i6) {
        if (i6 == 0) {
            return this.f54966a;
        }
        if (i6 != 1) {
            return 0.0f;
        }
        return this.f54967b;
    }

    @Override // p200u.r
    public int b() {
        return this.f54968c;
    }

    @Override // p200u.r
    public void d() {
        this.f54966a = 0.0f;
        this.f54967b = 0.0f;
    }

    @Override // p200u.r
    public void e(int i6, float f6) {
        if (i6 == 0) {
            this.f54966a = f6;
        } else {
            if (i6 != 1) {
                return;
            }
            this.f54967b = f6;
        }
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof p200u.C7185o) {
            p200u.C7185o c7185o = (p200u.C7185o) obj;
            if (c7185o.f54966a == this.f54966a && c7185o.f54967b == this.f54967b) {
                return true;
            }
        }
        return false;
    }

    public final float f() {
        return this.f54966a;
    }

    public final float g() {
        return this.f54967b;
    }

    @Override // p200u.r
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public p200u.C7185o c() {
        return new p200u.C7185o(0.0f, 0.0f);
    }

    public int hashCode() {
        return (java.lang.Float.floatToIntBits(this.f54966a) * 31) + java.lang.Float.floatToIntBits(this.f54967b);
    }

    public java.lang.String toString() {
        return "AnimationVector2D: v1 = " + this.f54966a + ", v2 = " + this.f54967b;
    }
}
