package androidx.versionedparcelable;

/* JADX INFO: loaded from: classes.dex */
class b extends androidx.versionedparcelable.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final android.util.SparseIntArray f23790d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final android.os.Parcel f23791e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f23792f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f23793g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final java.lang.String f23794h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f23795i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f23796j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f23797k;

    b(android.os.Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new p170r.C7026a(), new p170r.C7026a(), new p170r.C7026a());
    }

    private b(android.os.Parcel parcel, int i6, int i10, java.lang.String str, p170r.C7026a c7026a, p170r.C7026a c7026a2, p170r.C7026a c7026a3) {
        super(c7026a, c7026a2, c7026a3);
        this.f23790d = new android.util.SparseIntArray();
        this.f23795i = -1;
        this.f23797k = -1;
        this.f23791e = parcel;
        this.f23792f = i6;
        this.f23793g = i10;
        this.f23796j = i6;
        this.f23794h = str;
    }

    @Override // androidx.versionedparcelable.a
    public void A(byte[] bArr) {
        if (bArr == null) {
            this.f23791e.writeInt(-1);
        } else {
            this.f23791e.writeInt(bArr.length);
            this.f23791e.writeByteArray(bArr);
        }
    }

    @Override // androidx.versionedparcelable.a
    protected void C(java.lang.CharSequence charSequence) {
        android.text.TextUtils.writeToParcel(charSequence, this.f23791e, 0);
    }

    @Override // androidx.versionedparcelable.a
    public void E(int i6) {
        this.f23791e.writeInt(i6);
    }

    @Override // androidx.versionedparcelable.a
    public void G(android.os.Parcelable parcelable) {
        this.f23791e.writeParcelable(parcelable, 0);
    }

    @Override // androidx.versionedparcelable.a
    public void I(java.lang.String str) {
        this.f23791e.writeString(str);
    }

    @Override // androidx.versionedparcelable.a
    public void a() {
        int i6 = this.f23795i;
        if (i6 >= 0) {
            int i10 = this.f23790d.get(i6);
            int iDataPosition = this.f23791e.dataPosition();
            this.f23791e.setDataPosition(i10);
            this.f23791e.writeInt(iDataPosition - i10);
            this.f23791e.setDataPosition(iDataPosition);
        }
    }

    @Override // androidx.versionedparcelable.a
    protected androidx.versionedparcelable.a b() {
        android.os.Parcel parcel = this.f23791e;
        int iDataPosition = parcel.dataPosition();
        int i6 = this.f23796j;
        if (i6 == this.f23792f) {
            i6 = this.f23793g;
        }
        return new androidx.versionedparcelable.b(parcel, iDataPosition, i6, this.f23794h + "  ", this.f23787a, this.f23788b, this.f23789c);
    }

    @Override // androidx.versionedparcelable.a
    public boolean g() {
        return this.f23791e.readInt() != 0;
    }

    @Override // androidx.versionedparcelable.a
    public byte[] i() {
        int i6 = this.f23791e.readInt();
        if (i6 < 0) {
            return null;
        }
        byte[] bArr = new byte[i6];
        this.f23791e.readByteArray(bArr);
        return bArr;
    }

    @Override // androidx.versionedparcelable.a
    protected java.lang.CharSequence k() {
        return (java.lang.CharSequence) android.text.TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f23791e);
    }

    @Override // androidx.versionedparcelable.a
    public boolean m(int i6) {
        while (this.f23796j < this.f23793g) {
            int i10 = this.f23797k;
            if (i10 == i6) {
                return true;
            }
            if (java.lang.String.valueOf(i10).compareTo(java.lang.String.valueOf(i6)) > 0) {
                return false;
            }
            this.f23791e.setDataPosition(this.f23796j);
            int i11 = this.f23791e.readInt();
            this.f23797k = this.f23791e.readInt();
            this.f23796j += i11;
        }
        return this.f23797k == i6;
    }

    @Override // androidx.versionedparcelable.a
    public int o() {
        return this.f23791e.readInt();
    }

    @Override // androidx.versionedparcelable.a
    public android.os.Parcelable q() {
        return this.f23791e.readParcelable(getClass().getClassLoader());
    }

    @Override // androidx.versionedparcelable.a
    public java.lang.String s() {
        return this.f23791e.readString();
    }

    @Override // androidx.versionedparcelable.a
    public void w(int i6) {
        a();
        this.f23795i = i6;
        this.f23790d.put(i6, this.f23791e.dataPosition());
        E(0);
        E(i6);
    }

    @Override // androidx.versionedparcelable.a
    public void y(boolean z6) {
        this.f23791e.writeInt(z6 ? 1 : 0);
    }
}
