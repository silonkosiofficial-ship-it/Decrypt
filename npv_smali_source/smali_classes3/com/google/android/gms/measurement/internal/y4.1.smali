.class final Lcom/google/android/gms/measurement/internal/y4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic C:Lcom/google/android/gms/measurement/internal/x4;

.field private final synthetic D:Lcom/google/android/gms/measurement/internal/x4;

.field private final synthetic E:J

.field private final synthetic F:Z

.field private final synthetic G:Lcom/google/android/gms/measurement/internal/w4;


# direct methods
.method constructor <init>(Lcom/google/android/gms/measurement/internal/w4;Lcom/google/android/gms/measurement/internal/x4;Lcom/google/android/gms/measurement/internal/x4;JZ)V
    .locals 0

    iput-object p2, p0, Lcom/google/android/gms/measurement/internal/y4;->C:Lcom/google/android/gms/measurement/internal/x4;

    iput-object p3, p0, Lcom/google/android/gms/measurement/internal/y4;->D:Lcom/google/android/gms/measurement/internal/x4;

    iput-wide p4, p0, Lcom/google/android/gms/measurement/internal/y4;->E:J

    iput-boolean p6, p0, Lcom/google/android/gms/measurement/internal/y4;->F:Z

    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/y4;->G:Lcom/google/android/gms/measurement/internal/w4;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/y4;->G:Lcom/google/android/gms/measurement/internal/w4;

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/y4;->C:Lcom/google/android/gms/measurement/internal/x4;

    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/y4;->D:Lcom/google/android/gms/measurement/internal/x4;

    iget-wide v3, p0, Lcom/google/android/gms/measurement/internal/y4;->E:J

    iget-boolean v5, p0, Lcom/google/android/gms/measurement/internal/y4;->F:Z

    const/4 v6, 0x0

    invoke-static/range {v0 .. v6}, Lcom/google/android/gms/measurement/internal/w4;->L(Lcom/google/android/gms/measurement/internal/w4;Lcom/google/android/gms/measurement/internal/x4;Lcom/google/android/gms/measurement/internal/x4;JZLandroid/os/Bundle;)V

    return-void
.end method
