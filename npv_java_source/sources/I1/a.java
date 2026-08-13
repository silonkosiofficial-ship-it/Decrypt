package I1;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements android.os.Parcelable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final android.os.Parcelable f4937C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final I1.a f4936D = new I1.a.C0115a();
    public static final android.os.Parcelable.Creator<I1.a> CREATOR = new I1.a.b();

    /* JADX INFO: renamed from: I1.a$a, reason: collision with other inner class name */
    class C0115a extends I1.a {
        C0115a() {
            super((I1.a.C0115a) null);
        }
    }

    class b implements android.os.Parcelable.ClassLoaderCreator {
        b() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public I1.a createFromParcel(android.os.Parcel parcel) {
            return createFromParcel(parcel, null);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public I1.a createFromParcel(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return I1.a.f4936D;
            }
            throw new java.lang.IllegalStateException("superState must be null");
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public I1.a[] newArray(int i6) {
            return new I1.a[i6];
        }
    }

    private a() {
        this.f4937C = null;
    }

    /* synthetic */ a(I1.a.C0115a c0115a) {
        this();
    }

    protected a(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
        android.os.Parcelable parcelable = parcel.readParcelable(classLoader);
        this.f4937C = parcelable == null ? f4936D : parcelable;
    }

    protected a(android.os.Parcelable parcelable) {
        if (parcelable == null) {
            throw new java.lang.IllegalArgumentException("superState must not be null");
        }
        this.f4937C = parcelable == f4936D ? null : parcelable;
    }

    public final android.os.Parcelable a() {
        return this.f4937C;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i6) {
        parcel.writeParcelable(this.f4937C, i6);
    }
}
