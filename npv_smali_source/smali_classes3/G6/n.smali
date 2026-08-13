.class public final LG6/n;
.super LW9/b;
.source "SourceFile"

# interfaces
.implements LW8/N;


# instance fields
.field private final C:Lm7/i;

.field private final D:LW9/a;

.field private final E:LW8/v;

.field private final F:LY8/j;


# direct methods
.method public constructor <init>(LH9/x;LH9/z;Lm7/i;)V
    .locals 1

    const-string v0, "engine"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "engineRequest"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "coroutineContext"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LW9/b;-><init>()V

    iput-object p3, p0, LG6/n;->C:Lm7/i;

    invoke-static {p1}, LW9/d;->b(LH9/x;)LW9/a$a;

    move-result-object p1

    invoke-interface {p1, p2, p0}, LW9/a$a;->a(LH9/z;LW9/b;)LW9/a;

    move-result-object p1

    iput-object p1, p0, LG6/n;->D:LW9/a;

    const/4 p1, 0x1

    const/4 p2, 0x0

    invoke-static {p2, p1, p2}, LW8/x;->b(LW8/z0;ILjava/lang/Object;)LW8/v;

    move-result-object p1

    iput-object p1, p0, LG6/n;->E:LW8/v;

    const/16 p1, 0x8

    const/4 p3, 0x6

    invoke-static {p1, p2, p2, p3, p2}, LY8/m;->b(ILY8/d;Lx7/l;ILjava/lang/Object;)LY8/j;

    move-result-object p1

    iput-object p1, p0, LG6/n;->F:LY8/j;

    return-void
.end method

.method private final f(LH9/B;)LM6/b;
    .locals 10

    .prologue
    if-nez p1, :cond_1

    :cond_0
    invoke-static {}, LG6/n;->g()LM6/b;

    move-result-object p1

    goto/16 :goto_2

    :cond_1
    invoke-virtual {p1}, LH9/B;->o()I

    move-result v0

    sget-object v1, LT6/C;->E:LT6/C$a;

    invoke-virtual {v1}, LT6/C$a;->A()LT6/C;

    move-result-object v2

    invoke-virtual {v2}, LT6/C;->m0()I

    move-result v2

    const-string v3, " but was "

    if-eq v0, v2, :cond_2

    new-instance v0, LM6/b;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Expected status code "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, LT6/C$a;->A()LT6/C;

    move-result-object v1

    invoke-virtual {v1}, LT6/C;->m0()I

    move-result v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, LH9/B;->o()I

    move-result p1

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    const/4 v8, 0x3

    const/4 v9, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v4, v0

    invoke-direct/range {v4 .. v9}, LM6/b;-><init>(LQ6/c;Ljava/lang/Throwable;Ljava/lang/String;ILy7/k;)V

    :goto_0
    move-object p1, v0

    goto :goto_2

    :cond_2
    invoke-virtual {p1}, LH9/B;->H()LH9/t;

    move-result-object v0

    sget-object v1, LT6/v;->a:LT6/v;

    invoke-virtual {v1}, LT6/v;->h()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, LH9/t;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_3

    sget-object v2, LT6/h;->f:LT6/h$b;

    invoke-virtual {v2, v0}, LT6/h$b;->b(Ljava/lang/String;)LT6/h;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {v0}, LT6/h;->h()LT6/h;

    move-result-object v0

    goto :goto_1

    :cond_3
    const/4 v0, 0x0

    :goto_1
    sget-object v2, LT6/h$d;->a:LT6/h$d;

    invoke-virtual {v2}, LT6/h$d;->a()LT6/h;

    move-result-object v4

    invoke-static {v0, v4}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, LM6/b;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Content type must be "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, LT6/h$d;->a()LT6/h;

    move-result-object v2

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, LH9/B;->H()LH9/t;

    move-result-object p1

    invoke-virtual {v1}, LT6/v;->h()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, LH9/t;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    const/4 v8, 0x3

    const/4 v9, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v4, v0

    invoke-direct/range {v4 .. v9}, LM6/b;-><init>(LQ6/c;Ljava/lang/Throwable;Ljava/lang/String;ILy7/k;)V

    goto :goto_0

    :goto_2
    return-object p1
.end method

