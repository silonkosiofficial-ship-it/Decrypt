.class public abstract Lt8/g;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt8/g;->a:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public abstract a(LO7/G;)LF8/E;
.end method

.method public b()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lt8/g;->a:Ljava/lang/Object;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    .prologue
    if-eq p0, p1, :cond_3

    invoke-virtual {p0}, Lt8/g;->b()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, p1, Lt8/g;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    check-cast p1, Lt8/g;

    goto :goto_0

    :cond_0
    move-object p1, v2

    :goto_0
    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lt8/g;->b()Ljava/lang/Object;

    move-result-object v2

    :cond_1
    invoke-static {v0, v2}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_1

    :cond_2
    const/4 p1, 0x0

    goto :goto_2

    :cond_3
    :goto_1
    const/4 p1, 0x1

    :goto_2
    return p1
.end method

.method public hashCode()I
    .locals 1

    .prologue
    invoke-virtual {p0}, Lt8/g;->b()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lt8/g;->b()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
