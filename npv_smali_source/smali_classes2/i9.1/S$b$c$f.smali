.class public abstract Li9/S$b$c$f;
.super Li9/S$b$c$e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Li9/S$b$c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "f"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Li9/S$b$c$f$a;,
        Li9/S$b$c$f$b;,
        Li9/S$b$c$f$c;,
        Li9/S$b$c$f$d;
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Li9/S$b$c$e;-><init>(Ly7/k;)V

    return-void
.end method

.method public synthetic constructor <init>(Ly7/k;)V
    .locals 0

    invoke-direct {p0}, Li9/S$b$c$f;-><init>()V

    return-void
.end method
