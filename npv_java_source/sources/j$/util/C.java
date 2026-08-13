package j$.util;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C implements java.util.function.DoubleConsumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.function.Consumer f48012a;

    public /* synthetic */ C(java.util.function.Consumer consumer) {
        this.f48012a = consumer;
    }

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d6) {
        this.f48012a.accept(java.lang.Double.valueOf(d6));
    }

    public final /* synthetic */ java.util.function.DoubleConsumer andThen(java.util.function.DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.a(this, doubleConsumer);
    }
}
