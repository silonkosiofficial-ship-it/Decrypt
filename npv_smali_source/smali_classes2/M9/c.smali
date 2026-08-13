.class public final LM9/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LM9/c$a;,
        LM9/c$b;
    }
.end annotation


# instance fields
.field private final a:LM9/e;

.field private final b:LH9/r;

.field private final c:LM9/d;

.field private final d:LN9/d;

.field private e:Z

.field private f:Z

.field private final g:LM9/f;


# direct methods
.method public constructor <init>(LM9/e;LH9/r;LM9/d;LN9/d;)V
    .locals 1

    const-string v0, "call"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "eventListener"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "finder"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "codec"

    invoke-static {p4, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LM9/c;->a:LM9/e;

    iput-object p2, p0, LM9/c;->b:LH9/r;

    iput-object p3, p0, LM9/c;->c:LM9/d;

    iput-object p4, p0, LM9/c;->d:LN9/d;

    invoke-interface {p4}, LN9/d;->e()LM9/f;

    move-result-object p1

    iput-object p1, p0, LM9/c;->g:LM9/f;

    return-void
.end method

.method private final u(Ljava/io/IOException;)V
    .locals 2

    const/4 v0, 0x1

    iput-boolean v0, p0, LM9/c;->f:Z

    iget-object v0, p0, LM9/c;->c:LM9/d;

    invoke-virtual {v0, p1}, LM9/d;->h(Ljava/io/IOException;)V

    iget-object v0, p0, LM9/c;->d:LN9/d;

    invoke-interface {v0}, LN9/d;->e()LM9/f;

    move-result-object v0

    iget-object v1, p0, LM9/c;->a:LM9/e;

    invoke-virtual {v0, v1, p1}, LM9/f;->H(LM9/e;Ljava/io/IOException;)V

    return-void
.end method


# virtual methods
.method public final a(JZZLjava/io/IOException;)Ljava/io/IOException;
    .locals 2

    .prologue
    if-eqz p5, :cond_0

    invoke-direct {p0, p5}, LM9/c;->u(Ljava/io/IOException;)V

    :cond_0
    if-eqz p4, :cond_2

    iget-object v0, p0, LM9/c;->b:LH9/r;

    iget-object v1, p0, LM9/c;->a:LM9/e;

    if-eqz p5, :cond_1

    invoke-virtual {v0, v1, p5}, LH9/r;->r(LH9/e;Ljava/io/IOException;)V

    goto :goto_0

    :cond_1
    invoke-virtual {v0, v1, p1, p2}, LH9/r;->p(LH9/e;J)V

    :cond_2
    :goto_0
    if-eqz p3, :cond_4

    if-eqz p5, :cond_3

    iget-object p1, p0, LM9/c;->b:LH9/r;

    iget-object p2, p0, LM9/c;->a:LM9/e;

    invoke-virtual {p1, p2, p5}, LH9/r;->w(LH9/e;Ljava/io/IOException;)V

    goto :goto_1

    :cond_3
    iget-object v0, p0, LM9/c;->b:LH9/r;

    iget-object v1, p0, LM9/c;->a:LM9/e;

    invoke-virtual {v0, v1, p1, p2}, LH9/r;->u(LH9/e;J)V

    :cond_4
    :goto_1
    iget-object p1, p0, LM9/c;->a:LM9/e;

    invoke-virtual {p1, p0, p4, p3, p5}, LM9/e;->w(LM9/c;ZZLjava/io/IOException;)Ljava/io/IOException;

    move-result-object p1

    return-object p1
.end method

.method public final b()V
    .locals 1

    iget-object v0, p0, LM9/c;->d:LN9/d;

    invoke-interface {v0}, LN9/d;->cancel()V

    return-void
.end method

.method public final c(LH9/z;Z)LX9/X;
    .locals 3

    const-string v0, "request"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iput-boolean p2, p0, LM9/c;->e:Z

    invoke-virtual {p1}, LH9/z;->a()LH9/A;

    move-result-object p2

    invoke-static {p2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p2}, LH9/A;->a()J

    move-result-wide v0

    iget-object p2, p0, LM9/c;->b:LH9/r;

    iget-object v2, p0, LM9/c;->a:LM9/e;

    invoke-virtual {p2, v2}, LH9/r;->q(LH9/e;)V

    iget-object p2, p0, LM9/c;->d:LN9/d;

    invoke-interface {p2, p1, v0, v1}, LN9/d;->g(LH9/z;J)LX9/X;

    move-result-object p1

    new-instance p2, LM9/c$a;

    invoke-direct {p2, p0, p1, v0, v1}, LM9/c$a;-><init>(LM9/c;LX9/X;J)V

    return-object p2
.end method

.method public final d()V
    .locals 3

    iget-object v0, p0, LM9/c;->d:LN9/d;

    invoke-interface {v0}, LN9/d;->cancel()V

    iget-object v0, p0, LM9/c;->a:LM9/e;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-virtual {v0, p0, v1, v1, v2}, LM9/e;->w(LM9/c;ZZLjava/io/IOException;)Ljava/io/IOException;

    return-void
.end method

.method public final e()V
    .locals 3

    .prologue
    :try_start_0
    iget-object v0, p0, LM9/c;->d:LN9/d;

    invoke-interface {v0}, LN9/d;->b()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    iget-object v1, p0, LM9/c;->b:LH9/r;

    iget-object v2, p0, LM9/c;->a:LM9/e;

    invoke-virtual {v1, v2, v0}, LH9/r;->r(LH9/e;Ljava/io/IOException;)V

    invoke-direct {p0, v0}, LM9/c;->u(Ljava/io/IOException;)V

    throw v0
.end method

.method public final f()V
    .locals 3

    .prologue
    :try_start_0
    iget-object v0, p0, LM9/c;->d:LN9/d;

    invoke-interface {v0}, LN9/d;->f()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    iget-object v1, p0, LM9/c;->b:LH9/r;

    iget-object v2, p0, LM9/c;->a:LM9/e;

    invoke-virtual {v1, v2, v0}, LH9/r;->r(LH9/e;Ljava/io/IOException;)V

    invoke-direct {p0, v0}, LM9/c;->u(Ljava/io/IOException;)V

    throw v0
.end method

.method public final g()LM9/e;
    .locals 1

    iget-object v0, p0, LM9/c;->a:LM9/e;

    return-object v0
.end method

.method public final h()LM9/f;
    .locals 1

    iget-object v0, p0, LM9/c;->g:LM9/f;

    return-object v0
.end method

.method public final i()LH9/r;
    .locals 1

    iget-object v0, p0, LM9/c;->b:LH9/r;

    return-object v0
.end method

.method public final j()LM9/d;
    .locals 1

    iget-object v0, p0, LM9/c;->c:LM9/d;

    return-object v0
.end method

.method public final k()Z
    .locals 1

    iget-boolean v0, p0, LM9/c;->f:Z

    return v0
.end method

.method public final l()Z
    .locals 2

    iget-object v0, p0, LM9/c;->c:LM9/d;

    invoke-virtual {v0}, LM9/d;->d()LH9/a;

    move-result-object v0

    invoke-virtual {v0}, LH9/a;->l()LH9/u;

    move-result-object v0

    invoke-virtual {v0}, LH9/u;->h()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, LM9/c;->g:LM9/f;

    invoke-virtual {v1}, LM9/f;->A()LH9/D;

    move-result-object v1

    invoke-virtual {v1}, LH9/D;->a()LH9/a;

    move-result-object v1

    invoke-virtual {v1}, LH9/a;->l()LH9/u;

    move-result-object v1

    invoke-virtual {v1}, LH9/u;->h()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public final m()Z
    .locals 1

    iget-boolean v0, p0, LM9/c;->e:Z

    return v0
.end method

.method public final n()LV9/d$d;
    .locals 1

    iget-object v0, p0, LM9/c;->a:LM9/e;

    invoke-virtual {v0}, LM9/e;->C()V

    iget-object v0, p0, LM9/c;->d:LN9/d;

    invoke-interface {v0}, LN9/d;->e()LM9/f;

    move-result-object v0

    invoke-virtual {v0, p0}, LM9/f;->x(LM9/c;)LV9/d$d;

    move-result-object v0

    return-object v0
.end method

.method public final o()V
    .locals 1

    iget-object v0, p0, LM9/c;->d:LN9/d;

    invoke-interface {v0}, LN9/d;->e()LM9/f;

    move-result-object v0

    invoke-virtual {v0}, LM9/f;->z()V

    return-void
.end method

.method public final p()V
    .locals 4

    iget-object v0, p0, LM9/c;->a:LM9/e;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-virtual {v0, p0, v3, v1, v2}, LM9/e;->w(LM9/c;ZZLjava/io/IOException;)Ljava/io/IOException;

    return-void
.end method

.method public final q(LH9/B;)LH9/C;
    .locals 4

    .prologue
    const-string v0, "response"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    const-string v0, "Content-Type"

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-static {p1, v0, v2, v1, v2}, LH9/B;->D(LH9/B;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, LM9/c;->d:LN9/d;

    invoke-interface {v1, p1}, LN9/d;->a(LH9/B;)J

    move-result-wide v1

    iget-object v3, p0, LM9/c;->d:LN9/d;

    invoke-interface {v3, p1}, LN9/d;->c(LH9/B;)LX9/Z;

    move-result-object p1

    new-instance v3, LM9/c$b;

    invoke-direct {v3, p0, p1, v1, v2}, LM9/c$b;-><init>(LM9/c;LX9/Z;J)V

    new-instance p1, LN9/h;

    invoke-static {v3}, LX9/K;->b(LX9/Z;)LX9/f;

    move-result-object v3

    invoke-direct {p1, v0, v1, v2, v3}, LN9/h;-><init>(Ljava/lang/String;JLX9/f;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    iget-object v0, p0, LM9/c;->b:LH9/r;

    iget-object v1, p0, LM9/c;->a:LM9/e;

    invoke-virtual {v0, v1, p1}, LH9/r;->w(LH9/e;Ljava/io/IOException;)V

    invoke-direct {p0, p1}, LM9/c;->u(Ljava/io/IOException;)V

    throw p1
.end method

.method public final r(Z)LH9/B$a;
    .locals 2

    .prologue
    :try_start_0
    iget-object v0, p0, LM9/c;->d:LN9/d;

    invoke-interface {v0, p1}, LN9/d;->d(Z)LH9/B$a;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1, p0}, LH9/B$a;->l(LM9/c;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    return-object p1

    :goto_1
    iget-object v0, p0, LM9/c;->b:LH9/r;

    iget-object v1, p0, LM9/c;->a:LM9/e;

    invoke-virtual {v0, v1, p1}, LH9/r;->w(LH9/e;Ljava/io/IOException;)V

    invoke-direct {p0, p1}, LM9/c;->u(Ljava/io/IOException;)V

    throw p1
.end method

.method public final s(LH9/B;)V
    .locals 2

    const-string v0, "response"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LM9/c;->b:LH9/r;

    iget-object v1, p0, LM9/c;->a:LM9/e;

    invoke-virtual {v0, v1, p1}, LH9/r;->x(LH9/e;LH9/B;)V

    return-void
.end method

.method public final t()V
    .locals 2

    iget-object v0, p0, LM9/c;->b:LH9/r;

    iget-object v1, p0, LM9/c;->a:LM9/e;

    invoke-virtual {v0, v1}, LH9/r;->y(LH9/e;)V

    return-void
.end method

.method public final v()V
    .locals 6

    const/4 v4, 0x1

    const/4 v5, 0x0

    const-wide/16 v1, -0x1

    const/4 v3, 0x1

    move-object v0, p0

    invoke-virtual/range {v0 .. v5}, LM9/c;->a(JZZLjava/io/IOException;)Ljava/io/IOException;

    return-void
.end method

.method public final w(LH9/z;)V
    .locals 2

    .prologue
    const-string v0, "request"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    iget-object v0, p0, LM9/c;->b:LH9/r;

    iget-object v1, p0, LM9/c;->a:LM9/e;

    invoke-virtual {v0, v1}, LH9/r;->t(LH9/e;)V

    iget-object v0, p0, LM9/c;->d:LN9/d;

    invoke-interface {v0, p1}, LN9/d;->h(LH9/z;)V

    iget-object v0, p0, LM9/c;->b:LH9/r;

    iget-object v1, p0, LM9/c;->a:LM9/e;

    invoke-virtual {v0, v1, p1}, LH9/r;->s(LH9/e;LH9/z;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    iget-object v0, p0, LM9/c;->b:LH9/r;

    iget-object v1, p0, LM9/c;->a:LM9/e;

    invoke-virtual {v0, v1, p1}, LH9/r;->r(LH9/e;Ljava/io/IOException;)V

    invoke-direct {p0, p1}, LM9/c;->u(Ljava/io/IOException;)V

    throw p1
.end method
