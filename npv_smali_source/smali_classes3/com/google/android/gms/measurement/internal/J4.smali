.class final Lcom/google/android/gms/measurement/internal/J4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic C:Lcom/google/android/gms/measurement/internal/M5;

.field private final synthetic D:Z

.field private final synthetic E:Lcom/google/android/gms/measurement/internal/Y5;

.field private final synthetic F:Lcom/google/android/gms/measurement/internal/F4;


# direct methods
.method constructor <init>(Lcom/google/android/gms/measurement/internal/F4;Lcom/google/android/gms/measurement/internal/M5;ZLcom/google/android/gms/measurement/internal/Y5;)V
    .locals 0

    iput-object p2, p0, Lcom/google/android/gms/measurement/internal/J4;->C:Lcom/google/android/gms/measurement/internal/M5;

    iput-boolean p3, p0, Lcom/google/android/gms/measurement/internal/J4;->D:Z

    iput-object p4, p0, Lcom/google/android/gms/measurement/internal/J4;->E:Lcom/google/android/gms/measurement/internal/Y5;

    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/J4;->F:Lcom/google/android/gms/measurement/internal/F4;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/J4;->F:Lcom/google/android/gms/measurement/internal/F4;

    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/F4;->B(Lcom/google/android/gms/measurement/internal/F4;)Li4/f;

    move-result-object v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/J4;->F:Lcom/google/android/gms/measurement/internal/F4;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/w3;->j()Lcom/google/android/gms/measurement/internal/n2;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/n2;->G()Lcom/google/android/gms/measurement/internal/p2;

    move-result-object v0

    const-string v1, "Discarding data. Failed to set user property"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/p2;->a(Ljava/lang/String;)V

    return-void

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/J4;->C:Lcom/google/android/gms/measurement/internal/M5;

    invoke-static {v1}, LQ3/p;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/J4;->F:Lcom/google/android/gms/measurement/internal/F4;

    iget-boolean v2, p0, Lcom/google/android/gms/measurement/internal/J4;->D:Z

    if-eqz v2, :cond_1

    const/4 v2, 0x0

    goto :goto_0

    :cond_1
    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/J4;->E:Lcom/google/android/gms/measurement/internal/Y5;

    :goto_0
    iget-object v3, p0, Lcom/google/android/gms/measurement/internal/J4;->C:Lcom/google/android/gms/measurement/internal/M5;

    invoke-virtual {v1, v0, v2, v3}, Lcom/google/android/gms/measurement/internal/F4;->O(Li4/f;LR3/a;Lcom/google/android/gms/measurement/internal/M5;)V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/J4;->F:Lcom/google/android/gms/measurement/internal/F4;

    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/F4;->s0(Lcom/google/android/gms/measurement/internal/F4;)V

    return-void
.end method
