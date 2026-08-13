package androidx.core.view;

/* JADX INFO: renamed from: androidx.core.view.e0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1999e0 {

    /* JADX INFO: renamed from: androidx.core.view.e0$a */
    static class a {
        static boolean a(android.view.ViewParent viewParent, android.view.View view, float f6, float f10, boolean z6) {
            return viewParent.onNestedFling(view, f6, f10, z6);
        }

        static boolean b(android.view.ViewParent viewParent, android.view.View view, float f6, float f10) {
            return viewParent.onNestedPreFling(view, f6, f10);
        }

        static void c(android.view.ViewParent viewParent, android.view.View view, int i6, int i10, int[] iArr) {
            viewParent.onNestedPreScroll(view, i6, i10, iArr);
        }

        static void d(android.view.ViewParent viewParent, android.view.View view, int i6, int i10, int i11, int i12) {
            viewParent.onNestedScroll(view, i6, i10, i11, i12);
        }

        static void e(android.view.ViewParent viewParent, android.view.View view, android.view.View view2, int i6) {
            viewParent.onNestedScrollAccepted(view, view2, i6);
        }

        static boolean f(android.view.ViewParent viewParent, android.view.View view, android.view.View view2, int i6) {
            return viewParent.onStartNestedScroll(view, view2, i6);
        }

        static void g(android.view.ViewParent viewParent, android.view.View view) {
            viewParent.onStopNestedScroll(view);
        }
    }

    public static boolean a(android.view.ViewParent viewParent, android.view.View view, float f6, float f10, boolean z6) {
        try {
            return androidx.core.view.AbstractC1999e0.a.a(viewParent, view, f6, f10, z6);
        } catch (java.lang.AbstractMethodError e6) {
            java.lang.String str = "ViewParent " + viewParent + " does not implement interface method onNestedFling";
            return false;
        }
    }

    public static boolean b(android.view.ViewParent viewParent, android.view.View view, float f6, float f10) {
        try {
            return androidx.core.view.AbstractC1999e0.a.b(viewParent, view, f6, f10);
        } catch (java.lang.AbstractMethodError e6) {
            java.lang.String str = "ViewParent " + viewParent + " does not implement interface method onNestedPreFling";
            return false;
        }
    }

    public static void c(android.view.ViewParent viewParent, android.view.View view, int i6, int i10, int[] iArr, int i11) {
        if (viewParent instanceof androidx.core.view.D) {
            ((androidx.core.view.D) viewParent).o(view, i6, i10, iArr, i11);
            return;
        }
        if (i11 == 0) {
            try {
                androidx.core.view.AbstractC1999e0.a.c(viewParent, view, i6, i10, iArr);
            } catch (java.lang.AbstractMethodError e6) {
                java.lang.String str = "ViewParent " + viewParent + " does not implement interface method onNestedPreScroll";
            }
        }
    }

    public static void d(android.view.ViewParent viewParent, android.view.View view, int i6, int i10, int i11, int i12, int i13, int[] iArr) {
        if (viewParent instanceof androidx.core.view.E) {
            ((androidx.core.view.E) viewParent).j(view, i6, i10, i11, i12, i13, iArr);
            return;
        }
        iArr[0] = iArr[0] + i11;
        iArr[1] = iArr[1] + i12;
        if (viewParent instanceof androidx.core.view.D) {
            ((androidx.core.view.D) viewParent).k(view, i6, i10, i11, i12, i13);
            return;
        }
        if (i13 == 0) {
            try {
                androidx.core.view.AbstractC1999e0.a.d(viewParent, view, i6, i10, i11, i12);
            } catch (java.lang.AbstractMethodError e6) {
                java.lang.String str = "ViewParent " + viewParent + " does not implement interface method onNestedScroll";
            }
        }
    }

    public static void e(android.view.ViewParent viewParent, android.view.View view, android.view.View view2, int i6, int i10) {
        if (viewParent instanceof androidx.core.view.D) {
            ((androidx.core.view.D) viewParent).m(view, view2, i6, i10);
            return;
        }
        if (i10 == 0) {
            try {
                androidx.core.view.AbstractC1999e0.a.e(viewParent, view, view2, i6);
            } catch (java.lang.AbstractMethodError e6) {
                java.lang.String str = "ViewParent " + viewParent + " does not implement interface method onNestedScrollAccepted";
            }
        }
    }

    public static boolean f(android.view.ViewParent viewParent, android.view.View view, android.view.View view2, int i6, int i10) {
        if (viewParent instanceof androidx.core.view.D) {
            return ((androidx.core.view.D) viewParent).l(view, view2, i6, i10);
        }
        if (i10 != 0) {
            return false;
        }
        try {
            return androidx.core.view.AbstractC1999e0.a.f(viewParent, view, view2, i6);
        } catch (java.lang.AbstractMethodError e6) {
            java.lang.String str = "ViewParent " + viewParent + " does not implement interface method onStartNestedScroll";
            return false;
        }
    }

    public static void g(android.view.ViewParent viewParent, android.view.View view, int i6) {
        if (viewParent instanceof androidx.core.view.D) {
            ((androidx.core.view.D) viewParent).n(view, i6);
            return;
        }
        if (i6 == 0) {
            try {
                androidx.core.view.AbstractC1999e0.a.g(viewParent, view);
            } catch (java.lang.AbstractMethodError e6) {
                java.lang.String str = "ViewParent " + viewParent + " does not implement interface method onStopNestedScroll";
            }
        }
    }
}
