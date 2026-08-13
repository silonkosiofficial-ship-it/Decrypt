.class public final LX7/I$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LX7/I;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LX7/I$a$a;
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ly7/k;)V
    .locals 0

    invoke-direct {p0}, LX7/I$a;-><init>()V

    return-void
.end method

.method public static final synthetic a(LX7/I$a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)LX7/I$a$a;
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, LX7/I$a;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)LX7/I$a$a;

    move-result-object p0

    return-object p0
.end method

.method private final m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)LX7/I$a$a;
    .locals 2

    new-instance v0, LX7/I$a$a;

    invoke-static {p2}, Ln8/f;->o(Ljava/lang/String;)Ln8/f;

    move-result-object p2

    const-string v1, "identifier(...)"

    invoke-static {p2, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, p1, p2, p3, p4}, LX7/I$a$a;-><init>(Ljava/lang/String;Ln8/f;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public final b(Ln8/f;)Ln8/f;
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LX7/I$a;->f()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ln8/f;

    return-object p1
.end method

.method public final c()Ljava/util/List;
    .locals 1

    invoke-static {}, LX7/I;->a()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final d()Ljava/util/Set;
    .locals 1

    invoke-static {}, LX7/I;->b()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public final e()Ljava/util/Set;
    .locals 1

    invoke-static {}, LX7/I;->c()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public final f()Ljava/util/Map;
    .locals 1

    invoke-static {}, LX7/I;->d()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public final g()Ljava/util/List;
    .locals 1

    invoke-static {}, LX7/I;->e()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final h()LX7/I$a$a;
    .locals 1

    invoke-static {}, LX7/I;->f()LX7/I$a$a;

    move-result-object v0

    return-object v0
.end method

.method public final i()Ljava/util/Map;
    .locals 1

    invoke-static {}, LX7/I;->g()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public final j()Ljava/util/Map;
    .locals 1

    invoke-static {}, LX7/I;->h()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public final k(Ln8/f;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LX7/I$a;->g()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final l(Ljava/lang/String;)LX7/I$b;
    .locals 1

    .prologue
    const-string v0, "builtinSignature"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LX7/I$a;->c()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p1, LX7/I$b;->E:LX7/I$b;

    return-object p1

    :cond_0
    invoke-virtual {p0}, LX7/I$a;->i()Ljava/util/Map;

    move-result-object v0

    invoke-static {v0, p1}, Lj7/S;->i(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LX7/I$c;

    sget-object v0, LX7/I$c;->D:LX7/I$c;

    if-ne p1, v0, :cond_1

    sget-object p1, LX7/I$b;->G:LX7/I$b;

    goto :goto_0

    :cond_1
    sget-object p1, LX7/I$b;->F:LX7/I$b;

    :goto_0
    return-object p1
.end method
