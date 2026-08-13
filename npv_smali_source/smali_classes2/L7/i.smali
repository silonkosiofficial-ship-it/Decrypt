.class public final LL7/i;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LL7/i$a;,
        LL7/i$b;
    }
.end annotation


# static fields
.field public static final k:LL7/i$b;

.field static final synthetic l:[LF7/k;


# instance fields
.field private final a:LO7/J;

.field private final b:Li7/n;

.field private final c:LL7/i$a;

.field private final d:LL7/i$a;

.field private final e:LL7/i$a;

.field private final f:LL7/i$a;

.field private final g:LL7/i$a;

.field private final h:LL7/i$a;

.field private final i:LL7/i$a;

.field private final j:LL7/i$a;


# direct methods
.method static constructor <clinit>()V
    .locals 11

    new-instance v0, Ly7/G;

    const-class v1, LL7/i;

    invoke-static {v1}, Ly7/P;->b(Ljava/lang/Class;)LF7/c;

    move-result-object v2

    const-string v3, "kClass"

    const-string v4, "getKClass()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;"

    invoke-direct {v0, v2, v3, v4}, Ly7/G;-><init>(LF7/e;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v0}, Ly7/P;->j(Ly7/F;)LF7/m;

    move-result-object v0

    new-instance v2, Ly7/G;

    invoke-static {v1}, Ly7/P;->b(Ljava/lang/Class;)LF7/c;

    move-result-object v3

    const-string v4, "kProperty"

    const-string v5, "getKProperty()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;"

    invoke-direct {v2, v3, v4, v5}, Ly7/G;-><init>(LF7/e;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v2}, Ly7/P;->j(Ly7/F;)LF7/m;

    move-result-object v2

    new-instance v3, Ly7/G;

    invoke-static {v1}, Ly7/P;->b(Ljava/lang/Class;)LF7/c;

    move-result-object v4

    const-string v5, "kProperty0"

    const-string v6, "getKProperty0()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;"

    invoke-direct {v3, v4, v5, v6}, Ly7/G;-><init>(LF7/e;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v3}, Ly7/P;->j(Ly7/F;)LF7/m;

    move-result-object v3

    new-instance v4, Ly7/G;

    invoke-static {v1}, Ly7/P;->b(Ljava/lang/Class;)LF7/c;

    move-result-object v5

    const-string v6, "kProperty1"

    const-string v7, "getKProperty1()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;"

    invoke-direct {v4, v5, v6, v7}, Ly7/G;-><init>(LF7/e;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v4}, Ly7/P;->j(Ly7/F;)LF7/m;

    move-result-object v4

    new-instance v5, Ly7/G;

    invoke-static {v1}, Ly7/P;->b(Ljava/lang/Class;)LF7/c;

    move-result-object v6

    const-string v7, "kProperty2"

    const-string v8, "getKProperty2()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;"

    invoke-direct {v5, v6, v7, v8}, Ly7/G;-><init>(LF7/e;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v5}, Ly7/P;->j(Ly7/F;)LF7/m;

    move-result-object v5

    new-instance v6, Ly7/G;

    invoke-static {v1}, Ly7/P;->b(Ljava/lang/Class;)LF7/c;

    move-result-object v7

    const-string v8, "kMutableProperty0"

    const-string v9, "getKMutableProperty0()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;"

    invoke-direct {v6, v7, v8, v9}, Ly7/G;-><init>(LF7/e;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v6}, Ly7/P;->j(Ly7/F;)LF7/m;

    move-result-object v6

    new-instance v7, Ly7/G;

    invoke-static {v1}, Ly7/P;->b(Ljava/lang/Class;)LF7/c;

    move-result-object v8

    const-string v9, "kMutableProperty1"

    const-string v10, "getKMutableProperty1()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;"

    invoke-direct {v7, v8, v9, v10}, Ly7/G;-><init>(LF7/e;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v7}, Ly7/P;->j(Ly7/F;)LF7/m;

    move-result-object v7

    new-instance v8, Ly7/G;

    invoke-static {v1}, Ly7/P;->b(Ljava/lang/Class;)LF7/c;

    move-result-object v1

    const-string v9, "kMutableProperty2"

    const-string v10, "getKMutableProperty2()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;"

    invoke-direct {v8, v1, v9, v10}, Ly7/G;-><init>(LF7/e;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v8}, Ly7/P;->j(Ly7/F;)LF7/m;

    move-result-object v1

    const/16 v8, 0x8

    new-array v8, v8, [LF7/k;

    const/4 v9, 0x0

    aput-object v0, v8, v9

    const/4 v0, 0x1

    aput-object v2, v8, v0

    const/4 v0, 0x2

    aput-object v3, v8, v0

    const/4 v0, 0x3

    aput-object v4, v8, v0

    const/4 v0, 0x4

    aput-object v5, v8, v0

    const/4 v0, 0x5

    aput-object v6, v8, v0

    const/4 v0, 0x6

    aput-object v7, v8, v0

    const/4 v0, 0x7

    aput-object v1, v8, v0

    sput-object v8, LL7/i;->l:[LF7/k;

    new-instance v0, LL7/i$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LL7/i$b;-><init>(Ly7/k;)V

    sput-object v0, LL7/i;->k:LL7/i$b;

    return-void
.end method

.method public constructor <init>(LO7/G;LO7/J;)V
    .locals 2

    const-string v0, "module"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "notFoundClasses"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, LL7/i;->a:LO7/J;

    sget-object p2, Li7/r;->D:Li7/r;

    new-instance v0, LL7/i$c;

    invoke-direct {v0, p1}, LL7/i$c;-><init>(LO7/G;)V

    invoke-static {p2, v0}, Li7/o;->a(Li7/r;Lx7/a;)Li7/n;

    move-result-object p1

    iput-object p1, p0, LL7/i;->b:Li7/n;

    new-instance p1, LL7/i$a;

    const/4 p2, 0x1

    invoke-direct {p1, p2}, LL7/i$a;-><init>(I)V

    iput-object p1, p0, LL7/i;->c:LL7/i$a;

    new-instance p1, LL7/i$a;

    invoke-direct {p1, p2}, LL7/i$a;-><init>(I)V

    iput-object p1, p0, LL7/i;->d:LL7/i$a;

    new-instance p1, LL7/i$a;

    invoke-direct {p1, p2}, LL7/i$a;-><init>(I)V

    iput-object p1, p0, LL7/i;->e:LL7/i$a;

    new-instance p1, LL7/i$a;

    const/4 v0, 0x2

    invoke-direct {p1, v0}, LL7/i$a;-><init>(I)V

    iput-object p1, p0, LL7/i;->f:LL7/i$a;

    new-instance p1, LL7/i$a;

    const/4 v1, 0x3

    invoke-direct {p1, v1}, LL7/i$a;-><init>(I)V

    iput-object p1, p0, LL7/i;->g:LL7/i$a;

    new-instance p1, LL7/i$a;

    invoke-direct {p1, p2}, LL7/i$a;-><init>(I)V

    iput-object p1, p0, LL7/i;->h:LL7/i$a;

    new-instance p1, LL7/i$a;

    invoke-direct {p1, v0}, LL7/i$a;-><init>(I)V

    iput-object p1, p0, LL7/i;->i:LL7/i$a;

    new-instance p1, LL7/i$a;

    invoke-direct {p1, v1}, LL7/i$a;-><init>(I)V

    iput-object p1, p0, LL7/i;->j:LL7/i$a;

    return-void
.end method

.method public static final synthetic a(LL7/i;Ljava/lang/String;I)LO7/e;
    .locals 0

    invoke-direct {p0, p1, p2}, LL7/i;->b(Ljava/lang/String;I)LO7/e;

    move-result-object p0

    return-object p0
.end method

.method private final b(Ljava/lang/String;I)LO7/e;
    .locals 3

    .prologue
    invoke-static {p1}, Ln8/f;->o(Ljava/lang/String;)Ln8/f;

    move-result-object p1

    const-string v0, "identifier(...)"

    invoke-static {p1, v0}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LL7/i;->d()Ly8/h;

    move-result-object v0

    sget-object v1, LW7/d;->J:LW7/d;

    invoke-interface {v0, p1, v1}, Ly8/k;->g(Ln8/f;LW7/b;)LO7/h;

    move-result-object v0

    instance-of v1, v0, LO7/e;

    if-eqz v1, :cond_0

    check-cast v0, LO7/e;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    iget-object v0, p0, LL7/i;->a:LO7/J;

    new-instance v1, Ln8/b;

    sget-object v2, LL7/j;->v:Ln8/c;

    invoke-direct {v1, v2, p1}, Ln8/b;-><init>(Ln8/c;Ln8/f;)V

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {p1}, Lj7/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, LO7/J;->d(Ln8/b;Ljava/util/List;)LO7/e;

    move-result-object v0

    :cond_1
    return-object v0
.end method

.method private final d()Ly8/h;
    .locals 1

    iget-object v0, p0, LL7/i;->b:Li7/n;

    invoke-interface {v0}, Li7/n;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ly8/h;

    return-object v0
.end method


# virtual methods
.method public final c()LO7/e;
    .locals 3

    iget-object v0, p0, LL7/i;->c:LL7/i$a;

    sget-object v1, LL7/i;->l:[LF7/k;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-virtual {v0, p0, v1}, LL7/i$a;->a(LL7/i;LF7/k;)LO7/e;

    move-result-object v0

    return-object v0
.end method
