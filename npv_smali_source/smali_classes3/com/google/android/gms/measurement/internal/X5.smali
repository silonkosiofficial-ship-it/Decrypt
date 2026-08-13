.class final Lcom/google/android/gms/measurement/internal/X5;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:J

.field private b:Lcom/google/android/gms/internal/measurement/p2;

.field private c:Ljava/lang/String;

.field private d:Ljava/util/Map;

.field private e:Li4/C;


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Lcom/google/android/gms/measurement/internal/V5;
    .locals 9

    new-instance v8, Lcom/google/android/gms/measurement/internal/V5;

    iget-wide v1, p0, Lcom/google/android/gms/measurement/internal/X5;->a:J

    iget-object v3, p0, Lcom/google/android/gms/measurement/internal/X5;->b:Lcom/google/android/gms/internal/measurement/p2;

    iget-object v4, p0, Lcom/google/android/gms/measurement/internal/X5;->c:Ljava/lang/String;

    iget-object v5, p0, Lcom/google/android/gms/measurement/internal/X5;->d:Ljava/util/Map;

    iget-object v6, p0, Lcom/google/android/gms/measurement/internal/X5;->e:Li4/C;

    const/4 v7, 0x0

    move-object v0, v8

    invoke-direct/range {v0 .. v7}, Lcom/google/android/gms/measurement/internal/V5;-><init>(JLcom/google/android/gms/internal/measurement/p2;Ljava/lang/String;Ljava/util/Map;Li4/C;Li4/E;)V

    return-object v8
.end method

.method public final b(J)Lcom/google/android/gms/measurement/internal/X5;
    .locals 0

    iput-wide p1, p0, Lcom/google/android/gms/measurement/internal/X5;->a:J

    return-object p0
.end method

.method public final c(Lcom/google/android/gms/internal/measurement/p2;)Lcom/google/android/gms/measurement/internal/X5;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/X5;->b:Lcom/google/android/gms/internal/measurement/p2;

    return-object p0
.end method

.method public final d(Li4/C;)Lcom/google/android/gms/measurement/internal/X5;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/X5;->e:Li4/C;

    return-object p0
.end method

.method public final e(Ljava/lang/String;)Lcom/google/android/gms/measurement/internal/X5;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/X5;->c:Ljava/lang/String;

    return-object p0
.end method

.method public final f(Ljava/util/Map;)Lcom/google/android/gms/measurement/internal/X5;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/X5;->d:Ljava/util/Map;

    return-object p0
.end method
