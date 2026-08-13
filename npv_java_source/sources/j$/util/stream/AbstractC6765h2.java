package j$.util.stream;

/* JADX INFO: renamed from: j$.util.stream.h2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
abstract class AbstractC6765h2 extends j$.util.stream.AbstractC6770i2 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f48479l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AbstractC6765h2(j$.util.stream.AbstractC6732b abstractC6732b, int i6, int i10) {
        super(abstractC6732b, i6);
        this.f48479l = i10;
    }

    @Override // j$.util.stream.AbstractC6732b
    final boolean M() {
        switch (this.f48479l) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    @Override // j$.util.stream.InterfaceC6762h
    public final j$.util.stream.InterfaceC6762h unordered() {
        switch (this.f48479l) {
            case 0:
                return !H() ? this : new j$.util.stream.C6750e2(this, j$.util.stream.EnumC6756f3.f48460r, 1);
            default:
                return !H() ? this : new j$.util.stream.C6750e2(this, j$.util.stream.EnumC6756f3.f48460r, 1);
        }
    }
}
