package com.google.android.material.datepicker;

/* JADX INFO: loaded from: classes3.dex */
public class g implements com.google.android.material.datepicker.C6515a.c {
    public static final android.os.Parcelable.Creator<com.google.android.material.datepicker.g> CREATOR = new com.google.android.material.datepicker.g.a();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final long f43215C;

    class a implements android.os.Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public com.google.android.material.datepicker.g createFromParcel(android.os.Parcel parcel) {
            return new com.google.android.material.datepicker.g(parcel.readLong(), null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public com.google.android.material.datepicker.g[] newArray(int i6) {
            return new com.google.android.material.datepicker.g[i6];
        }
    }

    private g(long j6) {
        this.f43215C = j6;
    }

    /* synthetic */ g(long j6, com.google.android.material.datepicker.g.a aVar) {
        this(j6);
    }

    public static com.google.android.material.datepicker.g a(long j6) {
        return new com.google.android.material.datepicker.g(j6);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.google.android.material.datepicker.g) && this.f43215C == ((com.google.android.material.datepicker.g) obj).f43215C;
    }

    public int hashCode() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{java.lang.Long.valueOf(this.f43215C)});
    }

    @Override // com.google.android.material.datepicker.C6515a.c
    public boolean n(long j6) {
        return j6 >= this.f43215C;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i6) {
        parcel.writeLong(this.f43215C);
    }
}
