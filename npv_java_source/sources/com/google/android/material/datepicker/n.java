package com.google.android.material.datepicker;

/* JADX INFO: loaded from: classes3.dex */
final class n implements java.lang.Comparable, android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.google.android.material.datepicker.n> CREATOR = new com.google.android.material.datepicker.n.a();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final java.util.Calendar f43297C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    final int f43298D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    final int f43299E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    final int f43300F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    final int f43301G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    final long f43302H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private java.lang.String f43303I;

    class a implements android.os.Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public com.google.android.material.datepicker.n createFromParcel(android.os.Parcel parcel) {
            return com.google.android.material.datepicker.n.i(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public com.google.android.material.datepicker.n[] newArray(int i6) {
            return new com.google.android.material.datepicker.n[i6];
        }
    }

    private n(java.util.Calendar calendar) {
        calendar.set(5, 1);
        java.util.Calendar calendarC = com.google.android.material.datepicker.z.c(calendar);
        this.f43297C = calendarC;
        this.f43298D = calendarC.get(2);
        this.f43299E = calendarC.get(1);
        this.f43300F = calendarC.getMaximum(7);
        this.f43301G = calendarC.getActualMaximum(5);
        this.f43302H = calendarC.getTimeInMillis();
    }

    static com.google.android.material.datepicker.n i(int i6, int i10) {
        java.util.Calendar calendarK = com.google.android.material.datepicker.z.k();
        calendarK.set(1, i6);
        calendarK.set(2, i10);
        return new com.google.android.material.datepicker.n(calendarK);
    }

    static com.google.android.material.datepicker.n m(long j6) {
        java.util.Calendar calendarK = com.google.android.material.datepicker.z.k();
        calendarK.setTimeInMillis(j6);
        return new com.google.android.material.datepicker.n(calendarK);
    }

    static com.google.android.material.datepicker.n q() {
        return new com.google.android.material.datepicker.n(com.google.android.material.datepicker.z.i());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public int compareTo(com.google.android.material.datepicker.n nVar) {
        return this.f43297C.compareTo(nVar.f43297C);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.material.datepicker.n)) {
            return false;
        }
        com.google.android.material.datepicker.n nVar = (com.google.android.material.datepicker.n) obj;
        return this.f43298D == nVar.f43298D && this.f43299E == nVar.f43299E;
    }

    public int hashCode() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{java.lang.Integer.valueOf(this.f43298D), java.lang.Integer.valueOf(this.f43299E)});
    }

    int r(int i6) {
        int i10 = this.f43297C.get(7);
        if (i6 <= 0) {
            i6 = this.f43297C.getFirstDayOfWeek();
        }
        int i11 = i10 - i6;
        return i11 < 0 ? i11 + this.f43300F : i11;
    }

    long s(int i6) {
        java.util.Calendar calendarC = com.google.android.material.datepicker.z.c(this.f43297C);
        calendarC.set(5, i6);
        return calendarC.getTimeInMillis();
    }

    int t(long j6) {
        java.util.Calendar calendarC = com.google.android.material.datepicker.z.c(this.f43297C);
        calendarC.setTimeInMillis(j6);
        return calendarC.get(5);
    }

    java.lang.String u() {
        if (this.f43303I == null) {
            this.f43303I = com.google.android.material.datepicker.f.f(this.f43297C.getTimeInMillis());
        }
        return this.f43303I;
    }

    long v() {
        return this.f43297C.getTimeInMillis();
    }

    com.google.android.material.datepicker.n w(int i6) {
        java.util.Calendar calendarC = com.google.android.material.datepicker.z.c(this.f43297C);
        calendarC.add(2, i6);
        return new com.google.android.material.datepicker.n(calendarC);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i6) {
        parcel.writeInt(this.f43299E);
        parcel.writeInt(this.f43298D);
    }

    int x(com.google.android.material.datepicker.n nVar) {
        if (this.f43297C instanceof java.util.GregorianCalendar) {
            return ((nVar.f43299E - this.f43299E) * 12) + (nVar.f43298D - this.f43298D);
        }
        throw new java.lang.IllegalArgumentException("Only Gregorian calendars are supported.");
    }
}
