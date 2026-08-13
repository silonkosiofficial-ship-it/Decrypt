.class public final LM8/h;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Ln8/f;

.field private final b:LS8/o;

.field private final c:Ljava/util/Collection;

.field private final d:Lx7/l;

.field private final e:[LM8/f;


# direct methods
.method public constructor <init>(LS8/o;[LM8/f;Lx7/l;)V
    .locals 6

    const-string v0, "regex"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "checks"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "additionalChecks"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v0, p2

    invoke-static {p2, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p2

    move-object v5, p2

    check-cast v5, [LM8/f;

    const/4 v1, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    move-object v2, p1

    move-object v4, p3

    invoke-direct/range {v0 .. v5}, LM8/h;-><init>(Ln8/f;LS8/o;Ljava/util/Collection;Lx7/l;[LM8/f;)V

    return-void
.end method

.method public synthetic constructor <init>(LS8/o;[LM8/f;Lx7/l;ILy7/k;)V
    .locals 0

    .prologue
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    sget-object p3, LM8/h$b;->D:LM8/h$b;

    :cond_0
    invoke-direct {p0, p1, p2, p3}, LM8/h;-><init>(LS8/o;[LM8/f;Lx7/l;)V

    return-void
.end method

.method public constructor <init>(Ljava/util/Collection;[LM8/f;Lx7/l;)V
    .locals 6

    const-string v0, "nameList"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "checks"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "additionalChecks"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v0, p2

    invoke-static {p2, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p2

    move-object v5, p2

    check-cast v5, [LM8/f;

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v0, p0

    move-object v3, p1

    move-object v4, p3

    invoke-direct/range {v0 .. v5}, LM8/h;-><init>(Ln8/f;LS8/o;Ljava/util/Collection;Lx7/l;[LM8/f;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/Collection;[LM8/f;Lx7/l;ILy7/k;)V
    .locals 0

    .prologue
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    sget-object p3, LM8/h$c;->D:LM8/h$c;

    :cond_0
    invoke-direct {p0, p1, p2, p3}, LM8/h;-><init>(Ljava/util/Collection;[LM8/f;Lx7/l;)V

    return-void
.end method

.method private varargs constructor <init>(Ln8/f;LS8/o;Ljava/util/Collection;Lx7/l;[LM8/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LM8/h;->a:Ln8/f;

    iput-object p2, p0, LM8/h;->b:LS8/o;

    iput-object p3, p0, LM8/h;->c:Ljava/util/Collection;

    iput-object p4, p0, LM8/h;->d:Lx7/l;

    iput-object p5, p0, LM8/h;->e:[LM8/f;

    return-void
.end method

.method public constructor <init>(Ln8/f;[LM8/f;Lx7/l;)V
    .locals 6

    const-string v0, "name"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "checks"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "additionalChecks"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v0, p2

    invoke-static {p2, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p2

    move-object v5, p2

    check-cast v5, [LM8/f;

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v4, p3

    invoke-direct/range {v0 .. v5}, LM8/h;-><init>(Ln8/f;LS8/o;Ljava/util/Collection;Lx7/l;[LM8/f;)V

    return-void
.end method

.method public synthetic constructor <init>(Ln8/f;[LM8/f;Lx7/l;ILy7/k;)V
    .locals 0

    .prologue
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    sget-object p3, LM8/h$a;->D:LM8/h$a;

    :cond_0
    invoke-direct {p0, p1, p2, p3}, LM8/h;-><init>(Ln8/f;[LM8/f;Lx7/l;)V

    return-void
.end method


# virtual methods
.method public final a(LO7/y;)LM8/g;
    .locals 4

    .prologue
    const-string v0, "functionDescriptor"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LM8/h;->e:[LM8/f;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    invoke-interface {v3, p1}, LM8/f;->b(LO7/y;)Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_0

    new-instance p1, LM8/g$b;

    invoke-direct {p1, v3}, LM8/g$b;-><init>(Ljava/lang/String;)V

    return-object p1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    iget-object v0, p0, LM8/h;->d:Lx7/l;

    invoke-interface {v0, p1}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-eqz p1, :cond_2

    new-instance v0, LM8/g$b;

    invoke-direct {v0, p1}, LM8/g$b;-><init>(Ljava/lang/String;)V

    return-object v0

    :cond_2
    sget-object p1, LM8/g$c;->b:LM8/g$c;

    return-object p1
.end method

.method public final b(LO7/y;)Z
    .locals 3

    .prologue
    const-string v0, "functionDescriptor"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LM8/h;->a:Ln8/f;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-interface {p1}, LO7/I;->getName()Ln8/f;

    move-result-object v0

    iget-object v2, p0, LM8/h;->a:Ln8/f;

    invoke-static {v0, v2}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, LM8/h;->b:LS8/o;

    if-eqz v0, :cond_1

    invoke-interface {p1}, LO7/I;->getName()Ln8/f;

    move-result-object v0

    invoke-virtual {v0}, Ln8/f;->g()Ljava/lang/String;

    move-result-object v0

    const-string v2, "asString(...)"

    invoke-static {v0, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, p0, LM8/h;->b:LS8/o;

    invoke-virtual {v2, v0}, LS8/o;->d(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    return v1

    :cond_1
    iget-object v0, p0, LM8/h;->c:Ljava/util/Collection;

    if-eqz v0, :cond_2

    invoke-interface {p1}, LO7/I;->getName()Ln8/f;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v1

    :cond_2
    const/4 p1, 0x1

    return p1
.end method
