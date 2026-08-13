.class final Lcom/google/android/gms/measurement/internal/W3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic C:Ljava/lang/String;

.field private final synthetic D:Ljava/lang/String;

.field private final synthetic E:Ljava/lang/Object;

.field private final synthetic F:J

.field private final synthetic G:Lcom/google/android/gms/measurement/internal/F3;


# direct methods
.method constructor <init>(Lcom/google/android/gms/measurement/internal/F3;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;J)V
    .locals 0

    iput-object p2, p0, Lcom/google/android/gms/measurement/internal/W3;->C:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/measurement/internal/W3;->D:Ljava/lang/String;

    iput-object p4, p0, Lcom/google/android/gms/measurement/internal/W3;->E:Ljava/lang/Object;

    iput-wide p5, p0, Lcom/google/android/gms/measurement/internal/W3;->F:J

    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/W3;->G:Lcom/google/android/gms/measurement/internal/F3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/W3;->G:Lcom/google/android/gms/measurement/internal/F3;

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/W3;->C:Ljava/lang/String;

    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/W3;->D:Ljava/lang/String;

    iget-object v3, p0, Lcom/google/android/gms/measurement/internal/W3;->E:Ljava/lang/Object;

    iget-wide v4, p0, Lcom/google/android/gms/measurement/internal/W3;->F:J

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/measurement/internal/F3;->k0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;J)V

    return-void
.end method
