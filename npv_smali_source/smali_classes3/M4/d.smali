.class public abstract LM4/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LM4/d$b;
    }
.end annotation


# direct methods
.method public static a(Ljava/lang/Object;)LM4/d$b;
    .locals 2

    new-instance v0, LM4/d$b;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p0

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, LM4/d$b;-><init>(Ljava/lang/String;LM4/d$a;)V

    return-object v0
.end method
