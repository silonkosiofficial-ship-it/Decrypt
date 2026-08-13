.class public abstract synthetic Le5/d;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Le5/e;Le5/F;)Ljava/lang/Object;
    .locals 0

    .prologue
    invoke-interface {p0, p1}, Le5/e;->f(Le5/F;)LF5/b;

    move-result-object p0

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    invoke-interface {p0}, LF5/b;->get()Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static b(Le5/e;Ljava/lang/Class;)Ljava/lang/Object;
    .locals 0

    invoke-static {p1}, Le5/F;->b(Ljava/lang/Class;)Le5/F;

    move-result-object p1

    invoke-interface {p0, p1}, Le5/e;->c(Le5/F;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static c(Le5/e;Ljava/lang/Class;)LF5/a;
    .locals 0

    invoke-static {p1}, Le5/F;->b(Ljava/lang/Class;)Le5/F;

    move-result-object p1

    invoke-interface {p0, p1}, Le5/e;->e(Le5/F;)LF5/a;

    move-result-object p0

    return-object p0
.end method

.method public static d(Le5/e;Ljava/lang/Class;)LF5/b;
    .locals 0

    invoke-static {p1}, Le5/F;->b(Ljava/lang/Class;)Le5/F;

    move-result-object p1

    invoke-interface {p0, p1}, Le5/e;->f(Le5/F;)LF5/b;

    move-result-object p0

    return-object p0
.end method

.method public static e(Le5/e;Le5/F;)Ljava/util/Set;
    .locals 0

    invoke-interface {p0, p1}, Le5/e;->b(Le5/F;)LF5/b;

    move-result-object p0

    invoke-interface {p0}, LF5/b;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/Set;

    return-object p0
.end method

.method public static f(Le5/e;Ljava/lang/Class;)Ljava/util/Set;
    .locals 0

    invoke-static {p1}, Le5/F;->b(Ljava/lang/Class;)Le5/F;

    move-result-object p1

    invoke-interface {p0, p1}, Le5/e;->h(Le5/F;)Ljava/util/Set;

    move-result-object p0

    return-object p0
.end method
