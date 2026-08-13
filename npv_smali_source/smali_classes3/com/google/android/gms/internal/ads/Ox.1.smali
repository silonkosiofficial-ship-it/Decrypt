.class public final Lcom/google/android/gms/internal/ads/Ox;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/az0;


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/rz0;

.field private final b:Lcom/google/android/gms/internal/ads/rz0;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/rz0;Lcom/google/android/gms/internal/ads/rz0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/Ox;->a:Lcom/google/android/gms/internal/ads/rz0;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/Ox;->b:Lcom/google/android/gms/internal/ads/rz0;

    return-void
.end method


# virtual methods
.method public final bridge synthetic b()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Ox;->a:Lcom/google/android/gms/internal/ads/rz0;

    check-cast v0, Lcom/google/android/gms/internal/ads/xA;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/xA;->a()Lcom/google/android/gms/internal/ads/R60;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/Ox;->b:Lcom/google/android/gms/internal/ads/rz0;

    check-cast v1, Lcom/google/android/gms/internal/ads/rv;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/rv;->a()Lcom/google/android/gms/internal/ads/Xq;

    move-result-object v1

    new-instance v2, Lcom/google/android/gms/internal/ads/Nx;

    invoke-direct {v2, v0, v1}, Lcom/google/android/gms/internal/ads/Nx;-><init>(Lcom/google/android/gms/internal/ads/R60;Lcom/google/android/gms/internal/ads/Xq;)V

    return-object v2
.end method
