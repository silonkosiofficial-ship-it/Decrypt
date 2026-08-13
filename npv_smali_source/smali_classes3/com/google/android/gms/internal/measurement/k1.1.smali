.class final Lcom/google/android/gms/internal/measurement/k1;
.super Lcom/google/android/gms/internal/measurement/e1$a;
.source "SourceFile"


# instance fields
.field private final synthetic G:Landroid/app/Activity;

.field private final synthetic H:Ljava/lang/String;

.field private final synthetic I:Ljava/lang/String;

.field private final synthetic J:Lcom/google/android/gms/internal/measurement/e1;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/measurement/e1;Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    iput-object p2, p0, Lcom/google/android/gms/internal/measurement/k1;->G:Landroid/app/Activity;

    iput-object p3, p0, Lcom/google/android/gms/internal/measurement/k1;->H:Ljava/lang/String;

    iput-object p4, p0, Lcom/google/android/gms/internal/measurement/k1;->I:Ljava/lang/String;

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/k1;->J:Lcom/google/android/gms/internal/measurement/e1;

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/measurement/e1$a;-><init>(Lcom/google/android/gms/internal/measurement/e1;)V

    return-void
.end method


# virtual methods
.method final a()V
    .locals 7

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/k1;->J:Lcom/google/android/gms/internal/measurement/e1;

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/e1;->e(Lcom/google/android/gms/internal/measurement/e1;)Lcom/google/android/gms/internal/measurement/P0;

    move-result-object v0

    invoke-static {v0}, LQ3/p;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/google/android/gms/internal/measurement/P0;

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/k1;->G:Landroid/app/Activity;

    invoke-static {v0}, LX3/b;->c2(Ljava/lang/Object;)LX3/a;

    move-result-object v2

    iget-object v3, p0, Lcom/google/android/gms/internal/measurement/k1;->H:Ljava/lang/String;

    iget-object v4, p0, Lcom/google/android/gms/internal/measurement/k1;->I:Ljava/lang/String;

    iget-wide v5, p0, Lcom/google/android/gms/internal/measurement/e1$a;->C:J

    invoke-interface/range {v1 .. v6}, Lcom/google/android/gms/internal/measurement/P0;->setCurrentScreen(LX3/a;Ljava/lang/String;Ljava/lang/String;J)V

    return-void
.end method
