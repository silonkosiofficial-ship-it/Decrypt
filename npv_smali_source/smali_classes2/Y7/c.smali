.class public final LY7/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LY7/c;

.field private static final b:Ln8/f;

.field private static final c:Ln8/f;

.field private static final d:Ln8/f;

.field private static final e:Ljava/util/Map;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, LY7/c;

    invoke-direct {v0}, LY7/c;-><init>()V

    sput-object v0, LY7/c;->a:LY7/c;

    const-string v0, "message"

    invoke-static {v0}, Ln8/f;->o(Ljava/lang/String;)Ln8/f;

    move-result-object v0

    const-string v1, "identifier(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v0, LY7/c;->b:Ln8/f;

    const-string v0, "allowedTargets"

    invoke-static {v0}, Ln8/f;->o(Ljava/lang/String;)Ln8/f;

    move-result-object v0

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v0, LY7/c;->c:Ln8/f;

    const-string v0, "value"

    invoke-static {v0}, Ln8/f;->o(Ljava/lang/String;)Ln8/f;

    move-result-object v0

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v0, LY7/c;->d:Ln8/f;

    sget-object v0, LL7/j$a;->H:Ln8/c;

    sget-object v1, LX7/B;->d:Ln8/c;

    invoke-static {v0, v1}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object v0

    sget-object v1, LL7/j$a;->L:Ln8/c;

    sget-object v2, LX7/B;->f:Ln8/c;

    invoke-static {v1, v2}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object v1

    sget-object v2, LL7/j$a;->P:Ln8/c;

    sget-object v3, LX7/B;->i:Ln8/c;

    invoke-static {v2, v3}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object v2

    const/4 v3, 0x3

    new-array v3, v3, [Li7/u;

    const/4 v4, 0x0

    aput-object v0, v3, v4

    const/4 v0, 0x1

    aput-object v1, v3, v0

    const/4 v0, 0x2

    aput-object v2, v3, v0

    invoke-static {v3}, Lj7/S;->k([Li7/u;)Ljava/util/Map;

    move-result-object v0

    sput-object v0, LY7/c;->e:Ljava/util/Map;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic f(LY7/c;Le8/a;La8/g;ZILjava/lang/Object;)LP7/c;
    .locals 0

    .prologue
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, LY7/c;->e(Le8/a;La8/g;Z)LP7/c;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(Ln8/c;Le8/d;La8/g;)LP7/c;
    .locals 7

    .prologue
    const-string v0, "kotlinName"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "annotationOwner"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "c"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LL7/j$a;->y:Ln8/c;

    invoke-static {p1, v0}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object v0, LX7/B;->h:Ln8/c;

    const-string v1, "DEPRECATED_ANNOTATION"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p2, v0}, Le8/d;->j(Ln8/c;)Le8/a;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-interface {p2}, Le8/d;->o()Z

    move-result v1

    if-eqz v1, :cond_1

    :cond_0
    new-instance p1, LY7/e;

    invoke-direct {p1, v0, p3}, LY7/e;-><init>(Le8/a;La8/g;)V

    return-object p1

    :cond_1
    sget-object v0, LY7/c;->e:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ln8/c;

    const/4 v0, 0x0

    if-eqz p1, :cond_2

    invoke-interface {p2, p1}, Le8/d;->j(Ln8/c;)Le8/a;

    move-result-object v2

    if-eqz v2, :cond_2

    sget-object v1, LY7/c;->a:LY7/c;

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v3, p3

    invoke-static/range {v1 .. v6}, LY7/c;->f(LY7/c;Le8/a;La8/g;ZILjava/lang/Object;)LP7/c;

    move-result-object v0

    :cond_2
    return-object v0
.end method

.method public final b()Ln8/f;
    .locals 1

    sget-object v0, LY7/c;->b:Ln8/f;

    return-object v0
.end method

.method public final c()Ln8/f;
    .locals 1

    sget-object v0, LY7/c;->d:Ln8/f;

    return-object v0
.end method

.method public final d()Ln8/f;
    .locals 1

    sget-object v0, LY7/c;->c:Ln8/f;

    return-object v0
.end method

.method public final e(Le8/a;La8/g;Z)LP7/c;
    .locals 2

    .prologue
    const-string v0, "annotation"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "c"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Le8/a;->c()Ln8/b;

    move-result-object v0

    sget-object v1, LX7/B;->d:Ln8/c;

    invoke-static {v1}, Ln8/b;->m(Ln8/c;)Ln8/b;

    move-result-object v1

    invoke-static {v0, v1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance p3, LY7/i;

    invoke-direct {p3, p1, p2}, LY7/i;-><init>(Le8/a;La8/g;)V

    goto :goto_0

    :cond_0
    sget-object v1, LX7/B;->f:Ln8/c;

    invoke-static {v1}, Ln8/b;->m(Ln8/c;)Ln8/b;

    move-result-object v1

    invoke-static {v0, v1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    new-instance p3, LY7/h;

    invoke-direct {p3, p1, p2}, LY7/h;-><init>(Le8/a;La8/g;)V

    goto :goto_0

    :cond_1
    sget-object v1, LX7/B;->i:Ln8/c;

    invoke-static {v1}, Ln8/b;->m(Ln8/c;)Ln8/b;

    move-result-object v1

    invoke-static {v0, v1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    new-instance p3, LY7/b;

    sget-object v0, LL7/j$a;->P:Ln8/c;

    invoke-direct {p3, p2, p1, v0}, LY7/b;-><init>(La8/g;Le8/a;Ln8/c;)V

    goto :goto_0

    :cond_2
    sget-object v1, LX7/B;->h:Ln8/c;

    invoke-static {v1}, Ln8/b;->m(Ln8/c;)Ln8/b;

    move-result-object v1

    invoke-static {v0, v1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    const/4 p3, 0x0

    goto :goto_0

    :cond_3
    new-instance v0, Lb8/e;

    invoke-direct {v0, p2, p1, p3}, Lb8/e;-><init>(La8/g;Le8/a;Z)V

    move-object p3, v0

    :goto_0
    return-object p3
.end method
