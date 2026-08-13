.class final Lcom/google/android/gms/internal/ads/aS;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/Jk0;


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/ads/yo;

.field final synthetic b:Lcom/google/android/gms/internal/ads/Io;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/gS;Lcom/google/android/gms/internal/ads/Io;Lcom/google/android/gms/internal/ads/yo;)V
    .locals 0

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/aS;->b:Lcom/google/android/gms/internal/ads/Io;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/aS;->a:Lcom/google/android/gms/internal/ads/yo;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)V
    .locals 1

    .prologue
    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aS;->b:Lcom/google/android/gms/internal/ads/Io;

    invoke-static {p1}, Lv3/D;->f(Ljava/lang/Throwable;)Lv3/D;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/Io;->C3(Lv3/D;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    const-string v0, "Service can\'t call client"

    invoke-static {v0, p1}, Lv3/q0;->l(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final bridge synthetic c(Ljava/lang/Object;)V
    .locals 2

    .prologue
    check-cast p1, Ljava/lang/String;

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aS;->b:Lcom/google/android/gms/internal/ads/Io;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/aS;->a:Lcom/google/android/gms/internal/ads/yo;

    invoke-virtual {v0, p1, v1}, Lcom/google/android/gms/internal/ads/Io;->d2(Ljava/lang/String;Lcom/google/android/gms/internal/ads/yo;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    const-string v0, "Service can\'t call client"

    invoke-static {v0, p1}, Lv3/q0;->l(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method
