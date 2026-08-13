.class public abstract Lcom/google/android/gms/internal/ads/RI0;
.super Lcom/google/android/gms/internal/ads/sH0;
.source "SourceFile"


# instance fields
.field protected final k:Lcom/google/android/gms/internal/ads/NH0;


# direct methods
.method protected constructor <init>(Lcom/google/android/gms/internal/ads/NH0;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/sH0;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/RI0;->k:Lcom/google/android/gms/internal/ads/NH0;

    return-void
.end method


# virtual methods
.method protected final bridge synthetic A(Ljava/lang/Object;I)I
    .locals 0

    check-cast p1, Ljava/lang/Void;

    const/4 p1, 0x0

    return p1
.end method

.method protected final synthetic B(Ljava/lang/Object;JLcom/google/android/gms/internal/ads/LH0;)J
    .locals 0

    check-cast p1, Ljava/lang/Void;

    return-wide p2
.end method

.method protected final synthetic C(Ljava/lang/Object;Lcom/google/android/gms/internal/ads/LH0;)Lcom/google/android/gms/internal/ads/LH0;
    .locals 0

    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p2}, Lcom/google/android/gms/internal/ads/RI0;->D(Lcom/google/android/gms/internal/ads/LH0;)Lcom/google/android/gms/internal/ads/LH0;

    move-result-object p1

    return-object p1
.end method

.method protected abstract D(Lcom/google/android/gms/internal/ads/LH0;)Lcom/google/android/gms/internal/ads/LH0;
.end method

.method protected abstract E(Lcom/google/android/gms/internal/ads/qm;)V
.end method

.method protected abstract F()V
.end method

.method public final R()Lcom/google/android/gms/internal/ads/qm;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/RI0;->k:Lcom/google/android/gms/internal/ads/NH0;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/NH0;->R()Lcom/google/android/gms/internal/ads/qm;

    const/4 v0, 0x0

    return-object v0
.end method

.method public abstract b(Lcom/google/android/gms/internal/ads/JH0;)V
.end method

.method public final l0()Lcom/google/android/gms/internal/ads/Q7;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/RI0;->k:Lcom/google/android/gms/internal/ads/NH0;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/NH0;->l0()Lcom/google/android/gms/internal/ads/Q7;

    move-result-object v0

    return-object v0
.end method

.method protected final t(Lcom/google/android/gms/internal/ads/Pv0;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/google/android/gms/internal/ads/sH0;->t(Lcom/google/android/gms/internal/ads/Pv0;)V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/RI0;->F()V

    return-void
.end method

.method public final v()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/RI0;->k:Lcom/google/android/gms/internal/ads/NH0;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/NH0;->v()Z

    const/4 v0, 0x1

    return v0
.end method

.method protected final synthetic y(Ljava/lang/Object;Lcom/google/android/gms/internal/ads/NH0;Lcom/google/android/gms/internal/ads/qm;)V
    .locals 0

    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p3}, Lcom/google/android/gms/internal/ads/RI0;->E(Lcom/google/android/gms/internal/ads/qm;)V

    return-void
.end method
