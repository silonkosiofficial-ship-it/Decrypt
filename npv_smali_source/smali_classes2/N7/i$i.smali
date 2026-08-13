.class public final LN7/i$i;
.super LP8/b$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN7/i;->r(LO7/y;)LN7/i$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Ly7/O;


# direct methods
.method constructor <init>(Ljava/lang/String;Ly7/O;)V
    .locals 0

    iput-object p1, p0, LN7/i$i;->a:Ljava/lang/String;

    iput-object p2, p0, LN7/i$i;->b:Ly7/O;

    invoke-direct {p0}, LP8/b$b;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LN7/i$i;->e()LN7/i$a;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic c(Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, LO7/e;

    invoke-virtual {p0, p1}, LN7/i$i;->d(LO7/e;)Z

    move-result p1

    return p1
.end method

.method public d(LO7/e;)Z
    .locals 2

    .prologue
    const-string v0, "javaClassDescriptor"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lg8/A;->a:Lg8/A;

    iget-object v1, p0, LN7/i$i;->a:Ljava/lang/String;

    invoke-static {v0, p1, v1}, Lg8/x;->a(Lg8/A;LO7/e;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    sget-object v0, LN7/l;->a:LN7/l;

    invoke-virtual {v0}, LN7/l;->f()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object p1, p0, LN7/i$i;->b:Ly7/O;

    sget-object v0, LN7/i$a;->C:LN7/i$a;

    :goto_0
    iput-object v0, p1, Ly7/O;->C:Ljava/lang/Object;

    goto :goto_1

    :cond_0
    invoke-virtual {v0}, LN7/l;->i()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object p1, p0, LN7/i$i;->b:Ly7/O;

    sget-object v0, LN7/i$a;->D:LN7/i$a;

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, LN7/l;->c()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object p1, p0, LN7/i$i;->b:Ly7/O;

    sget-object v0, LN7/i$a;->E:LN7/i$a;

    goto :goto_0

    :cond_2
    invoke-virtual {v0}, LN7/l;->d()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    iget-object p1, p0, LN7/i$i;->b:Ly7/O;

    sget-object v0, LN7/i$a;->G:LN7/i$a;

    goto :goto_0

    :cond_3
    :goto_1
    iget-object p1, p0, LN7/i$i;->b:Ly7/O;

    iget-object p1, p1, Ly7/O;->C:Ljava/lang/Object;

    if-nez p1, :cond_4

    const/4 p1, 0x1

    goto :goto_2

    :cond_4
    const/4 p1, 0x0

    :goto_2
    return p1
.end method

.method public e()LN7/i$a;
    .locals 1

    .prologue
    iget-object v0, p0, LN7/i$i;->b:Ly7/O;

    iget-object v0, v0, Ly7/O;->C:Ljava/lang/Object;

    check-cast v0, LN7/i$a;

    if-nez v0, :cond_0

    sget-object v0, LN7/i$a;->F:LN7/i$a;

    :cond_0
    return-object v0
.end method
