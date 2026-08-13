package V;

/* JADX INFO: renamed from: V.k0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1726k0 extends p247y7.AbstractC7352v implements p237x7.l {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    final /* synthetic */ p237x7.l f14903D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1726k0(p237x7.l lVar) {
        super(1);
        this.f14903D = lVar;
    }

    public final java.lang.Object a(long j6) {
        return this.f14903D.l(java.lang.Long.valueOf(j6 / 1000000));
    }

    @Override // p237x7.l
    public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
        return a(((java.lang.Number) obj).longValue());
    }
}
