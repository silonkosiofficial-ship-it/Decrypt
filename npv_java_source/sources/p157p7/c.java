package p157p7;

/* JADX INFO: loaded from: classes3.dex */
final class c extends p097j7.AbstractC6862d implements p157p7.a, java.io.Serializable {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final java.lang.Enum[] f52757D;

    public c(java.lang.Enum[] enumArr) {
        p247y7.AbstractC7350t.f(enumArr, "entries");
        this.f52757D = enumArr;
    }

    public int C(java.lang.Enum r6) {
        p247y7.AbstractC7350t.f(r6, "element");
        return indexOf(r6);
    }

    @Override // p097j7.AbstractC6860b, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(java.lang.Object obj) {
        if (obj instanceof java.lang.Enum) {
            return g((java.lang.Enum) obj);
        }
        return false;
    }

    @Override // p097j7.AbstractC6860b
    public int e() {
        return this.f52757D.length;
    }

    public boolean g(java.lang.Enum r6) {
        p247y7.AbstractC7350t.f(r6, "element");
        return ((java.lang.Enum) p097j7.AbstractC6872n.g0(this.f52757D, r6.ordinal())) == r6;
    }

    @Override // p097j7.AbstractC6862d, java.util.List
    public final /* bridge */ int indexOf(java.lang.Object obj) {
        if (obj instanceof java.lang.Enum) {
            return s((java.lang.Enum) obj);
        }
        return -1;
    }

    @Override // p097j7.AbstractC6862d, java.util.List
    public final /* bridge */ int lastIndexOf(java.lang.Object obj) {
        if (obj instanceof java.lang.Enum) {
            return C((java.lang.Enum) obj);
        }
        return -1;
    }

    @Override // p097j7.AbstractC6862d, java.util.List
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public java.lang.Enum get(int i6) {
        p097j7.AbstractC6862d.f49298C.b(i6, this.f52757D.length);
        return this.f52757D[i6];
    }

    public int s(java.lang.Enum r6) {
        p247y7.AbstractC7350t.f(r6, "element");
        int iOrdinal = r6.ordinal();
        if (((java.lang.Enum) p097j7.AbstractC6872n.g0(this.f52757D, iOrdinal)) == r6) {
            return iOrdinal;
        }
        return -1;
    }
}
