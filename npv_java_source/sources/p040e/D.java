package p040e;

/* JADX INFO: loaded from: classes.dex */
public abstract class D {

    static final class a extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final e.D.a f44358D = new e.D.a();

        a() {
            super(1);
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final android.view.View l(android.view.View view) {
            p247y7.AbstractC7350t.f(view, "it");
            java.lang.Object parent = view.getParent();
            if (parent instanceof android.view.View) {
                return (android.view.View) parent;
            }
            return null;
        }
    }

    static final class b extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final e.D.b f44359D = new e.D.b();

        b() {
            super(1);
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final p040e.A l(android.view.View view) {
            p247y7.AbstractC7350t.f(view, "it");
            java.lang.Object tag = view.getTag(p040e.B.f44357b);
            if (tag instanceof p040e.A) {
                return (p040e.A) tag;
            }
            return null;
        }
    }

    public static final p040e.A a(android.view.View view) {
        p247y7.AbstractC7350t.f(view, "<this>");
        return (p040e.A) R8.k.A(R8.k.H(R8.k.n(view, e.D.a.f44358D), e.D.b.f44359D));
    }

    public static final void b(android.view.View view, p040e.A a6) {
        p247y7.AbstractC7350t.f(view, "<this>");
        p247y7.AbstractC7350t.f(a6, "onBackPressedDispatcherOwner");
        view.setTag(p040e.B.f44357b, a6);
    }
}
