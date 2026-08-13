.class public final LI7/I;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LI7/I;

.field private static final b:Ln8/b;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LI7/I;

    invoke-direct {v0}, LI7/I;-><init>()V

    sput-object v0, LI7/I;->a:LI7/I;

    new-instance v0, Ln8/c;

    const-string v1, "java.lang.Void"

    invoke-direct {v0, v1}, Ln8/c;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Ln8/b;->m(Ln8/c;)Ln8/b;

    move-result-object v0

    const-string v1, "topLevel(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v0, LI7/I;->b:Ln8/b;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final a(Ljava/lang/Class;)LL7/h;
    .locals 1

    .prologue
    invoke-virtual {p1}, Ljava/lang/Class;->isPrimitive()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lw8/e;->i(Ljava/lang/String;)Lw8/e;

    move-result-object p1

    invoke-virtual {p1}, Lw8/e;->o()LL7/h;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method private final b(LO7/y;)Z
    .locals 3

    .prologue
    invoke-static {p1}, Lr8/e;->p(LO7/y;)Z

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_2

    invoke-static {p1}, Lr8/e;->q(LO7/y;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p1}, LO7/I;->getName()Ln8/f;

    move-result-object v0

    sget-object v2, LN7/a;->e:LN7/a$a;

    invoke-virtual {v2}, LN7/a$a;->a()Ln8/f;

    move-result-object v2

    invoke-static {v0, v2}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, LO7/a;->n()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_1

    return v1

    :cond_1
    const/4 p1, 0x0

    return p1

    :cond_2
    :goto_0
    return v1
.end method

