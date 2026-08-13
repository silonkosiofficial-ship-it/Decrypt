.class Lk5/p$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lk5/p;->H(Ls5/j;Ljava/lang/Thread;Ljava/lang/Throwable;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:J

.field final synthetic b:Ljava/lang/Throwable;

.field final synthetic c:Ljava/lang/Thread;

.field final synthetic d:Ls5/j;

.field final synthetic e:Z

.field final synthetic f:Lk5/p;


# direct methods
.method constructor <init>(Lk5/p;JLjava/lang/Throwable;Ljava/lang/Thread;Ls5/j;Z)V
    .locals 0

    iput-object p1, p0, Lk5/p$b;->f:Lk5/p;

    iput-wide p2, p0, Lk5/p$b;->a:J

    iput-object p4, p0, Lk5/p$b;->b:Ljava/lang/Throwable;

    iput-object p5, p0, Lk5/p$b;->c:Ljava/lang/Thread;

    iput-object p6, p0, Lk5/p$b;->d:Ls5/j;

    iput-boolean p7, p0, Lk5/p$b;->e:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ll4/l;
    .locals 8

    .prologue
    iget-wide v0, p0, Lk5/p$b;->a:J

    invoke-static {v0, v1}, Lk5/p;->c(J)J

    move-result-wide v6

    iget-object v0, p0, Lk5/p$b;->f:Lk5/p;

    invoke-static {v0}, Lk5/p;->d(Lk5/p;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    invoke-static {}, Lh5/g;->f()Lh5/g;

    move-result-object v0

    const-string v2, "Tried to write a fatal exception while no session was open."

    invoke-virtual {v0, v2}, Lh5/g;->d(Ljava/lang/String;)V

    invoke-static {v1}, Ll4/o;->e(Ljava/lang/Object;)Ll4/l;

    move-result-object v0

    return-object v0

    :cond_0
    iget-object v2, p0, Lk5/p$b;->f:Lk5/p;

    invoke-static {v2}, Lk5/p;->f(Lk5/p;)Lk5/x;

    move-result-object v2

    invoke-virtual {v2}, Lk5/x;->a()Z

    iget-object v2, p0, Lk5/p$b;->f:Lk5/p;

    invoke-static {v2}, Lk5/p;->g(Lk5/p;)Lk5/Z;

    move-result-object v2

    iget-object v3, p0, Lk5/p$b;->b:Ljava/lang/Throwable;

    iget-object v4, p0, Lk5/p$b;->c:Ljava/lang/Thread;

    move-object v5, v0

    invoke-virtual/range {v2 .. v7}, Lk5/Z;->v(Ljava/lang/Throwable;Ljava/lang/Thread;Ljava/lang/String;J)V

    iget-object v2, p0, Lk5/p$b;->f:Lk5/p;

    iget-wide v3, p0, Lk5/p$b;->a:J

    invoke-static {v2, v3, v4}, Lk5/p;->h(Lk5/p;J)V

    iget-object v2, p0, Lk5/p$b;->f:Lk5/p;

    iget-object v3, p0, Lk5/p$b;->d:Ls5/j;

    invoke-virtual {v2, v3}, Lk5/p;->s(Ls5/j;)V

    iget-object v2, p0, Lk5/p$b;->f:Lk5/p;

    new-instance v3, Lk5/h;

    invoke-direct {v3}, Lk5/h;-><init>()V

    invoke-virtual {v3}, Lk5/h;->c()Ljava/lang/String;

    move-result-object v3

    iget-boolean v4, p0, Lk5/p$b;->e:Z

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    invoke-static {v2, v3, v4}, Lk5/p;->i(Lk5/p;Ljava/lang/String;Ljava/lang/Boolean;)V

    iget-object v2, p0, Lk5/p$b;->f:Lk5/p;

    invoke-static {v2}, Lk5/p;->j(Lk5/p;)Lk5/C;

    move-result-object v2

    invoke-virtual {v2}, Lk5/C;->d()Z

    move-result v2

    if-nez v2, :cond_1

    invoke-static {v1}, Ll4/o;->e(Ljava/lang/Object;)Ll4/l;

    move-result-object v0

    return-object v0

    :cond_1
    iget-object v1, p0, Lk5/p$b;->d:Ls5/j;

    invoke-interface {v1}, Ls5/j;->a()Ll4/l;

    move-result-object v1

    iget-object v2, p0, Lk5/p$b;->f:Lk5/p;

    invoke-static {v2}, Lk5/p;->k(Lk5/p;)Ll5/f;

    move-result-object v2

    iget-object v2, v2, Ll5/f;->a:Ll5/e;

    new-instance v3, Lk5/p$b$a;

    invoke-direct {v3, p0, v0}, Lk5/p$b$a;-><init>(Lk5/p$b;Ljava/lang/String;)V

    invoke-virtual {v1, v2, v3}, Ll4/l;->p(Ljava/util/concurrent/Executor;Ll4/k;)Ll4/l;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic call()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lk5/p$b;->a()Ll4/l;

    move-result-object v0

    return-object v0
.end method
