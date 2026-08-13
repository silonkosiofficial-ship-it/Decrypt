.class final Lcom/google/android/gms/measurement/internal/X3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic C:Ljava/lang/String;

.field private final synthetic D:Ljava/lang/String;

.field private final synthetic E:J

.field private final synthetic F:Landroid/os/Bundle;

.field private final synthetic G:Z

.field private final synthetic H:Z

.field private final synthetic I:Z

.field private final synthetic J:Ljava/lang/String;

.field private final synthetic K:Lcom/google/android/gms/measurement/internal/F3;


# direct methods
.method constructor <init>(Lcom/google/android/gms/measurement/internal/F3;Ljava/lang/String;Ljava/lang/String;JLandroid/os/Bundle;ZZZLjava/lang/String;)V
    .locals 0

    iput-object p2, p0, Lcom/google/android/gms/measurement/internal/X3;->C:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/measurement/internal/X3;->D:Ljava/lang/String;

    iput-wide p4, p0, Lcom/google/android/gms/measurement/internal/X3;->E:J

    iput-object p6, p0, Lcom/google/android/gms/measurement/internal/X3;->F:Landroid/os/Bundle;

    iput-boolean p7, p0, Lcom/google/android/gms/measurement/internal/X3;->G:Z

    iput-boolean p8, p0, Lcom/google/android/gms/measurement/internal/X3;->H:Z

    iput-boolean p9, p0, Lcom/google/android/gms/measurement/internal/X3;->I:Z

    iput-object p10, p0, Lcom/google/android/gms/measurement/internal/X3;->J:Ljava/lang/String;

    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/X3;->K:Lcom/google/android/gms/measurement/internal/F3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 10

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/X3;->K:Lcom/google/android/gms/measurement/internal/F3;

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/X3;->C:Ljava/lang/String;

    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/X3;->D:Ljava/lang/String;

    iget-wide v3, p0, Lcom/google/android/gms/measurement/internal/X3;->E:J

    iget-object v5, p0, Lcom/google/android/gms/measurement/internal/X3;->F:Landroid/os/Bundle;

    iget-boolean v6, p0, Lcom/google/android/gms/measurement/internal/X3;->G:Z

    iget-boolean v7, p0, Lcom/google/android/gms/measurement/internal/X3;->H:Z

    iget-boolean v8, p0, Lcom/google/android/gms/measurement/internal/X3;->I:Z

    iget-object v9, p0, Lcom/google/android/gms/measurement/internal/X3;->J:Ljava/lang/String;

    invoke-virtual/range {v0 .. v9}, Lcom/google/android/gms/measurement/internal/F3;->f0(Ljava/lang/String;Ljava/lang/String;JLandroid/os/Bundle;ZZZLjava/lang/String;)V

    return-void
.end method
