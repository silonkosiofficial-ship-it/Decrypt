.class public abstract LI7/F;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LI7/F$a;,
        LI7/F$b;
    }
.end annotation


# direct methods
.method private static synthetic a(I)V
    .locals 2

    const/4 p0, 0x3

    new-array p0, p0, [Ljava/lang/Object;

    const-string v0, "initializer"

    const/4 v1, 0x0

    aput-object v0, p0, v1

    const-string v0, "kotlin/reflect/jvm/internal/ReflectProperties"

    const/4 v1, 0x1

    aput-object v0, p0, v1

    const-string v0, "lazySoft"

    const/4 v1, 0x2

    aput-object v0, p0, v1

    const-string v0, "Argument for @NotNull parameter \'%s\' of %s.%s must not be null"

    invoke-static {v0, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static b(Ljava/lang/Object;Lx7/a;)LI7/F$a;
    .locals 1

    .prologue
    if-nez p1, :cond_0

    const/4 v0, 0x0

    invoke-static {v0}, LI7/F;->a(I)V

    :cond_0
    new-instance v0, LI7/F$a;

    invoke-direct {v0, p0, p1}, LI7/F$a;-><init>(Ljava/lang/Object;Lx7/a;)V

    return-object v0
.end method

.method public static c(Lx7/a;)LI7/F$a;
    .locals 1

    .prologue
    if-nez p0, :cond_0

    const/4 v0, 0x1

    invoke-static {v0}, LI7/F;->a(I)V

    :cond_0
    const/4 v0, 0x0

    invoke-static {v0, p0}, LI7/F;->b(Ljava/lang/Object;Lx7/a;)LI7/F$a;

    move-result-object p0

    return-object p0
.end method
