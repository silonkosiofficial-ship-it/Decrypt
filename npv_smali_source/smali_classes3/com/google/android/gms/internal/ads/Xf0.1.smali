.class final Lcom/google/android/gms/internal/ads/Xf0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/ServiceConnection;


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/ads/Zf0;


# direct methods
.method synthetic constructor <init>(Lcom/google/android/gms/internal/ads/Zf0;Lcom/google/android/gms/internal/ads/Yf0;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/Xf0;->a:Lcom/google/android/gms/internal/ads/Zf0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Xf0;->a:Lcom/google/android/gms/internal/ads/Zf0;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/Zf0;->d(Lcom/google/android/gms/internal/ads/Zf0;)Lcom/google/android/gms/internal/ads/ag0;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const-string p1, "LmdServiceConnectionManager.onServiceConnected(%s)"

    invoke-virtual {v0, p1, v1}, Lcom/google/android/gms/internal/ads/ag0;->c(Ljava/lang/String;[Ljava/lang/Object;)I

    new-instance p1, Lcom/google/android/gms/internal/ads/Vf0;

    invoke-direct {p1, p0, p2}, Lcom/google/android/gms/internal/ads/Vf0;-><init>(Lcom/google/android/gms/internal/ads/Xf0;Landroid/os/IBinder;)V

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/Xf0;->a:Lcom/google/android/gms/internal/ads/Zf0;

    invoke-static {p2, p1}, Lcom/google/android/gms/internal/ads/Zf0;->h(Lcom/google/android/gms/internal/ads/Zf0;Ljava/lang/Runnable;)V

    return-void
.end method

.method public final onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Xf0;->a:Lcom/google/android/gms/internal/ads/Zf0;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/Zf0;->d(Lcom/google/android/gms/internal/ads/Zf0;)Lcom/google/android/gms/internal/ads/ag0;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const-string p1, "LmdServiceConnectionManager.onServiceDisconnected(%s)"

    invoke-virtual {v0, p1, v1}, Lcom/google/android/gms/internal/ads/ag0;->c(Ljava/lang/String;[Ljava/lang/Object;)I

    new-instance p1, Lcom/google/android/gms/internal/ads/Wf0;

    invoke-direct {p1, p0}, Lcom/google/android/gms/internal/ads/Wf0;-><init>(Lcom/google/android/gms/internal/ads/Xf0;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Xf0;->a:Lcom/google/android/gms/internal/ads/Zf0;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/ads/Zf0;->h(Lcom/google/android/gms/internal/ads/Zf0;Ljava/lang/Runnable;)V

    return-void
.end method
