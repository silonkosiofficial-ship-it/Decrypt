package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class VI implements com.google.android.gms.internal.ads.InterfaceC2633Nb {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    final /* synthetic */ java.lang.String f32483C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.ZI f32484D;

    VI(com.google.android.gms.internal.ads.ZI zi, java.lang.String str) {
        this.f32483C = str;
        this.f32484D = zi;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2633Nb
    public final void L(com.google.android.gms.internal.ads.C2596Mb c2596Mb) {
        if (!((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25395R1)).booleanValue()) {
            if (c2596Mb.f29800j) {
                com.google.android.gms.internal.ads.ZI zi = this.f32484D;
                if (zi.f33561u != null) {
                    zi.f33548E.put(this.f32483C, java.lang.Boolean.TRUE);
                    com.google.android.gms.internal.ads.ZI zi2 = this.f32484D;
                    if (zi2.f33561u == null) {
                        return;
                    }
                    zi2.j(zi2.f33561u.e(), this.f32484D.f33561u.l(), this.f32484D.f33561u.m(), true);
                    return;
                }
                return;
            }
            return;
        }
        synchronized (this) {
            try {
                if (c2596Mb.f29800j) {
                    com.google.android.gms.internal.ads.ZI zi3 = this.f32484D;
                    if (zi3.f33561u != null) {
                        zi3.f33548E.put(this.f32483C, java.lang.Boolean.TRUE);
                        com.google.android.gms.internal.ads.ZI zi4 = this.f32484D;
                        if (zi4.f33561u == null) {
                        } else {
                            zi4.j(zi4.f33561u.e(), this.f32484D.f33561u.l(), this.f32484D.f33561u.m(), true);
                        }
                    }
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }
}
