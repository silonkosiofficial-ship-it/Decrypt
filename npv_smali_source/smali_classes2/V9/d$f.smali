.class public final LV9/d$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LH9/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LV9/d;->o(LH9/x;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LV9/d;

.field final synthetic b:LH9/z;


# direct methods
.method constructor <init>(LV9/d;LH9/z;)V
    .locals 0

    iput-object p1, p0, LV9/d$f;->a:LV9/d;

    iput-object p2, p0, LV9/d$f;->b:LH9/z;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(LH9/e;LH9/B;)V
    .locals 3

    .prologue
    const-string v0, "call"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "response"

    invoke-static {p2, p1}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, LH9/B;->r()LM9/c;

    move-result-object p1

    :try_start_0
    iget-object v0, p0, LV9/d$f;->a:LV9/d;

    invoke-virtual {v0, p2, p1}, LV9/d;->m(LH9/B;LM9/c;)V

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p1}, LM9/c;->n()LV9/d$d;

    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    sget-object v0, LV9/e;->g:LV9/e$a;

    invoke-virtual {p2}, LH9/B;->H()LH9/t;

    move-result-object v1

    invoke-virtual {v0, v1}, LV9/e$a;->a(LH9/t;)LV9/e;

    move-result-object v0

    iget-object v1, p0, LV9/d$f;->a:LV9/d;

    invoke-static {v1, v0}, LV9/d;->l(LV9/d;LV9/e;)V

    iget-object v1, p0, LV9/d$f;->a:LV9/d;

    invoke-static {v1, v0}, LV9/d;->k(LV9/d;LV9/e;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, LV9/d$f;->a:LV9/d;

    monitor-enter v0

    :try_start_1
    invoke-static {v0}, LV9/d;->i(LV9/d;)Ljava/util/ArrayDeque;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/ArrayDeque;->clear()V

    const-string v1, "unexpected Sec-WebSocket-Extensions in response header"

    const/16 v2, 0x3f2

    invoke-virtual {v0, v2, v1}, LV9/d;->f(ILjava/lang/String;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception p1

    monitor-exit v0

    throw p1

    :cond_0
    :goto_0
    :try_start_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, LI9/d;->i:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " WebSocket "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LV9/d$f;->b:LH9/z;

    invoke-virtual {v1}, LH9/z;->i()LH9/u;

    move-result-object v1

    invoke-virtual {v1}, LH9/u;->n()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, LV9/d$f;->a:LV9/d;

    invoke-virtual {v1, v0, p1}, LV9/d;->r(Ljava/lang/String;LV9/d$d;)V

    iget-object p1, p0, LV9/d$f;->a:LV9/d;

    invoke-virtual {p1}, LV9/d;->q()LH9/G;

    move-result-object p1

    iget-object v0, p0, LV9/d$f;->a:LV9/d;

    invoke-virtual {p1, v0, p2}, LH9/G;->f(LH9/F;LH9/B;)V

    iget-object p1, p0, LV9/d$f;->a:LV9/d;

    invoke-virtual {p1}, LV9/d;->t()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    iget-object p2, p0, LV9/d$f;->a:LV9/d;

    const/4 v0, 0x0

    invoke-virtual {p2, p1, v0}, LV9/d;->p(Ljava/lang/Exception;LH9/B;)V

    :goto_1
    return-void

    :catch_1
    move-exception v0

    iget-object v1, p0, LV9/d$f;->a:LV9/d;

    invoke-virtual {v1, v0, p2}, LV9/d;->p(Ljava/lang/Exception;LH9/B;)V

    invoke-static {p2}, LI9/d;->m(Ljava/io/Closeable;)V

    if-eqz p1, :cond_1

    invoke-virtual {p1}, LM9/c;->v()V

    :cond_1
    return-void
.end method

.method public d(LH9/e;Ljava/io/IOException;)V
    .locals 1

    const-string v0, "call"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "e"

    invoke-static {p2, p1}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, LV9/d$f;->a:LV9/d;

    const/4 v0, 0x0

    invoke-virtual {p1, p2, v0}, LV9/d;->p(Ljava/lang/Exception;LH9/B;)V

    return-void
.end method
