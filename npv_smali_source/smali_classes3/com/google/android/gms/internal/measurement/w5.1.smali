.class final Lcom/google/android/gms/internal/measurement/w5;
.super Lcom/google/android/gms/internal/measurement/x5;
.source "SourceFile"


# instance fields
.field private final synthetic D:Lcom/google/android/gms/internal/measurement/q5;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/internal/measurement/q5;)V
    .locals 1

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/w5;->D:Lcom/google/android/gms/internal/measurement/q5;

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/internal/measurement/x5;-><init>(Lcom/google/android/gms/internal/measurement/q5;Lcom/google/android/gms/internal/measurement/z5;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/internal/measurement/q5;Lcom/google/android/gms/internal/measurement/z5;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/measurement/w5;-><init>(Lcom/google/android/gms/internal/measurement/q5;)V

    return-void
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 3

    new-instance v0, Lcom/google/android/gms/internal/measurement/s5;

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/w5;->D:Lcom/google/android/gms/internal/measurement/q5;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/internal/measurement/s5;-><init>(Lcom/google/android/gms/internal/measurement/q5;Lcom/google/android/gms/internal/measurement/z5;)V

    return-object v0
.end method
