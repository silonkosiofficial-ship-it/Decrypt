package androidx.compose.ui.platform;

/* JADX INFO: renamed from: androidx.compose.ui.platform.n0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1960n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final androidx.compose.ui.platform.C1960n0 f20150a = new androidx.compose.ui.platform.C1960n0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static p237x7.p f20151b = p031d0.c.c(-1759434350, false, androidx.compose.ui.platform.C1960n0.a.f20152D);

    /* JADX INFO: renamed from: androidx.compose.ui.platform.n0$a */
    static final class a extends p247y7.AbstractC7352v implements p237x7.p {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final androidx.compose.ui.platform.C1960n0.a f20152D = new androidx.compose.ui.platform.C1960n0.a();

        a() {
            super(2);
        }

        public final void a(V.InterfaceC1734n interfaceC1734n, int i6) {
            if ((i6 & 3) == 2 && interfaceC1734n.u()) {
                interfaceC1734n.A();
                return;
            }
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(-1759434350, i6, -1, "androidx.compose.ui.platform.ComposableSingletons$Wrapper_androidKt.lambda-1.<anonymous> (Wrapper.android.kt:120)");
            }
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.P();
            }
        }

        @Override // p237x7.p
        public /* bridge */ /* synthetic */ java.lang.Object u(java.lang.Object obj, java.lang.Object obj2) {
            a((V.InterfaceC1734n) obj, ((java.lang.Number) obj2).intValue());
            return p087i7.M.f46721a;
        }
    }

    public final p237x7.p a() {
        return f20151b;
    }
}
