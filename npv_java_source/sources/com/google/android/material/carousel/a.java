package com.google.android.material.carousel;

/* JADX INFO: loaded from: classes3.dex */
final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f43049a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    float f43050b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f43051c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f43052d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    float f43053e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    float f43054f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final int f43055g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final float f43056h;

    a(int i6, float f6, float f10, float f11, int i10, float f12, int i11, float f13, int i12, float f14) {
        this.f43049a = i6;
        this.f43050b = p222w1.a.a(f6, f10, f11);
        this.f43051c = i10;
        this.f43053e = f12;
        this.f43052d = i11;
        this.f43054f = f13;
        this.f43055g = i12;
        d(f14, f10, f11, f13);
        this.f43056h = b(f13);
    }

    private float a(float f6, int i6, float f10, int i10, int i11) {
        if (i6 <= 0) {
            f10 = 0.0f;
        }
        float f11 = i10 / 2.0f;
        return (f6 - ((i6 + f11) * f10)) / (i11 + f11);
    }

    private float b(float f6) {
        if (g()) {
            return java.lang.Math.abs(f6 - this.f43054f) * this.f43049a;
        }
        return Float.MAX_VALUE;
    }

    static com.google.android.material.carousel.a c(float f6, float f10, float f11, float f12, int[] iArr, float f13, int[] iArr2, float f14, int[] iArr3) {
        com.google.android.material.carousel.a aVar = null;
        int i6 = 1;
        for (int i10 : iArr3) {
            int length = iArr2.length;
            int i11 = 0;
            while (i11 < length) {
                int i12 = iArr2[i11];
                int length2 = iArr.length;
                int i13 = 0;
                while (i13 < length2) {
                    int i14 = i13;
                    int i15 = length2;
                    int i16 = i11;
                    int i17 = length;
                    com.google.android.material.carousel.a aVar2 = new com.google.android.material.carousel.a(i6, f10, f11, f12, iArr[i13], f13, i12, f14, i10, f6);
                    if (aVar == null || aVar2.f43056h < aVar.f43056h) {
                        if (aVar2.f43056h == 0.0f) {
                            return aVar2;
                        }
                        aVar = aVar2;
                    }
                    i6++;
                    i13 = i14 + 1;
                    length2 = i15;
                    i11 = i16;
                    length = i17;
                }
                i11++;
            }
        }
        return aVar;
    }

    private void d(float f6, float f10, float f11, float f12) {
        float f13;
        float f14 = f6 - f();
        int i6 = this.f43051c;
        if (i6 > 0 && f14 > 0.0f) {
            float f15 = this.f43050b;
            this.f43050b = f15 + java.lang.Math.min(f14 / i6, f11 - f15);
        } else if (i6 > 0 && f14 < 0.0f) {
            float f16 = this.f43050b;
            this.f43050b = f16 + java.lang.Math.max(f14 / i6, f10 - f16);
        }
        int i10 = this.f43051c;
        float f17 = i10 > 0 ? this.f43050b : 0.0f;
        this.f43050b = f17;
        float fA = a(f6, i10, f17, this.f43052d, this.f43055g);
        this.f43054f = fA;
        float f18 = (this.f43050b + fA) / 2.0f;
        this.f43053e = f18;
        int i11 = this.f43052d;
        if (i11 <= 0 || fA == f12) {
            return;
        }
        float f19 = (f12 - fA) * this.f43055g;
        float fMin = java.lang.Math.min(java.lang.Math.abs(f19), f18 * 0.1f * i11);
        if (f19 > 0.0f) {
            this.f43053e -= fMin / this.f43052d;
            f13 = this.f43054f + (fMin / this.f43055g);
        } else {
            this.f43053e += fMin / this.f43052d;
            f13 = this.f43054f - (fMin / this.f43055g);
        }
        this.f43054f = f13;
    }

    private float f() {
        return (this.f43054f * this.f43055g) + (this.f43053e * this.f43052d) + (this.f43050b * this.f43051c);
    }

    private boolean g() {
        int i6 = this.f43055g;
        if (i6 <= 0 || this.f43051c <= 0 || this.f43052d <= 0) {
            return i6 <= 0 || this.f43051c <= 0 || this.f43054f > this.f43050b;
        }
        float f6 = this.f43054f;
        float f10 = this.f43053e;
        return f6 > f10 && f10 > this.f43050b;
    }

    int e() {
        return this.f43051c + this.f43052d + this.f43055g;
    }

    public java.lang.String toString() {
        return "Arrangement [priority=" + this.f43049a + ", smallCount=" + this.f43051c + ", smallSize=" + this.f43050b + ", mediumCount=" + this.f43052d + ", mediumSize=" + this.f43053e + ", largeCount=" + this.f43055g + ", largeSize=" + this.f43054f + ", cost=" + this.f43056h + "]";
    }
}
