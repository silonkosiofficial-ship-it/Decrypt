.class public abstract LO3/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LO3/e$a;
    }
.end annotation


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Ljava/lang/String;

.field private final c:LO3/a;

.field private final d:LO3/a$d;

.field private final e:LP3/b;

.field private final f:Landroid/os/Looper;

.field private final g:I

.field private final h:LO3/f;

.field private final i:LP3/k;

.field protected final j:Lcom/google/android/gms/common/api/internal/c;


# direct methods
.method public constructor <init>(Landroid/content/Context;LO3/a;LO3/a$d;LO3/e$a;)V
    .locals 6

    const/4 v2, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, LO3/e;-><init>(Landroid/content/Context;Landroid/app/Activity;LO3/a;LO3/a$d;LO3/e$a;)V

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;Landroid/app/Activity;LO3/a;LO3/a$d;LO3/e$a;)V
    .locals 3

    .prologue
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "Null context is not permitted."

    invoke-static {p1, v0}, LQ3/p;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "Api must not be null."

    invoke-static {p3, v0}, LQ3/p;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead."

    invoke-static {p5, v0}, LQ3/p;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "The provided context did not have an application context."

    invoke-static {v0, v1}, LQ3/p;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    iput-object v0, p0, LO3/e;->a:Landroid/content/Context;

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1e

    if-lt v1, v2, :cond_0

    invoke-static {p1}, LO3/d;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1}, LO3/e;->h(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p1

    :goto_0
    iput-object p1, p0, LO3/e;->b:Ljava/lang/String;

    iput-object p3, p0, LO3/e;->c:LO3/a;

    iput-object p4, p0, LO3/e;->d:LO3/a$d;

    iget-object v1, p5, LO3/e$a;->b:Landroid/os/Looper;

    iput-object v1, p0, LO3/e;->f:Landroid/os/Looper;

    invoke-static {p3, p4, p1}, LP3/b;->a(LO3/a;LO3/a$d;Ljava/lang/String;)LP3/b;

    move-result-object p1

    iput-object p1, p0, LO3/e;->e:LP3/b;

    new-instance p3, LP3/q;

    invoke-direct {p3, p0}, LP3/q;-><init>(LO3/e;)V

    iput-object p3, p0, LO3/e;->h:LO3/f;

    invoke-static {v0}, Lcom/google/android/gms/common/api/internal/c;->u(Landroid/content/Context;)Lcom/google/android/gms/common/api/internal/c;

    move-result-object p3

    iput-object p3, p0, LO3/e;->j:Lcom/google/android/gms/common/api/internal/c;

    invoke-virtual {p3}, Lcom/google/android/gms/common/api/internal/c;->l()I

    move-result p4

    iput p4, p0, LO3/e;->g:I

    iget-object p4, p5, LO3/e$a;->a:LP3/k;

    iput-object p4, p0, LO3/e;->i:LP3/k;

    if-eqz p2, :cond_1

    instance-of p4, p2, Lcom/google/android/gms/common/api/GoogleApiActivity;

    if-nez p4, :cond_1

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object p4

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p5

    if-ne p4, p5, :cond_1

    invoke-static {p2, p3, p1}, Lcom/google/android/gms/common/api/internal/h;->u(Landroid/app/Activity;Lcom/google/android/gms/common/api/internal/c;LP3/b;)V

    :cond_1
    invoke-virtual {p3, p0}, Lcom/google/android/gms/common/api/internal/c;->F(LO3/e;)V

    return-void
.end method

.method private final p(ILcom/google/android/gms/common/api/internal/b;)Lcom/google/android/gms/common/api/internal/b;
    .locals 1

    invoke-virtual {p2}, Lcom/google/android/gms/common/api/internal/BasePendingResult;->j()V

    iget-object v0, p0, LO3/e;->j:Lcom/google/android/gms/common/api/internal/c;

    invoke-virtual {v0, p0, p1, p2}, Lcom/google/android/gms/common/api/internal/c;->A(LO3/e;ILcom/google/android/gms/common/api/internal/b;)V

    return-object p2
.end method

.method private final q(ILcom/google/android/gms/common/api/internal/d;)Ll4/l;
    .locals 7

    new-instance v6, Ll4/m;

    invoke-direct {v6}, Ll4/m;-><init>()V

    iget-object v5, p0, LO3/e;->i:LP3/k;

    iget-object v0, p0, LO3/e;->j:Lcom/google/android/gms/common/api/internal/c;

    move-object v1, p0

    move v2, p1

    move-object v3, p2

    move-object v4, v6

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/common/api/internal/c;->B(LO3/e;ILcom/google/android/gms/common/api/internal/d;Ll4/m;LP3/k;)V

    invoke-virtual {v6}, Ll4/m;->a()Ll4/l;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public c()LO3/f;
    .locals 1

    iget-object v0, p0, LO3/e;->h:LO3/f;

    return-object v0
.end method

.method protected d()LQ3/d$a;
    .locals 2

    new-instance v0, LQ3/d$a;

    invoke-direct {v0}, LQ3/d$a;-><init>()V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, LQ3/d$a;->d(Landroid/accounts/Account;)LQ3/d$a;

    invoke-static {}, Ljava/util/Collections;->emptySet()Ljava/util/Set;

    move-result-object v1

    invoke-virtual {v0, v1}, LQ3/d$a;->c(Ljava/util/Collection;)LQ3/d$a;

    iget-object v1, p0, LO3/e;->a:Landroid/content/Context;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, LQ3/d$a;->e(Ljava/lang/String;)LQ3/d$a;

    iget-object v1, p0, LO3/e;->a:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, LQ3/d$a;->b(Ljava/lang/String;)LQ3/d$a;

    return-object v0
.end method

.method public e(Lcom/google/android/gms/common/api/internal/d;)Ll4/l;
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0, p1}, LO3/e;->q(ILcom/google/android/gms/common/api/internal/d;)Ll4/l;

    move-result-object p1

    return-object p1
