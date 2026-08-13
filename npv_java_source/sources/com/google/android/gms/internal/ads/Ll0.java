package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class Ll0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.List f29558a = new java.util.ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.Cp0 f29559b = com.google.android.gms.internal.ads.Cp0.f26289b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f29560c = false;

    /* JADX INFO: Access modifiers changed from: private */
    public final void d() {
        java.util.Iterator it = this.f29558a.iterator();
        while (it.hasNext()) {
            ((com.google.android.gms.internal.ads.Jl0) it.next()).f28744a = false;
        }
    }

    public final com.google.android.gms.internal.ads.Ll0 a(com.google.android.gms.internal.ads.Jl0 jl0) {
        if (jl0.f28749f != null) {
            throw new java.lang.IllegalStateException("Entry has already been added to a KeysetHandle.Builder");
        }
        if (jl0.f28744a) {
            d();
        }
        jl0.f28749f = this;
        this.f29558a.add(jl0);
        return this;
    }

    public final com.google.android.gms.internal.ads.Ol0 b() throws java.security.GeneralSecurityException {
        int i6;
        int i10;
        if (this.f29560c) {
            throw new java.security.GeneralSecurityException("KeysetHandle.Builder#build must only be called once");
        }
        char c6 = 1;
        this.f29560c = true;
        java.util.List list = this.f29558a;
        com.google.android.gms.internal.ads.C4627nt0 c4627nt0D0 = com.google.android.gms.internal.ads.C5066rt0.d0();
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        java.util.List list2 = this.f29558a;
        int i11 = 0;
        int i12 = 0;
        while (i12 < list2.size() - 1) {
            int i13 = i12 + 1;
            if (((com.google.android.gms.internal.ads.Jl0) list2.get(i12)).f28748e == com.google.android.gms.internal.ads.Kl0.f29008a && ((com.google.android.gms.internal.ads.Jl0) list2.get(i13)).f28748e != com.google.android.gms.internal.ads.Kl0.f29008a) {
                throw new java.security.GeneralSecurityException("Entries with 'withRandomId()' may only be followed by other entries with 'withRandomId()'.");
            }
            i12 = i13;
        }
        java.util.HashSet hashSet = new java.util.HashSet();
        java.lang.Integer num = null;
        for (com.google.android.gms.internal.ads.Jl0 jl0 : this.f29558a) {
            com.google.android.gms.internal.ads.Gl0 unused = jl0.f28745b;
            if (jl0.f28748e == null) {
                throw new java.security.GeneralSecurityException("No ID was set (with withFixedId or withRandomId)");
            }
            int i14 = 4;
            if (jl0.f28748e == com.google.android.gms.internal.ads.Kl0.f29008a) {
                i6 = i11;
                while (true) {
                    if (i6 != 0 && !hashSet.contains(java.lang.Integer.valueOf(i6))) {
                        break;
                    }
                    java.security.SecureRandom secureRandom = new java.security.SecureRandom();
                    byte[] bArr = new byte[i14];
                    int i15 = i11;
                    while (i15 == 0) {
                        secureRandom.nextBytes(bArr);
                        i15 = ((bArr[2] & 255) << 8) | ((bArr[i11] & 255) << 24) | ((bArr[c6] & 255) << 16) | (bArr[3] & 255);
                        i11 = 0;
                        i14 = 4;
                    }
                    i6 = i15;
                }
            } else {
                com.google.android.gms.internal.ads.Kl0 unused2 = jl0.f28748e;
                i6 = 0;
            }
            java.lang.Integer numValueOf = java.lang.Integer.valueOf(i6);
            if (hashSet.contains(numValueOf)) {
                throw new java.security.GeneralSecurityException("Id " + i6 + " is used twice in the keyset");
            }
            hashSet.add(numValueOf);
            com.google.android.gms.internal.ads.Jl0.a(jl0);
            com.google.android.gms.internal.ads.El0 el0A = com.google.android.gms.internal.ads.Pp0.b().a(jl0.f28747d, c6 != jl0.f28747d.a() ? null : numValueOf);
            com.google.android.gms.internal.ads.Ml0 ml0 = new com.google.android.gms.internal.ads.Ml0(el0A, jl0.f28745b, i6, jl0.f28744a, null);
            com.google.android.gms.internal.ads.Gl0 gl0 = jl0.f28745b;
            com.google.android.gms.internal.ads.C5720xq0 c5720xq0 = (com.google.android.gms.internal.ads.C5720xq0) com.google.android.gms.internal.ads.Zp0.c().d(el0A, com.google.android.gms.internal.ads.C5720xq0.class, com.google.android.gms.internal.ads.Wl0.a());
            java.lang.Integer numE = c5720xq0.e();
            if (numE != null && numE.intValue() != i6) {
                throw new java.security.GeneralSecurityException("Wrong ID set for key with ID requirement");
            }
            com.google.android.gms.internal.ads.Gl0 gl1 = com.google.android.gms.internal.ads.Gl0.f27875b;
            if (gl1.equals(gl0)) {
                i10 = 3;
            } else if (com.google.android.gms.internal.ads.Gl0.f27876c.equals(gl0)) {
                i10 = 4;
            } else {
                if (!com.google.android.gms.internal.ads.Gl0.f27877d.equals(gl0)) {
                    throw new java.lang.IllegalStateException("Unknown key status");
                }
                i10 = 5;
            }
            com.google.android.gms.internal.ads.C4737ot0 c4737ot0D0 = com.google.android.gms.internal.ads.C4847pt0.d0();
            com.google.android.gms.internal.ads.C3420ct0 c3420ct0B0 = com.google.android.gms.internal.ads.C3749ft0.b0();
            c3420ct0B0.A(c5720xq0.g());
            c3420ct0B0.B(c5720xq0.d());
            c3420ct0B0.z(c5720xq0.b());
            c4737ot0D0.z(c3420ct0B0);
            c4737ot0D0.C(i10);
            c4737ot0D0.A(i6);
            c4737ot0D0.B(c5720xq0.c());
            c4627nt0D0.z((com.google.android.gms.internal.ads.C4847pt0) c4737ot0D0.u());
            if (jl0.f28744a) {
                if (num != null) {
                    throw new java.security.GeneralSecurityException("Two primaries were set");
                }
                if (jl0.f28745b != gl1) {
                    throw new java.security.GeneralSecurityException("Primary key is not enabled");
                }
                num = numValueOf;
            }
            arrayList.add(ml0);
            c6 = 1;
            i11 = 0;
        }
        if (num == null) {
            throw new java.security.GeneralSecurityException("No primary was set");
        }
        c4627nt0D0.A(num.intValue());
        com.google.android.gms.internal.ads.C5066rt0 c5066rt0 = (com.google.android.gms.internal.ads.C5066rt0) c4627nt0D0.u();
        com.google.android.gms.internal.ads.Ol0.h(c5066rt0);
        return new com.google.android.gms.internal.ads.Ol0(c5066rt0, arrayList, this.f29559b, null);
    }
}
