.class final Lcom/google/android/gms/internal/measurement/h1;
.super Lcom/google/android/gms/internal/measurement/e1$a;
.source "SourceFile"


# instance fields
.field private final synthetic G:Ljava/lang/String;

.field private final synthetic H:Ljava/lang/String;

.field private final synthetic I:Ljava/lang/Object;

.field private final synthetic J:Z

.field private final synthetic K:Lcom/google/android/gms/internal/measurement/e1;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/measurement/e1;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Z)V
    .locals 0

    iput-object p2, p0, Lcom/google/android/gms/internal/measurement/h1;->G:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/internal/measurement/h1;->H:Ljava/lang/String;

    iput-object p4, p0, Lcom/google/android/gms/internal/measurement/h1;->I:Ljava/lang/Object;

    iput-boolean p5, p0, Lcom/google/android/gms/internal/measurement/h1;->J:Z

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/h1;->K:Lcom/google/android/gms/internal/measurement/e1;

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/measurement/e1$a;-><init>(Lcom/google/android/gms/internal/measurement/e1;)V

    return-void
.end method


# virtual methods
.method final a()V
    .locals 8

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/h1;->K:Lcom/google/android/gms/internal/measurement/e1;

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/e1;->e(Lcom/google/android/gms/internal/measurement/e1;)Lcom/google/android/gms/internal/measurement/P0;

    move-result-object v0

    invoke-static {v0}, LQ3/p;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/google/android/gms/internal/measurement/P0;

    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/h1;->G:Ljava/lang/String;

    iget-object v3, p0, Lcom/google/android/gms/internal/measurement/h1;->H:Ljava/lang/String;

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/h1;->I:Ljava/lang/Object;

    invoke-static {v0}, LX3/b;->c2(Ljava/lang/Object;)LX3/a;

    move-result-object v4

    iget-boolean v5, p0, Lcom/google/android/gms/internal/measurement/h1;->J:Z

    iget-wide v6, p0, Lcom/google/android/gms/internal/measurement/e1$a;->C:J

    invoke-interface/range {v1 .. v7}, Lcom/google/android/gms/internal/measurement/P0;->setUserProperty(Ljava/lang/String;Ljava/lang/String;LX3/a;ZJ)V

    return-void
.end method
