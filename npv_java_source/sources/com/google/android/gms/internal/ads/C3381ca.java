package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.ca, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3381ca {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final P4.d f34525a;

    public C3381ca(final android.content.Context context, java.util.concurrent.Executor executor) {
        this.f34525a = com.google.android.gms.internal.ads.AbstractC2652Nk0.j(new java.util.concurrent.Callable(this) { // from class: com.google.android.gms.internal.ads.ba
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                android.content.Context context2 = context;
                try {
                    return com.google.android.gms.internal.ads.AbstractC3498dd0.a(context2, context2.getPackageName(), java.lang.Integer.toString(context2.getPackageManager().getPackageInfo(context2.getPackageName(), 0).versionCode));
                } catch (java.lang.Throwable unused) {
                    return null;
                }
            }
        }, executor);
    }

    public final P4.d a() {
        return this.f34525a;
    }
}
