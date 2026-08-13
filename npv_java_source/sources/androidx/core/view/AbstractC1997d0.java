package androidx.core.view;

/* JADX INFO: renamed from: androidx.core.view.d0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1997d0 {

    /* JADX INFO: renamed from: androidx.core.view.d0$a */
    /* synthetic */ class a extends p247y7.C7348q implements p237x7.l {

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        public static final androidx.core.view.AbstractC1997d0.a f21719L = new androidx.core.view.AbstractC1997d0.a();

        a() {
            super(1, android.view.ViewParent.class, "getParent", "getParent()Landroid/view/ViewParent;", 0);
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public final android.view.ViewParent l(android.view.ViewParent viewParent) {
            return viewParent.getParent();
        }
    }

    public static final R8.h a(android.view.View view) {
        return R8.k.n(view.getParent(), androidx.core.view.AbstractC1997d0.a.f21719L);
    }
}
