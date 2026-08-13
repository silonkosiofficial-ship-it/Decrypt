package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Qg0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2755Qg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC2718Pg0 f31031a;

    private C2755Qg0(com.google.android.gms.internal.ads.InterfaceC2718Pg0 interfaceC2718Pg0) {
        com.google.android.gms.internal.ads.AbstractC4271kg0 abstractC4271kg0 = com.google.android.gms.internal.ads.C4161jg0.f36716D;
        this.f31031a = interfaceC2718Pg0;
    }

    public static com.google.android.gms.internal.ads.C2755Qg0 a(int i6) {
        return new com.google.android.gms.internal.ads.C2755Qg0(new com.google.android.gms.internal.ads.C2571Lg0(4000));
    }

    public static com.google.android.gms.internal.ads.C2755Qg0 b(com.google.android.gms.internal.ads.AbstractC4271kg0 abstractC4271kg0) {
        return new com.google.android.gms.internal.ads.C2755Qg0(new com.google.android.gms.internal.ads.C2423Hg0(abstractC4271kg0));
    }

    public static com.google.android.gms.internal.ads.C2755Qg0 c(java.util.regex.Pattern pattern) {
        com.google.android.gms.internal.ads.C5040rg0 c5040rg0 = new com.google.android.gms.internal.ads.C5040rg0(pattern);
        com.google.android.gms.internal.ads.AbstractC2164Ag0.i(!((com.google.android.gms.internal.ads.C4931qg0) c5040rg0.a("")).f38299a.matches(), "The pattern may not match the empty string: %s", c5040rg0);
        return new com.google.android.gms.internal.ads.C2755Qg0(new com.google.android.gms.internal.ads.C2497Jg0(c5040rg0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.util.Iterator g(java.lang.CharSequence charSequence) {
        return this.f31031a.a(this, charSequence);
    }

    public final java.lang.Iterable d(java.lang.CharSequence charSequence) {
        charSequence.getClass();
        return new com.google.android.gms.internal.ads.C2607Mg0(this, charSequence);
    }

    public final java.util.List f(java.lang.CharSequence charSequence) {
        charSequence.getClass();
        java.util.Iterator itG = g(charSequence);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (itG.hasNext()) {
            arrayList.add((java.lang.String) itG.next());
        }
        return j$.util.DesugarCollections.unmodifiableList(arrayList);
    }
}
