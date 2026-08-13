.class public final Lcom/google/android/gms/internal/ads/Nx;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/EC;


# instance fields
.field private final C:Lcom/google/android/gms/internal/ads/R60;

.field private final D:Lcom/google/android/gms/internal/ads/Xq;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/R60;Lcom/google/android/gms/internal/ads/Xq;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/Nx;->C:Lcom/google/android/gms/internal/ads/R60;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/Nx;->D:Lcom/google/android/gms/internal/ads/Xq;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Nx;->C:Lcom/google/android/gms/internal/ads/R60;

    iget-boolean v0, v0, Lcom/google/android/gms/internal/ads/R60;->r0:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Nx;->D:Lcom/google/android/gms/internal/ads/Xq;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/Xq;->k()V

    :cond_0
    return-void
.end method

.method public final b()V
    .locals 0

    return-void
.end method

.method public final c()V
    .locals 0

    return-void
.end method

.method public final d()V
    .locals 0

    return-void
.end method

.method public final e()V
    .locals 0

    return-void
.end method

.method public final q(Lcom/google/android/gms/internal/ads/bp;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    return-void
.end method
