.class public final LG6/o;
.super LH9/G;
.source "SourceFile"

# interfaces
.implements LW8/N;


# instance fields
.field private final C:LH9/x;

.field private final D:LH9/F$a;

.field private final E:Lm7/i;

.field private final F:LW8/v;

.field private final G:LW8/v;

.field private final H:LY8/j;

.field private final I:LW8/v;

.field private final J:LY8/C;


# direct methods
.method public constructor <init>(LH9/x;LH9/F$a;LH9/z;Lm7/i;)V
    .locals 8

    const-string v0, "engine"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "webSocketFactory"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "engineRequest"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "coroutineContext"

    invoke-static {p4, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LH9/G;-><init>()V

    iput-object p1, p0, LG6/o;->C:LH9/x;

    iput-object p2, p0, LG6/o;->D:LH9/F$a;

    iput-object p4, p0, LG6/o;->E:Lm7/i;

    const/4 p1, 0x0

    const/4 p2, 0x1

    invoke-static {p1, p2, p1}, LW8/x;->b(LW8/z0;ILjava/lang/Object;)LW8/v;

    move-result-object p4

    iput-object p4, p0, LG6/o;->F:LW8/v;

    invoke-static {p1, p2, p1}, LW8/x;->b(LW8/z0;ILjava/lang/Object;)LW8/v;

    move-result-object p4

    iput-object p4, p0, LG6/o;->G:LW8/v;

    const/4 p4, 0x0

    const/4 v0, 0x7

    invoke-static {p4, p1, p1, v0, p1}, LY8/m;->b(ILY8/d;Lx7/l;ILjava/lang/Object;)LY8/j;

    move-result-object p4

    iput-object p4, p0, LG6/o;->H:LY8/j;

    invoke-static {p1, p2, p1}, LW8/x;->b(LW8/z0;ILjava/lang/Object;)LW8/v;

    move-result-object p2

    iput-object p2, p0, LG6/o;->I:LW8/v;

    new-instance v5, LG6/o$a;

    invoke-direct {v5, p0, p3, p1}, LG6/o$a;-><init>(LG6/o;LH9/z;Lm7/e;)V

    const/16 v6, 0xf

    const/4 v7, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v7}, LY8/b;->b(LW8/N;Lm7/i;ILW8/P;Lx7/l;Lx7/p;ILjava/lang/Object;)LY8/C;

    move-result-object p1

    iput-object p1, p0, LG6/o;->J:LY8/C;

    return-void
.end method

.method public static final synthetic g(LG6/o;)LW8/v;
    .locals 0

    iget-object p0, p0, LG6/o;->F:LW8/v;

    return-object p0
.end method

.method public static final synthetic h(LG6/o;)LH9/F$a;
    .locals 0

    iget-object p0, p0, LG6/o;->D:LH9/F$a;

    return-object p0
.end method


# virtual methods
.method public a(LH9/F;ILjava/lang/String;)V
    .locals 3

    .prologue
    const-string v0, "webSocket"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reason"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1, p2, p3}, LH9/G;->a(LH9/F;ILjava/lang/String;)V

    iget-object p1, p0, LG6/o;->I:LW8/v;

    new-instance v0, Lg7/a;

    int-to-short v1, p2

    invoke-direct {v0, v1, p3}, Lg7/a;-><init>(SLjava/lang/String;)V

    invoke-interface {p1, v0}, LW8/v;->R0(Ljava/lang/Object;)Z

    iget-object p1, p0, LG6/o;->H:LY8/j;

    const/4 p3, 0x0

    const/4 v0, 0x1

    invoke-static {p1, p3, v0, p3}, LY8/C$a;->a(LY8/C;Ljava/lang/Throwable;ILjava/lang/Object;)Z

    invoke-virtual {p0}, LG6/o;->j()LY8/C;

    move-result-object p1

    new-instance p3, Ljava/util/concurrent/CancellationException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "WebSocket session closed with code "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v2, Lg7/a$a;->D:Lg7/a$a$a;

    invoke-virtual {v2, v1}, Lg7/a$a$a;->a(S)Lg7/a$a;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_1

    :cond_0
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    :cond_1
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 p2, 0x2e

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p3, p2}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    invoke-interface {p1, p3}, LY8/C;->c(Ljava/lang/Throwable;)Z

    return-void
.end method

