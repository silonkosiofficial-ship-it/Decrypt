.class final Lcom/google/android/gms/measurement/internal/v3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic C:Lcom/google/android/gms/internal/measurement/U0;

.field private final synthetic D:Ljava/lang/String;

.field private final synthetic E:Ljava/lang/String;

.field private final synthetic F:Z

.field private final synthetic G:Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;


# direct methods
.method constructor <init>(Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;Lcom/google/android/gms/internal/measurement/U0;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 0

    iput-object p2, p0, Lcom/google/android/gms/measurement/internal/v3;->C:Lcom/google/android/gms/internal/measurement/U0;

    iput-object p3, p0, Lcom/google/android/gms/measurement/internal/v3;->D:Ljava/lang/String;

    iput-object p4, p0, Lcom/google/android/gms/measurement/internal/v3;->E:Ljava/lang/String;

    iput-boolean p5, p0, Lcom/google/android/gms/measurement/internal/v3;->F:Z

    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/v3;->G:Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/v3;->G:Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;

    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->C:Lcom/google/android/gms/measurement/internal/S2;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/S2;->J()Lcom/google/android/gms/measurement/internal/F4;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/v3;->C:Lcom/google/android/gms/internal/measurement/U0;

    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/v3;->D:Ljava/lang/String;

    iget-object v3, p0, Lcom/google/android/gms/measurement/internal/v3;->E:Ljava/lang/String;

    iget-boolean v4, p0, Lcom/google/android/gms/measurement/internal/v3;->F:Z

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/google/android/gms/measurement/internal/F4;->G(Lcom/google/android/gms/internal/measurement/U0;Ljava/lang/String;Ljava/lang/String;Z)V

    return-void
.end method
