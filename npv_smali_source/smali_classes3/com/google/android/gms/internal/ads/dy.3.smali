.class public final synthetic Lcom/google/android/gms/internal/ads/dy;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic C:Lcom/google/android/gms/internal/ads/ey;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/ey;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/dy;->C:Lcom/google/android/gms/internal/ads/ey;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/dy;->C:Lcom/google/android/gms/internal/ads/ey;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/ey;->a:Lcom/google/android/gms/internal/ads/fy;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/fy;->a(Lcom/google/android/gms/internal/ads/fy;)Lcom/google/android/gms/internal/ads/ky;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ky;->d()V

    return-void
.end method
