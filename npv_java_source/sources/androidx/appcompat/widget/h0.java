package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
public abstract class h0 {

    static class a {
        static void a(android.view.View view, java.lang.CharSequence charSequence) {
            view.setTooltipText(charSequence);
        }
    }

    public static void a(android.view.View view, java.lang.CharSequence charSequence) {
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            androidx.appcompat.widget.h0.a.a(view, charSequence);
        } else {
            androidx.appcompat.widget.k0.h(view, charSequence);
        }
    }
}
