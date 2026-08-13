package com.google.android.material.carousel;

/* JADX INFO: loaded from: classes3.dex */
abstract class e {
    static float a(float f6, float f10, int i6) {
        return f6 + (java.lang.Math.max(0, i6 - 1) * f10);
    }

    static float b(float f6, float f10, int i6) {
        return i6 > 0 ? f6 + (f10 / 2.0f) : f6;
    }

    static com.google.android.material.carousel.f c(android.content.Context context, float f6, float f10, com.google.android.material.carousel.a aVar) {
        float f11;
        float fMin = java.lang.Math.min(f(context) + f6, aVar.f43054f);
        float f12 = fMin / 2.0f;
        float f13 = 0.0f - f12;
        float fB = b(0.0f, aVar.f43050b, aVar.f43051c);
        float fJ = j(0.0f, a(fB, aVar.f43050b, (int) java.lang.Math.floor(aVar.f43051c / 2.0f)), aVar.f43050b, aVar.f43051c);
        float fB2 = b(fJ, aVar.f43053e, aVar.f43052d);
        float fJ2 = j(fJ, a(fB2, aVar.f43053e, (int) java.lang.Math.floor(aVar.f43052d / 2.0f)), aVar.f43053e, aVar.f43052d);
        float fB3 = b(fJ2, aVar.f43054f, aVar.f43055g);
        float fJ3 = j(fJ2, a(fB3, aVar.f43054f, aVar.f43055g), aVar.f43054f, aVar.f43055g);
        float fB4 = b(fJ3, aVar.f43053e, aVar.f43052d);
        float fB5 = b(j(fJ3, a(fB4, aVar.f43053e, (int) java.lang.Math.ceil(aVar.f43052d / 2.0f)), aVar.f43053e, aVar.f43052d), aVar.f43050b, aVar.f43051c);
        float f14 = f12 + f10;
        float fB6 = com.google.android.material.carousel.d.b(fMin, aVar.f43054f, f6);
        float fB7 = com.google.android.material.carousel.d.b(aVar.f43050b, aVar.f43054f, f6);
        float fB8 = com.google.android.material.carousel.d.b(aVar.f43053e, aVar.f43054f, f6);
        com.google.android.material.carousel.f.b bVarA = new com.google.android.material.carousel.f.b(aVar.f43054f, f10).a(f13, fB6, fMin);
        int i6 = aVar.f43051c;
        if (i6 > 0) {
            bVarA.g(fB, fB7, aVar.f43050b, (int) java.lang.Math.floor(i6 / 2.0f));
        }
        int i10 = aVar.f43052d;
        if (i10 > 0) {
            bVarA.g(fB2, fB8, aVar.f43053e, (int) java.lang.Math.floor(i10 / 2.0f));
        }
        bVarA.h(fB3, 0.0f, aVar.f43054f, aVar.f43055g, true);
        int i11 = aVar.f43052d;
        if (i11 > 0) {
            f11 = 2.0f;
            bVarA.g(fB4, fB8, aVar.f43053e, (int) java.lang.Math.ceil(i11 / 2.0f));
        } else {
            f11 = 2.0f;
        }
        int i12 = aVar.f43051c;
        if (i12 > 0) {
            bVarA.g(fB5, fB7, aVar.f43050b, (int) java.lang.Math.ceil(i12 / f11));
        }
        bVarA.a(f14, fB6, fMin);
        return bVarA.i();
    }

    static com.google.android.material.carousel.f d(android.content.Context context, float f6, float f10, com.google.android.material.carousel.a aVar, int i6) {
        return i6 == 1 ? c(context, f6, f10, aVar) : e(context, f6, f10, aVar);
    }

    static com.google.android.material.carousel.f e(android.content.Context context, float f6, float f10, com.google.android.material.carousel.a aVar) {
        float fMin = java.lang.Math.min(f(context) + f6, aVar.f43054f);
        float f11 = fMin / 2.0f;
        float f12 = 0.0f - f11;
        float fB = b(0.0f, aVar.f43054f, aVar.f43055g);
        float fJ = j(0.0f, a(fB, aVar.f43054f, aVar.f43055g), aVar.f43054f, aVar.f43055g);
        float fB2 = b(fJ, aVar.f43053e, aVar.f43052d);
        float fB3 = b(j(fJ, fB2, aVar.f43053e, aVar.f43052d), aVar.f43050b, aVar.f43051c);
        float f13 = f11 + f10;
        float fB4 = com.google.android.material.carousel.d.b(fMin, aVar.f43054f, f6);
        float fB5 = com.google.android.material.carousel.d.b(aVar.f43050b, aVar.f43054f, f6);
        float fB6 = com.google.android.material.carousel.d.b(aVar.f43053e, aVar.f43054f, f6);
        com.google.android.material.carousel.f.b bVarH = new com.google.android.material.carousel.f.b(aVar.f43054f, f10).a(f12, fB4, fMin).h(fB, 0.0f, aVar.f43054f, aVar.f43055g, true);
        if (aVar.f43052d > 0) {
            bVarH.b(fB2, fB6, aVar.f43053e);
        }
        int i6 = aVar.f43051c;
        if (i6 > 0) {
            bVarH.g(fB3, fB5, aVar.f43050b, i6);
        }
        bVarH.a(f13, fB4, fMin);
        return bVarH.i();
    }

    static float f(android.content.Context context) {
        return context.getResources().getDimension(p125m4.c.f50584m);
    }

    static float g(android.content.Context context) {
        return context.getResources().getDimension(p125m4.c.f50585n);
    }

    static float h(android.content.Context context) {
        return context.getResources().getDimension(p125m4.c.f50586o);
    }

    static int i(int[] iArr) {
        int i6 = Integer.MIN_VALUE;
        for (int i10 : iArr) {
            if (i10 > i6) {
                i6 = i10;
            }
        }
        return i6;
    }

    static float j(float f6, float f10, float f11, int i6) {
        return i6 > 0 ? f10 + (f11 / 2.0f) : f6;
    }
}
