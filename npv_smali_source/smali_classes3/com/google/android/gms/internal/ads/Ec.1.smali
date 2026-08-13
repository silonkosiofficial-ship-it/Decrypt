.class public final Lcom/google/android/gms/internal/ads/Ec;
.super Lcom/google/android/gms/internal/ads/Nc;
.source "SourceFile"


# instance fields
.field private C:Lk3/l;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/Nc;-><init>()V

    return-void
.end method


# virtual methods
.method public final b()V
    .locals 1

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Ec;->C:Lk3/l;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lk3/l;->a()V

    :cond_0
    return-void
.end method

.method public final c()V
    .locals 1

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Ec;->C:Lk3/l;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lk3/l;->b()V

    :cond_0
    return-void
.end method

.method public final d()V
    .locals 1

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Ec;->C:Lk3/l;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lk3/l;->d()V

    :cond_0
    return-void
.end method

.method public final e()V
    .locals 1

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Ec;->C:Lk3/l;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lk3/l;->e()V

    :cond_0
    return-void
.end method

.method public final n0(Ls3/W0;)V
    .locals 1

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Ec;->C:Lk3/l;

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Ls3/W0;->e()Lk3/b;

    move-result-object p1

    invoke-virtual {v0, p1}, Lk3/l;->c(Lk3/b;)V

    :cond_0
    return-void
.end method

.method public final o6(Lk3/l;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/Ec;->C:Lk3/l;

    return-void
.end method
