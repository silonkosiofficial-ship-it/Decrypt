package p050f;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p050f.b f44771a = new p050f.b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final V.O0 f44772b = V.AbstractC1756y.d(null, f.b.a.f44774D, 1, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f44773c = 0;

    static final class a extends p247y7.AbstractC7352v implements p237x7.a {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final f.b.a f44774D = new f.b.a();

        a() {
            super(0);
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final p040e.A b() {
            return null;
        }
    }

    private b() {
    }

    public final p040e.A a(V.InterfaceC1734n interfaceC1734n, int i6) {
        interfaceC1734n.f(-2068013981);
        p040e.A a6 = (p040e.A) interfaceC1734n.n(f44772b);
        interfaceC1734n.f(1680121597);
        if (a6 == null) {
            a6 = p040e.D.a((android.view.View) interfaceC1734n.n(androidx.compose.ui.platform.T.i()));
        }
        interfaceC1734n.P();
        if (a6 == null) {
            java.lang.Object baseContext = (android.content.Context) interfaceC1734n.n(androidx.compose.ui.platform.T.g());
            while (true) {
                if (!(baseContext instanceof android.content.ContextWrapper)) {
                    baseContext = null;
                    break;
                }
                if (baseContext instanceof p040e.A) {
                    break;
                }
                baseContext = ((android.content.ContextWrapper) baseContext).getBaseContext();
            }
            a6 = (p040e.A) baseContext;
        }
        interfaceC1734n.P();
        return a6;
    }
}
