.class public abstract LG6/p;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lg7/a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lg7/a;

    sget-object v1, Lg7/a$a;->P:Lg7/a$a;

    const-string v2, "Client failure"

    invoke-direct {v0, v1, v2}, Lg7/a;-><init>(Lg7/a$a;Ljava/lang/String;)V

    sput-object v0, LG6/p;->a:Lg7/a;

    return-void
.end method

.method public static final synthetic a()Lg7/a;
    .locals 1

    sget-object v0, LG6/p;->a:Lg7/a;

    return-object v0
.end method

.method public static final synthetic b(Lg7/a;)Z
    .locals 0

    invoke-static {p0}, LG6/p;->c(Lg7/a;)Z

    move-result p0

    return p0
.end method

.method private static final c(Lg7/a;)Z
    .locals 1

    .prologue
    sget-object v0, Lg7/a$a;->D:Lg7/a$a$a;

    invoke-virtual {p0}, Lg7/a;->a()S

    move-result p0

    invoke-virtual {v0, p0}, Lg7/a$a$a;->a(S)Lg7/a$a;

    move-result-object p0

    if-eqz p0, :cond_1

    sget-object v0, Lg7/a$a;->K:Lg7/a$a;

    if-ne p0, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0
.end method
