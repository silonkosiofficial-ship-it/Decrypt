.class public final LI7/A;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly7/u;


# static fields
.field static final synthetic e:[LF7/k;


# instance fields
.field private final a:LF8/E;

.field private final b:LI7/F$a;

.field private final c:LI7/F$a;

.field private final d:LI7/F$a;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Ly7/G;

    const-class v1, LI7/A;

    invoke-static {v1}, Ly7/P;->b(Ljava/lang/Class;)LF7/c;

    move-result-object v2

    const-string v3, "classifier"

    const-string v4, "getClassifier()Lkotlin/reflect/KClassifier;"

    invoke-direct {v0, v2, v3, v4}, Ly7/G;-><init>(LF7/e;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v0}, Ly7/P;->j(Ly7/F;)LF7/m;

    move-result-object v0

    new-instance v2, Ly7/G;

    invoke-static {v1}, Ly7/P;->b(Ljava/lang/Class;)LF7/c;

    move-result-object v1

    const-string v3, "arguments"

    const-string v4, "getArguments()Ljava/util/List;"

    invoke-direct {v2, v1, v3, v4}, Ly7/G;-><init>(LF7/e;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v2}, Ly7/P;->j(Ly7/F;)LF7/m;

    move-result-object v1

    const/4 v2, 0x2

    new-array v2, v2, [LF7/k;

    const/4 v3, 0x0

    aput-object v0, v2, v3

    const/4 v0, 0x1

    aput-object v1, v2, v0

    sput-object v2, LI7/A;->e:[LF7/k;

    return-void
.end method

.method public constructor <init>(LF8/E;Lx7/a;)V
    .locals 1

    .prologue
    const-string v0, "type"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LI7/A;->a:LF8/E;

    instance-of p1, p2, LI7/F$a;

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    move-object p1, p2

    check-cast p1, LI7/F$a;

    goto :goto_0

    :cond_0
    move-object p1, v0

    :goto_0
    if-nez p1, :cond_1

    if-eqz p2, :cond_2

    invoke-static {p2}, LI7/F;->c(Lx7/a;)LI7/F$a;

    move-result-object v0

    goto :goto_1

    :cond_1
    move-object v0, p1

    :cond_2
    :goto_1
    iput-object v0, p0, LI7/A;->b:LI7/F$a;

    new-instance p1, LI7/A$b;

    invoke-direct {p1, p0}, LI7/A$b;-><init>(LI7/A;)V

    invoke-static {p1}, LI7/F;->c(Lx7/a;)LI7/F$a;

    move-result-object p1

    iput-object p1, p0, LI7/A;->c:LI7/F$a;

    new-instance p1, LI7/A$a;

    invoke-direct {p1, p0, p2}, LI7/A$a;-><init>(LI7/A;Lx7/a;)V

    invoke-static {p1}, LI7/F;->c(Lx7/a;)LI7/F$a;

    move-result-object p1

    iput-object p1, p0, LI7/A;->d:LI7/F$a;

    return-void
.end method

.method public synthetic constructor <init>(LF8/E;Lx7/a;ILy7/k;)V
    .locals 0

    .prologue
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-direct {p0, p1, p2}, LI7/A;-><init>(LF8/E;Lx7/a;)V

    return-void
.end method

.method public static final synthetic d(LI7/A;LF8/E;)LF7/d;
    .locals 0

    invoke-direct {p0, p1}, LI7/A;->e(LF8/E;)LF7/d;

    move-result-object p0

    return-object p0
.end method

.method private final e(LF8/E;)LF7/d;
    .locals 3

    .prologue
    invoke-virtual {p1}, LF8/E;->W0()LF8/e0;

    move-result-object v0

    invoke-interface {v0}, LF8/e0;->w()LO7/h;

    move-result-object v0

    instance-of v1, v0, LO7/e;

    const/4 v2, 0x0

    if-eqz v1, :cond_7

    check-cast v0, LO7/e;

    invoke-static {v0}, LI7/M;->q(LO7/e;)Ljava/lang/Class;

    move-result-object v0

    if-nez v0, :cond_0

    return-object v2

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Class;->isArray()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-virtual {p1}, LF8/E;->U0()Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, Lj7/v;->I0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LF8/i0;

    if-eqz p1, :cond_3

    invoke-interface {p1}, LF8/i0;->getType()LF8/E;

    move-result-object p1

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    invoke-direct {p0, p1}, LI7/A;->e(LF8/E;)LF7/d;

    move-result-object p1

    if-eqz p1, :cond_2

    new-instance v0, LI7/k;

    invoke-static {p1}, LH7/b;->a(LF7/d;)LF7/c;

    move-result-object p1

    invoke-static {p1}, Lw7/a;->b(LF7/c;)Ljava/lang/Class;

    move-result-object p1

    invoke-static {p1}, LI7/M;->f(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object p1

    invoke-direct {v0, p1}, LI7/k;-><init>(Ljava/lang/Class;)V

    return-object v0

    :cond_2
    new-instance p1, LI7/D;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Cannot determine classifier for array element type: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, LI7/D;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    :goto_0
    new-instance p1, LI7/k;

    invoke-direct {p1, v0}, LI7/k;-><init>(Ljava/lang/Class;)V

    return-object p1

    :cond_4
    invoke-static {p1}, LF8/q0;->l(LF8/E;)Z

    move-result p1

    if-nez p1, :cond_6

    new-instance p1, LI7/k;

    invoke-static {v0}, LU7/d;->e(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object v1

    if-nez v1, :cond_5

    goto :goto_1

    :cond_5
    move-object v0, v1

    :goto_1
    invoke-direct {p1, v0}, LI7/k;-><init>(Ljava/lang/Class;)V

    return-object p1

    :cond_6
    new-instance p1, LI7/k;

    invoke-direct {p1, v0}, LI7/k;-><init>(Ljava/lang/Class;)V

    return-object p1

    :cond_7
    instance-of p1, v0, LO7/f0;

    if-eqz p1, :cond_8

    new-instance p1, LI7/B;

    check-cast v0, LO7/f0;

    invoke-direct {p1, v2, v0}, LI7/B;-><init>(LI7/C;LO7/f0;)V

    return-object p1

    :cond_8
    instance-of p1, v0, LO7/e0;

    if-nez p1, :cond_9

    return-object v2

    :cond_9
    new-instance p1, Li7/t;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "An operation is not implemented: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "Type alias classifiers are not yet supported"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Li7/t;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public a()Ljava/util/List;
    .locals 3

    iget-object v0, p0, LI7/A;->d:LI7/F$a;

    sget-object v1, LI7/A;->e:[LF7/k;

    const/4 v2, 0x1

    aget-object v1, v1, v2

    invoke-virtual {v0, p0, v1}, LI7/F$b;->e(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "getValue(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public b()LF7/d;
    .locals 3

    iget-object v0, p0, LI7/A;->c:LI7/F$a;

    sget-object v1, LI7/A;->e:[LF7/k;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-virtual {v0, p0, v1}, LI7/F$b;->e(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LF7/d;

    return-object v0
.end method

.method public c()Ljava/lang/reflect/Type;
    .locals 1

    .prologue
    iget-object v0, p0, LI7/A;->b:LI7/F$a;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LI7/F$a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/reflect/Type;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2

    .prologue
    instance-of v0, p1, LI7/A;

    if-eqz v0, :cond_0

    iget-object v0, p0, LI7/A;->a:LF8/E;

    check-cast p1, LI7/A;

    iget-object v1, p1, LI7/A;->a:LF8/E;

    invoke-static {v0, v1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LI7/A;->b()LF7/d;

    move-result-object v0

    invoke-virtual {p1}, LI7/A;->b()LF7/d;

    move-result-object v1

    invoke-static {v0, v1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LI7/A;->a()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p1}, LI7/A;->a()Ljava/util/List;

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

.method public final f()LF8/E;
    .locals 1

    iget-object v0, p0, LI7/A;->a:LF8/E;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    .prologue
    iget-object v0, p0, LI7/A;->a:LF8/E;

    invoke-virtual {v0}, LF8/E;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, LI7/A;->b()LF7/d;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, LI7/A;->a()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    sget-object v0, LI7/H;->a:LI7/H;

    iget-object v1, p0, LI7/A;->a:LF8/E;

    invoke-virtual {v0, v1}, LI7/H;->h(LF8/E;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
