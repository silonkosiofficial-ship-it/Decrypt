.class public final Lcom/google/android/gms/internal/ads/Np;
.super Lcom/google/android/gms/internal/ads/xp;
.source "SourceFile"


# instance fields
.field private C:Lk3/l;

.field private D:Lk3/p;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/xp;-><init>()V

    return-void
.end method


# virtual methods
.method public final I4(Ls3/W0;)V
    .locals 1

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Np;->C:Lk3/l;

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Ls3/W0;->e()Lk3/b;

    move-result-object p1

    invoke-virtual {v0, p1}, Lk3/l;->c(Lk3/b;)V

    :cond_0
    return-void
.end method

.method public final L(I)V
    .locals 0

    return-void
.end method

.method public final S1(Lcom/google/android/gms/internal/ads/sp;)V
    .locals 2

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Np;->D:Lk3/p;

    if-eqz v0, :cond_0

    new-instance v1, Lcom/google/android/gms/internal/ads/Fp;

    invoke-direct {v1, p1}, Lcom/google/android/gms/internal/ads/Fp;-><init>(Lcom/google/android/gms/internal/ads/sp;)V

    invoke-interface {v0, v1}, Lk3/p;->a(LE3/b;)V

    :cond_0
    return-void
.end method

.method public final d()V
    .locals 1

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Np;->C:Lk3/l;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lk3/l;->a()V

    :cond_0
    return-void
.end method

.method public final e()V
    .locals 1

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Np;->C:Lk3/l;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lk3/l;->d()V

    :cond_0
    return-void
.end method

.method public final i()V
    .locals 1

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Np;->C:Lk3/l;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lk3/l;->b()V

    :cond_0
    return-void
.end method

.method public final j()V
    .locals 1

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Np;->C:Lk3/l;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lk3/l;->e()V

    :cond_0
    return-void
.end method

.method public final o6(Lk3/p;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/Np;->D:Lk3/p;

    return-void
.end method
