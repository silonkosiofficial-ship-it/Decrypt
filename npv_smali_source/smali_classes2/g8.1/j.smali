.class public final Lg8/j;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lg8/j$a;
    }
.end annotation


# static fields
.field public static final b:Lg8/j$a;

.field private static final c:Ljava/util/Set;

.field private static final d:Ljava/util/Set;

.field private static final e:Lm8/e;

.field private static final f:Lm8/e;

.field private static final g:Lm8/e;


# instance fields
.field public a:LB8/k;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lg8/j$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lg8/j$a;-><init>(Ly7/k;)V

    sput-object v0, Lg8/j;->b:Lg8/j$a;

    sget-object v0, Lh8/a$a;->G:Lh8/a$a;

    invoke-static {v0}, Lj7/Z;->c(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, Lg8/j;->c:Ljava/util/Set;

    const/4 v0, 0x2

    new-array v1, v0, [Lh8/a$a;

    sget-object v2, Lh8/a$a;->H:Lh8/a$a;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    sget-object v2, Lh8/a$a;->K:Lh8/a$a;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v1}, Lj7/Z;->g([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v1

    sput-object v1, Lg8/j;->d:Ljava/util/Set;

    new-instance v1, Lm8/e;

    filled-new-array {v3, v3, v0}, [I

    move-result-object v0

    invoke-direct {v1, v0}, Lm8/e;-><init>([I)V

    sput-object v1, Lg8/j;->e:Lm8/e;

    new-instance v0, Lm8/e;

    const/16 v1, 0xb

    filled-new-array {v3, v3, v1}, [I

    move-result-object v1

    invoke-direct {v0, v1}, Lm8/e;-><init>([I)V

    sput-object v0, Lg8/j;->f:Lm8/e;

    new-instance v0, Lm8/e;

    const/16 v1, 0xd

    filled-new-array {v3, v3, v1}, [I

    move-result-object v1

    invoke-direct {v0, v1}, Lm8/e;-><init>([I)V

    sput-object v0, Lg8/j;->g:Lm8/e;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final synthetic a()Lm8/e;
    .locals 1

    sget-object v0, Lg8/j;->g:Lm8/e;

    return-object v0
.end method

.method private final c(Lg8/t;)LD8/e;
    .locals 1

    .prologue
    invoke-virtual {p0}, Lg8/j;->d()LB8/k;

    move-result-object v0

    invoke-virtual {v0}, LB8/k;->g()LB8/l;

    move-result-object v0

    invoke-interface {v0}, LB8/l;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    sget-object p1, LD8/e;->C:LD8/e;

    goto :goto_0

    :cond_1
    invoke-interface {p1}, Lg8/t;->b()Lh8/a;

    move-result-object v0

    invoke-virtual {v0}, Lh8/a;->j()Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object p1, LD8/e;->D:LD8/e;

    goto :goto_0

    :cond_2
    invoke-interface {p1}, Lg8/t;->b()Lh8/a;

    move-result-object p1

    invoke-virtual {p1}, Lh8/a;->k()Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object p1, LD8/e;->E:LD8/e;

    :goto_0
    return-object p1
.end method

.method private final e(Lg8/t;)LB8/t;
    .locals 8

    .prologue
    invoke-direct {p0}, Lg8/j;->g()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-interface {p1}, Lg8/t;->b()Lh8/a;

    move-result-object v0

    invoke-virtual {v0}, Lh8/a;->d()Lm8/e;

    move-result-object v0

    invoke-direct {p0}, Lg8/j;->f()Lm8/e;

    move-result-object v1

    invoke-virtual {v0, v1}, Lm8/e;->h(Lm8/e;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, LB8/t;

    invoke-interface {p1}, Lg8/t;->b()Lh8/a;

    move-result-object v1

    invoke-virtual {v1}, Lh8/a;->d()Lm8/e;

    move-result-object v2

    sget-object v3, Lm8/e;->i:Lm8/e;

    invoke-direct {p0}, Lg8/j;->f()Lm8/e;

    move-result-object v4

    invoke-direct {p0}, Lg8/j;->f()Lm8/e;

    move-result-object v1

    invoke-interface {p1}, Lg8/t;->b()Lh8/a;

    move-result-object v5

    invoke-virtual {v5}, Lh8/a;->d()Lm8/e;

    move-result-object v5

    invoke-virtual {v5}, Lm8/e;->j()Z

    move-result v5

    invoke-virtual {v1, v5}, Lm8/e;->k(Z)Lm8/e;

    move-result-object v5

    invoke-interface {p1}, Lg8/t;->e()Ljava/lang/String;

    move-result-object v6

    invoke-interface {p1}, Lg8/t;->c()Ln8/b;

    move-result-object v7

    move-object v1, v0

    invoke-direct/range {v1 .. v7}, LB8/t;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Ln8/b;)V

    return-object v0

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return-object p1
.end method

.method private final f()Lm8/e;
    .locals 1

    invoke-virtual {p0}, Lg8/j;->d()LB8/k;

    move-result-object v0

    invoke-virtual {v0}, LB8/k;->g()LB8/l;

    move-result-object v0

    invoke-static {v0}, LP8/c;->a(LB8/l;)Lm8/e;

    move-result-object v0

    return-object v0
.end method

.method private final g()Z
    .locals 1

    invoke-virtual {p0}, Lg8/j;->d()LB8/k;

    move-result-object v0

    invoke-virtual {v0}, LB8/k;->g()LB8/l;

    move-result-object v0

    invoke-interface {v0}, LB8/l;->e()Z

    move-result v0

    return v0
.end method

.method private final h(Lg8/t;)Z
    .locals 1

    .prologue
    invoke-virtual {p0}, Lg8/j;->d()LB8/k;

    move-result-object v0

    invoke-virtual {v0}, LB8/k;->g()LB8/l;

    move-result-object v0

    invoke-interface {v0}, LB8/l;->c()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-interface {p1}, Lg8/t;->b()Lh8/a;

    move-result-object v0

    invoke-virtual {v0}, Lh8/a;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Lg8/t;->b()Lh8/a;

    move-result-object p1

    invoke-virtual {p1}, Lh8/a;->d()Lm8/e;

    move-result-object p1

    sget-object v0, Lg8/j;->f:Lm8/e;

    invoke-static {p1, v0}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method private final i(Lg8/t;)Z
    .locals 2

    .prologue
    invoke-virtual {p0}, Lg8/j;->d()LB8/k;

    move-result-object v0

    invoke-virtual {v0}, LB8/k;->g()LB8/l;

    move-result-object v0

    invoke-interface {v0}, LB8/l;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Lg8/t;->b()Lh8/a;

    move-result-object v0

    invoke-virtual {v0}, Lh8/a;->i()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-interface {p1}, Lg8/t;->b()Lh8/a;

    move-result-object v0

    invoke-virtual {v0}, Lh8/a;->d()Lm8/e;

    move-result-object v0

    sget-object v1, Lg8/j;->e:Lm8/e;

    invoke-static {v0, v1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    invoke-direct {p0, p1}, Lg8/j;->h(Lg8/t;)Z

    move-result p1

    if-eqz p1, :cond_2

    :cond_1
    const/4 p1, 0x1

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method private final k(Lg8/t;Ljava/util/Set;)[Ljava/lang/String;
    .locals 2

    .prologue
    invoke-interface {p1}, Lg8/t;->b()Lh8/a;

    move-result-object p1

    invoke-virtual {p1}, Lh8/a;->a()[Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lh8/a;->b()[Ljava/lang/String;

    move-result-object v0

    :cond_0
    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lh8/a;->c()Lh8/a$a;

    move-result-object p1

    invoke-interface {p2, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    move-object v0, v1

    :goto_0
    return-object v0
.end method


# virtual methods
.method public final b(LO7/K;Lg8/t;)Ly8/h;
    .locals 12

    .prologue
    const-string v0, "descriptor"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "kotlinClass"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lg8/j;->d:Ljava/util/Set;

    invoke-direct {p0, p2, v0}, Lg8/j;->k(Lg8/t;Ljava/util/Set;)[Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    invoke-interface {p2}, Lg8/t;->b()Lh8/a;

    move-result-object v2

    invoke-virtual {v2}, Lh8/a;->g()[Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_1

    return-object v1

    :cond_1
    :try_start_0
    invoke-static {v0, v2}, Lm8/i;->m([Ljava/lang/String;[Ljava/lang/String;)Li7/u;

    move-result-object v0
    :try_end_0
    .catch Lp8/k; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    goto :goto_0

    :catch_0
    move-exception v0

    :try_start_1
    new-instance v2, Ljava/lang/IllegalStateException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Could not read data from "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p2}, Lg8/t;->e()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_0
    invoke-direct {p0}, Lg8/j;->g()Z

    move-result v2

    if-nez v2, :cond_3

    invoke-interface {p2}, Lg8/t;->b()Lh8/a;

    move-result-object v2

    invoke-virtual {v2}, Lh8/a;->d()Lm8/e;

    move-result-object v2

    invoke-direct {p0}, Lg8/j;->f()Lm8/e;

    move-result-object v3

    invoke-virtual {v2, v3}, Lm8/e;->h(Lm8/e;)Z

    move-result v2

    if-nez v2, :cond_3

    move-object v0, v1

    :goto_1
    if-nez v0, :cond_2

    return-object v1

    :cond_2
    invoke-virtual {v0}, Li7/u;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lm8/f;

    invoke-virtual {v0}, Li7/u;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Li8/l;

    new-instance v9, Lg8/n;

    invoke-direct {p0, p2}, Lg8/j;->e(Lg8/t;)LB8/t;

    move-result-object v6

    invoke-direct {p0, p2}, Lg8/j;->i(Lg8/t;)Z

    move-result v7

    invoke-direct {p0, p2}, Lg8/j;->c(Lg8/t;)LD8/e;

    move-result-object v8

    move-object v2, v9

    move-object v3, p2

    move-object v4, v0

    move-object v5, v1

    invoke-direct/range {v2 .. v8}, Lg8/n;-><init>(Lg8/t;Li8/l;Lk8/c;LB8/t;ZLD8/e;)V

    new-instance v11, LD8/i;

    invoke-interface {p2}, Lg8/t;->b()Lh8/a;

    move-result-object p2

    invoke-virtual {p2}, Lh8/a;->d()Lm8/e;

    move-result-object v6

    invoke-virtual {p0}, Lg8/j;->d()LB8/k;

    move-result-object v8

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "scope for "

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " in "

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    sget-object v10, Lg8/j$b;->D:Lg8/j$b;

    move-object v2, v11

    move-object v3, p1

    move-object v7, v9

    move-object v9, p2

    invoke-direct/range {v2 .. v10}, LD8/i;-><init>(LO7/K;Li8/l;Lk8/c;Lk8/a;LD8/f;LB8/k;Ljava/lang/String;Lx7/a;)V

    return-object v11

    :cond_3
    throw v0
.end method

.method public final d()LB8/k;
    .locals 1

    .prologue
    iget-object v0, p0, Lg8/j;->a:LB8/k;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "components"

    invoke-static {v0}, Ly7/t;->p(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final j(Lg8/t;)LB8/g;
    .locals 6

    .prologue
    const-string v0, "kotlinClass"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lg8/j;->c:Ljava/util/Set;

    invoke-direct {p0, p1, v0}, Lg8/j;->k(Lg8/t;Ljava/util/Set;)[Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    invoke-interface {p1}, Lg8/t;->b()Lh8/a;

    move-result-object v2

    invoke-virtual {v2}, Lh8/a;->g()[Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_1

    return-object v1

    :cond_1
    :try_start_0
    invoke-static {v0, v2}, Lm8/i;->i([Ljava/lang/String;[Ljava/lang/String;)Li7/u;

    move-result-object v0
    :try_end_0
    .catch Lp8/k; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    goto :goto_0

    :catch_0
    move-exception v0

    :try_start_1
    new-instance v2, Ljava/lang/IllegalStateException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Could not read data from "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p1}, Lg8/t;->e()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_0
    invoke-direct {p0}, Lg8/j;->g()Z

    move-result v2

    if-nez v2, :cond_3

    invoke-interface {p1}, Lg8/t;->b()Lh8/a;

    move-result-object v2

    invoke-virtual {v2}, Lh8/a;->d()Lm8/e;

    move-result-object v2

    invoke-direct {p0}, Lg8/j;->f()Lm8/e;

    move-result-object v3

    invoke-virtual {v2, v3}, Lm8/e;->h(Lm8/e;)Z

    move-result v2

    if-nez v2, :cond_3

    move-object v0, v1

    :goto_1
    if-nez v0, :cond_2

    return-object v1

    :cond_2
    invoke-virtual {v0}, Li7/u;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lm8/f;

    invoke-virtual {v0}, Li7/u;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Li8/c;

    new-instance v2, Lg8/v;

    invoke-direct {p0, p1}, Lg8/j;->e(Lg8/t;)LB8/t;

    move-result-object v3

    invoke-direct {p0, p1}, Lg8/j;->i(Lg8/t;)Z

    move-result v4

    invoke-direct {p0, p1}, Lg8/j;->c(Lg8/t;)LD8/e;

    move-result-object v5

    invoke-direct {v2, p1, v3, v4, v5}, Lg8/v;-><init>(Lg8/t;LB8/t;ZLD8/e;)V

    new-instance v3, LB8/g;

    invoke-interface {p1}, Lg8/t;->b()Lh8/a;

    move-result-object p1

    invoke-virtual {p1}, Lh8/a;->d()Lm8/e;

    move-result-object p1

    invoke-direct {v3, v1, v0, p1, v2}, LB8/g;-><init>(Lk8/c;Li8/c;Lk8/a;LO7/a0;)V

    return-object v3

    :cond_3
    throw v0
.end method

.method public final l(Lg8/t;)LO7/e;
    .locals 2

    .prologue
    const-string v0, "kotlinClass"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lg8/j;->j(Lg8/t;)LB8/g;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-virtual {p0}, Lg8/j;->d()LB8/k;

    move-result-object v1

    invoke-virtual {v1}, LB8/k;->f()LB8/i;

    move-result-object v1

    invoke-interface {p1}, Lg8/t;->c()Ln8/b;

    move-result-object p1

    invoke-virtual {v1, p1, v0}, LB8/i;->d(Ln8/b;LB8/g;)LO7/e;

    move-result-object p1

    return-object p1
.end method

.method public final m(LB8/k;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lg8/j;->a:LB8/k;

    return-void
.end method

.method public final n(Lg8/h;)V
    .locals 1

    const-string v0, "components"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lg8/h;->a()LB8/k;

    move-result-object p1

    invoke-virtual {p0, p1}, Lg8/j;->m(LB8/k;)V

    return-void
.end method
