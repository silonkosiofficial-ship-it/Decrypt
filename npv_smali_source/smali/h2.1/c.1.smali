.class public abstract Lh2/c;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LZ8/f;LW8/N;)LZ8/f;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scope"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-static {p0, p1, v0}, Lh2/c;->b(LZ8/f;LW8/N;Lh2/a;)LZ8/f;

    move-result-object p0

    return-object p0
.end method

.method public static final b(LZ8/f;LW8/N;Lh2/a;)LZ8/f;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scope"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lh2/c$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p1, p2}, Lh2/c$b;-><init>(Lm7/e;LW8/N;Lh2/a;)V

    invoke-static {p0, v0}, Lh2/k;->d(LZ8/f;Lx7/q;)LZ8/f;

    move-result-object p0

    new-instance v0, Lh2/c$c;

    invoke-direct {v0, v1}, Lh2/c$c;-><init>(Lm7/e;)V

    invoke-static {p0, v0}, Lh2/k;->b(LZ8/f;Lx7/q;)LZ8/f;

    move-result-object p0

    new-instance v0, Lh2/c$a;

    invoke-direct {v0, p0}, Lh2/c$a;-><init>(LZ8/f;)V

    new-instance p0, Lh2/c$d;

    invoke-direct {p0, p2, v1}, Lh2/c$d;-><init>(Lh2/a;Lm7/e;)V

    invoke-static {v0, p0}, LZ8/h;->H(LZ8/f;Lx7/p;)LZ8/f;

    move-result-object p0

    new-instance v0, Lh2/c$e;

    invoke-direct {v0, p2, v1}, Lh2/c$e;-><init>(Lh2/a;Lm7/e;)V

    invoke-static {p0, v0}, LZ8/h;->F(LZ8/f;Lx7/q;)LZ8/f;

    move-result-object p0

    sget-object p2, LZ8/I;->a:LZ8/I$a;

    invoke-virtual {p2}, LZ8/I$a;->d()LZ8/I;

    move-result-object p2

    const/4 v0, 0x1

    invoke-static {p0, p1, p2, v0}, LZ8/h;->K(LZ8/f;LW8/N;LZ8/I;I)LZ8/C;

    move-result-object p0

    return-object p0
.end method
