package com.google.android.gms.ads.internal.overlay;

/* JADX INFO: loaded from: classes.dex */
public final class AdOverlayInfoParcel extends R3.a implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel> CREATOR = new com.google.android.gms.ads.internal.overlay.a();

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private static final java.util.concurrent.atomic.AtomicLong f24708a0 = new java.util.concurrent.atomic.AtomicLong(0);

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private static final j$.util.concurrent.ConcurrentHashMap f24709b0 = new j$.util.concurrent.ConcurrentHashMap();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final p204u3.l f24710C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final p184s3.InterfaceC7076a f24711D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final p204u3.z f24712E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final com.google.android.gms.internal.ads.InterfaceC2698Ot f24713F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final com.google.android.gms.internal.ads.InterfaceC5703xi f24714G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final java.lang.String f24715H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final boolean f24716I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final java.lang.String f24717J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final p204u3.InterfaceC7202d f24718K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final int f24719L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final int f24720M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public final java.lang.String f24721N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final p224w3.a f24722O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public final java.lang.String f24723P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final p174r3.l f24724Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public final com.google.android.gms.internal.ads.InterfaceC5483vi f24725R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public final java.lang.String f24726S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public final java.lang.String f24727T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public final java.lang.String f24728U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public final com.google.android.gms.internal.ads.SC f24729V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public final com.google.android.gms.internal.ads.MG f24730W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public final com.google.android.gms.internal.ads.InterfaceC2323En f24731X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final boolean f24732Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public final long f24733Z;

    public AdOverlayInfoParcel(com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698Ot, p224w3.a aVar, java.lang.String str, java.lang.String str2, int i6, com.google.android.gms.internal.ads.InterfaceC2323En interfaceC2323En) {
        this.f24710C = null;
        this.f24711D = null;
        this.f24712E = null;
        this.f24713F = interfaceC2698Ot;
        this.f24725R = null;
        this.f24714G = null;
        this.f24715H = null;
        this.f24716I = false;
        this.f24717J = null;
        this.f24718K = null;
        this.f24719L = 14;
        this.f24720M = 5;
        this.f24721N = null;
        this.f24722O = aVar;
        this.f24723P = null;
        this.f24724Q = null;
        this.f24726S = str;
        this.f24727T = str2;
        this.f24728U = null;
        this.f24729V = null;
        this.f24730W = null;
        this.f24731X = interfaceC2323En;
        this.f24732Y = false;
        this.f24733Z = f24708a0.getAndIncrement();
    }

    public AdOverlayInfoParcel(p184s3.InterfaceC7076a interfaceC7076a, p204u3.z zVar, com.google.android.gms.internal.ads.InterfaceC5483vi interfaceC5483vi, com.google.android.gms.internal.ads.InterfaceC5703xi interfaceC5703xi, p204u3.InterfaceC7202d interfaceC7202d, com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698Ot, boolean z6, int i6, java.lang.String str, java.lang.String str2, p224w3.a aVar, com.google.android.gms.internal.ads.MG mg, com.google.android.gms.internal.ads.InterfaceC2323En interfaceC2323En) {
        this.f24710C = null;
        this.f24711D = interfaceC7076a;
        this.f24712E = zVar;
        this.f24713F = interfaceC2698Ot;
        this.f24725R = interfaceC5483vi;
        this.f24714G = interfaceC5703xi;
        this.f24715H = str2;
        this.f24716I = z6;
        this.f24717J = str;
        this.f24718K = interfaceC7202d;
        this.f24719L = i6;
        this.f24720M = 3;
        this.f24721N = null;
        this.f24722O = aVar;
        this.f24723P = null;
        this.f24724Q = null;
        this.f24726S = null;
        this.f24727T = null;
        this.f24728U = null;
        this.f24729V = null;
        this.f24730W = mg;
        this.f24731X = interfaceC2323En;
        this.f24732Y = false;
        this.f24733Z = f24708a0.getAndIncrement();
    }

    public AdOverlayInfoParcel(p184s3.InterfaceC7076a interfaceC7076a, p204u3.z zVar, com.google.android.gms.internal.ads.InterfaceC5483vi interfaceC5483vi, com.google.android.gms.internal.ads.InterfaceC5703xi interfaceC5703xi, p204u3.InterfaceC7202d interfaceC7202d, com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698Ot, boolean z6, int i6, java.lang.String str, p224w3.a aVar, com.google.android.gms.internal.ads.MG mg, com.google.android.gms.internal.ads.InterfaceC2323En interfaceC2323En, boolean z10) {
        this.f24710C = null;
        this.f24711D = interfaceC7076a;
        this.f24712E = zVar;
        this.f24713F = interfaceC2698Ot;
        this.f24725R = interfaceC5483vi;
        this.f24714G = interfaceC5703xi;
        this.f24715H = null;
        this.f24716I = z6;
        this.f24717J = null;
        this.f24718K = interfaceC7202d;
        this.f24719L = i6;
        this.f24720M = 3;
        this.f24721N = str;
        this.f24722O = aVar;
        this.f24723P = null;
        this.f24724Q = null;
        this.f24726S = null;
        this.f24727T = null;
        this.f24728U = null;
        this.f24729V = null;
        this.f24730W = mg;
        this.f24731X = interfaceC2323En;
        this.f24732Y = z10;
        this.f24733Z = f24708a0.getAndIncrement();
    }

    public AdOverlayInfoParcel(p184s3.InterfaceC7076a interfaceC7076a, p204u3.z zVar, p204u3.InterfaceC7202d interfaceC7202d, com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698Ot, int i6, p224w3.a aVar, java.lang.String str, p174r3.l lVar, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.google.android.gms.internal.ads.SC sc, com.google.android.gms.internal.ads.InterfaceC2323En interfaceC2323En, java.lang.String str5) {
        this.f24710C = null;
        this.f24711D = null;
        this.f24712E = zVar;
        this.f24713F = interfaceC2698Ot;
        this.f24725R = null;
        this.f24714G = null;
        this.f24716I = false;
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25416T0)).booleanValue()) {
            this.f24715H = null;
            this.f24717J = null;
        } else {
            this.f24715H = str2;
            this.f24717J = str3;
        }
        this.f24718K = null;
        this.f24719L = i6;
        this.f24720M = 1;
        this.f24721N = null;
        this.f24722O = aVar;
        this.f24723P = str;
        this.f24724Q = lVar;
        this.f24726S = str5;
        this.f24727T = null;
        this.f24728U = str4;
        this.f24729V = sc;
        this.f24730W = null;
        this.f24731X = interfaceC2323En;
        this.f24732Y = false;
        this.f24733Z = f24708a0.getAndIncrement();
    }

    public AdOverlayInfoParcel(p184s3.InterfaceC7076a interfaceC7076a, p204u3.z zVar, p204u3.InterfaceC7202d interfaceC7202d, com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698Ot, boolean z6, int i6, p224w3.a aVar, com.google.android.gms.internal.ads.MG mg, com.google.android.gms.internal.ads.InterfaceC2323En interfaceC2323En) {
        this.f24710C = null;
        this.f24711D = interfaceC7076a;
        this.f24712E = zVar;
        this.f24713F = interfaceC2698Ot;
        this.f24725R = null;
        this.f24714G = null;
        this.f24715H = null;
        this.f24716I = z6;
        this.f24717J = null;
        this.f24718K = interfaceC7202d;
        this.f24719L = i6;
        this.f24720M = 2;
        this.f24721N = null;
        this.f24722O = aVar;
        this.f24723P = null;
        this.f24724Q = null;
        this.f24726S = null;
        this.f24727T = null;
        this.f24728U = null;
        this.f24729V = null;
        this.f24730W = mg;
        this.f24731X = interfaceC2323En;
        this.f24732Y = false;
        this.f24733Z = f24708a0.getAndIncrement();
    }

    AdOverlayInfoParcel(p204u3.l lVar, android.os.IBinder iBinder, android.os.IBinder iBinder2, android.os.IBinder iBinder3, android.os.IBinder iBinder4, java.lang.String str, boolean z6, java.lang.String str2, android.os.IBinder iBinder5, int i6, int i10, java.lang.String str3, p224w3.a aVar, java.lang.String str4, p174r3.l lVar2, android.os.IBinder iBinder6, java.lang.String str5, java.lang.String str6, java.lang.String str7, android.os.IBinder iBinder7, android.os.IBinder iBinder8, android.os.IBinder iBinder9, boolean z10, long j6) {
        this.f24710C = lVar;
        this.f24715H = str;
        this.f24716I = z6;
        this.f24717J = str2;
        this.f24719L = i6;
        this.f24720M = i10;
        this.f24721N = str3;
        this.f24722O = aVar;
        this.f24723P = str4;
        this.f24724Q = lVar2;
        this.f24726S = str5;
        this.f24727T = str6;
        this.f24728U = str7;
        this.f24732Y = z10;
        this.f24733Z = j6;
        if (!((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.Mc)).booleanValue()) {
            this.f24711D = (p184s3.InterfaceC7076a) X3.b.L0(X3.a.AbstractBinderC0301a.y0(iBinder));
            this.f24712E = (p204u3.z) X3.b.L0(X3.a.AbstractBinderC0301a.y0(iBinder2));
            this.f24713F = (com.google.android.gms.internal.ads.InterfaceC2698Ot) X3.b.L0(X3.a.AbstractBinderC0301a.y0(iBinder3));
            this.f24725R = (com.google.android.gms.internal.ads.InterfaceC5483vi) X3.b.L0(X3.a.AbstractBinderC0301a.y0(iBinder6));
            this.f24714G = (com.google.android.gms.internal.ads.InterfaceC5703xi) X3.b.L0(X3.a.AbstractBinderC0301a.y0(iBinder4));
            this.f24718K = (p204u3.InterfaceC7202d) X3.b.L0(X3.a.AbstractBinderC0301a.y0(iBinder5));
            this.f24729V = (com.google.android.gms.internal.ads.SC) X3.b.L0(X3.a.AbstractBinderC0301a.y0(iBinder7));
            this.f24730W = (com.google.android.gms.internal.ads.MG) X3.b.L0(X3.a.AbstractBinderC0301a.y0(iBinder8));
            this.f24731X = (com.google.android.gms.internal.ads.InterfaceC2323En) X3.b.L0(X3.a.AbstractBinderC0301a.y0(iBinder9));
            return;
        }
        com.google.android.gms.ads.internal.overlay.b bVar = (com.google.android.gms.ads.internal.overlay.b) f24709b0.remove(java.lang.Long.valueOf(j6));
        if (bVar == null) {
            throw new java.lang.NullPointerException("AdOverlayObjects is null");
        }
        this.f24711D = bVar.f24734a;
        this.f24712E = bVar.f24735b;
        this.f24713F = bVar.f24736c;
        this.f24725R = bVar.f24737d;
        this.f24714G = bVar.f24738e;
        this.f24729V = bVar.f24740g;
        this.f24730W = bVar.f24741h;
        this.f24731X = bVar.f24742i;
        this.f24718K = bVar.f24739f;
        bVar.f24743j.cancel(false);
    }

    public AdOverlayInfoParcel(p204u3.l lVar, p184s3.InterfaceC7076a interfaceC7076a, p204u3.z zVar, p204u3.InterfaceC7202d interfaceC7202d, p224w3.a aVar, com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698Ot, com.google.android.gms.internal.ads.MG mg, java.lang.String str) {
        this.f24710C = lVar;
        this.f24711D = interfaceC7076a;
        this.f24712E = zVar;
        this.f24713F = interfaceC2698Ot;
        this.f24725R = null;
        this.f24714G = null;
        this.f24715H = null;
        this.f24716I = false;
        this.f24717J = null;
        this.f24718K = interfaceC7202d;
        this.f24719L = -1;
        this.f24720M = 4;
        this.f24721N = null;
        this.f24722O = aVar;
        this.f24723P = null;
        this.f24724Q = null;
        this.f24726S = str;
        this.f24727T = null;
        this.f24728U = null;
        this.f24729V = null;
        this.f24730W = mg;
        this.f24731X = null;
        this.f24732Y = false;
        this.f24733Z = f24708a0.getAndIncrement();
    }

    public AdOverlayInfoParcel(p204u3.z zVar, com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698Ot, int i6, p224w3.a aVar) {
        this.f24712E = zVar;
        this.f24713F = interfaceC2698Ot;
        this.f24719L = 1;
        this.f24722O = aVar;
        this.f24710C = null;
        this.f24711D = null;
        this.f24725R = null;
        this.f24714G = null;
        this.f24715H = null;
        this.f24716I = false;
        this.f24717J = null;
        this.f24718K = null;
        this.f24720M = 1;
        this.f24721N = null;
        this.f24723P = null;
        this.f24724Q = null;
        this.f24726S = null;
        this.f24727T = null;
        this.f24728U = null;
        this.f24729V = null;
        this.f24730W = null;
        this.f24731X = null;
        this.f24732Y = false;
        this.f24733Z = f24708a0.getAndIncrement();
    }

    public static com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel e(android.content.Intent intent) {
        try {
            android.os.Bundle bundleExtra = intent.getBundleExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
            bundleExtra.setClassLoader(com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel.class.getClassLoader());
            return (com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel) bundleExtra.getParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
        } catch (java.lang.Exception e6) {
            if (!((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.Mc)).booleanValue()) {
                return null;
            }
            p174r3.v.s().x(e6, "AdOverlayInfoParcel.getFromIntent");
            return null;
        }
    }

    private static final android.os.IBinder s(java.lang.Object obj) {
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.Mc)).booleanValue()) {
            return null;
        }
        return X3.b.c2(obj).asBinder();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i6) {
        int iA = R3.c.a(parcel);
        R3.c.p(parcel, 2, this.f24710C, i6, false);
        R3.c.j(parcel, 3, s(this.f24711D), false);
        R3.c.j(parcel, 4, s(this.f24712E), false);
        R3.c.j(parcel, 5, s(this.f24713F), false);
        R3.c.j(parcel, 6, s(this.f24714G), false);
        R3.c.q(parcel, 7, this.f24715H, false);
        R3.c.c(parcel, 8, this.f24716I);
        R3.c.q(parcel, 9, this.f24717J, false);
        R3.c.j(parcel, 10, s(this.f24718K), false);
        R3.c.k(parcel, 11, this.f24719L);
        R3.c.k(parcel, 12, this.f24720M);
        R3.c.q(parcel, 13, this.f24721N, false);
        R3.c.p(parcel, 14, this.f24722O, i6, false);
        R3.c.q(parcel, 16, this.f24723P, false);
        R3.c.p(parcel, 17, this.f24724Q, i6, false);
        R3.c.j(parcel, 18, s(this.f24725R), false);
        R3.c.q(parcel, 19, this.f24726S, false);
        R3.c.q(parcel, 24, this.f24727T, false);
        R3.c.q(parcel, 25, this.f24728U, false);
        R3.c.j(parcel, 26, s(this.f24729V), false);
        R3.c.j(parcel, 27, s(this.f24730W), false);
        R3.c.j(parcel, 28, s(this.f24731X), false);
        R3.c.c(parcel, 29, this.f24732Y);
        R3.c.n(parcel, 30, this.f24733Z);
        R3.c.b(parcel, iA);
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.Mc)).booleanValue()) {
            f24709b0.put(java.lang.Long.valueOf(this.f24733Z), new com.google.android.gms.ads.internal.overlay.b(this.f24711D, this.f24712E, this.f24713F, this.f24725R, this.f24714G, this.f24718K, this.f24729V, this.f24730W, this.f24731X, com.google.android.gms.internal.ads.AbstractC3524dr.f34798d.schedule(new com.google.android.gms.ads.internal.overlay.c(this.f24733Z), ((java.lang.Integer) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.Oc)).intValue(), java.util.concurrent.TimeUnit.SECONDS)));
        }
    }
}
