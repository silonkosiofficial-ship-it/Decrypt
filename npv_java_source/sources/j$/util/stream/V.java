package j$.util.stream;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class V implements java.util.function.IntConsumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j$.util.stream.InterfaceC6810q2 f48380a;

    @Override // java.util.function.IntConsumer
    public final void accept(int i6) {
        this.f48380a.accept(i6);
    }

    public final /* synthetic */ java.util.function.IntConsumer andThen(java.util.function.IntConsumer intConsumer) {
        return j$.com.android.tools.r8.a.b(this, intConsumer);
    }
}
