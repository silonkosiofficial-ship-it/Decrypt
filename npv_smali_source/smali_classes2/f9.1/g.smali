.class public abstract Lf9/g;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lb9/D;

.field private static final b:Lb9/D;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lb9/D;

    const-string v1, "NO_OWNER"

    invoke-direct {v0, v1}, Lb9/D;-><init>(Ljava/lang/String;)V

    sput-object v0, Lf9/g;->a:Lb9/D;

    new-instance v0, Lb9/D;

    const-string v1, "ALREADY_LOCKED_BY_OWNER"

    invoke-direct {v0, v1}, Lb9/D;-><init>(Ljava/lang/String;)V

    sput-object v0, Lf9/g;->b:Lb9/D;

    return-void
.end method

.method public static final a(Z)Lf9/a;
    .locals 1

    new-instance v0, Lf9/f;

    invoke-direct {v0, p0}, Lf9/f;-><init>(Z)V

    return-object v0
.end method

.method public static synthetic b(ZILjava/lang/Object;)Lf9/a;
    .locals 0

    .prologue
    and-int/lit8 p1, p1, 0x1

    if-eqz p1, :cond_0

    const/4 p0, 0x0

    :cond_0
    invoke-static {p0}, Lf9/g;->a(Z)Lf9/a;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic c()Lb9/D;
    .locals 1

    sget-object v0, Lf9/g;->a:Lb9/D;

    return-object v0
.end method
