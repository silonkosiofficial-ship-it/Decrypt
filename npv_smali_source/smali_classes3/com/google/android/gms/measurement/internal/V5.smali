.class public final Lcom/google/android/gms/measurement/internal/V5;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:J

.field private b:Lcom/google/android/gms/internal/measurement/p2;

.field private c:Ljava/lang/String;

.field private d:Ljava/util/Map;

.field private e:Li4/C;


# direct methods
.method private constructor <init>(JLcom/google/android/gms/internal/measurement/p2;Ljava/lang/String;Ljava/util/Map;Li4/C;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lcom/google/android/gms/measurement/internal/V5;->a:J

    iput-object p3, p0, Lcom/google/android/gms/measurement/internal/V5;->b:Lcom/google/android/gms/internal/measurement/p2;

    iput-object p4, p0, Lcom/google/android/gms/measurement/internal/V5;->c:Ljava/lang/String;

    iput-object p5, p0, Lcom/google/android/gms/measurement/internal/V5;->d:Ljava/util/Map;

    iput-object p6, p0, Lcom/google/android/gms/measurement/internal/V5;->e:Li4/C;

    return-void
.end method

.method synthetic constructor <init>(JLcom/google/android/gms/internal/measurement/p2;Ljava/lang/String;Ljava/util/Map;Li4/C;Li4/E;)V
    .locals 0

    invoke-direct/range {p0 .. p6}, Lcom/google/android/gms/measurement/internal/V5;-><init>(JLcom/google/android/gms/internal/measurement/p2;Ljava/lang/String;Ljava/util/Map;Li4/C;)V

    return-void
.end method


# virtual methods
.method public final a()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/measurement/internal/V5;->a:J

    return-wide v0
.end method

.method public final b()Lcom/google/android/gms/measurement/internal/I5;
    .locals 4

    new-instance v0, Lcom/google/android/gms/measurement/internal/I5;

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/V5;->c:Ljava/lang/String;

    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/V5;->d:Ljava/util/Map;

    iget-object v3, p0, Lcom/google/android/gms/measurement/internal/V5;->e:Li4/C;

    invoke-direct {v0, v1, v2, v3}, Lcom/google/android/gms/measurement/internal/I5;-><init>(Ljava/lang/String;Ljava/util/Map;Li4/C;)V

    return-object v0
.end method

.method public final c()Lcom/google/android/gms/internal/measurement/p2;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/V5;->b:Lcom/google/android/gms/internal/measurement/p2;

    return-object v0
.end method

.method public final d()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/V5;->c:Ljava/lang/String;

    return-object v0
.end method

.method public final e()Ljava/util/Map;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/V5;->d:Ljava/util/Map;

    return-object v0
.end method
