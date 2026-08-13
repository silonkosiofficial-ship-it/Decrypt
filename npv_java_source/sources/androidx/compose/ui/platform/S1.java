package androidx.compose.ui.platform;

/* JADX INFO: loaded from: classes.dex */
public abstract class S1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final android.view.ViewGroup.LayoutParams f19978a = new android.view.ViewGroup.LayoutParams(-2, -2);

    public static final V.InterfaceC1700b1 a(F0.J j6, V.AbstractC1744s abstractC1744s) {
        return V.AbstractC1750v.b(new F0.H0(j6), abstractC1744s);
    }

    private static final V.r b(androidx.compose.ui.platform.r rVar, V.AbstractC1744s abstractC1744s, p237x7.p pVar) {
        if (androidx.compose.ui.platform.E0.b() && rVar.getTag(p071h0.l.f45815K) == null) {
            rVar.setTag(p071h0.l.f45815K, java.util.Collections.newSetFromMap(new java.util.WeakHashMap()));
        }
        V.r rVarA = V.AbstractC1750v.a(new F0.H0(rVar.getRoot()), abstractC1744s);
        java.lang.Object tag = rVar.getView().getTag(p071h0.l.f45816L);
        androidx.compose.ui.platform.P1 p6 = tag instanceof androidx.compose.ui.platform.P1 ? (androidx.compose.ui.platform.P1) tag : null;
        if (p6 == null) {
            p6 = new androidx.compose.ui.platform.P1(rVar, rVarA);
            rVar.getView().setTag(p071h0.l.f45816L, p6);
        }
        p6.h(pVar);
        if (!p247y7.AbstractC7350t.b(rVar.getCoroutineContext(), abstractC1744s.h())) {
            rVar.setCoroutineContext(abstractC1744s.h());
        }
        return p6;
    }

    public static final V.r c(androidx.compose.ui.platform.AbstractC1920a abstractC1920a, V.AbstractC1744s abstractC1744s, p237x7.p pVar) {
        androidx.compose.ui.platform.C1987y0.f20426a.b();
        androidx.compose.ui.platform.r rVar = null;
        if (abstractC1920a.getChildCount() > 0) {
            android.view.View childAt = abstractC1920a.getChildAt(0);
            if (childAt instanceof androidx.compose.ui.platform.r) {
                rVar = (androidx.compose.ui.platform.r) childAt;
            }
        } else {
            abstractC1920a.removeAllViews();
        }
        if (rVar == null) {
            rVar = new androidx.compose.ui.platform.r(abstractC1920a.getContext(), abstractC1744s.h());
            abstractC1920a.addView(rVar.getView(), f19978a);
        }
        return b(rVar, abstractC1744s, pVar);
    }
}
