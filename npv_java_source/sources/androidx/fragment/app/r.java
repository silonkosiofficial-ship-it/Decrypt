package androidx.fragment.app;

/* JADX INFO: loaded from: classes.dex */
final class r implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<androidx.fragment.app.r> CREATOR = new androidx.fragment.app.r.a();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    final java.lang.String f22652C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    final java.lang.String f22653D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    final boolean f22654E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    final int f22655F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    final int f22656G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    final java.lang.String f22657H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    final boolean f22658I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    final boolean f22659J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    final boolean f22660K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    final android.os.Bundle f22661L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    final boolean f22662M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    final int f22663N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    android.os.Bundle f22664O;

    class a implements android.os.Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public androidx.fragment.app.r createFromParcel(android.os.Parcel parcel) {
            return new androidx.fragment.app.r(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public androidx.fragment.app.r[] newArray(int i6) {
            return new androidx.fragment.app.r[i6];
        }
    }

    r(android.os.Parcel parcel) {
        this.f22652C = parcel.readString();
        this.f22653D = parcel.readString();
        this.f22654E = parcel.readInt() != 0;
        this.f22655F = parcel.readInt();
        this.f22656G = parcel.readInt();
        this.f22657H = parcel.readString();
        this.f22658I = parcel.readInt() != 0;
        this.f22659J = parcel.readInt() != 0;
        this.f22660K = parcel.readInt() != 0;
        this.f22661L = parcel.readBundle();
        this.f22662M = parcel.readInt() != 0;
        this.f22664O = parcel.readBundle();
        this.f22663N = parcel.readInt();
    }

    r(androidx.fragment.app.f fVar) {
        this.f22652C = fVar.getClass().getName();
        this.f22653D = fVar.f22478H;
        this.f22654E = fVar.f22487Q;
        this.f22655F = fVar.f22496Z;
        this.f22656G = fVar.f22497a0;
        this.f22657H = fVar.f22498b0;
        this.f22658I = fVar.f22501e0;
        this.f22659J = fVar.f22485O;
        this.f22660K = fVar.f22500d0;
        this.f22661L = fVar.f22479I;
        this.f22662M = fVar.f22499c0;
        this.f22663N = fVar.f22517u0.ordinal();
    }

    androidx.fragment.app.f a(androidx.fragment.app.j jVar, java.lang.ClassLoader classLoader) {
        androidx.fragment.app.f fVarA = jVar.a(classLoader, this.f22652C);
        android.os.Bundle bundle = this.f22661L;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        fVarA.v1(this.f22661L);
        fVarA.f22478H = this.f22653D;
        fVarA.f22487Q = this.f22654E;
        fVarA.f22489S = true;
        fVarA.f22496Z = this.f22655F;
        fVarA.f22497a0 = this.f22656G;
        fVarA.f22498b0 = this.f22657H;
        fVarA.f22501e0 = this.f22658I;
        fVarA.f22485O = this.f22659J;
        fVarA.f22500d0 = this.f22660K;
        fVarA.f22499c0 = this.f22662M;
        fVarA.f22517u0 = androidx.lifecycle.AbstractC2079k.b.values()[this.f22663N];
        android.os.Bundle bundle2 = this.f22664O;
        if (bundle2 == null) {
            bundle2 = new android.os.Bundle();
        }
        fVarA.f22473D = bundle2;
        return fVarA;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f22652C);
        sb.append(" (");
        sb.append(this.f22653D);
        sb.append(")}:");
        if (this.f22654E) {
            sb.append(" fromLayout");
        }
        if (this.f22656G != 0) {
            sb.append(" id=0x");
            sb.append(java.lang.Integer.toHexString(this.f22656G));
        }
        java.lang.String str = this.f22657H;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(this.f22657H);
        }
        if (this.f22658I) {
            sb.append(" retainInstance");
        }
        if (this.f22659J) {
            sb.append(" removing");
        }
        if (this.f22660K) {
            sb.append(" detached");
        }
        if (this.f22662M) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i6) {
        parcel.writeString(this.f22652C);
        parcel.writeString(this.f22653D);
        parcel.writeInt(this.f22654E ? 1 : 0);
        parcel.writeInt(this.f22655F);
        parcel.writeInt(this.f22656G);
        parcel.writeString(this.f22657H);
        parcel.writeInt(this.f22658I ? 1 : 0);
        parcel.writeInt(this.f22659J ? 1 : 0);
        parcel.writeInt(this.f22660K ? 1 : 0);
        parcel.writeBundle(this.f22661L);
        parcel.writeInt(this.f22662M ? 1 : 0);
        parcel.writeBundle(this.f22664O);
        parcel.writeInt(this.f22663N);
    }
}
