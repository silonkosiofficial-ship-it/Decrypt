package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.yn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5823yn extends com.google.android.gms.ads.nativead.NativeAd.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.List f40132a = new java.util.ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private java.lang.String f40133b;

    public C5823yn(com.google.android.gms.internal.ads.InterfaceC3944hh interfaceC3944hh) {
        try {
            this.f40133b = interfaceC3944hh.i();
        } catch (android.os.RemoteException e6) {
            p224w3.p.e("", e6);
            this.f40133b = "";
        }
        try {
            for (java.lang.Object obj : interfaceC3944hh.g()) {
                com.google.android.gms.internal.ads.InterfaceC4712oh interfaceC4712ohO6 = obj instanceof android.os.IBinder ? com.google.android.gms.internal.ads.AbstractBinderC4602nh.o6((android.os.IBinder) obj) : null;
                if (interfaceC4712ohO6 != null) {
                    this.f40132a.add(new com.google.android.gms.internal.ads.C5933zn(interfaceC4712ohO6));
                }
            }
        } catch (android.os.RemoteException e10) {
            p224w3.p.e("", e10);
        }
    }
}
