package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.k5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4211k5 implements com.google.android.gms.internal.ads.InterfaceC5088s4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C5128sR f36888a = new com.google.android.gms.internal.ads.C5128sR();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C3115a5 f36889b = new com.google.android.gms.internal.ads.C3115a5();

    @Override // com.google.android.gms.internal.ads.InterfaceC5088s4
    public final void a(byte[] bArr, int i6, int i10, com.google.android.gms.internal.ads.C4978r4 c4978r4, com.google.android.gms.internal.ads.InterfaceC5000rF interfaceC5000rF) {
        this.f36888a.j(bArr, i10 + i6);
        this.f36888a.l(i6);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            com.google.android.gms.internal.ads.C5128sR c5128sR = this.f36888a;
            int iT = c5128sR.t();
            java.nio.charset.Charset charset = java.nio.charset.StandardCharsets.UTF_8;
            java.lang.String strP = c5128sR.P(charset);
            if (strP == null || !strP.startsWith("WEBVTT")) {
                c5128sR.l(iT);
                throw com.google.android.gms.internal.ads.C4708of.a("Expected WEBVTT. Got ".concat(java.lang.String.valueOf(c5128sR.P(charset))), null);
            }
            while (!android.text.TextUtils.isEmpty(this.f36888a.P(java.nio.charset.StandardCharsets.UTF_8))) {
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            while (true) {
                com.google.android.gms.internal.ads.C5128sR c5128sR2 = this.f36888a;
                byte b6 = -1;
                int iT2 = 0;
                while (b6 == -1) {
                    iT2 = c5128sR2.t();
                    java.lang.String strP2 = c5128sR2.P(java.nio.charset.StandardCharsets.UTF_8);
                    if (strP2 == null) {
                        b6 = 0;
                    } else if ("STYLE".equals(strP2)) {
                        b6 = 2;
                    } else {
                        b6 = strP2.startsWith("NOTE") ? (byte) 1 : (byte) 3;
                    }
                }
                c5128sR2.l(iT2);
                if (b6 == 0) {
                    com.google.android.gms.internal.ads.AbstractC4319l4.a(new com.google.android.gms.internal.ads.C4541n5(arrayList2), c4978r4, interfaceC5000rF);
                    return;
                }
                if (b6 == 1) {
                    while (!android.text.TextUtils.isEmpty(this.f36888a.P(java.nio.charset.StandardCharsets.UTF_8))) {
                    }
                } else if (b6 != 2) {
                    com.google.android.gms.internal.ads.C3334c5 c3334c5C = com.google.android.gms.internal.ads.AbstractC4101j5.c(this.f36888a, arrayList);
                    if (c3334c5C != null) {
                        arrayList2.add(c3334c5C);
                    }
                } else {
                    if (!arrayList2.isEmpty()) {
                        throw new java.lang.IllegalArgumentException("A style block was found after the first cue.");
                    }
                    this.f36888a.P(java.nio.charset.StandardCharsets.UTF_8);
                    arrayList.addAll(this.f36889b.b(this.f36888a));
                }
            }
        } catch (com.google.android.gms.internal.ads.C4708of e6) {
            throw new java.lang.IllegalArgumentException(e6);
        }
    }
}
