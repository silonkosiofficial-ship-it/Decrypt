.class public abstract LW8/X$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LW8/X;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method public static a(LW8/X;JLjava/lang/Runnable;Lm7/i;)LW8/f0;
    .locals 0

    invoke-static {}, LW8/U;->a()LW8/X;

    move-result-object p0

    invoke-interface {p0, p1, p2, p3, p4}, LW8/X;->m1(JLjava/lang/Runnable;Lm7/i;)LW8/f0;

    move-result-object p0

    return-object p0
.end method
