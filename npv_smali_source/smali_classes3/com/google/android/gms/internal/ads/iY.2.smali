.class public final Lcom/google/android/gms/internal/ads/iY;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/pJ;

.field private final b:Lcom/google/android/gms/internal/ads/UX;

.field private final c:Lcom/google/android/gms/internal/ads/HC;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/pJ;Lcom/google/android/gms/internal/ads/eO;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/iY;->a:Lcom/google/android/gms/internal/ads/pJ;

    new-instance v0, Lcom/google/android/gms/internal/ads/UX;

    invoke-direct {v0, p2}, Lcom/google/android/gms/internal/ads/UX;-><init>(Lcom/google/android/gms/internal/ads/eO;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/iY;->b:Lcom/google/android/gms/internal/ads/UX;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/pJ;->g()Lcom/google/android/gms/internal/ads/wk;

    move-result-object p1

    new-instance p2, Lcom/google/android/gms/internal/ads/gY;

    invoke-direct {p2, v0, p1}, Lcom/google/android/gms/internal/ads/gY;-><init>(Lcom/google/android/gms/internal/ads/UX;Lcom/google/android/gms/internal/ads/wk;)V

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/iY;->c:Lcom/google/android/gms/internal/ads/HC;

    return-void
.end method


# virtual methods
.method public final a()Lcom/google/android/gms/internal/ads/HC;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/iY;->c:Lcom/google/android/gms/internal/ads/HC;

    return-object v0
.end method

.method public final b()Lcom/google/android/gms/internal/ads/uD;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/iY;->b:Lcom/google/android/gms/internal/ads/UX;

    return-object v0
.end method

.method public final c()Lcom/google/android/gms/internal/ads/iI;
    .locals 3

    new-instance v0, Lcom/google/android/gms/internal/ads/iI;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/iY;->b:Lcom/google/android/gms/internal/ads/UX;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/iY;->a:Lcom/google/android/gms/internal/ads/pJ;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/UX;->g()Ls3/H;

    move-result-object v1

    invoke-direct {v0, v2, v1}, Lcom/google/android/gms/internal/ads/iI;-><init>(Lcom/google/android/gms/internal/ads/pJ;Ls3/H;)V

    return-object v0
.end method

.method public final d()Lcom/google/android/gms/internal/ads/UX;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/iY;->b:Lcom/google/android/gms/internal/ads/UX;

    return-object v0
.end method

.method public final e(Ls3/H;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/iY;->b:Lcom/google/android/gms/internal/ads/UX;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/UX;->k(Ls3/H;)V

    return-void
.end method
