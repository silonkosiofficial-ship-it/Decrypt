package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.ie0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C4049ie0 extends com.google.android.gms.internal.ads.AbstractC4927qe0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.String f36324b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f36325c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f36326d;

    /* synthetic */ C4049ie0(java.lang.String str, boolean z6, int i6, com.google.android.gms.internal.ads.InterfaceC3609ee0 interfaceC3609ee0, com.google.android.gms.internal.ads.InterfaceC3719fe0 interfaceC3719fe0, int i10, com.google.android.gms.internal.ads.AbstractC3939he0 abstractC3939he0) {
        this.f36324b = str;
        this.f36325c = i6;
        this.f36326d = i10;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4927qe0
    public final com.google.android.gms.internal.ads.InterfaceC3609ee0 a() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4927qe0
    public final com.google.android.gms.internal.ads.InterfaceC3719fe0 b() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4927qe0
    public final java.lang.String c() {
        return this.f36324b;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4927qe0
    public final boolean d() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4927qe0
    public final int e() {
        return this.f36325c;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof com.google.android.gms.internal.ads.AbstractC4927qe0) {
            com.google.android.gms.internal.ads.AbstractC4927qe0 abstractC4927qe0 = (com.google.android.gms.internal.ads.AbstractC4927qe0) obj;
            if (this.f36324b.equals(abstractC4927qe0.c())) {
                abstractC4927qe0.d();
                int i6 = this.f36325c;
                int iE = abstractC4927qe0.e();
                if (i6 == 0) {
                    throw null;
                }
                if (i6 == iE) {
                    abstractC4927qe0.a();
                    abstractC4927qe0.b();
                    int i10 = this.f36326d;
                    int iF = abstractC4927qe0.f();
                    if (i10 == 0) {
                        throw null;
                    }
                    if (iF == 1) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4927qe0
    public final int f() {
        return this.f36326d;
    }

    public final int hashCode() {
        int iHashCode = this.f36324b.hashCode() ^ 1000003;
        int i6 = this.f36325c;
        if (i6 == 0) {
            throw null;
        }
        int i10 = (((iHashCode * 1000003) ^ 1237) * 1000003) ^ i6;
        if (this.f36326d != 0) {
            return (i10 * 583896283) ^ 1;
        }
        throw null;
    }

    public final java.lang.String toString() {
        java.lang.String str;
        int i6 = this.f36325c;
        if (i6 == 1) {
            str = "ALL_CHECKS";
        } else if (i6 == 2) {
            str = "SKIP_COMPLIANCE_CHECK";
        } else if (i6 != 3) {
            str = i6 != 4 ? "null" : "NO_CHECKS";
        } else {
            str = "SKIP_SECURITY_CHECK";
        }
        java.lang.String str2 = this.f36326d == 1 ? "READ_AND_WRITE" : "null";
        return "FileComplianceOptions{fileOwner=" + this.f36324b + ", hasDifferentDmaOwner=false, fileChecks=" + str + ", dataForwardingNotAllowedResolver=null, multipleProductIdGroupsResolver=null, filePurpose=" + str2 + "}";
    }
}
