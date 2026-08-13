package androidx.compose.ui.platform;

/* JADX INFO: loaded from: classes.dex */
public abstract class S {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static p237x7.l f19970a = androidx.compose.ui.platform.S.a.f19971D;

    static final class a extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final androidx.compose.ui.platform.S.a f19971D = new androidx.compose.ui.platform.S.a();

        a() {
            super(1);
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final S0.P l(S0.P p6) {
            return p6;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean e(android.view.View view, android.view.View view2) {
        if (p247y7.AbstractC7350t.b(view2, view)) {
            return false;
        }
        for (android.view.ViewParent parent = view2.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == view) {
                return true;
            }
        }
        return false;
    }

    private static final float f(float[] fArr, int i6, float[] fArr2, int i10) {
        int i11 = i6 * 4;
        return (fArr[i11] * fArr2[i10]) + (fArr[i11 + 1] * fArr2[4 + i10]) + (fArr[i11 + 2] * fArr2[8 + i10]) + (fArr[i11 + 3] * fArr2[12 + i10]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.platform.coreshims.d g(android.view.View view) {
        androidx.compose.ui.platform.coreshims.e.c(view, 1);
        return androidx.compose.ui.platform.coreshims.e.b(view);
    }

    public static final p237x7.l h() {
        return f19970a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(float[] fArr, float[] fArr2) {
        float f6 = f(fArr2, 0, fArr, 0);
        float f10 = f(fArr2, 0, fArr, 1);
        float f11 = f(fArr2, 0, fArr, 2);
        float f12 = f(fArr2, 0, fArr, 3);
        float f13 = f(fArr2, 1, fArr, 0);
        float f14 = f(fArr2, 1, fArr, 1);
        float f15 = f(fArr2, 1, fArr, 2);
        float f16 = f(fArr2, 1, fArr, 3);
        float f17 = f(fArr2, 2, fArr, 0);
        float f18 = f(fArr2, 2, fArr, 1);
        float f19 = f(fArr2, 2, fArr, 2);
        float f20 = f(fArr2, 2, fArr, 3);
        float f21 = f(fArr2, 3, fArr, 0);
        float f22 = f(fArr2, 3, fArr, 1);
        float f23 = f(fArr2, 3, fArr, 2);
        float f24 = f(fArr2, 3, fArr, 3);
        fArr[0] = f6;
        fArr[1] = f10;
        fArr[2] = f11;
        fArr[3] = f12;
        fArr[4] = f13;
        fArr[5] = f14;
        fArr[6] = f15;
        fArr[7] = f16;
        fArr[8] = f17;
        fArr[9] = f18;
        fArr[10] = f19;
        fArr[11] = f20;
        fArr[12] = f21;
        fArr[13] = f22;
        fArr[14] = f23;
        fArr[15] = f24;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(float[] fArr, float f6, float f10, float[] fArr2) {
        p141o0.J1.h(fArr2);
        p141o0.J1.q(fArr2, f6, f10, 0.0f, 4, null);
        i(fArr, fArr2);
    }
}
