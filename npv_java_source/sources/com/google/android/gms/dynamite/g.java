package com.google.android.gms.dynamite;

/* JADX INFO: loaded from: classes.dex */
final class g implements com.google.android.gms.dynamite.DynamiteModule.b {
    g() {
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b A[DONT_INVERT, PHI: r4
  0x001b: PHI (r4v2 int) = (r4v1 int), (r4v3 int) binds: [B:3:0x0014, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    @Override // com.google.android.gms.dynamite.DynamiteModule.b
    public final com.google.android.gms.dynamite.DynamiteModule.b.C0471b a(android.content.Context context, java.lang.String str, com.google.android.gms.dynamite.DynamiteModule.b.a aVar) {
        com.google.android.gms.dynamite.DynamiteModule.b.C0471b c0471b = new com.google.android.gms.dynamite.DynamiteModule.b.C0471b();
        c0471b.f24985a = aVar.b(context, str);
        int i6 = 1;
        int iA = aVar.a(context, str, true);
        c0471b.f24986b = iA;
        int i10 = c0471b.f24985a;
        if (i10 == 0) {
            i10 = 0;
            if (iA == 0) {
                i6 = 0;
            } else if (i10 >= iA) {
                i6 = -1;
            }
        } else if (i10 >= iA) {
            i6 = -1;
        }
        c0471b.f24987c = i6;
        return c0471b;
    }
}
