package androidx.fragment.app;

/* JADX INFO: renamed from: androidx.fragment.app.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C2067b implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<androidx.fragment.app.C2067b> CREATOR = new androidx.fragment.app.C2067b.a();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    final int[] f22384C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    final java.util.ArrayList f22385D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    final int[] f22386E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    final int[] f22387F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    final int f22388G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    final java.lang.String f22389H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    final int f22390I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    final int f22391J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    final java.lang.CharSequence f22392K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    final int f22393L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    final java.lang.CharSequence f22394M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    final java.util.ArrayList f22395N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final java.util.ArrayList f22396O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    final boolean f22397P;

    /* JADX INFO: renamed from: androidx.fragment.app.b$a */
    class a implements android.os.Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public androidx.fragment.app.C2067b createFromParcel(android.os.Parcel parcel) {
            return new androidx.fragment.app.C2067b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public androidx.fragment.app.C2067b[] newArray(int i6) {
            return new androidx.fragment.app.C2067b[i6];
        }
    }

    C2067b(android.os.Parcel parcel) {
        this.f22384C = parcel.createIntArray();
        this.f22385D = parcel.createStringArrayList();
        this.f22386E = parcel.createIntArray();
        this.f22387F = parcel.createIntArray();
        this.f22388G = parcel.readInt();
        this.f22389H = parcel.readString();
        this.f22390I = parcel.readInt();
        this.f22391J = parcel.readInt();
        android.os.Parcelable.Creator creator = android.text.TextUtils.CHAR_SEQUENCE_CREATOR;
        this.f22392K = (java.lang.CharSequence) creator.createFromParcel(parcel);
        this.f22393L = parcel.readInt();
        this.f22394M = (java.lang.CharSequence) creator.createFromParcel(parcel);
        this.f22395N = parcel.createStringArrayList();
        this.f22396O = parcel.createStringArrayList();
        this.f22397P = parcel.readInt() != 0;
    }

    C2067b(androidx.fragment.app.C2066a c2066a) {
        int size = c2066a.f22679c.size();
        this.f22384C = new int[size * 6];
        if (!c2066a.f22685i) {
            throw new java.lang.IllegalStateException("Not on back stack");
        }
        this.f22385D = new java.util.ArrayList(size);
        this.f22386E = new int[size];
        this.f22387F = new int[size];
        int i6 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            androidx.fragment.app.u.a aVar = (androidx.fragment.app.u.a) c2066a.f22679c.get(i10);
            int i11 = i6 + 1;
            this.f22384C[i6] = aVar.f22696a;
            java.util.ArrayList arrayList = this.f22385D;
            androidx.fragment.app.f fVar = aVar.f22697b;
            arrayList.add(fVar != null ? fVar.f22478H : null);
            int[] iArr = this.f22384C;
            iArr[i11] = aVar.f22698c ? 1 : 0;
            iArr[i6 + 2] = aVar.f22699d;
            iArr[i6 + 3] = aVar.f22700e;
            int i12 = i6 + 5;
            iArr[i6 + 4] = aVar.f22701f;
            i6 += 6;
            iArr[i12] = aVar.f22702g;
            this.f22386E[i10] = aVar.f22703h.ordinal();
            this.f22387F[i10] = aVar.f22704i.ordinal();
        }
        this.f22388G = c2066a.f22684h;
        this.f22389H = c2066a.f22687k;
        this.f22390I = c2066a.f22382v;
        this.f22391J = c2066a.f22688l;
        this.f22392K = c2066a.f22689m;
        this.f22393L = c2066a.f22690n;
        this.f22394M = c2066a.f22691o;
        this.f22395N = c2066a.f22692p;
        this.f22396O = c2066a.f22693q;
        this.f22397P = c2066a.f22694r;
    }

    private void a(androidx.fragment.app.C2066a c2066a) {
        int i6 = 0;
        int i10 = 0;
        while (true) {
            boolean z6 = true;
            if (i6 >= this.f22384C.length) {
                c2066a.f22684h = this.f22388G;
                c2066a.f22687k = this.f22389H;
                c2066a.f22685i = true;
                c2066a.f22688l = this.f22391J;
                c2066a.f22689m = this.f22392K;
                c2066a.f22690n = this.f22393L;
                c2066a.f22691o = this.f22394M;
                c2066a.f22692p = this.f22395N;
                c2066a.f22693q = this.f22396O;
                c2066a.f22694r = this.f22397P;
                return;
            }
            androidx.fragment.app.u.a aVar = new androidx.fragment.app.u.a();
            int i11 = i6 + 1;
            aVar.f22696a = this.f22384C[i6];
            if (androidx.fragment.app.n.E0(2)) {
                java.lang.String str = "Instantiate " + c2066a + " op #" + i10 + " base fragment #" + this.f22384C[i11];
            }
            aVar.f22703h = androidx.lifecycle.AbstractC2079k.b.values()[this.f22386E[i10]];
            aVar.f22704i = androidx.lifecycle.AbstractC2079k.b.values()[this.f22387F[i10]];
            int[] iArr = this.f22384C;
            int i12 = i6 + 2;
            if (iArr[i11] == 0) {
                z6 = false;
            }
            aVar.f22698c = z6;
            int i13 = iArr[i12];
            aVar.f22699d = i13;
            int i14 = iArr[i6 + 3];
            aVar.f22700e = i14;
            int i15 = i6 + 5;
            int i16 = iArr[i6 + 4];
            aVar.f22701f = i16;
            i6 += 6;
            int i17 = iArr[i15];
            aVar.f22702g = i17;
            c2066a.f22680d = i13;
            c2066a.f22681e = i14;
            c2066a.f22682f = i16;
            c2066a.f22683g = i17;
            c2066a.e(aVar);
            i10++;
        }
    }

    public androidx.fragment.app.C2066a b(androidx.fragment.app.n nVar) {
        androidx.fragment.app.C2066a c2066a = new androidx.fragment.app.C2066a(nVar);
        a(c2066a);
        c2066a.f22382v = this.f22390I;
        for (int i6 = 0; i6 < this.f22385D.size(); i6++) {
            java.lang.String str = (java.lang.String) this.f22385D.get(i6);
            if (str != null) {
                ((androidx.fragment.app.u.a) c2066a.f22679c.get(i6)).f22697b = nVar.c0(str);
            }
        }
        c2066a.p(1);
        return c2066a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i6) {
        parcel.writeIntArray(this.f22384C);
        parcel.writeStringList(this.f22385D);
        parcel.writeIntArray(this.f22386E);
        parcel.writeIntArray(this.f22387F);
        parcel.writeInt(this.f22388G);
        parcel.writeString(this.f22389H);
        parcel.writeInt(this.f22390I);
        parcel.writeInt(this.f22391J);
        android.text.TextUtils.writeToParcel(this.f22392K, parcel, 0);
        parcel.writeInt(this.f22393L);
        android.text.TextUtils.writeToParcel(this.f22394M, parcel, 0);
        parcel.writeStringList(this.f22395N);
        parcel.writeStringList(this.f22396O);
        parcel.writeInt(this.f22397P ? 1 : 0);
    }
}
