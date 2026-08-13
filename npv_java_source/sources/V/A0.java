package V;

/* JADX INFO: loaded from: classes.dex */
public final class A0 extends V.p1 implements android.os.Parcelable {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final V.A0.b f14627E = new V.A0.b(null);
    public static final android.os.Parcelable.Creator<V.A0> CREATOR = new V.A0.a();

    public static final class a implements android.os.Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public V.A0 createFromParcel(android.os.Parcel parcel) {
            return new V.A0(parcel.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public V.A0[] newArray(int i6) {
            return new V.A0[i6];
        }
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }
    }

    public A0(float f6) {
        super(f6);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i6) {
        parcel.writeFloat(b());
    }
}
