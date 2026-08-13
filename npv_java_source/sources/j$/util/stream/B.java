package j$.util.stream;

/* JADX INFO: loaded from: classes4.dex */
abstract class B extends j$.util.stream.C {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f48205l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ B(j$.util.stream.AbstractC6732b abstractC6732b, int i6, int i10) {
        super(abstractC6732b, i6);
        this.f48205l = i10;
    }

    @Override // j$.util.stream.AbstractC6732b
    final boolean M() {
        switch (this.f48205l) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    @Override // j$.util.stream.AbstractC6732b, j$.util.stream.InterfaceC6762h, j$.util.stream.F
    public final /* bridge */ /* synthetic */ j$.util.stream.F parallel() {
        switch (this.f48205l) {
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
    public final /* bridge */ /* synthetic */ j$.util.stream.F sequential() {
        switch (this.f48205l) {
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
        switch (this.f48205l) {
            case 0:
                break;
        }
        return spliterator();
    }

    @Override // j$.util.stream.InterfaceC6762h
    public final j$.util.stream.InterfaceC6762h unordered() {
        switch (this.f48205l) {
            case 0:
                return !H() ? this : new j$.util.stream.C6848z(this, j$.util.stream.EnumC6756f3.f48460r, 0);
            default:
                return !H() ? this : new j$.util.stream.C6848z(this, j$.util.stream.EnumC6756f3.f48460r, 0);
        }
    }
}
