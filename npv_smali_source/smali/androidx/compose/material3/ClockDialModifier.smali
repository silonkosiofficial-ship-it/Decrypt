.class public final Landroidx/compose/material3/ClockDialModifier;
.super LF0/W;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "LF0/W;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0673"
    }
    d2 = {
        "\u0674",
        "\u0675",
        "\u0676",
        "\u0677",
        "\u0678",
        "",
        "\u0679",
        "\u067a",
        "\u067b",
        "\u067c",
        "\u067d",
        "\u067e",
        "\u067f",
        "\u0680",
        "\u0681",
        "\u0682",
        "\u0683",
        "",
        "\u0684",
        "\u0685",
        "",
        "\u0686",
        "\u0687",
        "",
        "\u0688",
        "\u0689",
        "\u068a",
        "\u068b",
        "\u068c",
        "\u068d",
        "\u068e",
        "\u068f",
        "\u0690",
        "\u0691"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field private final b:LS/c;

.field private final c:Z

.field private final d:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(LS/c;ZI)V
    .locals 0

    invoke-direct {p0}, LF0/W;-><init>()V

    iput-object p1, p0, Landroidx/compose/material3/ClockDialModifier;->b:LS/c;

    iput-boolean p2, p0, Landroidx/compose/material3/ClockDialModifier;->c:Z

    iput p3, p0, Landroidx/compose/material3/ClockDialModifier;->d:I

    return-void
.end method

.method public synthetic constructor <init>(LS/c;ZILy7/k;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Landroidx/compose/material3/ClockDialModifier;-><init>(LS/c;ZI)V

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .prologue
    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Landroidx/compose/material3/ClockDialModifier;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Landroidx/compose/material3/ClockDialModifier;

    iget-object v1, p0, Landroidx/compose/material3/ClockDialModifier;->b:LS/c;

    iget-object v3, p1, Landroidx/compose/material3/ClockDialModifier;->b:LS/c;

    invoke-static {v1, v3}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Landroidx/compose/material3/ClockDialModifier;->c:Z

    iget-boolean v3, p1, Landroidx/compose/material3/ClockDialModifier;->c:Z

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget v1, p0, Landroidx/compose/material3/ClockDialModifier;->d:I

    iget p1, p1, Landroidx/compose/material3/ClockDialModifier;->d:I

    invoke-static {v1, p1}, LS/s1;->f(II)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public bridge synthetic g()Landroidx/compose/ui/d$c;
    .locals 1

    invoke-virtual {p0}, Landroidx/compose/material3/ClockDialModifier;->l()LS/y;

    move-result-object v0

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Landroidx/compose/material3/ClockDialModifier;->b:LS/c;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Landroidx/compose/material3/ClockDialModifier;->c:Z

    invoke-static {v1}, Lt/h;->a(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Landroidx/compose/material3/ClockDialModifier;->d:I

    invoke-static {v1}, LS/s1;->g(I)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public bridge synthetic j(Landroidx/compose/ui/d$c;)V
    .locals 0

    check-cast p1, LS/y;

    invoke-virtual {p0, p1}, Landroidx/compose/material3/ClockDialModifier;->m(LS/y;)V

    return-void
.end method

.method public l()LS/y;
    .locals 5

    new-instance v0, LS/y;

    iget-object v1, p0, Landroidx/compose/material3/ClockDialModifier;->b:LS/c;

    iget-boolean v2, p0, Landroidx/compose/material3/ClockDialModifier;->c:Z

    iget v3, p0, Landroidx/compose/material3/ClockDialModifier;->d:I

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, LS/y;-><init>(LS/c;ZILy7/k;)V

    return-object v0
.end method

.method public m(LS/y;)V
    .locals 3

    iget-object v0, p0, Landroidx/compose/material3/ClockDialModifier;->b:LS/c;

    iget-boolean v1, p0, Landroidx/compose/material3/ClockDialModifier;->c:Z

    iget v2, p0, Landroidx/compose/material3/ClockDialModifier;->d:I

    invoke-virtual {p1, v0, v1, v2}, LS/y;->i2(LS/c;ZI)V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ClockDialModifier(state="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/compose/material3/ClockDialModifier;->b:LS/c;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", autoSwitchToMinute="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Landroidx/compose/material3/ClockDialModifier;->c:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", selection="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Landroidx/compose/material3/ClockDialModifier;->d:I

    invoke-static {v1}, LS/s1;->h(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
