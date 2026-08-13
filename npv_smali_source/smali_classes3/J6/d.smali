.class public final LJ6/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:LW6/a;

.field private final b:LC6/c;

.field private final c:Ljava/lang/Object;

.field private final d:Ljava/util/List;

.field private e:Lx7/a;


# direct methods
.method public constructor <init>(LW6/a;LC6/c;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "key"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "client"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pluginConfig"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LJ6/d;->a:LW6/a;

    iput-object p2, p0, LJ6/d;->b:LC6/c;

    iput-object p3, p0, LJ6/d;->c:Ljava/lang/Object;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, LJ6/d;->d:Ljava/util/List;

    new-instance p1, LJ6/c;

    invoke-direct {p1}, LJ6/c;-><init>()V

    iput-object p1, p0, LJ6/d;->e:Lx7/a;

    return-void
.end method

.method public static synthetic a()Li7/M;
    .locals 1

    invoke-static {}, LJ6/d;->g()Li7/M;

    move-result-object v0

    return-object v0
.end method

.method private static final g()Li7/M;
    .locals 1

    sget-object v0, Li7/M;->a:Li7/M;

    return-object v0
.end method


# virtual methods
.method public final b()LC6/c;
    .locals 1

    iget-object v0, p0, LJ6/d;->b:LC6/c;

    return-object v0
.end method

.method public final c()Ljava/util/List;
    .locals 1

    iget-object v0, p0, LJ6/d;->d:Ljava/util/List;

    return-object v0
.end method

.method public final d()Lx7/a;
    .locals 1

    iget-object v0, p0, LJ6/d;->e:Lx7/a;

    return-object v0
.end method

.method public final e()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LJ6/d;->c:Ljava/lang/Object;

    return-object v0
.end method

.method public final f(LJ6/a;Ljava/lang/Object;)V
    .locals 2

    const-string v0, "hook"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LJ6/d;->d:Ljava/util/List;

    new-instance v1, LJ6/j;

    invoke-direct {v1, p1, p2}, LJ6/j;-><init>(LJ6/a;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final h(Lx7/s;)V
    .locals 1

    const-string v0, "block"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LJ6/n;->a:LJ6/n;

    invoke-virtual {p0, v0, p1}, LJ6/d;->f(LJ6/a;Ljava/lang/Object;)V

    return-void
.end method
