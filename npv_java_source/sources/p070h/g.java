package p070h;

/* JADX INFO: loaded from: classes.dex */
public final class g implements android.os.Parcelable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final android.content.IntentSender f45761C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final android.content.Intent f45762D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final int f45763E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final int f45764F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final h.g.c f45760G = new h.g.c(null);
    public static final android.os.Parcelable.Creator<p070h.g> CREATOR = new h.g.b();

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final android.content.IntentSender f45765a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private android.content.Intent f45766b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f45767c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f45768d;

        /* JADX WARN: Illegal instructions before constructor call */
        public a(android.app.PendingIntent pendingIntent) {
            p247y7.AbstractC7350t.f(pendingIntent, "pendingIntent");
            android.content.IntentSender intentSender = pendingIntent.getIntentSender();
            p247y7.AbstractC7350t.e(intentSender, "pendingIntent.intentSender");
            this(intentSender);
        }

        public a(android.content.IntentSender intentSender) {
            p247y7.AbstractC7350t.f(intentSender, "intentSender");
            this.f45765a = intentSender;
        }

        public final p070h.g a() {
            return new p070h.g(this.f45765a, this.f45766b, this.f45767c, this.f45768d);
        }

        public final h.g.a b(android.content.Intent intent) {
            this.f45766b = intent;
            return this;
        }

        public final h.g.a c(int i6, int i10) {
            this.f45768d = i6;
            this.f45767c = i10;
            return this;
        }
    }

    public static final class b implements android.os.Parcelable.Creator {
        b() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public p070h.g createFromParcel(android.os.Parcel parcel) {
            p247y7.AbstractC7350t.f(parcel, "inParcel");
            return new p070h.g(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public p070h.g[] newArray(int i6) {
            return new p070h.g[i6];
        }
    }

    public static final class c {
        private c() {
        }

        public /* synthetic */ c(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }
    }

    public g(android.content.IntentSender intentSender, android.content.Intent intent, int i6, int i10) {
        p247y7.AbstractC7350t.f(intentSender, "intentSender");
        this.f45761C = intentSender;
        this.f45762D = intent;
        this.f45763E = i6;
        this.f45764F = i10;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public g(android.os.Parcel parcel) {
        p247y7.AbstractC7350t.f(parcel, "parcel");
        android.os.Parcelable parcelable = parcel.readParcelable(android.content.IntentSender.class.getClassLoader());
        p247y7.AbstractC7350t.c(parcelable);
        this((android.content.IntentSender) parcelable, (android.content.Intent) parcel.readParcelable(android.content.Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
    }

    public final android.content.Intent a() {
        return this.f45762D;
    }

    public final int b() {
        return this.f45763E;
    }

    public final int c() {
        return this.f45764F;
    }

    public final android.content.IntentSender d() {
        return this.f45761C;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i6) {
        p247y7.AbstractC7350t.f(parcel, "dest");
        parcel.writeParcelable(this.f45761C, i6);
        parcel.writeParcelable(this.f45762D, i6);
        parcel.writeInt(this.f45763E);
        parcel.writeInt(this.f45764F);
    }
}
