package androidx.compose.ui.platform;

/* JADX INFO: loaded from: classes.dex */
public final class K1 implements androidx.compose.ui.platform.J1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final androidx.compose.ui.platform.K1.a f19879b = new androidx.compose.ui.platform.K1.a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final V.InterfaceC1753w0 f19880c = V.A1.d(p251z0.O.a(p251z0.AbstractC7384u.a()), null, 2, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final V.InterfaceC1753w0 f19881a = V.A1.d(java.lang.Boolean.FALSE, null, 2, null);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }
    }

    @Override // androidx.compose.ui.platform.J1
    public boolean a() {
        return ((java.lang.Boolean) this.f19881a.getValue()).booleanValue();
    }

    public void b(int i6) {
        f19880c.setValue(p251z0.O.a(i6));
    }

    public void c(boolean z6) {
        this.f19881a.setValue(java.lang.Boolean.valueOf(z6));
    }
}
