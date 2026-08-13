package androidx.fragment.app;

/* JADX INFO: loaded from: classes.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.fragment.app.k f22563a;

    private i(androidx.fragment.app.k kVar) {
        this.f22563a = kVar;
    }

    public static androidx.fragment.app.i b(androidx.fragment.app.k kVar) {
        return new androidx.fragment.app.i((androidx.fragment.app.k) B1.i.h(kVar, "callbacks == null"));
    }

    public void a(androidx.fragment.app.f fVar) {
        androidx.fragment.app.k kVar = this.f22563a;
        kVar.f22569G.k(kVar, kVar, fVar);
    }

    public void c() {
        this.f22563a.f22569G.v();
    }

    public boolean d(android.view.MenuItem menuItem) {
        return this.f22563a.f22569G.y(menuItem);
    }

    public void e() {
        this.f22563a.f22569G.z();
    }

    public void f() {
        this.f22563a.f22569G.B();
    }

    public void g() {
        this.f22563a.f22569G.K();
    }

    public void h() {
        this.f22563a.f22569G.O();
    }

    public void i() {
        this.f22563a.f22569G.P();
    }

    public void j() {
        this.f22563a.f22569G.R();
    }

    public boolean k() {
        return this.f22563a.f22569G.Y(true);
    }

    public androidx.fragment.app.n l() {
        return this.f22563a.f22569G;
    }

    public void m() {
        this.f22563a.f22569G.T0();
    }

    public android.view.View n(android.view.View view, java.lang.String str, android.content.Context context, android.util.AttributeSet attributeSet) {
        return this.f22563a.f22569G.s0().onCreateView(view, str, context, attributeSet);
    }
}
