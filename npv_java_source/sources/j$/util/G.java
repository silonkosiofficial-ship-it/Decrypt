package j$.util;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class G implements java.util.function.IntConsumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.function.Consumer f48015a;

    public /* synthetic */ G(java.util.function.Consumer consumer) {
        this.f48015a = consumer;
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i6) {
        this.f48015a.accept(java.lang.Integer.valueOf(i6));
    }

    public final /* synthetic */ java.util.function.IntConsumer andThen(java.util.function.IntConsumer intConsumer) {
        return j$.com.android.tools.r8.a.b(this, intConsumer);
    }
}
