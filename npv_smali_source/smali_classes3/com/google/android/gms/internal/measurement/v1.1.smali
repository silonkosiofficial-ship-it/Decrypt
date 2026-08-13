.class final Lcom/google/android/gms/internal/measurement/v1;
.super Lcom/google/android/gms/internal/measurement/e1$a;
.source "SourceFile"


# instance fields
.field private final synthetic G:I

.field private final synthetic H:Ljava/lang/String;

.field private final synthetic I:Ljava/lang/Object;

.field private final synthetic J:Ljava/lang/Object;

.field private final synthetic K:Ljava/lang/Object;

.field private final synthetic L:Lcom/google/android/gms/internal/measurement/e1;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/measurement/e1;ZILjava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    const/4 p2, 0x5

    iput p2, p0, Lcom/google/android/gms/internal/measurement/v1;->G:I

    iput-object p4, p0, Lcom/google/android/gms/internal/measurement/v1;->H:Ljava/lang/String;

    iput-object p5, p0, Lcom/google/android/gms/internal/measurement/v1;->I:Ljava/lang/Object;

    const/4 p2, 0x0

    iput-object p2, p0, Lcom/google/android/gms/internal/measurement/v1;->J:Ljava/lang/Object;

    iput-object p2, p0, Lcom/google/android/gms/internal/measurement/v1;->K:Ljava/lang/Object;

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/v1;->L:Lcom/google/android/gms/internal/measurement/e1;

    const/4 p2, 0x0

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/measurement/e1$a;-><init>(Lcom/google/android/gms/internal/measurement/e1;Z)V

    return-void
.end method


# virtual methods
.method final a()V
    .locals 7

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/v1;->L:Lcom/google/android/gms/internal/measurement/e1;

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/e1;->e(Lcom/google/android/gms/internal/measurement/e1;)Lcom/google/android/gms/internal/measurement/P0;

    move-result-object v0

    invoke-static {v0}, LQ3/p;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/google/android/gms/internal/measurement/P0;

    iget v2, p0, Lcom/google/android/gms/internal/measurement/v1;->G:I

    iget-object v3, p0, Lcom/google/android/gms/internal/measurement/v1;->H:Ljava/lang/String;

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/v1;->I:Ljava/lang/Object;

    invoke-static {v0}, LX3/b;->c2(Ljava/lang/Object;)LX3/a;

    move-result-object v4

    const/4 v0, 0x0

    invoke-static {v0}, LX3/b;->c2(Ljava/lang/Object;)LX3/a;

    move-result-object v5

    invoke-static {v0}, LX3/b;->c2(Ljava/lang/Object;)LX3/a;

    move-result-object v6

    invoke-interface/range {v1 .. v6}, Lcom/google/android/gms/internal/measurement/P0;->logHealthData(ILjava/lang/String;LX3/a;LX3/a;LX3/a;)V

    return-void
.end method
