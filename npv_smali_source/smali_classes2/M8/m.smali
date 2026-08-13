.class final LM8/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LM8/f;


# static fields
.field public static final a:LM8/m;

.field private static final b:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LM8/m;

    invoke-direct {v0}, LM8/m;-><init>()V

    sput-object v0, LM8/m;->a:LM8/m;

    const-string v0, "should not have varargs or parameters with default values"

    sput-object v0, LM8/m;->b:Ljava/lang/String;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LO7/y;)Z
    .locals 3

    .prologue
    const-string v0, "functionDescriptor"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, LO7/a;->n()Ljava/util/List;

    move-result-object p1

    const-string v0, "getValueParameters(...)"

    invoke-static {p1, v0}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Iterable;

    instance-of v0, p1, Ljava/util/Collection;

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LO7/j0;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-static {v0}, Lv8/c;->c(LO7/j0;)Z

    move-result v2

    if-nez v2, :cond_1

    invoke-interface {v0}, LO7/j0;->u0()LF8/E;

    move-result-object v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :cond_2
    :goto_1
    return v1
.end method

.method public b(LO7/y;)Ljava/lang/String;
    .locals 0

    invoke-static {p0, p1}, LM8/f$a;->a(LM8/f;LO7/y;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public getDescription()Ljava/lang/String;
    .locals 1

    sget-object v0, LM8/m;->b:Ljava/lang/String;

    return-object v0
.end method
