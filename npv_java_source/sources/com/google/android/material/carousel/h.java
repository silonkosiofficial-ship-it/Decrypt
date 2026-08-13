package com.google.android.material.carousel;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends com.google.android.material.carousel.d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int[] f43090d = {1};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int[] f43091e = {1, 0};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f43092c = 0;

    @Override // com.google.android.material.carousel.d
    com.google.android.material.carousel.f g(com.google.android.material.carousel.b bVar, android.view.View view) {
        float fC = bVar.c();
        if (bVar.f()) {
            fC = bVar.b();
        }
        androidx.recyclerview.widget.RecyclerView.q qVar = (androidx.recyclerview.widget.RecyclerView.q) view.getLayoutParams();
        float f6 = ((android.view.ViewGroup.MarginLayoutParams) qVar).topMargin + ((android.view.ViewGroup.MarginLayoutParams) qVar).bottomMargin;
        float measuredHeight = view.getMeasuredHeight();
        if (bVar.f()) {
            f6 = ((android.view.ViewGroup.MarginLayoutParams) qVar).leftMargin + ((android.view.ViewGroup.MarginLayoutParams) qVar).rightMargin;
            measuredHeight = view.getMeasuredWidth();
        }
        float f10 = f6;
        float fD = d() + f10;
        float fMax = java.lang.Math.max(c() + f10, fD);
        float fMin = java.lang.Math.min(measuredHeight + f10, fC);
        float fA = p222w1.a.a((measuredHeight / 3.0f) + f10, fD + f10, fMax + f10);
        float f11 = (fMin + fA) / 2.0f;
        int[] iArrA = f43090d;
        if (fC < 2.0f * fD) {
            iArrA = new int[]{0};
        }
        int[] iArrA2 = f43091e;
        if (bVar.e() == 1) {
            iArrA = com.google.android.material.carousel.d.a(iArrA);
            iArrA2 = com.google.android.material.carousel.d.a(iArrA2);
        }
        int[] iArr = iArrA;
        int[] iArr2 = iArrA2;
        int iMax = (int) java.lang.Math.max(1.0d, java.lang.Math.floor(((fC - (com.google.android.material.carousel.e.i(iArr2) * f11)) - (com.google.android.material.carousel.e.i(iArr) * fMax)) / fMin));
        int iCeil = (int) java.lang.Math.ceil(fC / fMin);
        int i6 = (iCeil - iMax) + 1;
        int[] iArr3 = new int[i6];
        for (int i10 = 0; i10 < i6; i10++) {
            iArr3[i10] = iCeil - i10;
        }
        com.google.android.material.carousel.a aVarC = com.google.android.material.carousel.a.c(fC, fA, fD, fMax, iArr, f11, iArr2, fMin, iArr3);
        this.f43092c = aVarC.e();
        if (i(aVarC, bVar.a())) {
            aVarC = com.google.android.material.carousel.a.c(fC, fA, fD, fMax, new int[]{aVarC.f43051c}, f11, new int[]{aVarC.f43052d}, fMin, new int[]{aVarC.f43055g});
        }
        return com.google.android.material.carousel.e.d(view.getContext(), f10, fC, aVarC, bVar.e());
    }

    @Override // com.google.android.material.carousel.d
    boolean h(com.google.android.material.carousel.b bVar, int i6) {
        return (i6 < this.f43092c && bVar.a() >= this.f43092c) || (i6 >= this.f43092c && bVar.a() < this.f43092c);
    }

    boolean i(com.google.android.material.carousel.a aVar, int i6) {
        int iE = aVar.e() - i6;
        boolean z6 = iE > 0 && (aVar.f43051c > 0 || aVar.f43052d > 1);
        while (iE > 0) {
            int i10 = aVar.f43051c;
            if (i10 > 0) {
                aVar.f43051c = i10 - 1;
            } else {
                int i11 = aVar.f43052d;
                if (i11 > 1) {
                    aVar.f43052d = i11 - 1;
                }
            }
            iE--;
        }
        return z6;
    }
}
