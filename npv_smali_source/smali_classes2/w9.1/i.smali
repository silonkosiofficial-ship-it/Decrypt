.class public abstract synthetic Lw9/i;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Lw9/j;Lv9/f;I)Lw9/f;
    .locals 0

    const-string p2, "descriptor"

    invoke-static {p1, p2}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lw9/j;->a(Lv9/f;)Lw9/f;

    move-result-object p0

    return-object p0
.end method

.method public static b(Lw9/j;)V
    .locals 0

    return-void
.end method

.method public static c(Lw9/j;Lt9/e;Ljava/lang/Object;)V
    .locals 1

    .prologue
    const-string v0, "serializer"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Lt9/e;->a()Lv9/f;

    move-result-object v0

    invoke-interface {v0}, Lv9/f;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p0, p1, p2}, Lw9/j;->t(Lt9/e;Ljava/lang/Object;)V

    return-void

    :cond_0
    if-nez p2, :cond_1

    invoke-interface {p0}, Lw9/j;->d()V

    goto :goto_0

    :cond_1
    invoke-interface {p0}, Lw9/j;->q()V

    invoke-interface {p0, p1, p2}, Lw9/j;->t(Lt9/e;Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public static d(Lw9/j;Lt9/e;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "serializer"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1, p0, p2}, Lt9/e;->e(Lw9/j;Ljava/lang/Object;)V

    return-void
.end method
