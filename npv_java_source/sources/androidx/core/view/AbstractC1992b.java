package androidx.core.view;

/* JADX INFO: renamed from: androidx.core.view.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1992b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.content.Context f21701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private androidx.core.view.AbstractC1992b.a f21702b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private androidx.core.view.AbstractC1992b.InterfaceC0412b f21703c;

    /* JADX INFO: renamed from: androidx.core.view.b$a */
    public interface a {
    }

    /* JADX INFO: renamed from: androidx.core.view.b$b, reason: collision with other inner class name */
    public interface InterfaceC0412b {
        void onActionProviderVisibilityChanged(boolean z6);
    }

    public AbstractC1992b(android.content.Context context) {
        this.f21701a = context;
    }

    public abstract boolean a();

    public abstract boolean b();

    public abstract android.view.View c(android.view.MenuItem menuItem);

    public abstract boolean d();

    public abstract void e(android.view.SubMenu subMenu);

    public abstract boolean f();

    public void g() {
        this.f21703c = null;
        this.f21702b = null;
    }

    public void h(androidx.core.view.AbstractC1992b.a aVar) {
        this.f21702b = aVar;
    }

    public abstract void i(androidx.core.view.AbstractC1992b.InterfaceC0412b interfaceC0412b);
}
