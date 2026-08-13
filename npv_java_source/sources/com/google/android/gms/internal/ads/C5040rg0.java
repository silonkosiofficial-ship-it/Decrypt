package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.rg0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C5040rg0 extends com.google.android.gms.internal.ads.AbstractC4601ng0 implements java.io.Serializable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final java.util.regex.Pattern f38531C;

    C5040rg0(java.util.regex.Pattern pattern) {
        pattern.getClass();
        this.f38531C = pattern;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4601ng0
    public final com.google.android.gms.internal.ads.AbstractC4381lg0 a(java.lang.CharSequence charSequence) {
        return new com.google.android.gms.internal.ads.C4931qg0(this.f38531C.matcher(charSequence));
    }

    public final java.lang.String toString() {
        return this.f38531C.toString();
    }
}
