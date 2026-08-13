.class public final synthetic Lcom/google/android/gms/internal/ads/Wf0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic C:Lcom/google/android/gms/internal/ads/Xf0;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/Xf0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/Wf0;->C:Lcom/google/android/gms/internal/ads/Xf0;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Wf0;->C:Lcom/google/android/gms/internal/ads/Xf0;

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/Xf0;->a:Lcom/google/android/gms/internal/ads/Zf0;

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/Zf0;->d(Lcom/google/android/gms/internal/ads/Zf0;)Lcom/google/android/gms/internal/ads/ag0;

    move-result-object v1

    const/4 v2, 0x0

    new-array v3, v2, [Ljava/lang/Object;

    const-string v4, "unlinkToDeath"

    invoke-virtual {v1, v4, v3}, Lcom/google/android/gms/internal/ads/ag0;->c(Ljava/lang/String;[Ljava/lang/Object;)I

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/Xf0;->a:Lcom/google/android/gms/internal/ads/Zf0;

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/Zf0;->b(Lcom/google/android/gms/internal/ads/Zf0;)Landroid/os/IInterface;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    check-cast v1, Landroid/os/IInterface;

    invoke-interface {v1}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    move-result-object v1

    iget-object v3, v0, Lcom/google/android/gms/internal/ads/Xf0;->a:Lcom/google/android/gms/internal/ads/Zf0;

    invoke-static {v3}, Lcom/google/android/gms/internal/ads/Zf0;->a(Lcom/google/android/gms/internal/ads/Zf0;)Landroid/os/IBinder$DeathRecipient;

    move-result-object v3

    invoke-interface {v1, v3, v2}, Landroid/os/IBinder;->unlinkToDeath(Landroid/os/IBinder$DeathRecipient;I)Z

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/Xf0;->a:Lcom/google/android/gms/internal/ads/Zf0;

    const/4 v3, 0x0

    invoke-static {v1, v3}, Lcom/google/android/gms/internal/ads/Zf0;->g(Lcom/google/android/gms/internal/ads/Zf0;Landroid/os/IInterface;)V

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/Xf0;->a:Lcom/google/android/gms/internal/ads/Zf0;

    invoke-static {v0, v2}, Lcom/google/android/gms/internal/ads/Zf0;->f(Lcom/google/android/gms/internal/ads/Zf0;Z)V

    return-void
.end method
