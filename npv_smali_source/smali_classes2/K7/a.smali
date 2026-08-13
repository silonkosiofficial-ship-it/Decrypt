.class public final LK7/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LK7/a;

.field private static final b:Ljava/util/Set;

.field private static final c:Ln8/b;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    new-instance v0, LK7/a;

    invoke-direct {v0}, LK7/a;-><init>()V

    sput-object v0, LK7/a;->a:LK7/a;

    const/4 v0, 0x6

    new-array v0, v0, [Ln8/c;

    sget-object v1, LX7/B;->a:Ln8/c;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, LX7/B;->l:Ln8/c;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, LX7/B;->m:Ln8/c;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, LX7/B;->d:Ln8/c;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, LX7/B;->f:Ln8/c;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sget-object v1, LX7/B;->i:Ln8/c;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    invoke-static {v0}, Lj7/v;->p([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/LinkedHashSet;

    invoke-direct {v1}, Ljava/util/LinkedHashSet;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ln8/c;

    invoke-static {v2}, Ln8/b;->m(Ln8/c;)Ln8/b;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    sput-object v1, LK7/a;->b:Ljava/util/Set;

    sget-object v0, LX7/B;->j:Ln8/c;

    invoke-static {v0}, Ln8/b;->m(Ln8/c;)Ln8/b;

    move-result-object v0

    const-string v1, "topLevel(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v0, LK7/a;->c:Ln8/b;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Ln8/b;
    .locals 1

    sget-object v0, LK7/a;->c:Ln8/b;

    return-object v0
.end method

.method public final b()Ljava/util/Set;
    .locals 1

    sget-object v0, LK7/a;->b:Ljava/util/Set;

    return-object v0
.end method

.method public final c(Lg8/t;)Z
    .locals 3

    const-string v0, "klass"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ly7/K;

    invoke-direct {v0}, Ly7/K;-><init>()V

    new-instance v1, LK7/a$a;

    invoke-direct {v1, v0}, LK7/a$a;-><init>(Ly7/K;)V

    const/4 v2, 0x0

    invoke-interface {p1, v1, v2}, Lg8/t;->d(Lg8/t$c;[B)V

    iget-boolean p1, v0, Ly7/K;->C:Z

    return p1
.end method
