.class public final Lb8/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LP7/c;
.implements LZ7/g;


# static fields
.field static final synthetic i:[LF7/k;


# instance fields
.field private final a:La8/g;

.field private final b:Le8/a;

.field private final c:LE8/j;

.field private final d:LE8/i;

.field private final e:Ld8/a;

.field private final f:LE8/i;

.field private final g:Z

.field private final h:Z


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Ly7/G;

    const-class v1, Lb8/e;

    invoke-static {v1}, Ly7/P;->b(Ljava/lang/Class;)LF7/c;

    move-result-object v2

    const-string v3, "fqName"

    const-string v4, "getFqName()Lorg/jetbrains/kotlin/name/FqName;"

    invoke-direct {v0, v2, v3, v4}, Ly7/G;-><init>(LF7/e;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v0}, Ly7/P;->j(Ly7/F;)LF7/m;

    move-result-object v0

    new-instance v2, Ly7/G;

    invoke-static {v1}, Ly7/P;->b(Ljava/lang/Class;)LF7/c;

    move-result-object v3

    const-string v4, "type"

    const-string v5, "getType()Lorg/jetbrains/kotlin/types/SimpleType;"

    invoke-direct {v2, v3, v4, v5}, Ly7/G;-><init>(LF7/e;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v2}, Ly7/P;->j(Ly7/F;)LF7/m;

    move-result-object v2

    new-instance v3, Ly7/G;

    invoke-static {v1}, Ly7/P;->b(Ljava/lang/Class;)LF7/c;

    move-result-object v1

    const-string v4, "allValueArguments"

    const-string v5, "getAllValueArguments()Ljava/util/Map;"

    invoke-direct {v3, v1, v4, v5}, Ly7/G;-><init>(LF7/e;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v3}, Ly7/P;->j(Ly7/F;)LF7/m;

    move-result-object v1

    const/4 v3, 0x3

    new-array v3, v3, [LF7/k;

    const/4 v4, 0x0

    aput-object v0, v3, v4

    const/4 v0, 0x1

    aput-object v2, v3, v0

    const/4 v0, 0x2

    aput-object v1, v3, v0

    sput-object v3, Lb8/e;->i:[LF7/k;

    return-void
.end method

.method public constructor <init>(La8/g;Le8/a;Z)V
    .locals 2

    .prologue
    const-string v0, "c"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "javaAnnotation"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb8/e;->a:La8/g;

    iput-object p2, p0, Lb8/e;->b:Le8/a;

    invoke-virtual {p1}, La8/g;->e()LE8/n;

    move-result-object v0

    new-instance v1, Lb8/e$b;

    invoke-direct {v1, p0}, Lb8/e$b;-><init>(Lb8/e;)V

    invoke-interface {v0, v1}, LE8/n;->f(Lx7/a;)LE8/j;

    move-result-object v0

    iput-object v0, p0, Lb8/e;->c:LE8/j;

    invoke-virtual {p1}, La8/g;->e()LE8/n;

    move-result-object v0

    new-instance v1, Lb8/e$c;

    invoke-direct {v1, p0}, Lb8/e$c;-><init>(Lb8/e;)V

    invoke-interface {v0, v1}, LE8/n;->d(Lx7/a;)LE8/i;

    move-result-object v0

    iput-object v0, p0, Lb8/e;->d:LE8/i;

    invoke-virtual {p1}, La8/g;->a()La8/b;

    move-result-object v0

    invoke-virtual {v0}, La8/b;->t()Ld8/b;

    move-result-object v0

    invoke-interface {v0, p2}, Ld8/b;->a(Le8/l;)Ld8/a;

    move-result-object v0

    iput-object v0, p0, Lb8/e;->e:Ld8/a;

    invoke-virtual {p1}, La8/g;->e()LE8/n;

    move-result-object p1

    new-instance v0, Lb8/e$a;

    invoke-direct {v0, p0}, Lb8/e$a;-><init>(Lb8/e;)V

    invoke-interface {p1, v0}, LE8/n;->d(Lx7/a;)LE8/i;

    move-result-object p1

    iput-object p1, p0, Lb8/e;->f:LE8/i;

    invoke-interface {p2}, Le8/a;->d()Z

    move-result p1

    iput-boolean p1, p0, Lb8/e;->g:Z

    invoke-interface {p2}, Le8/a;->z()Z

    move-result p1

    if-nez p1, :cond_1

    if-eqz p3, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    iput-boolean p1, p0, Lb8/e;->h:Z

    return-void
.end method

.method public synthetic constructor <init>(La8/g;Le8/a;ZILy7/k;)V
    .locals 0

    .prologue
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lb8/e;-><init>(La8/g;Le8/a;Z)V

    return-void
.end method

.method public static final synthetic b(Lb8/e;Ln8/c;)LO7/e;
    .locals 0

    invoke-direct {p0, p1}, Lb8/e;->h(Ln8/c;)LO7/e;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic c(Lb8/e;)La8/g;
    .locals 0

    iget-object p0, p0, Lb8/e;->a:La8/g;

    return-object p0
.end method

.method public static final synthetic f(Lb8/e;)Le8/a;
    .locals 0

    iget-object p0, p0, Lb8/e;->b:Le8/a;

    return-object p0
.end method

.method public static final synthetic g(Lb8/e;Le8/b;)Lt8/g;
    .locals 0

    invoke-direct {p0, p1}, Lb8/e;->l(Le8/b;)Lt8/g;

    move-result-object p0

    return-object p0
.end method

.method private final h(Ln8/c;)LO7/e;
    .locals 2

    iget-object v0, p0, Lb8/e;->a:La8/g;

    invoke-virtual {v0}, La8/g;->d()LO7/G;

    move-result-object v0

    invoke-static {p1}, Ln8/b;->m(Ln8/c;)Ln8/b;

    move-result-object p1

    const-string v1, "topLevel(...)"

    invoke-static {p1, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lb8/e;->a:La8/g;

    invoke-virtual {v1}, La8/g;->a()La8/b;

    move-result-object v1

    invoke-virtual {v1}, La8/b;->b()Lg8/j;

    move-result-object v1

    invoke-virtual {v1}, Lg8/j;->d()LB8/k;

    move-result-object v1

    invoke-virtual {v1}, LB8/k;->r()LO7/J;

    move-result-object v1

    invoke-static {v0, p1, v1}, LO7/x;->c(LO7/G;Ln8/b;LO7/J;)LO7/e;

    move-result-object p1

    return-object p1
.end method

.method private final l(Le8/b;)Lt8/g;
    .locals 3

    .prologue
    instance-of v0, p1, Le8/o;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    sget-object v0, Lt8/h;->a:Lt8/h;

    check-cast p1, Le8/o;

    invoke-interface {p1}, Le8/o;->getValue()Ljava/lang/Object;

    move-result-object p1

    const/4 v2, 0x2

    invoke-static {v0, p1, v1, v2, v1}, Lt8/h;->d(Lt8/h;Ljava/lang/Object;LO7/G;ILjava/lang/Object;)Lt8/g;

    move-result-object v1

    goto :goto_0

    :cond_0
    instance-of v0, p1, Le8/m;

    if-eqz v0, :cond_1

    check-cast p1, Le8/m;

    invoke-interface {p1}, Le8/m;->b()Ln8/b;

    move-result-object v0

    invoke-interface {p1}, Le8/m;->d()Ln8/f;

    move-result-object p1

    invoke-direct {p0, v0, p1}, Lb8/e;->p(Ln8/b;Ln8/f;)Lt8/g;

    move-result-object v1

    goto :goto_0

    :cond_1
    instance-of v0, p1, Le8/e;

    if-eqz v0, :cond_3

    check-cast p1, Le8/e;

    invoke-interface {p1}, Le8/b;->getName()Ln8/f;

    move-result-object v0

    if-nez v0, :cond_2

    sget-object v0, LX7/B;->c:Ln8/f;

    :cond_2
    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-interface {p1}, Le8/e;->e()Ljava/util/List;

    move-result-object p1

    invoke-direct {p0, v0, p1}, Lb8/e;->n(Ln8/f;Ljava/util/List;)Lt8/g;

    move-result-object v1

    goto :goto_0

    :cond_3
    instance-of v0, p1, Le8/c;

    if-eqz v0, :cond_4

    check-cast p1, Le8/c;

    invoke-interface {p1}, Le8/c;->a()Le8/a;

    move-result-object p1

    invoke-direct {p0, p1}, Lb8/e;->m(Le8/a;)Lt8/g;

    move-result-object v1

    goto :goto_0

    :cond_4
    instance-of v0, p1, Le8/h;

    if-eqz v0, :cond_5

    check-cast p1, Le8/h;

    invoke-interface {p1}, Le8/h;->c()Le8/x;

    move-result-object p1

    invoke-direct {p0, p1}, Lb8/e;->q(Le8/x;)Lt8/g;

    move-result-object v1

    :cond_5
    :goto_0
    return-object v1
.end method

.method private final m(Le8/a;)Lt8/g;
    .locals 8

    new-instance v0, Lt8/a;

    new-instance v7, Lb8/e;

    iget-object v2, p0, Lb8/e;->a:La8/g;

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, v7

    move-object v3, p1

    invoke-direct/range {v1 .. v6}, Lb8/e;-><init>(La8/g;Le8/a;ZILy7/k;)V

    invoke-direct {v0, v7}, Lt8/a;-><init>(LP7/c;)V

    return-object v0
.end method

.method private final n(Ln8/f;Ljava/util/List;)Lt8/g;
    .locals 3

    .prologue
    invoke-virtual {p0}, Lb8/e;->j()LF8/M;

    move-result-object v0

    const-string v1, "<get-type>(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, LF8/G;->a(LF8/E;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-static {p0}, Lv8/c;->i(LP7/c;)LO7/e;

    move-result-object v0

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-static {p1, v0}, LY7/a;->b(Ln8/f;LO7/e;)LO7/j0;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-interface {p1}, LO7/i0;->getType()LF8/E;

    move-result-object p1

    if-nez p1, :cond_2

    :cond_1
    iget-object p1, p0, Lb8/e;->a:La8/g;

    invoke-virtual {p1}, La8/g;->a()La8/b;

    move-result-object p1

    invoke-virtual {p1}, La8/b;->m()LO7/G;

    move-result-object p1

    invoke-interface {p1}, LO7/G;->t()LL7/g;

    move-result-object p1

    sget-object v0, LF8/u0;->G:LF8/u0;

    sget-object v1, LH8/j;->g1:LH8/j;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/String;

    invoke-static {v1, v2}, LH8/k;->d(LH8/j;[Ljava/lang/String;)LH8/h;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, LL7/g;->l(LF8/u0;LF8/E;)LF8/M;

    move-result-object p1

    :cond_2
    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    check-cast p2, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p2, v1}, Lj7/v;->x(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Le8/b;

    invoke-direct {p0, v1}, Lb8/e;->l(Le8/b;)Lt8/g;

    move-result-object v1

    if-nez v1, :cond_3

    new-instance v1, Lt8/r;

    invoke-direct {v1}, Lt8/r;-><init>()V

    :cond_3
    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_4
    sget-object p2, Lt8/h;->a:Lt8/h;

    invoke-virtual {p2, v0, p1}, Lt8/h;->a(Ljava/util/List;LF8/E;)Lt8/b;

    move-result-object p1

    return-object p1
.end method

.method private final p(Ln8/b;Ln8/f;)Lt8/g;
    .locals 1

    .prologue
    if-eqz p1, :cond_1

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Lt8/j;

    invoke-direct {v0, p1, p2}, Lt8/j;-><init>(Ln8/b;Ln8/f;)V

    return-object v0

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return-object p1
.end method

.method private final q(Le8/x;)Lt8/g;
    .locals 8

    sget-object v0, Lt8/p;->b:Lt8/p$a;

    iget-object v1, p0, Lb8/e;->a:La8/g;

    invoke-virtual {v1}, La8/g;->g()Lc8/d;

    move-result-object v1

    sget-object v2, LF8/p0;->D:LF8/p0;

    const/4 v6, 0x7

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, Lc8/b;->b(LF8/p0;ZZLO7/f0;ILjava/lang/Object;)Lc8/a;

    move-result-object v2

    invoke-virtual {v1, p1, v2}, Lc8/d;->o(Le8/x;Lc8/a;)LF8/E;

    move-result-object p1

    invoke-virtual {v0, p1}, Lt8/p$a;->a(LF8/E;)Lt8/g;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public a()Ljava/util/Map;
    .locals 3

    iget-object v0, p0, Lb8/e;->f:LE8/i;

    sget-object v1, Lb8/e;->i:[LF7/k;

    const/4 v2, 0x2

    aget-object v1, v1, v2

    invoke-static {v0, p0, v1}, LE8/m;->a(LE8/i;Ljava/lang/Object;LF7/k;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    return-object v0
.end method

.method public d()Z
    .locals 1

    iget-boolean v0, p0, Lb8/e;->g:Z

    return v0
.end method

.method public e()Ln8/c;
    .locals 3

    iget-object v0, p0, Lb8/e;->c:LE8/j;

    sget-object v1, Lb8/e;->i:[LF7/k;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-static {v0, p0, v1}, LE8/m;->b(LE8/j;Ljava/lang/Object;LF7/k;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ln8/c;

    return-object v0
.end method

.method public bridge synthetic getType()LF8/E;
    .locals 1

    invoke-virtual {p0}, Lb8/e;->j()LF8/M;

    move-result-object v0

    return-object v0
.end method

.method public i()Ld8/a;
    .locals 1

    iget-object v0, p0, Lb8/e;->e:Ld8/a;

    return-object v0
.end method

.method public j()LF8/M;
    .locals 3

    iget-object v0, p0, Lb8/e;->d:LE8/i;

    sget-object v1, Lb8/e;->i:[LF7/k;

    const/4 v2, 0x1

    aget-object v1, v1, v2

    invoke-static {v0, p0, v1}, LE8/m;->a(LE8/i;Ljava/lang/Object;LF7/k;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LF8/M;

    return-object v0
.end method

.method public final k()Z
    .locals 1

    iget-boolean v0, p0, Lb8/e;->h:Z

    return v0
.end method

.method public bridge synthetic o()LO7/a0;
    .locals 1

    invoke-virtual {p0}, Lb8/e;->i()Ld8/a;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    sget-object v0, Lq8/c;->g:Lq8/c;

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {v0, p0, v1, v2, v1}, Lq8/c;->s(Lq8/c;LP7/c;LP7/e;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
