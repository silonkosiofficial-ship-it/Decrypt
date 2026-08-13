.class public final LI7/B;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LF7/p;
.implements LI7/l;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LI7/B$a;
    }
.end annotation


# static fields
.field static final synthetic F:[LF7/k;


# instance fields
.field private final C:LO7/f0;

.field private final D:LI7/F$a;

.field private final E:LI7/C;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Ly7/G;

    const-class v1, LI7/B;

    invoke-static {v1}, Ly7/P;->b(Ljava/lang/Class;)LF7/c;

    move-result-object v1

    const-string v2, "upperBounds"

    const-string v3, "getUpperBounds()Ljava/util/List;"

    invoke-direct {v0, v1, v2, v3}, Ly7/G;-><init>(LF7/e;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v0}, Ly7/P;->j(Ly7/F;)LF7/m;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [LF7/k;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    sput-object v1, LI7/B;->F:[LF7/k;

    return-void
.end method

.method public constructor <init>(LI7/C;LO7/f0;)V
    .locals 2

    .prologue
    const-string v0, "descriptor"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, LI7/B;->C:LO7/f0;

    new-instance p2, LI7/B$b;

    invoke-direct {p2, p0}, LI7/B$b;-><init>(LI7/B;)V

    invoke-static {p2}, LI7/F;->c(Lx7/a;)LI7/F$a;

    move-result-object p2

    iput-object p2, p0, LI7/B;->D:LI7/F$a;

    if-nez p1, :cond_5

    invoke-virtual {p0}, LI7/B;->f()LO7/f0;

    move-result-object p1

    invoke-interface {p1}, LO7/n;->b()LO7/m;

    move-result-object p1

    const-string p2, "getContainingDeclaration(...)"

    invoke-static {p1, p2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, LO7/e;

    if-eqz v0, :cond_0

    check-cast p1, LO7/e;

    invoke-direct {p0, p1}, LI7/B;->h(LO7/e;)LI7/k;

    move-result-object p1

    goto :goto_2

    :cond_0
    instance-of v0, p1, LO7/b;

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, LO7/b;

    invoke-interface {v0}, LO7/n;->b()LO7/m;

    move-result-object v0

    invoke-static {v0, p2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of p2, v0, LO7/e;

    if-eqz p2, :cond_1

    check-cast v0, LO7/e;

    invoke-direct {p0, v0}, LI7/B;->h(LO7/e;)LI7/k;

    move-result-object p2

    goto :goto_1

    :cond_1
    instance-of p2, p1, LD8/g;

    if-eqz p2, :cond_2

    move-object p2, p1

    check-cast p2, LD8/g;

    goto :goto_0

    :cond_2
    const/4 p2, 0x0

    :goto_0
    if-eqz p2, :cond_3

    invoke-direct {p0, p2}, LI7/B;->e(LD8/g;)Ljava/lang/Class;

    move-result-object p2

    invoke-static {p2}, Lw7/a;->e(Ljava/lang/Class;)LF7/c;

    move-result-object p2

    const-string v0, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KClassImpl<*>"

    invoke-static {p2, v0}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, LI7/k;

    :goto_1
    new-instance v0, LI7/e;

    invoke-direct {v0, p2}, LI7/e;-><init>(LI7/n;)V

    sget-object p2, Li7/M;->a:Li7/M;

    invoke-interface {p1, v0, p2}, LO7/m;->r0(LO7/o;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    :goto_2
    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    check-cast p1, LI7/C;

    goto :goto_3

    :cond_3
    new-instance p2, LI7/D;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Non-class callable descriptor must be deserialized: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, LI7/D;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_4
    new-instance p2, LI7/D;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unknown type parameter container: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, LI7/D;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_5
    :goto_3
    iput-object p1, p0, LI7/B;->E:LI7/C;

    return-void
.end method

.method private final e(LD8/g;)Ljava/lang/Class;
    .locals 3

    .prologue
    invoke-interface {p1}, LD8/g;->k0()LD8/f;

    move-result-object v0

    instance-of v1, v0, Lg8/n;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    check-cast v0, Lg8/n;

    goto :goto_0

    :cond_0
    move-object v0, v2

    :goto_0
    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lg8/n;->g()Lg8/t;

    move-result-object v0

    goto :goto_1

    :cond_1
    move-object v0, v2

    :goto_1
    instance-of v1, v0, LT7/f;

    if-eqz v1, :cond_2

    move-object v2, v0

    check-cast v2, LT7/f;

    :cond_2
    if-eqz v2, :cond_3

    invoke-virtual {v2}, LT7/f;->f()Ljava/lang/Class;

    move-result-object v0

    if-eqz v0, :cond_3

    return-object v0

    :cond_3
    new-instance v0, LI7/D;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Container of deserialized member is not resolved: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, LI7/D;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private final h(LO7/e;)LI7/k;
    .locals 3

    .prologue
    invoke-static {p1}, LI7/M;->q(LO7/e;)Ljava/lang/Class;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {v0}, Lw7/a;->e(Ljava/lang/Class;)LF7/c;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    check-cast v0, LI7/k;

    if-eqz v0, :cond_1

    return-object v0

    :cond_1
    new-instance v0, LI7/D;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Type parameter container is not resolved: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p1}, LO7/e;->b()LO7/m;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, LI7/D;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public bridge synthetic a()LO7/h;
    .locals 1

    invoke-virtual {p0}, LI7/B;->f()LO7/f0;

    move-result-object v0

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2

    .prologue
    instance-of v0, p1, LI7/B;

    if-eqz v0, :cond_0

    iget-object v0, p0, LI7/B;->E:LI7/C;

    check-cast p1, LI7/B;

    iget-object v1, p1, LI7/B;->E:LI7/C;

    invoke-static {v0, v1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LI7/B;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, LI7/B;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public f()LO7/f0;
    .locals 1

    iget-object v0, p0, LI7/B;->C:LO7/f0;

    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 2

    invoke-virtual {p0}, LI7/B;->f()LO7/f0;

    move-result-object v0

    invoke-interface {v0}, LO7/I;->getName()Ln8/f;

    move-result-object v0

    invoke-virtual {v0}, Ln8/f;->g()Ljava/lang/String;

    move-result-object v0

    const-string v1, "asString(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public getUpperBounds()Ljava/util/List;
    .locals 3

    iget-object v0, p0, LI7/B;->D:LI7/F$a;

    sget-object v1, LI7/B;->F:[LF7/k;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-virtual {v0, p0, v1}, LI7/F$b;->e(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "getValue(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, LI7/B;->E:LI7/C;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, LI7/B;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public s()LF7/r;
    .locals 2

    .prologue
    invoke-virtual {p0}, LI7/B;->f()LO7/f0;

    move-result-object v0

    invoke-interface {v0}, LO7/f0;->s()LF8/u0;

    move-result-object v0

    sget-object v1, LI7/B$a;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    sget-object v0, LF7/r;->E:LF7/r;

    goto :goto_0

    :cond_0
    new-instance v0, Li7/s;

    invoke-direct {v0}, Li7/s;-><init>()V

    throw v0

    :cond_1
    sget-object v0, LF7/r;->D:LF7/r;

    goto :goto_0

    :cond_2
    sget-object v0, LF7/r;->C:LF7/r;

    :goto_0
    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    sget-object v0, Ly7/X;->H:Ly7/X$a;

    invoke-virtual {v0, p0}, Ly7/X$a;->a(LF7/p;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
