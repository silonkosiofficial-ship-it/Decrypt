package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Pb0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2708Pb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f30752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.String f30753b;

    private C2708Pb0(java.lang.String str, java.lang.String str2) {
        this.f30752a = str;
        this.f30753b = str2;
    }

    public static com.google.android.gms.internal.ads.C2708Pb0 a(java.lang.String str, java.lang.String str2) {
        com.google.android.gms.internal.ads.AbstractC5692xc0.b(str, "Name is null or empty");
        com.google.android.gms.internal.ads.AbstractC5692xc0.b(str2, "Version is null or empty");
        return new com.google.android.gms.internal.ads.C2708Pb0(str, str2);
    }

    public final java.lang.String b() {
        return this.f30752a;
    }

    public final java.lang.String c() {
        return this.f30753b;
    }
}