.end method

.method public f(Lcom/google/android/gms/common/api/internal/d;)Ll4/l;
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0, p1}, LO3/e;->q(ILcom/google/android/gms/common/api/internal/d;)Ll4/l;

    move-result-object p1

    return-object p1
.end method

.method public g(Lcom/google/android/gms/common/api/internal/b;)Lcom/google/android/gms/common/api/internal/b;
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0, p1}, LO3/e;->p(ILcom/google/android/gms/common/api/internal/b;)Lcom/google/android/gms/common/api/internal/b;

    return-object p1
.end method

.method protected h(Landroid/content/Context;)Ljava/lang/String;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public final i()LP3/b;
    .locals 1

    iget-object v0, p0, LO3/e;->e:LP3/b;

    return-object v0
.end method

.method public j()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, LO3/e;->a:Landroid/content/Context;

    return-object v0
.end method

.method protected k()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LO3/e;->b:Ljava/lang/String;

    return-object v0
.end method

.method public l()Landroid/os/Looper;
    .locals 1

    iget-object v0, p0, LO3/e;->f:Landroid/os/Looper;

    return-object v0
.end method

.method public final m()I
    .locals 1

    iget v0, p0, LO3/e;->g:I

    return v0
.end method

.method public final n(Landroid/os/Looper;Lcom/google/android/gms/common/api/internal/n;)LO3/a$f;
    .locals 8

    .prologue
    invoke-virtual {p0}, LO3/e;->d()LQ3/d$a;

    move-result-object v0

    invoke-virtual {v0}, LQ3/d$a;->a()LQ3/d;

    move-result-object v4

    iget-object v0, p0, LO3/e;->c:LO3/a;

    invoke-virtual {v0}, LO3/a;->a()LO3/a$a;

    move-result-object v0

    invoke-static {v0}, LQ3/p;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, LO3/a$a;

    iget-object v5, p0, LO3/e;->d:LO3/a$d;

    iget-object v2, p0, LO3/e;->a:Landroid/content/Context;

    move-object v3, p1

    move-object v6, p2

    move-object v7, p2

    invoke-virtual/range {v1 .. v7}, LO3/a$a;->a(Landroid/content/Context;Landroid/os/Looper;LQ3/d;Ljava/lang/Object;LO3/f$a;LO3/f$b;)LO3/a$f;

    move-result-object p1

    invoke-virtual {p0}, LO3/e;->k()Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_0

    instance-of v0, p1, LQ3/c;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, LQ3/c;

    invoke-virtual {v0, p2}, LQ3/c;->P(Ljava/lang/String;)V

    :cond_0
    if-eqz p2, :cond_2

    instance-of p2, p1, LP3/g;

    if-nez p2, :cond_1

    goto :goto_0

    :cond_1
    invoke-static {p1}, Landroidx/appcompat/app/D;->a(Ljava/lang/Object;)V

    const/4 p1, 0x0

    throw p1

    :cond_2
    :goto_0
    return-object p1
.end method

.method public final o(Landroid/content/Context;Landroid/os/Handler;)LP3/y;
    .locals 2

    new-instance v0, LP3/y;

    invoke-virtual {p0}, LO3/e;->d()LQ3/d$a;

    move-result-object v1

    invoke-virtual {v1}, LQ3/d$a;->a()LQ3/d;

    move-result-object v1

    invoke-direct {v0, p1, p2, v1}, LP3/y;-><init>(Landroid/content/Context;Landroid/os/Handler;LQ3/d;)V

    return-object v0
.end method
