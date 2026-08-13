package V;

/* JADX INFO: loaded from: classes.dex */
public final class B0 extends V.q1 implements android.os.Parcelable {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final V.B0.b f14629E = new V.B0.b(null);
    public static final android.os.Parcelable.Creator<V.B0> CREATOR = new V.B0.a();

    public static final class a implements android.os.Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public V.B0 createFromParcel(android.os.Parcel parcel) {
            return new V.B0(parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public V.B0[] newArray(int i6) {
            return new V.B0[i6];
        }
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }
    }

    public B0(int i6) {
        super(i6);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i6) {
        parcel.writeInt(d());
    }
}
