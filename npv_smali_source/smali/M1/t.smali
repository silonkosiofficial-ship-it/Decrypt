.class public final LM1/t;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:LW8/N;

.field private final b:Lx7/p;

.field private final c:LY8/j;

.field private final d:LM1/a;


# direct methods
.method public constructor <init>(LW8/N;Lx7/l;Lx7/p;Lx7/p;)V
    .locals 2

    .prologue
    const-string v0, "scope"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onComplete"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onUndeliveredElement"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "consumeMessage"

    invoke-static {p4, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LM1/t;->a:LW8/N;

    iput-object p4, p0, LM1/t;->b:Lx7/p;

    const/4 p4, 0x0

    const/4 v0, 0x6

    const v1, 0x7fffffff

    invoke-static {v1, p4, p4, v0, p4}, LY8/m;->b(ILY8/d;Lx7/l;ILjava/lang/Object;)LY8/j;

    move-result-object p4

    iput-object p4, p0, LM1/t;->c:LY8/j;

    new-instance p4, LM1/a;

    const/4 v0, 0x0

    invoke-direct {p4, v0}, LM1/a;-><init>(I)V

    iput-object p4, p0, LM1/t;->d:LM1/a;

    invoke-interface {p1}, LW8/N;->getCoroutineContext()Lm7/i;

    move-result-object p1

    sget-object p4, LW8/z0;->h:LW8/z0$b;

    invoke-interface {p1, p4}, Lm7/i;->i(Lm7/i$c;)Lm7/i$b;

    move-result-object p1

    check-cast p1, LW8/z0;

    if-eqz p1, :cond_0

    new-instance p4, LM1/t$a;

    invoke-direct {p4, p2, p0, p3}, LM1/t$a;-><init>(Lx7/l;LM1/t;Lx7/p;)V

    invoke-interface {p1, p4}, LW8/z0;->e1(Lx7/l;)LW8/f0;

    :cond_0
    return-void
.end method

.method public static final synthetic a(LM1/t;)Lx7/p;
    .locals 0

    iget-object p0, p0, LM1/t;->b:Lx7/p;

    return-object p0
.end method

.method public static final synthetic b(LM1/t;)LY8/j;
    .locals 0

    iget-object p0, p0, LM1/t;->c:LY8/j;

    return-object p0
.end method

.method public static final synthetic c(LM1/t;)LM1/a;
    .locals 0

    iget-object p0, p0, LM1/t;->d:LM1/a;

    return-object p0
.end method

.method public static final synthetic d(LM1/t;)LW8/N;
    .locals 0

    iget-object p0, p0, LM1/t;->a:LW8/N;

    return-object p0
.end method


# virtual methods
.method public final e(Ljava/lang/Object;)V
    .locals 6

    .prologue
    iget-object v0, p0, LM1/t;->c:LY8/j;

    invoke-interface {v0, p1}, LY8/C;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, LY8/n$a;

    if-eqz v0, :cond_1

    invoke-static {p1}, LY8/n;->e(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    if-nez p1, :cond_0

    new-instance p1, LY8/u;

    const-string v0, "Channel was closed normally"

    invoke-direct {p1, v0}, LY8/u;-><init>(Ljava/lang/String;)V

    :cond_0
    throw p1

    :cond_1
    invoke-static {p1}, LY8/n;->j(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    iget-object p1, p0, LM1/t;->d:LM1/a;

    invoke-virtual {p1}, LM1/a;->c()I

    move-result p1

    if-nez p1, :cond_2

    iget-object v0, p0, LM1/t;->a:LW8/N;

    new-instance v3, LM1/t$b;

    const/4 p1, 0x0

    invoke-direct {v3, p0, p1}, LM1/t$b;-><init>(LM1/t;Lm7/e;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, LW8/g;->d(LW8/N;Lm7/i;LW8/P;Lx7/p;ILjava/lang/Object;)LW8/z0;

    :cond_2
    return-void

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Check failed."

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
