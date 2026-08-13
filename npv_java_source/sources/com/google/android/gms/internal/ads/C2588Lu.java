package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Lu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2588Lu extends android.content.MutableContextWrapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private android.app.Activity f29581a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private android.content.Context f29582b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private android.content.Context f29583c;

    public C2588Lu(android.content.Context context) {
        super(context);
        setBaseContext(context);
    }

    public final android.app.Activity a() {
        return this.f29581a;
    }

    public final android.content.Context b() {
        return this.f29583c;
    }

    public final void c(android.content.Intent intent, int i6) {
        if (this.f29581a == null) {
            intent.setFlags(268435456);
            this.f29582b.startActivity(intent);
            return;
        }
        p214v3.AbstractC7265q0.k("Starting activity for result with intent: " + java.lang.String.valueOf(intent.getData()) + " and requestCode: 236");
        this.f29581a.startActivityForResult(intent, 236);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final java.lang.Object getSystemService(java.lang.String str) {
        return this.f29583c.getSystemService(str);
    }

    @Override // android.content.MutableContextWrapper
    public final void setBaseContext(android.content.Context context) {
        android.content.Context applicationContext = context.getApplicationContext();
        this.f29582b = applicationContext;
        this.f29581a = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        this.f29583c = context;
        super.setBaseContext(applicationContext);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void startActivity(android.content.Intent intent) {
        android.app.Activity activity = this.f29581a;
        if (activity != null) {
            activity.startActivity(intent);
        } else {
            intent.setFlags(268435456);
            this.f29582b.startActivity(intent);
        }
    }
}
