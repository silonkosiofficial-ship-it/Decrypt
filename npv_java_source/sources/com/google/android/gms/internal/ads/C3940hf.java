package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.hf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3940hf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.content.Context f36104a;

    public C3940hf(android.content.Context context) {
        Q3.AbstractC1477p.m(context, "Context can not be null");
        this.f36104a = context;
    }

    public final boolean a(android.content.Intent intent) {
        Q3.AbstractC1477p.m(intent, "Intent can not be null");
        return !this.f36104a.getPackageManager().queryIntentActivities(intent, 0).isEmpty();
    }

    public final boolean b() {
        return a(new android.content.Intent("android.intent.action.INSERT").setType("vnd.android.cursor.dir/event"));
    }

    public final boolean c() {
        return ((java.lang.Boolean) p214v3.AbstractC7247h0.a(this.f36104a, new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.gf
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return java.lang.Boolean.valueOf("mounted".equals(android.os.Environment.getExternalStorageState()));
            }
        })).booleanValue() && W3.e.a(this.f36104a).a("android.permission.WRITE_EXTERNAL_STORAGE") == 0;
    }
}
