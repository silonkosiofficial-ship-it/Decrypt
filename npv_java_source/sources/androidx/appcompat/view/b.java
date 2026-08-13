package androidx.appcompat.view;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private java.lang.Object f17652C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private boolean f17653D;

    public interface a {
        void a(androidx.appcompat.view.b bVar);

        boolean b(androidx.appcompat.view.b bVar, android.view.Menu menu);

        boolean c(androidx.appcompat.view.b bVar, android.view.Menu menu);

        boolean d(androidx.appcompat.view.b bVar, android.view.MenuItem menuItem);
    }

    public abstract void c();

    public abstract android.view.View d();

    public abstract android.view.Menu e();

    public abstract android.view.MenuInflater f();

    public abstract java.lang.CharSequence g();

    public java.lang.Object h() {
        return this.f17652C;
    }

    public abstract java.lang.CharSequence i();

    public boolean j() {
        return this.f17653D;
    }

    public abstract void k();

    public abstract boolean l();

    public abstract void m(android.view.View view);

    public abstract void n(int i6);

    public abstract void o(java.lang.CharSequence charSequence);

    public void p(java.lang.Object obj) {
        this.f17652C = obj;
    }

    public abstract void q(int i6);

    public abstract void r(java.lang.CharSequence charSequence);

    public void s(boolean z6) {
        this.f17653D = z6;
    }
}
