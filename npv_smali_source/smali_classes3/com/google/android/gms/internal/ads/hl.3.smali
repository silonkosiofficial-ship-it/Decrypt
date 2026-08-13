.class public final Lcom/google/android/gms/internal/ads/hl;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Ljava/lang/Object;

.field private final b:Landroid/content/Context;

.field private final c:Ljava/lang/String;

.field private final d:Lw3/a;

.field private final e:Lcom/google/android/gms/internal/ads/T90;

.field private final f:Lv3/F;

.field private final g:Lv3/F;

.field private h:Lcom/google/android/gms/internal/ads/gl;

.field private i:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Lw3/a;Ljava/lang/String;Lv3/F;Lv3/F;Lcom/google/android/gms/internal/ads/T90;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/hl;->a:Ljava/lang/Object;

    const/4 v0, 0x1

    iput v0, p0, Lcom/google/android/gms/internal/ads/hl;->i:I

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/hl;->c:Ljava/lang/String;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/hl;->b:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/hl;->d:Lw3/a;

    iput-object p6, p0, Lcom/google/android/gms/internal/ads/hl;->e:Lcom/google/android/gms/internal/ads/T90;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/hl;->f:Lv3/F;

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/hl;->g:Lv3/F;

    return-void
.end method

.method static bridge synthetic a(Lcom/google/android/gms/internal/ads/hl;)I
    .locals 0

    iget p0, p0, Lcom/google/android/gms/internal/ads/hl;->i:I

    return p0
.end method

.method static bridge synthetic c(Lcom/google/android/gms/internal/ads/hl;)Lcom/google/android/gms/internal/ads/gl;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/hl;->h:Lcom/google/android/gms/internal/ads/gl;

    return-object p0
.end method

.method static bridge synthetic e(Lcom/google/android/gms/internal/ads/hl;)Lcom/google/android/gms/internal/ads/T90;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/hl;->e:Lcom/google/android/gms/internal/ads/T90;

    return-object p0
.end method

.method static bridge synthetic f(Lcom/google/android/gms/internal/ads/hl;)Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/hl;->a:Ljava/lang/Object;

    return-object p0
.end method

