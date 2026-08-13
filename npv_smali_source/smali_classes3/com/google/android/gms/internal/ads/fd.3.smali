.class public final synthetic Lcom/google/android/gms/internal/ads/fd;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic C:Lcom/google/android/gms/internal/ads/id;

.field public final synthetic D:Lcom/google/android/gms/internal/ads/Yc;

.field public final synthetic E:Lcom/google/android/gms/internal/ads/Zc;

.field public final synthetic F:Lcom/google/android/gms/internal/ads/mr;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/id;Lcom/google/android/gms/internal/ads/Yc;Lcom/google/android/gms/internal/ads/Zc;Lcom/google/android/gms/internal/ads/mr;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/fd;->C:Lcom/google/android/gms/internal/ads/id;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/fd;->D:Lcom/google/android/gms/internal/ads/Yc;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/fd;->E:Lcom/google/android/gms/internal/ads/Zc;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/fd;->F:Lcom/google/android/gms/internal/ads/mr;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 9

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/fd;->C:Lcom/google/android/gms/internal/ads/id;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/fd;->D:Lcom/google/android/gms/internal/ads/Yc;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/fd;->F:Lcom/google/android/gms/internal/ads/mr;

    :try_start_0
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/Yc;->k0()Lcom/google/android/gms/internal/ads/bd;

    move-result-object v3

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/Yc;->j0()Z

    move-result v1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/fd;->E:Lcom/google/android/gms/internal/ads/Zc;

    if-eqz v1, :cond_0

    :try_start_1
    invoke-virtual {v3, v4}, Lcom/google/android/gms/internal/ads/bd;->f3(Lcom/google/android/gms/internal/ads/Zc;)Lcom/google/android/gms/internal/ads/Wc;

    move-result-object v1

    goto :goto_0

    :catch_0
    move-exception v1

    goto :goto_1

    :catch_1
    move-exception v1

    goto :goto_1

    :cond_0
    invoke-virtual {v3, v4}, Lcom/google/android/gms/internal/ads/bd;->T2(Lcom/google/android/gms/internal/ads/Zc;)Lcom/google/android/gms/internal/ads/Wc;

    move-result-object v1

    :goto_0
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/Wc;->C()Z

    move-result v3

    if-nez v3, :cond_1

    new-instance v1, Ljava/lang/RuntimeException;

    const-string v3, "No entry contents."

    invoke-direct {v1, v3}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/mr;->d(Ljava/lang/Throwable;)Z

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/id;->c:Lcom/google/android/gms/internal/ads/kd;

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/kd;->e(Lcom/google/android/gms/internal/ads/kd;)V

    return-void

    :cond_1
    new-instance v3, Lcom/google/android/gms/internal/ads/hd;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/Wc;->s()Ljava/io/InputStream;

    move-result-object v4

    const/4 v5, 0x1

    invoke-direct {v3, v0, v4, v5}, Lcom/google/android/gms/internal/ads/hd;-><init>(Lcom/google/android/gms/internal/ads/id;Ljava/io/InputStream;I)V

    invoke-virtual {v3}, Ljava/io/PushbackInputStream;->read()I

    move-result v4

    const/4 v5, -0x1

    if-eq v4, v5, :cond_2

    invoke-virtual {v3, v4}, Ljava/io/PushbackInputStream;->unread(I)V

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/Wc;->w()Z

    move-result v4

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/Wc;->E()Z

    move-result v5

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/Wc;->e()J

    move-result-wide v6

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/Wc;->D()Z

    move-result v8

    invoke-static/range {v3 .. v8}, Lcom/google/android/gms/internal/ads/md;->b(Ljava/io/InputStream;ZZJZ)Lcom/google/android/gms/internal/ads/md;

    move-result-object v1

    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/mr;->c(Ljava/lang/Object;)Z

    return-void

    :cond_2
    new-instance v1, Ljava/io/IOException;

    const-string v3, "Unable to read from cache."

    invoke-direct {v1, v3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0

    :goto_1
    const-string v3, "Unable to obtain a cache service instance."

    invoke-static {v3, v1}, Lw3/p;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/mr;->d(Ljava/lang/Throwable;)Z

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/id;->c:Lcom/google/android/gms/internal/ads/kd;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/kd;->e(Lcom/google/android/gms/internal/ads/kd;)V

    return-void
.end method
