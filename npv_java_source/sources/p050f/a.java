package p050f;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final android.view.ViewGroup.LayoutParams f44770a = new android.view.ViewGroup.LayoutParams(-2, -2);

    public static final void a(p040e.j jVar, V.AbstractC1744s abstractC1744s, p237x7.p pVar) {
        android.view.View childAt = ((android.view.ViewGroup) jVar.getWindow().getDecorView().findViewById(android.R.id.content)).getChildAt(0);
        androidx.compose.ui.platform.C1963o0 c1963o0 = childAt instanceof androidx.compose.ui.platform.C1963o0 ? (androidx.compose.ui.platform.C1963o0) childAt : null;
        if (c1963o0 != null) {
            c1963o0.setParentCompositionContext(abstractC1744s);
            c1963o0.setContent(pVar);
            return;
        }
        androidx.compose.ui.platform.C1963o0 c1963o1 = new androidx.compose.ui.platform.C1963o0(jVar, null, 0, 6, null);
        c1963o1.setParentCompositionContext(abstractC1744s);
        c1963o1.setContent(pVar);
        c(jVar);
        jVar.setContentView(c1963o1, f44770a);
    }

    public static /* synthetic */ void b(p040e.j jVar, V.AbstractC1744s abstractC1744s, p237x7.p pVar, int i6, java.lang.Object obj) {
        if ((i6 & 1) != 0) {
            abstractC1744s = null;
        }
        a(jVar, abstractC1744s, pVar);
    }

    private static final void c(p040e.j jVar) {
        android.view.View decorView = jVar.getWindow().getDecorView();
        if (androidx.lifecycle.Z.a(decorView) == null) {
            androidx.lifecycle.Z.b(decorView, jVar);
        }
        if (androidx.lifecycle.a0.a(decorView) == null) {
            androidx.lifecycle.a0.b(decorView, jVar);
        }
        if (p233x2.g.a(decorView) == null) {
            p233x2.g.b(decorView, jVar);
        }
    }
}
