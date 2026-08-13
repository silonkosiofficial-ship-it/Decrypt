.class public abstract LI6/j;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LT6/h;LO6/d;Ljava/lang/Object;)LU6/b;
    .locals 1

    .prologue
    const-string v0, "context"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "body"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p2, Ljava/io/InputStream;

    if-eqz v0, :cond_0

    new-instance v0, LI6/j$a;

    invoke-direct {v0, p1, p0, p2}, LI6/j$a;-><init>(LO6/d;LT6/h;Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public static final b(LC6/c;)V
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LC6/c;->H()LQ6/f;

    move-result-object p0

    sget-object v0, LQ6/f;->g:LQ6/f$a;

    invoke-virtual {v0}, LQ6/f$a;->a()La7/i;

    move-result-object v0

    new-instance v1, LI6/j$b;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, LI6/j$b;-><init>(Lm7/e;)V

    invoke-virtual {p0, v0, v1}, La7/d;->l(La7/i;Lx7/q;)V

    return-void
.end method
