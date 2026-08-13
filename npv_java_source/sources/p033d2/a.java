package p033d2;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p033d2.a f44287a = new p033d2.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final V.O0 f44288b = V.AbstractC1756y.d(null, p033d2.a.C0489a.f44290D, 1, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f44289c = 0;

    /* JADX INFO: renamed from: d2.a$a, reason: collision with other inner class name */
    static final class C0489a extends p247y7.AbstractC7352v implements p237x7.a {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final p033d2.a.C0489a f44290D = new p033d2.a.C0489a();

        C0489a() {
            super(0);
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final androidx.lifecycle.Y b() {
            return null;
        }
    }

    private a() {
    }

    public final androidx.lifecycle.Y a(V.InterfaceC1734n interfaceC1734n, int i6) {
        interfaceC1734n.f(-584162872);
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.Q(-584162872, i6, -1, "androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner.<get-current> (LocalViewModelStoreOwner.kt:38)");
        }
        androidx.lifecycle.Y yA = (androidx.lifecycle.Y) interfaceC1734n.n(f44288b);
        if (yA == null) {
            yA = p033d2.b.a(interfaceC1734n, 0);
        }
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.P();
        }
        interfaceC1734n.P();
        return yA;
    }

    public final V.P0 b(androidx.lifecycle.Y y6) {
        p247y7.AbstractC7350t.f(y6, "viewModelStoreOwner");
        return f44288b.d(y6);
    }
}
