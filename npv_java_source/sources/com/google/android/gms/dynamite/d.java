package com.google.android.gms.dynamite;

/* JADX INFO: loaded from: classes.dex */
final class d implements com.google.android.gms.dynamite.DynamiteModule.b {
    d() {
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.b
    public final com.google.android.gms.dynamite.DynamiteModule.b.C0471b a(android.content.Context context, java.lang.String str, com.google.android.gms.dynamite.DynamiteModule.b.a aVar) {
        com.google.android.gms.dynamite.DynamiteModule.b.C0471b c0471b = new com.google.android.gms.dynamite.DynamiteModule.b.C0471b();
        int iA = aVar.a(context, str, true);
        c0471b.f24986b = iA;
        if (iA != 0) {
            c0471b.f24987c = 1;
        } else {
            int iB = aVar.b(context, str);
            c0471b.f24985a = iB;
            if (iB != 0) {
                c0471b.f24987c = -1;
            }
        }
        return c0471b;
    }
}
