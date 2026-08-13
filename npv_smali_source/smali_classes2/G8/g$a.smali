.class public final LG8/g$a;
.super LG8/g;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LG8/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final a:LG8/g$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LG8/g$a;

    invoke-direct {v0}, LG8/g$a;-><init>()V

    sput-object v0, LG8/g$a;->a:LG8/g$a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, LG8/g;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(LJ8/i;)LJ8/i;
    .locals 0

    invoke-virtual {p0, p1}, LG8/g$a;->h(LJ8/i;)LF8/E;

    move-result-object p1

    return-object p1
.end method

.method public b(Ln8/b;)LO7/e;
    .locals 1

    const-string v0, "classId"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method public c(LO7/e;Lx7/a;)Ly8/h;
    .locals 1

    const-string v0, "classDescriptor"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "compute"

    invoke-static {p2, p1}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p2}, Lx7/a;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ly8/h;

    return-object p1
.end method

.method public d(LO7/G;)Z
    .locals 1

    const-string v0, "moduleDescriptor"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    return p1
.end method

.method public e(LF8/e0;)Z
    .locals 1

    const-string v0, "typeConstructor"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    return p1
.end method

.method public bridge synthetic f(LO7/m;)LO7/h;
    .locals 0

    invoke-virtual {p0, p1}, LG8/g$a;->i(LO7/m;)LO7/e;

    move-result-object p1

    return-object p1
.end method

.method public g(LO7/e;)Ljava/util/Collection;
    .locals 1

    const-string v0, "classDescriptor"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, LO7/h;->p()LF8/e0;

    move-result-object p1

    invoke-interface {p1}, LF8/e0;->u()Ljava/util/Collection;

    move-result-object p1

    const-string v0, "getSupertypes(...)"

    invoke-static {p1, v0}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public h(LJ8/i;)LF8/E;
    .locals 1

    const-string v0, "type"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, LF8/E;

    return-object p1
.end method

.method public i(LO7/m;)LO7/e;
    .locals 1

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    return-object p1
.end method
