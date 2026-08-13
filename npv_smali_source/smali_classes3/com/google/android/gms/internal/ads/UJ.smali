.class public final Lcom/google/android/gms/internal/ads/UJ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/az0;


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/rz0;

.field private final b:Lcom/google/android/gms/internal/ads/rz0;

.field private final c:Lcom/google/android/gms/internal/ads/rz0;

.field private final d:Lcom/google/android/gms/internal/ads/rz0;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/rz0;Lcom/google/android/gms/internal/ads/rz0;Lcom/google/android/gms/internal/ads/rz0;Lcom/google/android/gms/internal/ads/rz0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/UJ;->a:Lcom/google/android/gms/internal/ads/rz0;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/UJ;->b:Lcom/google/android/gms/internal/ads/rz0;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/UJ;->c:Lcom/google/android/gms/internal/ads/rz0;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/UJ;->d:Lcom/google/android/gms/internal/ads/rz0;

    return-void
.end method


# virtual methods
.method public final bridge synthetic b()Ljava/lang/Object;
    .locals 5

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/UJ;->a:Lcom/google/android/gms/internal/ads/rz0;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/rz0;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/BM;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/UJ;->b:Lcom/google/android/gms/internal/ads/rz0;

    check-cast v1, Lcom/google/android/gms/internal/ads/GI;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/GI;->a()Lcom/google/android/gms/internal/ads/PL;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/UJ;->c:Lcom/google/android/gms/internal/ads/rz0;

    invoke-interface {v2}, Lcom/google/android/gms/internal/ads/rz0;->b()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/ads/uy;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/UJ;->d:Lcom/google/android/gms/internal/ads/rz0;

    check-cast v3, Lcom/google/android/gms/internal/ads/FI;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/FI;->a()Lcom/google/android/gms/internal/ads/mJ;

    move-result-object v3

    new-instance v4, Lcom/google/android/gms/internal/ads/TJ;

    invoke-direct {v4, v0, v1, v2, v3}, Lcom/google/android/gms/internal/ads/TJ;-><init>(Lcom/google/android/gms/internal/ads/BM;Lcom/google/android/gms/internal/ads/PL;Lcom/google/android/gms/internal/ads/uy;Lcom/google/android/gms/internal/ads/mJ;)V

    return-object v4
.end method
