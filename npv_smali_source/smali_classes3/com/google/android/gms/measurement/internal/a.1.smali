.class final Lcom/google/android/gms/measurement/internal/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic C:Ljava/lang/String;

.field private final synthetic D:J

.field private final synthetic E:Lcom/google/android/gms/measurement/internal/y;


# direct methods
.method constructor <init>(Lcom/google/android/gms/measurement/internal/y;Ljava/lang/String;J)V
    .locals 0

    iput-object p2, p0, Lcom/google/android/gms/measurement/internal/a;->C:Ljava/lang/String;

    iput-wide p3, p0, Lcom/google/android/gms/measurement/internal/a;->D:J

    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/a;->E:Lcom/google/android/gms/measurement/internal/y;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/a;->E:Lcom/google/android/gms/measurement/internal/y;

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/a;->C:Ljava/lang/String;

    iget-wide v2, p0, Lcom/google/android/gms/measurement/internal/a;->D:J

    invoke-static {v0, v1, v2, v3}, Lcom/google/android/gms/measurement/internal/y;->y(Lcom/google/android/gms/measurement/internal/y;Ljava/lang/String;J)V

    return-void
.end method
