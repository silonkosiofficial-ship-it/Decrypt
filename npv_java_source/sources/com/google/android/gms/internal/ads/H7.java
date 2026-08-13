package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public abstract class H7 extends com.google.android.gms.internal.ads.AbstractC3448d7 {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final java.lang.Object f27980O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC3777g7 f27981P;

    public H7(int i6, java.lang.String str, com.google.android.gms.internal.ads.InterfaceC3777g7 interfaceC3777g7, com.google.android.gms.internal.ads.InterfaceC3667f7 interfaceC3667f7) {
        super(i6, str, interfaceC3667f7);
        this.f27980O = new java.lang.Object();
        this.f27981P = interfaceC3777g7;
    }

    protected void I(java.lang.String str) {
        com.google.android.gms.internal.ads.InterfaceC3777g7 interfaceC3777g7;
        synchronized (this.f27980O) {
            interfaceC3777g7 = this.f27981P;
        }
        interfaceC3777g7.b(str);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3448d7
    protected final com.google.android.gms.internal.ads.C3887h7 q(com.google.android.gms.internal.ads.Z6 z6) {
        java.lang.String str;
        java.lang.String str2;
        try {
            byte[] bArr = z6.f33501b;
            java.util.Map map = z6.f33502c;
            java.lang.String str3 = "ISO-8859-1";
            if (map != null && (str2 = (java.lang.String) map.get("Content-Type")) != null) {
                java.lang.String[] strArrSplit = str2.split(";", 0);
                for (int i6 = 1; i6 < strArrSplit.length; i6++) {
                    java.lang.String[] strArrSplit2 = strArrSplit[i6].trim().split("=", 0);
                    if (strArrSplit2.length == 2 && strArrSplit2[0].equals("charset")) {
                        str3 = strArrSplit2[1];
                        break;
                    }
                }
            }
            str = new java.lang.String(bArr, str3);
        } catch (java.io.UnsupportedEncodingException unused) {
            str = new java.lang.String(z6.f33501b);
        }
        return com.google.android.gms.internal.ads.C3887h7.b(str, com.google.android.gms.internal.ads.AbstractC5864z7.b(z6));
    }
}
