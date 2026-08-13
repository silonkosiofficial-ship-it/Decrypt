.class public abstract LM5/h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LM5/h$a;
    }
.end annotation


# direct methods
.method public static synthetic a(Ljava/lang/String;LM5/h$a;Le5/e;)LM5/f;
    .locals 0

    invoke-static {p0, p1, p2}, LM5/h;->d(Ljava/lang/String;LM5/h$a;Le5/e;)LM5/f;

    move-result-object p0

    return-object p0
.end method

.method public static b(Ljava/lang/String;Ljava/lang/String;)Le5/c;
    .locals 0

    invoke-static {p0, p1}, LM5/f;->a(Ljava/lang/String;Ljava/lang/String;)LM5/f;

    move-result-object p0

    const-class p1, LM5/f;

    invoke-static {p0, p1}, Le5/c;->l(Ljava/lang/Object;Ljava/lang/Class;)Le5/c;

    move-result-object p0

    return-object p0
.end method

.method public static c(Ljava/lang/String;LM5/h$a;)Le5/c;
    .locals 2

    const-class v0, LM5/f;

    invoke-static {v0}, Le5/c;->m(Ljava/lang/Class;)Le5/c$b;

    move-result-object v0

    const-class v1, Landroid/content/Context;

    invoke-static {v1}, Le5/r;->j(Ljava/lang/Class;)Le5/r;

    move-result-object v1

    invoke-virtual {v0, v1}, Le5/c$b;->b(Le5/r;)Le5/c$b;

    move-result-object v0

    new-instance v1, LM5/g;

    invoke-direct {v1, p0, p1}, LM5/g;-><init>(Ljava/lang/String;LM5/h$a;)V

    invoke-virtual {v0, v1}, Le5/c$b;->f(Le5/h;)Le5/c$b;

    move-result-object p0

    invoke-virtual {p0}, Le5/c$b;->d()Le5/c;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic d(Ljava/lang/String;LM5/h$a;Le5/e;)LM5/f;
    .locals 1

    const-class v0, Landroid/content/Context;

    invoke-interface {p2, v0}, Le5/e;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/content/Context;

    invoke-interface {p1, p2}, LM5/h$a;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, p1}, LM5/f;->a(Ljava/lang/String;Ljava/lang/String;)LM5/f;

    move-result-object p0

    return-object p0
.end method
