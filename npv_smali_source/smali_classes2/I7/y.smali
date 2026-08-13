.class public abstract LI7/y;
.super LI7/j;
.source "SourceFile"

# interfaces
.implements LF7/k;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LI7/y$a;,
        LI7/y$b;,
        LI7/y$c;,
        LI7/y$d;
    }
.end annotation


# static fields
.field public static final O:LI7/y$b;

.field private static final P:Ljava/lang/Object;


# instance fields
.field private final I:LI7/n;

.field private final J:Ljava/lang/String;

.field private final K:Ljava/lang/String;

.field private final L:Ljava/lang/Object;

.field private final M:Li7/n;

.field private final N:LI7/F$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LI7/y$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LI7/y$b;-><init>(Ly7/k;)V

    sput-object v0, LI7/y;->O:LI7/y$b;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, LI7/y;->P:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(LI7/n;LO7/U;)V
    .locals 7

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

    invoke-virtual {v0, p2}, LI7/I;->f(LO7/U;)LI7/i;

    move-result-object v0

    invoke-virtual {v0}, LI7/i;->a()Ljava/lang/String;

    move-result-object v4

    sget-object v6, Ly7/f;->I:Ljava/lang/Object;

    move-object v1, p0

    move-object v2, p1

    move-object v5, p2

    invoke-direct/range {v1 .. v6}, LI7/y;-><init>(LI7/n;Ljava/lang/String;Ljava/lang/String;LO7/U;Ljava/lang/Object;)V

    return-void
.end method

