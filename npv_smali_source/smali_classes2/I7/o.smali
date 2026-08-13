.class public final LI7/o;
.super LI7/j;
.source "SourceFile"

# interfaces
.implements Ly7/o;
.implements LF7/f;
.implements LI7/g;


# static fields
.field static final synthetic O:[LF7/k;


# instance fields
.field private final I:LI7/n;

.field private final J:Ljava/lang/String;

.field private final K:Ljava/lang/Object;

.field private final L:LI7/F$a;

.field private final M:Li7/n;

.field private final N:Li7/n;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Ly7/G;

    const-class v1, LI7/o;

    invoke-static {v1}, Ly7/P;->b(Ljava/lang/Class;)LF7/c;

    move-result-object v1

    const-string v2, "descriptor"

    const-string v3, "getDescriptor()Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;"

    invoke-direct {v0, v1, v2, v3}, Ly7/G;-><init>(LF7/e;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v0}, Ly7/P;->j(Ly7/F;)LF7/m;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [LF7/k;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    sput-object v1, LI7/o;->O:[LF7/k;

    return-void
.end method

.method public constructor <init>(LI7/n;LO7/y;)V
    .locals 9

    const-string v0, "container"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "descriptor"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p2}, LO7/I;->getName()Ln8/f;

    move-result-object v0

    invoke-virtual {v0}, Ln8/f;->g()Ljava/lang/String;

    move-result-object v3

    const-string v0, "asString(...)"

    invoke-static {v3, v0}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LI7/I;->a:LI7/I;

    invoke-virtual {v0, p2}, LI7/I;->g(LO7/y;)LI7/h;

    move-result-object v0

    invoke-virtual {v0}, LI7/h;->a()Ljava/lang/String;

    move-result-object v4

    const/16 v7, 0x10

    const/4 v8, 0x0

    const/4 v6, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v5, p2

    invoke-direct/range {v1 .. v8}, LI7/o;-><init>(LI7/n;Ljava/lang/String;Ljava/lang/String;LO7/y;Ljava/lang/Object;ILy7/k;)V

    return-void
.end method

.method private constructor <init>(LI7/n;Ljava/lang/String;Ljava/lang/String;LO7/y;Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, LI7/j;-><init>()V

    iput-object p1, p0, LI7/o;->I:LI7/n;

    iput-object p3, p0, LI7/o;->J:Ljava/lang/String;

    iput-object p5, p0, LI7/o;->K:Ljava/lang/Object;

    new-instance p1, LI7/o$c;

    invoke-direct {p1, p0, p2}, LI7/o$c;-><init>(LI7/o;Ljava/lang/String;)V

    invoke-static {p4, p1}, LI7/F;->b(Ljava/lang/Object;Lx7/a;)LI7/F$a;

    move-result-object p1

    iput-object p1, p0, LI7/o;->L:LI7/F$a;

    sget-object p1, Li7/r;->D:Li7/r;

    new-instance p2, LI7/o$a;

    invoke-direct {p2, p0}, LI7/o$a;-><init>(LI7/o;)V

    invoke-static {p1, p2}, Li7/o;->a(Li7/r;Lx7/a;)Li7/n;

    move-result-object p2

    iput-object p2, p0, LI7/o;->M:Li7/n;

    new-instance p2, LI7/o$b;

    invoke-direct {p2, p0}, LI7/o$b;-><init>(LI7/o;)V

    invoke-static {p1, p2}, Li7/o;->a(Li7/r;Lx7/a;)Li7/n;

    move-result-object p1

    iput-object p1, p0, LI7/o;->N:Li7/n;

    return-void
.end method

.method synthetic constructor <init>(LI7/n;Ljava/lang/String;Ljava/lang/String;LO7/y;Ljava/lang/Object;ILy7/k;)V
    .locals 6

    .prologue
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_0

    sget-object p5, Ly7/f;->I:Ljava/lang/Object;

    :cond_0
    move-object v5, p5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    invoke-direct/range {v0 .. v5}, LI7/o;-><init>(LI7/n;Ljava/lang/String;Ljava/lang/String;LO7/y;Ljava/lang/Object;)V

    return-void
.end method

.method public constructor <init>(LI7/n;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 7

    const-string v0, "container"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "name"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "signature"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v6, p4

    invoke-direct/range {v1 .. v6}, LI7/o;-><init>(LI7/n;Ljava/lang/String;Ljava/lang/String;LO7/y;Ljava/lang/Object;)V

    return-void
.end method

.method public static final synthetic F(LI7/o;Ljava/lang/reflect/Constructor;LO7/y;Z)LJ7/f;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, LI7/o;->K(Ljava/lang/reflect/Constructor;LO7/y;Z)LJ7/f;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic G(LI7/o;Ljava/lang/reflect/Method;)LJ7/f$h;
    .locals 0

    invoke-direct {p0, p1}, LI7/o;->L(Ljava/lang/reflect/Method;)LJ7/f$h;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic H(LI7/o;Ljava/lang/reflect/Method;)LJ7/f$h;
    .locals 0

    invoke-direct {p0, p1}, LI7/o;->M(Ljava/lang/reflect/Method;)LJ7/f$h;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic I(LI7/o;Ljava/lang/reflect/Method;)LJ7/f$h;
    .locals 0

    invoke-direct {p0, p1}, LI7/o;->N(Ljava/lang/reflect/Method;)LJ7/f$h;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic J(LI7/o;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, LI7/o;->J:Ljava/lang/String;

    return-object p0
.end method

.method private final K(Ljava/lang/reflect/Constructor;LO7/y;Z)LJ7/f;
    .locals 0

    .prologue
    if-nez p3, :cond_1

    invoke-static {p2}, Lw8/b;->f(LO7/b;)Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-virtual {p0}, LI7/o;->E()Z

    move-result p2

    if-eqz p2, :cond_0

    new-instance p2, LJ7/f$a;

    invoke-direct {p0}, LI7/o;->O()Ljava/lang/Object;

    move-result-object p3

    invoke-direct {p2, p1, p3}, LJ7/f$a;-><init>(Ljava/lang/reflect/Constructor;Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p2, LJ7/f$b;

    invoke-direct {p2, p1}, LJ7/f$b;-><init>(Ljava/lang/reflect/Constructor;)V

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, LI7/o;->E()Z

    move-result p2

    if-eqz p2, :cond_2

    new-instance p2, LJ7/f$c;

    invoke-direct {p0}, LI7/o;->O()Ljava/lang/Object;

    move-result-object p3

    invoke-direct {p2, p1, p3}, LJ7/f$c;-><init>(Ljava/lang/reflect/Constructor;Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    new-instance p2, LJ7/f$e;

    invoke-direct {p2, p1}, LJ7/f$e;-><init>(Ljava/lang/reflect/Constructor;)V

    :goto_0
    return-object p2
.end method

.method private final L(Ljava/lang/reflect/Method;)LJ7/f$h;
    .locals 2

    .prologue
    invoke-virtual {p0}, LI7/o;->E()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, LJ7/f$h$a;

    invoke-direct {p0}, LI7/o;->O()Ljava/lang/Object;

    move-result-object v1

    invoke-direct {v0, p1, v1}, LJ7/f$h$a;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance v0, LJ7/f$h$e;

    invoke-direct {v0, p1}, LJ7/f$h$e;-><init>(Ljava/lang/reflect/Method;)V

    :goto_0
    return-object v0
.end method

.method private final M(Ljava/lang/reflect/Method;)LJ7/f$h;
    .locals 1

    .prologue
    invoke-virtual {p0}, LI7/o;->E()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, LJ7/f$h$b;

    invoke-direct {v0, p1}, LJ7/f$h$b;-><init>(Ljava/lang/reflect/Method;)V

    goto :goto_0

    :cond_0
    new-instance v0, LJ7/f$h$f;

    invoke-direct {v0, p1}, LJ7/f$h$f;-><init>(Ljava/lang/reflect/Method;)V

    :goto_0
    return-object v0
.end method

.method private final N(Ljava/lang/reflect/Method;)LJ7/f$h;
    .locals 2

    .prologue
    invoke-virtual {p0}, LI7/o;->E()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, LJ7/f$h$c;

    invoke-direct {p0}, LI7/o;->O()Ljava/lang/Object;

    move-result-object v1

    invoke-direct {v0, p1, v1}, LJ7/f$h$c;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance v0, LJ7/f$h$g;

    invoke-direct {v0, p1}, LJ7/f$h$g;-><init>(Ljava/lang/reflect/Method;)V

    :goto_0
    return-object v0
.end method

.method private final O()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LI7/o;->K:Ljava/lang/Object;

    invoke-virtual {p0}, LI7/o;->P()LO7/y;

    move-result-object v1

    invoke-static {v0, v1}, LJ7/k;->g(Ljava/lang/Object;LO7/b;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public bridge synthetic A()LO7/b;
    .locals 1

    invoke-virtual {p0}, LI7/o;->P()LO7/y;

    move-result-object v0

    return-object v0
.end method

.method public E()Z
    .locals 2

    iget-object v0, p0, LI7/o;->K:Ljava/lang/Object;

    sget-object v1, Ly7/f;->I:Ljava/lang/Object;

    invoke-static {v0, v1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public P()LO7/y;
    .locals 3

    iget-object v0, p0, LI7/o;->L:LI7/F$a;

    sget-object v1, LI7/o;->O:[LF7/k;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-virtual {v0, p0, v1}, LI7/F$b;->e(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "getValue(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, LO7/y;

    return-object v0
.end method

.method public b()Ljava/lang/Object;
    .locals 1

    invoke-static {p0}, LI7/g$a;->a(LI7/g;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public c()I
    .locals 1

    invoke-virtual {p0}, LI7/o;->s()LJ7/e;

    move-result-object v0

    invoke-static {v0}, LJ7/g;->a(LJ7/e;)I

    move-result v0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    .prologue
    invoke-static {p1}, LI7/M;->c(Ljava/lang/Object;)LI7/o;

    move-result-object p1

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    :cond_0
    invoke-virtual {p0}, LI7/o;->t()LI7/n;

    move-result-object v1

    invoke-virtual {p1}, LI7/o;->t()LI7/n;

    move-result-object v2

    invoke-static {v1, v2}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p0}, LI7/o;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, LI7/o;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, LI7/o;->J:Ljava/lang/String;

    iget-object v2, p1, LI7/o;->J:Ljava/lang/String;

    invoke-static {v1, v2}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, LI7/o;->K:Ljava/lang/Object;

    iget-object p1, p1, LI7/o;->K:Ljava/lang/Object;

    invoke-static {v1, p1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 v0, 0x1

    :cond_1
    return v0
.end method

.method public getName()Ljava/lang/String;
    .locals 2

    invoke-virtual {p0}, LI7/o;->P()LO7/y;

    move-result-object v0

    invoke-interface {v0}, LO7/I;->getName()Ln8/f;

    move-result-object v0

    invoke-virtual {v0}, Ln8/f;->g()Ljava/lang/String;

    move-result-object v0

    const-string v1, "asString(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    invoke-virtual {p0}, LI7/o;->t()LI7/n;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, LI7/o;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LI7/o;->J:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1, p2, p3}, LI7/g$a;->d(LI7/g;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1}, LI7/g$a;->b(LI7/g;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public o(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, LI7/g$a;->e(LI7/g;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public s()LJ7/e;
    .locals 1

    iget-object v0, p0, LI7/o;->M:Li7/n;

    invoke-interface {v0}, Li7/n;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LJ7/e;

    return-object v0
.end method

.method public t()LI7/n;
    .locals 1

    iget-object v0, p0, LI7/o;->I:LI7/n;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    sget-object v0, LI7/H;->a:LI7/H;

    invoke-virtual {p0}, LI7/o;->P()LO7/y;

    move-result-object v1

    invoke-virtual {v0, v1}, LI7/H;->d(LO7/y;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1, p2}, LI7/g$a;->c(LI7/g;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public v(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-static/range {p0 .. p5}, LI7/g$a;->f(LI7/g;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public x()LJ7/e;
    .locals 1

    iget-object v0, p0, LI7/o;->N:Li7/n;

    invoke-interface {v0}, Li7/n;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LJ7/e;

    return-object v0
.end method

.method public y()Z
    .locals 1

    invoke-virtual {p0}, LI7/o;->P()LO7/y;

    move-result-object v0

    invoke-interface {v0}, LO7/y;->y()Z

    move-result v0

    return v0
.end method
