.class public final Lb8/l$e;
.super LP8/b$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lb8/l;->O(LO7/e;Ljava/util/Set;Lx7/l;)Ljava/util/Set;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LO7/e;

.field final synthetic b:Ljava/util/Set;

.field final synthetic c:Lx7/l;


# direct methods
.method constructor <init>(LO7/e;Ljava/util/Set;Lx7/l;)V
    .locals 0

    iput-object p1, p0, Lb8/l$e;->a:LO7/e;

    iput-object p2, p0, Lb8/l$e;->b:Ljava/util/Set;

    iput-object p3, p0, Lb8/l$e;->c:Lx7/l;

    invoke-direct {p0}, LP8/b$b;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lb8/l$e;->e()V

    sget-object v0, Li7/M;->a:Li7/M;

    return-object v0
.end method

.method public bridge synthetic c(Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, LO7/e;

    invoke-virtual {p0, p1}, Lb8/l$e;->d(LO7/e;)Z

    move-result p1

    return p1
.end method

.method public d(LO7/e;)Z
    .locals 2

    .prologue
    const-string v0, "current"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lb8/l$e;->a:LO7/e;

    const/4 v1, 0x1

    if-ne p1, v0, :cond_0

    return v1

    :cond_0
    invoke-interface {p1}, LO7/e;->Y()Ly8/h;

    move-result-object p1

    const-string v0, "getStaticScope(...)"

    invoke-static {p1, v0}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lb8/m;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lb8/l$e;->b:Ljava/util/Set;

    iget-object v1, p0, Lb8/l$e;->c:Lx7/l;

    invoke-interface {v1, p1}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    invoke-interface {v0, p1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    const/4 p1, 0x0

    return p1

    :cond_1
    return v1
.end method

.method public e()V
    .locals 0

    return-void
.end method
