package com.google.android.gms.common.api;

/* JADX INFO: loaded from: classes.dex */
public final class Status extends R3.a implements O3.k, com.google.android.gms.common.internal.ReflectedParcelable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final int f24852C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final java.lang.String f24853D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final android.app.PendingIntent f24854E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final N3.C1389b f24855F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final com.google.android.gms.common.api.Status f24844G = new com.google.android.gms.common.api.Status(-1);

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final com.google.android.gms.common.api.Status f24845H = new com.google.android.gms.common.api.Status(0);

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static final com.google.android.gms.common.api.Status f24846I = new com.google.android.gms.common.api.Status(14);

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public static final com.google.android.gms.common.api.Status f24847J = new com.google.android.gms.common.api.Status(8);

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public static final com.google.android.gms.common.api.Status f24848K = new com.google.android.gms.common.api.Status(15);

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public static final com.google.android.gms.common.api.Status f24849L = new com.google.android.gms.common.api.Status(16);

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public static final com.google.android.gms.common.api.Status f24851N = new com.google.android.gms.common.api.Status(17);

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public static final com.google.android.gms.common.api.Status f24850M = new com.google.android.gms.common.api.Status(18);
    public static final android.os.Parcelable.Creator<com.google.android.gms.common.api.Status> CREATOR = new com.google.android.gms.common.api.b();

    public Status(int i6) {
        this(i6, (java.lang.String) null);
    }

    public Status(int i6, java.lang.String str) {
        this(i6, str, (android.app.PendingIntent) null);
    }

    public Status(int i6, java.lang.String str, android.app.PendingIntent pendingIntent) {
        this(i6, str, pendingIntent, null);
    }

    Status(int i6, java.lang.String str, android.app.PendingIntent pendingIntent, N3.C1389b c1389b) {
        this.f24852C = i6;
        this.f24853D = str;
        this.f24854E = pendingIntent;
        this.f24855F = c1389b;
    }

    public Status(N3.C1389b c1389b, java.lang.String str) {
        this(c1389b, str, 17);
    }

    public Status(N3.C1389b c1389b, java.lang.String str, int i6) {
        this(i6, str, c1389b.s(), c1389b);
    }

    public boolean C() {
        return this.f24852C <= 0;
    }

    public final java.lang.String D() {
        java.lang.String str = this.f24853D;
        return str != null ? str : O3.c.a(this.f24852C);
    }

    @Override // O3.k
    public com.google.android.gms.common.api.Status d() {
        return this;
    }

    public N3.C1389b e() {
        return this.f24855F;
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.common.api.Status)) {
            return false;
        }
        com.google.android.gms.common.api.Status status = (com.google.android.gms.common.api.Status) obj;
        return this.f24852C == status.f24852C && Q3.AbstractC1475n.a(this.f24853D, status.f24853D) && Q3.AbstractC1475n.a(this.f24854E, status.f24854E) && Q3.AbstractC1475n.a(this.f24855F, status.f24855F);
    }

    public int f() {
        return this.f24852C;
    }

    public int hashCode() {
        return Q3.AbstractC1475n.b(java.lang.Integer.valueOf(this.f24852C), this.f24853D, this.f24854E, this.f24855F);
    }

    public java.lang.String s() {
        return this.f24853D;
    }

    public java.lang.String toString() {
        Q3.AbstractC1475n.a aVarC = Q3.AbstractC1475n.c(this);
        aVarC.a("statusCode", D());
        aVarC.a("resolution", this.f24854E);
        return aVarC.toString();
    }

    public boolean w() {
        return this.f24854E != null;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i6) {
        int iA = R3.c.a(parcel);
        R3.c.k(parcel, 1, f());
        R3.c.q(parcel, 2, s(), false);
        R3.c.p(parcel, 3, this.f24854E, i6, false);
        R3.c.p(parcel, 4, e(), i6, false);
        R3.c.b(parcel, iA);
    }
}
