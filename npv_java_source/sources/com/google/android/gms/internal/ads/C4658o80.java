package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.o80, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4658o80 implements com.google.android.gms.internal.ads.InterfaceC4438m80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f37728a;

    public C4658o80(java.lang.String str) {
        this.f37728a = str;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof com.google.android.gms.internal.ads.C4658o80) {
            return this.f37728a.equals(((com.google.android.gms.internal.ads.C4658o80) obj).f37728a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f37728a.hashCode();
    }

    public final java.lang.String toString() {
        return this.f37728a;
    }
}
