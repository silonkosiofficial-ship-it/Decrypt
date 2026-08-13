.class final LI7/y$f;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LI7/y;-><init>(LI7/n;Ljava/lang/String;Ljava/lang/String;LO7/U;Ljava/lang/Object;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LI7/y;


# direct methods
.method constructor <init>(LI7/y;)V
    .locals 0

    iput-object p1, p0, LI7/y$f;->D:LI7/y;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/reflect/Field;
    .locals 10

    .prologue
    sget-object v0, LI7/I;->a:LI7/I;

    iget-object v1, p0, LI7/y$f;->D:LI7/y;

    invoke-virtual {v1}, LI7/y;->I()LO7/U;

    move-result-object v1

    invoke-virtual {v0, v1}, LI7/I;->f(LO7/U;)LI7/i;

    move-result-object v0

    instance-of v1, v0, LI7/i$c;

    const/4 v2, 0x0

    if-eqz v1, :cond_3

    check-cast v0, LI7/i$c;

    invoke-virtual {v0}, LI7/i$c;->b()LO7/U;

    move-result-object v1

    sget-object v3, Lm8/i;->a:Lm8/i;

    invoke-virtual {v0}, LI7/i$c;->e()Li8/n;

    move-result-object v4

    invoke-virtual {v0}, LI7/i$c;->d()Lk8/c;

    move-result-object v5

    invoke-virtual {v0}, LI7/i$c;->g()Lk8/g;

    move-result-object v6

    const/16 v8, 0x8

    const/4 v9, 0x0

    const/4 v7, 0x0

    invoke-static/range {v3 .. v9}, Lm8/i;->d(Lm8/i;Li8/n;Lk8/c;Lk8/g;ZILjava/lang/Object;)Lm8/d$a;

    move-result-object v3

    if-eqz v3, :cond_6

    iget-object v4, p0, LI7/y$f;->D:LI7/y;

    invoke-static {v1}, LX7/k;->e(LO7/U;)Z

    move-result v5

    if-nez v5, :cond_2

    invoke-virtual {v0}, LI7/i$c;->e()Li8/n;

    move-result-object v0

    invoke-static {v0}, Lm8/i;->f(Li8/n;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {v1}, LO7/i0;->b()LO7/m;

    move-result-object v0

    instance-of v1, v0, LO7/e;

    if-eqz v1, :cond_1

    check-cast v0, LO7/e;

    invoke-static {v0}, LI7/M;->q(LO7/e;)Ljava/lang/Class;

    move-result-object v0

    goto :goto_1

    :cond_1
    invoke-virtual {v4}, LI7/y;->t()LI7/n;

    move-result-object v0

    invoke-interface {v0}, Ly7/h;->e()Ljava/lang/Class;

    move-result-object v0

    goto :goto_1

    :cond_2
    :goto_0
    invoke-virtual {v4}, LI7/y;->t()LI7/n;

    move-result-object v0

    invoke-interface {v0}, Ly7/h;->e()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getEnclosingClass()Ljava/lang/Class;

    move-result-object v0

    :goto_1
    if-eqz v0, :cond_6

    :try_start_0
    invoke-virtual {v3}, Lm8/d$a;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v2
    :try_end_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :cond_3
    instance-of v1, v0, LI7/i$a;

    if-eqz v1, :cond_4

    check-cast v0, LI7/i$a;

    invoke-virtual {v0}, LI7/i$a;->b()Ljava/lang/reflect/Field;

    move-result-object v2

    goto :goto_2

    :cond_4
    instance-of v1, v0, LI7/i$b;

    if-eqz v1, :cond_5

    goto :goto_2

    :cond_5
    instance-of v0, v0, LI7/i$d;

    if-eqz v0, :cond_7

    :catch_0
    :cond_6
    :goto_2
    return-object v2

    :cond_7
    new-instance v0, Li7/s;

    invoke-direct {v0}, Li7/s;-><init>()V

    throw v0
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LI7/y$f;->a()Ljava/lang/reflect/Field;

    move-result-object v0

    return-object v0
.end method
