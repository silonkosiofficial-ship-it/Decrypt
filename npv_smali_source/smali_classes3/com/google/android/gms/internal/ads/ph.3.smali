.class public final Lcom/google/android/gms/internal/ads/ph;
.super Ln3/d;
.source "SourceFile"


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/oh;

.field private final b:Landroid/graphics/drawable/Drawable;

.field private final c:Landroid/net/Uri;

.field private final d:D

.field private final e:I

.field private final f:I


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/oh;)V
    .locals 3

    .prologue
    const-string v0, ""

    invoke-direct {p0}, Ln3/d;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/ph;->a:Lcom/google/android/gms/internal/ads/oh;

    const/4 v1, 0x0

    :try_start_0
    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/oh;->e()LX3/a;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-static {p1}, LX3/b;->L0(LX3/a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/graphics/drawable/Drawable;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    move-object p1, v1

    goto :goto_2

    :goto_1
    invoke-static {v0, p1}, Lw3/p;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    :goto_2
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/ph;->b:Landroid/graphics/drawable/Drawable;

    :try_start_1
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/ph;->a:Lcom/google/android/gms/internal/ads/oh;

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/oh;->d()Landroid/net/Uri;

    move-result-object v1
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_3

    :catch_1
    move-exception p1

    invoke-static {v0, p1}, Lw3/p;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_3
    iput-object v1, p0, Lcom/google/android/gms/internal/ads/ph;->c:Landroid/net/Uri;

    :try_start_2
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/ph;->a:Lcom/google/android/gms/internal/ads/oh;

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/oh;->b()D

    move-result-wide v1
    :try_end_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_4

    :catch_2
    move-exception p1

    invoke-static {v0, p1}, Lw3/p;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    const-wide/high16 v1, 0x3ff0000000000000L    # 1.0

    :goto_4
    iput-wide v1, p0, Lcom/google/android/gms/internal/ads/ph;->d:D

    const/4 p1, -0x1

    :try_start_3
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/ph;->a:Lcom/google/android/gms/internal/ads/oh;

    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/oh;->f()I

    move-result v1
    :try_end_3
    .catch Landroid/os/RemoteException; {:try_start_3 .. :try_end_3} :catch_3

    goto :goto_5

    :catch_3
    move-exception v1

    invoke-static {v0, v1}, Lw3/p;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    move v1, p1

    :goto_5
    iput v1, p0, Lcom/google/android/gms/internal/ads/ph;->e:I

    :try_start_4
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/ph;->a:Lcom/google/android/gms/internal/ads/oh;

    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/oh;->c()I

    move-result p1
    :try_end_4
    .catch Landroid/os/RemoteException; {:try_start_4 .. :try_end_4} :catch_4

    goto :goto_6

    :catch_4
    move-exception v1

    invoke-static {v0, v1}, Lw3/p;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_6
    iput p1, p0, Lcom/google/android/gms/internal/ads/ph;->f:I

    return-void
.end method


# virtual methods
.method public final a()Landroid/graphics/drawable/Drawable;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ph;->b:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public final b()D
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/ph;->d:D

    return-wide v0
.end method

.method public final c()Landroid/net/Uri;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ph;->c:Landroid/net/Uri;

    return-object v0
.end method

.method public final d()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/ph;->f:I

    return v0
.end method

.method public final e()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/ph;->e:I

    return v0
.end method
