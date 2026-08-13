.class final LG6/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LH9/f;


# instance fields
.field private final a:LO6/e;

.field private final b:LW8/l;


# direct methods
.method public constructor <init>(LO6/e;LW8/l;)V
    .locals 1

    const-string v0, "requestData"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "continuation"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LG6/b;->a:LO6/e;

    iput-object p2, p0, LG6/b;->b:LW8/l;

    return-void
.end method


# virtual methods
.method public c(LH9/e;LH9/B;)V
    .locals 1

    .prologue
    const-string v0, "call"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "response"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, LH9/e;->D()Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, LG6/b;->b:LW8/l;

    invoke-static {p2}, Li7/w;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    invoke-interface {p1, p2}, Lm7/e;->t(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public d(LH9/e;Ljava/io/IOException;)V
    .locals 1

    .prologue
    const-string v0, "call"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "e"

    invoke-static {p2, p1}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, LG6/b;->b:LW8/l;

    invoke-interface {p1}, LW8/l;->isCancelled()Z

    move-result p1

    if-eqz p1, :cond_0

    return-void

    :cond_0
    iget-object p1, p0, LG6/b;->b:LW8/l;

    sget-object v0, Li7/w;->D:Li7/w$a;

    iget-object v0, p0, LG6/b;->a:LO6/e;

    invoke-static {v0, p2}, LG6/q;->a(LO6/e;Ljava/io/IOException;)Ljava/lang/Throwable;

    move-result-object p2

    invoke-static {p2}, Li7/x;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p2

    invoke-static {p2}, Li7/w;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    invoke-interface {p1, p2}, Lm7/e;->t(Ljava/lang/Object;)V

    return-void
.end method
