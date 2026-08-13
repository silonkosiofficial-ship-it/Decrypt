package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Fz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC2372Fz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final java.lang.String f27595a = java.lang.Integer.toString(0, 36);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final java.lang.String f27596b = java.lang.Integer.toString(1, 36);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final java.lang.String f27597c = java.lang.Integer.toString(2, 36);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final java.lang.String f27598d = java.lang.Integer.toString(3, 36);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final java.lang.String f27599e = java.lang.Integer.toString(4, 36);

    public static java.util.ArrayList a(android.text.Spanned spanned) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.google.android.gms.internal.ads.HA ha2 : (com.google.android.gms.internal.ads.HA[]) spanned.getSpans(0, spanned.length(), com.google.android.gms.internal.ads.HA.class)) {
            arrayList.add(b(spanned, ha2, 1, ha2.a()));
        }
        for (com.google.android.gms.internal.ads.JB jb : (com.google.android.gms.internal.ads.JB[]) spanned.getSpans(0, spanned.length(), com.google.android.gms.internal.ads.JB.class)) {
            arrayList.add(b(spanned, jb, 2, jb.a()));
        }
        for (com.google.android.gms.internal.ads.C3783gA c3783gA : (com.google.android.gms.internal.ads.C3783gA[]) spanned.getSpans(0, spanned.length(), com.google.android.gms.internal.ads.C3783gA.class)) {
            arrayList.add(b(spanned, c3783gA, 3, null));
        }
        for (com.google.android.gms.internal.ads.C4225kC c4225kC : (com.google.android.gms.internal.ads.C4225kC[]) spanned.getSpans(0, spanned.length(), com.google.android.gms.internal.ads.C4225kC.class)) {
            arrayList.add(b(spanned, c4225kC, 4, c4225kC.a()));
        }
        return arrayList;
    }

    private static android.os.Bundle b(android.text.Spanned spanned, java.lang.Object obj, int i6, android.os.Bundle bundle) {
        android.os.Bundle bundle2 = new android.os.Bundle();
        bundle2.putInt(f27595a, spanned.getSpanStart(obj));
        bundle2.putInt(f27596b, spanned.getSpanEnd(obj));
        bundle2.putInt(f27597c, spanned.getSpanFlags(obj));
        bundle2.putInt(f27598d, i6);
        if (bundle != null) {
            bundle2.putBundle(f27599e, bundle);
        }
        return bundle2;
    }
}
