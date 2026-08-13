.class public final synthetic Lcom/google/android/gms/internal/ads/pY;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic C:Lcom/google/android/gms/internal/ads/rY;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/rY;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/pY;->C:Lcom/google/android/gms/internal/ads/rY;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/pY;->C:Lcom/google/android/gms/internal/ads/rY;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/rY;->e:Lcom/google/android/gms/internal/ads/sY;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/sY;->d(Lcom/google/android/gms/internal/ads/sY;)Lcom/google/android/gms/internal/ads/iY;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/iY;->b()Lcom/google/android/gms/internal/ads/uD;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/uD;->u()V

    return-void
.end method
