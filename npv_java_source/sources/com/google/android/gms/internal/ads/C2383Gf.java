package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Gf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2383Gf {
    public static final void a(com.google.android.gms.internal.ads.C2346Ff c2346Ff, com.google.android.gms.internal.ads.C2272Df c2272Df) {
        if (c2272Df.a() == null) {
            throw new java.lang.IllegalArgumentException("Context can't be null. Please set up context in CsiConfiguration.");
        }
        if (android.text.TextUtils.isEmpty(c2272Df.b())) {
            throw new java.lang.IllegalArgumentException("AfmaVersion can't be null or empty. Please set up afmaVersion in CsiConfiguration.");
        }
        c2346Ff.d(c2272Df.a(), c2272Df.b(), c2272Df.c(), c2272Df.d());
    }
}
