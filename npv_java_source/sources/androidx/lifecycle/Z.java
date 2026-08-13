package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
public abstract class Z {

    static final class a extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final androidx.lifecycle.Z.a f22801D = new androidx.lifecycle.Z.a();

        a() {
            super(1);
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final android.view.View l(android.view.View view) {
            p247y7.AbstractC7350t.f(view, "currentView");
            java.lang.Object parent = view.getParent();
            if (parent instanceof android.view.View) {
                return (android.view.View) parent;
            }
            return null;
        }
    }

    static final class b extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final androidx.lifecycle.Z.b f22802D = new androidx.lifecycle.Z.b();

        b() {
            super(1);
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final androidx.lifecycle.r l(android.view.View view) {
            p247y7.AbstractC7350t.f(view, "viewParent");
            java.lang.Object tag = view.getTag(p013b2.a.f24132a);
            if (tag instanceof androidx.lifecycle.r) {
                return (androidx.lifecycle.r) tag;
            }
            return null;
        }
    }

    public static final androidx.lifecycle.r a(android.view.View view) {
        p247y7.AbstractC7350t.f(view, "<this>");
        return (androidx.lifecycle.r) R8.k.A(R8.k.H(R8.k.n(view, androidx.lifecycle.Z.a.f22801D), androidx.lifecycle.Z.b.f22802D));
    }

    public static final void b(android.view.View view, androidx.lifecycle.r rVar) {
        p247y7.AbstractC7350t.f(view, "<this>");
        view.setTag(p013b2.a.f24132a, rVar);
    }
}
