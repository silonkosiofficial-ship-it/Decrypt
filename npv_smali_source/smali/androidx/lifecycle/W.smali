.class public abstract synthetic Landroidx/lifecycle/W;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Landroidx/lifecycle/V$c;LF7/c;Lc2/a;)Landroidx/lifecycle/T;
    .locals 1

    const-string v0, "modelClass"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "extras"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lw7/a;->b(LF7/c;)Ljava/lang/Class;

    move-result-object p1

    invoke-interface {p0, p1, p2}, Landroidx/lifecycle/V$c;->c(Ljava/lang/Class;Lc2/a;)Landroidx/lifecycle/T;

    move-result-object p0

    return-object p0
.end method

.method public static b(Landroidx/lifecycle/V$c;Ljava/lang/Class;)Landroidx/lifecycle/T;
    .locals 0

    const-string p0, "modelClass"

    invoke-static {p1, p0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Le2/g;->a:Le2/g;

    invoke-virtual {p0}, Le2/g;->f()Landroidx/lifecycle/T;

    move-result-object p0

    return-object p0
.end method

.method public static c(Landroidx/lifecycle/V$c;Ljava/lang/Class;Lc2/a;)Landroidx/lifecycle/T;
    .locals 1

    const-string v0, "modelClass"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "extras"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Landroidx/lifecycle/V$c;->a(Ljava/lang/Class;)Landroidx/lifecycle/T;

    move-result-object p0

    return-object p0
.end method
