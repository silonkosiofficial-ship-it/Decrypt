package j$.util.stream;

/* JADX INFO: renamed from: j$.util.stream.j0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
abstract class AbstractC6773j0 extends j$.util.stream.AbstractC6778k0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f48492l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AbstractC6773j0(j$.util.stream.AbstractC6732b abstractC6732b, int i6, int i10) {
        super(abstractC6732b, i6);
        this.f48492l = i10;
    }

    @Override // j$.util.stream.AbstractC6732b
    final boolean M() {
        switch (this.f48492l) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    @Override // j$.util.stream.AbstractC6732b, j$.util.stream.InterfaceC6762h, j$.util.stream.F
    public final /* bridge */ /* synthetic */ j$.util.stream.InterfaceC6793n0 parallel() {
        switch (this.f48492l) {
            case 0:
                parallel();
                break;
            default:
                parallel();
                break;
        }
        return this;
    }

    @Override // j$.util.stream.AbstractC6732b, j$.util.stream.InterfaceC6762h, j$.util.stream.F
    public final /* bridge */ /* synthetic */ j$.util.stream.InterfaceC6793n0 sequential() {
        switch (this.f48492l) {
            case 0:
                sequential();
                break;
            default:
                sequential();
                break;
        }
        return this;
    }

    @Override // j$.util.stream.AbstractC6732b, j$.util.stream.InterfaceC6762h
    public final /* bridge */ /* synthetic */ j$.util.Spliterator spliterator() {
        switch (this.f48492l) {
            case 0:
                break;
        }
        return spliterator();
    }

    @Override // j$.util.stream.InterfaceC6762h
    public final j$.util.stream.InterfaceC6762h unordered() {
        switch (this.f48492l) {
            case 0:
                return !H() ? this : new j$.util.stream.C6840x(this, j$.util.stream.EnumC6756f3.f48460r, 4);
            default:
                return !H() ? this : new j$.util.stream.C6840x(this, j$.util.stream.EnumC6756f3.f48460r, 4);
        }
    }
}
