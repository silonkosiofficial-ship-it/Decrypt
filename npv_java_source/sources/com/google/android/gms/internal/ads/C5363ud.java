package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.ud, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5363ud {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    com.google.android.gms.internal.ads.InterfaceC2449Ib f39188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    boolean f39189b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.util.concurrent.ExecutorService f39190c;

    public C5363ud() {
        this.f39190c = p224w3.c.f56225b;
    }

    public C5363ud(final android.content.Context context) {
        java.util.concurrent.ExecutorService executorService = p224w3.c.f56225b;
        this.f39190c = executorService;
        executorService.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.pd
            @Override // java.lang.Runnable
            public final void run() {
                boolean zBooleanValue = ((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25453W4)).booleanValue();
                com.google.android.gms.internal.ads.C5363ud c5363ud = this.f38030C;
                android.content.Context context2 = context;
                if (zBooleanValue) {
                    try {
                        c5363ud.f39188a = (com.google.android.gms.internal.ads.InterfaceC2449Ib) p224w3.t.b(context2, "com.google.android.gms.ads.clearcut.DynamiteClearcutLogger", new p224w3.r() { // from class: com.google.android.gms.internal.ads.qd
                            @Override // p224w3.r
                            public final java.lang.Object b(java.lang.Object obj) {
                                return com.google.android.gms.internal.ads.AbstractBinderC2412Hb.o6((android.os.IBinder) obj);
                            }
                        });
                        c5363ud.f39188a.a5(X3.b.c2(context2), "GMA_SDK");
                        c5363ud.f39189b = true;
                    } catch (android.os.RemoteException | java.lang.NullPointerException | p224w3.s unused) {
                        p224w3.p.b("Cannot dynamite load clearcut");
                    }
                }
            }
        });
    }
}
