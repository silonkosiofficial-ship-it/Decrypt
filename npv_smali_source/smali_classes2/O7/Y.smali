.class public final LO7/Y;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LO7/Y$a;
    }
.end annotation


# static fields
.field public static final e:LO7/Y$a;

.field static final synthetic f:[LF7/k;


# instance fields
.field private final a:LO7/e;

.field private final b:Lx7/l;

.field private final c:LG8/g;

.field private final d:LE8/i;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Ly7/G;

    const-class v1, LO7/Y;

    invoke-static {v1}, Ly7/P;->b(Ljava/lang/Class;)LF7/c;

    move-result-object v1

    const-string v2, "scopeForOwnerModule"

    const-string v3, "getScopeForOwnerModule()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;"

    invoke-direct {v0, v1, v2, v3}, Ly7/G;-><init>(LF7/e;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v0}, Ly7/P;->j(Ly7/F;)LF7/m;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [LF7/k;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    sput-object v1, LO7/Y;->f:[LF7/k;

    new-instance v0, LO7/Y$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LO7/Y$a;-><init>(Ly7/k;)V

    sput-object v0, LO7/Y;->e:LO7/Y$a;

    return-void
.end method

.method private constructor <init>(LO7/e;LE8/n;Lx7/l;LG8/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LO7/Y;->a:LO7/e;

    iput-object p3, p0, LO7/Y;->b:Lx7/l;

    iput-object p4, p0, LO7/Y;->c:LG8/g;

    new-instance p1, LO7/Y$c;

    invoke-direct {p1, p0}, LO7/Y$c;-><init>(LO7/Y;)V

    invoke-interface {p2, p1}, LE8/n;->d(Lx7/a;)LE8/i;

    move-result-object p1

    iput-object p1, p0, LO7/Y;->d:LE8/i;

    return-void
.end method

.method public synthetic constructor <init>(LO7/e;LE8/n;Lx7/l;LG8/g;Ly7/k;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, LO7/Y;-><init>(LO7/e;LE8/n;Lx7/l;LG8/g;)V

    return-void
.end method

.method public static final synthetic a(LO7/Y;)LG8/g;
    .locals 0

    iget-object p0, p0, LO7/Y;->c:LG8/g;

    return-object p0
.end method

.method public static final synthetic b(LO7/Y;)Lx7/l;
    .locals 0

    iget-object p0, p0, LO7/Y;->b:Lx7/l;

    return-object p0
.end method

.method private final d()Ly8/h;
    .locals 3

    iget-object v0, p0, LO7/Y;->d:LE8/i;

    sget-object v1, LO7/Y;->f:[LF7/k;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-static {v0, p0, v1}, LE8/m;->a(LE8/i;Ljava/lang/Object;LF7/k;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ly8/h;

    return-object v0
.end method


# virtual methods
.method public final c(LG8/g;)Ly8/h;
    .locals 2

    .prologue
    const-string v0, "kotlinTypeRefiner"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LO7/Y;->a:LO7/e;

    invoke-static {v0}, Lv8/c;->p(LO7/m;)LO7/G;

    move-result-object v0

    invoke-virtual {p1, v0}, LG8/g;->d(LO7/G;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-direct {p0}, LO7/Y;->d()Ly8/h;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object v0, p0, LO7/Y;->a:LO7/e;

    invoke-interface {v0}, LO7/h;->p()LF8/e0;

    move-result-object v0

    const-string v1, "getTypeConstructor(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v0}, LG8/g;->e(LF8/e0;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-direct {p0}, LO7/Y;->d()Ly8/h;

    move-result-object p1

    return-object p1

    :cond_1
    iget-object v0, p0, LO7/Y;->a:LO7/e;

    new-instance v1, LO7/Y$b;

    invoke-direct {v1, p0, p1}, LO7/Y$b;-><init>(LO7/Y;LG8/g;)V

    invoke-virtual {p1, v0, v1}, LG8/g;->c(LO7/e;Lx7/a;)Ly8/h;

    move-result-object p1

    return-object p1
.end method
