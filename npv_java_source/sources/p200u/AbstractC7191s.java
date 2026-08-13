package p200u;

/* JADX INFO: renamed from: u.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7191s {
    public static final p200u.C7183n a(float f6) {
        return new p200u.C7183n(f6);
    }

    public static final p200u.C7185o b(float f6, float f10) {
        return new p200u.C7185o(f6, f10);
    }

    public static final p200u.C7187p c(float f6, float f10, float f11) {
        return new p200u.C7187p(f6, f10, f11);
    }

    public static final p200u.C7189q d(float f6, float f10, float f11, float f12) {
        return new p200u.C7189q(f6, f10, f11, f12);
    }

    public static final p200u.r e(p200u.r rVar) {
        p200u.r rVarG = g(rVar);
        int iB = rVarG.b();
        for (int i6 = 0; i6 < iB; i6++) {
            rVarG.e(i6, rVar.a(i6));
        }
        return rVarG;
    }

    public static final void f(p200u.r rVar, p200u.r rVar2) {
        int iB = rVar.b();
        for (int i6 = 0; i6 < iB; i6++) {
            rVar.e(i6, rVar2.a(i6));
        }
    }

    public static final p200u.r g(p200u.r rVar) {
        p200u.r rVarC = rVar.c();
        p247y7.AbstractC7350t.d(rVarC, "null cannot be cast to non-null type T of androidx.compose.animation.core.AnimationVectorsKt.newInstance");
        return rVarC;
    }
}
