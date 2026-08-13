package j$.util.stream;

/* JADX INFO: renamed from: j$.util.stream.d0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C6743d0 implements java.util.function.LongConsumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j$.util.stream.InterfaceC6810q2 f48429a;

    @Override // java.util.function.LongConsumer
    public final void accept(long j6) {
        this.f48429a.accept(j6);
    }

    public final /* synthetic */ java.util.function.LongConsumer andThen(java.util.function.LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.c(this, longConsumer);
    }
}
