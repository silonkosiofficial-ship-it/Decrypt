.class final Lcom/google/android/gms/internal/measurement/U3;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lcom/google/android/gms/internal/measurement/c4;

.field private final b:[B


# direct methods
.method private constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-array p1, p1, [B

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/U3;->b:[B

    invoke-static {p1}, Lcom/google/android/gms/internal/measurement/c4;->D([B)Lcom/google/android/gms/internal/measurement/c4;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/U3;->a:Lcom/google/android/gms/internal/measurement/c4;

    return-void
.end method

.method synthetic constructor <init>(ILcom/google/android/gms/internal/measurement/Y3;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/measurement/U3;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Lcom/google/android/gms/internal/measurement/L3;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/U3;->a:Lcom/google/android/gms/internal/measurement/c4;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/c4;->E()V

    new-instance v0, Lcom/google/android/gms/internal/measurement/W3;

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/U3;->b:[B

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/measurement/W3;-><init>([B)V

    return-object v0
.end method

.method public final b()Lcom/google/android/gms/internal/measurement/c4;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/U3;->a:Lcom/google/android/gms/internal/measurement/c4;

    return-object v0
.end method
