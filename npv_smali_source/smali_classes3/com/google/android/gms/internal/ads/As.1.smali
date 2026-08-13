.class public final Lcom/google/android/gms/internal/ads/As;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/pi0;


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Lcom/google/android/gms/internal/ads/pi0;

.field private final c:Ljava/lang/String;

.field private final d:I

.field private final e:Z

.field private f:Ljava/io/InputStream;

.field private g:Z

.field private h:Landroid/net/Uri;

.field private volatile i:Lcom/google/android/gms/internal/ads/Zc;

.field private j:Z

.field private k:Z

.field private l:Lcom/google/android/gms/internal/ads/gl0;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/pi0;Ljava/lang/String;ILcom/google/android/gms/internal/ads/Pv0;Lcom/google/android/gms/internal/ads/zs;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/As;->a:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/As;->b:Lcom/google/android/gms/internal/ads/pi0;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/As;->c:Ljava/lang/String;

    iput p4, p0, Lcom/google/android/gms/internal/ads/As;->d:I

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/As;->j:Z

    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/As;->k:Z

    new-instance p1, Ljava/util/concurrent/atomic/AtomicLong;

    const-wide/16 p2, -0x1

    invoke-direct {p1, p2, p3}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    sget-object p1, Lcom/google/android/gms/internal/ads/Af;->Y1:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object p2

    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/As;->e:Z

    return-void
.end method

.method private final g()Z
    .locals 4

    .prologue
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/As;->e:Z

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    sget-object v0, Lcom/google/android/gms/internal/ads/Af;->t4:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v2

    invoke-virtual {v2, v0}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    const/4 v2, 0x1

    if-eqz v0, :cond_2

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/As;->j:Z

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    return v2

    :cond_2
    :goto_0
    sget-object v0, Lcom/google/android/gms/internal/ads/Af;->u4:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v3

    invoke-virtual {v3, v0}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_3

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/As;->k:Z

    if-nez v0, :cond_3

    return v2

    :cond_3
    return v1
.end method


