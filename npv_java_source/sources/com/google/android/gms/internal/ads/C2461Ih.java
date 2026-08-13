package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Ih, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2461Ih {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC2424Hh f28493a;

    public C2461Ih(com.google.android.gms.internal.ads.InterfaceC2424Hh interfaceC2424Hh) {
        android.content.Context context;
        this.f28493a = interfaceC2424Hh;
        try {
            context = (android.content.Context) X3.b.L0(interfaceC2424Hh.g());
        } catch (android.os.RemoteException | java.lang.NullPointerException e6) {
            p224w3.p.e("", e6);
            context = null;
        }
        if (context != null) {
            try {
                this.f28493a.C0(X3.b.c2(new p134n3.b(context)));
            } catch (android.os.RemoteException e10) {
                p224w3.p.e("", e10);
            }
        }
    }

    public final com.google.android.gms.internal.ads.InterfaceC2424Hh a() {
        return this.f28493a;
    }

    public final java.lang.String b() {
        try {
            return this.f28493a.h();
        } catch (android.os.RemoteException e6) {
            p224w3.p.e("", e6);
            return null;
        }
    }
}
