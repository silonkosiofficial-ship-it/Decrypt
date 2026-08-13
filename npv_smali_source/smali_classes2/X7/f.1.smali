.class public final LX7/f;
.super LX7/I;
.source "SourceFile"


# static fields
.field public static final o:LX7/f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LX7/f;

    invoke-direct {v0}, LX7/f;-><init>()V

    sput-object v0, LX7/f;->o:LX7/f;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, LX7/I;-><init>()V

    return-void
.end method

.method public static final synthetic i(LX7/f;LO7/b;)Z
    .locals 0

    invoke-direct {p0, p1}, LX7/f;->j(LO7/b;)Z

    move-result p0

    return p0
.end method

.method private final j(LO7/b;)Z
    .locals 1

    sget-object v0, LX7/I;->a:LX7/I$a;

    invoke-virtual {v0}, LX7/I$a;->e()Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {p1}, Lg8/y;->d(LO7/a;)Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lj7/v;->Z(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public static final k(LO7/y;)LO7/y;
    .locals 4

    .prologue
    const-string v0, "functionDescriptor"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LX7/f;->o:LX7/f;

    invoke-interface {p0}, LO7/I;->getName()Ln8/f;

    move-result-object v1

    const-string v2, "getName(...)"

    invoke-static {v1, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, LX7/f;->l(Ln8/f;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    sget-object v0, LX7/f$a;->D:LX7/f$a;

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {p0, v3, v0, v2, v1}, Lv8/c;->f(LO7/b;ZLx7/l;ILjava/lang/Object;)LO7/b;

    move-result-object p0

    check-cast p0, LO7/y;

    return-object p0
.end method

.method public static final m(LO7/b;)LX7/I$b;
    .locals 5

    .prologue
    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LX7/I;->a:LX7/I$a;

    invoke-virtual {v0}, LX7/I$a;->d()Ljava/util/Set;

    move-result-object v1

    invoke-interface {p0}, LO7/I;->getName()Ln8/f;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    return-object v2

    :cond_0
    sget-object v1, LX7/f$b;->D:LX7/f$b;

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {p0, v4, v1, v3, v2}, Lv8/c;->f(LO7/b;ZLx7/l;ILjava/lang/Object;)LO7/b;

    move-result-object p0

    if-eqz p0, :cond_2

    invoke-static {p0}, Lg8/y;->d(LO7/a;)Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {v0, p0}, LX7/I$a;->l(Ljava/lang/String;)LX7/I$b;

    move-result-object p0

    return-object p0

    :cond_2
    :goto_0
    return-object v2
.end method


# virtual methods
.method public final l(Ln8/f;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LX7/I;->a:LX7/I$a;

    invoke-virtual {v0}, LX7/I$a;->d()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method
