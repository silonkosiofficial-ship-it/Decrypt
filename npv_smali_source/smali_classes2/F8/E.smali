.class public abstract LF8/E;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LP7/a;
.implements LJ8/i;


# instance fields
.field private C:I


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ly7/k;)V
    .locals 0

    invoke-direct {p0}, LF8/E;-><init>()V

    return-void
.end method

.method private final T0()I
    .locals 2

    .prologue
    invoke-static {p0}, LF8/G;->a(LF8/E;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-super {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0

    :cond_0
    invoke-virtual {p0}, LF8/E;->W0()LF8/e0;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, LF8/E;->U0()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, LF8/E;->X0()Z

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method


# virtual methods
.method public abstract U0()Ljava/util/List;
.end method

.method public abstract V0()LF8/a0;
.end method

.method public abstract W0()LF8/e0;
.end method

.method public abstract X0()Z
.end method

.method public abstract Y0(LG8/g;)LF8/E;
.end method

.method public abstract Z0()LF8/t0;
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .prologue
    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, LF8/E;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    invoke-virtual {p0}, LF8/E;->X0()Z

    move-result v1

    check-cast p1, LF8/E;

    invoke-virtual {p1}, LF8/E;->X0()Z

    move-result v3

    if-ne v1, v3, :cond_2

    sget-object v1, LG8/p;->a:LG8/p;

    invoke-virtual {p0}, LF8/E;->Z0()LF8/t0;

    move-result-object v3

    invoke-virtual {p1}, LF8/E;->Z0()LF8/t0;

    move-result-object p1

    invoke-virtual {v1, v3, p1}, LG8/p;->a(LF8/t0;LF8/t0;)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_0

    :cond_2
    move v0, v2

    :goto_0
    return v0
.end method

.method public final hashCode()I
    .locals 1

    .prologue
    iget v0, p0, LF8/E;->C:I

    if-eqz v0, :cond_0

    return v0

    :cond_0
    invoke-direct {p0}, LF8/E;->T0()I

    move-result v0

    iput v0, p0, LF8/E;->C:I

    return v0
.end method

.method public k()LP7/g;
    .locals 1

    invoke-virtual {p0}, LF8/E;->V0()LF8/a0;

    move-result-object v0

    invoke-static {v0}, LF8/j;->a(LF8/a0;)LP7/g;

    move-result-object v0

    return-object v0
.end method

.method public abstract u()Ly8/h;
.end method
