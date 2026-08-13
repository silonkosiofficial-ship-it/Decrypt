.class public final La8/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La8/k;


# instance fields
.field private final a:La8/g;

.field private final b:LO7/m;

.field private final c:I

.field private final d:Ljava/util/Map;

.field private final e:LE8/h;


# direct methods
.method public constructor <init>(La8/g;LO7/m;Le8/z;I)V
    .locals 1

    const-string v0, "c"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "containingDeclaration"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "typeParameterOwner"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La8/h;->a:La8/g;

    iput-object p2, p0, La8/h;->b:LO7/m;

    iput p4, p0, La8/h;->c:I

    invoke-interface {p3}, Le8/z;->g()Ljava/util/List;

    move-result-object p2

    check-cast p2, Ljava/lang/Iterable;

    invoke-static {p2}, LP8/a;->d(Ljava/lang/Iterable;)Ljava/util/Map;

    move-result-object p2

    iput-object p2, p0, La8/h;->d:Ljava/util/Map;

    invoke-virtual {p1}, La8/g;->e()LE8/n;

    move-result-object p1

    new-instance p2, La8/h$a;

    invoke-direct {p2, p0}, La8/h$a;-><init>(La8/h;)V

    invoke-interface {p1, p2}, LE8/n;->h(Lx7/l;)LE8/h;

    move-result-object p1

    iput-object p1, p0, La8/h;->e:LE8/h;

    return-void
.end method

.method public static final synthetic b(La8/h;)La8/g;
    .locals 0

    iget-object p0, p0, La8/h;->a:La8/g;

    return-object p0
.end method

.method public static final synthetic c(La8/h;)LO7/m;
    .locals 0

    iget-object p0, p0, La8/h;->b:LO7/m;

    return-object p0
.end method

.method public static final synthetic d(La8/h;)Ljava/util/Map;
    .locals 0

    iget-object p0, p0, La8/h;->d:Ljava/util/Map;

    return-object p0
.end method

.method public static final synthetic e(La8/h;)I
    .locals 0

    iget p0, p0, La8/h;->c:I

    return p0
.end method


# virtual methods
.method public a(Le8/y;)LO7/f0;
    .locals 1

    .prologue
    const-string v0, "javaTypeParameter"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, La8/h;->e:LE8/h;

    invoke-interface {v0, p1}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb8/n;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, La8/h;->a:La8/g;

    invoke-virtual {v0}, La8/g;->f()La8/k;

    move-result-object v0

    invoke-interface {v0, p1}, La8/k;->a(Le8/y;)LO7/f0;

    move-result-object v0

    :goto_0
    return-object v0
.end method
