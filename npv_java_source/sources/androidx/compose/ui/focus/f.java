package androidx.compose.ui.focus;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {
    public static final p131n0.i a(android.view.View view) {
        int[] iArrA = androidx.compose.ui.focus.e.f19679a.a();
        view.getLocationInWindow(iArrA);
        int i6 = iArrA[0];
        return new p131n0.i(i6, iArrA[1], i6 + view.getWidth(), iArrA[1] + view.getHeight());
    }

    public static final boolean b(android.view.View view, java.lang.Integer num, android.graphics.Rect rect) {
        if (num == null) {
            return view.requestFocus();
        }
        if (view instanceof android.view.ViewGroup) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
            if (viewGroup.isFocused()) {
                return true;
            }
            if ((!viewGroup.isFocusable() || view.hasFocus()) && !(view instanceof androidx.compose.ui.platform.r)) {
                if (rect == null) {
                    android.view.View viewFindNextFocus = android.view.FocusFinder.getInstance().findNextFocus(viewGroup, view.hasFocus() ? view.findFocus() : null, num.intValue());
                    return viewFindNextFocus != null ? viewFindNextFocus.requestFocus(num.intValue()) : view.requestFocus(num.intValue());
                }
                android.view.View viewFindNextFocusFromRect = android.view.FocusFinder.getInstance().findNextFocusFromRect(viewGroup, rect, num.intValue());
                if (viewFindNextFocusFromRect != null) {
                    return viewFindNextFocusFromRect.requestFocus(num.intValue(), rect);
                }
            }
        }
        return view.requestFocus(num.intValue(), rect);
    }

    public static final java.lang.Integer c(int i6) {
        int i10;
        androidx.compose.ui.focus.d.a aVar = androidx.compose.ui.focus.d.f19669b;
        if (androidx.compose.ui.focus.d.l(i6, aVar.h())) {
            i10 = 33;
        } else if (androidx.compose.ui.focus.d.l(i6, aVar.a())) {
            i10 = 130;
        } else if (androidx.compose.ui.focus.d.l(i6, aVar.d())) {
            i10 = 17;
        } else if (androidx.compose.ui.focus.d.l(i6, aVar.g())) {
            i10 = 66;
        } else if (androidx.compose.ui.focus.d.l(i6, aVar.e())) {
            i10 = 2;
        } else {
            if (!androidx.compose.ui.focus.d.l(i6, aVar.f())) {
                return null;
            }
            i10 = 1;
        }
        return java.lang.Integer.valueOf(i10);
    }

    public static final androidx.compose.ui.focus.d d(int i6) {
        int iF;
        if (i6 == 1) {
            iF = androidx.compose.ui.focus.d.f19669b.f();
        } else if (i6 == 2) {
            iF = androidx.compose.ui.focus.d.f19669b.e();
        } else if (i6 == 17) {
            iF = androidx.compose.ui.focus.d.f19669b.d();
        } else if (i6 == 33) {
            iF = androidx.compose.ui.focus.d.f19669b.h();
        } else if (i6 == 66) {
            iF = androidx.compose.ui.focus.d.f19669b.g();
        } else {
            if (i6 != 130) {
                return null;
            }
            iF = androidx.compose.ui.focus.d.f19669b.a();
        }
        return androidx.compose.ui.focus.d.i(iF);
    }

    public static final Y0.v e(int i6) {
        if (i6 == 0) {
            return Y0.v.Ltr;
        }
        if (i6 != 1) {
            return null;
        }
        return Y0.v.Rtl;
    }
}
