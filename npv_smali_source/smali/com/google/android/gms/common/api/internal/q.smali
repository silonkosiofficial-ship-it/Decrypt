.class final Lcom/google/android/gms/common/api/internal/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LQ3/c$c;
.implements LP3/x;


# instance fields
.field private final a:LO3/a$f;

.field private final b:LP3/b;

.field private c:LQ3/j;

.field private d:Ljava/util/Set;

.field private e:Z

.field final synthetic f:Lcom/google/android/gms/common/api/internal/c;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/common/api/internal/c;LO3/a$f;LP3/b;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/common/api/internal/q;->f:Lcom/google/android/gms/common/api/internal/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/google/android/gms/common/api/internal/q;->c:LQ3/j;

    iput-object p1, p0, Lcom/google/android/gms/common/api/internal/q;->d:Ljava/util/Set;

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/google/android/gms/common/api/internal/q;->e:Z

    iput-object p2, p0, Lcom/google/android/gms/common/api/internal/q;->a:LO3/a$f;

    iput-object p3, p0, Lcom/google/android/gms/common/api/internal/q;->b:LP3/b;

    return-void
.end method

.method static bridge synthetic e(Lcom/google/android/gms/common/api/internal/q;)LO3/a$f;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/common/api/internal/q;->a:LO3/a$f;

    return-object p0
.end method

.method static bridge synthetic f(Lcom/google/android/gms/common/api/internal/q;)LP3/b;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/common/api/internal/q;->b:LP3/b;

    return-object p0
.end method

.method static bridge synthetic g(Lcom/google/android/gms/common/api/internal/q;Z)V
    .locals 0

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/google/android/gms/common/api/internal/q;->e:Z

    return-void
.end method

.method static bridge synthetic h(Lcom/google/android/gms/common/api/internal/q;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/common/api/internal/q;->i()V

    return-void
.end method

.method private final i()V
    .locals 3

    .prologue
    iget-boolean v0, p0, Lcom/google/android/gms/common/api/internal/q;->e:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/q;->c:LQ3/j;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/q;->a:LO3/a$f;

    iget-object v2, p0, Lcom/google/android/gms/common/api/internal/q;->d:Ljava/util/Set;

    invoke-interface {v1, v0, v2}, LO3/a$f;->i(LQ3/j;Ljava/util/Set;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public final a(LN3/b;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/q;->f:Lcom/google/android/gms/common/api/internal/c;

    invoke-static {v0}, Lcom/google/android/gms/common/api/internal/c;->o(Lcom/google/android/gms/common/api/internal/c;)Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/common/api/internal/p;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/common/api/internal/p;-><init>(Lcom/google/android/gms/common/api/internal/q;LN3/b;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final b(LQ3/j;Ljava/util/Set;)V
    .locals 1

    .prologue
    if-eqz p1, :cond_1

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    iput-object p1, p0, Lcom/google/android/gms/common/api/internal/q;->c:LQ3/j;

    iput-object p2, p0, Lcom/google/android/gms/common/api/internal/q;->d:Ljava/util/Set;

    invoke-direct {p0}, Lcom/google/android/gms/common/api/internal/q;->i()V

    return-void

    :cond_1
    :goto_0
    new-instance p1, Ljava/lang/Exception;

    invoke-direct {p1}, Ljava/lang/Exception;-><init>()V

    const-string p2, "GoogleApiManager"

    const-string v0, "Received null response from onSignInSuccess"

    nop

    new-instance p1, LN3/b;

    const/4 p2, 0x4

    invoke-direct {p1, p2}, LN3/b;-><init>(I)V

    invoke-virtual {p0, p1}, Lcom/google/android/gms/common/api/internal/q;->c(LN3/b;)V

    return-void
.end method

.method public final c(LN3/b;)V
    .locals 2

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/q;->f:Lcom/google/android/gms/common/api/internal/c;

    invoke-static {v0}, Lcom/google/android/gms/common/api/internal/c;->x(Lcom/google/android/gms/common/api/internal/c;)Ljava/util/Map;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/q;->b:LP3/b;

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/common/api/internal/n;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lcom/google/android/gms/common/api/internal/n;->F(LN3/b;)V

    :cond_0
    return-void
.end method

.method public final d(I)V
    .locals 2

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/q;->f:Lcom/google/android/gms/common/api/internal/c;

    invoke-static {v0}, Lcom/google/android/gms/common/api/internal/c;->x(Lcom/google/android/gms/common/api/internal/c;)Ljava/util/Map;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/q;->b:LP3/b;

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/common/api/internal/n;

    if-eqz v0, :cond_1

    invoke-static {v0}, Lcom/google/android/gms/common/api/internal/n;->J(Lcom/google/android/gms/common/api/internal/n;)Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance p1, LN3/b;

    const/16 v1, 0x11

    invoke-direct {p1, v1}, LN3/b;-><init>(I)V

    invoke-virtual {v0, p1}, Lcom/google/android/gms/common/api/internal/n;->F(LN3/b;)V

    return-void

    :cond_0
    invoke-virtual {v0, p1}, Lcom/google/android/gms/common/api/internal/n;->y0(I)V

    :cond_1
    return-void
.end method
