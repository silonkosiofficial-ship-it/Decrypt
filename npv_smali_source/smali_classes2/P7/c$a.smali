.class public abstract LP7/c$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LP7/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method public static a(LP7/c;)Ln8/c;
    .locals 2

    .prologue
    invoke-static {p0}, Lv8/c;->i(LP7/c;)LO7/e;

    move-result-object p0

    const/4 v0, 0x0

    if-eqz p0, :cond_1

    invoke-static {p0}, LH8/k;->m(LO7/m;)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    move-object p0, v0

    :goto_0
    if-eqz p0, :cond_1

    invoke-static {p0}, Lv8/c;->h(LO7/m;)Ln8/c;

    move-result-object v0

    :cond_1
    return-object v0
.end method
