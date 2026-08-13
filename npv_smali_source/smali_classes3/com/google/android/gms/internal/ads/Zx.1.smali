.class public final synthetic Lcom/google/android/gms/internal/ads/Zx;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic C:Lcom/google/android/gms/internal/ads/ay;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/ay;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/Zx;->C:Lcom/google/android/gms/internal/ads/ay;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Zx;->C:Lcom/google/android/gms/internal/ads/ay;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/ay;->a:Lcom/google/android/gms/internal/ads/fy;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/fy;->a(Lcom/google/android/gms/internal/ads/fy;)Lcom/google/android/gms/internal/ads/ky;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ky;->a()V

    return-void
.end method
