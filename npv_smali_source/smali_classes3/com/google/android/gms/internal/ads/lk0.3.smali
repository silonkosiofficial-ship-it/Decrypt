.class public final synthetic Lcom/google/android/gms/internal/ads/lk0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic C:Lcom/google/android/gms/internal/ads/mk0;

.field public final synthetic D:Lcom/google/android/gms/internal/ads/Xh0;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/mk0;Lcom/google/android/gms/internal/ads/Xh0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/lk0;->C:Lcom/google/android/gms/internal/ads/mk0;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/lk0;->D:Lcom/google/android/gms/internal/ads/Xh0;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/lk0;->C:Lcom/google/android/gms/internal/ads/mk0;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/lk0;->D:Lcom/google/android/gms/internal/ads/Xh0;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/mk0;->V(Lcom/google/android/gms/internal/ads/Xh0;)V

    return-void
.end method
