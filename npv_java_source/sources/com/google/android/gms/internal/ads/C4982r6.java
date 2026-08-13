package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.r6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C4982r6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.List f38434a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC3107a1[] f38435b;

    public C4982r6(java.util.List list) {
        this.f38434a = list;
        this.f38435b = new com.google.android.gms.internal.ads.InterfaceC3107a1[list.size()];
    }

    public final void a(long j6, com.google.android.gms.internal.ads.C5128sR c5128sR) {
        if (c5128sR.r() < 9) {
            return;
        }
        int iW = c5128sR.w();
        int iW2 = c5128sR.w();
        int iC = c5128sR.C();
        if (iW == 434 && iW2 == 1195456820 && iC == 3) {
            com.google.android.gms.internal.ads.AbstractC3543e0.b(j6, c5128sR, this.f38435b);
        }
    }

    public final void b(com.google.android.gms.internal.ads.InterfaceC5520w0 interfaceC5520w0, com.google.android.gms.internal.ads.C4543n6 c4543n6) {
        for (int i6 = 0; i6 < this.f38435b.length; i6++) {
            c4543n6.c();
            com.google.android.gms.internal.ads.InterfaceC3107a1 interfaceC3107a1S = interfaceC5520w0.S(c4543n6.a(), 3);
            com.google.android.gms.internal.ads.D d6 = (com.google.android.gms.internal.ads.D) this.f38434a.get(i6);
            java.lang.String str = d6.f26574o;
            boolean z6 = true;
            if (!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) {
                z6 = false;
            }
            com.google.android.gms.internal.ads.LC.e(z6, "Invalid closed caption MIME type provided: ".concat(java.lang.String.valueOf(str)));
            com.google.android.gms.internal.ads.C4682oK0 c4682oK0 = new com.google.android.gms.internal.ads.C4682oK0();
            c4682oK0.m(c4543n6.b());
            c4682oK0.B(str);
            c4682oK0.D(d6.f26564e);
            c4682oK0.q(d6.f26563d);
            c4682oK0.p0(d6.f26556I);
            c4682oK0.n(d6.f26577r);
            interfaceC3107a1S.c(c4682oK0.H());
            this.f38435b[i6] = interfaceC3107a1S;
        }
    }
}
