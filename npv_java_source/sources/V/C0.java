package V;

/* JADX INFO: loaded from: classes.dex */
public final class C0 extends V.r1 implements android.os.Parcelable {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final V.C0.b f14634E = new V.C0.b(null);
    public static final android.os.Parcelable.Creator<V.C0> CREATOR = new V.C0.a();

    public static final class a implements android.os.Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public V.C0 createFromParcel(android.os.Parcel parcel) {
            return new V.C0(parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public V.C0[] newArray(int i6) {
            return new V.C0[i6];
        }
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }
    }

    public C0(long j6) {
        super(j6);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i6) {
        parcel.writeLong(a());
    }
}
