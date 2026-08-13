package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class D90 {
    public static com.google.android.gms.internal.ads.E90 a(android.content.Context context, int i6) {
        com.google.android.gms.internal.ads.C4380lg c4380lg;
        if (com.google.android.gms.internal.ads.T90.a()) {
            int i10 = i6 - 2;
            if (i10 != 20 && i10 != 21) {
                switch (i10) {
                    case 2:
                    case 3:
                    case 6:
                    case 7:
                    case 8:
                        c4380lg = com.google.android.gms.internal.ads.AbstractC5479vg.f39432c;
                        break;
                    case 4:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                        c4380lg = com.google.android.gms.internal.ads.AbstractC5479vg.f39433d;
                        break;
                    case 5:
                        c4380lg = com.google.android.gms.internal.ads.AbstractC5479vg.f39431b;
                        break;
                }
            } else {
                c4380lg = com.google.android.gms.internal.ads.AbstractC5479vg.f39434e;
            }
            if (((java.lang.Boolean) c4380lg.e()).booleanValue()) {
                return new com.google.android.gms.internal.ads.G90(context, i6);
            }
        }
        return new com.google.android.gms.internal.ads.C4589na0();
    }

    public static com.google.android.gms.internal.ads.E90 b(android.content.Context context, int i6, int i10, p184s3.X1 x6) {
        com.google.android.gms.internal.ads.E90 e90A = a(context, i6);
        if (e90A instanceof com.google.android.gms.internal.ads.G90) {
            e90A.h();
            e90A.A(i10);
            e90A.b(B3.AbstractC0797c.a(x6.f54164O));
            if (com.google.android.gms.internal.ads.P90.e(x6.f54167R)) {
                e90A.o(x6.f54167R);
            }
        }
        return e90A;
    }
}
