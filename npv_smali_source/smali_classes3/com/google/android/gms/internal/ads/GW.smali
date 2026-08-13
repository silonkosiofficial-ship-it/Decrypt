.class public final Lcom/google/android/gms/internal/ads/GW;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/XT;


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/lX;

.field private final b:Lcom/google/android/gms/internal/ads/SM;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/lX;Lcom/google/android/gms/internal/ads/SM;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/GW;->a:Lcom/google/android/gms/internal/ads/lX;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/GW;->b:Lcom/google/android/gms/internal/ads/SM;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Lorg/json/JSONObject;)Lcom/google/android/gms/internal/ads/YT;
    .locals 2

    .prologue
    sget-object p2, Lcom/google/android/gms/internal/ads/Af;->M1:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    const/4 v0, 0x0

    if-eqz p2, :cond_0

    :try_start_0
    iget-object p2, p0, Lcom/google/android/gms/internal/ads/GW;->b:Lcom/google/android/gms/internal/ads/SM;

    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/ads/SM;->b(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/Tm;

    move-result-object p2
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p2

    const-string v1, "Coundn\'t create RTB adapter: "

    invoke-static {v1, p2}, Lw3/p;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    move-object p2, v0

    goto :goto_0

    :cond_0
    iget-object p2, p0, Lcom/google/android/gms/internal/ads/GW;->a:Lcom/google/android/gms/internal/ads/lX;

    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/ads/lX;->a(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/Tm;

    move-result-object p2

    :goto_0
    if-nez p2, :cond_1

    return-object v0

    :cond_1
    new-instance v0, Lcom/google/android/gms/internal/ads/TU;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/TU;-><init>()V

    new-instance v1, Lcom/google/android/gms/internal/ads/YT;

    invoke-direct {v1, p2, v0, p1}, Lcom/google/android/gms/internal/ads/YT;-><init>(Ljava/lang/Object;Lcom/google/android/gms/internal/ads/qD;Ljava/lang/String;)V

    return-object v1
.end method
