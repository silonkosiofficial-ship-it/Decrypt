.class public final LN7/d;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LN7/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LN7/d;

    invoke-direct {v0}, LN7/d;-><init>()V

    sput-object v0, LN7/d;->a:LN7/d;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic f(LN7/d;Ln8/c;LL7/g;Ljava/lang/Integer;ILjava/lang/Object;)LO7/e;
    .locals 0

    .prologue
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, LN7/d;->e(Ln8/c;LL7/g;Ljava/lang/Integer;)LO7/e;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(LO7/e;)LO7/e;
    .locals 4

    .prologue
    const-string v0, "mutable"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lr8/f;->m(LO7/m;)Ln8/d;

    move-result-object v1

    sget-object v2, LN7/c;->a:LN7/c;

    invoke-virtual {v2, v1}, LN7/c;->o(Ln8/d;)Ln8/c;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-static {p1}, Lv8/c;->j(LO7/m;)LL7/g;

    move-result-object p1

    invoke-virtual {p1, v1}, LL7/g;->o(Ln8/c;)LO7/e;

    move-result-object p1

    const-string v0, "getBuiltInClassByFqName(...)"

    invoke-static {p1, v0}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    :cond_0
    new-instance v1, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Given class "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " is not a "

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " collection"

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public final b(LO7/e;)LO7/e;
    .locals 3

    .prologue
    const-string v0, "readOnly"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lr8/f;->m(LO7/m;)Ln8/d;

    move-result-object v0

    sget-object v1, LN7/c;->a:LN7/c;

    invoke-virtual {v1, v0}, LN7/c;->p(Ln8/d;)Ln8/c;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {p1}, Lv8/c;->j(LO7/m;)LL7/g;

    move-result-object p1

    invoke-virtual {p1, v0}, LL7/g;->o(Ln8/c;)LO7/e;

    move-result-object p1

    const-string v0, "getBuiltInClassByFqName(...)"

    invoke-static {p1, v0}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Given class "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " is not a "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "read-only"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " collection"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final c(LO7/e;)Z
    .locals 1

    const-string v0, "mutable"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LN7/c;->a:LN7/c;

    invoke-static {p1}, Lr8/f;->m(LO7/m;)Ln8/d;

    move-result-object p1

    invoke-virtual {v0, p1}, LN7/c;->k(Ln8/d;)Z

    move-result p1

    return p1
.end method

.method public final d(LO7/e;)Z
    .locals 1

    const-string v0, "readOnly"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LN7/c;->a:LN7/c;

    invoke-static {p1}, Lr8/f;->m(LO7/m;)Ln8/d;

    move-result-object p1

    invoke-virtual {v0, p1}, LN7/c;->l(Ln8/d;)Z

    move-result p1

    return p1
.end method

.method public final e(Ln8/c;LL7/g;Ljava/lang/Integer;)LO7/e;
    .locals 1

    .prologue
    const-string v0, "fqName"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "builtIns"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p3, :cond_0

    sget-object v0, LN7/c;->a:LN7/c;

    invoke-virtual {v0}, LN7/c;->h()Ln8/c;

    move-result-object v0

    invoke-static {p1, v0}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-static {p1}, LL7/j;->a(I)Ln8/b;

    move-result-object p1

    goto :goto_0

    :cond_0
    sget-object p3, LN7/c;->a:LN7/c;

    invoke-virtual {p3, p1}, LN7/c;->m(Ln8/c;)Ln8/b;

    move-result-object p1

    :goto_0
    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ln8/b;->b()Ln8/c;

    move-result-object p1

    invoke-virtual {p2, p1}, LL7/g;->o(Ln8/c;)LO7/e;

    move-result-object p1

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    :goto_1
    return-object p1
.end method

.method public final g(Ln8/c;LL7/g;)Ljava/util/Collection;
    .locals 7

    .prologue
    const-string v0, "fqName"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "builtIns"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-static/range {v1 .. v6}, LN7/d;->f(LN7/d;Ln8/c;LL7/g;Ljava/lang/Integer;ILjava/lang/Object;)LO7/e;

    move-result-object p1

    if-nez p1, :cond_0

    invoke-static {}, Lj7/Z;->d()Ljava/util/Set;

    move-result-object p1

    :goto_0
    check-cast p1, Ljava/util/Collection;

    return-object p1

    :cond_0
    sget-object v0, LN7/c;->a:LN7/c;

    invoke-static {p1}, Lv8/c;->m(LO7/m;)Ln8/d;

    move-result-object v1

    invoke-virtual {v0, v1}, LN7/c;->p(Ln8/d;)Ln8/c;

    move-result-object v0

    if-nez v0, :cond_1

    invoke-static {p1}, Lj7/Z;->c(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object p1

    goto :goto_0

    :cond_1
    invoke-virtual {p2, v0}, LL7/g;->o(Ln8/c;)LO7/e;

    move-result-object p2

    const-string v0, "getBuiltInClassByFqName(...)"

    invoke-static {p2, v0}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x2

    new-array v0, v0, [LO7/e;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    const/4 p1, 0x1

    aput-object p2, v0, p1

    invoke-static {v0}, Lj7/v;->p([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    goto :goto_0
.end method
