package androidx.core.widget;

/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    static class a {
        static boolean a(android.widget.PopupWindow popupWindow) {
            return popupWindow.getOverlapAnchor();
        }

        static int b(android.widget.PopupWindow popupWindow) {
            return popupWindow.getWindowLayoutType();
        }

        static void c(android.widget.PopupWindow popupWindow, boolean z6) {
            popupWindow.setOverlapAnchor(z6);
        }

        static void d(android.widget.PopupWindow popupWindow, int i6) {
            popupWindow.setWindowLayoutType(i6);
        }
    }

    public static void a(android.widget.PopupWindow popupWindow, boolean z6) {
        androidx.core.widget.g.a.c(popupWindow, z6);
    }

    public static void b(android.widget.PopupWindow popupWindow, int i6) {
        androidx.core.widget.g.a.d(popupWindow, i6);
    }

    public static void c(android.widget.PopupWindow popupWindow, android.view.View view, int i6, int i10, int i11) {
        popupWindow.showAsDropDown(view, i6, i10, i11);
    }
}
