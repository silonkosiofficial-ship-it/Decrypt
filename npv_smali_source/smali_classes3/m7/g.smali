.class public abstract Lm7/g;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lx7/p;Ljava/lang/Object;Lm7/e;)Lm7/e;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "completion"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lm7/k;

    invoke-static {p0, p1, p2}, Ln7/b;->b(Lx7/p;Ljava/lang/Object;Lm7/e;)Lm7/e;

    move-result-object p0

    invoke-static {p0}, Ln7/b;->d(Lm7/e;)Lm7/e;

    move-result-object p0

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object p1

    invoke-direct {v0, p0, p1}, Lm7/k;-><init>(Lm7/e;Ljava/lang/Object;)V

    return-object v0
.end method

.method public static final b(Lx7/p;Ljava/lang/Object;Lm7/e;)V
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "completion"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1, p2}, Ln7/b;->b(Lx7/p;Ljava/lang/Object;Lm7/e;)Lm7/e;

    move-result-object p0

    invoke-static {p0}, Ln7/b;->d(Lm7/e;)Lm7/e;

    move-result-object p0

    sget-object p1, Li7/w;->D:Li7/w$a;

    sget-object p1, Li7/M;->a:Li7/M;

    invoke-static {p1}, Li7/w;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {p0, p1}, Lm7/e;->t(Ljava/lang/Object;)V

    return-void
.end method
