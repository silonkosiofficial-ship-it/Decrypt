.class public final LI7/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LF7/j;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LI7/u$a;
    }
.end annotation


# static fields
.field static final synthetic f:[LF7/k;


# instance fields
.field private final a:LI7/j;

.field private final b:I

.field private final c:LF7/j$a;

.field private final d:LI7/F$a;

.field private final e:LI7/F$a;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Ly7/G;

    const-class v1, LI7/u;

    invoke-static {v1}, Ly7/P;->b(Ljava/lang/Class;)LF7/c;

    move-result-object v2

    const-string v3, "descriptor"

    const-string v4, "getDescriptor()Lorg/jetbrains/kotlin/descriptors/ParameterDescriptor;"

    invoke-direct {v0, v2, v3, v4}, Ly7/G;-><init>(LF7/e;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v0}, Ly7/P;->j(Ly7/F;)LF7/m;

    move-result-object v0

    new-instance v2, Ly7/G;

    invoke-static {v1}, Ly7/P;->b(Ljava/lang/Class;)LF7/c;

    move-result-object v1

    const-string v3, "annotations"

    const-string v4, "getAnnotations()Ljava/util/List;"

    invoke-direct {v2, v1, v3, v4}, Ly7/G;-><init>(LF7/e;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v2}, Ly7/P;->j(Ly7/F;)LF7/m;

    move-result-object v1

    const/4 v2, 0x2

    new-array v2, v2, [LF7/k;

    const/4 v3, 0x0

    aput-object v0, v2, v3

    const/4 v0, 0x1

    aput-object v1, v2, v0

    sput-object v2, LI7/u;->f:[LF7/k;

    return-void
.end method

.method public constructor <init>(LI7/j;ILF7/j$a;Lx7/a;)V
    .locals 1

    const-string v0, "callable"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "kind"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "computeDescriptor"

    invoke-static {p4, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LI7/u;->a:LI7/j;

    iput p2, p0, LI7/u;->b:I

    iput-object p3, p0, LI7/u;->c:LF7/j$a;

    invoke-static {p4}, LI7/F;->c(Lx7/a;)LI7/F$a;

    move-result-object p1

    iput-object p1, p0, LI7/u;->d:LI7/F$a;

    new-instance p1, LI7/u$b;

    invoke-direct {p1, p0}, LI7/u$b;-><init>(LI7/u;)V

    invoke-static {p1}, LI7/F;->c(Lx7/a;)LI7/F$a;

    move-result-object p1

    iput-object p1, p0, LI7/u;->e:LI7/F$a;

    return-void
.end method

.method public static final varargs synthetic a(LI7/u;[Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;
    .locals 0

    invoke-direct {p0, p1}, LI7/u;->c([Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b(LI7/u;)LO7/Q;
    .locals 0

    invoke-direct {p0}, LI7/u;->e()LO7/Q;

    move-result-object p0

    return-object p0
.end method

.method private final varargs c([Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;
    .locals 2

    .prologue
    array-length v0, p1

    if-eqz v0, :cond_1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    new-instance v0, LI7/u$a;

    invoke-direct {v0, p1}, LI7/u$a;-><init>([Ljava/lang/reflect/Type;)V

    goto :goto_0

    :cond_0
    invoke-static {p1}, Lj7/n;->F0([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    move-object v0, p1

    check-cast v0, Ljava/lang/reflect/Type;

    :goto_0
    return-object v0

    :cond_1
    new-instance p1, Lw7/b;

    const-string v0, "Expected at least 1 type for compound type"

    invoke-direct {p1, v0}, Lw7/b;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private final e()LO7/Q;
    .locals 3

    iget-object v0, p0, LI7/u;->d:LI7/F$a;

    sget-object v1, LI7/u;->f:[LF7/k;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-virtual {v0, p0, v1}, LI7/F$b;->e(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "getValue(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, LO7/Q;

    return-object v0
.end method


# virtual methods
.method public final d()LI7/j;
    .locals 1

    iget-object v0, p0, LI7/u;->a:LI7/j;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2

    .prologue
    instance-of v0, p1, LI7/u;

    if-eqz v0, :cond_0

    iget-object v0, p0, LI7/u;->a:LI7/j;

    check-cast p1, LI7/u;

    iget-object v1, p1, LI7/u;->a:LI7/j;

    invoke-static {v0, v1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LI7/u;->getIndex()I

    move-result v0

    invoke-virtual {p1}, LI7/u;->getIndex()I

    move-result p1

    if-ne v0, p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public getIndex()I
    .locals 1

    iget v0, p0, LI7/u;->b:I

    return v0
.end method

.method public getName()Ljava/lang/String;
    .locals 3

    .prologue
    invoke-direct {p0}, LI7/u;->e()LO7/Q;

    move-result-object v0

    instance-of v1, v0, LO7/j0;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    check-cast v0, LO7/j0;

    goto :goto_0

    :cond_0
    move-object v0, v2

    :goto_0
    if-nez v0, :cond_1

    return-object v2

    :cond_1
    invoke-interface {v0}, LO7/j0;->b()LO7/a;

    move-result-object v1

    invoke-interface {v1}, LO7/a;->L()Z

    move-result v1

    if-eqz v1, :cond_2

    return-object v2

    :cond_2
    invoke-interface {v0}, LO7/I;->getName()Ln8/f;

    move-result-object v0

    const-string v1, "getName(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Ln8/f;->q()Z

    move-result v1

    if-eqz v1, :cond_3

    goto :goto_1

    :cond_3
    invoke-virtual {v0}, Ln8/f;->g()Ljava/lang/String;

    move-result-object v2

    :goto_1
    return-object v2
.end method

.method public getType()LF7/o;
    .locals 3

    new-instance v0, LI7/A;

    invoke-direct {p0}, LI7/u;->e()LO7/Q;

    move-result-object v1

    invoke-interface {v1}, LO7/i0;->getType()LF8/E;

    move-result-object v1

    const-string v2, "getType(...)"

    invoke-static {v1, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, LI7/u$c;

    invoke-direct {v2, p0}, LI7/u$c;-><init>(LI7/u;)V

    invoke-direct {v0, v1, v2}, LI7/A;-><init>(LF8/E;Lx7/a;)V

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, LI7/u;->a:LI7/j;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, LI7/u;->getIndex()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public j()LF7/j$a;
    .locals 1

    iget-object v0, p0, LI7/u;->c:LF7/j$a;

    return-object v0
.end method

.method public m()Z
    .locals 2

    .prologue
    invoke-direct {p0}, LI7/u;->e()LO7/Q;

    move-result-object v0

    instance-of v1, v0, LO7/j0;

    if-eqz v1, :cond_0

    check-cast v0, LO7/j0;

    invoke-interface {v0}, LO7/j0;->u0()LF8/E;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public n()Z
    .locals 2

    .prologue
    invoke-direct {p0}, LI7/u;->e()LO7/Q;

    move-result-object v0

    instance-of v1, v0, LO7/j0;

    if-eqz v1, :cond_0

    check-cast v0, LO7/j0;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    invoke-static {v0}, Lv8/c;->c(LO7/j0;)Z

    move-result v0

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    sget-object v0, LI7/H;->a:LI7/H;

    invoke-virtual {v0, p0}, LI7/H;->f(LI7/u;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
