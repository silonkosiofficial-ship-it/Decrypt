.class public abstract LH5/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LH5/d$a;
    }
.end annotation


# static fields
.field public static a:LH5/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    invoke-static {}, LH5/d;->a()LH5/d$a;

    move-result-object v0

    invoke-virtual {v0}, LH5/d$a;->a()LH5/d;

    move-result-object v0

    sput-object v0, LH5/d;->a:LH5/d;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()LH5/d$a;
    .locals 4

    new-instance v0, LH5/a$b;

    invoke-direct {v0}, LH5/a$b;-><init>()V

    const-wide/16 v1, 0x0

    invoke-virtual {v0, v1, v2}, LH5/a$b;->h(J)LH5/d$a;

    move-result-object v0

    sget-object v3, LH5/c$a;->C:LH5/c$a;

    invoke-virtual {v0, v3}, LH5/d$a;->g(LH5/c$a;)LH5/d$a;

    move-result-object v0

    invoke-virtual {v0, v1, v2}, LH5/d$a;->c(J)LH5/d$a;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public abstract b()Ljava/lang/String;
.end method

.method public abstract c()J
.end method

.method public abstract d()Ljava/lang/String;
.end method

.method public abstract e()Ljava/lang/String;
.end method

.method public abstract f()Ljava/lang/String;
.end method

.method public abstract g()LH5/c$a;
.end method

.method public abstract h()J
.end method

.method public i()Z
    .locals 2

    .prologue
    invoke-virtual {p0}, LH5/d;->g()LH5/c$a;

    move-result-object v0

    sget-object v1, LH5/c$a;->G:LH5/c$a;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public j()Z
    .locals 2

    .prologue
    invoke-virtual {p0}, LH5/d;->g()LH5/c$a;

    move-result-object v0

    sget-object v1, LH5/c$a;->D:LH5/c$a;

    if-eq v0, v1, :cond_1

    invoke-virtual {p0}, LH5/d;->g()LH5/c$a;

    move-result-object v0

    sget-object v1, LH5/c$a;->C:LH5/c$a;

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public k()Z
    .locals 2

    .prologue
    invoke-virtual {p0}, LH5/d;->g()LH5/c$a;

    move-result-object v0

    sget-object v1, LH5/c$a;->F:LH5/c$a;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public l()Z
    .locals 2

    .prologue
    invoke-virtual {p0}, LH5/d;->g()LH5/c$a;

    move-result-object v0

    sget-object v1, LH5/c$a;->E:LH5/c$a;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public m()Z
    .locals 2

    .prologue
    invoke-virtual {p0}, LH5/d;->g()LH5/c$a;

    move-result-object v0

    sget-object v1, LH5/c$a;->C:LH5/c$a;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public abstract n()LH5/d$a;
.end method

.method public o(Ljava/lang/String;JJ)LH5/d;
    .locals 1

    invoke-virtual {p0}, LH5/d;->n()LH5/d$a;

    move-result-object v0

    invoke-virtual {v0, p1}, LH5/d$a;->b(Ljava/lang/String;)LH5/d$a;

    move-result-object p1

    invoke-virtual {p1, p2, p3}, LH5/d$a;->c(J)LH5/d$a;

    move-result-object p1

    invoke-virtual {p1, p4, p5}, LH5/d$a;->h(J)LH5/d$a;

    move-result-object p1

    invoke-virtual {p1}, LH5/d$a;->a()LH5/d;

    move-result-object p1

    return-object p1
.end method

.method public p()LH5/d;
    .locals 2

    invoke-virtual {p0}, LH5/d;->n()LH5/d$a;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, LH5/d$a;->b(Ljava/lang/String;)LH5/d$a;

    move-result-object v0

    invoke-virtual {v0}, LH5/d$a;->a()LH5/d;

    move-result-object v0

    return-object v0
.end method

.method public q(Ljava/lang/String;)LH5/d;
    .locals 1

    invoke-virtual {p0}, LH5/d;->n()LH5/d$a;

    move-result-object v0

    invoke-virtual {v0, p1}, LH5/d$a;->e(Ljava/lang/String;)LH5/d$a;

    move-result-object p1

    sget-object v0, LH5/c$a;->G:LH5/c$a;

    invoke-virtual {p1, v0}, LH5/d$a;->g(LH5/c$a;)LH5/d$a;

    move-result-object p1

    invoke-virtual {p1}, LH5/d$a;->a()LH5/d;

    move-result-object p1

    return-object p1
.end method

.method public r()LH5/d;
    .locals 2

    invoke-virtual {p0}, LH5/d;->n()LH5/d$a;

    move-result-object v0

    sget-object v1, LH5/c$a;->D:LH5/c$a;

    invoke-virtual {v0, v1}, LH5/d$a;->g(LH5/c$a;)LH5/d$a;

    move-result-object v0

    invoke-virtual {v0}, LH5/d$a;->a()LH5/d;

    move-result-object v0

    return-object v0
.end method

.method public s(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;J)LH5/d;
    .locals 1

    invoke-virtual {p0}, LH5/d;->n()LH5/d$a;

    move-result-object v0

    invoke-virtual {v0, p1}, LH5/d$a;->d(Ljava/lang/String;)LH5/d$a;

    move-result-object p1

    sget-object v0, LH5/c$a;->F:LH5/c$a;

    invoke-virtual {p1, v0}, LH5/d$a;->g(LH5/c$a;)LH5/d$a;

    move-result-object p1

    invoke-virtual {p1, p5}, LH5/d$a;->b(Ljava/lang/String;)LH5/d$a;

    move-result-object p1

    invoke-virtual {p1, p2}, LH5/d$a;->f(Ljava/lang/String;)LH5/d$a;

    move-result-object p1

    invoke-virtual {p1, p6, p7}, LH5/d$a;->c(J)LH5/d$a;

    move-result-object p1

    invoke-virtual {p1, p3, p4}, LH5/d$a;->h(J)LH5/d$a;

    move-result-object p1

    invoke-virtual {p1}, LH5/d$a;->a()LH5/d;

    move-result-object p1

    return-object p1
.end method

.method public t(Ljava/lang/String;)LH5/d;
    .locals 1

    invoke-virtual {p0}, LH5/d;->n()LH5/d$a;

    move-result-object v0

    invoke-virtual {v0, p1}, LH5/d$a;->d(Ljava/lang/String;)LH5/d$a;

    move-result-object p1

    sget-object v0, LH5/c$a;->E:LH5/c$a;

    invoke-virtual {p1, v0}, LH5/d$a;->g(LH5/c$a;)LH5/d$a;

    move-result-object p1

    invoke-virtual {p1}, LH5/d$a;->a()LH5/d;

    move-result-object p1

    return-object p1
.end method
