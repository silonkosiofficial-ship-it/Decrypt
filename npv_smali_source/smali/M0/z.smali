.class public final LM0/z;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LM0/z$a;
    }
.end annotation


# static fields
.field public static final a:LM0/z$a;

.field private static final b:LM0/z;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LM0/z$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LM0/z$a;-><init>(Ly7/k;)V

    sput-object v0, LM0/z;->a:LM0/z$a;

    new-instance v0, LM0/z;

    invoke-direct {v0}, LM0/z;-><init>()V

    sput-object v0, LM0/z;->b:LM0/z;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final synthetic a()LM0/z;
    .locals 1

    sget-object v0, LM0/z;->b:LM0/z;

    return-object v0
.end method


# virtual methods
.method public final b(LM0/z;)LM0/z;
    .locals 0

    return-object p0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    .prologue
    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of p1, p1, LM0/z;

    if-nez p1, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    return v0
.end method

.method public hashCode()I
    .locals 1

    invoke-super {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "PlatformSpanStyle()"

    return-object v0
.end method
