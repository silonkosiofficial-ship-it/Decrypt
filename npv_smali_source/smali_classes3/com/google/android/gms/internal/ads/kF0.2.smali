.class public final Lcom/google/android/gms/internal/ads/kF0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:[Lcom/google/android/gms/internal/ads/Vu;

.field private final b:Lcom/google/android/gms/internal/ads/MF0;

.field private final c:Lcom/google/android/gms/internal/ads/yw;


# direct methods
.method public varargs constructor <init>([Lcom/google/android/gms/internal/ads/Vu;)V
    .locals 4

    new-instance v0, Lcom/google/android/gms/internal/ads/MF0;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/MF0;-><init>()V

    new-instance v1, Lcom/google/android/gms/internal/ads/yw;

    invoke-direct {v1}, Lcom/google/android/gms/internal/ads/yw;-><init>()V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v2, 0x2

    new-array v2, v2, [Lcom/google/android/gms/internal/ads/Vu;

    iput-object v2, p0, Lcom/google/android/gms/internal/ads/kF0;->a:[Lcom/google/android/gms/internal/ads/Vu;

    const/4 v3, 0x0

    invoke-static {p1, v3, v2, v3, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/kF0;->b:Lcom/google/android/gms/internal/ads/MF0;

    iput-object v1, p0, Lcom/google/android/gms/internal/ads/kF0;->c:Lcom/google/android/gms/internal/ads/yw;

    aput-object v0, v2, v3

    const/4 p1, 0x1

    aput-object v1, v2, p1

    return-void
.end method


# virtual methods
.method public final a(J)J
    .locals 1

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/kF0;->c:Lcom/google/android/gms/internal/ads/yw;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/yw;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/kF0;->c:Lcom/google/android/gms/internal/ads/yw;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/ads/yw;->h(J)J

    move-result-wide p1

    :cond_0
    return-wide p1
.end method

.method public final b()J
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/kF0;->b:Lcom/google/android/gms/internal/ads/MF0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/MF0;->o()J

    move-result-wide v0

    return-wide v0
.end method

.method public final c(Lcom/google/android/gms/internal/ads/qg;)Lcom/google/android/gms/internal/ads/qg;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/kF0;->c:Lcom/google/android/gms/internal/ads/yw;

    iget v1, p1, Lcom/google/android/gms/internal/ads/qg;->a:F

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/yw;->k(F)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/kF0;->c:Lcom/google/android/gms/internal/ads/yw;

    iget v1, p1, Lcom/google/android/gms/internal/ads/qg;->b:F

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/yw;->j(F)V

    return-object p1
.end method

.method public final d(Z)Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/kF0;->b:Lcom/google/android/gms/internal/ads/MF0;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/MF0;->p(Z)V

    return p1
.end method

.method public final e()[Lcom/google/android/gms/internal/ads/Vu;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/kF0;->a:[Lcom/google/android/gms/internal/ads/Vu;

    return-object v0
.end method
