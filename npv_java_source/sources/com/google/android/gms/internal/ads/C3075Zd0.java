package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Zd0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3075Zd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final com.google.android.gms.internal.ads.InterfaceC3390ce0 f33632a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final boolean f33633b;

    private C3075Zd0(com.google.android.gms.internal.ads.InterfaceC3390ce0 interfaceC3390ce0) {
        this.f33632a = interfaceC3390ce0;
        this.f33633b = interfaceC3390ce0 != null;
    }

    public static com.google.android.gms.internal.ads.C3075Zd0 b(android.content.Context context, java.lang.String str, java.lang.String str2) {
        com.google.android.gms.internal.ads.InterfaceC3390ce0 c3171ae0;
        try {
            try {
                try {
                    android.os.IBinder iBinderD = com.google.android.gms.dynamite.DynamiteModule.e(context, com.google.android.gms.dynamite.DynamiteModule.f24967b, "com.google.android.gms.ads.dynamite").d("com.google.android.gms.gass.internal.clearcut.GassDynamiteClearcutLogger");
                    if (iBinderD == null) {
                        c3171ae0 = null;
                    } else {
                        android.os.IInterface iInterfaceQueryLocalInterface = iBinderD.queryLocalInterface("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
                        c3171ae0 = iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.ads.InterfaceC3390ce0 ? (com.google.android.gms.internal.ads.InterfaceC3390ce0) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.ads.C3171ae0(iBinderD);
                    }
                    c3171ae0.V4(X3.b.c2(context), str, null);
                    return new com.google.android.gms.internal.ads.C3075Zd0(c3171ae0);
                } catch (android.os.RemoteException | com.google.android.gms.internal.ads.C2158Ad0 | java.lang.NullPointerException | java.lang.SecurityException unused) {
                    return new com.google.android.gms.internal.ads.C3075Zd0(new com.google.android.gms.internal.ads.BinderC3500de0());
                }
            } catch (java.lang.Exception e6) {
                throw new com.google.android.gms.internal.ads.C2158Ad0(e6);
            }
        } catch (java.lang.Exception e10) {
            throw new com.google.android.gms.internal.ads.C2158Ad0(e10);
        }
    }

    public static com.google.android.gms.internal.ads.C3075Zd0 c() {
        return new com.google.android.gms.internal.ads.C3075Zd0(new com.google.android.gms.internal.ads.BinderC3500de0());
    }

    public final com.google.android.gms.internal.ads.C3003Xd0 a(byte[] bArr) {
        return new com.google.android.gms.internal.ads.C3003Xd0(this, bArr, null);
    }
}
