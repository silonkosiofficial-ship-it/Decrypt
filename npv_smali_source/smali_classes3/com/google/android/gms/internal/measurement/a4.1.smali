.class final Lcom/google/android/gms/internal/measurement/a4;
.super Lcom/google/android/gms/internal/measurement/X3;
.source "SourceFile"


# instance fields
.field private final c:[B

.field private d:I

.field private e:I

.field private f:I

.field private g:I

.field private h:I


# direct methods
.method private constructor <init>([BIIZ)V
    .locals 0

    const/4 p4, 0x0

    invoke-direct {p0, p4}, Lcom/google/android/gms/internal/measurement/X3;-><init>(Lcom/google/android/gms/internal/measurement/Z3;)V

    const p4, 0x7fffffff

    iput p4, p0, Lcom/google/android/gms/internal/measurement/a4;->h:I

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/a4;->c:[B

    add-int/2addr p3, p2

    iput p3, p0, Lcom/google/android/gms/internal/measurement/a4;->d:I

    iput p2, p0, Lcom/google/android/gms/internal/measurement/a4;->f:I

    iput p2, p0, Lcom/google/android/gms/internal/measurement/a4;->g:I

    return-void
.end method

.method synthetic constructor <init>([BIIZLcom/google/android/gms/internal/measurement/Z3;)V
    .locals 0

    const/4 p2, 0x0

    invoke-direct {p0, p1, p2, p3, p2}, Lcom/google/android/gms/internal/measurement/a4;-><init>([BIIZ)V

    return-void
.end method

.method private final f()V
    .locals 3

    .prologue
    iget v0, p0, Lcom/google/android/gms/internal/measurement/a4;->d:I

    iget v1, p0, Lcom/google/android/gms/internal/measurement/a4;->e:I

    add-int/2addr v0, v1

    iput v0, p0, Lcom/google/android/gms/internal/measurement/a4;->d:I

    iget v1, p0, Lcom/google/android/gms/internal/measurement/a4;->g:I

    sub-int v1, v0, v1

    iget v2, p0, Lcom/google/android/gms/internal/measurement/a4;->h:I

    if-le v1, v2, :cond_0

    sub-int/2addr v1, v2

    iput v1, p0, Lcom/google/android/gms/internal/measurement/a4;->e:I

    sub-int/2addr v0, v1

    iput v0, p0, Lcom/google/android/gms/internal/measurement/a4;->d:I

    return-void

    :cond_0
    const/4 v0, 0x0

    iput v0, p0, Lcom/google/android/gms/internal/measurement/a4;->e:I

    return-void
.end method


# virtual methods
.method public final d(I)I
    .locals 1

    .prologue
    if-ltz p1, :cond_2

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/X3;->e()I

    move-result v0

    add-int/2addr p1, v0

    if-ltz p1, :cond_1

    iget v0, p0, Lcom/google/android/gms/internal/measurement/a4;->h:I

    if-gt p1, v0, :cond_0

    iput p1, p0, Lcom/google/android/gms/internal/measurement/a4;->h:I

    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/a4;->f()V

    return v0

    :cond_0
    invoke-static {}, Lcom/google/android/gms/internal/measurement/C4;->g()Lcom/google/android/gms/internal/measurement/C4;

    move-result-object p1

    throw p1

    :cond_1
    invoke-static {}, Lcom/google/android/gms/internal/measurement/C4;->e()Lcom/google/android/gms/internal/measurement/C4;

    move-result-object p1

    throw p1

    :cond_2
    invoke-static {}, Lcom/google/android/gms/internal/measurement/C4;->d()Lcom/google/android/gms/internal/measurement/C4;

    move-result-object p1

    throw p1
.end method

.method public final e()I
    .locals 2

    iget v0, p0, Lcom/google/android/gms/internal/measurement/a4;->f:I

    iget v1, p0, Lcom/google/android/gms/internal/measurement/a4;->g:I

    sub-int/2addr v0, v1

    return v0
.end method
