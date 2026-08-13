package androidx.browser.customtabs;

/* JADX INFO: loaded from: classes.dex */
public abstract class e implements android.content.ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private android.content.Context f18653a;

    class a extends androidx.browser.customtabs.c {
        a(p030d.b bVar, android.content.ComponentName componentName, android.content.Context context) {
            super(bVar, componentName, context);
        }
    }

    public abstract void a(android.content.ComponentName componentName, androidx.browser.customtabs.c cVar);

    void b(android.content.Context context) {
        this.f18653a = context;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        if (this.f18653a == null) {
            throw new java.lang.IllegalStateException("Custom Tabs Service connected before an applicationcontext has been provided.");
        }
        a(componentName, new androidx.browser.customtabs.e.a(d.b.a.q0(iBinder), componentName, this.f18653a));
    }
}
