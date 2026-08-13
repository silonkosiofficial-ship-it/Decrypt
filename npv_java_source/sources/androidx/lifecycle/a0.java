package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
public abstract class a0 {

    static final class a extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final androidx.lifecycle.a0.a f22804D = new androidx.lifecycle.a0.a();

        a() {
            super(1);
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final android.view.View l(android.view.View view) {
            p247y7.AbstractC7350t.f(view, "view");
            java.lang.Object parent = view.getParent();
            if (parent instanceof android.view.View) {
                return (android.view.View) parent;
            }
            return null;
        }
    }

    static final class b extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final androidx.lifecycle.a0.b f22805D = new androidx.lifecycle.a0.b();

        b() {
            super(1);
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final androidx.lifecycle.Y l(android.view.View view) {
            p247y7.AbstractC7350t.f(view, "view");
            java.lang.Object tag = view.getTag(p023c2.e.f24408a);
            if (tag instanceof androidx.lifecycle.Y) {
                return (androidx.lifecycle.Y) tag;
            }
            return null;
        }
    }

    public static final androidx.lifecycle.Y a(android.view.View view) {
        p247y7.AbstractC7350t.f(view, "<this>");
        return (androidx.lifecycle.Y) R8.k.A(R8.k.H(R8.k.n(view, androidx.lifecycle.a0.a.f22804D), androidx.lifecycle.a0.b.f22805D));
    }

    public static final void b(android.view.View view, androidx.lifecycle.Y y6) {
        p247y7.AbstractC7350t.f(view, "<this>");
        view.setTag(p023c2.e.f24408a, y6);
    }
}
