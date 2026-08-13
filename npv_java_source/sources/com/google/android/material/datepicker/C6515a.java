package com.google.android.material.datepicker;

/* JADX INFO: renamed from: com.google.android.material.datepicker.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6515a implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.google.android.material.datepicker.C6515a> CREATOR = new com.google.android.material.datepicker.C6515a.C0474a();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final com.google.android.material.datepicker.n f43187C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final com.google.android.material.datepicker.n f43188D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final com.google.android.material.datepicker.C6515a.c f43189E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private com.google.android.material.datepicker.n f43190F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final int f43191G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final int f43192H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final int f43193I;

    /* JADX INFO: renamed from: com.google.android.material.datepicker.a$a, reason: collision with other inner class name */
    class C0474a implements android.os.Parcelable.Creator {
        C0474a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public com.google.android.material.datepicker.C6515a createFromParcel(android.os.Parcel parcel) {
            return new com.google.android.material.datepicker.C6515a((com.google.android.material.datepicker.n) parcel.readParcelable(com.google.android.material.datepicker.n.class.getClassLoader()), (com.google.android.material.datepicker.n) parcel.readParcelable(com.google.android.material.datepicker.n.class.getClassLoader()), (com.google.android.material.datepicker.C6515a.c) parcel.readParcelable(com.google.android.material.datepicker.C6515a.c.class.getClassLoader()), (com.google.android.material.datepicker.n) parcel.readParcelable(com.google.android.material.datepicker.n.class.getClassLoader()), parcel.readInt(), null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public com.google.android.material.datepicker.C6515a[] newArray(int i6) {
            return new com.google.android.material.datepicker.C6515a[i6];
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.datepicker.a$b */
    public static final class b {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        static final long f43194f = com.google.android.material.datepicker.z.a(com.google.android.material.datepicker.n.i(1900, 0).f43302H);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        static final long f43195g = com.google.android.material.datepicker.z.a(com.google.android.material.datepicker.n.i(2100, 11).f43302H);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f43196a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f43197b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private java.lang.Long f43198c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f43199d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private com.google.android.material.datepicker.C6515a.c f43200e;

        b(com.google.android.material.datepicker.C6515a c6515a) {
            this.f43196a = f43194f;
            this.f43197b = f43195g;
            this.f43200e = com.google.android.material.datepicker.g.a(Long.MIN_VALUE);
            this.f43196a = c6515a.f43187C.f43302H;
            this.f43197b = c6515a.f43188D.f43302H;
            this.f43198c = java.lang.Long.valueOf(c6515a.f43190F.f43302H);
            this.f43199d = c6515a.f43191G;
            this.f43200e = c6515a.f43189E;
        }

        public com.google.android.material.datepicker.C6515a a() {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("DEEP_COPY_VALIDATOR_KEY", this.f43200e);
            com.google.android.material.datepicker.n nVarM = com.google.android.material.datepicker.n.m(this.f43196a);
            com.google.android.material.datepicker.n nVarM2 = com.google.android.material.datepicker.n.m(this.f43197b);
            com.google.android.material.datepicker.C6515a.c cVar = (com.google.android.material.datepicker.C6515a.c) bundle.getParcelable("DEEP_COPY_VALIDATOR_KEY");
            java.lang.Long l6 = this.f43198c;
            return new com.google.android.material.datepicker.C6515a(nVarM, nVarM2, cVar, l6 == null ? null : com.google.android.material.datepicker.n.m(l6.longValue()), this.f43199d, null);
        }

        public com.google.android.material.datepicker.C6515a.b b(long j6) {
            this.f43198c = java.lang.Long.valueOf(j6);
            return this;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.datepicker.a$c */
    public interface c extends android.os.Parcelable {
        boolean n(long j6);
    }

    private C6515a(com.google.android.material.datepicker.n nVar, com.google.android.material.datepicker.n nVar2, com.google.android.material.datepicker.C6515a.c cVar, com.google.android.material.datepicker.n nVar3, int i6) {
        j$.util.Objects.requireNonNull(nVar, "start cannot be null");
        j$.util.Objects.requireNonNull(nVar2, "end cannot be null");
        j$.util.Objects.requireNonNull(cVar, "validator cannot be null");
        this.f43187C = nVar;
        this.f43188D = nVar2;
        this.f43190F = nVar3;
        this.f43191G = i6;
        this.f43189E = cVar;
        if (nVar3 != null && nVar.compareTo(nVar3) > 0) {
            throw new java.lang.IllegalArgumentException("start Month cannot be after current Month");
        }
        if (nVar3 != null && nVar3.compareTo(nVar2) > 0) {
            throw new java.lang.IllegalArgumentException("current Month cannot be after end Month");
        }
        if (i6 < 0 || i6 > com.google.android.material.datepicker.z.k().getMaximum(7)) {
            throw new java.lang.IllegalArgumentException("firstDayOfWeek is not valid");
        }
        this.f43193I = nVar.x(nVar2) + 1;
        this.f43192H = (nVar2.f43299E - nVar.f43299E) + 1;
    }

    /* synthetic */ C6515a(com.google.android.material.datepicker.n nVar, com.google.android.material.datepicker.n nVar2, com.google.android.material.datepicker.C6515a.c cVar, com.google.android.material.datepicker.n nVar3, int i6, com.google.android.material.datepicker.C6515a.C0474a c0474a) {
        this(nVar, nVar2, cVar, nVar3, i6);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.material.datepicker.C6515a)) {
            return false;
        }
        com.google.android.material.datepicker.C6515a c6515a = (com.google.android.material.datepicker.C6515a) obj;
        return this.f43187C.equals(c6515a.f43187C) && this.f43188D.equals(c6515a.f43188D) && B1.c.a(this.f43190F, c6515a.f43190F) && this.f43191G == c6515a.f43191G && this.f43189E.equals(c6515a.f43189E);
    }

    public com.google.android.material.datepicker.C6515a.c f() {
        return this.f43189E;
    }

    com.google.android.material.datepicker.n h() {
        return this.f43188D;
    }

    public int hashCode() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{this.f43187C, this.f43188D, this.f43190F, java.lang.Integer.valueOf(this.f43191G), this.f43189E});
    }

    int i() {
        return this.f43191G;
    }

    int j() {
        return this.f43193I;
    }

    com.google.android.material.datepicker.n k() {
        return this.f43190F;
    }

    com.google.android.material.datepicker.n l() {
        return this.f43187C;
    }

    int m() {
        return this.f43192H;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i6) {
        parcel.writeParcelable(this.f43187C, 0);
        parcel.writeParcelable(this.f43188D, 0);
        parcel.writeParcelable(this.f43190F, 0);
        parcel.writeParcelable(this.f43189E, 0);
        parcel.writeInt(this.f43191G);
    }
}
