package com.google.android.gms.dynamite;

/* JADX INFO: loaded from: classes.dex */
final class j implements com.google.android.gms.dynamite.DynamiteModule.b {
    j() {
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.b
    public final com.google.android.gms.dynamite.DynamiteModule.b.C0471b a(android.content.Context context, java.lang.String str, com.google.android.gms.dynamite.DynamiteModule.b.a aVar) {
        com.google.android.gms.dynamite.DynamiteModule.b.C0471b c0471b = new com.google.android.gms.dynamite.DynamiteModule.b.C0471b();
        int iB = aVar.b(context, str);
        c0471b.f24985a = iB;
        int i6 = 1;
        int i10 = 0;
        int iA = iB != 0 ? aVar.a(context, str, false) : aVar.a(context, str, true);
        c0471b.f24986b = iA;
        int i11 = c0471b.f24985a;
        if (i11 == 0) {
            if (iA == 0) {
                i6 = 0;
            }
            c0471b.f24987c = i6;
            return c0471b;
        }
        i10 = i11;
        if (iA < i10) {
            i6 = -1;
        }
        c0471b.f24987c = i6;
        return c0471b;
    }
}
