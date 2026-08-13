.class public final La8/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LO7/O;


# instance fields
.field private final a:La8/g;

.field private final b:LE8/a;


# direct methods
.method public constructor <init>(La8/b;)V
    .locals 3

    const-string v0, "components"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, La8/g;

    sget-object v1, La8/k$a;->a:La8/k$a;

    const/4 v2, 0x0

    invoke-static {v2}, Li7/o;->c(Ljava/lang/Object;)Li7/n;

    move-result-object v2

    invoke-direct {v0, p1, v1, v2}, La8/g;-><init>(La8/b;La8/k;Li7/n;)V

    iput-object v0, p0, La8/f;->a:La8/g;

    invoke-virtual {v0}, La8/g;->e()LE8/n;

    move-result-object p1

    invoke-interface {p1}, LE8/n;->c()LE8/a;

    move-result-object p1

    iput-object p1, p0, La8/f;->b:LE8/a;

    return-void
.end method

.method public static final synthetic d(La8/f;)La8/g;
    .locals 0

    iget-object p0, p0, La8/f;->a:La8/g;

    return-object p0
.end method

.method private final e(Ln8/c;)Lb8/h;
    .locals 4

    .prologue
    iget-object v0, p0, La8/f;->a:La8/g;

    invoke-virtual {v0}, La8/g;->a()La8/b;

    move-result-object v0

    invoke-virtual {v0}, La8/b;->d()LX7/p;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {v0, p1, v1, v2, v3}, LX7/o;->a(LX7/p;Ln8/c;ZILjava/lang/Object;)Le8/u;

    move-result-object v0

    if-nez v0, :cond_0

    return-object v3

    :cond_0
    iget-object v1, p0, La8/f;->b:LE8/a;

    new-instance v2, La8/f$a;

    invoke-direct {v2, p0, v0}, La8/f$a;-><init>(La8/f;Le8/u;)V

    invoke-interface {v1, p1, v2}, LE8/a;->a(Ljava/lang/Object;Lx7/a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lb8/h;

    return-object p1
.end method


# virtual methods
.method public a(Ln8/c;)Z
    .locals 4

    .prologue
    const-string v0, "fqName"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, La8/f;->a:La8/g;

    invoke-virtual {v0}, La8/g;->a()La8/b;

    move-result-object v0

    invoke-virtual {v0}, La8/b;->d()LX7/p;

    move-result-object v0

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, p1, v3, v1, v2}, LX7/o;->a(LX7/p;Ln8/c;ZILjava/lang/Object;)Le8/u;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 v3, 0x1

    :cond_0
    return v3
.end method

.method public b(Ln8/c;)Ljava/util/List;
    .locals 1

    const-string v0, "fqName"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, La8/f;->e(Ln8/c;)Lb8/h;

    move-result-object p1

    invoke-static {p1}, Lj7/v;->q(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public c(Ln8/c;Ljava/util/Collection;)V
    .locals 1

    const-string v0, "fqName"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "packageFragments"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, La8/f;->e(Ln8/c;)Lb8/h;

    move-result-object p1

    invoke-static {p2, p1}, LP8/a;->a(Ljava/util/Collection;Ljava/lang/Object;)V

    return-void
.end method

.method public f(Ln8/c;Lx7/l;)Ljava/util/List;
    .locals 1

    .prologue
    const-string v0, "fqName"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nameFilter"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, La8/f;->e(Ln8/c;)Lb8/h;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lb8/h;->Y0()Ljava/util/List;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-nez p1, :cond_1

    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object p1

    :cond_1
    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "LazyJavaPackageFragmentProvider of module "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, La8/f;->a:La8/g;

    invoke-virtual {v1}, La8/g;->a()La8/b;

    move-result-object v1

    invoke-virtual {v1}, La8/b;->m()LO7/G;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic x(Ln8/c;Lx7/l;)Ljava/util/Collection;
    .locals 0

    invoke-virtual {p0, p1, p2}, La8/f;->f(Ln8/c;Lx7/l;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    return-object p1
.end method
