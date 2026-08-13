package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.t70, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5205t70 {
    public static p184s3.c2 a(android.content.Context context, java.util.List list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            com.google.android.gms.internal.ads.S60 s60 = (com.google.android.gms.internal.ads.S60) it.next();
            if (s60.f31556c) {
                arrayList.add(p104k3.h.f49474p);
            } else {
                arrayList.add(new p104k3.h(s60.f31554a, s60.f31555b));
            }
        }
        return new p184s3.c2(context, (p104k3.h[]) arrayList.toArray(new p104k3.h[arrayList.size()]));
    }

    public static com.google.android.gms.internal.ads.S60 b(p184s3.c2 c2Var) {
        return c2Var.f54206K ? new com.google.android.gms.internal.ads.S60(-3, 0, true) : new com.google.android.gms.internal.ads.S60(c2Var.f54202G, c2Var.f54199D, false);
    }
}
