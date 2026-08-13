package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Zj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3086Zj implements com.google.android.gms.internal.ads.W6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile com.google.android.gms.internal.ads.C2576Lj f33649a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final android.content.Context f33650b;

    public C3086Zj(android.content.Context context) {
        this.f33650b = context;
    }

    static /* bridge */ /* synthetic */ void c(com.google.android.gms.internal.ads.C3086Zj c3086Zj) {
        if (c3086Zj.f33649a == null) {
            return;
        }
        c3086Zj.f33649a.h();
        android.os.Binder.flushPendingCommands();
    }

    @Override // com.google.android.gms.internal.ads.W6
    public final com.google.android.gms.internal.ads.Z6 a(com.google.android.gms.internal.ads.AbstractC3448d7 abstractC3448d7) throws com.google.android.gms.internal.ads.C4215k7 {
        android.os.Parcelable.Creator<com.google.android.gms.internal.ads.C2649Nj> creator = com.google.android.gms.internal.ads.C2649Nj.CREATOR;
        java.util.Map mapU = abstractC3448d7.u();
        int size = mapU.size();
        java.lang.String[] strArr = new java.lang.String[size];
        java.lang.String[] strArr2 = new java.lang.String[size];
        int i6 = 0;
        int i10 = 0;
        for (java.util.Map.Entry entry : mapU.entrySet()) {
            strArr[i10] = (java.lang.String) entry.getKey();
            strArr2[i10] = (java.lang.String) entry.getValue();
            i10++;
        }
        com.google.android.gms.internal.ads.C2649Nj c2649Nj = new com.google.android.gms.internal.ads.C2649Nj(abstractC3448d7.t(), strArr, strArr2);
        long jC = p174r3.v.c().c();
        try {
            com.google.android.gms.internal.ads.C4512mr c4512mr = new com.google.android.gms.internal.ads.C4512mr();
            this.f33649a = new com.google.android.gms.internal.ads.C2576Lj(this.f33650b, p174r3.v.x().b(), new com.google.android.gms.internal.ads.C3014Xj(this, c4512mr), new com.google.android.gms.internal.ads.C3050Yj(this, c4512mr));
            this.f33649a.q();
            com.google.android.gms.internal.ads.C2942Vj c2942Vj = new com.google.android.gms.internal.ads.C2942Vj(this, c2649Nj);
            com.google.android.gms.internal.ads.Yk0 yk0 = com.google.android.gms.internal.ads.AbstractC3524dr.f34795a;
            P4.d dVarO = com.google.android.gms.internal.ads.AbstractC2652Nk0.o(com.google.android.gms.internal.ads.AbstractC2652Nk0.n(c4512mr, c2942Vj, yk0), ((java.lang.Integer) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25746y4)).intValue(), java.util.concurrent.TimeUnit.MILLISECONDS, com.google.android.gms.internal.ads.AbstractC3524dr.f34798d);
            dVarO.e(new com.google.android.gms.internal.ads.RunnableC2978Wj(this), yk0);
            android.os.ParcelFileDescriptor parcelFileDescriptor = (android.os.ParcelFileDescriptor) dVarO.get();
            p214v3.AbstractC7265q0.k("Http assets remote cache took " + (p174r3.v.c().c() - jC) + "ms");
            com.google.android.gms.internal.ads.C2723Pj c2723Pj = (com.google.android.gms.internal.ads.C2723Pj) new com.google.android.gms.internal.ads.C2656No(parcelFileDescriptor).e(com.google.android.gms.internal.ads.C2723Pj.CREATOR);
            if (c2723Pj == null) {
                return null;
            }
            if (c2723Pj.f30768C) {
                throw new com.google.android.gms.internal.ads.C4215k7(c2723Pj.f30769D);
            }
            if (c2723Pj.f30772G.length != c2723Pj.f30773H.length) {
                return null;
            }
            java.util.HashMap map = new java.util.HashMap();
            while (true) {
                java.lang.String[] strArr3 = c2723Pj.f30772G;
                if (i6 >= strArr3.length) {
                    return new com.google.android.gms.internal.ads.Z6(c2723Pj.f30770E, c2723Pj.f30771F, map, c2723Pj.f30774I, c2723Pj.f30775J);
                }
                map.put(strArr3[i6], c2723Pj.f30773H[i6]);
                i6++;
            }
        } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException unused) {
            p214v3.AbstractC7265q0.k("Http assets remote cache took " + (p174r3.v.c().c() - jC) + "ms");
            return null;
        } catch (java.lang.Throwable th) {
            p214v3.AbstractC7265q0.k("Http assets remote cache took " + (p174r3.v.c().c() - jC) + "ms");
            throw th;
        }
    }
}
