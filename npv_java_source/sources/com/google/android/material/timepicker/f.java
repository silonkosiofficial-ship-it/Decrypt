package com.google.android.material.timepicker;

/* JADX INFO: loaded from: classes3.dex */
class f implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.google.android.material.timepicker.f> CREATOR = new com.google.android.material.timepicker.f.a();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final com.google.android.material.timepicker.c f43903C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final com.google.android.material.timepicker.c f43904D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    final int f43905E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    int f43906F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    int f43907G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    int f43908H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    int f43909I;

    class a implements android.os.Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public com.google.android.material.timepicker.f createFromParcel(android.os.Parcel parcel) {
            return new com.google.android.material.timepicker.f(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public com.google.android.material.timepicker.f[] newArray(int i6) {
            return new com.google.android.material.timepicker.f[i6];
        }
    }

    public f(int i6, int i10, int i11, int i12) {
        this.f43906F = i6;
        this.f43907G = i10;
        this.f43908H = i11;
        this.f43905E = i12;
        this.f43909I = c(i6);
        this.f43903C = new com.google.android.material.timepicker.c(59);
        this.f43904D = new com.google.android.material.timepicker.c(i12 == 1 ? 23 : 12);
    }

    protected f(android.os.Parcel parcel) {
        this(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
    }

    public static java.lang.String a(android.content.res.Resources resources, java.lang.CharSequence charSequence) {
        return b(resources, charSequence, "%02d");
    }

    public static java.lang.String b(android.content.res.Resources resources, java.lang.CharSequence charSequence, java.lang.String str) {
        try {
            return java.lang.String.format(resources.getConfiguration().locale, str, java.lang.Integer.valueOf(java.lang.Integer.parseInt(java.lang.String.valueOf(charSequence))));
        } catch (java.lang.NumberFormatException unused) {
            return null;
        }
    }

    private static int c(int i6) {
        return i6 >= 12 ? 1 : 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.material.timepicker.f)) {
            return false;
        }
        com.google.android.material.timepicker.f fVar = (com.google.android.material.timepicker.f) obj;
        return this.f43906F == fVar.f43906F && this.f43907G == fVar.f43907G && this.f43905E == fVar.f43905E && this.f43908H == fVar.f43908H;
    }

    public int hashCode() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{java.lang.Integer.valueOf(this.f43905E), java.lang.Integer.valueOf(this.f43906F), java.lang.Integer.valueOf(this.f43907G), java.lang.Integer.valueOf(this.f43908H)});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i6) {
        parcel.writeInt(this.f43906F);
        parcel.writeInt(this.f43907G);
        parcel.writeInt(this.f43908H);
        parcel.writeInt(this.f43905E);
    }
}
