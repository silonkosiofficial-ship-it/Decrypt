package androidx.compose.ui.viewinterop;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d(android.view.View view, android.view.View view2) {
        for (android.view.ViewParent parent = view2.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == view.getParent()) {
                return true;
            }
        }
        return false;
    }

    public static final androidx.compose.ui.d e(androidx.compose.ui.d dVar) {
        return androidx.compose.ui.focus.g.a(androidx.compose.ui.focus.g.a(dVar.b(androidx.compose.ui.viewinterop.FocusGroupPropertiesElement.f20462b)).b(androidx.compose.ui.viewinterop.FocusTargetPropertiesElement.f20463b));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final android.graphics.Rect f(p121m0.i iVar, android.view.View view, android.view.View view2) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int[] iArr2 = new int[2];
        view2.getLocationOnScreen(iArr2);
        p131n0.i iVarH = iVar.h();
        if (iVarH == null) {
            return null;
        }
        return new android.graphics.Rect((((int) iVarH.i()) + iArr[0]) - iArr2[0], (((int) iVarH.l()) + iArr[1]) - iArr2[1], (((int) iVarH.j()) + iArr[0]) - iArr2[0], (((int) iVarH.e()) + iArr[1]) - iArr2[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final android.view.View g(androidx.compose.ui.d.c cVar) {
        android.view.View viewS = F0.AbstractC0925k.m(cVar.E0()).S();
        if (viewS != null) {
            return viewS;
        }
        throw new java.lang.IllegalStateException("Could not fetch interop view".toString());
    }
}
