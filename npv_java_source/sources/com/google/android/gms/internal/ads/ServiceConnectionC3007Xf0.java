package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Xf0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class ServiceConnectionC3007Xf0 implements android.content.ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.C3079Zf0 f33159a;

    /* synthetic */ ServiceConnectionC3007Xf0(com.google.android.gms.internal.ads.C3079Zf0 c3079Zf0, com.google.android.gms.internal.ads.AbstractC3043Yf0 abstractC3043Yf0) {
        this.f33159a = c3079Zf0;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(android.content.ComponentName componentName, final android.os.IBinder iBinder) {
        this.f33159a.f33637c.c("LmdServiceConnectionManager.onServiceConnected(%s)", componentName);
        this.f33159a.o(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.Vf0
            @Override // java.lang.Runnable
            public final void run() {
                com.google.android.gms.internal.ads.InterfaceC3005Xe0 interfaceC3005Xe0O6 = com.google.android.gms.internal.ads.AbstractBinderC2969We0.o6(iBinder);
                com.google.android.gms.internal.ads.ServiceConnectionC3007Xf0 serviceConnectionC3007Xf0 = this.f32549C;
                serviceConnectionC3007Xf0.f33159a.f33644j = interfaceC3005Xe0O6;
                serviceConnectionC3007Xf0.f33159a.f33637c.c("linkToDeath", new java.lang.Object[0]);
                try {
                    android.os.IInterface iInterface = serviceConnectionC3007Xf0.f33159a.f33644j;
                    if (iInterface == null) {
                        throw null;
                    }
                    iInterface.asBinder().linkToDeath(serviceConnectionC3007Xf0.f33159a.f33642h, 0);
                    serviceConnectionC3007Xf0.f33159a.f33640f = false;
                    synchronized (serviceConnectionC3007Xf0.f33159a.f33639e) {
                        try {
                            java.util.Iterator it = serviceConnectionC3007Xf0.f33159a.f33639e.iterator();
                            while (it.hasNext()) {
                                ((java.lang.Runnable) it.next()).run();
                            }
                            serviceConnectionC3007Xf0.f33159a.f33639e.clear();
                        } catch (java.lang.Throwable th) {
                            throw th;
                        }
                    }
                } catch (android.os.RemoteException e6) {
                    serviceConnectionC3007Xf0.f33159a.f33637c.b(e6, "linkToDeath failed", new java.lang.Object[0]);
                }
            }
        });
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(android.content.ComponentName componentName) {
        this.f33159a.f33637c.c("LmdServiceConnectionManager.onServiceDisconnected(%s)", componentName);
        this.f33159a.o(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.Wf0
            @Override // java.lang.Runnable
            public final void run() {
                com.google.android.gms.internal.ads.ServiceConnectionC3007Xf0 serviceConnectionC3007Xf0 = this.f32777C;
                serviceConnectionC3007Xf0.f33159a.f33637c.c("unlinkToDeath", new java.lang.Object[0]);
                android.os.IInterface iInterface = serviceConnectionC3007Xf0.f33159a.f33644j;
                iInterface.getClass();
                iInterface.asBinder().unlinkToDeath(serviceConnectionC3007Xf0.f33159a.f33642h, 0);
                serviceConnectionC3007Xf0.f33159a.f33644j = null;
                serviceConnectionC3007Xf0.f33159a.f33640f = false;
            }
        });
    }
}
