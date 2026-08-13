package p080i;

/* JADX INFO: loaded from: classes.dex */
public final class e extends p080i.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i.e.a f46618a = new i.e.a(null);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }
    }

    @Override // p080i.a
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public android.content.Intent a(android.content.Context context, p070h.g gVar) {
        p247y7.AbstractC7350t.f(context, "context");
        p247y7.AbstractC7350t.f(gVar, "input");
        android.content.Intent intentPutExtra = new android.content.Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", gVar);
        p247y7.AbstractC7350t.e(intentPutExtra, "Intent(ACTION_INTENT_SEN…NT_SENDER_REQUEST, input)");
        return intentPutExtra;
    }

    @Override // p080i.a
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public p070h.a c(int i6, android.content.Intent intent) {
        return new p070h.a(i6, intent);
    }
}
