.class public final Lcom/google/android/gms/internal/ads/cZ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/az0;


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/rz0;

.field private final b:Lcom/google/android/gms/internal/ads/rz0;

.field private final c:Lcom/google/android/gms/internal/ads/rz0;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/rz0;Lcom/google/android/gms/internal/ads/rz0;Lcom/google/android/gms/internal/ads/rz0;Lcom/google/android/gms/internal/ads/rz0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/cZ;->a:Lcom/google/android/gms/internal/ads/rz0;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/cZ;->b:Lcom/google/android/gms/internal/ads/rz0;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/cZ;->c:Lcom/google/android/gms/internal/ads/rz0;

    return-void
.end method


# virtual methods
.method public final a()Lcom/google/android/gms/internal/ads/XY;
    .locals 5

    invoke-static {}, Lcom/google/android/gms/internal/ads/O80;->c()Lcom/google/android/gms/internal/ads/Yk0;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/cZ;->a:Lcom/google/android/gms/internal/ads/rz0;

    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/rz0;->b()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/ads/SM;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/cZ;->b:Lcom/google/android/gms/internal/ads/rz0;

    invoke-interface {v2}, Lcom/google/android/gms/internal/ads/rz0;->b()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/ads/pP;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/cZ;->c:Lcom/google/android/gms/internal/ads/rz0;

    invoke-interface {v3}, Lcom/google/android/gms/internal/ads/rz0;->b()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/internal/ads/ZY;

    new-instance v4, Lcom/google/android/gms/internal/ads/XY;

    invoke-direct {v4, v0, v1, v2, v3}, Lcom/google/android/gms/internal/ads/XY;-><init>(Lcom/google/android/gms/internal/ads/Yk0;Lcom/google/android/gms/internal/ads/SM;Lcom/google/android/gms/internal/ads/pP;Lcom/google/android/gms/internal/ads/ZY;)V

    return-object v4
.end method

.method public final bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/cZ;->a()Lcom/google/android/gms/internal/ads/XY;

    move-result-object v0

    return-object v0
.end method
