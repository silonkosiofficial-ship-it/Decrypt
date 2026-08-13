.class public abstract Lz9/a0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Ljava/util/Set;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    sget-object v0, Li7/E;->D:Li7/E$a;

    invoke-static {v0}, Lu9/a;->t(Li7/E$a;)Lt9/b;

    move-result-object v0

    invoke-interface {v0}, Lt9/b;->a()Lv9/f;

    move-result-object v0

    sget-object v1, Li7/G;->D:Li7/G$a;

    invoke-static {v1}, Lu9/a;->u(Li7/G$a;)Lt9/b;

    move-result-object v1

    invoke-interface {v1}, Lt9/b;->a()Lv9/f;

    move-result-object v1

    sget-object v2, Li7/C;->D:Li7/C$a;

    invoke-static {v2}, Lu9/a;->s(Li7/C$a;)Lt9/b;

    move-result-object v2

    invoke-interface {v2}, Lt9/b;->a()Lv9/f;

    move-result-object v2

    sget-object v3, Li7/J;->D:Li7/J$a;

    invoke-static {v3}, Lu9/a;->v(Li7/J$a;)Lt9/b;

    move-result-object v3

    invoke-interface {v3}, Lt9/b;->a()Lv9/f;

    move-result-object v3

    const/4 v4, 0x4

    new-array v4, v4, [Lv9/f;

    const/4 v5, 0x0

    aput-object v0, v4, v5

    const/4 v0, 0x1

    aput-object v1, v4, v0

    const/4 v0, 0x2

    aput-object v2, v4, v0

    const/4 v0, 0x3

    aput-object v3, v4, v0

    invoke-static {v4}, Lj7/Z;->g([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, Lz9/a0;->a:Ljava/util/Set;

    return-void
.end method

.method public static final a(Lv9/f;)Z
    .locals 1

    .prologue
    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lv9/f;->m()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Ly9/j;->h()Lv9/f;

    move-result-object v0

    invoke-static {p0, v0}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final b(Lv9/f;)Z
    .locals 1

    .prologue
    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lv9/f;->m()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lz9/a0;->a:Ljava/util/Set;

    invoke-interface {v0, p0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method
