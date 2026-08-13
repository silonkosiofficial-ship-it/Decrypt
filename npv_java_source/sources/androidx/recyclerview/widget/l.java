package androidx.recyclerview.widget;

/* JADX INFO: loaded from: classes.dex */
abstract class l {
    static int a(androidx.recyclerview.widget.RecyclerView.A a6, androidx.recyclerview.widget.i iVar, android.view.View view, android.view.View view2, androidx.recyclerview.widget.RecyclerView.p pVar, boolean z6) {
        if (pVar.O() == 0 || a6.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z6) {
            return java.lang.Math.abs(pVar.l0(view) - pVar.l0(view2)) + 1;
        }
        return java.lang.Math.min(iVar.n(), iVar.d(view2) - iVar.g(view));
    }

    static int b(androidx.recyclerview.widget.RecyclerView.A a6, androidx.recyclerview.widget.i iVar, android.view.View view, android.view.View view2, androidx.recyclerview.widget.RecyclerView.p pVar, boolean z6, boolean z10) {
        if (pVar.O() == 0 || a6.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int iMax = z10 ? java.lang.Math.max(0, (a6.b() - java.lang.Math.max(pVar.l0(view), pVar.l0(view2))) - 1) : java.lang.Math.max(0, java.lang.Math.min(pVar.l0(view), pVar.l0(view2)));
        if (z6) {
            return java.lang.Math.round((iMax * (java.lang.Math.abs(iVar.d(view2) - iVar.g(view)) / (java.lang.Math.abs(pVar.l0(view) - pVar.l0(view2)) + 1))) + (iVar.m() - iVar.g(view)));
        }
        return iMax;
    }

    static int c(androidx.recyclerview.widget.RecyclerView.A a6, androidx.recyclerview.widget.i iVar, android.view.View view, android.view.View view2, androidx.recyclerview.widget.RecyclerView.p pVar, boolean z6) {
        if (pVar.O() == 0 || a6.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z6) {
            return a6.b();
        }
        return (int) (((iVar.d(view2) - iVar.g(view)) / (java.lang.Math.abs(pVar.l0(view) - pVar.l0(view2)) + 1)) * a6.b());
    }
}
