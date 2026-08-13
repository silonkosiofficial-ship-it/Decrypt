.class public abstract LR7/u;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LO7/e;LF8/l0;LG8/g;)Ly8/h;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "typeSubstitution"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "kotlinTypeRefiner"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LR7/t;->C:LR7/t$a;

    invoke-virtual {v0, p0, p1, p2}, LR7/t$a;->a(LO7/e;LF8/l0;LG8/g;)Ly8/h;

    move-result-object p0

    return-object p0
.end method

.method public static final b(LO7/e;LG8/g;)Ly8/h;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "kotlinTypeRefiner"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LR7/t;->C:LR7/t$a;

    invoke-virtual {v0, p0, p1}, LR7/t$a;->b(LO7/e;LG8/g;)Ly8/h;

    move-result-object p0

    return-object p0
.end method