.method private constructor <init>(LI7/n;Ljava/lang/String;Ljava/lang/String;LO7/U;Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, LI7/j;-><init>()V

    iput-object p1, p0, LI7/y;->I:LI7/n;

    iput-object p2, p0, LI7/y;->J:Ljava/lang/String;

    iput-object p3, p0, LI7/y;->K:Ljava/lang/String;

    iput-object p5, p0, LI7/y;->L:Ljava/lang/Object;

    sget-object p1, Li7/r;->D:Li7/r;

    new-instance p2, LI7/y$f;

    invoke-direct {p2, p0}, LI7/y$f;-><init>(LI7/y;)V

    invoke-static {p1, p2}, Li7/o;->a(Li7/r;Lx7/a;)Li7/n;

    move-result-object p1

    iput-object p1, p0, LI7/y;->M:Li7/n;

    new-instance p1, LI7/y$e;

    invoke-direct {p1, p0}, LI7/y$e;-><init>(LI7/y;)V

    invoke-static {p4, p1}, LI7/F;->b(Ljava/lang/Object;Lx7/a;)LI7/F$a;

    move-result-object p1

    const-string p2, "lazySoft(...)"

    invoke-static {p1, p2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LI7/y;->N:LI7/F$a;

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

    invoke-direct/range {v1 .. v6}, LI7/y;-><init>(LI7/n;Ljava/lang/String;Ljava/lang/String;LO7/U;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic A()LO7/b;
    .locals 1

    invoke-virtual {p0}, LI7/y;->I()LO7/U;

    move-result-object v0

    return-object v0
.end method

.method public E()Z
    .locals 2

    iget-object v0, p0, LI7/y;->L:Ljava/lang/Object;

    sget-object v1, Ly7/f;->I:Ljava/lang/Object;

    invoke-static {v0, v1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method protected final F()Ljava/lang/reflect/Member;
    .locals 4

    .prologue
    invoke-virtual {p0}, LI7/y;->I()LO7/U;

    move-result-object v0

    invoke-interface {v0}, LO7/l0;->T()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    sget-object v0, LI7/I;->a:LI7/I;

    invoke-virtual {p0}, LI7/y;->I()LO7/U;

    move-result-object v2

    invoke-virtual {v0, v2}, LI7/I;->f(LO7/U;)LI7/i;

    move-result-object v0

    instance-of v2, v0, LI7/i$c;

    if-eqz v2, :cond_3

    check-cast v0, LI7/i$c;

    invoke-virtual {v0}, LI7/i$c;->f()Ll8/a$d;

    move-result-object v2

    invoke-virtual {v2}, Ll8/a$d;->E()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-virtual {v0}, LI7/i$c;->f()Ll8/a$d;

    move-result-object v2

    invoke-virtual {v2}, Ll8/a$d;->z()Ll8/a$c;

    move-result-object v2

    invoke-virtual {v2}, Ll8/a$c;->z()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-virtual {v2}, Ll8/a$c;->y()Z

    move-result v3

    if-nez v3, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, LI7/i$c;->d()Lk8/c;

    move-result-object v1

    invoke-virtual {v2}, Ll8/a$c;->x()I

    move-result v3

    invoke-interface {v1, v3}, Lk8/c;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, LI7/i$c;->d()Lk8/c;

    move-result-object v0

    invoke-virtual {v2}, Ll8/a$c;->w()I

    move-result v2

    invoke-interface {v0, v2}, Lk8/c;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, LI7/y;->t()LI7/n;

    move-result-object v2

    invoke-virtual {v2, v1, v0}, LI7/n;->n(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/reflect/Method;

    move-result-object v0

    return-object v0

    :cond_2
    :goto_0
    return-object v1

    :cond_3
    invoke-virtual {p0}, LI7/y;->K()Ljava/lang/reflect/Field;

    move-result-object v0

    return-object v0
.end method

.method public final G()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LI7/y;->L:Ljava/lang/Object;

    invoke-virtual {p0}, LI7/y;->I()LO7/U;

    move-result-object v1

    invoke-static {v0, v1}, LJ7/k;->g(Ljava/lang/Object;LO7/b;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method protected final H(Ljava/lang/reflect/Member;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .prologue
    const/4 v0, 0x2

    const/4 v1, 0x0

    const/4 v2, 0x1

    :try_start_0
    sget-object v3, LI7/y;->P:Ljava/lang/Object;

    if-eq p2, v3, :cond_0

    if-ne p3, v3, :cond_1

    :cond_0
    invoke-virtual {p0}, LI7/y;->I()LO7/U;

    move-result-object v4

    invoke-interface {v4}, LO7/a;->v0()LO7/X;

    move-result-object v4

    if-eqz v4, :cond_10

    :cond_1
    invoke-virtual {p0}, LI7/y;->E()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-virtual {p0}, LI7/y;->G()Ljava/lang/Object;

    move-result-object v4

    goto :goto_0

    :catch_0
    move-exception p1

    goto/16 :goto_7

    :cond_2
    move-object v4, p2

    :goto_0
    const/4 v5, 0x0

    if-eq v4, v3, :cond_3

    goto :goto_1

    :cond_3
    move-object v4, v5

    :goto_1
    invoke-virtual {p0}, LI7/y;->E()Z

    move-result v6

    if-eqz v6, :cond_4

    goto :goto_2

    :cond_4
    move-object p2, p3

    :goto_2
    if-eq p2, v3, :cond_5

    goto :goto_3

    :cond_5
    move-object p2, v5

    :goto_3
    instance-of p3, p1, Ljava/lang/reflect/AccessibleObject;

    if-eqz p3, :cond_6

    move-object p3, p1

    check-cast p3, Ljava/lang/reflect/AccessibleObject;

    goto :goto_4

    :cond_6
    move-object p3, v5

    :goto_4
    if-nez p3, :cond_7

    goto :goto_5

    :cond_7
    invoke-static {p0}, LH7/a;->a(LF7/b;)Z

    move-result v3

    invoke-virtual {p3, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    :goto_5
    if-nez p1, :cond_8

    goto/16 :goto_6

    :cond_8
    instance-of p3, p1, Ljava/lang/reflect/Field;

    if-eqz p3, :cond_9

    check-cast p1, Ljava/lang/reflect/Field;

    invoke-virtual {p1, v4}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    goto :goto_6

    :cond_9
    instance-of p3, p1, Ljava/lang/reflect/Method;

    if-eqz p3, :cond_f

    move-object p3, p1

    check-cast p3, Ljava/lang/reflect/Method;

    invoke-virtual {p3}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object p3

    array-length p3, p3
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz p3, :cond_e

    const-string v3, "get(...)"

    if-eq p3, v2, :cond_c

    if-ne p3, v0, :cond_b

    :try_start_1
    move-object p3, p1

    check-cast p3, Ljava/lang/reflect/Method;

    if-nez p2, :cond_a

    check-cast p1, Ljava/lang/reflect/Method;

    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object p1

    aget-object p1, p1, v2

    invoke-static {p1, v3}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, LI7/M;->g(Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object p2

    :cond_a
    new-array p1, v0, [Ljava/lang/Object;

    aput-object v4, p1, v1

    aput-object p2, p1, v2

    invoke-virtual {p3, v5, p1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    goto :goto_6

    :cond_b
    new-instance p2, Ljava/lang/AssertionError;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "delegate method "

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " should take 0, 1, or 2 parameters"

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p2

    :cond_c
    move-object p2, p1

    check-cast p2, Ljava/lang/reflect/Method;

    if-nez v4, :cond_d

    check-cast p1, Ljava/lang/reflect/Method;

    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object p1

    aget-object p1, p1, v1

    invoke-static {p1, v3}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, LI7/M;->g(Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object v4

    :cond_d
    new-array p1, v2, [Ljava/lang/Object;

    aput-object v4, p1, v1

    invoke-virtual {p2, v5, p1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    goto :goto_6

    :cond_e
    check-cast p1, Ljava/lang/reflect/Method;

    invoke-virtual {p1, v5, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    :goto_6
    return-object v5

    :cond_f
    new-instance p2, Ljava/lang/AssertionError;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "delegate field/method "

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " neither field nor method"

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p2

    :cond_10
    new-instance p1, Ljava/lang/RuntimeException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const/16 p3, 0x27

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p3, "\' is not an extension property and thus getExtensionDelegate() is not going to work, use getDelegate() instead"

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_0

    :goto_7
    new-instance p2, LG7/b;

    invoke-direct {p2, p1}, LG7/b;-><init>(Ljava/lang/IllegalAccessException;)V

    throw p2
.end method

.method public I()LO7/U;
    .locals 2

    iget-object v0, p0, LI7/y;->N:LI7/F$a;

    invoke-virtual {v0}, LI7/F$a;->b()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "invoke(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, LO7/U;

    return-object v0
.end method

.method public abstract J()LI7/y$c;
.end method

.method public final K()Ljava/lang/reflect/Field;
    .locals 1

    iget-object v0, p0, LI7/y;->M:Li7/n;

    invoke-interface {v0}, Li7/n;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/reflect/Field;

    return-object v0
.end method

.method public final L()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LI7/y;->K:Ljava/lang/String;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    .prologue
    invoke-static {p1}, LI7/M;->d(Ljava/lang/Object;)LI7/y;

    move-result-object p1

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    :cond_0
    invoke-virtual {p0}, LI7/y;->t()LI7/n;

    move-result-object v1

    invoke-virtual {p1}, LI7/y;->t()LI7/n;

    move-result-object v2

    invoke-static {v1, v2}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p0}, LI7/y;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, LI7/y;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, LI7/y;->K:Ljava/lang/String;

    iget-object v2, p1, LI7/y;->K:Ljava/lang/String;

    invoke-static {v1, v2}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, LI7/y;->L:Ljava/lang/Object;

    iget-object p1, p1, LI7/y;->L:Ljava/lang/Object;

    invoke-static {v1, p1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 v0, 0x1

    :cond_1
    return v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LI7/y;->J:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    invoke-virtual {p0}, LI7/y;->t()LI7/n;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, LI7/y;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LI7/y;->K:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public s()LJ7/e;
    .locals 1

    invoke-virtual {p0}, LI7/y;->J()LI7/y$c;

    move-result-object v0

    invoke-virtual {v0}, LI7/y$c;->s()LJ7/e;

    move-result-object v0

    return-object v0
.end method

.method public t()LI7/n;
    .locals 1

    iget-object v0, p0, LI7/y;->I:LI7/n;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    sget-object v0, LI7/H;->a:LI7/H;

    invoke-virtual {p0}, LI7/y;->I()LO7/U;

    move-result-object v1

    invoke-virtual {v0, v1}, LI7/H;->g(LO7/U;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public x()LJ7/e;
    .locals 1

    invoke-virtual {p0}, LI7/y;->J()LI7/y$c;

    move-result-object v0

    invoke-virtual {v0}, LI7/y$a;->x()LJ7/e;

    move-result-object v0

    return-object v0
.end method

.method public y()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
