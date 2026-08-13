package p070h;

/* JADX INFO: loaded from: classes.dex */
public final class a implements android.os.Parcelable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final int f45735C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final android.content.Intent f45736D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final h.a.b f45734E = new h.a.b(null);
    public static final android.os.Parcelable.Creator<p070h.a> CREATOR = new p070h.a.C0524a();

    /* JADX INFO: renamed from: h.a$a, reason: collision with other inner class name */
    public static final class C0524a implements android.os.Parcelable.Creator {
        C0524a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public p070h.a createFromParcel(android.os.Parcel parcel) {
            p247y7.AbstractC7350t.f(parcel, "parcel");
            return new p070h.a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public p070h.a[] newArray(int i6) {
            return new p070h.a[i6];
        }
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final java.lang.String a(int i6) {
            if (i6 != -1) {
                return i6 != 0 ? java.lang.String.valueOf(i6) : "RESULT_CANCELED";
            }
            return "RESULT_OK";
        }
    }

    public a(int i6, android.content.Intent intent) {
        this.f45735C = i6;
        this.f45736D = intent;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(android.os.Parcel parcel) {
        this(parcel.readInt(), parcel.readInt() == 0 ? null : (android.content.Intent) android.content.Intent.CREATOR.createFromParcel(parcel));
        p247y7.AbstractC7350t.f(parcel, "parcel");
    }

    public final android.content.Intent a() {
        return this.f45736D;
    }

    public final int b() {
        return this.f45735C;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public java.lang.String toString() {
        return "ActivityResult{resultCode=" + f45734E.a(this.f45735C) + ", data=" + this.f45736D + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i6) {
        p247y7.AbstractC7350t.f(parcel, "dest");
        parcel.writeInt(this.f45735C);
        parcel.writeInt(this.f45736D == null ? 0 : 1);
        android.content.Intent intent = this.f45736D;
        if (intent != null) {
            intent.writeToParcel(parcel, i6);
        }
    }
}
