.class public final LH8/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LO7/G;


# static fields
.field public static final C:LH8/d;

.field private static final D:Ln8/f;

.field private static final E:Ljava/util/List;

.field private static final F:Ljava/util/List;

.field private static final G:Ljava/util/Set;

.field private static final H:Li7/n;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LH8/d;

    invoke-direct {v0}, LH8/d;-><init>()V

    sput-object v0, LH8/d;->C:LH8/d;

    sget-object v0, LH8/b;->G:LH8/b;

    invoke-virtual {v0}, LH8/b;->g()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ln8/f;->s(Ljava/lang/String;)Ln8/f;

    move-result-object v0

    const-string v1, "special(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v0, LH8/d;->D:Ln8/f;

    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object v0

    sput-object v0, LH8/d;->E:Ljava/util/List;

    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object v0

    sput-object v0, LH8/d;->F:Ljava/util/List;

    invoke-static {}, Lj7/Z;->d()Ljava/util/Set;

    move-result-object v0

    sput-object v0, LH8/d;->G:Ljava/util/Set;

    sget-object v0, LH8/d$a;->D:LH8/d$a;

    invoke-static {v0}, Li7/o;->b(Lx7/a;)Li7/n;

    move-result-object v0

    sput-object v0, LH8/d;->H:Li7/n;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public C0()Ljava/util/List;
    .locals 1

    sget-object v0, LH8/d;->F:Ljava/util/List;

    return-object v0
.end method

.method public M()Ln8/f;
    .locals 1

    sget-object v0, LH8/d;->D:Ln8/f;

    return-object v0
.end method

.method public U(LO7/G;)Z
    .locals 1

    const-string v0, "targetModule"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    return p1
.end method

.method public a()LO7/m;
    .locals 0

    return-object p0
.end method

.method public b()LO7/m;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getName()Ln8/f;
    .locals 1

    invoke-virtual {p0}, LH8/d;->M()Ln8/f;

    move-result-object v0

    return-object v0
.end method

.method public k()LP7/g;
    .locals 1

    sget-object v0, LP7/g;->d:LP7/g$a;

    invoke-virtual {v0}, LP7/g$a;->b()LP7/g;

    move-result-object v0

    return-object v0
.end method

.method public q0(LO7/F;)Ljava/lang/Object;
    .locals 1

    const-string v0, "capability"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method public r0(LO7/o;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    const-string p2, "visitor"

    invoke-static {p1, p2}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method public s0(Ln8/c;)LO7/P;
    .locals 1

    const-string v0, "fqName"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Should not be called!"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public t()LL7/g;
    .locals 1

    sget-object v0, LH8/d;->H:Li7/n;

    invoke-interface {v0}, Li7/n;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LL7/g;

    return-object v0
.end method

.method public x(Ln8/c;Lx7/l;)Ljava/util/Collection;
    .locals 1

    const-string v0, "fqName"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "nameFilter"

    invoke-static {p2, p1}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    return-object p1
.end method
