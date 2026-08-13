.class public final Lcom/google/android/gms/internal/ads/UA;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/az0;


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/rz0;

.field private final b:Lcom/google/android/gms/internal/ads/rz0;

.field private final c:Lcom/google/android/gms/internal/ads/rz0;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/rz0;Lcom/google/android/gms/internal/ads/rz0;Lcom/google/android/gms/internal/ads/rz0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/UA;->a:Lcom/google/android/gms/internal/ads/rz0;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/UA;->b:Lcom/google/android/gms/internal/ads/rz0;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/UA;->c:Lcom/google/android/gms/internal/ads/rz0;

    return-void
.end method


# virtual methods
.method public final bridge synthetic b()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/UA;->a:Lcom/google/android/gms/internal/ads/rz0;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/rz0;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LV3/f;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/UA;->b:Lcom/google/android/gms/internal/ads/rz0;

    check-cast v1, Lcom/google/android/gms/internal/ads/rv;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/rv;->a()Lcom/google/android/gms/internal/ads/Xq;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/UA;->c:Lcom/google/android/gms/internal/ads/rz0;

    check-cast v2, Lcom/google/android/gms/internal/ads/vC;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/vC;->a()Lcom/google/android/gms/internal/ads/n70;

    move-result-object v2

    iget-object v2, v2, Lcom/google/android/gms/internal/ads/n70;->f:Ljava/lang/String;

    invoke-virtual {v1, v0, v2}, Lcom/google/android/gms/internal/ads/Xq;->c(LV3/f;Ljava/lang/String;)Lcom/google/android/gms/internal/ads/Nq;

    move-result-object v0

    return-object v0
.end method
