package Z8;

/* JADX INFO: loaded from: classes2.dex */
public final class F extends p009a9.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f16750a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public p127m7.e f16751b;

    @Override // p009a9.d
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean a(Z8.D d6) {
        if (this.f16750a >= 0) {
            return false;
        }
        this.f16750a = d6.a0();
        return true;
    }

    @Override // p009a9.d
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public p127m7.e[] b(Z8.D d6) {
        long j6 = this.f16750a;
        this.f16750a = -1L;
        this.f16751b = null;
        return d6.Z(j6);
    }
}
