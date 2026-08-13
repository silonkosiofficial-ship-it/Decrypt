.class public abstract LM4/l;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LM4/l$c;,
        LM4/l$b;,
        LM4/l$a;
    }
.end annotation


# direct methods
.method public static a(LM4/k;)LM4/k;
    .locals 1

    .prologue
    instance-of v0, p0, LM4/l$b;

    if-nez v0, :cond_2

    instance-of v0, p0, LM4/l$a;

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    instance-of v0, p0, Ljava/io/Serializable;

    if-eqz v0, :cond_1

    new-instance v0, LM4/l$a;

    invoke-direct {v0, p0}, LM4/l$a;-><init>(LM4/k;)V

    goto :goto_0

    :cond_1
    new-instance v0, LM4/l$b;

    invoke-direct {v0, p0}, LM4/l$b;-><init>(LM4/k;)V

    :goto_0
    return-object v0

    :cond_2
    :goto_1
    return-object p0
.end method

.method public static b(Ljava/lang/Object;)LM4/k;
    .locals 1

    new-instance v0, LM4/l$c;

    invoke-direct {v0, p0}, LM4/l$c;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method
