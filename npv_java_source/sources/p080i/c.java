package p080i;

/* JADX INFO: loaded from: classes.dex */
public final class c extends p080i.a {
    @Override // p080i.a
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public android.content.Intent a(android.content.Context context, java.lang.String str) {
        p247y7.AbstractC7350t.f(context, "context");
        p247y7.AbstractC7350t.f(str, "input");
        return p080i.b.f46616a.a(new java.lang.String[]{str});
    }

    @Override // p080i.a
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public p080i.a.C0566a b(android.content.Context context, java.lang.String str) {
        p247y7.AbstractC7350t.f(context, "context");
        p247y7.AbstractC7350t.f(str, "input");
        if (androidx.core.content.a.a(context, str) == 0) {
            return new p080i.a.C0566a(java.lang.Boolean.TRUE);
        }
        return null;
    }

    @Override // p080i.a
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public java.lang.Boolean c(int i6, android.content.Intent intent) {
        if (intent == null || i6 != -1) {
            return java.lang.Boolean.FALSE;
        }
        int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
        boolean z6 = false;
        if (intArrayExtra != null) {
            for (int i10 : intArrayExtra) {
                if (i10 == 0) {
                    z6 = true;
                    break;
                }
            }
        }
        return java.lang.Boolean.valueOf(z6);
    }
}