.method static bridge synthetic g(Lcom/google/android/gms/internal/ads/hl;Lcom/google/android/gms/internal/ads/gl;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/hl;->h:Lcom/google/android/gms/internal/ads/gl;

    return-void
.end method

.method static bridge synthetic h(Lcom/google/android/gms/internal/ads/hl;I)V
    .locals 0

    iput p1, p0, Lcom/google/android/gms/internal/ads/hl;->i:I

    return-void
.end method


# virtual methods
.method public final b(Lcom/google/android/gms/internal/ads/Z9;)Lcom/google/android/gms/internal/ads/bl;
    .locals 4

    .prologue
    const-string p1, "getEngine: Trying to acquire lock"

    invoke-static {p1}, Lv3/q0;->k(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/hl;->a:Ljava/lang/Object;

    monitor-enter p1

    :try_start_0
    const-string v0, "getEngine: Lock acquired"

    invoke-static {v0}, Lv3/q0;->k(Ljava/lang/String;)V

    const-string v0, "refreshIfDestroyed: Trying to acquire lock"

    invoke-static {v0}, Lv3/q0;->k(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/hl;->a:Ljava/lang/Object;

    monitor-enter v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    const-string v1, "refreshIfDestroyed: Lock acquired"

    invoke-static {v1}, Lv3/q0;->k(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/hl;->h:Lcom/google/android/gms/internal/ads/gl;

    if-eqz v1, :cond_0

    iget v2, p0, Lcom/google/android/gms/internal/ads/hl;->i:I

    if-nez v2, :cond_0

    new-instance v2, Lcom/google/android/gms/internal/ads/Pk;

    invoke-direct {v2, p0}, Lcom/google/android/gms/internal/ads/Pk;-><init>(Lcom/google/android/gms/internal/ads/hl;)V

    new-instance v3, Lcom/google/android/gms/internal/ads/Qk;

    invoke-direct {v3}, Lcom/google/android/gms/internal/ads/Qk;-><init>()V

    invoke-virtual {v1, v2, v3}, Lcom/google/android/gms/internal/ads/tr;->f(Lcom/google/android/gms/internal/ads/qr;Lcom/google/android/gms/internal/ads/or;)V

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_2

    :cond_0
    :goto_0
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    const-string v0, "refreshIfDestroyed: Lock released"

    invoke-static {v0}, Lv3/q0;->k(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/hl;->h:Lcom/google/android/gms/internal/ads/gl;

    const/4 v1, 0x0

    const/4 v2, 0x2

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/tr;->a()I

    move-result v0

    const/4 v3, -0x1

    if-ne v0, v3, :cond_1

    goto :goto_1

    :cond_1
    iget v0, p0, Lcom/google/android/gms/internal/ads/hl;->i:I

    if-nez v0, :cond_2

    const-string v0, "getEngine (NO_UPDATE): Lock released"

    invoke-static {v0}, Lv3/q0;->k(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/hl;->h:Lcom/google/android/gms/internal/ads/gl;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/gl;->g()Lcom/google/android/gms/internal/ads/bl;

    move-result-object v0

    monitor-exit p1

    return-object v0

    :catchall_1
    move-exception v0

    goto :goto_3

    :cond_2
    const/4 v3, 0x1

    if-ne v0, v3, :cond_3

    iput v2, p0, Lcom/google/android/gms/internal/ads/hl;->i:I

    invoke-virtual {p0, v1}, Lcom/google/android/gms/internal/ads/hl;->d(Lcom/google/android/gms/internal/ads/Z9;)Lcom/google/android/gms/internal/ads/gl;

    const-string v0, "getEngine (PENDING_UPDATE): Lock released"

    invoke-static {v0}, Lv3/q0;->k(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/hl;->h:Lcom/google/android/gms/internal/ads/gl;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/gl;->g()Lcom/google/android/gms/internal/ads/bl;

    move-result-object v0

    monitor-exit p1

    return-object v0

    :cond_3
    const-string v0, "getEngine (UPDATING): Lock released"

    invoke-static {v0}, Lv3/q0;->k(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/hl;->h:Lcom/google/android/gms/internal/ads/gl;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/gl;->g()Lcom/google/android/gms/internal/ads/bl;

    move-result-object v0

    monitor-exit p1

    return-object v0

    :cond_4
    :goto_1
    iput v2, p0, Lcom/google/android/gms/internal/ads/hl;->i:I

    invoke-virtual {p0, v1}, Lcom/google/android/gms/internal/ads/hl;->d(Lcom/google/android/gms/internal/ads/Z9;)Lcom/google/android/gms/internal/ads/gl;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/hl;->h:Lcom/google/android/gms/internal/ads/gl;

    const-string v0, "getEngine (NULL or REJECTED): Lock released"

    invoke-static {v0}, Lv3/q0;->k(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/hl;->h:Lcom/google/android/gms/internal/ads/gl;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/gl;->g()Lcom/google/android/gms/internal/ads/bl;

    move-result-object v0

    monitor-exit p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    return-object v0

    :goto_2
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    throw v1

    :goto_3
    monitor-exit p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    throw v0
.end method

.method protected final d(Lcom/google/android/gms/internal/ads/Z9;)Lcom/google/android/gms/internal/ads/gl;
    .locals 4

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/hl;->b:Landroid/content/Context;

    const/4 v0, 0x6

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/ads/D90;->a(Landroid/content/Context;I)Lcom/google/android/gms/internal/ads/E90;

    move-result-object p1

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/E90;->h()Lcom/google/android/gms/internal/ads/E90;

    new-instance v0, Lcom/google/android/gms/internal/ads/gl;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/hl;->g:Lv3/F;

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/gl;-><init>(Lv3/F;)V

    const-string v1, "loadJavascriptEngine > Before UI_THREAD_EXECUTOR"

    invoke-static {v1}, Lv3/q0;->k(Ljava/lang/String;)V

    sget-object v1, Lcom/google/android/gms/internal/ads/dr;->f:Lcom/google/android/gms/internal/ads/Yk0;

    new-instance v2, Lcom/google/android/gms/internal/ads/Rk;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v3, v0}, Lcom/google/android/gms/internal/ads/Rk;-><init>(Lcom/google/android/gms/internal/ads/hl;Lcom/google/android/gms/internal/ads/Z9;Lcom/google/android/gms/internal/ads/gl;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    const-string v1, "loadNewJavascriptEngine: Promise created"

    invoke-static {v1}, Lv3/q0;->k(Ljava/lang/String;)V

    new-instance v1, Lcom/google/android/gms/internal/ads/Wk;

    invoke-direct {v1, p0, v0, p1}, Lcom/google/android/gms/internal/ads/Wk;-><init>(Lcom/google/android/gms/internal/ads/hl;Lcom/google/android/gms/internal/ads/gl;Lcom/google/android/gms/internal/ads/E90;)V

    new-instance v2, Lcom/google/android/gms/internal/ads/Xk;

    invoke-direct {v2, p0, v0, p1}, Lcom/google/android/gms/internal/ads/Xk;-><init>(Lcom/google/android/gms/internal/ads/hl;Lcom/google/android/gms/internal/ads/gl;Lcom/google/android/gms/internal/ads/E90;)V

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ads/tr;->f(Lcom/google/android/gms/internal/ads/qr;Lcom/google/android/gms/internal/ads/or;)V

    return-object v0
.end method

.method final synthetic i(Lcom/google/android/gms/internal/ads/Z9;Lcom/google/android/gms/internal/ads/gl;)V
    .locals 12

    .prologue
    invoke-static {}, Lr3/v;->c()LV3/f;

    move-result-object p1

    invoke-interface {p1}, LV3/f;->a()J

    move-result-wide v7

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    :try_start_0
    const-string v0, "loadJavascriptEngine > Before createJavascriptEngine"

    invoke-static {v0}, Lv3/q0;->k(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/hl;->b:Landroid/content/Context;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/hl;->d:Lw3/a;

    new-instance v9, Lcom/google/android/gms/internal/ads/Jk;

    const/4 v10, 0x0

    invoke-direct {v9, v0, v1, v10, v10}, Lcom/google/android/gms/internal/ads/Jk;-><init>(Landroid/content/Context;Lw3/a;Lcom/google/android/gms/internal/ads/Z9;Lr3/a;)V

    const-string v0, "loadJavascriptEngine > After createJavascriptEngine"

    invoke-static {v0}, Lv3/q0;->k(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-string v0, "loadJavascriptEngine > Before setting new engine loaded listener"

    invoke-static {v0}, Lv3/q0;->k(Ljava/lang/String;)V

    new-instance v11, Lcom/google/android/gms/internal/ads/Mk;

    move-object v0, v11

    move-object v1, p0

    move-object v2, p1

    move-wide v3, v7

    move-object v5, p2

    move-object v6, v9

    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/internal/ads/Mk;-><init>(Lcom/google/android/gms/internal/ads/hl;Ljava/util/ArrayList;JLcom/google/android/gms/internal/ads/gl;Lcom/google/android/gms/internal/ads/Bk;)V

    invoke-interface {v9, v11}, Lcom/google/android/gms/internal/ads/Bk;->c0(Lcom/google/android/gms/internal/ads/Mk;)V

    const-string v0, "loadJavascriptEngine > Before registering GmsgHandler for /jsLoaded"

    invoke-static {v0}, Lv3/q0;->k(Ljava/lang/String;)V

    new-instance v6, Lcom/google/android/gms/internal/ads/Sk;

    move-object v0, v6

    move-wide v2, v7

    move-object v4, p2

    move-object v5, v9

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/ads/Sk;-><init>(Lcom/google/android/gms/internal/ads/hl;JLcom/google/android/gms/internal/ads/gl;Lcom/google/android/gms/internal/ads/Bk;)V

    const-string v0, "/jsLoaded"

    invoke-interface {v9, v0, v6}, Lcom/google/android/gms/internal/ads/il;->W(Ljava/lang/String;Lcom/google/android/gms/internal/ads/gj;)V

    new-instance v0, Lv3/b0;

    invoke-direct {v0}, Lv3/b0;-><init>()V

    new-instance v1, Lcom/google/android/gms/internal/ads/Tk;

    invoke-direct {v1, p0, v10, v9, v0}, Lcom/google/android/gms/internal/ads/Tk;-><init>(Lcom/google/android/gms/internal/ads/hl;Lcom/google/android/gms/internal/ads/Z9;Lcom/google/android/gms/internal/ads/Bk;Lv3/b0;)V

    invoke-virtual {v0, v1}, Lv3/b0;->b(Ljava/lang/Object;)V

    const-string v0, "loadJavascriptEngine > Before registering GmsgHandler for /requestReload"

    invoke-static {v0}, Lv3/q0;->k(Ljava/lang/String;)V

    const-string v0, "/requestReload"

    invoke-interface {v9, v0, v1}, Lcom/google/android/gms/internal/ads/il;->W(Ljava/lang/String;Lcom/google/android/gms/internal/ads/gj;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/hl;->c:Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "loadJavascriptEngine > javascriptPath: "

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lv3/q0;->k(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/hl;->c:Ljava/lang/String;

    const-string v1, ".js"

    invoke-virtual {v0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "loadJavascriptEngine > Before newEngine.loadJavascript"

    invoke-static {v0}, Lv3/q0;->k(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/hl;->c:Ljava/lang/String;

    invoke-interface {v9, v0}, Lcom/google/android/gms/internal/ads/Bk;->a0(Ljava/lang/String;)V

    const-string v0, "loadJavascriptEngine > After newEngine.loadJavascript"

    :goto_0
    invoke-static {v0}, Lv3/q0;->k(Ljava/lang/String;)V

    goto :goto_1

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/hl;->c:Ljava/lang/String;

    const-string v1, "<html>"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "loadJavascriptEngine > Before newEngine.loadHtml"

    invoke-static {v0}, Lv3/q0;->k(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/hl;->c:Ljava/lang/String;

    invoke-interface {v9, v0}, Lcom/google/android/gms/internal/ads/Bk;->G(Ljava/lang/String;)V

    const-string v0, "loadJavascriptEngine > After newEngine.loadHtml"

    goto :goto_0

    :cond_1
    const-string v0, "loadJavascriptEngine > Before newEngine.loadHtmlWrapper"

    invoke-static {v0}, Lv3/q0;->k(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/hl;->c:Ljava/lang/String;

    invoke-interface {v9, v0}, Lcom/google/android/gms/internal/ads/Bk;->S(Ljava/lang/String;)V

    const-string v0, "loadJavascriptEngine > After newEngine.loadHtmlWrapper"

    goto :goto_0

    :goto_1
    const-string v0, "loadJavascriptEngine > Before calling ADMOB_UI_HANDLER.postDelayed"

    invoke-static {v0}, Lv3/q0;->k(Ljava/lang/String;)V

    sget-object v10, Lv3/E0;->l:Lcom/google/android/gms/internal/ads/Fe0;

    new-instance v11, Lcom/google/android/gms/internal/ads/Vk;

    move-object v0, v11

    move-object v1, p0

    move-object v2, p2

    move-object v3, v9

    move-object v4, p1

    move-wide v5, v7

    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/internal/ads/Vk;-><init>(Lcom/google/android/gms/internal/ads/hl;Lcom/google/android/gms/internal/ads/gl;Lcom/google/android/gms/internal/ads/Bk;Ljava/util/ArrayList;J)V

    sget-object p1, Lcom/google/android/gms/internal/ads/Af;->c:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object p2

    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    int-to-long p1, p1

    invoke-virtual {v10, v11, p1, p2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void

    :catchall_0
    move-exception p1

    const-string v0, "Error creating webview."

    invoke-static {v0, p1}, Lw3/p;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    sget-object v0, Lcom/google/android/gms/internal/ads/Af;->B7:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_2

    const-string v0, "SdkJavascriptFactory.loadJavascriptEngine.createJavascriptEngine"

    invoke-virtual {p2, p1, v0}, Lcom/google/android/gms/internal/ads/tr;->d(Ljava/lang/Throwable;Ljava/lang/String;)V

    return-void

    :cond_2
    sget-object v0, Lcom/google/android/gms/internal/ads/Af;->D7:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    const-string v1, "SdkJavascriptFactory.loadJavascriptEngine"

    if-eqz v0, :cond_3

    invoke-static {}, Lr3/v;->s()Lcom/google/android/gms/internal/ads/Uq;

    move-result-object v0

    invoke-virtual {v0, p1, v1}, Lcom/google/android/gms/internal/ads/Uq;->w(Ljava/lang/Throwable;Ljava/lang/String;)V

    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/tr;->c()V

    return-void

    :cond_3
    invoke-static {}, Lr3/v;->s()Lcom/google/android/gms/internal/ads/Uq;

    move-result-object v0

    invoke-virtual {v0, p1, v1}, Lcom/google/android/gms/internal/ads/Uq;->x(Ljava/lang/Throwable;Ljava/lang/String;)V

    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/tr;->c()V

    return-void
.end method

.method final synthetic j(Lcom/google/android/gms/internal/ads/gl;Lcom/google/android/gms/internal/ads/Bk;Ljava/util/ArrayList;J)V
    .locals 4

    .prologue
    const-string v0, "loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Trying to acquire lock"

    invoke-static {v0}, Lv3/q0;->k(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/hl;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    const-string v1, "loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Lock acquired"

    invoke-static {v1}, Lv3/q0;->k(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/tr;->a()I

    move-result v1

    const/4 v2, -0x1

    if-eq v1, v2, :cond_2

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/tr;->a()I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    goto/16 :goto_1

    :cond_0
    sget-object v1, Lcom/google/android/gms/internal/ads/Af;->B7:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_1

    new-instance v1, Ljava/util/concurrent/TimeoutException;

    const-string v2, "Unable to receive /jsLoaded GMSG."

    invoke-direct {v1, v2}, Ljava/util/concurrent/TimeoutException;-><init>(Ljava/lang/String;)V

    const-string v2, "SdkJavascriptFactory.loadJavascriptEngine.setLoadedListener"

    invoke-virtual {p1, v1, v2}, Lcom/google/android/gms/internal/ads/tr;->d(Ljava/lang/Throwable;Ljava/lang/String;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto/16 :goto_2

    :cond_1
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/tr;->c()V

    :goto_0
    sget-object v1, Lcom/google/android/gms/internal/ads/dr;->f:Lcom/google/android/gms/internal/ads/Yk0;

    invoke-static {p2}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Lcom/google/android/gms/internal/ads/Lk;

    invoke-direct {v2, p2}, Lcom/google/android/gms/internal/ads/Lk;-><init>(Lcom/google/android/gms/internal/ads/Bk;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    sget-object p2, Lcom/google/android/gms/internal/ads/Af;->b:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v1

    invoke-virtual {v1, p2}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object p2

    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/tr;->a()I

    move-result p1

    iget v1, p0, Lcom/google/android/gms/internal/ads/hl;->i:I

    const/4 v2, 0x0

    invoke-virtual {p3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p3

    invoke-static {p3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p3

    invoke-static {}, Lr3/v;->c()LV3/f;

    move-result-object v2

    invoke-interface {v2}, LV3/f;->a()J

    move-result-wide v2

    sub-long/2addr v2, p4

    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    const-string p5, "Could not receive /jsLoaded in "

    invoke-virtual {p4, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, " ms. JS engine session reference status(onEngLoadedTimeout) is "

    invoke-virtual {p4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ". Update status(onEngLoadedTimeout) is "

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ". LoadNewJavascriptEngine(onEngLoadedTimeout) latency is "

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " ms. Total latency(onEngLoadedTimeout) is "

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p1, " ms. Rejecting."

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lv3/q0;->k(Ljava/lang/String;)V

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-string p1, "loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Lock released"

    invoke-static {p1}, Lv3/q0;->k(Ljava/lang/String;)V

    return-void

    :cond_2
    :goto_1
    :try_start_1
    const-string p1, "loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Lock released, the promise is already settled"

    invoke-static {p1}, Lv3/q0;->k(Ljava/lang/String;)V

    monitor-exit v0

    return-void

    :goto_2
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method final synthetic k(Lcom/google/android/gms/internal/ads/Bk;)V
    .locals 0

    .prologue
    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/Bk;->h()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    iput p1, p0, Lcom/google/android/gms/internal/ads/hl;->i:I

    :cond_0
    return-void
.end method
