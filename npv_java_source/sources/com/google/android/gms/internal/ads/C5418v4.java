package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.v4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C5418v4 implements com.google.android.gms.internal.ads.InterfaceC3107a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC3107a1 f39316a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC4869q4 f39317b;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private com.google.android.gms.internal.ads.InterfaceC5088s4 f39322g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private com.google.android.gms.internal.ads.D f39323h;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f39319d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f39320e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private byte[] f39321f = com.google.android.gms.internal.ads.EW.f27066f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C5128sR f39318c = new com.google.android.gms.internal.ads.C5128sR();

    public C5418v4(com.google.android.gms.internal.ads.InterfaceC3107a1 interfaceC3107a1, com.google.android.gms.internal.ads.InterfaceC4869q4 interfaceC4869q4) {
        this.f39316a = interfaceC3107a1;
        this.f39317b = interfaceC4869q4;
    }

    private final void i(int i6) {
        int length = this.f39321f.length;
        int i10 = this.f39320e;
        if (length - i10 >= i6) {
            return;
        }
        int i11 = i10 - this.f39319d;
        int iMax = java.lang.Math.max(i11 + i11, i6 + i11);
        byte[] bArr = this.f39321f;
        byte[] bArr2 = iMax <= bArr.length ? bArr : new byte[iMax];
        java.lang.System.arraycopy(bArr, this.f39319d, bArr2, 0, i11);
        this.f39319d = 0;
        this.f39320e = i11;
        this.f39321f = bArr2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3107a1
    public final /* synthetic */ void a(com.google.android.gms.internal.ads.C5128sR c5128sR, int i6) {
        com.google.android.gms.internal.ads.Y0.b(this, c5128sR, i6);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3107a1
    public final void b(final long j6, final int i6, int i10, int i11, com.google.android.gms.internal.ads.Z0 z6) {
        if (this.f39322g == null) {
            this.f39316a.b(j6, i6, i10, i11, z6);
            return;
        }
        com.google.android.gms.internal.ads.LC.e(z6 == null, "DRM on subtitles is not supported");
        int i12 = (this.f39320e - i11) - i10;
        this.f39322g.a(this.f39321f, i12, i10, com.google.android.gms.internal.ads.C4978r4.a(), new com.google.android.gms.internal.ads.InterfaceC5000rF() { // from class: com.google.android.gms.internal.ads.u4
            @Override // com.google.android.gms.internal.ads.InterfaceC5000rF
            public final void b(java.lang.Object obj) {
                this.f39083a.h(j6, i6, (com.google.android.gms.internal.ads.C4099j4) obj);
            }
        });
        int i13 = i12 + i10;
        this.f39319d = i13;
        if (i13 == this.f39320e) {
            this.f39319d = 0;
            this.f39320e = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3107a1
    public final void c(com.google.android.gms.internal.ads.D d6) {
        com.google.android.gms.internal.ads.InterfaceC3107a1 interfaceC3107a1;
        java.lang.String str = d6.f26574o;
        str.getClass();
        com.google.android.gms.internal.ads.LC.d(com.google.android.gms.internal.ads.AbstractC3606ed.b(str) == 3);
        if (!d6.equals(this.f39323h)) {
            this.f39323h = d6;
            this.f39322g = this.f39317b.b(d6) ? this.f39317b.c(d6) : null;
        }
        if (this.f39322g == null) {
            interfaceC3107a1 = this.f39316a;
        } else {
            interfaceC3107a1 = this.f39316a;
            com.google.android.gms.internal.ads.C4682oK0 c4682oK0B = d6.b();
            c4682oK0B.B("application/x-media3-cues");
            c4682oK0B.a(d6.f26574o);
            c4682oK0B.F(Long.MAX_VALUE);
            c4682oK0B.e(this.f39317b.a(d6));
            d6 = c4682oK0B.H();
        }
        interfaceC3107a1.c(d6);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3107a1
    public final /* synthetic */ void d(long j6) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3107a1
    public final /* synthetic */ int e(com.google.android.gms.internal.ads.InterfaceC4884qB0 interfaceC4884qB0, int i6, boolean z6) {
        return com.google.android.gms.internal.ads.Y0.a(this, interfaceC4884qB0, i6, z6);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3107a1
    public final int f(com.google.android.gms.internal.ads.InterfaceC4884qB0 interfaceC4884qB0, int i6, boolean z6, int i10) throws java.io.EOFException {
        if (this.f39322g == null) {
            return this.f39316a.f(interfaceC4884qB0, i6, z6, 0);
        }
        i(i6);
        int iH = interfaceC4884qB0.H(this.f39321f, this.f39320e, i6);
        if (iH != -1) {
            this.f39320e += iH;
            return iH;
        }
        if (z6) {
            return -1;
        }
        throw new java.io.EOFException();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3107a1
    public final void g(com.google.android.gms.internal.ads.C5128sR c5128sR, int i6, int i10) {
        if (this.f39322g == null) {
            this.f39316a.g(c5128sR, i6, i10);
            return;
        }
        i(i6);
        c5128sR.h(this.f39321f, this.f39320e, i6);
        this.f39320e += i6;
    }

    final /* synthetic */ void h(long j6, int i6, com.google.android.gms.internal.ads.C4099j4 c4099j4) {
        com.google.android.gms.internal.ads.LC.b(this.f39323h);
        com.google.android.gms.internal.ads.AbstractC3398ci0 abstractC3398ci0 = c4099j4.f36553a;
        long j10 = c4099j4.f36555c;
        java.util.ArrayList<? extends android.os.Parcelable> arrayList = new java.util.ArrayList<>(abstractC3398ci0.size());
        java.util.Iterator<E> it = abstractC3398ci0.iterator();
        while (it.hasNext()) {
            arrayList.add(((com.google.android.gms.internal.ads.C2297Dy) it.next()).a());
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putParcelableArrayList("c", arrayList);
        bundle.putLong("d", j10);
        android.os.Parcel parcelObtain = android.os.Parcel.obtain();
        parcelObtain.writeBundle(bundle);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        com.google.android.gms.internal.ads.C5128sR c5128sR = this.f39318c;
        int length = bArrMarshall.length;
        c5128sR.j(bArrMarshall, length);
        this.f39316a.a(this.f39318c, length);
        long j11 = c4099j4.f36554b;
        if (j11 == -9223372036854775807L) {
            com.google.android.gms.internal.ads.LC.f(this.f39323h.f26579t == Long.MAX_VALUE);
        } else {
            long j12 = this.f39323h.f26579t;
            j6 = j12 == Long.MAX_VALUE ? j6 + j11 : j11 + j12;
        }
        this.f39316a.b(j6, i6, length, 0, null);
    }
}
