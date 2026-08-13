package androidx.core.view;

/* JADX INFO: renamed from: androidx.core.view.c0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1995c0 {

    /* JADX INFO: renamed from: androidx.core.view.c0$a */
    static class a {
        static int a(android.view.ViewGroup viewGroup) {
            return viewGroup.getNestedScrollAxes();
        }

        static boolean b(android.view.ViewGroup viewGroup) {
            return viewGroup.isTransitionGroup();
        }

        static void c(android.view.ViewGroup viewGroup, boolean z6) {
            viewGroup.setTransitionGroup(z6);
        }
    }

    public static boolean a(android.view.ViewGroup viewGroup) {
        return androidx.core.view.AbstractC1995c0.a.b(viewGroup);
    }
}