.method public b(LH9/F;ILjava/lang/String;)V
    .locals 2

    .prologue
    const-string v0, "webSocket"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reason"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1, p2, p3}, LH9/G;->b(LH9/F;ILjava/lang/String;)V

    iget-object p1, p0, LG6/o;->I:LW8/v;

    new-instance v0, Lg7/a;

    int-to-short p2, p2

    invoke-direct {v0, p2, p3}, Lg7/a;-><init>(SLjava/lang/String;)V

    invoke-interface {p1, v0}, LW8/v;->R0(Ljava/lang/Object;)Z

    :try_start_0
    invoke-virtual {p0}, LG6/o;->j()LY8/C;

    move-result-object p1

    new-instance v0, Lg7/b$b;

    new-instance v1, Lg7/a;

    invoke-direct {v1, p2, p3}, Lg7/a;-><init>(SLjava/lang/String;)V

    invoke-direct {v0, v1}, Lg7/b$b;-><init>(Lg7/a;)V

    invoke-static {p1, v0}, LY8/q;->b(LY8/C;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    iget-object p1, p0, LG6/o;->H:LY8/j;

    const/4 p2, 0x1

    const/4 p3, 0x0

    invoke-static {p1, p3, p2, p3}, LY8/C$a;->a(LY8/C;Ljava/lang/Throwable;ILjava/lang/Object;)Z

    return-void
.end method

.method public c(LH9/F;Ljava/lang/Throwable;LH9/B;)V
    .locals 2

    .prologue
    const-string v0, "webSocket"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "t"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1, p2, p3}, LH9/G;->c(LH9/F;Ljava/lang/Throwable;LH9/B;)V

    const/4 p1, 0x0

    if-eqz p3, :cond_0

    invoke-virtual {p3}, LH9/B;->o()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, p1

    :goto_0
    sget-object v1, LT6/C;->E:LT6/C$a;

    invoke-virtual {v1}, LT6/C$a;->U()LT6/C;

    move-result-object v1

    invoke-virtual {v1}, LT6/C;->m0()I

    move-result v1

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-ne v0, v1, :cond_2

    iget-object p2, p0, LG6/o;->G:LW8/v;

    invoke-interface {p2, p3}, LW8/v;->R0(Ljava/lang/Object;)Z

    iget-object p2, p0, LG6/o;->H:LY8/j;

    const/4 p3, 0x1

    invoke-static {p2, p1, p3, p1}, LY8/C$a;->a(LY8/C;Ljava/lang/Throwable;ILjava/lang/Object;)Z

    invoke-virtual {p0}, LG6/o;->j()LY8/C;

    move-result-object p2

    invoke-static {p2, p1, p3, p1}, LY8/C$a;->a(LY8/C;Ljava/lang/Throwable;ILjava/lang/Object;)Z

    goto :goto_2

    :cond_2
    :goto_1
    iget-object p1, p0, LG6/o;->G:LW8/v;

    invoke-interface {p1, p2}, LW8/v;->g(Ljava/lang/Throwable;)Z

    iget-object p1, p0, LG6/o;->I:LW8/v;

    invoke-interface {p1, p2}, LW8/v;->g(Ljava/lang/Throwable;)Z

    iget-object p1, p0, LG6/o;->H:LY8/j;

    invoke-interface {p1, p2}, LY8/C;->c(Ljava/lang/Throwable;)Z

    invoke-virtual {p0}, LG6/o;->j()LY8/C;

    move-result-object p1

    invoke-interface {p1, p2}, LY8/C;->c(Ljava/lang/Throwable;)Z

    :goto_2
    return-void
.end method

.method public d(LH9/F;LX9/g;)V
    .locals 2

    const-string v0, "webSocket"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bytes"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1, p2}, LH9/G;->d(LH9/F;LX9/g;)V

    iget-object p1, p0, LG6/o;->H:LY8/j;

    new-instance v0, Lg7/b$a;

    const/4 v1, 0x1

    invoke-virtual {p2}, LX9/g;->N()[B

    move-result-object p2

    invoke-direct {v0, v1, p2}, Lg7/b$a;-><init>(Z[B)V

    invoke-static {p1, v0}, LY8/q;->b(LY8/C;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public e(LH9/F;Ljava/lang/String;)V
    .locals 2

    const-string v0, "webSocket"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "text"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1, p2}, LH9/G;->e(LH9/F;Ljava/lang/String;)V

    iget-object p1, p0, LG6/o;->H:LY8/j;

    new-instance v0, Lg7/b$d;

    sget-object v1, LS8/d;->b:Ljava/nio/charset/Charset;

    invoke-virtual {p2, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p2

    const-string v1, "getBytes(...)"

    invoke-static {p2, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x1

    invoke-direct {v0, v1, p2}, Lg7/b$d;-><init>(Z[B)V

    invoke-static {p1, v0}, LY8/q;->b(LY8/C;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public f(LH9/F;LH9/B;)V
    .locals 1

    const-string v0, "webSocket"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "response"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1, p2}, LH9/G;->f(LH9/F;LH9/B;)V

    iget-object p1, p0, LG6/o;->G:LW8/v;

    invoke-interface {p1, p2}, LW8/v;->R0(Ljava/lang/Object;)Z

    return-void
.end method

.method public getCoroutineContext()Lm7/i;
    .locals 1

    iget-object v0, p0, LG6/o;->E:Lm7/i;

    return-object v0
.end method

.method public final i()LW8/v;
    .locals 1

    iget-object v0, p0, LG6/o;->G:LW8/v;

    return-object v0
.end method

.method public j()LY8/C;
    .locals 1

    iget-object v0, p0, LG6/o;->J:LY8/C;

    return-object v0
.end method

.method public final k()V
    .locals 1

    iget-object v0, p0, LG6/o;->F:LW8/v;

    invoke-interface {v0, p0}, LW8/v;->R0(Ljava/lang/Object;)Z

    return-void
.end method
