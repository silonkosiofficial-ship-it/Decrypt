.class final Lcom/google/android/gms/internal/ads/XS;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/WH;


# instance fields
.field private a:Landroid/os/Message;


# direct methods
.method synthetic constructor <init>(Lcom/google/android/gms/internal/ads/yT;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/XS;->a:Landroid/os/Message;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/XS;->a:Landroid/os/Message;

    invoke-static {p0}, Lcom/google/android/gms/internal/ads/ZT;->b(Lcom/google/android/gms/internal/ads/XS;)V

    return-void
.end method

.method public final b(Landroid/os/Message;Lcom/google/android/gms/internal/ads/ZT;)Lcom/google/android/gms/internal/ads/XS;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/XS;->a:Landroid/os/Message;

    return-object p0
.end method

.method public final c(Landroid/os/Handler;)Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/XS;->a:Landroid/os/Message;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1, v0}, Landroid/os/Handler;->sendMessageAtFrontOfQueue(Landroid/os/Message;)Z

    move-result p1

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/XS;->a:Landroid/os/Message;

    invoke-static {p0}, Lcom/google/android/gms/internal/ads/ZT;->b(Lcom/google/android/gms/internal/ads/XS;)V

    return p1
.end method
