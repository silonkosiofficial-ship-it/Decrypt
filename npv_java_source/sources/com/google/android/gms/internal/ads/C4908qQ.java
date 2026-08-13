package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.qQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4908qQ {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static com.google.android.gms.internal.ads.C4908qQ f38269e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.os.Handler f38270a = new android.os.Handler(android.os.Looper.getMainLooper());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.concurrent.CopyOnWriteArrayList f38271b = new java.util.concurrent.CopyOnWriteArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.lang.Object f38272c = new java.lang.Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f38273d = 0;

    private C4908qQ(android.content.Context context) {
        android.content.IntentFilter intentFilter = new android.content.IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(new com.google.android.gms.internal.ads.C4687oP(this, null), intentFilter);
    }

    public static synchronized com.google.android.gms.internal.ads.C4908qQ b(android.content.Context context) {
        try {
            if (f38269e == null) {
                f38269e = new com.google.android.gms.internal.ads.C4908qQ(context);
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
        return f38269e;
    }

    static /* synthetic */ void c(com.google.android.gms.internal.ads.C4908qQ c4908qQ, int i6) {
        synchronized (c4908qQ.f38272c) {
            try {
                if (c4908qQ.f38273d == i6) {
                    return;
                }
                c4908qQ.f38273d = i6;
                for (java.lang.ref.WeakReference weakReference : c4908qQ.f38271b) {
                    com.google.android.gms.internal.ads.ZJ0 zj0 = (com.google.android.gms.internal.ads.ZJ0) weakReference.get();
                    if (zj0 != null) {
                        zj0.f33570a.j(i6);
                    } else {
                        c4908qQ.f38271b.remove(weakReference);
                    }
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public final int a() {
        int i6;
        synchronized (this.f38272c) {
            i6 = this.f38273d;
        }
        return i6;
    }

    public final void d(final com.google.android.gms.internal.ads.ZJ0 zj0) {
        for (java.lang.ref.WeakReference weakReference : this.f38271b) {
            if (weakReference.get() == null) {
                this.f38271b.remove(weakReference);
            }
        }
        this.f38271b.add(new java.lang.ref.WeakReference(zj0));
        this.f38270a.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.iO
            @Override // java.lang.Runnable
            public final void run() {
                zj0.f33570a.j(this.f36275C.a());
            }
        });
    }
}
