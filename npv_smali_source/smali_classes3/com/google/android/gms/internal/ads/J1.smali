.class public final Lcom/google/android/gms/internal/ads/J1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/t0;


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/t0;


# direct methods
.method public constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p1, Lcom/google/android/gms/internal/ads/K1;

    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/K1;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/J1;->a:Lcom/google/android/gms/internal/ads/t0;

    return-void
.end method


# virtual methods
.method public final synthetic c()Lcom/google/android/gms/internal/ads/t0;
    .locals 0

    return-object p0
.end method

.method public final e(JJ)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/J1;->a:Lcom/google/android/gms/internal/ads/t0;

    invoke-interface {v0, p1, p2, p3, p4}, Lcom/google/android/gms/internal/ads/t0;->e(JJ)V

    return-void
.end method

.method public final synthetic f()Ljava/util/List;
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/ads/ci0;->O()Lcom/google/android/gms/internal/ads/ci0;

    move-result-object v0

    return-object v0
.end method

.method public final i(Lcom/google/android/gms/internal/ads/u0;Lcom/google/android/gms/internal/ads/Q0;)I
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/J1;->a:Lcom/google/android/gms/internal/ads/t0;

    invoke-interface {v0, p1, p2}, Lcom/google/android/gms/internal/ads/t0;->i(Lcom/google/android/gms/internal/ads/u0;Lcom/google/android/gms/internal/ads/Q0;)I

    move-result p1

    return p1
.end method

.method public final j(Lcom/google/android/gms/internal/ads/u0;)Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/J1;->a:Lcom/google/android/gms/internal/ads/t0;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/t0;->j(Lcom/google/android/gms/internal/ads/u0;)Z

    move-result p1

    return p1
.end method

.method public final k(Lcom/google/android/gms/internal/ads/w0;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/J1;->a:Lcom/google/android/gms/internal/ads/t0;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/t0;->k(Lcom/google/android/gms/internal/ads/w0;)V

    return-void
.end method
