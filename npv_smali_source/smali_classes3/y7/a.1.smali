.class public abstract Ly7/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly7/o;
.implements Ljava/io/Serializable;


# instance fields
.field protected final C:Ljava/lang/Object;

.field private final D:Ljava/lang/Class;

.field private final E:Ljava/lang/String;

.field private final F:Ljava/lang/String;

.field private final G:Z

.field private final H:I

.field private final I:I


# direct methods
.method public constructor <init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 7

    sget-object v2, Ly7/f;->I:Ljava/lang/Object;

    move-object v0, p0

    move v1, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move v6, p5

    invoke-direct/range {v0 .. v6}, Ly7/a;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method

.method public constructor <init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 0

    .prologue
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Ly7/a;->C:Ljava/lang/Object;

    iput-object p3, p0, Ly7/a;->D:Ljava/lang/Class;

    iput-object p4, p0, Ly7/a;->E:Ljava/lang/String;

    iput-object p5, p0, Ly7/a;->F:Ljava/lang/String;

    and-int/lit8 p2, p6, 0x1

    const/4 p3, 0x1

    if-ne p2, p3, :cond_0

    move p2, p3

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    iput-boolean p2, p0, Ly7/a;->G:Z

    iput p1, p0, Ly7/a;->H:I

    shr-int/lit8 p1, p6, 0x1

    iput p1, p0, Ly7/a;->I:I

    return-void
.end method


# virtual methods
.method public c()I
    .locals 1

    iget v0, p0, Ly7/a;->H:I

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .prologue
    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Ly7/a;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Ly7/a;

    iget-boolean v1, p0, Ly7/a;->G:Z

    iget-boolean v3, p1, Ly7/a;->G:Z

    if-ne v1, v3, :cond_2

    iget v1, p0, Ly7/a;->H:I

    iget v3, p1, Ly7/a;->H:I

    if-ne v1, v3, :cond_2

    iget v1, p0, Ly7/a;->I:I

    iget v3, p1, Ly7/a;->I:I

    if-ne v1, v3, :cond_2

    iget-object v1, p0, Ly7/a;->C:Ljava/lang/Object;

    iget-object v3, p1, Ly7/a;->C:Ljava/lang/Object;

    invoke-static {v1, v3}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Ly7/a;->D:Ljava/lang/Class;

    iget-object v3, p1, Ly7/a;->D:Ljava/lang/Class;

    invoke-static {v1, v3}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Ly7/a;->E:Ljava/lang/String;

    iget-object v3, p1, Ly7/a;->E:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Ly7/a;->F:Ljava/lang/String;

    iget-object p1, p1, Ly7/a;->F:Ljava/lang/String;

    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_0

    :cond_2
    move v0, v2

    :goto_0
    return v0
.end method

.method public hashCode()I
    .locals 3

    .prologue
    iget-object v0, p0, Ly7/a;->C:Ljava/lang/Object;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Ly7/a;->D:Ljava/lang/Class;

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :cond_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Ly7/a;->E:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Ly7/a;->F:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Ly7/a;->G:Z

    if-eqz v1, :cond_2

    const/16 v1, 0x4cf

    goto :goto_1

    :cond_2
    const/16 v1, 0x4d5

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Ly7/a;->H:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Ly7/a;->I:I

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    invoke-static {p0}, Ly7/P;->l(Ly7/o;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