.method private final d(LO7/y;)LI7/h$e;
    .locals 6

    new-instance v0, LI7/h$e;

    new-instance v1, Lm8/d$b;

    invoke-direct {p0, p1}, LI7/I;->e(LO7/b;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static {p1, v5, v5, v3, v4}, Lg8/y;->c(LO7/y;ZZILjava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, v2, p1}, Lm8/d$b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {v0, v1}, LI7/h$e;-><init>(Lm8/d$b;)V

    return-object v0
.end method

.method private final e(LO7/b;)Ljava/lang/String;
    .locals 2

    .prologue
    invoke-static {p1}, LX7/H;->b(LO7/b;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_2

    instance-of v0, p1, LO7/V;

    const-string v1, "asString(...)"

    if-eqz v0, :cond_0

    invoke-static {p1}, Lv8/c;->t(LO7/b;)LO7/b;

    move-result-object p1

    invoke-interface {p1}, LO7/I;->getName()Ln8/f;

    move-result-object p1

    invoke-virtual {p1}, Ln8/f;->g()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, LX7/A;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    instance-of v0, p1, LO7/W;

    if-eqz v0, :cond_1

    invoke-static {p1}, Lv8/c;->t(LO7/b;)LO7/b;

    move-result-object p1

    invoke-interface {p1}, LO7/I;->getName()Ln8/f;

    move-result-object p1

    invoke-virtual {p1}, Ln8/f;->g()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, LX7/A;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_1
    invoke-interface {p1}, LO7/I;->getName()Ln8/f;

    move-result-object p1

    invoke-virtual {p1}, Ln8/f;->g()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_2
    :goto_0
    return-object v0
.end method


# virtual methods
.method public final c(Ljava/lang/Class;)Ln8/b;
    .locals 3

    .prologue
    const-string v0, "klass"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Class;->isArray()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    move-result-object p1

    const-string v0, "getComponentType(...)"

    invoke-static {p1, v0}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, LI7/I;->a(Ljava/lang/Class;)LL7/h;

    move-result-object p1

    if-eqz p1, :cond_0

    new-instance v0, Ln8/b;

    sget-object v1, LL7/j;->y:Ln8/c;

    invoke-virtual {p1}, LL7/h;->i()Ln8/f;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Ln8/b;-><init>(Ln8/c;Ln8/f;)V

    return-object v0

    :cond_0
    sget-object p1, LL7/j$a;->i:Ln8/d;

    invoke-virtual {p1}, Ln8/d;->l()Ln8/c;

    move-result-object p1

    invoke-static {p1}, Ln8/b;->m(Ln8/c;)Ln8/b;

    move-result-object p1

    const-string v0, "topLevel(...)"

    invoke-static {p1, v0}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    :cond_1
    sget-object v0, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    invoke-static {p1, v0}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object p1, LI7/I;->b:Ln8/b;

    return-object p1

    :cond_2
    invoke-direct {p0, p1}, LI7/I;->a(Ljava/lang/Class;)LL7/h;

    move-result-object v0

    if-eqz v0, :cond_3

    new-instance p1, Ln8/b;

    sget-object v1, LL7/j;->y:Ln8/c;

    invoke-virtual {v0}, LL7/h;->n()Ln8/f;

    move-result-object v0

    invoke-direct {p1, v1, v0}, Ln8/b;-><init>(Ln8/c;Ln8/f;)V

    return-object p1

    :cond_3
    invoke-static {p1}, LU7/d;->a(Ljava/lang/Class;)Ln8/b;

    move-result-object p1

    invoke-virtual {p1}, Ln8/b;->k()Z

    move-result v0

    if-nez v0, :cond_4

    sget-object v0, LN7/c;->a:LN7/c;

    invoke-virtual {p1}, Ln8/b;->b()Ln8/c;

    move-result-object v1

    const-string v2, "asSingleFqName(...)"

    invoke-static {v1, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, LN7/c;->m(Ln8/c;)Ln8/b;

    move-result-object v0

    if-eqz v0, :cond_4

    return-object v0

    :cond_4
    return-object p1
.end method

.method public final f(LO7/U;)LI7/i;
    .locals 7

    .prologue
    const-string v0, "possiblyOverriddenProperty"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lr8/f;->L(LO7/b;)LO7/b;

    move-result-object p1

    check-cast p1, LO7/U;

    invoke-interface {p1}, LO7/U;->a()LO7/U;

    move-result-object v1

    const-string p1, "getOriginal(...)"

    invoke-static {v1, p1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of p1, v1, LD8/j;

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    move-object p1, v1

    check-cast p1, LD8/j;

    invoke-virtual {p1}, LD8/j;->o1()Li8/n;

    move-result-object v2

    sget-object v3, Ll8/a;->d:Lp8/i$f;

    const-string v4, "propertySignature"

    invoke-static {v3, v4}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2, v3}, Lk8/e;->a(Lp8/i$d;Lp8/i$f;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll8/a$d;

    if-eqz v3, :cond_a

    new-instance v6, LI7/i$c;

    invoke-virtual {p1}, LD8/j;->h0()Lk8/c;

    move-result-object v4

    invoke-virtual {p1}, LD8/j;->Z()Lk8/g;

    move-result-object v5

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, LI7/i$c;-><init>(LO7/U;Li8/n;Ll8/a$d;Lk8/c;Lk8/g;)V

    return-object v6

    :cond_0
    instance-of p1, v1, LZ7/f;

    if-eqz p1, :cond_a

    move-object p1, v1

    check-cast p1, LZ7/f;

    invoke-virtual {p1}, LR7/k;->o()LO7/a0;

    move-result-object p1

    instance-of v2, p1, Ld8/a;

    if-eqz v2, :cond_1

    check-cast p1, Ld8/a;

    goto :goto_0

    :cond_1
    move-object p1, v0

    :goto_0
    if-eqz p1, :cond_2

    invoke-interface {p1}, Ld8/a;->b()Le8/l;

    move-result-object p1

    goto :goto_1

    :cond_2
    move-object p1, v0

    :goto_1
    instance-of v2, p1, LU7/r;

    if-eqz v2, :cond_3

    new-instance v0, LI7/i$a;

    check-cast p1, LU7/r;

    invoke-virtual {p1}, LU7/r;->a0()Ljava/lang/reflect/Field;

    move-result-object p1

    invoke-direct {v0, p1}, LI7/i$a;-><init>(Ljava/lang/reflect/Field;)V

    goto :goto_6

    :cond_3
    instance-of v2, p1, LU7/u;

    if-eqz v2, :cond_9

    new-instance v2, LI7/i$b;

    check-cast p1, LU7/u;

    invoke-virtual {p1}, LU7/u;->a0()Ljava/lang/reflect/Method;

    move-result-object p1

    invoke-interface {v1}, LO7/U;->i()LO7/W;

    move-result-object v1

    if-eqz v1, :cond_4

    invoke-interface {v1}, LO7/p;->o()LO7/a0;

    move-result-object v1

    goto :goto_2

    :cond_4
    move-object v1, v0

    :goto_2
    instance-of v3, v1, Ld8/a;

    if-eqz v3, :cond_5

    check-cast v1, Ld8/a;

    goto :goto_3

    :cond_5
    move-object v1, v0

    :goto_3
    if-eqz v1, :cond_6

    invoke-interface {v1}, Ld8/a;->b()Le8/l;

    move-result-object v1

    goto :goto_4

    :cond_6
    move-object v1, v0

    :goto_4
    instance-of v3, v1, LU7/u;

    if-eqz v3, :cond_7

    check-cast v1, LU7/u;

    goto :goto_5

    :cond_7
    move-object v1, v0

    :goto_5
    if-eqz v1, :cond_8

    invoke-virtual {v1}, LU7/u;->a0()Ljava/lang/reflect/Method;

    move-result-object v0

    :cond_8
    invoke-direct {v2, p1, v0}, LI7/i$b;-><init>(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V

    move-object v0, v2

    :goto_6
    return-object v0

    :cond_9
    new-instance v0, LI7/D;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Incorrect resolution sequence for Java field "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " (source = "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 p1, 0x29

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, LI7/D;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_a
    invoke-interface {v1}, LO7/U;->d()LO7/V;

    move-result-object p1

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-direct {p0, p1}, LI7/I;->d(LO7/y;)LI7/h$e;

    move-result-object p1

    invoke-interface {v1}, LO7/U;->i()LO7/W;

    move-result-object v1

    if-eqz v1, :cond_b

    invoke-direct {p0, v1}, LI7/I;->d(LO7/y;)LI7/h$e;

    move-result-object v0

    :cond_b
    new-instance v1, LI7/i$d;

    invoke-direct {v1, p1, v0}, LI7/i$d;-><init>(LI7/h$e;LI7/h$e;)V

    return-object v1
.end method

.method public final g(LO7/y;)LI7/h;
    .locals 8

    .prologue
    const-string v0, "possiblySubstitutedFunction"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lr8/f;->L(LO7/b;)LO7/b;

    move-result-object v0

    check-cast v0, LO7/y;

    invoke-interface {v0}, LO7/y;->a()LO7/y;

    move-result-object v0

    const-string v1, "getOriginal(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v1, v0, LD8/b;

    const/4 v2, 0x0

    if-eqz v1, :cond_9

    move-object v1, v0

    check-cast v1, LD8/b;

    invoke-interface {v1}, LD8/g;->J()Lp8/p;

    move-result-object v3

    instance-of v4, v3, Li8/i;

    if-eqz v4, :cond_0

    sget-object v4, Lm8/i;->a:Lm8/i;

    move-object v5, v3

    check-cast v5, Li8/i;

    invoke-interface {v1}, LD8/g;->h0()Lk8/c;

    move-result-object v6

    invoke-interface {v1}, LD8/g;->Z()Lk8/g;

    move-result-object v7

    invoke-virtual {v4, v5, v6, v7}, Lm8/i;->e(Li8/i;Lk8/c;Lk8/g;)Lm8/d$b;

    move-result-object v4

    if-eqz v4, :cond_0

    new-instance p1, LI7/h$e;

    invoke-direct {p1, v4}, LI7/h$e;-><init>(Lm8/d$b;)V

    return-object p1

    :cond_0
    instance-of v4, v3, Li8/d;

    if-eqz v4, :cond_8

    sget-object v4, Lm8/i;->a:Lm8/i;

    check-cast v3, Li8/d;

    invoke-interface {v1}, LD8/g;->h0()Lk8/c;

    move-result-object v5

    invoke-interface {v1}, LD8/g;->Z()Lk8/g;

    move-result-object v1

    invoke-virtual {v4, v3, v5, v1}, Lm8/i;->b(Li8/d;Lk8/c;Lk8/g;)Lm8/d$b;

    move-result-object v1

    if-eqz v1, :cond_8

    invoke-interface {p1}, LO7/y;->b()LO7/m;

    move-result-object v0

    const-string v3, "getContainingDeclaration(...)"

    invoke-static {v0, v3}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lr8/h;->b(LO7/m;)Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance p1, LI7/h$e;

    invoke-direct {p1, v1}, LI7/h$e;-><init>(Lm8/d$b;)V

    goto/16 :goto_1

    :cond_1
    invoke-interface {p1}, LO7/y;->b()LO7/m;

    move-result-object v0

    invoke-static {v0, v3}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lr8/h;->d(LO7/m;)Z

    move-result v0

    if-eqz v0, :cond_7

    check-cast p1, LO7/l;

    invoke-interface {p1}, LO7/l;->G()Z

    move-result v0

    const-string v3, ")V"

    const-string v4, "constructor-impl"

    const-string v5, "Invalid signature: "

    const/4 v6, 0x2

    const/4 v7, 0x0

    if-eqz v0, :cond_3

    invoke-virtual {v1}, Lm8/d$b;->c()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v4}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-virtual {v1}, Lm8/d$b;->b()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v3, v7, v6, v2}, LS8/r;->J(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_0

    :cond_2
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    invoke-virtual {v1}, Lm8/d$b;->c()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v4}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {p1}, LO7/l;->H()LO7/e;

    move-result-object p1

    const-string v0, "getConstructedClass(...)"

    invoke-static {p1, v0}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, LJ7/k;->t(LO7/h;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1}, Lm8/d$b;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v3, v7, v6, v2}, LS8/r;->J(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1}, Lm8/d$b;->b()Ljava/lang/String;

    move-result-object v3

    const-string v4, "V"

    invoke-static {v3, v4}, LS8/r;->K0(Ljava/lang/String;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x1

    invoke-static {v1, v2, p1, v0, v2}, Lm8/d$b;->e(Lm8/d$b;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lm8/d$b;

    move-result-object v1

    goto :goto_0

    :cond_4
    invoke-virtual {v1}, Lm8/d$b;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1, v7, v6, v2}, LS8/r;->J(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_5

    :goto_0
    new-instance p1, LI7/h$e;

    invoke-direct {p1, v1}, LI7/h$e;-><init>(Lm8/d$b;)V

    goto :goto_1

    :cond_5
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_6
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_7
    new-instance p1, LI7/h$d;

    invoke-direct {p1, v1}, LI7/h$d;-><init>(Lm8/d$b;)V

    :goto_1
    return-object p1

    :cond_8
    invoke-direct {p0, v0}, LI7/I;->d(LO7/y;)LI7/h$e;

    move-result-object p1

    return-object p1

    :cond_9
    instance-of p1, v0, LZ7/e;

    if-eqz p1, :cond_e

    move-object p1, v0

    check-cast p1, LZ7/e;

    invoke-virtual {p1}, LR7/k;->o()LO7/a0;

    move-result-object p1

    instance-of v1, p1, Ld8/a;

    if-eqz v1, :cond_a

    check-cast p1, Ld8/a;

    goto :goto_2

    :cond_a
    move-object p1, v2

    :goto_2
    if-eqz p1, :cond_b

    invoke-interface {p1}, Ld8/a;->b()Le8/l;

    move-result-object p1

    goto :goto_3

    :cond_b
    move-object p1, v2

    :goto_3
    instance-of v1, p1, LU7/u;

    if-eqz v1, :cond_c

    move-object v2, p1

    check-cast v2, LU7/u;

    :cond_c
    if-eqz v2, :cond_d

    invoke-virtual {v2}, LU7/u;->a0()Ljava/lang/reflect/Method;

    move-result-object p1

    if-eqz p1, :cond_d

    new-instance v0, LI7/h$c;

    invoke-direct {v0, p1}, LI7/h$c;-><init>(Ljava/lang/reflect/Method;)V

    return-object v0

    :cond_d
    new-instance p1, LI7/D;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Incorrect resolution sequence for Java method "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, LI7/D;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_e
    instance-of p1, v0, LZ7/b;

    const/16 v1, 0x29

    const-string v3, " ("

    if-eqz p1, :cond_13

    move-object p1, v0

    check-cast p1, LZ7/b;

    invoke-virtual {p1}, LR7/k;->o()LO7/a0;

    move-result-object p1

    instance-of v4, p1, Ld8/a;

    if-eqz v4, :cond_f

    check-cast p1, Ld8/a;

    goto :goto_4

    :cond_f
    move-object p1, v2

    :goto_4
    if-eqz p1, :cond_10

    invoke-interface {p1}, Ld8/a;->b()Le8/l;

    move-result-object v2

    :cond_10
    instance-of p1, v2, LU7/o;

    if-eqz p1, :cond_11

    new-instance p1, LI7/h$b;

    check-cast v2, LU7/o;

    invoke-virtual {v2}, LU7/o;->a0()Ljava/lang/reflect/Constructor;

    move-result-object v0

    invoke-direct {p1, v0}, LI7/h$b;-><init>(Ljava/lang/reflect/Constructor;)V

    goto :goto_5

    :cond_11
    instance-of p1, v2, LU7/l;

    if-eqz p1, :cond_12

    move-object p1, v2

    check-cast p1, LU7/l;

    invoke-virtual {p1}, LU7/l;->t()Z

    move-result v4

    if-eqz v4, :cond_12

    new-instance v0, LI7/h$a;

    invoke-virtual {p1}, LU7/l;->Z()Ljava/lang/Class;

    move-result-object p1

    invoke-direct {v0, p1}, LI7/h$a;-><init>(Ljava/lang/Class;)V

    move-object p1, v0

    :goto_5
    return-object p1

    :cond_12
    new-instance p1, LI7/D;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Incorrect resolution sequence for Java constructor "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, LI7/D;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_13
    invoke-direct {p0, v0}, LI7/I;->b(LO7/y;)Z

    move-result p1

    if-eqz p1, :cond_14

    invoke-direct {p0, v0}, LI7/I;->d(LO7/y;)LI7/h$e;

    move-result-object p1

    return-object p1

    :cond_14
    new-instance p1, LI7/D;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Unknown origin of "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, LI7/D;-><init>(Ljava/lang/String;)V

    throw p1
.end method
