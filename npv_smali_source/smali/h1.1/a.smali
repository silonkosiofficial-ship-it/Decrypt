.class public final Lh1/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lh1/a$a;
    }
.end annotation


# static fields
.field public static final m:Lh1/a$a;

.field public static final n:I


# instance fields
.field private a:[I

.field private b:[I

.field private c:I

.field private d:[I

.field private e:[F

.field private f:I

.field private g:[I

.field private h:[Ljava/lang/String;

.field private i:I

.field private j:[I

.field private k:[Z

.field private l:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lh1/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lh1/a$a;-><init>(Ly7/k;)V

    sput-object v0, Lh1/a;->m:Lh1/a$a;

    const/16 v0, 0x8

    sput v0, Lh1/a;->n:I

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0xa

    new-array v1, v0, [I

    iput-object v1, p0, Lh1/a;->a:[I

    new-array v1, v0, [I

    iput-object v1, p0, Lh1/a;->b:[I

    new-array v1, v0, [I

    iput-object v1, p0, Lh1/a;->d:[I

    new-array v0, v0, [F

    iput-object v0, p0, Lh1/a;->e:[F

    const/4 v0, 0x5

    new-array v1, v0, [I

    iput-object v1, p0, Lh1/a;->g:[I

    new-array v0, v0, [Ljava/lang/String;

    iput-object v0, p0, Lh1/a;->h:[Ljava/lang/String;

    const/4 v0, 0x4

    new-array v1, v0, [I

    iput-object v1, p0, Lh1/a;->j:[I

    new-array v0, v0, [Z

    iput-object v0, p0, Lh1/a;->k:[Z

    return-void
.end method


# virtual methods
.method public final a(IF)V
    .locals 3

    .prologue
    iget v0, p0, Lh1/a;->f:I

    iget-object v1, p0, Lh1/a;->d:[I

    array-length v2, v1

    if-lt v0, v2, :cond_0

    array-length v0, v1

    mul-int/lit8 v0, v0, 0x2

    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v0

    const-string v1, "copyOf(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lh1/a;->d:[I

    iget-object v0, p0, Lh1/a;->e:[F

    array-length v2, v0

    mul-int/lit8 v2, v2, 0x2

    invoke-static {v0, v2}, Ljava/util/Arrays;->copyOf([FI)[F

    move-result-object v0

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lh1/a;->e:[F

    :cond_0
    iget-object v0, p0, Lh1/a;->d:[I

    iget v1, p0, Lh1/a;->f:I

    aput p1, v0, v1

    iget-object p1, p0, Lh1/a;->e:[F

    add-int/lit8 v0, v1, 0x1

    iput v0, p0, Lh1/a;->f:I

    aput p2, p1, v1

    return-void
.end method

.method public final b(II)V
    .locals 3

    .prologue
    iget v0, p0, Lh1/a;->c:I

    iget-object v1, p0, Lh1/a;->a:[I

    array-length v2, v1

    if-lt v0, v2, :cond_0

    array-length v0, v1

    mul-int/lit8 v0, v0, 0x2

    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v0

    const-string v1, "copyOf(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lh1/a;->a:[I

    iget-object v0, p0, Lh1/a;->b:[I

    array-length v2, v0

    mul-int/lit8 v2, v2, 0x2

    invoke-static {v0, v2}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v0

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lh1/a;->b:[I

    :cond_0
    iget-object v0, p0, Lh1/a;->a:[I

    iget v1, p0, Lh1/a;->c:I

    aput p1, v0, v1

    iget-object p1, p0, Lh1/a;->b:[I

    add-int/lit8 v0, v1, 0x1

    iput v0, p0, Lh1/a;->c:I

    aput p2, p1, v1

    return-void
.end method

.method public final c(ILjava/lang/String;)V
    .locals 3

    .prologue
    iget v0, p0, Lh1/a;->i:I

    iget-object v1, p0, Lh1/a;->g:[I

    array-length v2, v1

    if-lt v0, v2, :cond_0

    array-length v0, v1

    mul-int/lit8 v0, v0, 0x2

    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v0

    const-string v1, "copyOf(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lh1/a;->g:[I

    iget-object v0, p0, Lh1/a;->h:[Ljava/lang/String;

    array-length v2, v0

    mul-int/lit8 v2, v2, 0x2

    invoke-static {v0, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, [Ljava/lang/String;

    iput-object v0, p0, Lh1/a;->h:[Ljava/lang/String;

    :cond_0
    iget-object v0, p0, Lh1/a;->g:[I

    iget v1, p0, Lh1/a;->i:I

    aput p1, v0, v1

    iget-object p1, p0, Lh1/a;->h:[Ljava/lang/String;

    add-int/lit8 v0, v1, 0x1

    iput v0, p0, Lh1/a;->i:I

    aput-object p2, p1, v1

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget v0, p0, Lh1/a;->c:I

    iget v1, p0, Lh1/a;->f:I

    iget v2, p0, Lh1/a;->i:I

    iget v3, p0, Lh1/a;->l:I

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "TypedBundle{mCountInt="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", mCountFloat="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", mCountString="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", mCountBoolean="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, "}"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
