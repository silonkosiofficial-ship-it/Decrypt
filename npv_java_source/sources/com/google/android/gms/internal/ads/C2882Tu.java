package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Tu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2882Tu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private p224w3.a f32031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private android.content.Context f32032b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f32033c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private java.lang.ref.WeakReference f32034d;

    public final com.google.android.gms.internal.ads.C2882Tu d(long j6) {
        this.f32033c = j6;
        return this;
    }

    public final com.google.android.gms.internal.ads.C2882Tu e(android.content.Context context) {
        this.f32034d = new java.lang.ref.WeakReference(context);
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        this.f32032b = context;
        return this;
    }

    public final com.google.android.gms.internal.ads.C2882Tu f(p224w3.a aVar) {
        this.f32031a = aVar;
        return this;
    }
}
