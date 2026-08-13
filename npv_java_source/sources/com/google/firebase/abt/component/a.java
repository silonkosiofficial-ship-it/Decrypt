package com.google.firebase.abt.component;

/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.Map f43922a = new java.util.HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final android.content.Context f43923b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final F5.b f43924c;

    protected a(android.content.Context context, F5.b bVar) {
        this.f43923b = context;
        this.f43924c = bVar;
    }

    protected R4.c a(java.lang.String str) {
        return new R4.c(this.f43923b, this.f43924c, str);
    }

    public synchronized R4.c b(java.lang.String str) {
        try {
            if (!this.f43922a.containsKey(str)) {
                this.f43922a.put(str, a(str));
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
        return (R4.c) this.f43922a.get(str);
    }
}
