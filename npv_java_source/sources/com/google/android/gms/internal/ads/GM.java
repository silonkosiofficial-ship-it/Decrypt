package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class GM {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private android.content.Context f27798a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private android.widget.PopupWindow f27799b;

    public final void a(android.content.Context context, android.view.View view) {
        android.widget.PopupWindow popupWindow;
        if (!V3.n.d() || V3.n.f()) {
            return;
        }
        android.view.Window window = context instanceof android.app.Activity ? ((android.app.Activity) context).getWindow() : null;
        if (window == null || window.getDecorView() == null || ((android.app.Activity) context).isDestroyed()) {
            popupWindow = null;
        } else {
            android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(context);
            frameLayout.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
            frameLayout.addView(view, -1, -1);
            popupWindow = new android.widget.PopupWindow((android.view.View) frameLayout, 1, 1, false);
            popupWindow.setOutsideTouchable(true);
            popupWindow.setClippingEnabled(false);
            p224w3.p.b("Displaying the 1x1 popup off the screen.");
            try {
                popupWindow.showAtLocation(window.getDecorView(), 0, -1, -1);
            } catch (java.lang.Exception unused) {
                popupWindow = null;
            }
        }
        this.f27799b = popupWindow;
        if (popupWindow == null) {
            context = null;
        }
        this.f27798a = context;
    }

    public final void b() {
        android.widget.PopupWindow popupWindow;
        android.content.Context context = this.f27798a;
        if (context == null || this.f27799b == null) {
            return;
        }
        if ((!(context instanceof android.app.Activity) || !((android.app.Activity) context).isDestroyed()) && (popupWindow = this.f27799b) != null && popupWindow.isShowing()) {
            this.f27799b.dismiss();
        }
        this.f27798a = null;
        this.f27799b = null;
    }
}
