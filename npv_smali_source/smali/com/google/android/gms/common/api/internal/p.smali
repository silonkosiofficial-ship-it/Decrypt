.class final Lcom/google/android/gms/common/api/internal/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic C:LN3/b;

.field final synthetic D:Lcom/google/android/gms/common/api/internal/q;


# direct methods
.method constructor <init>(Lcom/google/android/gms/common/api/internal/q;LN3/b;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/common/api/internal/p;->D:Lcom/google/android/gms/common/api/internal/q;

    iput-object p2, p0, Lcom/google/android/gms/common/api/internal/p;->C:LN3/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/p;->D:Lcom/google/android/gms/common/api/internal/q;

    iget-object v1, v0, Lcom/google/android/gms/common/api/internal/q;->f:Lcom/google/android/gms/common/api/internal/c;

    invoke-static {v1}, Lcom/google/android/gms/common/api/internal/c;->x(Lcom/google/android/gms/common/api/internal/c;)Ljava/util/Map;

    move-result-object v1

    invoke-static {v0}, Lcom/google/android/gms/common/api/internal/q;->f(Lcom/google/android/gms/common/api/internal/q;)LP3/b;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/common/api/internal/n;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/p;->C:LN3/b;

    invoke-virtual {v1}, LN3/b;->C()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/p;->D:Lcom/google/android/gms/common/api/internal/q;

    const/4 v3, 0x1

    invoke-static {v1, v3}, Lcom/google/android/gms/common/api/internal/q;->g(Lcom/google/android/gms/common/api/internal/q;Z)V

    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/p;->D:Lcom/google/android/gms/common/api/internal/q;

    invoke-static {v1}, Lcom/google/android/gms/common/api/internal/q;->e(Lcom/google/android/gms/common/api/internal/q;)LO3/a$f;

    move-result-object v1

    invoke-interface {v1}, LO3/a$f;->o()Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/p;->D:Lcom/google/android/gms/common/api/internal/q;

    invoke-static {v0}, Lcom/google/android/gms/common/api/internal/q;->h(Lcom/google/android/gms/common/api/internal/q;)V

    return-void

    :cond_1
    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/p;->D:Lcom/google/android/gms/common/api/internal/q;

    invoke-static {v1}, Lcom/google/android/gms/common/api/internal/q;->e(Lcom/google/android/gms/common/api/internal/q;)LO3/a$f;

    move-result-object v3

    invoke-static {v1}, Lcom/google/android/gms/common/api/internal/q;->e(Lcom/google/android/gms/common/api/internal/q;)LO3/a$f;

    move-result-object v1

    invoke-interface {v1}, LO3/a$f;->a()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v3, v2, v1}, LO3/a$f;->i(LQ3/j;Ljava/util/Set;)V
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v1

    const-string v3, "GoogleApiManager"

    const-string v4, "Failed to get service from broker. "

    nop

    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/p;->D:Lcom/google/android/gms/common/api/internal/q;

    invoke-static {v1}, Lcom/google/android/gms/common/api/internal/q;->e(Lcom/google/android/gms/common/api/internal/q;)LO3/a$f;

    move-result-object v1

    const-string v3, "Failed to get service from broker."

    invoke-interface {v1, v3}, LO3/a$f;->d(Ljava/lang/String;)V

    new-instance v1, LN3/b;

    const/16 v3, 0xa

    invoke-direct {v1, v3}, LN3/b;-><init>(I)V

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/api/internal/n;->E(LN3/b;Ljava/lang/Exception;)V

    return-void

    :cond_2
    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/p;->C:LN3/b;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/api/internal/n;->E(LN3/b;Ljava/lang/Exception;)V

    return-void
.end method
