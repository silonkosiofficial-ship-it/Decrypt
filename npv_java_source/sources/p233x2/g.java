package p233x2;

/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    static final class a extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final x2.g.a f56913D = new x2.g.a();

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
        public static final x2.g.b f56914D = new x2.g.b();

        b() {
            super(1);
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final p233x2.f l(android.view.View view) {
            p247y7.AbstractC7350t.f(view, "view");
            java.lang.Object tag = view.getTag(p233x2.a.f56897a);
            if (tag instanceof p233x2.f) {
                return (p233x2.f) tag;
            }
            return null;
        }
    }

    public static final p233x2.f a(android.view.View view) {
        p247y7.AbstractC7350t.f(view, "<this>");
        return (p233x2.f) R8.k.A(R8.k.H(R8.k.n(view, x2.g.a.f56913D), x2.g.b.f56914D));
    }

    public static final void b(android.view.View view, p233x2.f fVar) {
        p247y7.AbstractC7350t.f(view, "<this>");
        view.setTag(p233x2.a.f56897a, fVar);
    }
}
