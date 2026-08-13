.class final Lcom/google/android/gms/internal/ads/Wt;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lu3/z;


# instance fields
.field private final C:Lcom/google/android/gms/internal/ads/Ot;

.field private final D:Lu3/z;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/Ot;Lu3/z;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/Wt;->C:Lcom/google/android/gms/internal/ads/Ot;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/Wt;->D:Lu3/z;

    return-void
.end method


# virtual methods
.method public final T2()V
    .locals 1

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Wt;->D:Lu3/z;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lu3/z;->T2()V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Wt;->C:Lcom/google/android/gms/internal/ads/Ot;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/Ot;->f0()V

    return-void
.end method

.method public final d2()V
    .locals 1

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Wt;->D:Lu3/z;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lu3/z;->d2()V

    :cond_0
    return-void
.end method

.method public final f3()V
    .locals 0

    return-void
.end method

.method public final p4(I)V
    .locals 1

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Wt;->D:Lu3/z;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lu3/z;->p4(I)V

    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/Wt;->C:Lcom/google/android/gms/internal/ads/Ot;

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/Ot;->H0()V

    return-void
.end method

.method public final q0()V
    .locals 1

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Wt;->D:Lu3/z;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lu3/z;->q0()V

    :cond_0
    return-void
.end method

.method public final y0()V
    .locals 0

    return-void
.end method
