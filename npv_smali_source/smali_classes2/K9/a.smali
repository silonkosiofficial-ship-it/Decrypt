.class public final LK9/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LH9/v;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LK9/a$a;
    }
.end annotation


# static fields
.field public static final a:LK9/a$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LK9/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LK9/a$a;-><init>(Ly7/k;)V

    sput-object v0, LK9/a;->a:LK9/a$a;

    return-void
.end method

.method public constructor <init>(LH9/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LH9/v$a;)LH9/B;
    .locals 6

    .prologue
    const-string v0, "chain"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, LH9/v$a;->call()LH9/e;

    move-result-object v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    new-instance v3, LK9/b$b;

    invoke-interface {p1}, LH9/v$a;->b()LH9/z;

    move-result-object v4

    const/4 v5, 0x0

    invoke-direct {v3, v1, v2, v4, v5}, LK9/b$b;-><init>(JLH9/z;LH9/B;)V

    invoke-virtual {v3}, LK9/b$b;->b()LK9/b;

    move-result-object v1

    invoke-virtual {v1}, LK9/b;->b()LH9/z;

    move-result-object v2

    invoke-virtual {v1}, LK9/b;->a()LH9/B;

    move-result-object v1

    instance-of v3, v0, LM9/e;

    if-eqz v3, :cond_0

    move-object v3, v0

    check-cast v3, LM9/e;

    goto :goto_0

    :cond_0
    move-object v3, v5

    :goto_0
    if-eqz v3, :cond_1

    invoke-virtual {v3}, LM9/e;->p()LH9/r;

    move-result-object v3

    if-nez v3, :cond_2

    :cond_1
    sget-object v3, LH9/r;->b:LH9/r;

    :cond_2
    if-nez v2, :cond_3

    if-nez v1, :cond_3

    new-instance v1, LH9/B$a;

    invoke-direct {v1}, LH9/B$a;-><init>()V

    invoke-interface {p1}, LH9/v$a;->b()LH9/z;

    move-result-object p1

    invoke-virtual {v1, p1}, LH9/B$a;->r(LH9/z;)LH9/B$a;

    move-result-object p1

    sget-object v1, LH9/y;->F:LH9/y;

    invoke-virtual {p1, v1}, LH9/B$a;->p(LH9/y;)LH9/B$a;

    move-result-object p1

    const/16 v1, 0x1f8

    invoke-virtual {p1, v1}, LH9/B$a;->g(I)LH9/B$a;

    move-result-object p1

    const-string v1, "Unsatisfiable Request (only-if-cached)"

    invoke-virtual {p1, v1}, LH9/B$a;->m(Ljava/lang/String;)LH9/B$a;

    move-result-object p1

    sget-object v1, LI9/d;->c:LH9/C;

    invoke-virtual {p1, v1}, LH9/B$a;->b(LH9/C;)LH9/B$a;

    move-result-object p1

    const-wide/16 v1, -0x1

    invoke-virtual {p1, v1, v2}, LH9/B$a;->s(J)LH9/B$a;

    move-result-object p1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {p1, v1, v2}, LH9/B$a;->q(J)LH9/B$a;

    move-result-object p1

    invoke-virtual {p1}, LH9/B$a;->c()LH9/B;

    move-result-object p1

    invoke-virtual {v3, v0, p1}, LH9/r;->z(LH9/e;LH9/B;)V

    return-object p1

    :cond_3
    if-nez v2, :cond_4

    invoke-static {v1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v1}, LH9/B;->g0()LH9/B$a;

    move-result-object p1

    sget-object v2, LK9/a;->a:LK9/a$a;

    invoke-static {v2, v1}, LK9/a$a;->b(LK9/a$a;LH9/B;)LH9/B;

    move-result-object v1

    invoke-virtual {p1, v1}, LH9/B$a;->d(LH9/B;)LH9/B$a;

    move-result-object p1

    invoke-virtual {p1}, LH9/B$a;->c()LH9/B;

    move-result-object p1

    invoke-virtual {v3, v0, p1}, LH9/r;->b(LH9/e;LH9/B;)V

    return-object p1

    :cond_4
    if-eqz v1, :cond_5

    invoke-virtual {v3, v0, v1}, LH9/r;->a(LH9/e;LH9/B;)V

    :cond_5
    invoke-interface {p1, v2}, LH9/v$a;->a(LH9/z;)LH9/B;

    move-result-object p1

    if-eqz v1, :cond_8

    if-eqz p1, :cond_7

    invoke-virtual {p1}, LH9/B;->o()I

    move-result v0

    const/16 v2, 0x130

    if-eq v0, v2, :cond_6

    goto :goto_1

    :cond_6
    invoke-virtual {v1}, LH9/B;->g0()LH9/B$a;

    move-result-object v0

    sget-object v2, LK9/a;->a:LK9/a$a;

    invoke-virtual {v1}, LH9/B;->H()LH9/t;

    move-result-object v3

    invoke-virtual {p1}, LH9/B;->H()LH9/t;

    move-result-object v4

    invoke-static {v2, v3, v4}, LK9/a$a;->a(LK9/a$a;LH9/t;LH9/t;)LH9/t;

    move-result-object v3

    invoke-virtual {v0, v3}, LH9/B$a;->k(LH9/t;)LH9/B$a;

    move-result-object v0

    invoke-virtual {p1}, LH9/B;->s0()J

    move-result-wide v3

    invoke-virtual {v0, v3, v4}, LH9/B$a;->s(J)LH9/B$a;

    move-result-object v0

    invoke-virtual {p1}, LH9/B;->q0()J

    move-result-wide v3

    invoke-virtual {v0, v3, v4}, LH9/B$a;->q(J)LH9/B$a;

    move-result-object v0

    invoke-static {v2, v1}, LK9/a$a;->b(LK9/a$a;LH9/B;)LH9/B;

    move-result-object v1

    invoke-virtual {v0, v1}, LH9/B$a;->d(LH9/B;)LH9/B$a;

    move-result-object v0

    invoke-static {v2, p1}, LK9/a$a;->b(LK9/a$a;LH9/B;)LH9/B;

    move-result-object v1

    invoke-virtual {v0, v1}, LH9/B$a;->n(LH9/B;)LH9/B$a;

    move-result-object v0

    invoke-virtual {v0}, LH9/B$a;->c()LH9/B;

    invoke-virtual {p1}, LH9/B;->a()LH9/C;

    move-result-object p1

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p1}, LH9/C;->close()V

    invoke-static {v5}, Ly7/t;->c(Ljava/lang/Object;)V

    throw v5

    :cond_7
    :goto_1
    invoke-virtual {v1}, LH9/B;->a()LH9/C;

    move-result-object v0

    if-eqz v0, :cond_8

    invoke-static {v0}, LI9/d;->m(Ljava/io/Closeable;)V

    :cond_8
    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p1}, LH9/B;->g0()LH9/B$a;

    move-result-object v0

    sget-object v2, LK9/a;->a:LK9/a$a;

    invoke-static {v2, v1}, LK9/a$a;->b(LK9/a$a;LH9/B;)LH9/B;

    move-result-object v1

    invoke-virtual {v0, v1}, LH9/B$a;->d(LH9/B;)LH9/B$a;

    move-result-object v0

    invoke-static {v2, p1}, LK9/a$a;->b(LK9/a$a;LH9/B;)LH9/B;

    move-result-object p1

    invoke-virtual {v0, p1}, LH9/B$a;->n(LH9/B;)LH9/B$a;

    move-result-object p1

    invoke-virtual {p1}, LH9/B$a;->c()LH9/B;

    move-result-object p1

    return-object p1
.end method
