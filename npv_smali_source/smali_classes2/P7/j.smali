.class public final LP7/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LP7/c;


# instance fields
.field private final a:LL7/g;

.field private final b:Ln8/c;

.field private final c:Ljava/util/Map;

.field private final d:Z

.field private final e:Li7/n;


# direct methods
.method public constructor <init>(LL7/g;Ln8/c;Ljava/util/Map;Z)V
    .locals 1

    const-string v0, "builtIns"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fqName"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "allValueArguments"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LP7/j;->a:LL7/g;

    iput-object p2, p0, LP7/j;->b:Ln8/c;

    iput-object p3, p0, LP7/j;->c:Ljava/util/Map;

    iput-boolean p4, p0, LP7/j;->d:Z

    sget-object p1, Li7/r;->D:Li7/r;

    new-instance p2, LP7/j$a;

    invoke-direct {p2, p0}, LP7/j$a;-><init>(LP7/j;)V

    invoke-static {p1, p2}, Li7/o;->a(Li7/r;Lx7/a;)Li7/n;

    move-result-object p1

    iput-object p1, p0, LP7/j;->e:Li7/n;

    return-void
.end method

.method public synthetic constructor <init>(LL7/g;Ln8/c;Ljava/util/Map;ZILy7/k;)V
    .locals 0

    .prologue
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_0

    const/4 p4, 0x0

    :cond_0
    invoke-direct {p0, p1, p2, p3, p4}, LP7/j;-><init>(LL7/g;Ln8/c;Ljava/util/Map;Z)V

    return-void
.end method

.method public static final synthetic b(LP7/j;)LL7/g;
    .locals 0

    iget-object p0, p0, LP7/j;->a:LL7/g;

    return-object p0
.end method


# virtual methods
.method public a()Ljava/util/Map;
    .locals 1

    iget-object v0, p0, LP7/j;->c:Ljava/util/Map;

    return-object v0
.end method

.method public e()Ln8/c;
    .locals 1

    iget-object v0, p0, LP7/j;->b:Ln8/c;

    return-object v0
.end method

.method public getType()LF8/E;
    .locals 2

    iget-object v0, p0, LP7/j;->e:Li7/n;

    invoke-interface {v0}, Li7/n;->getValue()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "getValue(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, LF8/E;

    return-object v0
.end method

.method public o()LO7/a0;
    .locals 2

    sget-object v0, LO7/a0;->a:LO7/a0;

    const-string v1, "NO_SOURCE"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
