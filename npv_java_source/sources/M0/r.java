package M0;

/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final M0.InterfaceC1346s f6752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f6753b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f6754c;

    public r(M0.InterfaceC1346s interfaceC1346s, int i6, int i10) {
        this.f6752a = interfaceC1346s;
        this.f6753b = i6;
        this.f6754c = i10;
    }

    public final int a() {
        return this.f6754c;
    }

    public final M0.InterfaceC1346s b() {
        return this.f6752a;
    }

    public final int c() {
        return this.f6753b;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof M0.r)) {
            return false;
        }
        M0.r rVar = (M0.r) obj;
        return p247y7.AbstractC7350t.b(this.f6752a, rVar.f6752a) && this.f6753b == rVar.f6753b && this.f6754c == rVar.f6754c;
    }

    public int hashCode() {
        return (((this.f6752a.hashCode() * 31) + this.f6753b) * 31) + this.f6754c;
    }

    public java.lang.String toString() {
        return "ParagraphIntrinsicInfo(intrinsics=" + this.f6752a + ", startIndex=" + this.f6753b + ", endIndex=" + this.f6754c + ')';
    }
}
