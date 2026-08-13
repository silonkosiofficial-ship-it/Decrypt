.class public final Lcom/google/android/gms/internal/ads/lX;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lj$/util/concurrent/ConcurrentHashMap;

.field private final b:Lcom/google/android/gms/internal/ads/SM;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/SM;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lj$/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Lj$/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/lX;->a:Lj$/util/concurrent/ConcurrentHashMap;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/lX;->b:Lcom/google/android/gms/internal/ads/SM;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/Tm;
    .locals 1

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/lX;->a:Lj$/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p1}, Lj$/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/lX;->a:Lj$/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p1}, Lj$/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/ads/Tm;

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final b(Ljava/lang/String;)V
    .locals 2

    .prologue
    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/lX;->b:Lcom/google/android/gms/internal/ads/SM;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/SM;->b(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/Tm;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/lX;->a:Lj$/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v1, p1, v0}, Lj$/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    const-string v0, "Couldn\'t create RTB adapter : "

    invoke-static {v0, p1}, Lv3/q0;->l(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method
