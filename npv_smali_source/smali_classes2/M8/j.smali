.class final LM8/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LM8/f;


# static fields
.field public static final a:LM8/j;

.field private static final b:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LM8/j;

    invoke-direct {v0}, LM8/j;-><init>()V

    sput-object v0, LM8/j;->a:LM8/j;

    const-string v0, "second parameter must be of type KProperty<*> or its supertype"

    sput-object v0, LM8/j;->b:Ljava/lang/String;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LO7/y;)Z
    .locals 2

    .prologue
    const-string v0, "functionDescriptor"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, LO7/a;->n()Ljava/util/List;

    move-result-object p1

    const/4 v0, 0x1

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LO7/j0;

    sget-object v0, LL7/i;->k:LL7/i$b;

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-static {p1}, Lv8/c;->p(LO7/m;)LO7/G;

    move-result-object v1

    invoke-virtual {v0, v1}, LL7/i$b;->a(LO7/G;)LF8/E;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, LO7/i0;->getType()LF8/E;

    move-result-object p1

    const-string v1, "getType(...)"

    invoke-static {p1, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, LK8/a;->v(LF8/E;)LF8/E;

    move-result-object p1

    invoke-static {v0, p1}, LK8/a;->r(LF8/E;LF8/E;)Z

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public b(LO7/y;)Ljava/lang/String;
    .locals 0

    invoke-static {p0, p1}, LM8/f$a;->a(LM8/f;LO7/y;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public getDescription()Ljava/lang/String;
    .locals 1

    sget-object v0, LM8/j;->b:Ljava/lang/String;

    return-object v0
.end method
