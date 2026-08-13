.class public final Lcom/google/android/gms/internal/ads/YO;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/GO;


# instance fields
.field private final a:J

.field private final b:Lcom/google/android/gms/internal/ads/NO;

.field private final c:Lcom/google/android/gms/internal/ads/I60;


# direct methods
.method constructor <init>(JLandroid/content/Context;Lcom/google/android/gms/internal/ads/NO;Lcom/google/android/gms/internal/ads/Su;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/YO;->a:J

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/YO;->b:Lcom/google/android/gms/internal/ads/NO;

    invoke-virtual {p5}, Lcom/google/android/gms/internal/ads/Su;->C()Lcom/google/android/gms/internal/ads/K60;

    move-result-object p1

    invoke-interface {p1, p3}, Lcom/google/android/gms/internal/ads/K60;->a(Landroid/content/Context;)Lcom/google/android/gms/internal/ads/K60;

    invoke-interface {p1, p6}, Lcom/google/android/gms/internal/ads/K60;->o(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/K60;

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/K60;->c()Lcom/google/android/gms/internal/ads/L60;

    move-result-object p1

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/L60;->a()Lcom/google/android/gms/internal/ads/I60;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/YO;->c:Lcom/google/android/gms/internal/ads/I60;

    return-void
.end method

.method static bridge synthetic d(Lcom/google/android/gms/internal/ads/YO;)J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/YO;->a:J

    return-wide v0
.end method

.method static bridge synthetic e(Lcom/google/android/gms/internal/ads/YO;)Lcom/google/android/gms/internal/ads/NO;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/YO;->b:Lcom/google/android/gms/internal/ads/NO;

    return-object p0
.end method


# virtual methods
.method public final a()V
    .locals 0

    return-void
.end method

.method public final b(Ls3/X1;)V
    .locals 2

    .prologue
    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/YO;->c:Lcom/google/android/gms/internal/ads/I60;

    new-instance v1, Lcom/google/android/gms/internal/ads/WO;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/ads/WO;-><init>(Lcom/google/android/gms/internal/ads/YO;)V

    invoke-virtual {v0, p1, v1}, Lcom/google/android/gms/internal/ads/I60;->K4(Ls3/X1;Lcom/google/android/gms/internal/ads/Cp;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    const-string v0, "#007 Could not call remote method."

    invoke-static {v0, p1}, Lw3/p;->i(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final c()V
    .locals 2

    .prologue
    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/YO;->c:Lcom/google/android/gms/internal/ads/I60;

    new-instance v1, Lcom/google/android/gms/internal/ads/XO;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/ads/XO;-><init>(Lcom/google/android/gms/internal/ads/YO;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/I60;->d3(Lcom/google/android/gms/internal/ads/yp;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/YO;->c:Lcom/google/android/gms/internal/ads/I60;

    const/4 v1, 0x0

    invoke-static {v1}, LX3/b;->c2(Ljava/lang/Object;)LX3/a;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/I60;->S2(LX3/a;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    const-string v1, "#007 Could not call remote method."

    invoke-static {v1, v0}, Lw3/p;->i(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method
