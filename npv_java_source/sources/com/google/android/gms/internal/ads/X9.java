package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class X9 extends com.google.android.gms.internal.ads.W9 {
    private X9(android.content.Context context, com.google.android.gms.internal.ads.V9 v10) {
        super(context, v10);
    }

    public static com.google.android.gms.internal.ads.X9 y(android.content.Context context, com.google.android.gms.internal.ads.V9 v10) {
        com.google.android.gms.internal.ads.W9.u(context, v10);
        return new com.google.android.gms.internal.ads.X9(context, v10);
    }

    @Override // com.google.android.gms.internal.ads.W9
    protected final java.util.List s(com.google.android.gms.internal.ads.C2262Da c2262Da, android.content.Context context, com.google.android.gms.internal.ads.C5316u8 c5316u8, com.google.android.gms.internal.ads.C3779g8 c3779g8) {
        if (c2262Da.k() == null || !this.f32701X.f32415a) {
            return super.s(c2262Da, context, c5316u8, null);
        }
        int iA = c2262Da.a();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.addAll(super.s(c2262Da, context, c5316u8, null));
        arrayList.add(new com.google.android.gms.internal.ads.C2960Wa(c2262Da, "mYdY7l5D+eRA2n+1DSS0l4Onm7QwkKst2ndSMEehloNd2MnZiOwv+qpmI2KWHSFP", "85J7Wr+LLVwpDfypFtzN1eoOiAfuTMa63SuSJgN9bwE=", c5316u8, iA, 24));
        return arrayList;
    }
}
