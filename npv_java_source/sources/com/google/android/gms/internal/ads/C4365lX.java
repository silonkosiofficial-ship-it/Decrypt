package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.lX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4365lX {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j$.util.concurrent.ConcurrentHashMap f37181a = new j$.util.concurrent.ConcurrentHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.SM f37182b;

    public C4365lX(com.google.android.gms.internal.ads.SM sm) {
        this.f37182b = sm;
    }

    public final com.google.android.gms.internal.ads.InterfaceC2874Tm a(java.lang.String str) {
        if (this.f37181a.containsKey(str)) {
            return (com.google.android.gms.internal.ads.InterfaceC2874Tm) this.f37181a.get(str);
        }
        return null;
    }

    public final void b(java.lang.String str) {
        try {
            this.f37181a.put(str, this.f37182b.b(str));
        } catch (android.os.RemoteException e6) {
            p214v3.AbstractC7265q0.l("Couldn't create RTB adapter : ", e6);
        }
    }
}
