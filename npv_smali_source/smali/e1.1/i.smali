.class public final Le1/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Le1/i$a;,
        Le1/i$b;
    }
.end annotation


# static fields
.field public static final T:Le1/i$a;

.field public static final U:I

.field private static V:I

.field private static W:I

.field private static X:I

.field private static Y:I

.field private static Z:I


# instance fields
.field private C:Z

.field private D:Ljava/lang/String;

.field private E:I

.field private F:I

.field private G:I

.field private H:F

.field private I:Z

.field private J:[F

.field private K:[F

.field private L:Le1/i$b;

.field private M:[Le1/b;

.field private N:I

.field private O:I

.field private P:Z

.field private Q:I

.field private R:F

.field private S:Ljava/util/HashSet;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Le1/i$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Le1/i$a;-><init>(Ly7/k;)V

    sput-object v0, Le1/i;->T:Le1/i$a;

    const/16 v0, 0x8

    sput v0, Le1/i;->U:I

    const/4 v0, 0x1

    sput v0, Le1/i;->V:I

    sput v0, Le1/i;->W:I

    sput v0, Le1/i;->X:I

    sput v0, Le1/i;->Y:I

    sput v0, Le1/i;->Z:I

    return-void
.end method

.method public constructor <init>(Le1/i$b;Ljava/lang/String;)V
    .locals 2

    const-string p2, "type"

    invoke-static {p1, p2}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p2, -0x1

    iput p2, p0, Le1/i;->E:I

    iput p2, p0, Le1/i;->F:I

    const/16 v0, 0x9

    new-array v1, v0, [F

    iput-object v1, p0, Le1/i;->J:[F

    new-array v0, v0, [F

    iput-object v0, p0, Le1/i;->K:[F

    const/16 v0, 0x10

    new-array v0, v0, [Le1/b;

    iput-object v0, p0, Le1/i;->M:[Le1/b;

    iput p2, p0, Le1/i;->Q:I

    const/4 p2, 0x0

    iput-object p2, p0, Le1/i;->S:Ljava/util/HashSet;

    iput-object p1, p0, Le1/i;->L:Le1/i$b;

    return-void
.end method

.method public static final synthetic e()I
    .locals 1

    sget v0, Le1/i;->W:I

    return v0
.end method

.method public static final synthetic g(I)V
    .locals 0

    sput p0, Le1/i;->W:I

    return-void
.end method


# virtual methods
.method public final A()Z
    .locals 1

    iget-boolean v0, p0, Le1/i;->I:Z

    return v0
.end method

.method public final B(Le1/b;)V
    .locals 4

    .prologue
    iget v0, p0, Le1/i;->N:I

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_2

    iget-object v2, p0, Le1/i;->M:[Le1/b;

    aget-object v2, v2, v1

    invoke-static {v2, p1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    add-int/lit8 v0, v0, -0x1

    :goto_1
    if-ge v1, v0, :cond_0

    iget-object p1, p0, Le1/i;->M:[Le1/b;

    add-int/lit8 v2, v1, 0x1

    aget-object v3, p1, v2

    aput-object v3, p1, v1

    move v1, v2

    goto :goto_1

    :cond_0
    iget p1, p0, Le1/i;->N:I

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, Le1/i;->N:I

    return-void

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method public final C()V
    .locals 10

    .prologue
    const/4 v0, 0x0

    iput-object v0, p0, Le1/i;->D:Ljava/lang/String;

    sget-object v1, Le1/i$b;->G:Le1/i$b;

    iput-object v1, p0, Le1/i;->L:Le1/i$b;

    const/4 v1, 0x0

    iput v1, p0, Le1/i;->G:I

    const/4 v2, -0x1

    iput v2, p0, Le1/i;->E:I

    iput v2, p0, Le1/i;->F:I

    const/4 v3, 0x0

    iput v3, p0, Le1/i;->H:F

    iput-boolean v1, p0, Le1/i;->I:Z

    iput-boolean v1, p0, Le1/i;->P:Z

    iput v2, p0, Le1/i;->Q:I

    iput v3, p0, Le1/i;->R:F

    iget v2, p0, Le1/i;->N:I

    move v3, v1

    :goto_0
    if-ge v3, v2, :cond_0

    iget-object v4, p0, Le1/i;->M:[Le1/b;

    aput-object v0, v4, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    iput v1, p0, Le1/i;->N:I

    iput v1, p0, Le1/i;->O:I

    iput-boolean v1, p0, Le1/i;->C:Z

    iget-object v4, p0, Le1/i;->K:[F

    const/4 v8, 0x6

    const/4 v9, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v4 .. v9}, Lj7/n;->y([FFIIILjava/lang/Object;)V

    return-void
.end method

.method public final D(F)V
    .locals 0

    iput p1, p0, Le1/i;->H:F

    return-void
.end method

.method public final E(Le1/d;F)V
    .locals 3

    .prologue
    iput p2, p0, Le1/i;->H:F

    const/4 p2, 0x1

    iput-boolean p2, p0, Le1/i;->I:Z

    const/4 p2, 0x0

    iput-boolean p2, p0, Le1/i;->P:Z

    const/4 v0, -0x1

    iput v0, p0, Le1/i;->Q:I

    const/4 v1, 0x0

    iput v1, p0, Le1/i;->R:F

    iget v1, p0, Le1/i;->N:I

    iput v0, p0, Le1/i;->F:I

    move v0, p2

    :goto_0
    if-ge v0, v1, :cond_0

    iget-object v2, p0, Le1/i;->M:[Le1/b;

    aget-object v2, v2, v0

    invoke-static {v2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v2, p1, p0, p2}, Le1/b;->J(Le1/d;Le1/i;Z)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    iput p2, p0, Le1/i;->N:I

    return-void
.end method

.method public final F(I)V
    .locals 0

    iput p1, p0, Le1/i;->E:I

    return-void
.end method

.method public final G(Z)V
    .locals 0

    iput-boolean p1, p0, Le1/i;->C:Z

    return-void
.end method

.method public final H(I)V
    .locals 0

    iput p1, p0, Le1/i;->F:I

    return-void
.end method

.method public final I(Le1/i$b;)V
    .locals 0

    iput-object p1, p0, Le1/i;->L:Le1/i$b;

    return-void
.end method

.method public final J(Ljava/lang/String;)V
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Le1/i;->D:Ljava/lang/String;

    return-void
.end method

.method public final K(I)V
    .locals 0

    iput p1, p0, Le1/i;->G:I

    return-void
.end method

.method public final L(Le1/i$b;Ljava/lang/String;)V
    .locals 0

    const-string p2, "type"

    invoke-static {p1, p2}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Le1/i;->L:Le1/i$b;

    return-void
.end method

.method public final M(I)V
    .locals 0

    iput p1, p0, Le1/i;->O:I

    return-void
.end method

.method public final N(Le1/d;Le1/b;)V
    .locals 4

    .prologue
    iget v0, p0, Le1/i;->N:I

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_0

    iget-object v3, p0, Le1/i;->M:[Le1/b;

    aget-object v3, v3, v2

    invoke-static {v3}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v3, p1, p2, v1}, Le1/b;->K(Le1/d;Le1/b;Z)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    iput v1, p0, Le1/i;->N:I

    return-void
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Le1/i;

    invoke-virtual {p0, p1}, Le1/i;->m(Le1/i;)I

    move-result p1

    return p1
.end method

.method public final i(Le1/b;)V
    .locals 3

    .prologue
    iget v0, p0, Le1/i;->N:I

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    iget-object v2, p0, Le1/i;->M:[Le1/b;

    aget-object v2, v2, v1

    invoke-static {v2, p1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    return-void

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    iget v0, p0, Le1/i;->N:I

    iget-object v1, p0, Le1/i;->M:[Le1/b;

    array-length v2, v1

    if-lt v0, v2, :cond_2

    array-length v0, v1

    mul-int/lit8 v0, v0, 0x2

    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    const-string v1, "copyOf(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, [Le1/b;

    iput-object v0, p0, Le1/i;->M:[Le1/b;

    :cond_2
    iget-object v0, p0, Le1/i;->M:[Le1/b;

    iget v1, p0, Le1/i;->N:I

    aput-object p1, v0, v1

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Le1/i;->N:I

    return-void
.end method

.method public m(Le1/i;)I
    .locals 1

    const-string v0, "other"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget v0, p0, Le1/i;->E:I

    iget p1, p1, Le1/i;->E:I

    sub-int/2addr v0, p1

    return v0
.end method

.method public final n()F
    .locals 1

    iget v0, p0, Le1/i;->H:F

    return v0
.end method

.method public final o()I
    .locals 1

    iget v0, p0, Le1/i;->E:I

    return v0
.end method

.method public final q()Z
    .locals 1

    iget-boolean v0, p0, Le1/i;->C:Z

    return v0
.end method

.method public final r()I
    .locals 1

    iget v0, p0, Le1/i;->F:I

    return v0
.end method

.method public final s()[F
    .locals 1

    iget-object v0, p0, Le1/i;->K:[F

    return-object v0
.end method

.method public final t()Z
    .locals 1

    iget-boolean v0, p0, Le1/i;->P:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .prologue
    iget-object v0, p0, Le1/i;->D:Ljava/lang/String;

    const-string v1, ""

    if-eqz v0, :cond_0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_0
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_0
    iget v0, p0, Le1/i;->E:I

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    goto :goto_0

    :goto_1
    return-object v0
.end method

.method public final u()[F
    .locals 1

    iget-object v0, p0, Le1/i;->J:[F

    return-object v0
.end method

.method public final v()I
    .locals 1

    iget v0, p0, Le1/i;->Q:I

    return v0
.end method

.method public final w()F
    .locals 1

    iget v0, p0, Le1/i;->R:F

    return v0
.end method

.method public final x()Le1/i$b;
    .locals 1

    iget-object v0, p0, Le1/i;->L:Le1/i$b;

    return-object v0
.end method

.method public final y()I
    .locals 1

    iget v0, p0, Le1/i;->G:I

    return v0
.end method

.method public final z()I
    .locals 1

    iget v0, p0, Le1/i;->O:I

    return v0
.end method
