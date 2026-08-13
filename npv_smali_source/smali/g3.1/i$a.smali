.class abstract Lg3/i$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lg3/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# static fields
.field private static final a:Lg3/i;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lg3/i;

    invoke-direct {v0}, Lg3/i;-><init>()V

    sput-object v0, Lg3/i$a;->a:Lg3/i;

    return-void
.end method

.method static synthetic a()Lg3/i;
    .locals 1

    sget-object v0, Lg3/i$a;->a:Lg3/i;

    return-object v0
.end method
