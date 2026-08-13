package com.google.android.material.internal;

/* JADX INFO: loaded from: classes3.dex */
public class i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f43454c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f43455d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private B4.d f43458g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.text.TextPaint f43452a = new android.text.TextPaint(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final B4.f f43453b = new com.google.android.material.internal.i.a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f43456e = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private java.lang.ref.WeakReference f43457f = new java.lang.ref.WeakReference(null);

    class a extends B4.f {
        a() {
        }

        @Override // B4.f
        public void a(int i6) {
            com.google.android.material.internal.i.this.f43456e = true;
            com.google.android.material.internal.i.b bVar = (com.google.android.material.internal.i.b) com.google.android.material.internal.i.this.f43457f.get();
            if (bVar != null) {
                bVar.a();
            }
        }

        @Override // B4.f
        public void b(android.graphics.Typeface typeface, boolean z6) {
            if (z6) {
                return;
            }
            com.google.android.material.internal.i.this.f43456e = true;
            com.google.android.material.internal.i.b bVar = (com.google.android.material.internal.i.b) com.google.android.material.internal.i.this.f43457f.get();
            if (bVar != null) {
                bVar.a();
            }
        }
    }

    public interface b {
        void a();

        int[] getState();

        boolean onStateChange(int[] iArr);
    }

    public i(com.google.android.material.internal.i.b bVar) {
        i(bVar);
    }

    private float c(java.lang.String str) {
        if (str == null) {
            return 0.0f;
        }
        return java.lang.Math.abs(this.f43452a.getFontMetrics().ascent);
    }

    private float d(java.lang.CharSequence charSequence) {
        if (charSequence == null) {
            return 0.0f;
        }
        return this.f43452a.measureText(charSequence, 0, charSequence.length());
    }

    private void h(java.lang.String str) {
        this.f43454c = d(str);
        this.f43455d = c(str);
        this.f43456e = false;
    }

    public B4.d e() {
        return this.f43458g;
    }

    public android.text.TextPaint f() {
        return this.f43452a;
    }

    public float g(java.lang.String str) {
        if (!this.f43456e) {
            return this.f43454c;
        }
        h(str);
        return this.f43454c;
    }

    public void i(com.google.android.material.internal.i.b bVar) {
        this.f43457f = new java.lang.ref.WeakReference(bVar);
    }

    public void j(B4.d dVar, android.content.Context context) {
        if (this.f43458g != dVar) {
            this.f43458g = dVar;
            if (dVar != null) {
                dVar.o(context, this.f43452a, this.f43453b);
                com.google.android.material.internal.i.b bVar = (com.google.android.material.internal.i.b) this.f43457f.get();
                if (bVar != null) {
                    this.f43452a.drawableState = bVar.getState();
                }
                dVar.n(context, this.f43452a, this.f43453b);
                this.f43456e = true;
            }
            com.google.android.material.internal.i.b bVar2 = (com.google.android.material.internal.i.b) this.f43457f.get();
            if (bVar2 != null) {
                bVar2.a();
                bVar2.onStateChange(bVar2.getState());
            }
        }
    }

    public void k(boolean z6) {
        this.f43456e = z6;
    }

    public void l(android.content.Context context) {
        this.f43458g.n(context, this.f43452a, this.f43453b);
    }
}
