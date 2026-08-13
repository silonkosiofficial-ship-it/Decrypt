.class public abstract Lcom/google/android/gms/internal/play_billing/J2;
.super Lcom/google/android/gms/internal/play_billing/Y1;
.source "SourceFile"


# instance fields
.field private final C:Lcom/google/android/gms/internal/play_billing/L2;

.field protected D:Lcom/google/android/gms/internal/play_billing/L2;


# direct methods
.method protected constructor <init>(Lcom/google/android/gms/internal/play_billing/L2;)V
    .locals 1

    .prologue
    invoke-direct {p0}, Lcom/google/android/gms/internal/play_billing/Y1;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/play_billing/J2;->C:Lcom/google/android/gms/internal/play_billing/L2;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/play_billing/L2;->e()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/play_billing/L2;->p()Lcom/google/android/gms/internal/play_billing/L2;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/play_billing/J2;->D:Lcom/google/android/gms/internal/play_billing/L2;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Default instance must be immutable."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private static d(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    invoke-static {}, Lcom/google/android/gms/internal/play_billing/q3;->a()Lcom/google/android/gms/internal/play_billing/q3;

    move-result-object v0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/play_billing/q3;->b(Ljava/lang/Class;)Lcom/google/android/gms/internal/play_billing/t3;

    move-result-object v0

    invoke-interface {v0, p0, p1}, Lcom/google/android/gms/internal/play_billing/t3;->e(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/play_billing/J2;->e()Lcom/google/android/gms/internal/play_billing/J2;

    move-result-object v0

    return-object v0
.end method

.method public final e()Lcom/google/android/gms/internal/play_billing/J2;
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/J2;->C:Lcom/google/android/gms/internal/play_billing/L2;

    const/4 v1, 0x5

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2, v2}, Lcom/google/android/gms/internal/play_billing/L2;->j(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/play_billing/J2;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/play_billing/J2;->m()Lcom/google/android/gms/internal/play_billing/L2;

    move-result-object v1

    iput-object v1, v0, Lcom/google/android/gms/internal/play_billing/J2;->D:Lcom/google/android/gms/internal/play_billing/L2;

    return-object v0
.end method

.method public bridge synthetic g()Lcom/google/android/gms/internal/play_billing/i3;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/play_billing/J2;->m()Lcom/google/android/gms/internal/play_billing/L2;

    move-result-object v0

    return-object v0
.end method

.method public final j(Lcom/google/android/gms/internal/play_billing/L2;)Lcom/google/android/gms/internal/play_billing/J2;
    .locals 1

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/J2;->C:Lcom/google/android/gms/internal/play_billing/L2;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/play_billing/L2;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/J2;->D:Lcom/google/android/gms/internal/play_billing/L2;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/play_billing/L2;->e()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/play_billing/J2;->p()V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/J2;->D:Lcom/google/android/gms/internal/play_billing/L2;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/play_billing/J2;->d(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_1
    return-object p0
.end method

.method public final l()Lcom/google/android/gms/internal/play_billing/L2;
    .locals 2

    .prologue
    invoke-virtual {p0}, Lcom/google/android/gms/internal/play_billing/J2;->m()Lcom/google/android/gms/internal/play_billing/L2;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/play_billing/L2;->z(Lcom/google/android/gms/internal/play_billing/L2;Z)Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    :cond_0
    new-instance v1, Lcom/google/android/gms/internal/play_billing/y3;

    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/play_billing/y3;-><init>(Lcom/google/android/gms/internal/play_billing/i3;)V

    throw v1
.end method

.method public m()Lcom/google/android/gms/internal/play_billing/L2;
    .locals 1

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/J2;->D:Lcom/google/android/gms/internal/play_billing/L2;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/play_billing/L2;->e()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/J2;->D:Lcom/google/android/gms/internal/play_billing/L2;

    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/J2;->D:Lcom/google/android/gms/internal/play_billing/L2;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/play_billing/L2;->v()V

    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/J2;->D:Lcom/google/android/gms/internal/play_billing/L2;

    return-object v0
.end method

.method protected final n()V
    .locals 1

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/J2;->D:Lcom/google/android/gms/internal/play_billing/L2;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/play_billing/L2;->e()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/play_billing/J2;->p()V

    :cond_0
    return-void
.end method

.method protected p()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/J2;->C:Lcom/google/android/gms/internal/play_billing/L2;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/play_billing/L2;->p()Lcom/google/android/gms/internal/play_billing/L2;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/play_billing/J2;->D:Lcom/google/android/gms/internal/play_billing/L2;

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/play_billing/J2;->d(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/play_billing/J2;->D:Lcom/google/android/gms/internal/play_billing/L2;

    return-void
.end method
