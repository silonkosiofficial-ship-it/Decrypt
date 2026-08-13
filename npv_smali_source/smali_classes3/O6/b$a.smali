.class public abstract LO6/b$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LO6/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method public static a(LO6/b;)Lm7/i;
    .locals 0

    invoke-interface {p0}, LO6/b;->H0()LD6/b;

    move-result-object p0

    invoke-virtual {p0}, LD6/b;->getCoroutineContext()Lm7/i;

    move-result-object p0

    return-object p0
.end method
