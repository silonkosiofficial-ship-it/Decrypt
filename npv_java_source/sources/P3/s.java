package P3;

/* JADX INFO: loaded from: classes.dex */
public final class s extends android.content.BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    android.content.Context f8318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final P3.r f8319b;

    public s(P3.r rVar) {
        this.f8319b = rVar;
    }

    public final void a(android.content.Context context) {
        this.f8318a = context;
    }

    public final synchronized void b() {
        try {
            android.content.Context context = this.f8318a;
            if (context != null) {
                context.unregisterReceiver(this);
            }
            this.f8318a = null;
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        android.net.Uri data = intent.getData();
        if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
            this.f8319b.a();
            b();
        }
    }
}
