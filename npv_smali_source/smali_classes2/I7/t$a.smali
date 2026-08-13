.class final LI7/t$a;
.super LI7/n$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LI7/t;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "a"
.end annotation


# static fields
.field static final synthetic j:[LF7/k;


# instance fields
.field private final d:LI7/F$a;

.field private final e:LI7/F$a;

.field private final f:Li7/n;

.field private final g:Li7/n;

.field private final h:LI7/F$a;

.field final synthetic i:LI7/t;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Ly7/G;

    const-class v1, LI7/t$a;

    invoke-static {v1}, Ly7/P;->b(Ljava/lang/Class;)LF7/c;

    move-result-object v2

    const-string v3, "kotlinClass"

    const-string v4, "getKotlinClass()Lorg/jetbrains/kotlin/descriptors/runtime/components/ReflectKotlinClass;"

    invoke-direct {v0, v2, v3, v4}, Ly7/G;-><init>(LF7/e;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v0}, Ly7/P;->j(Ly7/F;)LF7/m;

    move-result-object v0

    new-instance v2, Ly7/G;

    invoke-static {v1}, Ly7/P;->b(Ljava/lang/Class;)LF7/c;

    move-result-object v3

    const-string v4, "scope"

    const-string v5, "getScope()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;"

    invoke-direct {v2, v3, v4, v5}, Ly7/G;-><init>(LF7/e;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v2}, Ly7/P;->j(Ly7/F;)LF7/m;

    move-result-object v2

    new-instance v3, Ly7/G;

    invoke-static {v1}, Ly7/P;->b(Ljava/lang/Class;)LF7/c;

    move-result-object v1

    const-string v4, "members"

    const-string v5, "getMembers()Ljava/util/Collection;"

    invoke-direct {v3, v1, v4, v5}, Ly7/G;-><init>(LF7/e;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v3}, Ly7/P;->j(Ly7/F;)LF7/m;

    move-result-object v1

    const/4 v3, 0x3

    new-array v3, v3, [LF7/k;

    const/4 v4, 0x0

    aput-object v0, v3, v4

    const/4 v0, 0x1

    aput-object v2, v3, v0

    const/4 v0, 0x2

    aput-object v1, v3, v0

    sput-object v3, LI7/t$a;->j:[LF7/k;

    return-void
.end method

.method public constructor <init>(LI7/t;)V
    .locals 2

    iput-object p1, p0, LI7/t$a;->i:LI7/t;

    invoke-direct {p0, p1}, LI7/n$b;-><init>(LI7/n;)V

    new-instance v0, LI7/t$a$a;

    invoke-direct {v0, p1}, LI7/t$a$a;-><init>(LI7/t;)V

    invoke-static {v0}, LI7/F;->c(Lx7/a;)LI7/F$a;

    move-result-object v0

    iput-object v0, p0, LI7/t$a;->d:LI7/F$a;

    new-instance v0, LI7/t$a$e;

    invoke-direct {v0, p0}, LI7/t$a$e;-><init>(LI7/t$a;)V

    invoke-static {v0}, LI7/F;->c(Lx7/a;)LI7/F$a;

    move-result-object v0

    iput-object v0, p0, LI7/t$a;->e:LI7/F$a;

    sget-object v0, Li7/r;->D:Li7/r;

    new-instance v1, LI7/t$a$d;

    invoke-direct {v1, p0, p1}, LI7/t$a$d;-><init>(LI7/t$a;LI7/t;)V

    invoke-static {v0, v1}, Li7/o;->a(Li7/r;Lx7/a;)Li7/n;

    move-result-object v1

    iput-object v1, p0, LI7/t$a;->f:Li7/n;

    new-instance v1, LI7/t$a$c;

    invoke-direct {v1, p0}, LI7/t$a$c;-><init>(LI7/t$a;)V

    invoke-static {v0, v1}, Li7/o;->a(Li7/r;Lx7/a;)Li7/n;

    move-result-object v0

    iput-object v0, p0, LI7/t$a;->g:Li7/n;

    new-instance v0, LI7/t$a$b;

    invoke-direct {v0, p1, p0}, LI7/t$a$b;-><init>(LI7/t;LI7/t$a;)V

    invoke-static {v0}, LI7/F;->c(Lx7/a;)LI7/F$a;

    move-result-object p1

    iput-object p1, p0, LI7/t$a;->h:LI7/F$a;

    return-void
.end method

.method public static final synthetic b(LI7/t$a;)LT7/f;
    .locals 0

    invoke-direct {p0}, LI7/t$a;->c()LT7/f;

    move-result-object p0

    return-object p0
.end method

.method private final c()LT7/f;
    .locals 3

    iget-object v0, p0, LI7/t$a;->d:LI7/F$a;

    sget-object v1, LI7/t$a;->j:[LF7/k;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-virtual {v0, p0, v1}, LI7/F$b;->e(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LT7/f;

    return-object v0
.end method


# virtual methods
.method public final d()Li7/A;
    .locals 1

    iget-object v0, p0, LI7/t$a;->g:Li7/n;

    invoke-interface {v0}, Li7/n;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Li7/A;

    return-object v0
.end method

.method public final e()Ljava/lang/Class;
    .locals 1

    iget-object v0, p0, LI7/t$a;->f:Li7/n;

    invoke-interface {v0}, Li7/n;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Class;

    return-object v0
.end method

.method public final f()Ly8/h;
    .locals 3

    iget-object v0, p0, LI7/t$a;->e:LI7/F$a;

    sget-object v1, LI7/t$a;->j:[LF7/k;

    const/4 v2, 0x1

    aget-object v1, v1, v2

    invoke-virtual {v0, p0, v1}, LI7/F$b;->e(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "getValue(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ly8/h;

    return-object v0
.end method
