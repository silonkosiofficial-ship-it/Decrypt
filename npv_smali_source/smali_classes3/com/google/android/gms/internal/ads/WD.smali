.class final Lcom/google/android/gms/internal/ads/WD;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final C:Ljava/lang/ref/WeakReference;


# direct methods
.method synthetic constructor <init>(Lcom/google/android/gms/internal/ads/ZD;Lcom/google/android/gms/internal/ads/YD;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p2, Ljava/lang/ref/WeakReference;

    invoke-direct {p2, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/WD;->C:Ljava/lang/ref/WeakReference;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/WD;->C:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/ZD;

    if-eqz v0, :cond_0

    new-instance v1, Lcom/google/android/gms/internal/ads/UD;

    invoke-direct {v1}, Lcom/google/android/gms/internal/ads/UD;-><init>()V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/BF;->p1(Lcom/google/android/gms/internal/ads/AF;)V

    :cond_0
    return-void
.end method
