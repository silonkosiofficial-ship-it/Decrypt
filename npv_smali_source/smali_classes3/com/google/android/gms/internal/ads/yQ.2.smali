.class public final Lcom/google/android/gms/internal/ads/yQ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/az0;


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/rz0;

.field private final b:Lcom/google/android/gms/internal/ads/rz0;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/rz0;Lcom/google/android/gms/internal/ads/rz0;Lcom/google/android/gms/internal/ads/rz0;Lcom/google/android/gms/internal/ads/rz0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/yQ;->a:Lcom/google/android/gms/internal/ads/rz0;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/yQ;->b:Lcom/google/android/gms/internal/ads/rz0;

    return-void
.end method


# virtual methods
.method public final a()Lcom/google/android/gms/internal/ads/xQ;
    .locals 5

    invoke-static {}, Lcom/google/android/gms/internal/ads/U80;->c()Lcom/google/android/gms/internal/ads/Yk0;

    move-result-object v0

    invoke-static {}, Lcom/google/android/gms/internal/ads/O80;->c()Lcom/google/android/gms/internal/ads/Yk0;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/yQ;->a:Lcom/google/android/gms/internal/ads/rz0;

    check-cast v2, Lcom/google/android/gms/internal/ads/KQ;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/KQ;->a()Lcom/google/android/gms/internal/ads/gR;

    move-result-object v2

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/yQ;->b:Lcom/google/android/gms/internal/ads/rz0;

    invoke-static {v3}, Lcom/google/android/gms/internal/ads/mz0;->a(Lcom/google/android/gms/internal/ads/rz0;)Lcom/google/android/gms/internal/ads/kz0;

    move-result-object v3

    invoke-static {v3}, Lcom/google/android/gms/internal/ads/Zy0;->a(Lcom/google/android/gms/internal/ads/kz0;)Lcom/google/android/gms/internal/ads/Uy0;

    move-result-object v3

    new-instance v4, Lcom/google/android/gms/internal/ads/xQ;

    invoke-direct {v4, v0, v1, v2, v3}, Lcom/google/android/gms/internal/ads/xQ;-><init>(Lcom/google/android/gms/internal/ads/Yk0;Lcom/google/android/gms/internal/ads/Yk0;Lcom/google/android/gms/internal/ads/gR;Lcom/google/android/gms/internal/ads/Uy0;)V

    return-object v4
.end method

.method public final bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/yQ;->a()Lcom/google/android/gms/internal/ads/xQ;

    move-result-object v0

    return-object v0
.end method
