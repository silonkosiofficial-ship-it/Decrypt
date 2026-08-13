.class final Lcom/google/android/gms/measurement/internal/p4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic C:Lcom/google/android/gms/measurement/internal/A3;

.field private final synthetic D:J

.field private final synthetic E:Z

.field private final synthetic F:Lcom/google/android/gms/measurement/internal/A3;

.field private final synthetic G:Lcom/google/android/gms/measurement/internal/F3;


# direct methods
.method constructor <init>(Lcom/google/android/gms/measurement/internal/F3;Lcom/google/android/gms/measurement/internal/A3;JZLcom/google/android/gms/measurement/internal/A3;)V
    .locals 0

    iput-object p2, p0, Lcom/google/android/gms/measurement/internal/p4;->C:Lcom/google/android/gms/measurement/internal/A3;

    iput-wide p3, p0, Lcom/google/android/gms/measurement/internal/p4;->D:J

    iput-boolean p5, p0, Lcom/google/android/gms/measurement/internal/p4;->E:Z

    iput-object p6, p0, Lcom/google/android/gms/measurement/internal/p4;->F:Lcom/google/android/gms/measurement/internal/A3;

    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/p4;->G:Lcom/google/android/gms/measurement/internal/F3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 8

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/p4;->G:Lcom/google/android/gms/measurement/internal/F3;

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/p4;->C:Lcom/google/android/gms/measurement/internal/A3;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/F3;->R(Lcom/google/android/gms/measurement/internal/A3;)V

    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/p4;->G:Lcom/google/android/gms/measurement/internal/F3;

    iget-object v3, p0, Lcom/google/android/gms/measurement/internal/p4;->C:Lcom/google/android/gms/measurement/internal/A3;

    iget-wide v4, p0, Lcom/google/android/gms/measurement/internal/p4;->D:J

    const/4 v6, 0x0

    iget-boolean v7, p0, Lcom/google/android/gms/measurement/internal/p4;->E:Z

    invoke-static/range {v2 .. v7}, Lcom/google/android/gms/measurement/internal/F3;->V(Lcom/google/android/gms/measurement/internal/F3;Lcom/google/android/gms/measurement/internal/A3;JZZ)V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/p4;->G:Lcom/google/android/gms/measurement/internal/F3;

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/p4;->C:Lcom/google/android/gms/measurement/internal/A3;

    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/p4;->F:Lcom/google/android/gms/measurement/internal/A3;

    invoke-static {v0, v1, v2}, Lcom/google/android/gms/measurement/internal/F3;->W(Lcom/google/android/gms/measurement/internal/F3;Lcom/google/android/gms/measurement/internal/A3;Lcom/google/android/gms/measurement/internal/A3;)V

    return-void
.end method
