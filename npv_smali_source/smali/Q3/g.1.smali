.class public abstract LQ3/g;
.super LQ3/c;
.source "SourceFile"

# interfaces
.implements LO3/a$f;


# instance fields
.field private final F:LQ3/d;

.field private final G:Ljava/util/Set;

.field private final H:Landroid/accounts/Account;


# direct methods
.method protected constructor <init>(Landroid/content/Context;Landroid/os/Looper;ILQ3/d;LO3/f$a;LO3/f$b;)V
    .locals 0

    invoke-direct/range {p0 .. p6}, LQ3/g;-><init>(Landroid/content/Context;Landroid/os/Looper;ILQ3/d;LP3/c;LP3/h;)V

    return-void
.end method

.method protected constructor <init>(Landroid/content/Context;Landroid/os/Looper;ILQ3/d;LP3/c;LP3/h;)V
    .locals 9

    invoke-static {p1}, LQ3/h;->a(Landroid/content/Context;)LQ3/h;

    move-result-object v3

    invoke-static {}, LN3/g;->m()LN3/g;

    move-result-object v4

    invoke-static {p5}, LQ3/p;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p5

    move-object v7, p5

    check-cast v7, LP3/c;

    invoke-static {p6}, LQ3/p;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p5

    move-object v8, p5

    check-cast v8, LP3/h;

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p3

    move-object v6, p4

    invoke-direct/range {v0 .. v8}, LQ3/g;-><init>(Landroid/content/Context;Landroid/os/Looper;LQ3/h;LN3/g;ILQ3/d;LP3/c;LP3/h;)V

    return-void
.end method

.method protected constructor <init>(Landroid/content/Context;Landroid/os/Looper;LQ3/h;LN3/g;ILQ3/d;LP3/c;LP3/h;)V
    .locals 10

    .prologue
    move-object v9, p0

    move-object/from16 v0, p7

    move-object/from16 v1, p8

    const/4 v2, 0x0

    if-nez v0, :cond_0

    move-object v6, v2

    goto :goto_0

    :cond_0
    new-instance v3, LQ3/E;

    invoke-direct {v3, v0}, LQ3/E;-><init>(LP3/c;)V

    move-object v6, v3

    :goto_0
    if-nez v1, :cond_1

    move-object v7, v2

    goto :goto_1

    :cond_1
    new-instance v0, LQ3/F;

    invoke-direct {v0, v1}, LQ3/F;-><init>(LP3/h;)V

    move-object v7, v0

    :goto_1
    invoke-virtual/range {p6 .. p6}, LQ3/d;->j()Ljava/lang/String;

    move-result-object v8

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move v5, p5

    invoke-direct/range {v0 .. v8}, LQ3/c;-><init>(Landroid/content/Context;Landroid/os/Looper;LQ3/h;LN3/h;ILQ3/c$a;LQ3/c$b;Ljava/lang/String;)V

    move-object/from16 v0, p6

    iput-object v0, v9, LQ3/g;->F:LQ3/d;

    invoke-virtual/range {p6 .. p6}, LQ3/d;->a()Landroid/accounts/Account;

    move-result-object v1

    iput-object v1, v9, LQ3/g;->H:Landroid/accounts/Account;

    invoke-virtual/range {p6 .. p6}, LQ3/d;->d()Ljava/util/Set;

    move-result-object v0

    invoke-direct {p0, v0}, LQ3/g;->l0(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    iput-object v0, v9, LQ3/g;->G:Ljava/util/Set;

    return-void
.end method

.method private final l0(Ljava/util/Set;)Ljava/util/Set;
    .locals 3

    .prologue
    invoke-virtual {p0, p1}, LQ3/g;->k0(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/common/api/Scope;

    invoke-interface {p1, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Expanding scopes is not permitted, use implied scopes instead"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    return-object v0
.end method


# virtual methods
.method protected final C()Ljava/util/Set;
    .locals 1

    iget-object v0, p0, LQ3/g;->G:Ljava/util/Set;

    return-object v0
.end method

.method public a()Ljava/util/Set;
    .locals 1

    .prologue
    invoke-virtual {p0}, LQ3/c;->o()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LQ3/g;->G:Ljava/util/Set;

    goto :goto_0

    :cond_0
    invoke-static {}, Ljava/util/Collections;->emptySet()Ljava/util/Set;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method protected final j0()LQ3/d;
    .locals 1

    iget-object v0, p0, LQ3/g;->F:LQ3/d;

    return-object v0
.end method

.method protected k0(Ljava/util/Set;)Ljava/util/Set;
    .locals 0

    return-object p1
.end method

.method public final u()Landroid/accounts/Account;
    .locals 1

    iget-object v0, p0, LQ3/g;->H:Landroid/accounts/Account;

    return-object v0
.end method

.method protected w()Ljava/util/concurrent/Executor;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method
