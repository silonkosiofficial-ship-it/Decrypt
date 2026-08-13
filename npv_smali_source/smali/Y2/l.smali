.class public abstract LY2/l;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(LW2/h;LW2/e;)V
    .locals 1

    .prologue
    instance-of v0, p0, LY2/s;

    if-eqz v0, :cond_0

    check-cast p0, LY2/s;

    invoke-virtual {p0}, LY2/s;->d()LY2/p;

    move-result-object p0

    invoke-virtual {p0, p1}, LY2/p;->f(LW2/e;)LY2/p;

    move-result-object p0

    invoke-static {}, LY2/u;->c()LY2/u;

    move-result-object p1

    invoke-virtual {p1}, LY2/u;->e()Lf3/r;

    move-result-object p1

    const/4 v0, 0x1

    invoke-virtual {p1, p0, v0}, Lf3/r;->u(LY2/p;I)LZ2/g;

    goto :goto_0

    :cond_0
    const-string p1, "ForcedSender"

    const-string v0, "Expected instance of `TransportImpl`, got `%s`."

    invoke-static {p1, v0, p0}, Lc3/a;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    :goto_0
    return-void
.end method
