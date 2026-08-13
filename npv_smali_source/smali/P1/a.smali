.class public abstract LP1/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Ljava/lang/String;LN1/b;Lx7/l;LW8/N;)LB7/c;
    .locals 1

    const-string v0, "name"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "produceMigrations"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scope"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LP1/c;

    invoke-direct {v0, p0, p1, p2, p3}, LP1/c;-><init>(Ljava/lang/String;LN1/b;Lx7/l;LW8/N;)V

    return-object v0
.end method

.method public static synthetic b(Ljava/lang/String;LN1/b;Lx7/l;LW8/N;ILjava/lang/Object;)LB7/c;
    .locals 1

    .prologue
    and-int/lit8 p5, p4, 0x2

    const/4 v0, 0x0

    if-eqz p5, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p5, p4, 0x4

    if-eqz p5, :cond_1

    sget-object p2, LP1/a$a;->D:LP1/a$a;

    :cond_1
    and-int/lit8 p4, p4, 0x8

    if-eqz p4, :cond_2

    invoke-static {}, LW8/d0;->b()LW8/J;

    move-result-object p3

    const/4 p4, 0x1

    invoke-static {v0, p4, v0}, LW8/U0;->b(LW8/z0;ILjava/lang/Object;)LW8/y;

    move-result-object p4

    invoke-virtual {p3, p4}, Lm7/a;->o0(Lm7/i;)Lm7/i;

    move-result-object p3

    invoke-static {p3}, LW8/O;->a(Lm7/i;)LW8/N;

    move-result-object p3

    :cond_2
    invoke-static {p0, p1, p2, p3}, LP1/a;->a(Ljava/lang/String;LN1/b;Lx7/l;LW8/N;)LB7/c;

    move-result-object p0

    return-object p0
.end method
