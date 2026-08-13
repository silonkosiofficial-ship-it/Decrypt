package j$.util.stream;

/* JADX INFO: renamed from: j$.util.stream.c2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C6740c2 implements java.util.function.IntFunction, java.util.function.Consumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f48424a;

    private final void accept$j$$util$stream$StreamSpliterators$SliceSpliterator$OfRef$$ExternalSyntheticLambda0(java.lang.Object obj) {
    }

    private final void accept$j$$util$stream$StreamSpliterators$SliceSpliterator$OfRef$$ExternalSyntheticLambda1(java.lang.Object obj) {
    }

    @Override // java.util.function.Consumer
    public void accept(java.lang.Object obj) {
        int i6 = this.f48424a;
    }

    public /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
        switch (this.f48424a) {
            case 4:
                break;
        }
        return j$.util.function.Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // java.util.function.IntFunction
    public java.lang.Object apply(int i6) {
        switch (this.f48424a) {
            case 0:
                return new java.lang.Object[i6];
            case 1:
                return new java.lang.Integer[i6];
            case 2:
                return new java.lang.Long[i6];
            default:
                return new java.lang.Double[i6];
        }
    }
}