# virtual methods
.method public final H([BII)I
    .locals 1

    .prologue
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/As;->g:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/As;->f:Ljava/io/InputStream;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2, p3}, Ljava/io/InputStream;->read([BII)I

    move-result p1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/As;->b:Lcom/google/android/gms/internal/ads/pi0;

    invoke-interface {v0, p1, p2, p3}, Lcom/google/android/gms/internal/ads/qB0;->H([BII)I

    move-result p1

    :goto_0
    return p1

    :cond_1
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Attempt to read closed CacheDataSource."

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final a(Lcom/google/android/gms/internal/ads/gl0;)J
    .locals 5

    .prologue
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/As;->g:Z

    if-nez v0, :cond_6

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/As;->g:Z

    iget-object v0, p1, Lcom/google/android/gms/internal/ads/gl0;->a:Landroid/net/Uri;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/As;->h:Landroid/net/Uri;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/As;->l:Lcom/google/android/gms/internal/ads/gl0;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/Zc;->e(Landroid/net/Uri;)Lcom/google/android/gms/internal/ads/Zc;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/As;->i:Lcom/google/android/gms/internal/ads/Zc;

    sget-object v0, Lcom/google/android/gms/internal/ads/Af;->q4:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/As;->i:Lcom/google/android/gms/internal/ads/Zc;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/As;->i:Lcom/google/android/gms/internal/ads/Zc;

    iget-wide v2, p1, Lcom/google/android/gms/internal/ads/gl0;->e:J

    iput-wide v2, v0, Lcom/google/android/gms/internal/ads/Zc;->J:J

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/As;->i:Lcom/google/android/gms/internal/ads/Zc;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/As;->c:Ljava/lang/String;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/Sg0;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p1, Lcom/google/android/gms/internal/ads/Zc;->K:Ljava/lang/String;

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/As;->i:Lcom/google/android/gms/internal/ads/Zc;

    iget v0, p0, Lcom/google/android/gms/internal/ads/As;->d:I

    iput v0, p1, Lcom/google/android/gms/internal/ads/Zc;->L:I

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/As;->i:Lcom/google/android/gms/internal/ads/Zc;

    iget-boolean p1, p1, Lcom/google/android/gms/internal/ads/Zc;->I:Z

    if-eqz p1, :cond_0

    sget-object p1, Lcom/google/android/gms/internal/ads/Af;->s4:Lcom/google/android/gms/internal/ads/rf;

    :goto_0
    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Long;

    goto :goto_1

    :cond_0
    sget-object p1, Lcom/google/android/gms/internal/ads/Af;->r4:Lcom/google/android/gms/internal/ads/rf;

    goto :goto_0

    :goto_1
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-static {}, Lr3/v;->c()LV3/f;

    move-result-object p1

    invoke-interface {p1}, LV3/f;->c()J

    invoke-static {}, Lr3/v;->g()Lcom/google/android/gms/internal/ads/ld;

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/As;->a:Landroid/content/Context;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/As;->i:Lcom/google/android/gms/internal/ads/Zc;

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/ads/ld;->a(Landroid/content/Context;Lcom/google/android/gms/internal/ads/Zc;)Ljava/util/concurrent/Future;

    move-result-object p1

    const/4 v0, 0x0

    :try_start_0
    sget-object v4, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {p1, v2, v3, v4}, Ljava/util/concurrent/Future;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/ads/md;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/md;->d()Z

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/md;->f()Z

    move-result v3

    iput-boolean v3, p0, Lcom/google/android/gms/internal/ads/As;->j:Z

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/md;->e()Z

    move-result v3

    iput-boolean v3, p0, Lcom/google/android/gms/internal/ads/As;->k:Z

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/md;->a()J

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/As;->g()Z

    move-result v3

    if-nez v3, :cond_1

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/md;->c()Ljava/io/InputStream;

    move-result-object v2

    iput-object v2, p0, Lcom/google/android/gms/internal/ads/As;->f:Ljava/io/InputStream;
    :try_end_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catch_0
    :try_start_1
    invoke-interface {p1, v0}, Ljava/util/concurrent/Future;->cancel(Z)Z

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Thread;->interrupt()V

    goto :goto_2

    :catch_1
    invoke-interface {p1, v0}, Ljava/util/concurrent/Future;->cancel(Z)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    :cond_1
    :goto_2
    invoke-static {}, Lr3/v;->c()LV3/f;

    move-result-object p1

    invoke-interface {p1}, LV3/f;->c()J

    throw v1

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/As;->i:Lcom/google/android/gms/internal/ads/Zc;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/As;->i:Lcom/google/android/gms/internal/ads/Zc;

    iget-wide v1, p1, Lcom/google/android/gms/internal/ads/gl0;->e:J

    iput-wide v1, v0, Lcom/google/android/gms/internal/ads/Zc;->J:J

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/As;->i:Lcom/google/android/gms/internal/ads/Zc;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/As;->c:Ljava/lang/String;

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/Sg0;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/Zc;->K:Ljava/lang/String;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/As;->i:Lcom/google/android/gms/internal/ads/Zc;

    iget v1, p0, Lcom/google/android/gms/internal/ads/As;->d:I

    iput v1, v0, Lcom/google/android/gms/internal/ads/Zc;->L:I

    invoke-static {}, Lr3/v;->f()Lcom/google/android/gms/internal/ads/Vc;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/As;->i:Lcom/google/android/gms/internal/ads/Zc;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/Vc;->b(Lcom/google/android/gms/internal/ads/Zc;)Lcom/google/android/gms/internal/ads/Wc;

    move-result-object v1

    :cond_3
    if-eqz v1, :cond_4

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/Wc;->C()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/Wc;->E()Z

    move-result v0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/As;->j:Z

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/Wc;->D()Z

    move-result v0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/As;->k:Z

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/As;->g()Z

    move-result v0

    if-nez v0, :cond_4

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/Wc;->s()Ljava/io/InputStream;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/As;->f:Ljava/io/InputStream;

    const-wide/16 v0, -0x1

    return-wide v0

    :cond_4
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/As;->i:Lcom/google/android/gms/internal/ads/Zc;

    if-eqz v0, :cond_5

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/gl0;->a()Lcom/google/android/gms/internal/ads/ek0;

    move-result-object p1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/As;->i:Lcom/google/android/gms/internal/ads/Zc;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/Zc;->C:Ljava/lang/String;

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ads/ek0;->d(Landroid/net/Uri;)Lcom/google/android/gms/internal/ads/ek0;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/ek0;->e()Lcom/google/android/gms/internal/ads/gl0;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/As;->l:Lcom/google/android/gms/internal/ads/gl0;

    :cond_5
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/As;->b:Lcom/google/android/gms/internal/ads/pi0;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/As;->l:Lcom/google/android/gms/internal/ads/gl0;

    invoke-interface {p1, v0}, Lcom/google/android/gms/internal/ads/pi0;->a(Lcom/google/android/gms/internal/ads/gl0;)J

    move-result-wide v0

    return-wide v0

    :cond_6
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Attempt to open an already open CacheDataSource."

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final b(Lcom/google/android/gms/internal/ads/Pv0;)V
    .locals 0

    return-void
.end method

.method public final c()Landroid/net/Uri;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/As;->h:Landroid/net/Uri;

    return-object v0
.end method

.method public final synthetic d()Ljava/util/Map;
    .locals 1

    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public final f()V
    .locals 2

    .prologue
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/As;->g:Z

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/As;->g:Z

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/As;->h:Landroid/net/Uri;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/As;->f:Ljava/io/InputStream;

    if-eqz v1, :cond_0

    invoke-static {v1}, LV3/l;->a(Ljava/io/Closeable;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/As;->f:Ljava/io/InputStream;

    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/As;->b:Lcom/google/android/gms/internal/ads/pi0;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/pi0;->f()V

    return-void

    :cond_1
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Attempt to close an already closed CacheDataSource."

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
