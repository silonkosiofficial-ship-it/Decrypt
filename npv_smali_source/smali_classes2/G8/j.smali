.class public final LG8/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ls8/b;


# instance fields
.field private final a:LF8/i0;

.field private b:Lx7/a;

.field private final c:LG8/j;

.field private final d:LO7/f0;

.field private final e:Li7/n;


# direct methods
.method public constructor <init>(LF8/i0;Ljava/util/List;LG8/j;)V
    .locals 8

    const-string v0, "projection"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "supertypes"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, LG8/j$a;

    invoke-direct {v3, p2}, LG8/j$a;-><init>(Ljava/util/List;)V

    const/16 v6, 0x8

    const/4 v7, 0x0

    const/4 v5, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v4, p3

    invoke-direct/range {v1 .. v7}, LG8/j;-><init>(LF8/i0;Lx7/a;LG8/j;LO7/f0;ILy7/k;)V

    return-void
.end method

.method public synthetic constructor <init>(LF8/i0;Ljava/util/List;LG8/j;ILy7/k;)V
    .locals 0

    .prologue
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    :cond_0
    invoke-direct {p0, p1, p2, p3}, LG8/j;-><init>(LF8/i0;Ljava/util/List;LG8/j;)V

    return-void
.end method

.method public constructor <init>(LF8/i0;Lx7/a;LG8/j;LO7/f0;)V
    .locals 1

    const-string v0, "projection"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LG8/j;->a:LF8/i0;

    iput-object p2, p0, LG8/j;->b:Lx7/a;

    iput-object p3, p0, LG8/j;->c:LG8/j;

    iput-object p4, p0, LG8/j;->d:LO7/f0;

    sget-object p1, Li7/r;->D:Li7/r;

    new-instance p2, LG8/j$b;

    invoke-direct {p2, p0}, LG8/j$b;-><init>(LG8/j;)V

    invoke-static {p1, p2}, Li7/o;->a(Li7/r;Lx7/a;)Li7/n;

    move-result-object p1

    iput-object p1, p0, LG8/j;->e:Li7/n;

    return-void
.end method

.method public synthetic constructor <init>(LF8/i0;Lx7/a;LG8/j;LO7/f0;ILy7/k;)V
    .locals 1

    .prologue
    and-int/lit8 p6, p5, 0x2

    const/4 v0, 0x0

    if-eqz p6, :cond_0

    move-object p2, v0

    :cond_0
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_1

    move-object p3, v0

    :cond_1
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_2

    move-object p4, v0

    :cond_2
    invoke-direct {p0, p1, p2, p3, p4}, LG8/j;-><init>(LF8/i0;Lx7/a;LG8/j;LO7/f0;)V

    return-void
.end method

.method public static final synthetic b(LG8/j;)Lx7/a;
    .locals 0

    iget-object p0, p0, LG8/j;->b:Lx7/a;

    return-object p0
.end method

.method private final d()Ljava/util/List;
    .locals 1

    iget-object v0, p0, LG8/j;->e:Li7/n;

    invoke-interface {v0}, Li7/n;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method


# virtual methods
.method public a()LF8/i0;
    .locals 1

    iget-object v0, p0, LG8/j;->a:LF8/i0;

    return-object v0
.end method

.method public c()Ljava/util/List;
    .locals 1

    .prologue
    invoke-direct {p0}, LG8/j;->d()Ljava/util/List;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public final e(Ljava/util/List;)V
    .locals 1

    const-string v0, "supertypes"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LG8/j$c;

    invoke-direct {v0, p1}, LG8/j$c;-><init>(Ljava/util/List;)V

    iput-object v0, p0, LG8/j;->b:Lx7/a;

    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .prologue
    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    const-class v2, LG8/j;

    invoke-static {v2, v1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_2

    return v2

    :cond_2
    const-string v1, "null cannot be cast to non-null type org.jetbrains.kotlin.types.checker.NewCapturedTypeConstructor"

    invoke-static {p1, v1}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, LG8/j;

    iget-object v1, p0, LG8/j;->c:LG8/j;

    if-nez v1, :cond_3

    move-object v1, p0

    :cond_3
    iget-object v3, p1, LG8/j;->c:LG8/j;

    if-nez v3, :cond_4

    goto :goto_1

    :cond_4
    move-object p1, v3

    :goto_1
    if-ne v1, p1, :cond_5

    goto :goto_2

    :cond_5
    move v0, v2

    :goto_2
    return v0
.end method

.method public f(LG8/g;)LG8/j;
    .locals 4

    .prologue
    const-string v0, "kotlinTypeRefiner"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LG8/j;->a()LF8/i0;

    move-result-object v0

    invoke-interface {v0, p1}, LF8/i0;->v(LG8/g;)LF8/i0;

    move-result-object v0

    const-string v1, "refine(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, LG8/j;->b:Lx7/a;

    if-eqz v1, :cond_0

    new-instance v1, LG8/j$d;

    invoke-direct {v1, p0, p1}, LG8/j$d;-><init>(LG8/j;LG8/g;)V

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    iget-object p1, p0, LG8/j;->c:LG8/j;

    if-nez p1, :cond_1

    move-object p1, p0

    :cond_1
    iget-object v2, p0, LG8/j;->d:LO7/f0;

    new-instance v3, LG8/j;

    invoke-direct {v3, v0, v1, p1, v2}, LG8/j;-><init>(LF8/i0;Lx7/a;LG8/j;LO7/f0;)V

    return-object v3
.end method

.method public hashCode()I
    .locals 1

    .prologue
    iget-object v0, p0, LG8/j;->c:LG8/j;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LG8/j;->hashCode()I

    move-result v0

    goto :goto_0

    :cond_0
    invoke-super {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_0
    return v0
.end method

.method public t()LL7/g;
    .locals 2

    invoke-virtual {p0}, LG8/j;->a()LF8/i0;

    move-result-object v0

    invoke-interface {v0}, LF8/i0;->getType()LF8/E;

    move-result-object v0

    const-string v1, "getType(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, LK8/a;->i(LF8/E;)LL7/g;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "CapturedType("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LG8/j;->a()LF8/i0;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic u()Ljava/util/Collection;
    .locals 1

    invoke-virtual {p0}, LG8/j;->c()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    return-object v0
.end method

.method public bridge synthetic v(LG8/g;)LF8/e0;
    .locals 0

    invoke-virtual {p0, p1}, LG8/j;->f(LG8/g;)LG8/j;

    move-result-object p1

    return-object p1
.end method

.method public w()LO7/h;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public x()Ljava/util/List;
    .locals 1

    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public y()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
