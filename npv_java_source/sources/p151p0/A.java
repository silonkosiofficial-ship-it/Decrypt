package p151p0;

/* JADX INFO: loaded from: classes.dex */
public final class A extends p151p0.c {
    public A(java.lang.String str, int i6) {
        super(str, p151p0.b.f52614a.c(), i6, null);
    }

    @Override // p151p0.c
    public float c(int i6) {
        return 2.0f;
    }

    @Override // p151p0.c
    public float d(int i6) {
        return -2.0f;
    }

    @Override // p151p0.c
    public long h(float f6, float f10, float f11) {
        if (f6 < -2.0f) {
            f6 = -2.0f;
        }
        if (f6 > 2.0f) {
            f6 = 2.0f;
        }
        if (f10 < -2.0f) {
            f10 = -2.0f;
        }
        return (((long) java.lang.Float.floatToRawIntBits(f6)) << 32) | (((long) java.lang.Float.floatToRawIntBits(f10 <= 2.0f ? f10 : 2.0f)) & 4294967295L);
    }

    @Override // p151p0.c
    public float i(float f6, float f10, float f11) {
        if (f11 < -2.0f) {
            f11 = -2.0f;
        }
        if (f11 > 2.0f) {
            return 2.0f;
        }
        return f11;
    }

    @Override // p151p0.c
    public long j(float f6, float f10, float f11, float f12, p151p0.c cVar) {
        if (f6 < -2.0f) {
            f6 = -2.0f;
        }
        if (f6 > 2.0f) {
            f6 = 2.0f;
        }
        if (f10 < -2.0f) {
            f10 = -2.0f;
        }
        if (f10 > 2.0f) {
            f10 = 2.0f;
        }
        if (f11 < -2.0f) {
            f11 = -2.0f;
        }
        return p141o0.A0.a(f6, f10, f11 <= 2.0f ? f11 : 2.0f, f12, cVar);
    }
}
