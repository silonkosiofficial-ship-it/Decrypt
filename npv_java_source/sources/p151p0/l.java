package p151p0;

/* JADX INFO: loaded from: classes.dex */
public final class l extends p151p0.c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final p0.l.a f52669e = new p0.l.a(null);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }
    }

    public l(java.lang.String str, int i6) {
        super(str, p151p0.b.f52614a.a(), i6, null);
    }

    @Override // p151p0.c
    public float c(int i6) {
        return i6 == 0 ? 100.0f : 128.0f;
    }

    @Override // p151p0.c
    public float d(int i6) {
        return i6 == 0 ? 0.0f : -128.0f;
    }

    @Override // p151p0.c
    public long h(float f6, float f10, float f11) {
        if (f6 < 0.0f) {
            f6 = 0.0f;
        }
        if (f6 > 100.0f) {
            f6 = 100.0f;
        }
        if (f10 < -128.0f) {
            f10 = -128.0f;
        }
        if (f10 > 128.0f) {
            f10 = 128.0f;
        }
        float f12 = (f6 + 16.0f) / 116.0f;
        float f13 = (f10 * 0.002f) + f12;
        float f14 = f13 > 0.20689656f ? f13 * f13 * f13 : (f13 - 0.13793103f) * 0.12841855f;
        float f15 = f12 > 0.20689656f ? f12 * f12 * f12 : (f12 - 0.13793103f) * 0.12841855f;
        p151p0.k kVar = p151p0.k.f52658a;
        return (((long) java.lang.Float.floatToRawIntBits(f15 * kVar.c()[1])) & 4294967295L) | (((long) java.lang.Float.floatToRawIntBits(f14 * kVar.c()[0])) << 32);
    }

    @Override // p151p0.c
    public float i(float f6, float f10, float f11) {
        if (f6 < 0.0f) {
            f6 = 0.0f;
        }
        if (f6 > 100.0f) {
            f6 = 100.0f;
        }
        if (f11 < -128.0f) {
            f11 = -128.0f;
        }
        if (f11 > 128.0f) {
            f11 = 128.0f;
        }
        float f12 = ((f6 + 16.0f) / 116.0f) - (f11 * 0.005f);
        return (f12 > 0.20689656f ? f12 * f12 * f12 : 0.12841855f * (f12 - 0.13793103f)) * p151p0.k.f52658a.c()[2];
    }

    @Override // p151p0.c
    public long j(float f6, float f10, float f11, float f12, p151p0.c cVar) {
        p151p0.k kVar = p151p0.k.f52658a;
        float f13 = f6 / kVar.c()[0];
        float f14 = f10 / kVar.c()[1];
        float f15 = f11 / kVar.c()[2];
        float fCbrt = f13 > 0.008856452f ? (float) java.lang.Math.cbrt(f13) : (f13 * 7.787037f) + 0.13793103f;
        float fCbrt2 = f14 > 0.008856452f ? (float) java.lang.Math.cbrt(f14) : (f14 * 7.787037f) + 0.13793103f;
        float f16 = (116.0f * fCbrt2) - 16.0f;
        float f17 = (fCbrt - fCbrt2) * 500.0f;
        float fCbrt3 = (fCbrt2 - (f15 > 0.008856452f ? (float) java.lang.Math.cbrt(f15) : (f15 * 7.787037f) + 0.13793103f)) * 200.0f;
        if (f16 < 0.0f) {
            f16 = 0.0f;
        }
        if (f16 > 100.0f) {
            f16 = 100.0f;
        }
        if (f17 < -128.0f) {
            f17 = -128.0f;
        }
        if (f17 > 128.0f) {
            f17 = 128.0f;
        }
        if (fCbrt3 < -128.0f) {
            fCbrt3 = -128.0f;
        }
        return p141o0.A0.a(f16, f17, fCbrt3 <= 128.0f ? fCbrt3 : 128.0f, f12, cVar);
    }
}
