.class public LY7/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LP7/c;
.implements LZ7/g;


# static fields
.field static final synthetic f:[LF7/k;


# instance fields
.field private final a:Ln8/c;

.field private final b:LO7/a0;

.field private final c:LE8/i;

.field private final d:Le8/b;

.field private final e:Z


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Ly7/G;

    const-class v1, LY7/b;

    invoke-static {v1}, Ly7/P;->b(Ljava/lang/Class;)LF7/c;

    move-result-object v1

    const-string v2, "type"

    const-string v3, "getType()Lorg/jetbrains/kotlin/types/SimpleType;"

    invoke-direct {v0, v1, v2, v3}, Ly7/G;-><init>(LF7/e;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v0}, Ly7/P;->j(Ly7/F;)LF7/m;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [LF7/k;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    sput-object v1, LY7/b;->f:[LF7/k;

    return-void
.end method

.method public constructor <init>(La8/g;Le8/a;Ln8/c;)V
    .locals 1

    .prologue
    const-string v0, "c"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fqName"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p3, p0, LY7/b;->a:Ln8/c;

    if-eqz p2, :cond_0

    invoke-virtual {p1}, La8/g;->a()La8/b;

    move-result-object p3

    invoke-virtual {p3}, La8/b;->t()Ld8/b;

    move-result-object p3

    invoke-interface {p3, p2}, Ld8/b;->a(Le8/l;)Ld8/a;

    move-result-object p3

    if-eqz p3, :cond_0

    goto :goto_0

    :cond_0
    sget-object p3, LO7/a0;->a:LO7/a0;

    const-string v0, "NO_SOURCE"

    invoke-static {p3, v0}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_0
    iput-object p3, p0, LY7/b;->b:LO7/a0;

    invoke-virtual {p1}, La8/g;->e()LE8/n;

    move-result-object p3

    new-instance v0, LY7/b$a;

    invoke-direct {v0, p1, p0}, LY7/b$a;-><init>(La8/g;LY7/b;)V

    invoke-interface {p3, v0}, LE8/n;->d(Lx7/a;)LE8/i;

    move-result-object p1

    iput-object p1, p0, LY7/b;->c:LE8/i;

    if-eqz p2, :cond_1

    invoke-interface {p2}, Le8/a;->a()Ljava/util/Collection;

    move-result-object p1

    if-eqz p1, :cond_1

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, Lj7/v;->j0(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Le8/b;

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    :goto_1
    iput-object p1, p0, LY7/b;->d:Le8/b;

    const/4 p1, 0x0

    if-eqz p2, :cond_2

    invoke-interface {p2}, Le8/a;->d()Z

    move-result p2

    const/4 p3, 0x1

    if-ne p2, p3, :cond_2

    move p1, p3

    :cond_2
    iput-boolean p1, p0, LY7/b;->e:Z

    return-void
.end method


# virtual methods
.method public a()Ljava/util/Map;
    .locals 1

    invoke-static {}, Lj7/S;->h()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method protected final b()Le8/b;
    .locals 1

    iget-object v0, p0, LY7/b;->d:Le8/b;

    return-object v0
.end method

.method public c()LF8/M;
    .locals 3

    iget-object v0, p0, LY7/b;->c:LE8/i;

    sget-object v1, LY7/b;->f:[LF7/k;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-static {v0, p0, v1}, LE8/m;->a(LE8/i;Ljava/lang/Object;LF7/k;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LF8/M;

    return-object v0
.end method

.method public d()Z
    .locals 1

    iget-boolean v0, p0, LY7/b;->e:Z

    return v0
.end method

.method public e()Ln8/c;
    .locals 1

    iget-object v0, p0, LY7/b;->a:Ln8/c;

    return-object v0
.end method

.method public bridge synthetic getType()LF8/E;
    .locals 1

    invoke-virtual {p0}, LY7/b;->c()LF8/M;

    move-result-object v0

    return-object v0
.end method

.method public o()LO7/a0;
    .locals 1

    iget-object v0, p0, LY7/b;->b:LO7/a0;

    return-object v0
.end method
