package F0;

/* JADX INFO: renamed from: F0.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C0915e implements androidx.compose.ui.focus.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final F0.C0915e f2639a = new F0.C0915e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static java.lang.Boolean f2640b;

    private C0915e() {
    }

    public final boolean a() {
        return f2640b != null;
    }

    public final void b() {
        f2640b = null;
    }

    @Override // androidx.compose.ui.focus.j
    public /* synthetic */ androidx.compose.ui.focus.n d() {
        return androidx.compose.ui.focus.i.i(this);
    }

    @Override // androidx.compose.ui.focus.j
    public /* synthetic */ androidx.compose.ui.focus.n f() {
        return androidx.compose.ui.focus.i.e(this);
    }

    @Override // androidx.compose.ui.focus.j
    public /* synthetic */ androidx.compose.ui.focus.n o() {
        return androidx.compose.ui.focus.i.h(this);
    }

    @Override // androidx.compose.ui.focus.j
    public boolean p() {
        java.lang.Boolean bool = f2640b;
        if (bool != null) {
            return bool.booleanValue();
        }
        C0.a.c("canFocus is read before it is written");
        throw new p087i7.C6665k();
    }

    @Override // androidx.compose.ui.focus.j
    public /* synthetic */ androidx.compose.ui.focus.n q() {
        return androidx.compose.ui.focus.i.g(this);
    }

    @Override // androidx.compose.ui.focus.j
    public /* synthetic */ void r(p237x7.l lVar) {
        androidx.compose.ui.focus.i.k(this, lVar);
    }

    @Override // androidx.compose.ui.focus.j
    public /* synthetic */ androidx.compose.ui.focus.n s() {
        return androidx.compose.ui.focus.i.j(this);
    }

    @Override // androidx.compose.ui.focus.j
    public /* synthetic */ androidx.compose.ui.focus.n t() {
        return androidx.compose.ui.focus.i.f(this);
    }

    @Override // androidx.compose.ui.focus.j
    public /* synthetic */ p237x7.l u() {
        return androidx.compose.ui.focus.i.d(this);
    }

    @Override // androidx.compose.ui.focus.j
    public /* synthetic */ void v(p237x7.l lVar) {
        androidx.compose.ui.focus.i.l(this, lVar);
    }

    @Override // androidx.compose.ui.focus.j
    public /* synthetic */ androidx.compose.ui.focus.n w() {
        return androidx.compose.ui.focus.i.b(this);
    }

    @Override // androidx.compose.ui.focus.j
    public /* synthetic */ androidx.compose.ui.focus.n x() {
        return androidx.compose.ui.focus.i.a(this);
    }

    @Override // androidx.compose.ui.focus.j
    public void y(boolean z6) {
        f2640b = java.lang.Boolean.valueOf(z6);
    }

    @Override // androidx.compose.ui.focus.j
    public /* synthetic */ p237x7.l z() {
        return androidx.compose.ui.focus.i.c(this);
    }
}
