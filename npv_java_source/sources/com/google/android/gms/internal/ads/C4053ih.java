package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.ih, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4053ih extends p134n3.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC3944hh f36333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.List f36334b = new java.util.ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private java.lang.String f36335c;

    public C4053ih(com.google.android.gms.internal.ads.InterfaceC3944hh interfaceC3944hh) {
        android.os.IBinder iBinder;
        this.f36333a = interfaceC3944hh;
        try {
            this.f36335c = interfaceC3944hh.i();
        } catch (android.os.RemoteException e6) {
            p224w3.p.e("", e6);
            this.f36335c = "";
        }
        try {
            for (java.lang.Object obj : interfaceC3944hh.g()) {
                com.google.android.gms.internal.ads.InterfaceC4712oh c4492mh = null;
                if ((obj instanceof android.os.IBinder) && (iBinder = (android.os.IBinder) obj) != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                    c4492mh = iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.ads.InterfaceC4712oh ? (com.google.android.gms.internal.ads.InterfaceC4712oh) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.ads.C4492mh(iBinder);
                }
                if (c4492mh != null) {
                    this.f36334b.add(new com.google.android.gms.internal.ads.C4822ph(c4492mh));
                }
            }
        } catch (android.os.RemoteException e10) {
            p224w3.p.e("", e10);
        }
    }
}