.method private static final g()LM6/b;
    .locals 7

    new-instance v6, LM6/b;

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const-string v3, "Unexpected error occurred in OkHttpSSESession"

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, LM6/b;-><init>(LQ6/c;Ljava/lang/Throwable;Ljava/lang/String;ILy7/k;)V

    return-object v6
.end method


# virtual methods
.method public a(LW9/a;)V
    .locals 2

    const-string v0, "eventSource"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, LG6/n;->F:LY8/j;

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {p1, v0, v1, v0}, LY8/C$a;->a(LY8/C;Ljava/lang/Throwable;ILjava/lang/Object;)Z

    iget-object p1, p0, LG6/n;->D:LW9/a;

    invoke-interface {p1}, LW9/a;->cancel()V

    return-void
.end method

.method public b(LW9/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 9

    const-string v0, "eventSource"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "data"

    invoke-static {p4, p1}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, LG6/n;->F:LY8/j;

    new-instance v8, LV6/a;

    const/16 v6, 0x18

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, v8

    move-object v1, p4

    move-object v2, p3

    move-object v3, p2

    invoke-direct/range {v0 .. v7}, LV6/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;ILy7/k;)V

    invoke-static {p1, v8}, LY8/q;->b(LY8/C;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public c(LW9/a;Ljava/lang/Throwable;LH9/B;)V
    .locals 7

    .prologue
    const-string v0, "eventSource"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

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
    if-eqz p3, :cond_1

    invoke-virtual {p3}, LH9/B;->H()LH9/t;

    move-result-object v1

    if-eqz v1, :cond_1

    sget-object v2, LT6/v;->a:LT6/v;

    invoke-virtual {v2}, LT6/v;->h()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, LH9/t;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    goto :goto_1

    :cond_1
    move-object v1, p1

    :goto_1
    if-eqz p3, :cond_4

    sget-object v2, LT6/C;->E:LT6/C$a;

    invoke-virtual {v2}, LT6/C$a;->A()LT6/C;

    move-result-object v2

    invoke-virtual {v2}, LT6/C;->m0()I

    move-result v2

    if-nez v0, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-ne v0, v2, :cond_3

    sget-object v0, LT6/h$d;->a:LT6/h$d;

    invoke-virtual {v0}, LT6/h$d;->a()LT6/h;

    move-result-object v0

    invoke-virtual {v0}, LT6/n;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    :cond_3
    :goto_2
    iget-object p2, p0, LG6/n;->E:LW8/v;

    invoke-interface {p2, p3}, LW8/v;->R0(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_4
    if-eqz p2, :cond_5

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Exception during OkHttpSSESession: "

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    new-instance p3, LM6/b;

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v2, 0x0

    move-object v1, p3

    move-object v3, p2

    invoke-direct/range {v1 .. v6}, LM6/b;-><init>(LQ6/c;Ljava/lang/Throwable;Ljava/lang/String;ILy7/k;)V

    goto :goto_3

    :cond_5
    invoke-direct {p0, p3}, LG6/n;->f(LH9/B;)LM6/b;

    move-result-object p3

    :goto_3
    iget-object p2, p0, LG6/n;->E:LW8/v;

    invoke-interface {p2, p3}, LW8/v;->g(Ljava/lang/Throwable;)Z

    :goto_4
    iget-object p2, p0, LG6/n;->F:LY8/j;

    const/4 p3, 0x1

    invoke-static {p2, p1, p3, p1}, LY8/C$a;->a(LY8/C;Ljava/lang/Throwable;ILjava/lang/Object;)Z

    iget-object p1, p0, LG6/n;->D:LW9/a;

    invoke-interface {p1}, LW9/a;->cancel()V

    return-void
.end method

.method public d(LW9/a;LH9/B;)V
    .locals 1

    const-string v0, "eventSource"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "response"

    invoke-static {p2, p1}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, LG6/n;->E:LW8/v;

    invoke-interface {p1, p2}, LW8/v;->R0(Ljava/lang/Object;)Z

    return-void
.end method

.method public final e()LW8/v;
    .locals 1

    iget-object v0, p0, LG6/n;->E:LW8/v;

    return-object v0
.end method

.method public getCoroutineContext()Lm7/i;
    .locals 1

    iget-object v0, p0, LG6/n;->C:Lm7/i;

    return-object v0
.end method
