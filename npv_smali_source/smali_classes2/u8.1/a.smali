.class public abstract Lu8/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Comparable;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lu8/a;

    invoke-virtual {p0, p1}, Lu8/a;->e(Lu8/a;)I

    move-result p1

    return p1
.end method

.method public e(Lu8/a;)I
    .locals 2

    .prologue
    const-string v0, "other"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lu8/a;->g()Lu8/b;

    move-result-object v0

    invoke-virtual {p1}, Lu8/a;->g()Lu8/b;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lu8/a;->i()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {p1}, Lu8/a;->i()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 v0, 0x1

    :cond_0
    return v0
.end method

.method public abstract g()Lu8/b;
.end method

.method public abstract i()Z
.end method
