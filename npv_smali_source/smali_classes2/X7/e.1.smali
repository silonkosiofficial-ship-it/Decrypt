.class public final LX7/e;
.super LX7/I;
.source "SourceFile"


# static fields
.field public static final o:LX7/e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LX7/e;

    invoke-direct {v0}, LX7/e;-><init>()V

    sput-object v0, LX7/e;->o:LX7/e;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, LX7/I;-><init>()V

    return-void
.end method


# virtual methods
.method public final i(LO7/Z;)Ln8/f;
    .locals 1

    .prologue
    const-string v0, "functionDescriptor"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LX7/I;->a:LX7/I$a;

    invoke-virtual {v0}, LX7/I$a;->j()Ljava/util/Map;

    move-result-object v0

    invoke-static {p1}, Lg8/y;->d(LO7/a;)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ln8/f;

    return-object p1
.end method

.method public final j(LO7/Z;)Z
    .locals 4

    .prologue
    const-string v0, "functionDescriptor"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, LL7/g;->g0(LO7/m;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    new-instance v0, LX7/e$a;

    invoke-direct {v0, p1}, LX7/e$a;-><init>(LO7/Z;)V

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-static {p1, v1, v0, v3, v2}, Lv8/c;->f(LO7/b;ZLx7/l;ILjava/lang/Object;)LO7/b;

    move-result-object p1

    if-eqz p1, :cond_0

    move v1, v3

    :cond_0
    return v1
.end method

.method public final k(LO7/Z;)Z
    .locals 2

    .prologue
    const-string v0, "<this>"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, LO7/I;->getName()Ln8/f;

    move-result-object v0

    invoke-virtual {v0}, Ln8/f;->g()Ljava/lang/String;

    move-result-object v0

    const-string v1, "removeAt"

    invoke-static {v0, v1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p1}, Lg8/y;->d(LO7/a;)Ljava/lang/String;

    move-result-object p1

    sget-object v0, LX7/I;->a:LX7/I$a;

    invoke-virtual {v0}, LX7/I$a;->h()LX7/I$a$a;

    move-result-object v0

    invoke-virtual {v0}, LX7/I$a$a;->d()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method
