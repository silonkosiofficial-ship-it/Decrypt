package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.w5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C6155w5 extends com.google.android.gms.internal.measurement.C6163x5 {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.internal.measurement.AbstractC6108q5 f41270D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private C6155w5(com.google.android.gms.internal.measurement.AbstractC6108q5 abstractC6108q5) {
        super(abstractC6108q5);
        this.f41270D = abstractC6108q5;
    }

    @Override // com.google.android.gms.internal.measurement.C6163x5, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final java.util.Iterator iterator() {
        return new com.google.android.gms.internal.measurement.C6123s5(this.f41270D);
    }
}
