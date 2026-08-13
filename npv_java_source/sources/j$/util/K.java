package j$.util;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class K implements java.util.function.LongConsumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.function.Consumer f48018a;

    public /* synthetic */ K(java.util.function.Consumer consumer) {
        this.f48018a = consumer;
    }

    @Override // java.util.function.LongConsumer
    public final void accept(long j6) {
        this.f48018a.accept(java.lang.Long.valueOf(j6));
    }

    public final /* synthetic */ java.util.function.LongConsumer andThen(java.util.function.LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.c(this, longConsumer);
    }
}
