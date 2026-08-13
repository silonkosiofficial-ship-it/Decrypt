package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
final class c0 implements androidx.datastore.preferences.protobuf.M {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.datastore.preferences.protobuf.O f21981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.String f21982b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.lang.Object[] f21983c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f21984d;

    c0(androidx.datastore.preferences.protobuf.O o6, java.lang.String str, java.lang.Object[] objArr) {
        char cCharAt;
        this.f21981a = o6;
        this.f21982b = str;
        this.f21983c = objArr;
        int iCharAt = str.charAt(0);
        if (iCharAt >= 55296) {
            int i6 = iCharAt & 8191;
            int i10 = 13;
            int i11 = 1;
            while (true) {
                int i12 = i11 + 1;
                cCharAt = str.charAt(i11);
                if (cCharAt < 55296) {
                    break;
                }
                i6 |= (cCharAt & 8191) << i10;
                i10 += 13;
                i11 = i12;
            }
            iCharAt = i6 | (cCharAt << i10);
        }
        this.f21984d = iCharAt;
    }

    @Override // androidx.datastore.preferences.protobuf.M
    public boolean a() {
        return (this.f21984d & 2) == 2;
    }

    @Override // androidx.datastore.preferences.protobuf.M
    public androidx.datastore.preferences.protobuf.O b() {
        return this.f21981a;
    }

    @Override // androidx.datastore.preferences.protobuf.M
    public androidx.datastore.preferences.protobuf.Z c() {
        return (this.f21984d & 1) == 1 ? androidx.datastore.preferences.protobuf.Z.PROTO2 : androidx.datastore.preferences.protobuf.Z.PROTO3;
    }

    java.lang.Object[] d() {
        return this.f21983c;
    }

    java.lang.String e() {
        return this.f21982b;
    }
}
