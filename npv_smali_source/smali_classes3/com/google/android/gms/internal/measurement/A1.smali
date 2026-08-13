.class final Lcom/google/android/gms/internal/measurement/A1;
.super Lcom/google/android/gms/internal/measurement/e1$a;
.source "SourceFile"


# instance fields
.field private final synthetic G:Ljava/lang/Long;

.field private final synthetic H:Ljava/lang/String;

.field private final synthetic I:Ljava/lang/String;

.field private final synthetic J:Landroid/os/Bundle;

.field private final synthetic K:Z

.field private final synthetic L:Z

.field private final synthetic M:Lcom/google/android/gms/internal/measurement/e1;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/measurement/e1;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;ZZ)V
    .locals 0

    iput-object p2, p0, Lcom/google/android/gms/internal/measurement/A1;->G:Ljava/lang/Long;

    iput-object p3, p0, Lcom/google/android/gms/internal/measurement/A1;->H:Ljava/lang/String;

    iput-object p4, p0, Lcom/google/android/gms/internal/measurement/A1;->I:Ljava/lang/String;

    iput-object p5, p0, Lcom/google/android/gms/internal/measurement/A1;->J:Landroid/os/Bundle;

    iput-boolean p6, p0, Lcom/google/android/gms/internal/measurement/A1;->K:Z

    iput-boolean p7, p0, Lcom/google/android/gms/internal/measurement/A1;->L:Z

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/A1;->M:Lcom/google/android/gms/internal/measurement/e1;

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/measurement/e1$a;-><init>(Lcom/google/android/gms/internal/measurement/e1;)V

    return-void
.end method


# virtual methods
.method final a()V
    .locals 10

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/A1;->G:Ljava/lang/Long;

    if-nez v0, :cond_0

    iget-wide v0, p0, Lcom/google/android/gms/internal/measurement/e1$a;->C:J

    :goto_0
    move-wide v8, v0

    goto :goto_1

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    goto :goto_0

    :goto_1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/A1;->M:Lcom/google/android/gms/internal/measurement/e1;

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/e1;->e(Lcom/google/android/gms/internal/measurement/e1;)Lcom/google/android/gms/internal/measurement/P0;

    move-result-object v0

    invoke-static {v0}, LQ3/p;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/google/android/gms/internal/measurement/P0;

    iget-object v3, p0, Lcom/google/android/gms/internal/measurement/A1;->H:Ljava/lang/String;

    iget-object v4, p0, Lcom/google/android/gms/internal/measurement/A1;->I:Ljava/lang/String;

    iget-object v5, p0, Lcom/google/android/gms/internal/measurement/A1;->J:Landroid/os/Bundle;

    iget-boolean v6, p0, Lcom/google/android/gms/internal/measurement/A1;->K:Z

    iget-boolean v7, p0, Lcom/google/android/gms/internal/measurement/A1;->L:Z

    invoke-interface/range {v2 .. v9}, Lcom/google/android/gms/internal/measurement/P0;->logEvent(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;ZZJ)V

    return-void
.end method
