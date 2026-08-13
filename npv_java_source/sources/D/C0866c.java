package D;

/* JADX INFO: renamed from: D.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C0866c implements android.os.Parcelable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final int f1638C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final D.C0866c.b f1637D = new D.C0866c.b(null);
    public static final android.os.Parcelable.Creator<D.C0866c> CREATOR = new D.C0866c.a();

    /* JADX INFO: renamed from: D.c$a */
    public static final class a implements android.os.Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public D.C0866c createFromParcel(android.os.Parcel parcel) {
            return new D.C0866c(parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public D.C0866c[] newArray(int i6) {
            return new D.C0866c[i6];
        }
    }

    /* JADX INFO: renamed from: D.c$b */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }
    }

    public C0866c(int i6) {
        this.f1638C = i6;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof D.C0866c) && this.f1638C == ((D.C0866c) obj).f1638C;
    }

    public int hashCode() {
        return this.f1638C;
    }

    public java.lang.String toString() {
        return "DefaultLazyKey(index=" + this.f1638C + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i6) {
        parcel.writeInt(this.f1638C);
    }
}
