package V;

/* JADX INFO: loaded from: classes.dex */
public final class D0 extends V.s1 implements android.os.Parcelable {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final V.D0.b f14641F = new V.D0.b(null);
    public static final android.os.Parcelable.Creator<V.D0> CREATOR = new V.D0.a();

    public static final class a implements android.os.Parcelable.ClassLoaderCreator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public V.D0 createFromParcel(android.os.Parcel parcel) {
            return createFromParcel(parcel, null);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public V.D0 createFromParcel(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
            V.u1 u1VarJ;
            if (classLoader == null) {
                classLoader = V.D0.a.class.getClassLoader();
            }
            java.lang.Object value = parcel.readValue(classLoader);
            int i6 = parcel.readInt();
            if (i6 == 0) {
                u1VarJ = V.v1.j();
            } else if (i6 == 1) {
                u1VarJ = V.v1.p();
            } else {
                if (i6 != 2) {
                    throw new java.lang.IllegalStateException("Unsupported MutableState policy " + i6 + " was restored");
                }
                u1VarJ = V.v1.m();
            }
            return new V.D0(value, u1VarJ);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public V.D0[] newArray(int i6) {
            return new V.D0[i6];
        }
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }
    }

    public D0(java.lang.Object obj, V.u1 u1Var) {
        super(obj, u1Var);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i6) {
        int i10;
        parcel.writeValue(getValue());
        V.u1 u1VarC = c();
        if (p247y7.AbstractC7350t.b(u1VarC, V.v1.j())) {
            i10 = 0;
        } else if (p247y7.AbstractC7350t.b(u1VarC, V.v1.p())) {
            i10 = 1;
        } else {
            if (!p247y7.AbstractC7350t.b(u1VarC, V.v1.m())) {
                throw new java.lang.IllegalStateException("Only known types of MutableState's SnapshotMutationPolicy are supported");
            }
            i10 = 2;
        }
        parcel.writeInt(i10);
    }
}
